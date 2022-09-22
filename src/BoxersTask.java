public class BoxersTask {
    public static void main(String[] args) {
        var firstBoxerWeight = 78.2;
        var secondBoxerWeight = 82.7;
        var summaryWeigt = firstBoxerWeight + secondBoxerWeight;
        var weigtDifference = secondBoxerWeight - firstBoxerWeight;
        System.out.println("Summary weight of two boxers is " + summaryWeigt);
        System.out.println("Weight's difference of two boxers is " + weigtDifference );
        var anotherWeightDifference = secondBoxerWeight % firstBoxerWeight;
        System.out.println("another way of weight's difference is " + anotherWeightDifference);
    }
}
