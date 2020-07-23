public class List1 {
    private ForwardLinkedList head;

    public List1(){
        head = null;
    }

    private boolean isEmpty(){
        return head == null;
    }

    public void add(int data){
        ForwardLinkedList temp = new ForwardLinkedList(data);
        temp.next=head;
        head=temp;
    }

    public void remove(){
        head = head.next;
    }

    public void removeAt(int key){
        ForwardLinkedList cur = head;
        ForwardLinkedList prev = head;

        while(cur.data !=key){
            if(isEmpty()){
                System.out.println("Empty");
                return;
            } else {
                prev = cur;
                cur = cur.next;
            }

            if(cur == head){
                head = head.next;
            } else{
                prev.next = cur.next;
            }
        }
    }

    public int find (int key){
        ForwardLinkedList temp = head;
        int c = 0;

        while (temp != null){
            if (temp.data == key){
                return c;
            }
            temp = temp.next;
            c++;
        }
        return -1;
    }

    public void print (){
        ForwardLinkedList temp = head;
        while (temp!= null){
            System.out.println(temp.data);
            temp=temp.next;
        }
    }



}
