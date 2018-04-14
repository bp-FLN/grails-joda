grails.gorm.default.mapping = {
    "user-type" type: org.jadira.usertype.dateandtime.joda.PersistentDateTime, class: org.joda.time.DateTime
    "user-type" type: org.jadira.usertype.dateandtime.joda.PersistentLocalDate, class: org.joda.time.LocalDate
//    "user-type" type: org.joda.time.contrib.hibernate.PersistentDateTime, class: org.joda.time.DateTime
//    "user-type" type: org.joda.time.contrib.hibernate.PersistentLocalDate, class: org.joda.time.LocalDate

//    'user-type'(type: PersistentDateTime, class: DateTime)
//    'user-type'(type: PersistentLocalDate, class: LocalDate)
//    'user-type'(type: PersistentLocalDateTime, class: LocalDateTime)
//    'user-type'(type: PersistentLocalTime, class: LocalTime)
//    'user-type'(type: PersistentPeriodAsString, class: Period)

//    '*'(accessType: javax.persistence.AccessType.PROPERTY)
}
