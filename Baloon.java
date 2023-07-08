package Tcs;

public class Baloon {
    public static void main(String args[]){
        char c [] = {'r','g','b','b','g','y','y'};
        int count = 0;
        for(int i = 0; i<c.length; i++){
            for(int j = 0; j<c.length; j++){
                if(c[i]==c[j]){
                    count++;

                }
                if(count%2 == 1){
                    System.out.println(c[i]+"odd");
                    break;
                }


            }
        }
    }
}
