package OOPsAssignment1;

public class JT_Question1 {
    public static void main(String[] args){
        int[] arr = {-4,1,3,-2,-1};
        boolean check = true;
        int start=0;
        int end=0;
        for(int i=0;i<arr.length;i++){
            int sum = 0;
            for(int j=i;j<arr.length;j++){
                sum += arr[j];
                if(sum==0){
                    start=i;
                    end=j;
                    check=false;
                    break;
                }
            }
        }
        if(check){
            System.out.print("No Element found");
            return;
        }
        for(int k=start;k<=end;k++){
            System.out.print(arr[k] + " ");
        }

    }
}
