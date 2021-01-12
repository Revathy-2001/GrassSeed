#include<iostream>
#include<stdio.h>
using namespace std;
int main(){
  double cost,ans = 0;
  int n;
  cin >> cost;
  if(cost > 0 && cost <= 100){
    cin >> n;
    if(n > 0 && n <= 100){
      double l,w;
      for(int i = 0;i < n;i++){
      cin >> l >> w;
      ans = ans + (l*w);
      }
      printf("%.7f",ans*cost);
    }

  }
}