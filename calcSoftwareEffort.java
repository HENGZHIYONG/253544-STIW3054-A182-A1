import java.util.Scanner;

public class calcSoftwareEffort {
	
	public static void main(String[] args) {
		
		//Calculate Software Effort Estimation//
		//initialize//
		Scanner scan = new Scanner(System.in);
		int totalNsa = 0 , totalNaa = 0 , totalNca = 0 , totalUaw =0;
		int totalNsuc = 0 , totalNauc = 0 , totalNcuc = 0 , totalUucw =0 , uucp=0;
		int qtyT1, qtyT2 , qtyT3, qtyT4, qtyT5 , qtyT6 ,qtyT7 , qtyT8 , qtyT9 , qtyT10 , qtyT11 , qtyT12 , qtyT13 ;
		int qtyE1 , qtyE2 , qtyE3 , qtyE4, qtyE5 , qtyE6, qtyE7 , qtyE8 ;
		double totalT1 = 0 , totalT2 = 0 , totalT3 = 0 , totalTFactor =0;
		double totalT4 = 0 , totalT5 = 0 , totalT8 = 0 , totalT9 = 0;
		double totalT10 = 0 , totalT11 = 0 , totalT12 = 0 , totalT13 =0 ;
		double totalT7 = 0 , totalT6 = 0 , tCF=0;
		double totalE1 = 0 , totalE2 = 0 , totalE3 = 0 , totalEFactor =0;
		double totalE4 = 0 , totalE5 = 0 , totalE6 = 0 , totalE7 = 0 , totalE8 = 0 , eF=0;
		double szuc =0 , ucp=0;
		double menhours =0;
		double coefficientPercentage;
		double totalAdjustedmenhours = 0 ;
		double totalReportMenHourEstimate =0;
		double totalreportSimple =0 , totalreportAverage =0 ,totalreportComplex =0;
		double totalMenhours =0;

		//calculate the Actor Point//
		System.out.println("---------------------------------------------------------------");
		System.out.println("| Actor Complexity | Description                              |");
		System.out.println("|-------------------------------------------------------------|");
		System.out.println("| Simple           | Defined API                              |");
		System.out.println("|-------------------------------------------------------------|");
		System.out.println("| Average          | Interactive or Protocol driven interface |");
		System.out.println("|-------------------------------------------------------------|");
		System.out.println("| Complex          | Graphical User Interface                 |");
		System.out.println("---------------------------------------------------------------");
		
		System.out.print("\nPlease enter the quantity of simple actor complexity  : ");
		int qtySimplea = scan.nextInt();
		totalNsa = qtySimplea * 1;
		System.out.print("Please enter the quantity of average actor complexity : ");
		int qtyAveragea = scan.nextInt();
		totalNaa = qtyAveragea * 2;
		System.out.print("Please enter the quantity of complex actor complexity : ");
		int qtyComplexa = scan.nextInt();
		totalNca = qtyComplexa * 3;
		
		totalUaw = totalNsa + totalNaa + totalNca;
		System.out.println("Unadjusted Actor Weight (UAW) is "+totalUaw);
		
		//calculate Weighting use case for complexity//
		System.out.printf("\n----------------------------------------------\n");
		System.out.println("| Use Case Type | Description                |");
		System.out.println("|--------------------------------------------|");
		System.out.println("| Simple        | 3 or fewer transactions    |");
		System.out.println("|--------------------------------------------|");
		System.out.println("| Average       | 4 to 7 transactions        |");
		System.out.println("|--------------------------------------------|");
		System.out.println("| Complex       | Greater than 7 transaction |");
		System.out.println("----------------------------------------------");
		
		System.out.print("\nPlease enter the quantity of simple use case type  : ");
		int qtySimpleuc = scan.nextInt();
		totalNsuc = qtySimpleuc * 5;
		System.out.print("Please enter the quantity of average use case type : ");
		int qtyAverageuc = scan.nextInt();
		totalNauc = qtyAverageuc * 10;
		System.out.print("Please enter the quantity of complex use case type : ");
		int qtyComplexuc = scan.nextInt();
		totalNcuc = qtyComplexuc * 15;
		
		totalUucw = totalNsuc + totalNauc + totalNcuc;
		System.out.println("Unadjusted Use-Case Weight (UUCW) is "+totalUucw);
		
		uucp = totalUaw + totalUucw;
		System.out.println("Unadjusted Use Case Point (UUCP) is "+uucp);
		
		//Calculate Weighting Technical Factors//
		System.out.printf("\n\n----------------------------------------------------------------------\n");
		System.out.println("| Technical Factor | Factor Description                              |");
		System.out.println("|--------------------------------------------------------------------|");
		System.out.println("| T1               | Must have a distributed solution                |");
		System.out.println("|--------------------------------------------------------------------|");
		System.out.println("| T2               | Must respond to specific performance objectives |");
		System.out.println("|--------------------------------------------------------------------|");
		System.out.println("| T3               | Must meet end-user efficiency desires           |");
		System.out.println("|--------------------------------------------------------------------|");
		System.out.println("| T4               | Complex internal processing                     |");
		System.out.println("|--------------------------------------------------------------------|");
		System.out.println("| T5               | Code must be reusable                           |");
		System.out.println("|--------------------------------------------------------------------|");
		System.out.println("| T6               | Must be easy to install                         |");
		System.out.println("|--------------------------------------------------------------------|");
		System.out.println("| T7               | Must be easy to use                             |");
		System.out.println("|--------------------------------------------------------------------|");
		System.out.println("| T8               | Must be pertable                                |");
		System.out.println("|--------------------------------------------------------------------|");
		System.out.println("| T9               | Must be easy to change                          |");
		System.out.println("|--------------------------------------------------------------------|");
		System.out.println("| T10              | Must allow concurrent users                     |");
		System.out.println("|--------------------------------------------------------------------|");
		System.out.println("| T11              | Includes special security features              |");
		System.out.println("|--------------------------------------------------------------------|");
		System.out.println("| T12              | Must provide direct access for 3rd parties      |");
		System.out.println("|--------------------------------------------------------------------|");
		System.out.println("| T13              | Requires special user training facilities       |");
		System.out.printf("----------------------------------------------------------------------\n\n");
		
		System.out.println("*******************");
		System.out.println("*   Rating Rate   *");
		System.out.println("*******************");
		System.out.println("* 0 - irrelevant  *");
		System.out.println("* 5 - essential   *");
		System.out.printf("*******************\n\n");
		
		do {
			System.out.print("Please enter the rating of T1 (0-5)  : ");
			qtyT1 = scan.nextInt();
			totalT1 = qtyT1 * 2;
		}while(qtyT1 <0 || qtyT1 >5);
		
		do {
			System.out.print("Please enter the rating of T2 (0-5)  : ");
			 qtyT2 = scan.nextInt();
			totalT2 = qtyT2 * 1;
		}while(qtyT2 <0 || qtyT2 >5);
		
		do {
			System.out.print("Please enter the rating of T3 (0-5)  : ");
			qtyT3 = scan.nextInt();
			totalT3 = qtyT3 * 1;
		}while(qtyT3 <0 || qtyT3 >5);
		
		do {
			System.out.print("Please enter the rating of T4 (0-5)  : ");
			qtyT4 = scan.nextInt();
			totalT4 = qtyT4 * 1;
		}while(qtyT4 <0 || qtyT4 >5);
		
		do {
			System.out.print("Please enter the rating of T5 (0-5)  : ");
			qtyT5 = scan.nextInt();
			totalT5 = qtyT5 * 1;
		}while(qtyT5 <0 || qtyT5 >5);
		
		do {
			System.out.print("Please enter the rating of T6 (0-5)  : ");
			qtyT6 = scan.nextInt();
			totalT6 = qtyT6 * 0.5;
		}while(qtyT6 <0 || qtyT6 >5);
		
		do {
			System.out.print("Please enter the rating of T7 (0-5)  : ");
			qtyT7 = scan.nextInt();
			totalT7 = qtyT7 * 0.5;	
		}while(qtyT7 <0 || qtyT7 >5);
		
		do {
			System.out.print("Please enter the rating of T8 (0-5)  : ");
			qtyT8 = scan.nextInt();
			totalT8 = qtyT8 * 2;	
		}while(qtyT8 <0 || qtyT8 >5);
		
		do {
			System.out.print("Please enter the rating of T9 (0-5)  : ");
			qtyT9 = scan.nextInt();
			totalT9 = qtyT9 * 1;
		}while(qtyT9 <0 || qtyT9 >5);
		
		do {
			System.out.print("Please enter the rating of T10 (0-5) : ");
			qtyT10 = scan.nextInt();
			totalT10 = qtyT10 * 1;
		}while(qtyT10 <0 || qtyT10 >5);
		
		do {
			System.out.print("Please enter the rating of T11 (0-5) : ");
			qtyT11 = scan.nextInt();
			totalT11 = qtyT11 * 1;
		}while(qtyT11 <0 || qtyT11 >5);
		
		do {
			System.out.print("Please enter the rating of T12 (0-5) : ");
			qtyT12 = scan.nextInt();
			totalT12 = qtyT12 * 1;}
		while(qtyT12 <0 || qtyT12 >5);
		
		do {
			System.out.print("Please enter the rating of T13 (0-5) : ");
			qtyT13 = scan.nextInt();
			totalT13 = qtyT13 * 1;
		}while(qtyT13 <0 || qtyT13 >5);
		
		totalTFactor = totalT1 + totalT2 + totalT3 + totalT4 + totalT5 + totalT6 + totalT7 + totalT8 + totalT9 + totalT10 + totalT11 + totalT12 + totalT13;
		tCF = (0.01 * totalTFactor) + 0.6;
		System.out.printf("\nTechnical Complexity Factor (TCF) is "+tCF + "\n");
		
		szuc = uucp * tCF;
		System.out.println("Size of the software (SzUC) is "+szuc);
		
		//Calculate Weighting Experience Factors//
		System.out.printf("\n----------------------------------------------------------\n");
		System.out.println("| Experience Factor | Factor Description                 |");
		System.out.println("|--------------------------------------------------------|");
		System.out.println("| E1                | Familiar with FPT software process |");
		System.out.println("|--------------------------------------------------------|");
		System.out.println("| E2                | Application experience             |");
		System.out.println("|--------------------------------------------------------|");
		System.out.println("| E3                | Paradigm experience (OO)           |");
		System.out.println("|--------------------------------------------------------|");
		System.out.println("| E4                | Lead analyst capability            |");
		System.out.println("|--------------------------------------------------------|");
		System.out.println("| E5                | Motivation                         |");
		System.out.println("|--------------------------------------------------------|");
		System.out.println("| E6                | Stable Requirements                |");
		System.out.println("|--------------------------------------------------------|");
		System.out.println("| E7                | Part-time workers                  |");
		System.out.println("|--------------------------------------------------------|");
		System.out.println("| E8                | Difficulty of programming language |");
		System.out.printf("----------------------------------------------------------\n\n");
		
		do {
			System.out.print("Please enter the rating of E1 (0-5)  : ");
			qtyE1 = scan.nextInt();
			totalE1 = qtyE1 * 1;
		}while(qtyE1 <0 || qtyE1 >5);
		
		do {
			System.out.print("Please enter the rating of E2 (0-5)  : ");
			qtyE2 = scan.nextInt();
			totalE2 = qtyE2 * 0.5;
		}while(qtyE2 <0 || qtyE2 >5);
		
		do {
			System.out.print("Please enter the rating of E3 (0-5)  : ");
			qtyE3 = scan.nextInt();
			totalE3 = qtyE3 * 1;
		}while(qtyE3 <0 || qtyE3 >5);
		
		do {
			System.out.print("Please enter the rating of E4 (0-5)  : ");
			qtyE4 = scan.nextInt();
			totalE4 = qtyE4 * 0.5;
		}while(qtyE4 <0 || qtyE4 >5);
		
		do {
			System.out.print("Please enter the rating of E5 (0-5)  : ");
			qtyE5 = scan.nextInt();
			totalE5 = qtyE5 * 0;
		}while(qtyE5 <0 || qtyE5 >5);
		
		do {
			System.out.print("Please enter the rating of E6 (0-5)  : ");
			qtyE6 = scan.nextInt();
			totalE6 = qtyE6 * 2;
		}while(qtyE6 <0 || qtyE6 >5);
		
		do {
			System.out.print("Please enter the rating of E7 (0-5)  : ");
			qtyE7 = scan.nextInt();
			totalE7 = qtyE7 * -1;	
		}while(qtyE7 <0|| qtyE7 >5);
		
		do {
			System.out.print("Please enter the rating of E8 (0-5)  : ");
			qtyE8 = scan.nextInt();
			totalE8 = qtyE8 * -1;	
		}while(qtyE8 <0 || qtyE8 >5);
		
		
		totalEFactor = totalE1 + totalE2 + totalE3 + totalE4 + totalE5 + totalE6 + totalE7 + totalE8;
		eF = (-0.03 * totalEFactor) + 1.4;
		System.out.printf("\nExperience Factor (EF) is "+eF + "\n");
		
		ucp = szuc * eF;
		System.out.printf("Use Case Points (UCP) is %.2f\n",ucp );
		
		//  calculating man hours from ucp //
		int count =0;
		
		if(qtyE1>=0 && qtyE1<=3) {
			count ++;
		}
		if(qtyE2>=0 && qtyE2<=3) {
			count ++;
		}
		if(qtyE3>=0 && qtyE3<=3) {
			count ++;
		}
		if(qtyE4>=0 && qtyE4<=3) {
			count ++;
		}
		if(qtyE5>=0 && qtyE5<=3) {
			count ++;
		}
		if(qtyE6>=0 && qtyE6<=3) {
			count ++;
		}
		if(qtyE7>=3 && qtyE7<=5) {
			count ++;
		}
		if(qtyE8>=3 && qtyE8<=5) {
			count ++;
		}
		
		int totalcount = 0;
		
		totalcount+=count;
				
		if(totalcount >=0 && totalcount <= 2) {
			menhours = ucp * 20;
			System.out.println("Man-Hours : "+menhours);
		}
		else if(totalcount>=3 && totalcount<=4) {
			menhours = ucp * 28;
			System.out.println("Man-Hours : "+menhours);
		}
		else {
			System.out.println("This project is at significant risk of failure with this team.");
		}
			
		//Adjusting Man hours for risk//
		System.out.print("\nPlease enter the  coefficient as the percentage : ");
		coefficientPercentage = scan.nextDouble();
		
		totalAdjustedmenhours = (1.0 + (coefficientPercentage/100) ) * menhours;
		System.out.printf("Adjusted man-hours : %.2f", totalAdjustedmenhours);
		
		//Estimation report//
		System.out.println("\n\n-----------------------------------");
		System.out.println("| Report Type | Average Man-Hours |");
		System.out.println("|-------------|-------------------|");
		System.out.println("| Simple      | 12                |");
		System.out.println("|-------------|-------------------|");
		System.out.println("| Average     | 20                |");
		System.out.println("|-------------|-------------------|");
		System.out.println("| Complex     | 40                |");
		System.out.println("-----------------------------------");
				
		System.out.print("\nPlease enter the quantity of simple report type  : ");
		int reportSimple = scan.nextInt();
		totalreportSimple = reportSimple * 12;
		System.out.print("Please enter the quantity of average report type : ");
		int reportAverage = scan.nextInt();
		totalreportAverage = reportAverage * 20;
		System.out.print("Please enter the quantity of complex report type : ");
		int reportComplex = scan.nextInt();
		totalreportComplex = reportComplex * 40;
		
		totalReportMenHourEstimate = totalreportSimple +totalreportAverage +totalreportComplex;
		
		System.out.print("Total Report Man-hour Estimate : "+totalReportMenHourEstimate);
		
		totalMenhours = totalAdjustedmenhours + totalReportMenHourEstimate;
		System.out.printf("\nTotal Man-hour : %.2f",totalMenhours);
				
	}
}


