public class Main
 {public static void main(String [] args) throws Exception
   { 
    try {
     System.out.println("ABC1");
   int i=0;
float t;
     if(i==0)
         throw new Exception();//Exception();
      t=1/i;
     System.out.println("ABC2");
     System.out.println("ABC3");
    }
    catch(Exception e) {System.out.println("Exception");}
    finally {System.out.println("finally1");}
    System.out.println("last1");  //khi d�ng try cach c� ex v?n ra, khi d�ng th�m thow c� ex ko ra

   }
 }
/*
finally luon luon duoc thuc hien. ngay ca truong hop co error
*/
