package aadilkhatri.cs3354.txstate.edu.gotv2;

public class Question {
    private int question;
    private boolean trueQuestion;
    Question(int question, boolean trueQuestion){
        this.question = question;
        this.trueQuestion = trueQuestion;
    }
    public int getQuestion() {
        return question;
    }
    public void setQuestion(int question) {
        this.question = question;

    }
    public boolean isTrueQuestion() {
        return trueQuestion;
    }
    public void setTrueQuestion(boolean trueQuestion) {
        this.trueQuestion = trueQuestion;
    }
}
