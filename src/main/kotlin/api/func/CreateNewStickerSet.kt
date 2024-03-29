@file:Suppress("RemoveExplicitTypeArguments", "DuplicatedCode", "unused", "SpellCheckingInspection")

package api.func

import ApiContext
import api.*
import api.type.MaskPosition
import io.vertx.core.AsyncResult
import io.vertx.core.Future

/**
 * Use this method to create new sticker set owned by a user. The bot will be able to edit the created sticker set. Returns *True* on success.
 *
 * @param[userId] User identifier of created sticker set owner
 * @param[name] Short name of sticker set, to be used in `t.me/addstickers/` URLs (e.g., *animals*). Can contain only english letters, digits and underscores. Must begin with a letter, can't contain consecutive underscores and must end in *“_by_&lt;bot username&gt;”*. *&lt;bot_username&gt;* is case insensitive. 1-64 characters.
 * @param[title] Sticker set title, 1-64 characters
 * @param[pngSticker] **Png** image with the sticker, must be up to 512 kilobytes in size, dimensions must not exceed 512px, and either width or height must be exactly 512px. Pass a *file_id* as a String to send a file that already exists on the Telegram servers, pass an HTTP URL as a String for Telegram to get a file from the Internet, or upload a new one using multipart/form-data. [More info on Sending Files »](https://core.telegram.org#sending-files)
 * @param[emojis] One or more emoji corresponding to the sticker
 * @param[containsMasks] Pass *True*, if a set of mask stickers should be created
 * @param[maskPosition] A JSON-serialized object for position where the mask should be placed on faces
 */
fun ApiContext.createNewStickerSet(
    userId: Int,
    name: String,
    title: String,
    pngSticker: InputFile,
    emojis: String,
    containsMasks: Boolean? = null,
    maskPosition: MaskPosition? = null
): Future<CreateNewStickerSetResult?> = sendRequest<CreateNewStickerSetResult?>(
    "createNewStickerSet",
    listOf(
        Pair("user_id", userId),
        Pair("name", name),
        Pair("title", title),
        Pair("png_sticker", pngSticker),
        Pair("emojis", emojis),
        Pair("contains_masks", containsMasks),
        Pair("mask_position", maskPosition)
    )
)

fun ApiContext.createNewStickerSet(
    userId: Int,
    name: String,
    title: String,
    pngSticker: InputFile,
    emojis: String,
    containsMasks: Boolean? = null,
    maskPosition: MaskPosition? = null,
    callback: (result: AsyncResult<CreateNewStickerSetResult?>) -> Unit
): ApiContext = sendRequestCallback<CreateNewStickerSetResult?>(
    "createNewStickerSet",
    listOf(
        Pair("user_id", userId),
        Pair("name", name),
        Pair("title", title),
        Pair("png_sticker", pngSticker),
        Pair("emojis", emojis),
        Pair("contains_masks", containsMasks),
        Pair("mask_position", maskPosition)
    ),
    callback
)

suspend fun ApiContext.createNewStickerSetAwait(
    userId: Int,
    name: String,
    title: String,
    pngSticker: InputFile,
    emojis: String,
    containsMasks: Boolean? = null,
    maskPosition: MaskPosition? = null
): CreateNewStickerSetResult? = sendRequestAwait<CreateNewStickerSetResult?>(
    "createNewStickerSet",
    listOf(
        Pair("user_id", userId),
        Pair("name", name),
        Pair("title", title),
        Pair("png_sticker", pngSticker),
        Pair("emojis", emojis),
        Pair("contains_masks", containsMasks),
        Pair("mask_position", maskPosition)
    )
)