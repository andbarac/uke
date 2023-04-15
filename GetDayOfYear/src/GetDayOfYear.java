public class GetDayOfYear {
    public static int getDayOfYear (int year, int month, int day){
        int res = 0;

        boolean leap_year = false;
        if(year % 4 == 0){
            leap_year = true;
        }
        System.out.println(leap_year);

        // check month validity
        if (month<1 || month >12) {
            System.out.println("invalid month");
            return 1;
        }
        // check day validity
        if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12 ) {
            if (day < 1 || day > 31) {
                System.out.println("invalid day");
                return 1;
            }
        }
        else {
            if (day < 1 || day > 30) {
                System.out.println("invalid day");
                return 1;

            }
        }
        // check day validity leap_year vs non_leap_year
        if (month == 2) {
            if (leap_year) {
                if (day < 1 || day > 29) {
                    System.out.println("invalid day");
                    return 1;
                }
            } else {
                if (day < 1 || day > 28) {
                    System.out.println("invalid day");
                    return 1;
                }
            }
        }


        int[] months = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        if (leap_year) months[1] = 29;


/*
        int jan = 31;
        int feb = 28;
        if (leap_year) feb = 29;
        int mar = 31;
        int apr = 30;
        int may = 31;
        int jun = 30;
        int jul = 31;
        int aug = 31;
        int sep = 30;
        int oct = 31;
        int nov = 30;
        int dec = 31;
*/
        for (int i=0; i < (month-1); i++){
            res += months[i];
        }
        res = res + day;


        return res;
    }

    public static void main(String[] args) {

        System.out.println(getDayOfYear(1983, 12, 33));

    }
}
