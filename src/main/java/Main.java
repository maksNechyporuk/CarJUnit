

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        Car[]cars=new Car[3];
        cars[0]=new Car("BMW","X5", 2018, "Red", 20000,1);
        cars[1]=new Car("Audi","A6", 2016, "Black", 15000,2);
        cars[2]=new Car("Volkswagen ","Passat", 2017, "Black", 12900,3);
        BufferedReader buffered=new BufferedReader(new InputStreamReader(System.in));
        int c;
        do{

            System.out.println("1.Get makes");
            System.out.println("2.Get car by year and price");
            System.out.println("3.Get car by year");
            System.out.println("4.Exit");
            c= Integer.parseInt(buffered.readLine());

            if(c==1){
                System.out.println("Makes");
                for (int i = 0; i < cars.length; i++) {
                    System.out.println(cars[i].GetMake());
                }
            }
            else if(c==2)
            {
                System.out.print("Year: ");
                int year=Integer.parseInt(buffered.readLine());
                System.out.print("Price: ");
                int price=Integer.parseInt(buffered.readLine());
                for (int i = 0; i < cars.length; i++) {
                    cars[i].GetCarByYearAndPrice(year,price);
                }
            }
            else if(c==3)
            {System.out.print("Year: ");
                int year=Integer.parseInt(buffered.readLine());
                for (int i = 0; i < cars.length; i++) {
                    cars[i].GetCarByYear(year);
                }
            }

        }while(c!=4);




    }

}
