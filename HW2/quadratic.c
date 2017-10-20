#include<stdio.h>
#include<math.h>
//run commond: $ gcc -o  quadratic  quadratic.c -lm
//             $ ./ quadratic > roots.txt
void main() {
   double a=1;
   double b=1;
   double c=1;
   double x_1=0;
   double x_2=0;
   double p=0;
   // read file which contains the value of b
   int i=1;
   printf("x1,x2\n");
   for(i=1; i<=15; i++){
   	b=b*10;
    p=sqrt(b*b-4*a*c)+b;
   	x_1 = -2/p ;
   	x_2 = -p/2 ;

   	//  get the two solution of ax^2 + bx + c = 0
   	printf("%.17lf,%.17lf\n", x_1, x_2);
   } 
}
