@file:Suppress("RemoveExplicitTypeArguments", "DuplicatedCode", "unused", "SpellCheckingInspection")

package api.func

import ApiContext
import api.*
import api.type.InlineKeyboardMarkup
import api.type.Message
import io.vertx.core.AsyncResult
import io.vertx.core.Future

/**
 * Use this method to stop updating a live location message before *live_period* expires. On success, if the message was sent by the bot, the sent [Message][Message] is returned, otherwise *True* is returned.
 *
 * @param[chatId] Required if *inline_message_id* is not specified. Unique identifier for the target chat or username of the target channel (in the format `@channelusername`)
 * @param[messageId] Required if *inline_message_id* is not specified. Identifier of the message with live location to stop
 * @param[inlineMessageId] Required if *chat_id* and *message_id* are not specified. Identifier of the inline message
 * @param[replyMarkup] A JSON-serialized object for a new [inline keyboard](https://core.telegram.org/bots#inline-keyboards-and-on-the-fly-updating).
 */
fun ApiContext.stopMessageLiveLocation(
    chatId: String,
    messageId: Int? = null,
    inlineMessageId: String? = null,
    replyMarkup: InlineKeyboardMarkup? = null
): Future<StopMessageLiveLocationResultMessage?> = sendRequest<StopMessageLiveLocationResultMessage?>(
    "stopMessageLiveLocation",
    listOf(
        Pair("chat_id", chatId),
        Pair("message_id", messageId),
        Pair("inline_message_id", inlineMessageId),
        Pair("reply_markup", replyMarkup)
    )
)

fun ApiContext.stopMessageLiveLocation(
    chatId: String,
    messageId: Int? = null,
    inlineMessageId: String? = null,
    replyMarkup: InlineKeyboardMarkup? = null,
    callback: (result: AsyncResult<StopMessageLiveLocationResultMessage?>) -> Unit
): ApiContext = sendRequestCallback<StopMessageLiveLocationResultMessage?>(
    "stopMessageLiveLocation",
    listOf(
        Pair("chat_id", chatId),
        Pair("message_id", messageId),
        Pair("inline_message_id", inlineMessageId),
        Pair("reply_markup", replyMarkup)
    ),
    callback
)

suspend fun ApiContext.stopMessageLiveLocationAwait(
    chatId: String,
    messageId: Int? = null,
    inlineMessageId: String? = null,
    replyMarkup: InlineKeyboardMarkup? = null
): StopMessageLiveLocationResultMessage? = sendRequestAwait<StopMessageLiveLocationResultMessage?>(
    "stopMessageLiveLocation",
    listOf(
        Pair("chat_id", chatId),
        Pair("message_id", messageId),
        Pair("inline_message_id", inlineMessageId),
        Pair("reply_markup", replyMarkup)
    )
)

fun ApiContext.stopMessageLiveLocation(
    messageId: Int? = null,
    inlineMessageId: String? = null,
    replyMarkup: InlineKeyboardMarkup? = null
): Future<StopMessageLiveLocationResultBoolean?> = sendRequest<StopMessageLiveLocationResultBoolean?>(
    "stopMessageLiveLocation",
    listOf(Pair("message_id", messageId), Pair("inline_message_id", inlineMessageId), Pair("reply_markup", replyMarkup))
)

fun ApiContext.stopMessageLiveLocation(
    messageId: Int? = null,
    inlineMessageId: String? = null,
    replyMarkup: InlineKeyboardMarkup? = null,
    callback: (result: AsyncResult<StopMessageLiveLocationResultBoolean?>) -> Unit
): ApiContext = sendRequestCallback<StopMessageLiveLocationResultBoolean?>(
    "stopMessageLiveLocation",
    listOf(
        Pair("message_id", messageId),
        Pair("inline_message_id", inlineMessageId),
        Pair("reply_markup", replyMarkup)
    ),
    callback
)

suspend fun ApiContext.stopMessageLiveLocationAwait(
    messageId: Int? = null,
    inlineMessageId: String? = null,
    replyMarkup: InlineKeyboardMarkup? = null
): StopMessageLiveLocationResultBoolean? = sendRequestAwait<StopMessageLiveLocationResultBoolean?>(
    "stopMessageLiveLocation",
    listOf(Pair("message_id", messageId), Pair("inline_message_id", inlineMessageId), Pair("reply_markup", replyMarkup))
)