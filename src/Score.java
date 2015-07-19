import java.util.Date;

/**
 * Created by Adrian on 18.07.2015.
 */
public class Score {

    private String UserName;
    private Date date;
    private int score;


    public Score(String UserName, Date date, int score) {
        this.UserName = UserName;
        this.date =date;
        this.score = score;

    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String userName) {
        UserName = userName;
    }
}
