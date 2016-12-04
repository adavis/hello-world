package hello.world

class Book {

    String title
    String author
    String description
    String bookUrl
    String imageUrl
    String displayDate
    int numberOfPages

    static constraints = {
        title blank: false, unique: true
        author nullable: true
        description nullable: true, type: "text"
        bookUrl nullable: true
        imageUrl nullable: true
        displayDate nullable: true
        numberOfPages nullable: true
    }
}
