package primeno;

import java.util.LinkedList;

public class PrimeNumberMain {
    public static void main(String[] args) {
        LinkedList<Integer> primNumber = new LinkedList();
        for(int i=0; i<=1000; i++){
            if((i==0)||(i==1))
                System.out.println("Not Prime Number");
            else if((i==2)||(i==3)||(i==5)||(i==7))
                primNumber.push(i);
            else if ((i%i==0)&&(i%2!=0)&&(i%3!=0)&&(i%5!=0)&&(i%7!=0)) {
                primNumber.push(i);
            }
        }
        System.out.println(primNumber);
    }
}
