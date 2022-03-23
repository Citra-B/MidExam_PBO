package messenger;

import java.util.Scanner;

public class Sender {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        String receiver, subject, messege;

        System.out.println("Receiver : ");
        receiver = scanner.nextLine();

        System.out.println("Subject : ");
        subject = scanner.nextLine();

        System.out.println("Messege : ");
        messege = scanner.nextLine();

        StdMessenger std = new StdMessenger();
        std.sendMessege(receiver, subject, messege);

        MailMessenger mail = new MailMessenger();
        mail.connect();
        mail.sendMessege(receiver, subject, messege);
        mail.disconnect();
        mail.sendMessege(receiver, subject, messege);
    }
}
