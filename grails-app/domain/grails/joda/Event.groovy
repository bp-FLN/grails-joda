package grails.joda

import org.jadira.usertype.dateandtime.joda.PersistentDateTime
import org.joda.time.DateTime

class Event {

    DateTime dateCreated

    static mapping = {
        dateCreated type: PersistentDateTime
    }

    static constraints = {
    }
}
