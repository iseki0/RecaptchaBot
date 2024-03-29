@file:Suppress("RemoveExplicitTypeArguments", "DuplicatedCode", "unused", "SpellCheckingInspection")

package api.func

import ApiContext
import api.PinChatMessageResult
import api.sendRequest
import api.sendRequestAwait
import api.sendRequestCallback
import io.vertx.core.AsyncResult
import io.vertx.core.Future

/**
 * Use this method to pin a message in a group, a supergroup, or a channel. The bot must be an administrator in the chat for this to work and must have the ‘can_pin_messages’ admin right in the supergroup or ‘can_edit_messages’ admin right in the channel. Returns *True* on success.
 *
 * @param[chatId] Unique identifier for the target chat or username of the target channel (in the format `@channelusername`)
 * @param[messageId] Identifier of a message to pin
 * @param[disableNotification] Pass *True*, if it is not necessary to send a notification to all chat members about the new pinned message. Notifications are always disabled in channels.
 */
fun ApiContext.pinChatMessage(
    chatId: String,
    messageId: Int,
    disableNotification: Boolean? = null
): Future<PinChatMessageResult?> = sendRequest<PinChatMessageResult?>(
    "pinChatMessage",
    listOf(Pair("chat_id", chatId), Pair("message_id", messageId), Pair("disable_notification", disableNotification))
)

fun ApiContext.pinChatMessage(
    chatId: String,
    messageId: Int,
    disableNotification: Boolean? = null,
    callback: (result: AsyncResult<PinChatMessageResult?>) -> Unit
): ApiContext = sendRequestCallback<PinChatMessageResult?>(
    "pinChatMessage",
    listOf(Pair("chat_id", chatId), Pair("message_id", messageId), Pair("disable_notification", disableNotification)),
    callback
)

suspend fun ApiContext.pinChatMessageAwait(
    chatId: String,
    messageId: Int,
    disableNotification: Boolean? = null
): PinChatMessageResult? = sendRequestAwait<PinChatMessageResult?>(
    "pinChatMessage",
    listOf(Pair("chat_id", chatId), Pair("message_id", messageId), Pair("disable_notification", disableNotification))
)