/*1*/
/*
import java.util.Scanner;
class Patterns{
public static void main(String[] args){
int n;
Scanner b=new Scanner(System.in);
System.out.println("Enter the input to draw square pattern with *:");
n=b.nextInt();
for(int i=0;i<n;i++){
for(int j=0;j<n;j++){
System.out.print("* ");
}
System.out.println("");
}
}
}
*/

/* 2 */

/*
import java.util.Scanner;
class Patterns{
public static void main(String[] args){
int n;
Scanner b=new Scanner(System.in);
System.out.println("Enter the input to draw square pattern with Numbers :");
n=b.nextInt();
for(int i=0;i<n;i++){
for(int j=0;j<n;j++){
System.out.print((i+1)+" ");
}
System.out.println("\n");
}
}
}
*/

/* 3 */

/*
import java.util.Scanner;
class Patterns{
public static void main(String[] args){
int n;
Scanner b=new Scanner(System.in);
System.out.println("Enter the input to draw square pattern with Numbers :");
n=b.nextInt();
for(int i=0;i<n;i++){
for(int j=0;j<n;j++){
System.out.print((j+1)+" ");
}
System.out.println("");
}
}
}
*/

/* 4 */

/*
import java.util.Scanner;
class Patterns{
public static void main(String[] args){
int n;
Scanner b=new Scanner(System.in);
System.out.println("Enter the input to draw square pattern with Numbers :");
n=b.nextInt();
int num=1;
for(int i=0;i<n;i++){
for(int j=0;j<n;j++){
System.out.print(num+"\t");
num++;
}
System.out.println("\t");
}
}
}
*/

/*5*/

/*
import java.util.Scanner;
class Patterns{
public static void main(String[] args){
int n;
Scanner b=new Scanner(System.in);
System.out.println("Enter the input to draw square pattern with Numbers :");
n=b.nextInt();
int num=1;
for(int i=0;i<n;i++){
for(int j=0;j<n;j++){
System.out.print(num+"\t");
if(num==9){
num=1;
continue;
}
num++;
}
System.out.println("");
}
}
}
*/

/* 6 */

/*
import java.util.Scanner;
class Patterns{
public static void main(String[] args){
int n;
Scanner b=new Scanner(System.in);
System.out.println("Enter the input to draw square pattern with Numbers :");
n=b.nextInt();
int num=1;
for(int i=0;i<n;i++){
for(int j=0;j<n;j++){
System.out.print(num+"\t");
num+=2;
}
System.out.println("\t");
}
}
}
*/

/* 7 */

/*
import java.util.Scanner;
class Patterns{
public static void main(String[] args){
int n;
Scanner b=new Scanner(System.in);
System.out.println("Enter the input to draw square pattern with Numbers :");
n=b.nextInt();
for(int i=1;i<=n;i++){
for(int j=i;j<=n;j++){
if(j%2==1){
System.out.print("1");
}
else{
System.out.print("0");
}
}
System.out.println();
}
}}
*/

/* 8 */
/*

import java.util.Scanner;
class Pattern8
{
public static void main(String[] args)
{
int n;
Scanner s=new Scanner(System.in);
System.out.print("Enter the value:");
n=s.nextInt();
for(int i=1;i<=n;i++)
{
for(int j=i;j<=n-1;j++)
{
System.out.print(" ");
}
for(int k=1;k<=i;k++)
{
System.out.print(" *");
}
System.out.println();
}
}
}
*/

/* 9 */
/*
import java.util.Scanner;
class Pattern9
{
public static void main(String[] args)
{
int n,even=2;
Scanner s=new Scanner(System.in);
System.out.print("Enter the value:");
n=s.nextInt();
for(int i=1;i<=n;i++)
{
for(int j=i;j<=n-1;j++)
{
System.out.print(" ");
}
for(int k=1;k<=i;k++)
{
System.out.print(" "+even);
even+=2;
}
System.out.println();
even=2;
}
}
}
*/

/*10 */
/*
import java.util.Scanner;
class Pattern10
{
public static void main(String[] args)
{
int n;
String s="INDIA";
Scanner s1=new Scanner(System.in);
System.out.print("Enter the value:");
n=s1.nextInt();
for(int i=1;i<=n;i++)
{
for(int j=0;j<i;j++)
{
System.out.print(s.charAt(j));
}
System.out.println();
}
}
}
*/

/* 11 */
/*
import java.util.Scanner;
class Pattern11
{
public static void main(String[] args)
{
int n;
Scanner s=new Scanner(System.in);
System.out.print("Enter the value:");
n=s.nextInt();
for(int i=1;i<=n;i++)
{
for(int j=i;j<=2*n-i;j++)
{
System.out.print(" ");
}
for(int k=1;k<=2*i-1;k++)
{
System.out.print(" *");
}
System.out.println();
}
}
}
*/

/*12*/

/*
import java.util.Scanner;
class Pattern11
{
public static void main(String[] args)
{
int n;
Scanner s=new Scanner(System.in);
System.out.print("Enter the value:");
n=s.nextInt();
for(int i=1;i<=n;i++)
{
for(int j=1;j<=n;j++)
{
System.out.print("\n");
}
for(int k=1;k<=n;k++){
System.out.print(" *");
}
System.out.print("2\n");
}
}
}
*/


/*
import java.util.Scanner;
class Patterns13 {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
int n = scanner.nextInt();
for (int i = 1; i <= n; i++) {
for (int j = 1; j <= n - i; j++) {
System.out.print(" ");
}
for (int k = 1; k <= 2 * i - 1; k++) {
if (k == 1 || k == 2 * i - 1)
System.out.print("*");
else
System.out.print(" ");
}
System.out.println();
}
for (int i = n - 1; i >= 1; i--) {
for (int j = 1; j <= n - i; j++) {
System.out.print(" ");
}
for (int k = 1; k <= 2 * i - 1; k++) {
if (k == 1 || k == 2 * i - 1) {
 System.out.print("*");
}
 else {
System.out.print(" ");
}
}
System.out.println();
}        
}
}*/

/*
import java.util.Scanner;
class patterns14 {
public static void main(String args[]){
int n;
Scanner s1=new Scanner(System.in);
System.out.println("Enter the value:");
n=s1.nextInt();
for(int i=0;i<n;i++) {
for(int j=0;j<n;j++) {
if(i==0 || j==0 || j==n-1 || i==n-1) {
System.out.print("*");
}
else {
System.out.print(" ");
}
}
System.out.println();
}
}
}*/


/*
import java.util.Scanner;
class Patterns15 {
public static void main(String args[]){
int n;
Scanner s1=new Scanner(System.in);
System.out.println("Enter the value:");
n=s1.nextInt();
for(int i=0;i<n;i++) {
for(int j=0;j<n;j++) {
if(i==n/2 || j==n/2) {
System.out.print("*");
}
else {
System.out.print(" ");
}
}
System.out.println();
}
}
}*/

/*
import java.util.Scanner;
class Patterns16 {
public static void main(String args[]){
int n;
Scanner s1=new Scanner(System.in);
System.out.println("Enter the value:");
n=s1.nextInt();
for(int i=1;i<=n;i++) {
for(int j=1;j<=n;j++) {
if(i==j || j==n-i+1) {
System.out.print("*");
}
else {
System.out.print(" ");
}
}
System.out.println();
}
}
}*/

/*
import java.util.Scanner;
class Patterns17 {
public static void main(String args[]){
int n;
Scanner s1=new Scanner(System.in);
System.out.println("Enter the value:");
n=s1.nextInt();
for(int i=0;i<n;i++) {
for(int j=0;j<n;j++) {
if(i==n/2 || j==n/2 || i==0 || j==0 || j==n-1 || i==n-1) {
System.out.print("*");
}
else {
System.out.print(" ");
}
}
System.out.println();
}
}
}*/

/*
import java.util.Scanner;
class Patterns18 {
public static void main(String args[]){
int n;
Scanner s1=new Scanner(System.in);
System.out.println("Enter the value:");
n=s1.nextInt();
for(int i=n;i>0;i--) {
for(int j=0;j<i;j++) {
if(j==0 || i==n || j==i-1) {
System.out.print("*");
}
else {
System.out.print(" ");
}
}
System.out.println();
}
}
}*/

/*
import java.util.Scanner;
class Patterns19 {
public static void main(String args[]){
int n;
Scanner s1=new Scanner(System.in);
System.out.println("Enter the value:");
n=s1.nextInt();
for(int i=0;i<=n;i++) {
for(int j=0;j<=i;j++) {
if(j!=i) {
System.out.print("*");
}
else {
System.out.print(j);
}
}
System.out.println();
}
}
}*/


import java.util.Scanner;
class Patterns20 {
public static void main(String args[]){
int n;
Scanner s1=new Scanner(System.in);
System.out.println("Enter the value:");
n=s1.nextInt();
for(int i=0;i<=n;i++) {
for(int j=0;j<=n;j++) {
if(j==0 || i==0 || i==j) {
System.out.print("*");
}
else {
System.out.print(" ");
}
}
System.out.println();
}
}
}
