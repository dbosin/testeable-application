package com.acme.app



import grails.test.mixin.*
import org.junit.*

/**
 * See the API for {@link grails.test.mixin.web.ControllerUnitTestMixin} for usage instructions
 */
@TestFor(SimpleController)
class SimpleControllerTests {
	/*
    void testSomething() {
       fail "Implement me"
    }*/

    void testHello() {
	    controller.hello()
	    assert response.text == 'hello'
	}
}




