public class WorkersTask {
    public static void main(String[] args) {
        var hours = 640;
        var workDay = 8;
        var staffMembers = hours / workDay;
        System.out.println("Number of staff members is " + staffMembers);
        staffMembers = staffMembers + 94;
        System.out.println("New number of staffMembers is " + staffMembers);
        hours = staffMembers * workDay;
        System.out.println("New number of work hours is " + hours);
    }
}
