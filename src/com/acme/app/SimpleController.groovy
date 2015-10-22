package com.acme.app

class SimpleController {

    def index() { 
    	render "hello index"
    	println "pasó por index controller"
    }

    def hello() {
    	render "hello"
    	println "pasó por hello controller"
    }

    def bye() {
    	render "bye"
    	println "pasó por bye controller"
    }

}
