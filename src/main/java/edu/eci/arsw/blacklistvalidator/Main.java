package edu.eci.arsw.blacklistvalidator;

import java.util.List;

public class Main {

		public static void main(String args[]) {
			HostBlackListsValidator hblv=new HostBlackListsValidator();
	        List<Integer> blackListOcurrences=hblv.checkHost("200.24.34.55",2);
	        System.out.println("The host was found in the following blacklists:"+blackListOcurrences);
		}
}
