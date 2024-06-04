package school.mjc.stage0.conditions.task3;

public class Seasons {
    public void tellTheSeasonByMonthNumber(int month) {
        String result = "wrong number!";
        if (month >= 3 && month <= 5) {
            result = "Spring";
        } else if (month >= 6 && month <= 9) {
            result = "Summer";
        } else if (month >= 9 && month <= 11) {
            result = "Autumn";
        } else if (month == 12 || month >= 1 && month <= 2) {
            result = "Winter";
        }

        System.out.println(result);
    }
}
