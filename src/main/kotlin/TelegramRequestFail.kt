class TelegramRequestFail(val errorCode: Int, val description: String) :
    RuntimeException("""[$errorCode]: $description""")