// Team Code = 1231, Name:- Pharamatrial (Start to healthy life)
import java.util.Scanner;
public class Self_Efficiency{
public static void main (String args[]){
 Scanner sc = new Scanner(System.in);
//Pharmatrial is a fictious name given to our site
//The doctors along with their numbers exists in real

System.out.println("\t\t\t\t\tPHARMATRIAL!!\n"+"\t\t\t\t\t(Start to healthy life)\n");
System.out.println("Each one of us has the power to prevent the spread of common diseases\n"+"Pharmatrial can help you judging the disease and prescribe you with specialists in your nearby area\n"+"With Pharmatrial you can protect yourself, your family and friends and make an effort fighting some diseases\n");

System.out.println("Please check for your Symptoms\n\n");
System.out.println();

System.out.println("1- Redness in one or both eyes, Itchiness in one or both eyes, A gritty feeling in one or both eyes\n");

System.out.println("2- Sore throat, Shortness of breath, Rashes, Hoarseness, Tiredness\n");

System.out.println("3- Fever and Flu-like illness, Shaking chills, Headache, Muscle aches and Tiredness\n");

System.out.println("4- Itching on body, Blisters, Fatigue,fever, Red spots\n");

System.out.println("5- Pain in chest, Loss in weight, Cough with blood sometime, Fever\n");

System.out.println("Please enter the serial number to which your symptoms belong\n");

int n = sc.nextInt();

System.out.println();
String arr1[][]={{"Pincode  ","Doctor  ", "Phone no. "},{"147001","Sodi eye hospital ", "9855997007"},{"147002","Dr.Talvir Sindhu", "01752372040"},{"147004","Dr. J.S Jaggi", "09814922719"},{"147005","Dr.Amarkomal", "08437873565"},{"147201","Guru kirpa clinic ", "09888715061"},{"147401","Dr.Parawant", "01612560533"},{"147105","Lions eyes care", "08725804362 "}};
String arr2[][]={{"Pincode  ","Doctor  ", "Phone no. "},{"147001","Dr.Piyush", "09814369260"},{"147002","Drinder Pal Goel", "09478181928"},{"147004","Dr.Pandhi", "09814922719"},{"147005","Arshhomeo clinic", "09814920536"},{"147201","Drsukhija", "09872788392"},{"147451","Paras hospital ", "08929116159"},{"147105","Dr.Sabar khan ", "09814468249"}};
String arr3[][]={{"Pincode  ","Doctor  ", "Phone no  "},{"147001","Dr.Nagi", "09034772282"},{"147002","Dr.Harjot Singh Oberoi", "0700994337"},{"147004","Sharma medical centre", "09876792523"},{"147005","Dr.Puneet Phul ", "09356521683"},{"147201","Dr.Amandeep ", "09814183096"},{"147401","Dr. YV malhotra ", "09417094654 "},{"147105","Mahindra medical hall", "09463034503"}};
String arr4[][]={{"Pincode  ","Doctor  ", "Phone no. "},{"147001","Dr.Yogi", "09357000019"},{"147002","Dr.O.P Miglani ", "09417385177"},{"147004","Dr. K.S Bawa", "09855173617"},{"147005","Dr.Jagdeep Singh  ", "18001024647"},{"147201","Sukhamani clinic", "09592235138"},{"147401","Dr.Inder ", "07610676606"},{"147105","Panel health clinic ", "09872275028"}};
String arr5[][]={{"Pincode  ","Doctor  ", "Phone no  "},{"147001","Dr.Bindu", "09501100640"},{"147002","Chest care clinic", "0950110640"},{"147004","Dr.Surinder Pal Singh", "09814152858"},{"147005","Dr.Charandeep Singh Grover", "09888278191"},{"147201","Dr.Ghunder", "09888117600"},{"147401","Mittal chest ", "09417094654  "},{"147105","Singla nursing home", "06283143105"}};
switch(n){
case 1:
System.out.println("You might have Conjuctivitis as per the symptoms you have chosen");
System.out.println("You should either rush to the doctor or consult him on phone");
System.out.println("Here are the areas and the list of doctors present there specialised in Conjuctivitis\n");
for(int i=0;i<8;i++){
    for(int j=0;j<3;j++){
        System.out.print(arr1[i][j]+" ");
    }
    System.out.println();
}
System.out.println("We hope you get well soon!!");
 break;


case 2:
System.out.println("You might have Dipheria as per the symptoms you have chosen");
System.out.println("You should either rush to the doctor or consult him on phone");
System.out.println("Here are the areas and the list of doctors present there specialised in Dipheria\n");
for(int i=0;i<8;i++){
 for(int j=0;j<3;j++){
     System.out.print(arr2[i][j]+" ");
 }
 System.out.println();
}
System.out.println("We hope you get well soon!!");
  

break;
case 3:
System.out.println("You might have Malaria as per the symptoms you have chosen");
System.out.println("You should either rush to the doctor or consult him on phone");
System.out.println("Here are the areas and the list of doctors present there specialised in Malaria\n");
for(int i=0;i<8;i++){
 for(int j=0;j<3;j++){
     System.out.print(arr3[i][j]+" ");
 }
 System.out.println();
}
System.out.println("We hope you get well soon!!");


     break;

case 4:
System.out.println("You might have Chickenpox as per the symptoms you have chosen");
System.out.println("You should either rush to the doctor or consult him on phone");
System.out.println("Here are the areas and the list of doctors present there specialised in Chickenpox\n");
for(int i=0;i<8;i++){
 for(int j=0;j<3;j++){
     System.out.print(arr4[i][j]+" ");
 }
 System.out.println();
}
System.out.println("We hope you get well soon!!");
break;

case 5:
System.out.println("You might have Tuberculosis as per the symptoms you have chosen");
System.out.println("You should either rush to the doctor or consult him on phone");
System.out.println("Here are the areas and the list of doctors present there specialised in Tuberculosis\n");
for(int i=0;i<8;i++){
 for(int j=0;j<3;j++){
     System.out.print(arr5[i][j]+" ");
 }
 System.out.println();
}
System.out.println("We hope you get well soon!!");


break;



default:
System.out.println("Wrong Choice");
}

 sc.close();
}
}