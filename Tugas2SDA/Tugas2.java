import java.util.LinkedList;

public class Tugas2 {

 public static void main(String[] args) {

  LinkedList<String> saya = new LinkedList<String>();
  saya.add("P");
  saya.add("U");
  saya.add("T");
  saya.add("R");
  saya.add("A");
  saya.add("");
  saya.add("I");
  saya.add("L");
  saya.add("H");
  saya.add("A");
  saya.add("M");

  System.out.println(saya);
  System.out.println("Size = "+saya.size());

  //Add LinkedList
  saya.addFirst("M");
  saya.addLast("U");
  saya.add("E");
  saya.add("V");
  System.out.println("\noutput tambah = "+saya);
  System.out.println("Size = "+saya.size());

  //set linkedlist 
  saya.set(0,"I" );
  saya.set(2,"K" );
  saya.set(7,"M" );
  saya.set(1,"A" );
  saya.set(9,"O" );
  System.out.println("Output untuk sisip = "+saya);
  System.out.println("Size = "+saya.size());

  //remove linkedlist
  saya.removeFirst();
  saya.removeLast();
  System.out.println("Output Remove First & Last = "+saya);
  System.out.println("Size = "+saya.size());

  saya.remove(9);
  saya.remove(6);
  saya.remove(4);
  saya.remove(7);
  saya.remove(1);
  System.out.println("Output setelah hapus = "+saya);
  System.out.println("Size = "+saya.size());

  //pop and push
  saya.pop();
  System.out.println("Output untuk POP = "+saya);
  System.out.println("Size = "+saya.size());

  saya.push("E");
  System.out.println("Output untuk PUSH = "+saya);
  System.out.println("Size = "+saya.size());
  }   
 }   