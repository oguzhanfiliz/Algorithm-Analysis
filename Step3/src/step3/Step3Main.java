package step3;
import java.util.*;

public class Step3Main 
{
    public static void main(String[] args) {
    	String[][] data={
				{"02-08-2020","6.97"},{"03-08-2020","6.99"},{"04-08-2020","6.94"},{"05-08-2020","6.93"},{"06-08-2020","6.99"},{"07-08-2020","7.16"},{"08-08-2020","7.14"},{"09-08-2020","7.02"},{"10-08-2020","7.27"},{"11-08-2020","7.30"},{"12-08-2020","7.25"},{"13-08-2020","7.29"},{"14-08-2020","7.31"},{"15-08-2020","7.27"},{"16-08-2020","7.30"},{"17-08-2020","7.34"},{"18-08-2020","7.37"},{"19-08-2020","7.37"},{"20-08-2020","7.35"},{"21-08-2020","7.30"},{"22-08-2020","7.21"},{"23-08-2020","7.25"},{"24-08-2020","7.22"},{"25-08-2020","7.34"},{"26-08-2020","7.37"},{"27-08-2020","7.35"},{"28-08-2020","7.32"},{"29-08-2020","7.28"},{"30-08-2020","7.30"},{"31-08-2020","7.31"},{"01-09-2020","7.33"},{"02-09-2020","7.34"},{"03-09-2020","7.36"},{"04-09-2020","7.40"},{"05-09-2020","7.40"},{"06-09-2020","7.41"},{"07-09-2020","7.41"},{"08-09-2020","7.43"},{"09-09-2020","7.45"},{"10-09-2020","7.47"},{"11-09-2020","7.46"},{"12-09-2020","7.46"},{"13-09-2020","7.46"},{"14-09-2020","7.44"},{"15-09-2020","7.47"},{"16-09-2020","7.47"},{"17-09-2020","7.47"},{"18-09-2020","7.52"},{"19-09-2020","7.52"},{"20-09-2020","7.52"},{"21-09-2020","7.53"},{"22-09-2020","7.57"},{"23-09-2020","7.63"},{"24-09-2020","7.66"},{"25-09-2020","7.66"},{"26-09-2020","7.60"},{"27-09-2020","7.58"},{"28-09-2020","7.55"},{"29-09-2020","7.75"},{"30-09-2020","7.81"},{"01-10-2020","7.75"},{"02-10-2020","7.69"},{"03-10-2020","7.71"},{"04-10-2020","7.70"},{"05-10-2020","7.73"},{"06-10-2020","7.73"},{"07-10-2020","7.75"},{"08-10-2020","7.83"},{"09-10-2020","7.89"},{"10-10-2020","7.89"},{"11-10-2020","7.89"},{"12-10-2020","7.91"},{"13-10-2020","7.87"},{"14-10-2020","7.88"},{"15-10-2020","7.92"},{"16-10-2020","7.91"},{"17-10-2020","7.92"},{"18-10-2020","7.93"},{"19-10-2020","7.91"},{"20-10-2020","7.88"},{"21-10-2020","7.88"},{"22-10-2020","7.82"},{"23-10-2020","7.80"},{"24-10-2020","7.80"},{"25-10-2020","7.90"},{"26-10-2020","7.94"},{"27-10-2020","8.03"},{"28-10-2020","8.12"},{"29-10-2020","8.10"},{"30-10-2020","8.12"},{"31-10-2020","8.12"},{"01-11-2020","8.12"},{"02-11-2020","8.31"},{"03-11-2020","8.38"},{"04-11-2020","8.45"},{"05-11-2020","8.46"},{"06-11-2020","8.44"},{"07-11-2020","8.44"},{"08-11-2020","8.44"},{"09-11-2020","8.47"},{"10-11-2020","8.18"},{"11-11-2020","8.24"},{"12-11-2020","8.05"},{"13-11-2020","7.79"},{"14-11-2020","7.79"},{"15-11-2020","7.79"},{"16-11-2020","7.63"},{"17-11-2020","7.68"},{"18-11-2020","7.74"},{"19-11-2020","7.72"},{"20-11-2020","7.67"},{"21-11-2020","7.67"},{"22-11-2020","7.67"},{"23-11-2020","7.58"},{"24-11-2020","7.76"},			};
    	double arrItem;
		int arrayControl=0;
		int arrayLength= data.length;
		int parseSize=arrayLength/2;
		double maxcontrolPrice = 0;
		String maxDate="";
		double maxControlPriceSecond = 0;
		String maxDateSecond="";
		double mincontrolPrice = 10;
		String minDate="";
		double minControlPriceSecond = 10;
		String minDateSecond="";
		double newArray[][] =new double[arrayLength][2] ;
		//newArray'de sadece dolarlarım mevcut
    	for(arrayControl=0; arrayControl<arrayLength; arrayControl++) {
    		newArray[arrayControl][1]=arrayControl;
    		newArray[arrayControl][0]= Double.parseDouble(data[arrayControl][1]);
    		
		}
    	for(int firstArray=0; firstArray<parseSize; firstArray++) {
    		
    		if(maxcontrolPrice < newArray[firstArray][0]) {
    			maxcontrolPrice= newArray[firstArray][0];
    			int controlDate=(int) newArray[firstArray][1];
    		    maxDate = data[controlDate][0];
    		}
    		
    	}
    	for (int secondArray = parseSize; secondArray<arrayLength; secondArray++) {
    		if(maxControlPriceSecond < newArray[secondArray][0]) {
    		maxControlPriceSecond= newArray[secondArray][0];
			int controlDate=(int) newArray[secondArray][1];
			maxDateSecond = data[controlDate][0];
    		}
    	}
    	
    	//--------min----------
    	for(int minfirstArray=0; minfirstArray<parseSize; minfirstArray++) {
    		
    		if(mincontrolPrice > newArray[minfirstArray][0]) {
    			mincontrolPrice= newArray[minfirstArray][0];
    			int controlDate=(int) newArray[minfirstArray][1];
    			minDate = data[controlDate][0];
    		}
    		
    	}
    	for (int secondArray = parseSize; secondArray<arrayLength; secondArray++) {
    		if(minControlPriceSecond > newArray[secondArray][0]) {
    			minControlPriceSecond= newArray[secondArray][0];
			int controlDate=(int) newArray[secondArray][1];
			minDateSecond = data[controlDate][0];
    		}
    	}
    	
    	

    
    	
    	if(maxcontrolPrice < maxControlPriceSecond) {
    		System.out.println("Satabileceğiniz en kaarlı dolar kuru : " + maxControlPriceSecond);
    		System.out.println("Satabileceğiniz tarih : "+maxDateSecond );
    		if(minControlPriceSecond<mincontrolPrice) {
    			System.out.println("Alabileceğiniz en kaarlı dolar kuru" +minControlPriceSecond );
    			System.out.println("Alabileceğiniz tarih : "+minDateSecond);
    		}else if (mincontrolPrice<minControlPriceSecond) {
    			System.out.println("Alabileceğiniz en kaarlı dolar kuru: "+ mincontrolPrice);
    			System.out.println("Alabileceğiniz tarih : "+ minDate);
    		}
 
    	}else if(maxControlPriceSecond < maxcontrolPrice) {
    		System.out.println("Satabileceğiniz en kaarlı dolar kuru : "+maxcontrolPrice);
    		System.out.println("Satabileceğiniz tarih : "+maxDate);
    	}
	
    	
    }
   
}