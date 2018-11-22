package insights;

import java.io.IOException;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.ibm.watson.developer_cloud.language_translator.v3.util.Language;
import com.ibm.watson.developer_cloud.personality_insights.v3.PersonalityInsights;
import com.ibm.watson.developer_cloud.personality_insights.v3.model.Profile;
import com.ibm.watson.developer_cloud.personality_insights.v3.model.ProfileOptions;
import com.ibm.watson.developer_cloud.service.security.IamOptions;
import com.ibm.watson.developer_cloud.visual_recognition.v3.VisualRecognition;



public class Insights_lib {

	String text;
	PersonalityInsights service;
		IamOptions iamOptions = null;
		ProfileOptions options;
		Profile profile ;
		public Insights_lib() {
			service = new PersonalityInsights("2018-03-19");
			
		iamOptions = new IamOptions.Builder()
					  .apiKey("8PRoKILD_Oj9Vawm2pGToWvLdlodFK-dh-9KvT2ieeBT")
					  .build();
					service.setIamCredentials(iamOptions);
					
					
		}
		public void takashi() {
		// Demo content from Moby Dick by Hermann Melville (Chapter 1)
		text = "Call me Ishmael. Some years ago-never mind how long precisely-having "
		    + "little or no money in my purse, and nothing particular to interest me on shore, "
		    + "I thought I would sail about a little and see the watery part of the world. "
		    + "It is a way I have of driving off the spleen and regulating the circulation. "
		    + "Whenever I find myself growing grim about the mouth; whenever it is a damp, "
		    + "drizzly November in my soul; whenever I find myself involuntarily pausing before "
		    + "coffin warehouses, and bringing up the rear of every funeral I meet; and especially "
		    + "whenever my hypos get such an upper hand of me, that it requires a strong moral "
		    + "principle to prevent me from deliberately stepping into the street, and methodically "
		    + "knocking peoples hats off-then, I account it high time to get to sea as soon as I can. "
		    + "This is my substitute for pistol and ball. With a philosophical flourish Cato throws himself "
		    + "upon his sword; I quietly take to the ship. There is nothing surprising in this. "
		    + "If they but knew it, almost all men in their degree, some time or other, cherish "
		    + "very nearly the same feelings towards the ocean with me. There now is your insular "
		    + "city of the Manhattoes, belted round by wharves as Indian isles by coral reefs-commerce surrounds "
		    + "it with her surf. Right and left, the streets take you waterward.";
				
		
		options = new ProfileOptions.Builder()
				        .text(text)
				        .build();


		}
		public void kashi() {
		 profile = service.profile(options).execute();
		System.out.println(profile);
		ObjectMapper mapper = new ObjectMapper();
		JsonNode node = null;
		try {
			node = mapper.readTree(String.valueOf(profile));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		double score1 = node.get("personality").get(0).get("percentile").doubleValue();							//openness
		double score2 = node.get("personality").get(1).get("percentile").doubleValue();							//Conscientiousness
		double score3 = node.get("personality").get(2).get("percentile").doubleValue();							//Extraversion
		double score4 = node.get("personality").get(3).get("percentile").doubleValue();							//Agreeableness
		double score5 = -1;																						//neuroticism
		double score6 = node.get("personality").get(0).get("children").get(0).get("percentile").doubleValue();	//Adventurousness
		double score7 = node.get("personality").get(0).get("children").get(1).get("percentile").doubleValue();	//Artistic interests
		double score8 = node.get("personality").get(0).get("children").get(2).get("percentile").doubleValue();	//Emotionality
		double score9 = node.get("personality").get(0).get("children").get(3).get("percentile").doubleValue();	//imagination
		double score10 = node.get("personality").get(0).get("children").get(4).get("percentile").doubleValue(); //Intellect
		double score11 = node.get("personality").get(0).get("children").get(5).get("percentile").doubleValue(); //challenging
		double score12 = node.get("personality").get(1).get("children").get(0).get("percentile").doubleValue(); //striving
		double score13 = node.get("personality").get(1).get("children").get(1).get("percentile").doubleValue(); //Cautiousness
		double score14 = node.get("personality").get(1).get("children").get(2).get("percentile").doubleValue(); //Dutifulness
		double score15 = node.get("personality").get(1).get("children").get(3).get("percentile").doubleValue(); //Orderliness
		double score16 = node.get("personality").get(1).get("children").get(4).get("percentile").doubleValue(); //Self-discipline
		double score17 = node.get("personality").get(1).get("children").get(5).get("percentile").doubleValue(); //Self-efficacy
		double score18 = node.get("personality").get(2).get("children").get(0).get("percentile").doubleValue(); //Activity level
		double score19 = node.get("personality").get(2).get("children").get(1).get("percentile").doubleValue(); //Assertiveness
		double score20 = node.get("personality").get(2).get("children").get(2).get("percentile").doubleValue(); //Cheerfulness
		double score21 = node.get("personality").get(2).get("children").get(3).get("percentile").doubleValue(); //Excitement-seeking
		double score22 = node.get("personality").get(2).get("children").get(4).get("percentile").doubleValue(); //Outgoing
		double score23 = node.get("personality").get(2).get("children").get(5).get("percentile").doubleValue(); //Gregariousness
		double score24 = node.get("personality").get(3).get("children").get(0).get("percentile").doubleValue(); //Altruism
		double score25 = node.get("personality").get(3).get("children").get(1).get("percentile").doubleValue(); //Cooperation
		double score26 = node.get("personality").get(3).get("children").get(2).get("percentile").doubleValue(); //Modesty
		double score27 = node.get("personality").get(3).get("children").get(3).get("percentile").doubleValue(); //Uncompromising
		double score28 = node.get("personality").get(3).get("children").get(4).get("percentile").doubleValue(); //Sympathy
		double score29 = node.get("personality").get(3).get("children").get(5).get("percentile").doubleValue(); //Trust
		double score30 = node.get("personality").get(4).get("children").get(0).get("percentile").doubleValue(); //Fiery
		double score31 = node.get("personality").get(4).get("children").get(1).get("percentile").doubleValue(); //Prone to worry
		double score32 = node.get("personality").get(4).get("children").get(2).get("percentile").doubleValue(); //Melancholy
		double score33 = node.get("personality").get(4).get("children").get(3).get("percentile").doubleValue(); //Immoderation
		double score34 = node.get("personality").get(4).get("children").get(4).get("percentile").doubleValue(); //Self-consciousness
		double score35 = node.get("personality").get(4).get("children").get(5).get("percentile").doubleValue(); //Susceptible to stress
		
		MySQL mysql = new MySQL();
		mysql.updateImage(score1,score2,score3,score4,score5,score6,score7,score8,score9,score10,score11,score12,score13,score14,score15,score16,score17,score18,score19,score20,score21,score22,23,score24,score25,score26,score27,score28,score29,score30,score31,score32,score33,score34,score35,text);
		
		System.out.println("Openness(知的好奇心)属性 = "+score1);
        System.out.println("Adventurousness(大胆性) = "+score6+", Artistic interests(芸術的関心度) = "+score7+", Emotionality(情動性) = "+score8+", Imagination(想像力) = "+score9+", Intellect(思考力) = "+score10+", Authority-challenging(現状打破) = "+score11+"");
        System.out.println("Conscientiousness(誠実性)属性 = "+score2+"");
        System.out.println("Achievement striving(達成努力) = "+score12+", Cautiousness(注意深さ) = "+score13+", Dutifulness(忠実さ) = "+score14+", Orderliness(秩序性) = "+score15+", Self-discipline(自制力) = "+score16+", Self-efficacy(自己効力感) = "+score17+"");
        System.out.println("Extraversion(外向性)属性 = "+score3+"");
        System.out.println("Activity level(活発度) = "+score18+", Assertiveness(自己主張) = "+score19+", Cheerfulness(明朗性) = "+score20+", Excitement-seeking(刺激希求性) = "+score21+", Outgoing(友好性) = "+score22+", Gregariousness(社交性) = "+score23+"");
        System.out.println("Agreeableness(協調性)属性 = "+score4+"");
        System.out.println("Altruism(利他主義) = "+score24+", Cooperation(協働性) = "+score25+", Modesty(謙虚さ) = "+score26+", Uncompromising(強硬さ) = "+score27+", Sympathy(共感度) = "+score28+", Trust(信用度) = "+score29+"");
        System.out.println("Neuroticism(感情起伏)属性 = "+score5+"");
        System.out.println("Fiery(激情的) = "+score30+", Prone to worry(心配性) = "+score31+", Melancholy(悲観的) = "+score32+", Immoderation(利己的) = "+score33+", Self-consciousness(自意識過剰) = "+score34+", Susceptible to stress(低ストレス耐性) = "+score35+"");

		
		}
		
		
}
