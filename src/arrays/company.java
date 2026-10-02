public class RangeCount {
    public static void main(String[] args) {

        int[] arr = {300, 604, 350, 433, 704, 470, 808, 718, 517, 811};

        int count1 = 0, count2 = 0;

        for (int num : arr) {
            if (num >= 300 && num <= 350) {
                count1++;
            } else if (num >= 400 && num <= 700) {
                count2++;
            }
        }

        System.out.println("300 to 350 : " + count1);
        System.out.println("400 to 700 : " + count2);
    }
}
