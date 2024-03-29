@file:Suppress("RemoveExplicitTypeArguments", "DuplicatedCode", "unused", "SpellCheckingInspection")

package api.func

import ApiContext
import api.*
import api.type.Message
import io.vertx.core.AsyncResult
import io.vertx.core.Future

/**
 * Use this method to send a native poll. A native poll can't be sent to a private chat. On success, the sent [Message][Message] is returned.
 *
 * @param[chatId] Unique identifier for the target chat or username of the target channel (in the format `@channelusername`). A native poll can't be sent to a private chat.
 * @param[question] Poll question, 1-255 characters
 * @param[options] List of answer options, 2-10 strings 1-100 characters each
 * @param[disableNotification] Sends the message [silently](https://telegram.org/blog/channels-2-0#silent-messages). Users will receive a notification with no sound.
 * @param[replyToMessageId] If the message is a reply, ID of the original message
 * @param[replyMarkup] Additional interface options. A JSON-serialized object for an [inline keyboard](https://core.telegram.org/bots#inline-keyboards-and-on-the-fly-updating), [custom reply keyboard](https://core.telegram.org/bots#keyboards), instructions to remove reply keyboard or to force a reply from the user.
 */
fun ApiContext.sendPoll(
    chatId: String,
    question: String,
    options: List<String>,
    disableNotification: Boolean? = null,
    replyToMessageId: Int? = null,
    replyMarkup: ReplyMarkup? = null
): Future<SendPollResult?> = sendRequest<SendPollResult?>(
    "sendPoll",
    listOf(
        Pair("chat_id", chatId),
        Pair("question", question),
        Pair("options", options),
        Pair("disable_notification", disableNotification),
        Pair("reply_to_message_id", replyToMessageId),
        Pair("reply_markup", replyMarkup)
    )
)

fun ApiContext.sendPoll(
    chatId: String,
    question: String,
    options: List<String>,
    disableNotification: Boolean? = null,
    replyToMessageId: Int? = null,
    replyMarkup: ReplyMarkup? = null,
    callback: (result: AsyncResult<SendPollResult?>) -> Unit
): ApiContext = sendRequestCallback<SendPollResult?>(
    "sendPoll",
    listOf(
        Pair("chat_id", chatId),
        Pair("question", question),
        Pair("options", options),
        Pair("disable_notification", disableNotification),
        Pair("reply_to_message_id", replyToMessageId),
        Pair("reply_markup", replyMarkup)
    ),
    callback
)

suspend fun ApiContext.sendPollAwait(
    chatId: String,
    question: String,
    options: List<String>,
    disableNotification: Boolean? = null,
    replyToMessageId: Int? = null,
    replyMarkup: ReplyMarkup? = null
): SendPollResult? = sendRequestAwait<SendPollResult?>(
    "sendPoll",
    listOf(
        Pair("chat_id", chatId),
        Pair("question", question),
        Pair("options", options),
        Pair("disable_notification", disableNotification),
        Pair("reply_to_message_id", replyToMessageId),
        Pair("reply_markup", replyMarkup)
    )
)