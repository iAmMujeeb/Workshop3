package primeno;

public class Queue<M> {
    LinkedList<M> primNumber = new LinkedList();

    public void enQueue(M item){
        primNumber.push(item);
    }
    public void displayQueue(){
        primNumber.display();
    }
}
