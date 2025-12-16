#include <stdio.h>

// Function prototype
void checkCreditLimit(int accountNumber, float beginningBalance, float totalCharges, float totalCredits, float creditLimit);

int main() {
    int accountNumber;
    float beginningBalance, totalCharges, totalCredits, creditLimit;

    // Get customer details
    printf("Enter account number: ");
    scanf("%d", &accountNumber);

    printf("Enter beginning balance: ");
    scanf("%f", &beginningBalance);

    printf("Enter total charges: ");
    scanf("%f", &totalCharges);

    printf("Enter total credits: ");
    scanf("%f", &totalCredits);

    printf("Enter credit limit: ");
    scanf("%f", &creditLimit);

    // Call function
  checkCreditLimit(accountNumber, beginningBalance, totalCharges, totalCredits, creditLimit);

    return 0;
}

// Function definition
void checkCreditLimit(int accountNumber, float beginningBalance, float totalCharges, float totalCredits, float creditLimit) {
    float newBalance = beginningBalance + totalCharges - totalCredits;

    printf("\nAccount Number: %d\n", accountNumber);
    printf("Credit Limit: %.2f\n", creditLimit);
    printf("New Balance: %.2f\n", newBalance);

    if (newBalance > creditLimit) {
        printf("Credit limit exceeded.\n");
    } else {
        printf("Credit limit not exceeded.\n");
    }
}
