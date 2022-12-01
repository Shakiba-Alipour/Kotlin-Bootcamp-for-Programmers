open class Book(){
    var title : String
    var author : String
    override var currentPage : int = 0

    open fun readPage(){
        currentPage += 1
    }
}

class eBook() : Book(){
    var format : String = "text"
    override var currentPage : int = 0

    override fun readPage(){
        currentPage += 250
    }
}
