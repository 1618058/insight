package insights;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;
import java.util.Map;

public class MySQL {
	String driver;// JDBCドライバの登録
    String server, dbname, url, user, password;// データベースの指定
    Connection con;
    Statement stmt;
    Map<String, Object> lng = new HashMap<>();
    //private String id;
    
    
  
	public MySQL() {
		this.driver = "org.gjt.mm.mysql.Driver";
		this.server = "sangi2018.sist.ac.jp";
        this.dbname = "1618058";
        this.user = "1618058";
        this.password = "sist1618058";
        //this.id = "1618058";
        this.url = "jdbc:mysql://" + server + "/" + dbname + "?useUnicode=true&characterEncoding=UTF-8";
        try {
            this.con = DriverManager.getConnection(url, user, password);
            this.stmt = con.createStatement ();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        try {
            Class.forName (driver);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
	}
		
	//値の無い物全て
	public ResultSet getID() {
		ResultSet rs = null;
		String sql = "SELECT * FROM  `images` WHERE  `age_min` = -1";
		try {
			rs = stmt.executeQuery (sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return rs;
	}
	
	public void updateImage(double score1,double score2,double score3,double score4,double score5,double score6,double score7,double score8,double score9,double score10,double score11,double score12,double score13,double score14,double score15,double score16,double score17,double score18,double score19,double score20,double score21,double score22,double score23,double score24,double score25,double score26,double score27,double score28,double score29,double score30,double score31,double score32,double score33,double score34,double score35,String text ) {

		StringBuffer buf = new StringBuffer();
		buf.append("INSERT INTO  `screens` (`openness`,`conscientiousness`,`extraversion`,`agreeableness`,`neuroticism`,`adventurousness`,`artistic`,`emotionality`,`imagination`,`intellect`,`challenging`,`striving`,`cautiousness`,`dutifulness`,`orderliness`,`discipline`,`efficacy`,`activity`,`assertiveness`,`cheerfulness`,`seeking`,`outgoing`,`gregariousness`,`altruism`,`cooperation`,`modesty`,`uncompromising`,`sympathy`,`trust`,`fiery`,`worry`,`melancholy`,`immoderation`,`consciousness`,`susceptible`, `text`) VALUES ("+ score1+","+ score2+","+ score3+","+ score4+","+ score5+","+ score6+","+ score7+","+ score8+","+ score9+","+ score10+","+ score11+","+ score12+","+ score13+","+ score14+","+ score15+","+ score16+","+ score17+","+ score18+","+ score19+","+ score20+","+ score21+","+ score22+","+ score23+","+ score24+","+ score25+","+ score26+","+ score27+","+ score28+","+ score29+","+ score30+","+ score31+","+ score32+","+ score33+","+ score34+","+ score35+", '"+text+"');");
		String sql = buf.toString();
		try {
			stmt.execute (sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//System.out.println(sql);
	}


		
}
