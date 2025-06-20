/*1*/
/*class Add{
public static void main(String[] args){
int a[]={1,2,3,4,5};
int sum=0;
for (int i=0;i<a.length;i++){
sum=sum+a[i];
}
System.out.println(sum);
}
}*/

/*2*/

/*import java.util.Scanner;
class Average{
public static void main(String[] args){
Scanner s= new Scanner(System.in);
System.out.println("enter the size");
int size;
size= s.nextInt();
int a[]=new int[size];
int sum=0,avg;
System.out.println(" enter arrays elements")
for (int i=0;i<size;i++){
a[i]=s.nextInt();
}
for (int i=0;i<a.length;i++){
sum=sum+a[i];
}
avg=sum/size;
System.out.println(avg);
}
}*/

/*3*/

/*import java.util.Scanner;
class Index{
public static void main(String[] args){
int a[]={1, 53, 47,17,35,};
int index=-1;
int choice;
Scanner s=new Scanner(System.in);
System.out.println("enter an element");
choice=s.nextInt();
for(int i=0;i<a.length;i++){
if (a[i]==choice){
 index=i;
}
}
if(index==-1){
System.out.println("the element is not found");
}
else{
System.out.println("the element  found at index"+index);
}
}
}*/

/*4*/

/*import java.util.Scanner;
class Search{
public static void main(String[] args){
int a[]={1, 53, 47,17,35,};

Scanner s=new Scanner(System.in);
System.out.println("enter an element");
int c=s.nextInt();
Search(a,c);
}
public static void Search(int a[],int choice){
int index=-1;
for(int i=0;i<a.length;i++){
if (a[i]==choice){
 index=i;
}
}
if(index==-1){
System.out.println("the element is not found");
}
else{
System.out.println("the element"+choice+"  found at index"+index);
}
}
}*/

/*5*/

/*
import java.util.Scanner;
class Delete{
public static void main(String[] args){
int a[]={1, 53, 47,17,34};

Scanner s=new Scanner(System.in);
System.out.println("enter an element");
int c=s.nextInt();
Delete(a,c);
}
public static void Delete(int a[],int choicye){
int index=-1;
System.out.println("array before ddeletion");o

for(int i:a){
System.out.println(i+" ");
}
for(int i=0;i<a.length;i++){
if (a[i]==choice){
 index=i;
}
}
for(int i=index;i<a.length-1;i++){
a[i]=a[i+1];
}
System.out.println("array afer ddeletion");

for(int i=0;i<a.length-1;i++){
System.out.println(a[i]+"");
}
}
}*/

/*6*/

/*import java.util.Scanner;
class Copy
{
public static void main(String[] args)
{
int n;
Scanner s =new Scanner(System.in);
System.out.println("enter array size");
n=s.nextInt();
int arr1[]=new int[n];
int arr2[]=new int[n];
System.out.println("enter array elements");
for(int i=0;i<n;i++){
arr1[i]=s.nextInt();
}
for(int i=0;i<n;i++){
arr2[i]=arr1[i];
}
for(int i=0;i<n;i++){
System.out.print(arr2[i]);
}
}
}
*/

/*7*/

/*import java.util.Scanner;
class Insert{
public static void main(String[] args){
int a[]=new int[20];
a[0]=12;
a[1]=34;
a[2]=90;
a[3]=49;
a[4]=78;
int size=5;
Scanner s=new Scanner(System.in);
System.out.println("enter an element");
int c=s.nextInt();
System.out.println("enter an index");
int d=s.nextInt();
Insert(a,c,d,size);
}
public static void Insert(int a[],int value,int dex ,int size){

System.out.println("array before insertion");
for(int i=0;i<size;i++){
System.out.print(a[i]+" ");
}
for(int i=size;i>=dex;i--){
a[i+1]=a[i];
}
a[dex]=value;
size+=1;
System.out.println("\narray afer insertion");

for(int i=0;i<size;i++){
System.out.print(a[i]+" ");
}
}
}*/

/*8*/

/*import java.util.Scanner;
class MaxMin{
public static void main(String []args){
Scanner s = new Scanner(System.in);
System.out.println("enter the size of an array");
int n=s.nextInt();
int arr[]=new int[n];
System.out.println("enter the elements in array");
for(int i=0;i<n;i++){
arr[i]=s.nextInt();
}
int max=arr[0];
int min=arr[0];
for( int i=0;i<n;i++){
if(arr[i]>max){
max=arr[i];
}}
for(int j=0;j<n;j++){
if(arr[j]<min)
{
min=arr[j];
}
} 
System.out.println("the maximum element is"+max);
System.out.println("the minimum element is"+min);
}}*/

/*9*/

/*import java.util.Scanner;
class Reverse
{
public static void main(String[] args)
{
int n;
Scanner s =new Scanner(System.in);
System.out.println("enter array size");
n=s.nextInt();
int j=n-1;

int arr1[]=new int[n];
int arr2[]=new int[n];
System.out.println("enter array elements");
for(int i=0;i<n;i++){
arr1[i]=s.nextInt();
}
for(int i=0;i<n;i++){

arr2[i]=arr1[j--];
}
for(int i=0;i<n;i++){
System.out.print(arr2[i]+" ");
}
}}*/





