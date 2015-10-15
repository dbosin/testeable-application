import java.io.File;
import java.util.List;

import groovy.xml.MarkupBuilder
import org.apache.tools.ant.types.Path
import org.codehaus.groovy.grails.commons.GrailsClassUtils
import groovy.util.AntBuilder;

class BootStrap {

	public saveDataFileThread(){
		def reportThread = new Thread() {
			public void run() {
				while(true){
					println "STARTING DATAFILE SAVING THREAD....."
					Thread.sleep(30000)
					try {
						println "TRYING TO SAVE COVERAGE"
						String className = "net.sourceforge.cobertura.coveragedata.ProjectData";
						String methodName = "saveGlobalProjectData";
						Class saveClass = Class.forName(className);
						java.lang.reflect.Method saveMethod = saveClass.getDeclaredMethod(methodName, new Class[0]);
						saveMethod.invoke(null, new Object[0]);
					}
					catch(Throwable t) {
						println "EXCEPTION WRITING COVERAGE FILE"
						println t
					}
					println "ENDING DATAFILE SAVING THREAD....."
				}
			}
		}
		
		reportThread.start();
	}

    def init = { servletContext ->
    	this.saveDataFileThread()
    }

    def destroy = {
    }
}
