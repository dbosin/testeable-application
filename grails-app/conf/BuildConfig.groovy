grails.servlet.version = "2.5" // Change depending on target container compliance (2.5 or 3.0)
grails.project.class.dir = "target/classes"
grails.project.test.class.dir = "target/test-classes"
grails.project.test.reports.dir = "target/test-reports"
grails.project.target.level = 1.6
grails.project.source.level = 1.6
//grails.project.war.file = "target/${appName}-${appVersion}.war"

grails.project.dependency.resolution = {
    // inherit Grails' default dependencies
    inherits("global") {
        // specify dependency exclusions here; for example, uncomment this to disable ehcache:
        // excludes 'ehcache'
    }
    log "warn" // log level of Ivy resolver, either 'error', 'warn', 'info', 'debug' or 'verbose'
    checksums true // Whether to verify checksums on resolve

    repositories {
        inherits true // Whether to inherit repository definitions from plugins

        flatDir name:'localLibs', dirs:'lib'
        grailsHome()
        mavenLocal()
        grailsPlugins()
        grailsCentral()
        mavenCentral()
        mavenRepo "http://git.ml.com:8081/nexus/content/groups/Arquitectura"
        mavenRepo "http://git.ml.com:8081/nexus/content/repositories/MLGrailsPlugins"
        mavenRepo "http://git.ml.com:8081/nexus/content/groups/ML"
        mavenRepo "http://git.ml.com:8081/nexus/content/groups/public"
        mavenRepo "http://www.ibiblio.org/maven/mule/dependencies/maven2"
        mavenRepo "http://mirrors.ibiblio.org/pub/mirrors/maven2"
        mavenRepo "http://repo.grails.org/grails/plugins-releases"
        mavenRepo "http://git.ml.com:8081/nexus/content/repositories/MLGrailsPlugins"        

        // uncomment these (or add new ones) to enable remote dependency resolution from public Maven repositories
        //mavenRepo "http://snapshots.repository.codehaus.org"
        //mavenRepo "http://repository.codehaus.org"
        //mavenRepo "http://download.java.net/maven/2/"
        //mavenRepo "http://repository.jboss.com/maven2/"
    }
    dependencies {
        // specify dependencies here under either 'build', 'compile', 'runtime', 'test' or 'provided' scopes eg.


    }

    plugins {
        runtime ":hibernate:$grailsVersion"
        runtime ":jquery:1.8.0"
        runtime ":resources:1.1.6"

        // Uncomment these (or add new ones) to enable additional resources capabilities
        //runtime ":zipped-resources:1.0"
        //runtime ":cached-resources:1.0"
        //runtime ":yui-minify-resources:0.1.4"

        build ":tomcat:$grailsVersion"

        runtime ":database-migration:1.1"

        compile ':cache:1.0.0'

//        compile ':code-coverage:2.0.3-3',{
//            excludes 'xercesImpl'    
//        }
        //test ':code-coverage:1.2.7'
    }
}
