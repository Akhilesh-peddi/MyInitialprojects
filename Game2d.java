import java.util.*;
import java.lang.*;
public class Game2d
{ 
public static void main(String args[])
{
int i,j,x,option=1,row=0,col=0,r=0,c=0,v=0,n,m;
char temp;
char[][] a={{'A','-','-','-'},{'-','-','-','-'},{'-','-','-','-'},{'-','-','-','B'}};
for(i=0;i<4;i++)
{
for(j=0;j<4;j++)
{
 System.out.print(a[i][j]+" ");
}
System.out.println();
}
while(v==0)
{
System.out.println("Press 1 for A");
System.out.println("Press 2 for B");
Scanner sc=new Scanner(System.in);
x=sc.nextInt();
if(x==1)
{
	 row=0;col=0;
	 r=3;c=3;
	System.out.println("Player1  selected A");
	System.out.println("Player2  selected B");
    v++;	
}
else if(x==2)
{
     row=3;col=3;
	 r=0;c=0;
	System.out.println("Player1  selected B");
	System.out.println("Player2  selected A");
	v++;
}
else{
	System.out.println("Invalid option selected !please select a valid option");
}
}
System.out.println("=====Instructions=====");
System.out.println("Enter 8 for up");
System.out.println("Enter 4 for left");
System.out.println("Enter 6 for Right");
System.out.println("Enter 2 for Down");
while(option==1)
{
System.out.println("Player1's Turn:");
Scanner ac=new Scanner(System.in);
n=ac.nextInt();
if(row==0)
{
 if(col==0&&(n==4||n==8))
	System.out.println("Invalid!Press 2 or 6");
else if((col==1||col==2)&&n==8)
	System.out.println("Invalid!Press 2 or 6 or 4");
else if(col==3&&(n==6||n==8))
	System.out.println("Invalid!Press 2 or 4");
}
else if(col==0)
{
	if(row==1||row==2&&n==4)
		System.out.println("Invalid!Press 2 or 6 or 8 ");
else if(row==3&&(n==4||n==2))
		System.out.println("Invalid!Press 8 or 6");
}
else if(row==3)
{
	if(col==0&&(n==4||n==2))
	System.out.println("Invalid!Press 8 or 6");
else if(col==1||col==2&&n==2)
	System.out.println("Invalid!Press 8 or 6 or 4");
else if(col==3&&(n==6||n==2))
	System.out.println("Invalid!Press 8 or 4");
}
else if(col==3)
{
	if(row==0&&(n==8||n==6))
		System.out.println("Invalid!Press 4 or 2");
else if(row==1||row==2&&n==6)
		System.out.println("Invalid!Press 2 or 4 or 8 ");
else if(row==3&&(n==6||n==2))
		System.out.println("Invalid!Press 8 or 4");
}
if(n==2&&row<3)
{
	if(a[row+1][col]=='B')
	{
		System.out.println("Player A won!");
		System.exit(0);
	}
    else if(a[row+1][col]=='A')
	{
		System.out.println("Player B won!");
		System.exit(0);
	}
	else
	{
	temp=a[row][col];
	a[row][col]=a[row+1][col];
	a[row+1][col]=temp;
	row++;
	}
}
else if(n==4&&row>0)
{
	if(a[row][col-1]=='B')
	{
		System.out.println("Player A won!");
		System.exit(0);

	}
    else  if(a[row][col-1]=='A')
	{
		System.out.println("Player B won!");
		System.exit(0);

	}
	else
	{
	temp=a[row][col];
	a[row][col]=a[row][col-1];
	a[row][col-1]=temp;
	col--;
	}
}
else if(n==6&&col<3)
{
	if(a[row][col+1]=='B')
	{
		System.out.println("Player A won!");
		System.exit(0);

	}
	else if(a[row][col+1]=='A')
	{
		System.out.println("Player B won!");
		System.exit(0);
	}
	else
	{
	temp=a[row][col];
	a[row][col]=a[row][col+1];
	a[row][col+1]=temp;
	col++;
	}
}
else if(n==8&&row>0)
{
	if(a[row-1][col]=='B')
	{
		System.out.println("Player A won!");
		System.exit(0);

	}
	else if(a[row-1][col]=='A')
	{
		System.out.println("Player B won!");
		System.exit(0);

	}
	else
	{
	temp=a[row-1][col];
	a[row-1][col]=a[row][col];
	a[row][col]=temp;
	row--;
	}
}
for(i=0;i<4;i++)
{
for(j=0;j<4;j++)
{
 System.out.print(a[i][j]+" ");
}
System.out.println();
}

System.out.println("Player 2's Turn:");
Scanner ab=new Scanner(System.in);
m=ab.nextInt();
if(r==0)
{
 if(c==0&&(m==4||m==8))
	System.out.println("Invalid!Press 2 or 6");
else if(c==1||c==2&&m==4)
	System.out.println("Invalid!Press 2 or 6 or 4");
else if(c==3&&(m==6||m==8))
	System.out.println("Invalid!Press 2 or 4");
}
else if(c==0)
{
	if(r==1||r==2&&n==4)
		System.out.println("Invalid!Press 2 or 6 or 8 ");
else if(r==3&&(m==4||m==2))
		System.out.println("Invalid!Press 8 or 6");
}
else if(r==3)
{
	if(c==0&&(m==4||m==2))
	System.out.println("Invalid!Press 8 or 6");
else if(c==1||c==2&&m==2)
	System.out.println("Invalid!Press 8 or 6 or 4");
else if(c==3&&(m==6||m==2))
	System.out.println("Invalid!Press 8 or 4");
}
else if(c==3)
{
	if(r==0&&(m==8||m==6))
		System.out.println("Invalid!Press 4 or 2");
else if(r==1||row==2&&m==6)
		System.out.println("Invalid!Press 2 or 4 or 8 ");
else if(r==3&&(m==6||m==2))
		System.out.println("Invalid!Press 8 or 4");
}
if(m==2&&r<3)
{    if(a[r+1][c]=='B')
	{
		System.out.println("Player A won!");
		System.exit(0);

	}
	else if(a[r+1][c]=='A')
	{
		System.out.println("Player B won!");
		System.exit(0);

	}
	else 
	{
	temp=a[r][c];
	a[r][c]=a[r+1][c];
	a[r+1][c]=temp;
	r++;
	}
}
else if(m==4&&c>0)
{   if(a[r][c-1]=='A')
	{
		System.out.println("Player B won");
		System.exit(0);
	}
	else if(a[r][c-1]=='B')
	{
		System.out.println("Player A won");
		System.exit(0);
	}
	else
	{
	temp=a[r][c];
	a[r][c]=a[r][c-1];
	a[r][c-1]=temp;
	c--;
	}
}
else if(m==6&&c<3)
{
	if(a[r][c+1]=='A')
	{
		System.out.println("Player B won");
		System.exit(0);
	}
	else if(a[r][c+1]=='B')
	{
		System.out.println("Player A won");
		System.exit(0);
	}
	else
	{
	temp=a[r][c];
	a[r][c]=a[r][c+1];
	a[r][c+1]=temp;
	c++;
	}
}
else if(m==8&&r>0)
{
	if(a[r-1][c]=='A')
	{
		System.out.println("Player B won");
		System.exit(0);
	}
	else if(a[r-1][c]=='B')
	{
		System.out.println("Player A won");
		System.exit(0);
	}
	else
	{
	temp=a[r-1][c];
	a[r-1][c]=a[r][c];
	a[r][c]=temp;
	r--;
	}
}
for(i=0;i<4;i++)
{
for(j=0;j<4;j++)
{
 System.out.print(a[i][j]+" ");
}
System.out.println();
}
}
}
}

