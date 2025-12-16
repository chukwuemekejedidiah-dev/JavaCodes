#include <stdio.h>
int gallonMileage(int miles, int gallons) {
    if (gallons == 0) {
        return 0; // Avoid division by zero
    }
    return miles / gallons;
}

int main() {
    int miles, gallons;
    printf("Enter miles driven: ");
    scanf("%d", &miles);
    printf("Enter gallons used: ");
    scanf("%d", &gallons);

    int mileage = gallonMileage(miles, gallons);
    if (gallons == 0) {
        printf("Gallons used cannot be zero.\n");
    } else {
        printf("Miles per gallon: %d\n", mileage);
    }

    return 0;
}