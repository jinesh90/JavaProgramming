class NewQueue{
    int q[];
    int start,end;

    public NewQueue(int size){
        q = new int[size];
        start=end=0;

    }

    private boolean isFull(){
        if (start != q.length){
            return false;
        }else {
            return true;
        }
    }

    private boolean isEmpty(){
        if (end == start){
            return true;
        }else {
            return false;
        }
    }


    public void putQueue(int a) {
        if (!isFull()) {
            q[start++] = a;

        }
        else {
            System.out.println("--Queue is full");
        }
    }

    public int getQueue(){
        if(isEmpty()){
            System.out.println("-- Queue is empty");
            System.exit(-1);
        }
        else{
            return q[end++];
        }
        return -1;
    }

}


public class QueueNew {
    public static void main(String[] args) {
        NewQueue b = new NewQueue(100);
        for (int i=0;i<50;i++){
            b.putQueue(i);

        }
        for (int i=0;i<5;i++){
            System.out.println(b.getQueue());


        }
        for(int j=5;j<100;j++){
            System.out.println(b.getQueue());
        }
    }

}
