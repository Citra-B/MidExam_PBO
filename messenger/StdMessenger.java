package messenger;

public class StdMessenger implements Messenger{
    boolean isSuccess;

    @Override
    public void sendMessege(String receiver, String subject, String messege) {
        System.out.println("======Std Messenger======\n");
        System.out.println("Receiver        : " + receiver);
        System.out.println("Subject         : " + subject);
        System.out.println("Message         : "  +messege);

        if (receiver == "") {
            isSuccess = false;
            System.out.println("Status Message  : FAILED ! Std not sent.\n");
        } else {
            isSuccess = true;
            System.out.println("Status Message  : SUCCESS ! Std sent.\n");
        }
    }
}
