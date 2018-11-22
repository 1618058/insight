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
		
		System.out.println("Openness(�m�I�D��S)���� = "+score1);
        System.out.println("Adventurousness(��_��) = "+score6+", Artistic interests(�|�p�I�֐S�x) = "+score7+", Emotionality(���) = "+score8+", Imagination(�z����) = "+score9+", Intellect(�v�l��) = "+score10+", Authority-challenging(����Ŕj) = "+score11+"");
        System.out.println("Conscientiousness(������)���� = "+score2+"");
        System.out.println("Achievement striving(�B���w��) = "+score12+", Cautiousness(���Ӑ[��) = "+score13+", Dutifulness(������) = "+score14+", Orderliness(������) = "+score15+", Self-discipline(������) = "+score16+", Self-efficacy(���Ȍ��͊�) = "+score17+"");
        System.out.println("Extraversion(�O����)���� = "+score3+"");
        System.out.println("Activity level(�����x) = "+score18+", Assertiveness(���Ȏ咣) = "+score19+", Cheerfulness(���N��) = "+score20+", Excitement-seeking(�h���󋁐�) = "+score21+", Outgoing(�F�D��) = "+score22+", Gregariousness(�Ќ�) = "+score23+"");
        System.out.println("Agreeableness(������)���� = "+score4+"");
        System.out.println("Altruism(������`) = "+score24+", Cooperation(������) = "+score25+", Modesty(������) = "+score26+", Uncompromising(���d��) = "+score27+", Sympathy(�����x) = "+score28+", Trust(�M�p�x) = "+score29+"");
        System.out.println("Neuroticism(����N��)���� = "+score5+"");
        System.out.println("Fiery(����I) = "+score30+", Prone to worry(�S�z��) = "+score31+", Melancholy(�ߊϓI) = "+score32+", Immoderation(���ȓI) = "+score33+", Self-consciousness(���ӎ��ߏ�) = "+score34+", Susceptible to stress(��X�g���X�ϐ�) = "+score35+"");

		
		}
		
		
}
