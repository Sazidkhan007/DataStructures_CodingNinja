#include <iostream>
using namespace std;
int binary_search(int * arr, int search, int l, int h){
while(l<=h){
int mid=l+(h-l)/2;
if(arr[mid]==search)
return mid;
else if(search>arr[mid])
{
l=mid+1;
}
else
h=mid-1;
}
}
int main(){
int arr[100];
int search;int n;
cout<<"ENTER THE NUMBER OF ELEMENTS IN THE ARRAY--->";
cin>>n;
for(int i=0;i<n;i++)
cin>>arr[i];
cout<<"ENTER THE ELEMENT TO BE SEARCHED--->";
cin>>search;
int position=binary_search(arr,search,0,n);
cout<<"The number searched is present at: "<<position+1<<endl;
return 0;
}
