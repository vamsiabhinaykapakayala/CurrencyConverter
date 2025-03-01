import java.util.*;

public class Main 
{
	public static void main(String args[])
	{
	System.out.print("Enter the Continent : ");
	String s,p;
	float k;
	Scanner sc = new Scanner(System.in);
	s=sc.next();
	switch(s)
	{
	case "Asia":
		System.out.print("Enter the Country : ");
		p=sc.next();
		if(p.equals("China"))
		{
		System.out.print("Enter the Chinese Yuan : ");
		k = sc.nextFloat();
		System.out.println("Rupees = " + k * 12.011 );
		}
		else if(p.equals("Japan"))
		{
			System.out.print("Enter the Japanese Yen : ");
			k = sc.nextFloat();
			System.out.println("Rupees = " + k *  0.580641);
		}
		else if(p.equals("SouthKorea"))
		{
			System.out.print("Enter the South Korean Won (KRW) : ");
			k = sc.nextFloat();
			System.out.println("Rupees = " + k *  0.0599);
		}
		else if(p.equals("NorthKorea"))
		{
			System.out.print("Enter the North Korean Won (KPW)  : ");
			k = sc.nextFloat();
			System.out.println("Rupees = " + k *  0.074);
		}
		else if(p.equals("Taiwan"))
		{
			System.out.print("Enter the New Taiwan Dollar : ");
			k = sc.nextFloat();
			System.out.println("Rupees = " + k *  2.66108);
		}
		else if(p.equals("Pakistan"))
		{
			System.out.print("Enter the Pakistani Rupee : ");
			k = sc.nextFloat();
			System.out.println("Rupees = " + k *  0.31288);
		}
		else if(p.equals("Bangladesh"))
		{
			System.out.print("Enter the Bangladeshi Taka : ");
			k = sc.nextFloat();
			System.out.println("Rupees = " + k *  0.8491);
		}
		else if(p.equals("Maldives"))
		{
			System.out.print("Enter the Maldivian Rufiyaa   : ");
			k = sc.nextFloat();
			System.out.println("Rupees = " + k *  5.68231);
		}
		else if(p.equals("SriLanka"))
		{
			System.out.print("Enter the Sri Lankan Rupee   : ");
			k = sc.nextFloat();
			System.out.println("Rupees = " + k *  0.3432);
		}
		else if(p.equals("Bhutan"))
		{
			System.out.print("Enter the Bhutanese Ngultrum   : ");
			k = sc.nextFloat();
			System.out.println("Rupees = " + k *  1);
		}
		else if(p.equals("Nepal"))
		{
			System.out.print("Enter the Nepalese Rupeea   : ");
			k = sc.nextFloat();
			System.out.println("Rupees = " + k *  0.6247);
		}
		else if(p.equals("Indonesia"))
		{
			System.out.print("Enter the Indonesian Rupiah  : ");
			k = sc.nextFloat();
			System.out.println("Rupees = " + k * 0.0052 );
		}
		else if(p.equals("Vietnam"))
		{
			System.out.print("Enter the  Vietnamese Dong   : ");
			k = sc.nextFloat();
			System.out.println("Rupees = " + k *  0.0035);
		}
		else if(p.equals("Myanmar"))
		{
			System.out.print("Enter the Burmese Kyat   : ");
			k = sc.nextFloat();
			System.out.println("Unavailable due to fluctuations and restrictions");
		}
		else if(p.equals("Malaysia"))
		{
			System.out.print("Enter the Malaysian Ringgit    : ");
			k = sc.nextFloat();
			System.out.println("Rupees = " + k *  17.5);
		}
		else if(p.equals("Philippines"))
		{
			System.out.print("Enter the Philippine Peso  : ");
			k = sc.nextFloat();
			System.out.println("Rupees = " + k *   1.5);
		}
		else if(p.equals("Cambodia"))
		{
			System.out.print("Enter the Cambodian Riel    : ");
			k = sc.nextFloat();
			System.out.println("Rupees = " + k *  0.018);
		}
		else if(p.equals("Laos"))
		{
			System.out.print("Enter the  Lao Kip   : ");
			k = sc.nextFloat();
			System.out.println("Rupees = " + k * 0.0045);
		}
		else if(p.equals("Singapore"))
		{
			System.out.print("Enter the Singapore Dollar   : ");
			k = sc.nextFloat();
			System.out.println("Rupees = " + k * 64.7391);
		}
		else if(p.equals("Brunei"))
		{
			System.out.print("Enter the Brunei Dollar   : ");
			k = sc.nextFloat();
			System.out.println("Rupees = " + k *  64.5 );
		}
		else if(p.equals("Timor-Leste"))
		{
			System.out.print("Enter the Uses United States Dollar (USD)   : ");
			k = sc.nextFloat();
			System.out.println("Rupees = " + k * 82.5);
		}
		else if(p.equals("Kazakhstan"))
		{
			System.out.print("Enter the Kazakhstani Tenge   : ");
			k = sc.nextFloat();
			System.out.println("Rupees = " + k *  0.1756 );
		}
		else if(p.equals("Uzbekistan"))
		{
			System.out.print("Enter the Uzbekistani Som   : ");
			k = sc.nextFloat();
			System.out.println("Rupees = " + k *  0.00678 );
		}
		else if(p.equals("Turkmenistan"))
		{
			System.out.print("Enter the Turkmenistani Manat : ");
			k = sc.nextFloat();
			System.out.println("Rupees = " + k *  23.64 );
		}
		else if(p.equals("Kyrgyzstan"))
		{
			System.out.print("Enter the Kyrgyzstani Som   : ");
			k = sc.nextFloat();
			System.out.println("Rupees = " + k *  0.952 );
		}
		else if(p.equals("Tajikistan"))
		{
			System.out.print("Enter the  Tajikistani Somoni   : ");
			k = sc.nextFloat();
			System.out.println("Rupees = " + k *  8.0226  );
		}
		else if(p.equals("SaudiArabia"))
		{
			System.out.print("Enter the   Saudi Riyal   : ");
			k = sc.nextFloat();
			System.out.println("Rupees = " + k *  19.58  );
		}
		else if(p.equals("UnitedArabEmirates"))
		{
			System.out.print("Enter the  Emirati Dirham   : ");
			k = sc.nextFloat();
			System.out.println("Rupees = " + k *  23.82 );
		}
		else if(p.equals("Iran"))
		{
			System.out.print("Enter the   Iranian Rial   : ");
			k = sc.nextFloat();
			System.out.println("Rupees = " + k *  0.0015 );
		}
		else if(p.equals("Iraq"))
		{
			System.out.print("Enter the  Iraqi Dinar  : ");
			k = sc.nextFloat();
			System.out.println("Rupees = " + k *  0.05  );
		}
		else if(p.equals("Syria"))
		{
			System.out.print("Enter the  Syrian Pound   : ");
			k = sc.nextFloat();
			System.out.println("Rupees = " + k *  0.03  );
		}
		else if(p.equals("Lebanon"))
		{
			System.out.print("Enter the  Lebanese Pound   : ");
			k = sc.nextFloat();
			System.out.println("Rupees = " + k * 0.005  );
		}
		else if(p.equals("Jordan"))
		{
			System.out.print("Enter the  Jordanian Dinar   : ");
			k = sc.nextFloat();
			System.out.println("Rupees = " + k *  116.35 );
		}
		else if(p.equals("Israel"))
		{
			System.out.print("Enter the  Israeli New Shekel   : ");
			k = sc.nextFloat();
			System.out.println("Rupees = " + k *  22.90  );
		}
		else if(p.equals("Palestine"))
		{
			System.out.print("Enter the  Israeli New Shekel    : ");
			k = sc.nextFloat();
			System.out.println("Rupees = " + k *  22.90  );
		}
		else if(p.equals("Turkey"))
		{
			System.out.print("Enter the  Turkish Lira    : ");
			k = sc.nextFloat();
			System.out.println("Rupees = " + k * 6.10);
		}
		else if(p.equals("Yemen"))
		{
			System.out.print("Enter the Yemeni Rial   : ");
			k = sc.nextFloat();
			System.out.println("Rupees = " + k *  0.31  );
		}
		else if(p.equals("Oman"))
		{
			System.out.print("Enter the  Omani Rial   : ");
			k = sc.nextFloat();
			System.out.println("Rupees = " + k *  227.29  );
		}
		else if(p.equals("Qatar"))
		{
			System.out.print("Enter the   Qatari Riyal   : ");
			k = sc.nextFloat();
			System.out.println("Rupees = " + k *  24.00  );
		}
		else if(p.equals("Bahrain"))
		{
			System.out.print("Enter the  Bahraini Dinar   : ");
			k = sc.nextFloat();
			System.out.println("Rupees = " + k *  232.64  );
		}
		else if(p.equals("Kuwait"))
		{
			System.out.print("Enter the   Kuwaiti Dinar   : ");
			k = sc.nextFloat();
			System.out.println("Rupees = " + k *  282.63  );
		}
		else if(p.equals("Armenia"))
		{
			System.out.print("Enter the   Armenian Dram  : ");
			k = sc.nextFloat();
			System.out.println("Rupees = " + k *  0.222  );
		}
		else if(p.equals("Azerbaijan"))
		{
			System.out.print("Enter the   Azerbaijani Manat    : ");
			k = sc.nextFloat();
			System.out.println("Rupees = " + k *  51.45  );
		}
		else if(p.equals("Georgia"))
		{
			System.out.print("Enter the    Georgian Lari  : ");
			k = sc.nextFloat();
			System.out.println("Rupees = " + k *  31.38  );
		}
		else
		{
			System.out.println("No such country in Asia");
		}
		break;
		
		
		
	case "Europe":
	System.out.print("Enter the Country : ");
	p = sc.next();
	if(p.equals("Albania"))
	{
	System.out.print("Enter the Albanian Lek  : ");
	k = sc.nextFloat();
	System.out.println("Rupees = " + k * 0.87 );
	}
	else if(p.equals("Andorra"))
	{
		System.out.print("Enter the Euro : ");
		k = sc.nextFloat();
		System.out.println("Rupees = " + k *  90.78);
	}
	else if(p.equals("Austria"))
	{
		System.out.print("Enter the Euro : ");
		k = sc.nextFloat();
		System.out.println("Rupees = " + k *  90.78);
	}
	else if(p.equals("Belarus"))
	{
		System.out.print("Enter the 	Belarusian Ruble : ");
		k = sc.nextFloat();
		System.out.println("Rupees = " + k *  34.75);
	}
	else if(p.equals("Cyprus"))
	{
		System.out.print("Enter the Euro : ");
		k = sc.nextFloat();
		System.out.println("Rupees = " + k *  90.78);
	}
	else if(p.equals("Belgium"))
	{
		System.out.print("Enter the Euro : ");
		k = sc.nextFloat();
		System.out.println("Rupees = " + k *  90.78);
	}
	else if(p.equals("Bosnia"))
	{
		System.out.print("Enter the Bosnia : ");
		k = sc.nextFloat();
		System.out.println("Rupees = " + k *  46.41);
	}
	else if(p.equals("Herzegovina"))
	{
		System.out.print("Enter the Herzegovina Mark : ");
		k = sc.nextFloat();
		System.out.println("Rupees = " + k *  46.41);
	}
	else if(p.equals("Bulgaria"))
	{
		System.out.print("Enter the Bulgarian Lev : ");
		k = sc.nextFloat();
		System.out.println("Rupees = " + k *  46.41);
	}
	else if(p.equals("Croatia"))
	{
		System.out.print("Enter the Croatian Kuna  : ");
		k = sc.nextFloat();
		System.out.println("Rupees = " + k *  12.08);
	}
	else if(p.equals("CzechRepublic"))
	{
		System.out.print("Enter the Czech Koruna  : ");
		k = sc.nextFloat();
		System.out.println("Rupees = " + k *  3.72);
	}
	else if(p.equals("Estonia"))
	{
		System.out.print("Enter the   Euro : ");
		k = sc.nextFloat();
		System.out.println("Rupees = " + k * 	90.78 );
	}
	else if(p.equals("Finland"))
	{
		System.out.print("Enter the Euro  : ");
		k = sc.nextFloat();
		System.out.println("Rupees = " + k *  90.78);
	}
	else if(p.equals("France"))
	{
		System.out.print("Enter the Euro  : ");
		k = sc.nextFloat();
		System.out.println("Rupees = " + k *  90.78);
	}
	else if(p.equals("Germany"))
	{
		System.out.print("Enter the Euro  : ");
		k = sc.nextFloat();
		System.out.println("Rupees = " + k *  90.78);
	}
	else if(p.equals("Greece"))
	{
		System.out.print("Enter the Euro  : ");
		k = sc.nextFloat();
		System.out.println("Rupees = " + k *  90.78);
	}
	else if(p.equals("Hungary"))
	{
		System.out.print("Enter the Hungarian Forint   : ");
		k = sc.nextFloat();
		System.out.println("Rupees = " + k *  0.23);
	}
	else if(p.equals("Iceland"))
	{
		System.out.print("Enter the IcelandIcelandic Krona : ");
		k = sc.nextFloat();
		System.out.println("Rupees = " + k *  0.59);
	}
	else if(p.equals("Ireland"))
	{
		System.out.print("Enter the Euro  : ");
		k = sc.nextFloat();
		System.out.println("Rupees = " + k *  90.78);
	}
	else if(p.equals("Italy"))
	{
		System.out.print("Enter the Euro  : ");
		k = sc.nextFloat();
		System.out.println("Rupees = " + k *  90.78);
	}
	else if(p.equals("Kosovo"))
	{
		System.out.print("Enter the Euro  : ");
		k = sc.nextFloat();
		System.out.println("Rupees = " + k *  90.78);
	}
	else if(p.equals("Latvia"))
	{
		System.out.print("Enter the Euro  : ");
		k = sc.nextFloat();
		System.out.println("Rupees = " + k *  90.78);
	}
	else if(p.equals("Liechtenstein"))
	{
		System.out.print("Enter the Swiss Franc  : ");
		k = sc.nextFloat();
		System.out.println("Rupees = " + k * 94.50);
	}
	else if(p.equals("Moldova"))
	{
		System.out.print("Enter the Moldovan Leu   : ");
		k = sc.nextFloat();
		System.out.println("Rupees = " + k *  4.58);
	}
	else if(p.equals("Monaco"))
	{
		System.out.print("Enter the Euro  : ");
		k = sc.nextFloat();
		System.out.println("Rupees = " + k *  90.78);
	}
	else if(p.equals("Montenegro"))
	{
		System.out.print("Enter the Euro  : ");
		k = sc.nextFloat();
		System.out.println("Rupees = " + k *  90.78);
	}
	else if(p.equals("Netherlands"))
	{
		System.out.print("Enter the Euro  : ");
		k = sc.nextFloat();
		System.out.println("Rupees = " + k *  90.78);
	}
	else if(p.equals("Lithuania"))
	{
		System.out.print("Enter the Euro  : ");
		k = sc.nextFloat();
		System.out.println("Rupees = " + k *  90.78);
	}
	else if(p.equals("Luxembourg"))
	{
		System.out.print("Enter the Euro  : ");
		k = sc.nextFloat();
		System.out.println("Rupees = " + k *  90.78);
	}
	else if(p.equals("Malta"))
	{
		System.out.print("Enter the Euro  : ");
		k = sc.nextFloat();
		System.out.println("Rupees = " + k *  90.78);
	}
	else if(p.equals("NorthMacedonia"))
	{
		System.out.print("Enter the Macedonian Denar   : ");
		k = sc.nextFloat();
		System.out.println("Rupees = " + k *  1.47);
	}
	else if(p.equals("Norway"))
	{
		System.out.print("Enter the Norwegian Krone : ");
		k = sc.nextFloat();
		System.out.println("Rupees = " + k *  7.50);
	}
	else if(p.equals("Poland"))
	{
		System.out.print("Enter the Polish Zloty : ");
		k = sc.nextFloat();
		System.out.println("Rupees = " + k *  19.80);
	}
	else if(p.equals("Portugal"))
	{
		System.out.print("Enter the Euro  : ");
		k = sc.nextFloat();
		System.out.println("Rupees = " + k *  90.78);
	}
	else if(p.equals("Romania"))
	{
		System.out.print("Enter the Romanian Leu   : ");
		k = sc.nextFloat();
		System.out.println("Rupees = " + k *  18.30);
	}
	else if(p.equals("Russia"))
	{
		System.out.print("Enter the Russian Ruble   : ");
		k = sc.nextFloat();
		System.out.println("Rupees = " + k *  1.20);
	}
	else if(p.equals("SanMarino"))
	{
		System.out.print("Enter the Euro  : ");
		k = sc.nextFloat();
		System.out.println("Rupees = " + k *  90.78);
	}
	else if(p.equals("Serbia"))
	{
		System.out.print("Enter the Serbian Dinar  : ");
		k = sc.nextFloat();
		System.out.println("Rupees = " + k * 0.77);
	}
	else if(p.equals("Slovakia"))
	{
		System.out.print("Enter the Euro  : ");
		k = sc.nextFloat();
		System.out.println("Rupees = " + k *  90.78);
	}
	else if(p.equals("Slovenia"))
	{
		System.out.print("Enter the Euro  : ");
		k = sc.nextFloat();
		System.out.println("Rupees = " + k *  90.78);
	}
	else if(p.equals("Spain"))
	{
		System.out.print("Enter the Euro  : ");
		k = sc.nextFloat();
		System.out.println("Rupees = " + k *  90.78);
	}
	else if(p.equals("Sweden"))
	{
		System.out.print("Enter the Swedish Krona  : ");
		k = sc.nextFloat();
		System.out.println("Rupees = " + k * 7.93);
	}
	else if(p.equals("Switzerland"))
	{
		System.out.print("Enter the Swiss Franc  : ");
		k = sc.nextFloat();
		System.out.println("Rupees = " + k *  95.12);
	}
	else if(p.equals("Ukraine"))
	{
		System.out.print("Enter the Ukrainian Hryvnia  : ");
		k = sc.nextFloat();
		System.out.println("Rupees = " + k *  2.98);
	}
	else if(p.equals("UnitedKingdom"))
	{
		System.out.print("Enter the British Pound  : ");
		k = sc.nextFloat();
		System.out.println("Rupees = " + k *  109.78);
	}
	else if(p.equals("VaticanCity"))
	{
		System.out.print("Enter the Euro  : ");
		k = sc.nextFloat();
		System.out.println("Rupees = " + k *  90.78);
	}
	else
	{
		System.out.print("No Such Country in Europe");
	}
	break;
	
	case "North America":
	System.out.println("Enter The Country : ");
	p=sc.next();
	if(p.equals("Canada"))
	{
	System.out.print("Enter the Canadian Dollar : ");
	k = sc.nextFloat();
	System.out.println("Rupees = " + k * 60.00 );
	}
	else if(p.equals("USA"))
	{
		System.out.print("Enter the United States Dollar : ");
		k = sc.nextFloat();
		System.out.println("Rupees = " + k *  87.27);
	}
	else if(p.equals("Mexico"))
	{
		System.out.print("Enter the Mexican Peso  : ");
		k = sc.nextFloat();
		System.out.println("Rupees = " + k *  4.21);
	}
	else if(p.equals("Guatemala"))
	{
		System.out.print("Enter the Guatemalan Quetzal  : ");
		k = sc.nextFloat();
		System.out.println("Rupees = " + k *  	11.23);
	}
	else if(p.equals("Belize"))
	{
		System.out.print("Enter the Belize Dollar : ");
		k = sc.nextFloat();
		System.out.println("Rupees = " + k *  43.63);
	}
	else if(p.equals("ElSalvador"))
	{
		System.out.print("Enter the United States Dollar  : ");
		k = sc.nextFloat();
		System.out.println("Rupees = " + k *  87.27);
	}
	else if(p.equals("Honduras"))
	{
		System.out.print("Enter the Honduran Lempira  : ");
		k = sc.nextFloat();
		System.out.println("Rupees = " + k *  3.55);
	}
	else if(p.equals("Nicaragua"))
	{
		System.out.print("Enter the 	Nicaraguan Córdoba : ");
		k = sc.nextFloat();
		System.out.println("Rupees = " + k *  2.38);
	}
	else if(p.equals("CostaRica"))
	{
		System.out.print("Enter the Costa Rican Colón : ");
		k = sc.nextFloat();
		System.out.println("Rupees = " + k *  0.14);
	}
	else if(p.equals("Panama"))
	{
		System.out.print("Enter the Panamanian Balboa  : ");
		k = sc.nextFloat();
		System.out.println("Rupees = " + k *  87.27);
	}
	else if(p.equals("Bahamas"))
	{
		System.out.print("Enter the Bahamian Dollar : ");
		k = sc.nextFloat();
		System.out.println("Rupees = " + k *  87.27);
	}
	else if(p.equals("Cuba"))
	{
		System.out.print("Enter the Cuban Peso : ");
		k = sc.nextFloat();
		System.out.println("Rupees = " + k *  3.64);
	}
	else if(p.equals("Jamaica"))
	{
		System.out.print("Enter the Jamaican Dollar : ");
		k = sc.nextFloat();
		System.out.println("Rupees = " + k *  0.57);
	}
	else if(p.equals("Haiti"))
	{
		System.out.print("Enter the Haitian Gourde : ");
		k = sc.nextFloat();
		System.out.println("Rupees = " + k *  0.82);
	}
	else if(p.equals("DominicanRepublic"))
	{
		System.out.print("Enter the Dominican Peso  : ");
		k = sc.nextFloat();
		System.out.println("Rupees = " + k *  1.53);
	}
	else if(p.equals("SaintKitts"))
	{
		System.out.print("Enter the East Caribbean Dollar : ");
		k = sc.nextFloat();
		System.out.println("Rupees = " + k * 32.31);
	}
	else if(p.equals("Nevis"))
	{
		System.out.print("Enter the East Caribbean Dollar : ");
		k = sc.nextFloat();
		System.out.println("Rupees = " + k * 32.31);
	}
	else if(p.equals("Antigua"))
	{
		System.out.print("Enter the East Caribbean Dollar : ");
		k = sc.nextFloat();
		System.out.println("Rupees = " + k * 32.31);
	}
	else if(p.equals("Barbuda"))
	{
		System.out.print("Enter the East Caribbean Dollar : ");
		k = sc.nextFloat();
		System.out.println("Rupees = " + k * 32.31);
	}
	else if(p.equals("Dominica"))
	{
		System.out.print("Enter the East Caribbean Dollar : ");
		k = sc.nextFloat();
		System.out.println("Rupees = " + k * 32.31);
	}
	else if(p.equals("SaintLucia"))
	{
		System.out.print("Enter the East Caribbean Dollar : ");
		k = sc.nextFloat();
		System.out.println("Rupees = " + k * 32.31);
	}
	else if(p.equals("SaintVincent"))
	{
		System.out.print("Enter the East Caribbean Dollar : ");
		k = sc.nextFloat();
		System.out.println("Rupees = " + k * 32.31);
	}
	else if(p.equals("Grenadines"))
	{
		System.out.print("Enter the East Caribbean Dollar : ");
		k = sc.nextFloat();
		System.out.println("Rupees = " + k * 32.31);
	}
	else if(p.equals("Barbados"))
	{
		System.out.print("Enter the Barbadian Dollar  : ");
		k = sc.nextFloat();
		System.out.println("Rupees = " + k * 43.1539 );
	}
	else if(p.equals("Trinidad"))
	{
		System.out.print("Enter the Trinidad Dollar : ");
		k = sc.nextFloat();
		System.out.println("Rupees = " + k * 12.91500);
	}
	else if(p.equals("Tobago"))
	{
		System.out.print("Enter the Tobago Dollar : ");
		k = sc.nextFloat();
		System.out.println("Rupees = " + k * 12.867664);
	}
	else if(p.equals("Grenada"))
	{
		System.out.print("Enter the  XCD : ");
		k = sc.nextFloat();
		System.out.println("Rupees = " + k * 32.36);
	}
	else
	{
		System.out.print("No Such Country in North America");
	}
	break;
	
	
	case "South America":
		System.out.print("Enter the Country : ");
		p=sc.next();
		if(p.equals("Argentina"))
		{
		System.out.print("Enter the Argentine Peso : ");
		k = sc.nextFloat();
		System.out.println("Rupees = " + k * 0.0821271 );
		}
		else if(p.equals("Bolivia"))
		{
			System.out.print("Enter the Bolivian Boliviano : ");
			k = sc.nextFloat();
			System.out.println("Rupees = " + k *  12.6719);
		}
		else if(p.equals("Brazil"))
		{
			System.out.print("Enter the Brazilian Real : ");
			k = sc.nextFloat();
			System.out.println("Rupees = " + k *  17.50);
		}
		else if(p.equals("Chile"))
		{
			System.out.print("Enter the Chilean Peso  : ");
			k = sc.nextFloat();
			System.out.println("Rupees = " + k * 0.091642);
		}
		else if(p.equals("Colombia"))
		{
			System.out.print("Enter the Colombian Peso  : ");
			k = sc.nextFloat();
			System.out.println("Rupees = " + k *  0.02102);
		}
		else if(p.equals("Ecuador"))
		{
			System.out.print("Enter the United States Dollar  : ");
			k = sc.nextFloat();
			System.out.println("Rupees = " + k * 87.27);
		}
		else if(p.equals("Guyana"))
		{
			System.out.print("Enter the Guyanese Dollar  : ");
			k = sc.nextFloat();
			System.out.println("Rupees = " + k * 0.41);
		}
		else if(p.equals("Paraguay"))
		{
			System.out.print("Enter the Paraguayan Guaraní  : ");
			k = sc.nextFloat();
			System.out.println("Rupees = " + k * 0.01105);
		}
		else if(p.equals("Peru"))
		{
			System.out.print("Enter the Peruvian Sol  : ");
			k = sc.nextFloat();
			System.out.println("Rupees = " + k * 23.22);
		}
		else if(p.equals("Suriname"))
		{
			System.out.print("Enter the Surinamese Dollar  : ");
			k = sc.nextFloat();
			System.out.println("Rupees = " + k * 0.091642);
		}
		else if(p.equals("Uruguay"))
		{
			System.out.print("Enter the Uruguayan Peso  : ");
			k = sc.nextFloat();
			System.out.println("Rupees = " + k * 2.05);
		}
		else if(p.equals("Venezuela"))
		{
			System.out.print("Enter the Venezuelan Bolívar  : ");
			k = sc.nextFloat();
			System.out.println("Rupees = " + k * 0.000001358);
		}
		else if(p.equals("FrenchGuiana"))
		{
			System.out.print("Enter the Euro  : ");
			k = sc.nextFloat();
			System.out.println("Rupees = " + k * 94.27);
		}
		else
		{
			System.out.print("No Such Country in South America");
		}
		break;
		
	case "Africa":
		System.out.print("Enter the Country : ");
		p=sc.next();
		if(p.equals("Algeria"))
		{
		System.out.print("Enter the Algerian Dinar  : ");
		k = sc.nextFloat();
		System.out.println("Rupees = " + k * 0.61 );
		}
		else if(p.equals("Angola"))
		{
			System.out.print("Enter the Angolan Kwanza : ");
			k = sc.nextFloat();
			System.out.println("Rupees = " + k *  0.10 );
		}
		else if(p.equals("Benin"))
		{
			System.out.print("Enter the West African CFA Franc: ");
			k = sc.nextFloat();
			System.out.println("Rupees = " + k *  0.14 );
		}
		else if(p.equals("Botswana"))
		{
			System.out.print("Enter the Botswana Pula : ");
			k = sc.nextFloat();
			System.out.println("Rupees = " + k *  6.10 );
		}
		else if(p.equals("BurkinaFaso"))
		{
			System.out.print("Enter the West African CFA Franc : ");
			k = sc.nextFloat();
			System.out.println("Rupees = " + k *  0.14      );
		}
		else if(p.equals("Burundi"))
		{
			System.out.print("Enter the Burundian Franc  : ");
			k = sc.nextFloat();
			System.out.println("Rupees = " + k *  0.03 );
		}
		else if(p.equals("CaboVerde"))
		{
			System.out.print("Enter the Cape Verdean Escudo : ");
			k = sc.nextFloat();
			System.out.println("Rupees = " + k *  0.80 );
		}
		else if(p.equals("Cameroon"))
		{
			System.out.print("Enter the Central African CFA Franc : ");
			k = sc.nextFloat();
			System.out.println("Rupees = " + k *  0.14  );
		}
		else if(p.equals("CentralAfricanRepublic"))
		{
			System.out.print("Enter the Central African CFA Franc : ");
			k = sc.nextFloat();
			System.out.println("Rupees = " + k *  0.14  );
		}
		else if(p.equals("Chad"))
		{
			System.out.print("Enter the Central African CFA Franc : ");
			k = sc.nextFloat();
			System.out.println("Rupees = " + k *  0.14  );
		}
		else if(p.equals("Comoros"))
		{
			System.out.print("Enter the Comorian Franc : ");
			k = sc.nextFloat();
			System.out.println("Rupees = " + k *  0.18  );
		}
		else if(p.equals("Democratic-Republic-of-the-Congo"))
		{
			System.out.print("Enter the Congolese Franc  : ");
			k = sc.nextFloat();
			System.out.println("Rupees = " + k *  0.03  );
		}
		else if(p.equals("Republic-of-the-Congo"))
		{
			System.out.print("Enter the Central African CFA Franc : ");
			k = sc.nextFloat();
			System.out.println("Rupees = " + k *  0.14  );
		}
		else if(p.equals("Djibouti"))
		{
			System.out.print("Enter the Djiboutian Franc : ");
			k = sc.nextFloat();
			System.out.println("Rupees = " + k *  0.47  );
		}
		else if(p.equals("Egypt"))
		{
			System.out.print("Enter the Egyptian Pound : ");
			k = sc.nextFloat();
			System.out.println("Rupees = " + k *  2.14  );
		}
		else if(p.equals("EquatorialGuinea"))
		{
			System.out.print("Enter the Central African CFA Franc : ");
			k = sc.nextFloat();
			System.out.println("Rupees = " + k *  0.14  );
		}
		else if(p.equals("Eritrea"))
		{
			System.out.print("Enter the Eritrean Nakfa : ");
			k = sc.nextFloat();
			System.out.println("Rupees = " + k *  5.50  );
		}
		else if(p.equals("Eswatini"))
		{
			System.out.print("Enter the Swazi Lilangeni : ");
			k = sc.nextFloat();
			System.out.println("Rupees = " + k *  4.36  );
		}
		else if(p.equals("Ethiopia"))
		{
			System.out.print("Enter the Ethiopian Birr : ");
			k = sc.nextFloat();
			System.out.println("Rupees = " + k *  1.47  );
		}
		else if(p.equals("Gabon"))
		{
			System.out.print("Enter the Central African CFA Franc : ");
			k = sc.nextFloat();
			System.out.println("Rupees = " + k *  0.14  );
		}
		else if(p.equals("Gambia"))
		{
			System.out.print("Enter the Gambian Dalasi : ");
			k = sc.nextFloat();
			System.out.println("Rupees = " + k *  1.27  );
		}
		else if(p.equals("Ghana"))
		{
			System.out.print("Enter the Ghanaian Cedi : ");
			k = sc.nextFloat();
			System.out.println("Rupees = " + k *  6.95  );
		}
		else if(p.equals("Guinea"))
		{
			System.out.print("Enter the Guinean Franc : ");
			k = sc.nextFloat();
			System.out.println("Rupees = " + k *  0.0095  );
		}
		else if(p.equals("Guinea-Bissau"))
		{
			System.out.print("Enter the West African CFA Franc : ");
			k = sc.nextFloat();
			System.out.println("Rupees = " + k *  0.14  );
		}
		else if(p.equals("Ivory Coast"))
		{
			System.out.print("Enter the West African CFA Franc : ");
			k = sc.nextFloat();
			System.out.println("Rupees = " + k *  0.14  );
		}
		else if(p.equals("Kenya"))
		{
			System.out.print("Enter the 	Kenyan Shilling : ");
			k = sc.nextFloat();
			System.out.println("Rupees = " + k *  	0.55  );
		}
		else if(p.equals("Lesotho"))
		{
			System.out.print("Enter the Lesotho Loti : ");
			k = sc.nextFloat();
			System.out.println("Rupees = " + k *  	4.36  );
		}
		else if(p.equals("Liberia"))
		{
			System.out.print("Enter the Liberian Dollar : ");
			k = sc.nextFloat();
			System.out.println("Rupees = " + k *  0.45  );
		}
		else if(p.equals("Libya"))
		{
			System.out.print("Enter the Libyan Dinar  : ");
			k = sc.nextFloat();
			System.out.println("Rupees = " + k *  17.17  );
		}
		else if(p.equals("Madagascar"))
		{
			System.out.print("Enter the Malagasy Ariary : ");
			k = sc.nextFloat();
			System.out.println("Rupees = " + k *  0.018  );
		}
		else if(p.equals("Malawi"))
		{
			System.out.print("Enter the Malawian Kwacha  : ");
			k = sc.nextFloat();
			System.out.println("Rupees = " + k *  	0.071  );
		}
		else if(p.equals("Mali"))
		{
			System.out.print("Enter the West African CFA Franc  : ");
			k = sc.nextFloat();
			System.out.println("Rupees = " + k *  0.14  );
		}
		else if(p.equals("Mauritania"))
		{
			System.out.print("Enter the Mauritanian Ouguiya  : ");
			k = sc.nextFloat();
			System.out.println("Rupees = " + k *  2.16  );
		}
		else if(p.equals("Mauritius"))
		{
			System.out.print("Enter the Mauritian Rupee  : ");
			k = sc.nextFloat();
			System.out.println("Rupees = " + k *  1.85  );
		}
		else if(p.equals("Rwanda"))
		{
			System.out.print("Enter the Rwandan Franc  : ");
			k = sc.nextFloat();
			System.out.println("Rupees = " + k *  0.068  );
		}
		else if(p.equals("Morocco"))
		{
			System.out.print("Enter the Moroccan Dirham  : ");
			k = sc.nextFloat();
			System.out.println("Rupees = " + k *  8.27  );
		}
		else if(p.equals("Mozambique"))
		{
			System.out.print("Enter the 	Mozambican Metical  : ");
			k = sc.nextFloat();
			System.out.println("Rupees = " + k *  1.30   );
		}
		else if(p.equals("Namibia"))
		{
			System.out.print("Enter the Namibian Dollar  : ");
			k = sc.nextFloat();
			System.out.println("Rupees = " + k *  4.36  );
		}
		else if(p.equals("Niger"))
		{
			System.out.print("Enter the West African CFA Franc  : ");
			k = sc.nextFloat();
			System.out.println("Rupees = " + k *  0.14  );
		}
		else if(p.equals("Nigeria"))
		{
			System.out.print("Enter the Rwandan Franc  : ");
			k = sc.nextFloat();
			System.out.println("Rupees = " + k *  0.068  );
		}
		else if(p.equals("São-Tomé-and-Príncipe"))
		{
			System.out.print("Enter the São Tomé and Príncipe Dobra  : ");
			k = sc.nextFloat();
			System.out.println("Rupees = " + k *  3.34  );
		}
		else if(p.equals("Senegal"))
		{
			System.out.print("Enter the West African CFA Franc  : ");
			k = sc.nextFloat();
			System.out.println("Rupees = " + k *  0.14  );
		}
		else if(p.equals("Seychelles"))
		{
			System.out.print("Enter the Seychellois Rupee  : ");
			k = sc.nextFloat();
			System.out.println("Rupees = " + k *  	6.20  );
		}
		else if(p.equals("SierraLeone"))
		{
			System.out.print("Enter the Sierra Leonean Leone   : ");
			k = sc.nextFloat();
			System.out.println("Rupees = " + k *  0.0039  );
		}
		else if(p.equals("Somalia"))
		{
			System.out.print("Enter the 	Somali Shilling  : ");
			k = sc.nextFloat();
			System.out.println("Rupees = " + k *  0.14  );
		}
		else if(p.equals("SouthAfrica"))
		{
			System.out.print("Enter the South African Rand  : ");
			k = sc.nextFloat();
			System.out.println("Rupees = " + k *  	4.37  );
		}
		else if(p.equals("SouthSudan"))
		{
			System.out.print("Enter the South Sudanese Pound  : ");
			k = sc.nextFloat();
			System.out.println("Rupees = " + k *  0.63  );
		}
		else if(p.equals("Sudan"))
		{
			System.out.print("Enter the Sudanese Poundc  : ");
			k = sc.nextFloat();
			System.out.println("Rupees = " + k *  0.14  );
		}
		else if(p.equals("Tanzania"))
		{
			System.out.print("Enter the Tanzanian Shilling  : ");
			k = sc.nextFloat();
			System.out.println("Rupees = " + k *  0.033  );
		}
		else if(p.equals("Togo"))
		{
			System.out.print("Enter the West African CFA Franc  : ");
			k = sc.nextFloat();
			System.out.println("Rupees = " + k *  0.14  );
		}
		else if(p.equals("Tunisia"))
		{
			System.out.print("Enter the Tunisian Dinar : ");
			k = sc.nextFloat();
			System.out.println("Rupees = " + k *  26.40   );
		}
		else if(p.equals("Uganda"))
		{
			System.out.print("Enter the Ugandan Shilling  : ");
			k = sc.nextFloat();
			System.out.println("Rupees = " + k *  0.022   );
		}
		else if(p.equals("Zambia"))
		{
			System.out.print("Enter the Zambian Kwacha  : ");
			k = sc.nextFloat();
			System.out.println("Rupees = " + k *  4.70   );
		}
		else if(p.equals("Zimbabwe"))
		{
			System.out.print("Enter the Zimbabwean Dollar  : ");
			k = sc.nextFloat();
			System.out.println("Rupees = " + k *  0.23  );
		}
		else
		{
			System.out.println("No Such Country in Africa");
		}
		break;
		
	case "Australia":
		System.out.print("Enter the Country : ");
		p=sc.next();
		if(p.equals("Australia"))
		{
		System.out.print("Enter the Australian Dollar  : ");
		k = sc.nextFloat();
		System.out.println("Rupees = " + k *  55 );
		}
		else if(p.equals("Papua-New-Guinea"))
		{
			System.out.print("Enter the Papua New Guinean Kina : ");
			k = sc.nextFloat();
			System.out.println("Rupees = " + k *   22);
		}
		else if(p.equals("NewZealand"))
		{
			System.out.print("Enter the New Zealand Dolla : ");
			k = sc.nextFloat();
			System.out.println("Rupees = " + k *  51 );
		}
		else if(p.equals("Pacific-Island-Nations"))
		{
			System.out.print("Enter the Australian Dollar : ");
			k = sc.nextFloat();
			System.out.println("Rupees = " + k *  55);
		}
		else
		{
			System.out.println("No Such Country in Australia");
		}
		break;
		default :
			System.out.print("No such Continent Exist");
	}
	}
}
