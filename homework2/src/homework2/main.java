package homework2;

import java.util.ArrayList;

public class main {

	public static void main(String[] args)  {
		String[][] data = {
				{"A","Ak","Al","Alý","Alýþma","Alýþmak","Alýþmakta","Alýþmaktan","Alma","Almaz","Almazlar","An","Anla","Anlar","Ayan","Az","Azla","Azlar"},
				{"B","Bir"},
				{"Ç","Çal","Çalý","Çalýþ","Çalýþma","Çalýþmak","Çalýþmakta","Çalýþmaktan"},
				{"D","De","Def","Dik","Dikler","Dikleri"},
				{"E","Ede","Ek","Eki","Er","Eri","Eriþ","Eriþme","Eriþmek","Ev"},
				{"F","Fi"},
				{"H","Hedef","Hedefi"},
				{"Ý","Ýs","Ýste","Ýstedi","Ýstedik","Ýstedikleri","Ýþ"},
				{"K","Kal","Kalma","Kalmaz","Kalmazlar","Kist","Kiste"},
				{"M","Maya"},
				{"O","Olma","Olmaya","Olmayan","Olmayanla","Olmayanlar"},
				{"T","Ta","Tan"},
				{"Y","Ya","Yan"},
				{"Z","Zevk"}
				};
		ArrayList <String> screenData=new ArrayList<String>();
		ArrayList <String> lastData=new ArrayList<String>();
		int arrayNumberleng=0;
		int check =0;
		String searchData="eriþmekistedikleribirhedefiolmayanlarçalýþmaktanzevkalmazlar";
		String firstCharacter = firstChar(searchData); 
		int SearchFirstChar = search(data);
		int len = data.length;
		int deletenumber= 0;
		int deleteIndýs=0;
		boolean whileControl=true;
		while(whileControl = true) {
		for (String[] i : data) {
					for(String eleman : i) {
						String element = eleman.toLowerCase();
						int dataNumber = element.length();
						String search = searchChar(searchData,0,dataNumber);
						String addData="";
							if(element.equals(search)) {
								addData = element; 
								screenData.add(addData);		
								arrayNumberleng++;
								deletenumber = addData.length();
							}else {
								
								
								}					
					}
					
			}

			searchData =deleteChar(searchData,deletenumber);

			for(int z = 0; z<arrayNumberleng-1; z++) {
					screenData.remove(0);
			}
			arrayNumberleng=0;
			deleteIndýs++;
			lastData.addAll(screenData);
			screenData.remove(0);

			int dataSize = searchData.length();

			if(dataSize==8) {
				lastData.add(searchData);
				break;
			}
		}
	   for (int i = 0; i < lastData.size();i++) 
	    { 		      
	        System.out.print(lastData.get(i)+" "); 		
	    }
}
	   private static int search(String[][] list) {
		   int start = 0;
		   int arrayLength=list.length;
		   return arrayLength/2;
	   }
	   
	   private static String firstChar(String data) {
		 return data.substring(0,1);
	   }
	   private static String searchChar(String data,int start, int i) {
			 return data.substring(start,i);
		   }
	   
	   
	   private static String deleteChar(String data , int deleteNumber) {
		   StringBuffer sBuffer = new StringBuffer();
		   String sonString;
		   sBuffer.append(data);
		   sBuffer.delete(0, deleteNumber);
		   return sBuffer.toString();
	   }

	   
	   /*private static String LastArray(String data, String screenData) {
		   screenData.add(data);
		   
		   return data ;
	   }*/
   

	}
