#include <iostream> 
using namespace std; 
  
void printCollatz(int n) 
{ int c=0;
    while (n != 1) 
    { 
        cout << n << "\n"; 
  
        // If n is odd 
        if (n & 1) 
            n = 3*n + 1; 
  
        // If even 
        else
            n = n/2;
      c++;
    } 
  
    cout << n<<"\n"<<c; 
} 
int main() 
{ int a;
 cin>>a;
    printCollatz(a); 
    return 0; 
} 