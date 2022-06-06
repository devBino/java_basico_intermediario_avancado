package br.com.bino.avancado.repositories.factory.showfiles;

import br.com.bino.avancado.abstracts.showfiledir.AbstractShowFileDir;

public class ShowFileDirSimpleFactory {

	public static AbstractShowFileDir getDomonstrator() {
		
		AbstractShowFileDir abstractShowFileDir = null;
		
		if( System.getProperty("os.name").contains("Windows") ) {
			
			abstractShowFileDir = new ShowFileDirWindows();
			
		}else if( System.getProperty("os.name").contains("Linux") ) {
			
			abstractShowFileDir = new ShowFileDirLinux();
			
		}
		
		return abstractShowFileDir;
		
	}
	
}
