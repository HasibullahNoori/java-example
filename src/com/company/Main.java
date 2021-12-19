package com.company;

public class Main{

    public static void main(String[] args) {
	// write your code here
        String x= "Bj";
try {
    int y = 10/0;
    System.out.println("value of y is " + y);
}catch (Exception ignore){

}


        int z = 4 + 2;
        System.out.println("value of z is " + z);

//        File f = new File("/d/dev/pdf");
//        try {
//            BufferedWriter b= new BufferedWriter(new FileWriter("/d/dev/pdf"));
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        try {
//            int y = 10/0;
//            System.out.println(x);
//            File f = new File("/d/dev/pdf");
//        }catch (Exception ex){
//            System.out.println("Exception occured with message " + ex.getMessage());
//        }

    }
}
