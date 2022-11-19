package no4;

import no3.Mahasiswa;

public class MahasiswaLinkedList {
    private MahasiswaNode head;
    private MahasiswaNode tail;
    private int size;

    public MahasiswaLinkedList() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    public boolean isEmpty(){
        return head == null;
    }

    public void addFirst(Mahasiswa data){
        MahasiswaNode newNode = new MahasiswaNode(data, null);
        if(isEmpty()){
            head = newNode;
            tail = newNode;
        }else{
            newNode.setNext(head);
            head = newNode;
        }
        size++;
    }

    public void addLast(Mahasiswa data){
        MahasiswaNode newNode = new MahasiswaNode(data, null);
        if(isEmpty()){
            head = newNode;
            tail = newNode;
        }else{
            tail.setNext(newNode);
            tail = newNode;
        }
        size++;
    }

    public MahasiswaNode getFirst() throws Exception{
        if(isEmpty()){
            throw new Exception("Linked List Kosong");
        }
        return head;
    }

    public MahasiswaNode getLast() throws Exception{
        if(isEmpty()){
            throw new Exception("Linked List Kosong");
        }
        return tail;
    }

    public MahasiswaNode get(int index) throws Exception{
        if(isEmpty() || index >= size){
            throw new Exception("Nilai index di luar batas");
        }
        MahasiswaNode current = head;
        int i = 0;
        while(i < index){
            current = current.getNext();
            i++;
        }
        return current;
    }

    public  void removeFirst() throws Exception{
        head = head.getNext();
        size--;
        if(isEmpty()){
            tail = null;
        }
    }

    public void removeLast(){
        if(size == 1){
            head = tail = null;
        }else{
            MahasiswaNode current = head;
            while(current.getNext() != tail){
                current = current.getNext();
            }
            current.setNext(null);
            tail = current;
        }
        size--;
    }

    public  int getSize(){
        return size;
    }

    public void printList(){
        if(!isEmpty()){
            MahasiswaNode tmp = head;
            while(tmp != null){
                System.out.println(tmp.getData().toString());
                tmp = tmp.getNext();
            }
        }else{
            System.out.println("Linked List Kosong");
        }
    }
}
