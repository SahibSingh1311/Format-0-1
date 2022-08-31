import java.util.*;

public class Formatter{
	public static void main(String[] args){
	int[] arr1 = {0,0,0,0,0,0,1,1,1,1,1,1};
	format(arr1);
}
	public static void format(int[] arr){
	int type0=0,type1=arr.length-1;
	while(type0<type1){
		if(arr[type0]==1){
			if(arr[type1]!=1){
				arr[type1]=arr[type1]+arr[type0];
				arr[type0]=arr[type1]-arr[type0];
				}
			type1--;
		}else{
			type0++;
}			
}

	for(int i =0; i<arr.length;i++)
		System.out.println(arr[i]);
}
}