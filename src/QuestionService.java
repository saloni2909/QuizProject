import java.util.Scanner;

public class QuestionService {

    Question ques[] = new Question[5];

    String selection[] = new String[5];

    public QuestionService() {
        ques[0] = new Question(1,"Size of int in bytes?","2","4","6","8","4");
        ques[1] = new Question(2,"Size of boolen in bite?","1","4","6","8","1");
        ques[2] = new Question(3,"Size of char in bytes?","2","4","6","8","2");
        ques[3] = new Question(4,"Size of double in bytes?","2","4","6","8","8");
        ques[4] = new Question(5,"Size of float in bytes?","2","4","6","8","4");
    }



    public void playQuiz(){

        int i = 0;
        for(Question q : ques){
            System.out.println("Question no. "+q.getId());
            System.out.println(q.getQuestion());
            q.displayOpts();
            //System.out.print(q.getOpt1()+" "+q.getOpt2()+" "+q.getOpt3()+" "+q.getOpt4());
            System.out.println();
            Scanner s = new Scanner(System.in);
            selection[i] = s.nextLine();
            i++;

        }
        for(String s : selection){
            System.out.println(s);
        }
    }



}
