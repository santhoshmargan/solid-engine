public class search{
public static void main(String[] args){
int []a=new int[]{1,2,3,4,5,6,7};
int num=10,i,j=0;boolean flag=false;
for(i=0;i<a.length;i++){
	if(a[i]==num){
flag=true;
	j=i;
	}
}
if(flag==true)
	{
		System.out.println(j);
	}
	else{
	System.out.println("undefined");}
}
}
