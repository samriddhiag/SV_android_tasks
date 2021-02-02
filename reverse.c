#include<stdio.h> 

void reverse(char[]);

int main(){

    char s[10], c;
    int i;

    printf("Enter a string: ");
    
    /*Taking input in s*/
    for(i = 0; (i < 9) && ((c = getchar()) != '\n'); ++i)
        s[i] = c;
    s[i] = '\0';

    reverse(s);

    printf("\n The reversed string is : %s", s);
}

void reverse(char p[]){

    int i = 0,j, temp;

    for(j = 0; p[j] != '\0'; ++j)
        ;
    
    j -= 1;

    for( ; i < j; ++i, --j){

        temp = p[i];
        p[i] = p[j];
        p[j] = temp;
    }
        
}