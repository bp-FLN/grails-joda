package grails.joda

import grails.gorm.transactions.Transactional
import grails.joda.Event
import org.joda.time.DateTime

@Transactional
class EventService {

    def find() {
        Event.findByDateCreated(DateTime.now())
//        Event.createCriteria().list {
//            gt('dateCreated', DateTime.now())
//        }
    }

}
