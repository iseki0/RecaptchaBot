@file:Suppress("RemoveExplicitTypeArguments", "DuplicatedCode", "unused", "SpellCheckingInspection")

package api.func

import ApiContext
import api.DeleteChatStickerSetResult
import api.sendRequest
import api.sendRequestAwait
import api.sendRequestCallback
import io.vertx.core.AsyncResult
import io.vertx.core.Future

/**
 * Use this method to delete a group sticker set from a supergroup. The bot must be an administrator in the chat for this to work and must have the appropriate admin rights. Use the field *can_set_sticker_set* optionally returned in [getChat][getChat] requests to check if the bot can use this method. Returns *True* on success.
 *
 * @param[chatId] Unique identifier for the target chat or username of the target supergroup (in the format `@supergroupusername`)
 */
fun ApiContext.deleteChatStickerSet(
    chatId: String
): Future<DeleteChatStickerSetResult?> =
    sendRequest<DeleteChatStickerSetResult?>("deleteChatStickerSet", listOf(Pair("chat_id", chatId)))

fun ApiContext.deleteChatStickerSet(
    chatId: String,
    callback: (result: AsyncResult<DeleteChatStickerSetResult?>) -> Unit
): ApiContext =
    sendRequestCallback<DeleteChatStickerSetResult?>("deleteChatStickerSet", listOf(Pair("chat_id", chatId)), callback)

suspend fun ApiContext.deleteChatStickerSetAwait(
    chatId: String
): DeleteChatStickerSetResult? =
    sendRequestAwait<DeleteChatStickerSetResult?>("deleteChatStickerSet", listOf(Pair("chat_id", chatId)))