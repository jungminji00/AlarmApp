package org.example;
import java.util.*;

class Main {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=0;
        String command;
        String wiseSaying="";
        String author="작자미상";
        List<WiseSyaing> ws=new ArrayList<>();

        System.out.println("== 명언 앱 ==");
        System.out.print("명령) ");
        command=sc.nextLine().trim();

        while(!command.equals("종료")){
            if(command.equals("등록")){
                System.out.print("명언 : ");
                wiseSaying=sc.nextLine();

                System.out.print("작가 : ");
                author=sc.nextLine();

                ws.add(new WiseSyaing(++num,wiseSaying,author));
                System.out.println(num+"번 명언이 등록되었습니다.");
            }else if(command.equals("목록")){
                for(int i=0;i<num;i++){
                    System.out.println(ws.get(i).num + " / " + ws.get(i).wiseSaying+ " / "+ws.get(i).author);
                }
            }else if(command.equals("삭제")){
                System.out.print("?id=");
                int id=1;
                id=sc.nextInt();
                try{
                    ws.remove(id-1);
                }catch(IndexOutOfBoundsException e){
                    System.out.println("인덱스 예외 오류");
                }
                System.out.println(id+"번 명언이 삭제되었습니다.");
            }
            System.out.print("명령) ");
            command=sc.nextLine().trim();
        }
    }

}
class WiseSyaing{
    String wiseSaying="";
    String author="작자미상";
    int num=0;
    WiseSyaing(int num,String wiseSaying, String author) {
        this.num=num;
        this.wiseSaying=wiseSaying;
        this.author=author;
    }
}