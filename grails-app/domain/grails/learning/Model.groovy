package grails.learning

class Model {

    String name
    
    static belongsTo = [make: Make]

    static constraints = {
        name maxSize: 256
    }
}
