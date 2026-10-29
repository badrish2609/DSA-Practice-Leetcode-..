class Solution {
    public boolean lemonadeChange(int[] bills) {
        int five = 0;
        int ten = 0;

        for (int i = 0; i < bills.length; i++) {
            int bill = bills[i];

            if (bill == 5) {
                five = five + 1;
            } 
            else if (bill == 10) {
                if (five > 0) {
                    five = five - 1;
                    ten = ten + 1;
                } 
                else {
                    return false;
                }
            } 
            else if (bill == 20) {
                if (ten >= 1 && five >= 1) {
                    ten = ten - 1;
                    five = five - 1;
                } 
                else if (five >= 3) {
                    five = five - 3;
                } 
                else {
                    return false;
                }
            }
        }

        return true;
    }
}