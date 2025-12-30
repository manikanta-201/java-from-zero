class Solution {
    // Method to typecast double to int
    public int typeCast(double d) {
        return (int) d;
    }

    public static void main(String[] args) {
        Solution obj = new Solution();
        double d = 10.23;

        // Correct method call
        int result = obj.typeCast(d);

        System.out.println("The integer value of " + d + " is " + result);
    }
}
