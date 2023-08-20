public class StaticStack implements Stack{
    private final int[] data;
    private int top = -1;

    public StaticStack (int size){
        data = new int[size];
    }
    @Override
    public boolean isEmpty(){
        return top == -1;
    }

    @Override
    public boolean isFull() {
        return top == data.length-1;
    }

    @Override
    public void add(int value){
        if (isFull()){
            throw new IllegalStateException("Pilha está cheia!!");
        }

        top       = top+1;
        data[top] = value;         //adiciona o valor na pilha
    }

    @Override
    public int remove(){
        if(isEmpty()){
            throw new IllegalStateException("A Pilha está vazia!!");
        }
        int removed = data[top];
        data[top] = 0;
        top = top-1;
        return removed;
    }

    @Override
    public void clear(){
        top = -1;
        for (int i=0; i<=top; i++){
            data[i] =0;
        }
    }
}

