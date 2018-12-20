package intToString;

public class intToString {
	public static void main(String[] args) {

        int convertThis = 4444;
        String myIntToStr = integerToString(convertThis);
        System.out.println(myIntToStr);


    }



    public static String integerToString (int x){
        int [] myarray = new int [4];
        myarray[0] =  x/1000;
        myarray[1] = (x%1000)/100;
        myarray[2] = (x%100)/10;
        myarray[3] =  x%10;

        String str="";

        for (int i =0; i<myarray.length; i++){
            str += myarray[i];

        }
        return str;

    }
}