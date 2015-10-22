1) cp -r grails-app/controllers/ src/
2) grails run-app
3) Navegar la aplicación
4) Esperar que actualice el cobertura.ser
5) cp cobertura.ser target/
5) ant -buildfile coverage-report-anttask.xml generate.report
6) acceder a testeable-application/cobertura/index.html