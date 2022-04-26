#include <stdio.h>
#include <conio.h>
#include <ctype.h>
#include <math.h>
#include <stdlib.h>
#include <string.h>

int main()
{
	int choice;
  	printf("1. ADDITION\n");
  	printf("2. SUBTRACTION\n");
  	printf("3. MULTIPLICATION\n");
  	printf("4. DIVISION\n");
  	printf("                    ");
  	printf("ENTER YOUR CHOICE:\t");
  	scanf("%d",&choice);
  	int x1,x2,x3,x4,y1,y2,y3,y4,result1,result2,result3,result4;
    FILE *aptr;
    FILE *sptr;
    FILE *mptr;
    FILE *dptr;
    switch(choice)
    {
      case 1:
      printf("Enter the first number:   ");
      scanf("%d",&x1);
      printf("Enter the second number:  ");
      scanf("%d",&y1);
      aptr=fopen("add.txt","a+");
      result1=x1+y1;
      putw(result1, aptr);
      fprintf(aptr,"%d + %d = %d\n",x1,y1,result1);
      fclose(aptr);
      break;
      case 2:
      printf("Enter the first number:   ");
      scanf("%d",&x2);
      printf("Enter the second number:  ");
      scanf("%d",&y2);
      sptr=fopen("sub.txt","w");
      result2=x2-y2;
      putw(result2, sptr);
      printf("%d - %d = %d\n",x2,y2,result2);
      fclose(sptr);
      break;
      case 3:
      printf("Enter the first number:  ");
      scanf("%d",&x3);
      printf("Enter the second number: ");
      scanf("%d",&y3);
      mptr=fopen("mul.txt","w");
      result3=x3*y3;
      putw(result3, mptr);
      printf("%d * %d = %d\n",x3,y3,result3);
      fclose(mptr);
      break;
      case 4:
      printf("Enter the first number:  ");
      scanf("%d",&x4);
      printf("Enter the second number: ");
      scanf("%d",&y4);
      dptr=fopen("div.txt","w");
      result4=x4/y4;
      printf("%d / %d = %d\n",x4,y4,result4);
      putw(result4, dptr);
      fclose(dptr);
      break;
    }
    return 0;
}
