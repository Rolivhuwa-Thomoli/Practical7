import java.util.Scanner;

public class TestSalesTwoDimArray {
    public static void main(String[] args) {
        double sumSalePerson, sumProduct, total = 0.0 , readPrice;
        int person, product, SENTINEL = 999, index = 0;
        Scanner sc = new Scanner(System.in);
        Slip[] slips = new Slip[20]; //ATTENTION!!!
        double[][] sales = new double[5][4];
        do {
            System.out.println("Enter Slip or 999 to quit: ");
            System.out.print("Enter Slip Person Number: ");
            person = sc.nextInt();
            if (person == 999) {
                break;
            }
            if(person < 0||person > 3){continue;}
            System.out.print("Enter Slip Product Number: ");
            product = sc.nextInt();
            if(product<0||product>4){continue;}
            System.out.print("Enter Total Price: ");
            readPrice = sc.nextDouble();
            sc.nextLine();
            slips[index] = new Slip(person, product, readPrice);
            index++;
        }while (person != SENTINEL);

            for(int j = 0; j < 20; j++) {
                for(int i =0; i<5; i++) {

                    for (int k = 0; k < 4; k++) {
                        if (slips[j].getSalesPersonNumber() == i)
                            sales[i][j] = total + slips[j].getTotalPrice();
                    }
                }
            }


    }
}
