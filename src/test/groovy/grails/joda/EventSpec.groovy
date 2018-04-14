package grails.joda

import grails.testing.gorm.DataTest
import grails.testing.services.ServiceUnitTest
import spock.lang.Specification

class EventSpec extends Specification implements ServiceUnitTest<EventService>, DataTest {

    Class[] getDomainClassesToMock() {
        [Event]
    }

    void "test something"() {
        when:
        service.find()

        then:
        false
    }
}
