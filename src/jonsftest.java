public class jonsftest {
    public static void main(String[] args){
        Node<Integer>first=null;
        Node<Integer>pre=null;
        for(int i=1;i<=41;i++){
            if(i==1){
                first=new Node<>(i,null);
                pre=first;
                continue;
            }
           Node<Integer> newNode= new Node<>(i,null);
            pre.next=newNode;
            pre=newNode;
            if(i==41){
             pre.next=first;
            }
        }
        int count=0;
        Node<Integer> n =first;
        Node<Integer> before=null;
        while (n!=n.next){
            count++;
            if(count==3){
                before.next=n.next;
                System.out.print(n.item+",");
                count=0;
                n=n.next;

            }else {before=n;
            n=n.next;
            }
        }
        System.out.println("存活者："+n.item);
    }
    private static class Node<T>{
        T item;
        Node next;
        public Node(T item,Node next){
            this.item=item;
            this.next=next;
        }
    }
}
