package primeno;

public class PrimeNumberMain {
    public static void main(String[] args) {

        Queue<Integer> queue = new Queue();

        for (int i = 0; i <= 1000; i++) {
            if ((i == 0) || (i == 1))
                System.out.println("Not Prime Number");
            else if ((i == 2) || (i == 3) || (i == 5) || (i == 7))
                queue.enQueue(i);
            else if ((i % i == 0) && (i % 2 != 0) && (i % 3 != 0) && (i % 5 != 0) && (i % 7 != 0)) {
                queue.enQueue(i);
            }
        }
        queue.displayQueue();
    }
}
