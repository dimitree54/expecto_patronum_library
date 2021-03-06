package we.rashchenko.patronum.hotel

import we.rashchenko.patronum.wishes.Wish

class WishRoom(
    val id: String,
    val telegramChatId: Long,
    val wish: Wish
) {
    private var languageCodes = mutableSetOf<String>()
    var finished = false
    var canceledByAuthor = false
    var canceledByPatron = false
    var reportedByAuthor = false
    var reportedByPatron = false
    val closed: Boolean
        get() = finished || canceledByAuthor || canceledByPatron || reportedByAuthor || reportedByPatron

    fun addLanguageCode(languageCode: String) {
        languageCodes.add(languageCode)
    }
    fun getLanguageCodes(): Set<String> {
        return languageCodes.toSet()
    }
}