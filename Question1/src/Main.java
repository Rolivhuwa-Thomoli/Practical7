

public class Main {
    public static void main(String[] args) {
        int sizeOfArray;
        if (args.length == 0) {
            sizeOfArray = 10;
        }
        else sizeOfArray = Integer.parseInt(args[0]);

        int[] array = new int[sizeOfArray];

        if (args.length == 0) {
            for (int i = 0; i < array.length; i++) {
                array[i] = 0;
            }
        }
        else for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(args[i+1]);
        }
        System.out.printf("%s%10s%n","Index", "Value");
        for(int i = 0; i<sizeOfArray;i++){
            System.out.printf("%5d%10d%n", i, array[i]);
        }

    }
}
