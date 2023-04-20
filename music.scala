class Audio {
    var genre: String =" "
    var singer: String =" "

    def set_genre(g: String){
        genre = g
    }
    def set_singer(s: String){
        singer = s
    }
    def get_genre(): String ={
        return genre
    }
    def get_singer(): String ={
        return singer
    }

}
class Audio(genre: String, singer:String){

}