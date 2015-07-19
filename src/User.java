import java.util.Date;

/**
 * Created by Adrian on 18.07.2015.
 */
public class User {

    private String name;
    private Date date;
    private int score;



    public User(String name, Date date, int score) {
        this.name =name;
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

    public String getName() {

        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
