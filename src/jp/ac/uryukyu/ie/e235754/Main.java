package jp.ac.uryukyu.ie.e235754;
public class Main{
    public static void main(String[] args) {
        try{
            String str = null;
            System.out.println(str.length());
        }catch(NullPointerException e){
            System.out.println("NullPointerExceptionが発生");
            System.out.println(e.getMessage());
        }    
    }
}