import java.util.Scanner;


public class Young {

    
    
      public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[][] = new int[n][3];
       int x;
       int y;
       int z;
       int sumX=0;
       int sumY=0;
       int sumZ=0;
       for(int j=0; j<n; j++){
        x= sc.nextInt();
        y= sc.nextInt();
        z= sc.nextInt();
        arr[j][0]= x;
        arr[j][1]= y;
        arr[j][2]= z;
        sumX += arr[j][0];
        sumY += arr[j][1];
        sumZ += arr[j][2];
       }
       
       
       if(sumX == 0 && sumY ==0 && sumZ ==0){
           System.out.println("YES");
       
       }else{
       System.out.println("NO");}
       
    }
    
}
