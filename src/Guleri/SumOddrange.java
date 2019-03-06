package Guleri;

public class SumOddrange {
        public static boolean isOdd(int num){
            if(num>0){
                return (num %2 !=0);
            }
            else{return false;}
        }
        public static int sumOdd(int start,int end){
            int sum=0;
            if(start>0&&end>0&&end>=start){
                for(int i =start;i<=end;i++){
                    if(isOdd(i)){
                        sum=sum+i;
                    }}
                return sum;
            }
            else{
                return -1;}
        }
    }
