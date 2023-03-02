package edu.eci.arsw.blacklistvalidator;

import edu.eci.arsw.spamkeywordsdatasource.HostBlacklistsDataSourceFacade;

public class  ParalThread extends Thread{

	private static int checkedListsCount;
	private int inicio;
	private int fin;
	private HostBlacklistsDataSourceFacade skds;
	private Object ipaddress;
	
	
	public ParalThread(int inicio,int fin,HostBlacklistsDataSourceFacade skds,String ipaddress) {
		this.inicio = inicio;
		this.fin = fin;
		this.skds = skds;
		this.ipaddress = ipaddress;
	
		
	}
	
	
	@Override 
	public void run(){
		for (int i=inicio;i<fin && ocurrencesCount<BLACK_LIST_ALARM_COUNT;i++){
	        checkedListsCount++;
	        
	        if (skds.isInBlackListServer(i, ipaddress)){
	            
	            blackListOcurrences.add(i);
	            
	            ocurrencesCount++;
	        }
	    }
	}
}
