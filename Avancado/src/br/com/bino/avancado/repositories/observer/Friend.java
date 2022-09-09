package br.com.bino.avancado.repositories.observer;

import br.com.bino.avancado.ifaces.observer.Observer;

public class Friend implements Observer {

	public void partyTime() {
		System.out.println("Friend said: Hello brother!! Congratulations!!");
	}
	
	@Override
	public void update(boolean status) {
		if(status) {
			partyTime();
		}else {
			System.out.println("Ooo shet :\\ !!!");
		}
	}
	
}
