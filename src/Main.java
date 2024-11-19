import java.util.Scanner;

class Wise {
    String wise;
    String author;
    int wisnum;
}
public class Main {
    public static void main(String[] args) {
        int num = 0;
        System.out.println("== 명언 앱 ==");
        while(true) {
            System.out.print("명령) ");
            Scanner scanner = new Scanner(System.in);
            String order = scanner.nextLine();
            if(order.equals("종료")) {
                break;
            }
            if(order.equals("등록")){
                num += 1;
                System.out.print("명언 : ");
                Scanner wis = new Scanner(System.in);
                String wisName = wis.nextLine();
                System.out.print("작가 : ");
                Scanner auth = new Scanner(System.in);
                String authName = auth.nextLine();
                System.out.println(num +"번 명언이 등록되었습니다.");
            }
            if(order.equals("목록")){

            }
        }
    }

}