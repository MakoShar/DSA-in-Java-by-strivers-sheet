package main;

class main {
public static void main(String[] args) {
Patterns pat = new Patterns();
pat.pattern22(2);
}
}

class Patterns{
void pattern1(int n){
for (int i=0;i<n;i++){
    for (int j=0;j<n;j++){
    System.out.print("*");
    }
    System.out.println();
}
}
void pattern2(int n){
for(int i=1;i<n+1;i++){
    for(int j=0;j<i;j++){
        System.out.print("*");
    }
    System.out.print("\n");
}
}
void pattern3(int n){
for (int i=1;i<n+1;i++){
    for(int j=0;j<i;j++){
        System.out.print(j+1);
    }
    System.out.println();
}
}
void pattern4(int n){
for (int i=1;i<=n;i++){
    for(int j=0;j<i;j++){
        System.out.print(i);
    }
    System.out.println();
}
}
void pattern5(int n){
for(int i=n;i>0;i--){
    for(int j=0;j<i;j++){
        System.out.print("*");
    }
    System.out.println();
}
}
void pattern6(int n){
for(int i=n;i>0;i--){
    for(int j=0;j<i;j++){
        System.out.print(j+1);
    }
System.out.println();
}
}
void pattern7(int n){
for(int i=1;i<=n;i++){
    for(int j=0;j<n-i;j++){
        System.out.print(" ");
    }
    for (int j=0;j<(2*i)-1;j++){
        System.out.print("*");
    }
    System.out.println();
}
}
void pattern8(int n){
for (int i=0;i<n;i++){
    for(int j=i;j!=0;j--){
        System.out.print(" ");
    }
    for(int j=0;j<(2*(n-i)-1);j++){
        System.out.print("*");
    }
    System.out.println();
}
}
void pattern9(int n){
for(int i=1;i<=n;i++){
    for(int j=0;j<n-i;j++){
        System.out.print(" ");
    }
    for (int j=0;j<(2*i)-1;j++){
        System.out.print("*");
    }
    System.out.println();
}
 for (int i=0;i<n;i++){
    for(int j=i;j!=0;j--){
        System.out.print(" ");
    }
    for(int j=0;j<(2*(n-i)-1);j++){
        System.out.print("*");
    }
    System.out.println();
}
}
void pattern10(int n){
for(int i=1;i<=n;i++){
    for(int j=0;j<i;j++){
        System.out.print("*");
    }
    System.out.println();
}
for(int i=n-1;i>0;i--){
    for(int j=0;j<i;j++){
        System.out.print("*");
    }
    System.out.println();
}
}
void pattern11(int n){
for(int i=1;i<=n;i++){
    for(int j=0;j<i;j++){
    	if(((j+i)%2!=0)) {
    		System.out.print("1");
    	} else {
    		System.out.print("0");
    	}
    }
    System.out.println();
}
}
void pattern12(int n){
for(int i=1;i<=n;i++){
    for(int j=0;j<i;j++){
        System.out.print(j+1);
    }
    for(int j=2*(n-i);j>0;j--){
        System.out.print(" ");
    }
    for(int j=i;j>0;j--){
        System.out.print(j);
    }
    System.out.println();
}
}
void pattern13(int n){
int x=1;
for(int i=1;i<=n;i++){
    for(int j=0;j<i;j++){
        System.out.print(x+" ");
        x+=1;
    }
System.out.println();
}
}
void pattern14(int n){
for(int i=1;i<=n;i++){
    int x=65;
    for(int j=0;j<i;j++){
        System.out.print((char)x);
        x+=1;
    }
System.out.println();
}
}
void pattern15(int n){
for(int i=0;i<=n;i++){
    int x=65;
    for(int j=0;j<n-i;j++){
        System.out.print((char)x);
        x+=1;
    }
System.out.println();
}
}
void pattern16(int n){
int x=65;
for(int i=0;i<=n;i++){
    
    for(int j=0;j<=i;j++){
        System.out.print((char)x);
    }
    System.out.println();
    x+=1;
}
}
void pattern17(int n){
for(int i=1;i<=n;i++){
    int x=64;
    for(int j=0;j<n-i;j++){
        System.out.print(" ");
    }
    for(int j=0;j<i;j++){
        x++;
        System.out.print((char)x);
    }
    for(int j=1;j<i;j++){
        x--;
        System.out.print((char)x);
    }

    System.out.println();
}
}
void pattern18(int n){
for(int i=1;i<=n;i++){
    int x=64+n;
    for(int j=0;j<i;j++){
        System.out.print((char)(x-j));
    }
    System.out.println();
}
}
void pattern19(int n){
for(int i=1;i<=n;i++){
    for(int j=n-i;j>=0;j--){
        System.out.print("*");
    }
    for(int j=1;j<i;j++){
        System.out.print("  ");
    }
    for(int j=0;j<(n-i)+1;j++){
        System.out.print("*");
    }
    System.out.println();
}
for(int i=1;i<n+1;i++){
    for(int j=0;j<i;j++){
        System.out.print("*");
    }
    for(int j=1;j<2*(n-i)+1;j++){
        System.out.print(" ");
    }
    for(int j=0;j<i;j++){
        System.out.print("*");
    }
    System.out.print("\n");
}
}
void pattern20(int n){
 for(int i=1;i<n;i++){
    for(int j=0;j<i;j++){
        System.out.print("*");
    }
    for(int j=1;j<2*(n-i)+1;j++){
        System.out.print(" ");
    }
    for(int j=0;j<i;j++){
        System.out.print("*");
    }
    System.out.print("\n");
}
for(int i=1;i<=n;i++){
    for(int j=n-i;j>=0;j--){
        System.out.print("*");
    }
    for(int j=1;j<i;j++){
        System.out.print("  ");
    }
    for(int j=0;j<(n-i)+1;j++){
        System.out.print("*");
    }
    System.out.println();
}
}
void pattern21(int n){
	for(int i=0;i<=n;i++) {
		System.out.print("*");
	}
	System.out.println();
	for(int i=0;i<n;i++) {
		System.out.print("*");
		for(int j=0;j<(n-1);j++) {
			System.out.print(" ");
		}
		System.out.println("*");
	}
	for(int i=0;i<=n;i++) {
		System.out.print("*");
	}
}
void pattern22(int n) {
	for (int i=0;i<n;i++) {
		for(int k=0;k<i;k++) {
			System.out.print(n-k);
		}
		for(int j=i;j<n;j++){
			System.out.print((n-i));
		}
		for(int k=1;k<n-i;k++){
			System.out.print((n-i));
		}
		for(int j=0;j<i;j++){
			System.out.print(n-i+j+1);
		}
		System.out.println();  
	}
	for(int i=0;i<n-1;i++) {
		for(int k=i;k<n-1;k++) {
			System.out.print(n+i-k);
		}
		for(int j=0;j<n-2+(2*i);j++) {
			System.out.print(n-1+i);//
		}
		for(int k=0;k<n-2-i;k++) {
			System.out.print("+");//n-1+k+i
		}
		System.out.println();
	}
}
}

