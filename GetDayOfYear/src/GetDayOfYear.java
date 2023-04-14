public class GetDayOfYear {
    public static int getDayOfYear (int year, int month, int day){
        int res = 0;

        boolean leap_year = false;
        if(year % 4 == 0){
            leap_year = true;

        }
        System.out.println(leap_year);

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

        System.out.println(getDayOfYear(1981, 3, 3));

    }
}
