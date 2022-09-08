public class Loops {


    //question 1
    public static int getLastIndex(String[] names) {
        return names.length - 1;
    }

    //question 2
    public static int getSecondToLastIndex(String[] names) {
        return names.length - 2;
    }

    //question 3
    public static String getFirstElement(String[] names) {
        return names[0];
    }

    //question 4
    public static String getLastElement(String[] names) {
        return names[4];
    }

    //question 5
    public static String getSecondToLastElement(String[] names) {
        return names[3];
    }

    //question 6
    public static int getSum(int[] ints) {
        int sum = 0;
        for (int value : ints) {
            sum += value;
        }
        return sum;
    }

    //question 7
    public static int getAverage(int[] ints) {
        int sum = 0;
        for (int value : ints) {
            sum += value;
        }
        return sum / ints.length;

    }

    public static void main(String[] args) {
        String[] names = {"becky", "mike", "Aqil", "luke", "khaled"};
        int[] ints = {8, 1, 6, 3, 15};
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        //question 1
        System.out.println(getLastIndex(names));
        //question 2
        System.out.println(getSecondToLastIndex(names));
        //question 3
         System.out.println(getFirstElement(names));
        //question 4
         System.out.println(getLastElement(names));
        //question 5
         System.out.println(getSecondToLastElement(names));
        //questions 6
         System.out.println(getSum(ints));
        //questions 7
        System.out.println(getAverage(ints));


    }
}
