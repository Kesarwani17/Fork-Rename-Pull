#include<iostream>
using namespace std;
int main()
{
int d1, c1, d2, c2;
std::cin>>d1>>c1>>d2>>c2;
int dollar=d1+d2;
int cent=c1+c2;
while(cent>100)
{
  dollar+=int(cent/100);
  cent=cent%100;
}
std::cout<<dollar<<"\n"<<cent;
return 0;
}