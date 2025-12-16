package com.avito.android.messenger.conversation.mvi.messages;

import android.net.Uri;
import android.webkit.MimeTypeMap;
import com.avito.android.R;
import com.avito.android.messenger.conversation.adapter.quote.QuoteViewData;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.messenger.message.MessageBody;
import com.avito.android.remote.model.messenger.message.Quote;
import com.avito.android.remote.model.messenger.video.VideoInfo;
import com.avito.android.remote.model.messenger.video.VideoStatus;
import j.InterfaceC42165v;
import java.util.Map;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: QuoteViewDataConverter.kt */
@androidx.compose.runtime.internal.P
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/messages/x0;", "", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class x0 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.util.text.a f193650a;

    @Inject
    public x0(@Y61.k com.avito.android.util.text.a aVar) {
        this.f193650a = aVar;
    }

    public static QuoteViewData.ImageType b(@InterfaceC42165v int i12, Image image) {
        if (image != null) {
            if (image.getVariants().isEmpty()) {
                image = null;
            }
            if (image != null) {
                return new QuoteViewData.ImageType.Image(image);
            }
        }
        return new QuoteViewData.ImageType.Static(i12);
    }

    @Y61.k
    public final QuoteViewData a(@Y61.k String str, @Y61.k Quote quote, @Y61.k Map<String, VideoInfo> map) {
        QuoteViewData.TextType res;
        QuoteViewData.TextType plain;
        QuoteViewData.ImageType imageTypeB;
        QuoteViewData.TextType plain2;
        String priceString;
        QuoteViewData.ImageType imageTypeB2;
        QuoteViewData.TextType attributed;
        QuoteViewData.TextType res2;
        boolean z12;
        QuoteViewData.ImageType imageFromUri;
        String thumbnailUrl;
        QuoteViewData.ImageType imageFromUri2;
        QuoteViewData.Style style;
        String str2;
        boolean z13;
        boolean z14;
        String thumbnailUrl2;
        MessageBody body = quote.getBody();
        QuoteViewData.Style style2 = QuoteViewData.Style.Regular.f189278b;
        String extensionFromMimeType = null;
        if (body instanceof MessageBody.ImageBody) {
            plain = new QuoteViewData.TextType.Res(R.string.message_body_description_image_full);
            imageTypeB = b(R.drawable.ic_messenger_image_placeholder_24, ((MessageBody.ImageBody) body).getImage());
        } else {
            if (!(body instanceof MessageBody.ImageReference)) {
                if (!(body instanceof MessageBody.LocalImage)) {
                    if (!(body instanceof MessageBody.Text)) {
                        if (body instanceof MessageBody.Item) {
                            MessageBody.Item item = (MessageBody.Item) body;
                            plain2 = new QuoteViewData.TextType.Plain(item.getTitle());
                            priceString = item.getPrice();
                            imageTypeB2 = b(R.drawable.ic_messenger_item_rich_24, item.getImage());
                        } else if (body instanceof MessageBody.ItemReference) {
                            plain = new QuoteViewData.TextType.Res(R.string.message_body_description_item);
                            imageTypeB = new QuoteViewData.ImageType.Static(R.drawable.ic_messenger_item_rich_24);
                        } else if (body instanceof MessageBody.AppCall) {
                            res = new QuoteViewData.TextType.Plain(((MessageBody.AppCall) body).getText());
                        } else if (body instanceof MessageBody.Call) {
                            res = ((MessageBody.Call) body).isIncoming() ? new QuoteViewData.TextType.Res(R.string.message_body_description_incoming_call) : new QuoteViewData.TextType.Res(R.string.message_body_description_outgoing_call);
                        } else if (body instanceof MessageBody.Deleted) {
                            res = new QuoteViewData.TextType.Res(R.string.message_body_description_deleted);
                            style2 = QuoteViewData.Style.Gray.f189277b;
                        } else {
                            if (body instanceof MessageBody.Video) {
                                res2 = new QuoteViewData.TextType.Res(R.string.message_body_description_video);
                                String videoId = ((MessageBody.Video) body).getVideoId();
                                VideoInfo videoInfo = videoId != null ? map.get(videoId) : null;
                                Uri uri = (videoInfo == null || (thumbnailUrl2 = videoInfo.getThumbnailUrl()) == null) ? null : Uri.parse(thumbnailUrl2);
                                z12 = kotlin.jvm.internal.L.f(videoInfo != null ? videoInfo.getStatus() : null, VideoStatus.Uploaded.INSTANCE) && uri != null;
                                imageFromUri = uri != null ? new QuoteViewData.ImageType.ImageFromUri(uri) : new QuoteViewData.ImageType.Static(R.drawable.ic_messenger_video_24);
                            } else if (body instanceof MessageBody.File) {
                                MessageBody.File file = (MessageBody.File) body;
                                plain = new QuoteViewData.TextType.Plain(file.getName());
                                extensionFromMimeType = MimeTypeMap.getSingleton().getExtensionFromMimeType(file.getMimeType());
                                imageTypeB = new QuoteViewData.ImageType.Static(R.drawable.ic_messenger_file_placeholder_24);
                            } else if (body instanceof MessageBody.Link) {
                                plain = new QuoteViewData.TextType.Plain(((MessageBody.Link) body).getUrl());
                                imageTypeB = new QuoteViewData.ImageType.Static(R.drawable.ic_messenger_link_placeholder_24);
                            } else {
                                if (!(body instanceof MessageBody.Location)) {
                                    if (body instanceof MessageBody.SystemMessageBody.Platform) {
                                        Integer chunkIndex = quote.getChunkIndex();
                                        int iIntValue = chunkIndex != null ? chunkIndex.intValue() : 0;
                                        MessageBody.SystemMessageBody.Platform platform = (MessageBody.SystemMessageBody.Platform) body;
                                        if (iIntValue < platform.getChunks().size()) {
                                            MessageBody.SystemMessageBody.Platform.Bubble bubble = platform.getChunks().get(iIntValue);
                                            if (!(bubble instanceof MessageBody.SystemMessageBody.Platform.Bubble.Video)) {
                                                if (bubble instanceof MessageBody.SystemMessageBody.Platform.Bubble.Text) {
                                                    attributed = new QuoteViewData.TextType.Attributed(this.f193650a.d(((MessageBody.SystemMessageBody.Platform.Bubble.Text) bubble).getText()));
                                                    style = style2;
                                                    str2 = null;
                                                    imageFromUri2 = null;
                                                    z13 = false;
                                                    z14 = false;
                                                    G0 g02 = G0.f406611a;
                                                    return new QuoteViewData(str, attributed, str2, z13, style, imageFromUri2, z14, quote);
                                                }
                                                if (bubble instanceof MessageBody.SystemMessageBody.Platform.Bubble.GeoLocation) {
                                                    plain = new QuoteViewData.TextType.Plain(((MessageBody.SystemMessageBody.Platform.Bubble.GeoLocation) bubble).getTitle());
                                                    imageTypeB = new QuoteViewData.ImageType.Static(R.drawable.ic_messenger_location_placeholder_24);
                                                } else if (bubble instanceof MessageBody.SystemMessageBody.Platform.Bubble.Item) {
                                                    MessageBody.SystemMessageBody.Platform.Bubble.Item item2 = (MessageBody.SystemMessageBody.Platform.Bubble.Item) bubble;
                                                    plain2 = new QuoteViewData.TextType.Plain(item2.getTitle());
                                                    priceString = item2.getPriceString();
                                                    imageTypeB2 = b(R.drawable.ic_messenger_item_rich_24, item2.getImageBySizes());
                                                } else if (bubble instanceof MessageBody.SystemMessageBody.Platform.Bubble.Image) {
                                                    plain = new QuoteViewData.TextType.Res(R.string.message_body_description_image_full);
                                                    imageTypeB = b(R.drawable.ic_messenger_image_placeholder_24, ((MessageBody.SystemMessageBody.Platform.Bubble.Image) bubble).getImage());
                                                } else {
                                                    if (!(bubble instanceof MessageBody.SystemMessageBody.Platform.Bubble.File)) {
                                                        throw new NoWhenBranchMatchedException();
                                                    }
                                                    plain = new QuoteViewData.TextType.Plain(((MessageBody.SystemMessageBody.Platform.Bubble.File) bubble).getName());
                                                    imageTypeB = new QuoteViewData.ImageType.Static(R.drawable.ic_messenger_file_placeholder_24);
                                                }
                                                attributed = plain;
                                                imageFromUri2 = imageTypeB;
                                                style = style2;
                                                str2 = extensionFromMimeType;
                                                z13 = false;
                                                z14 = false;
                                                G0 g022 = G0.f406611a;
                                                return new QuoteViewData(str, attributed, str2, z13, style, imageFromUri2, z14, quote);
                                            }
                                            res2 = new QuoteViewData.TextType.Res(R.string.message_body_description_video);
                                            String videoId2 = ((MessageBody.SystemMessageBody.Platform.Bubble.Video) bubble).getVideoId();
                                            VideoInfo videoInfo2 = videoId2 != null ? map.get(videoId2) : null;
                                            Uri uri2 = (videoInfo2 == null || (thumbnailUrl = videoInfo2.getThumbnailUrl()) == null) ? null : Uri.parse(thumbnailUrl);
                                            z12 = kotlin.jvm.internal.L.f(videoInfo2 != null ? videoInfo2.getStatus() : null, VideoStatus.Uploaded.INSTANCE) && uri2 != null;
                                            imageFromUri = uri2 != null ? new QuoteViewData.ImageType.ImageFromUri(uri2) : new QuoteViewData.ImageType.Static(R.drawable.ic_messenger_video_24);
                                        } else {
                                            res = new QuoteViewData.TextType.Res(R.string.messenger_quote_msg_is_not_supported);
                                            style2 = QuoteViewData.Style.Gray.f189277b;
                                        }
                                    } else if (body instanceof MessageBody.SystemMessageBody.Text) {
                                        res = new QuoteViewData.TextType.Plain(((MessageBody.SystemMessageBody.Text) body).getText());
                                    } else if (body instanceof MessageBody.Voice) {
                                        res = new QuoteViewData.TextType.Res(R.string.message_body_description_voice);
                                    } else {
                                        if (!(body instanceof MessageBody.SystemMessageBody.Unknown ? true : body instanceof MessageBody.Unknown)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        res = new QuoteViewData.TextType.Res(R.string.messenger_quote_msg_is_not_supported);
                                        style2 = QuoteViewData.Style.Gray.f189277b;
                                    }
                                    attributed = res;
                                    style = style2;
                                    str2 = null;
                                    imageFromUri2 = null;
                                    z13 = false;
                                    z14 = false;
                                    G0 g0222 = G0.f406611a;
                                    return new QuoteViewData(str, attributed, str2, z13, style, imageFromUri2, z14, quote);
                                }
                                plain = new QuoteViewData.TextType.Plain(((MessageBody.Location) body).getTitle());
                                imageTypeB = new QuoteViewData.ImageType.Static(R.drawable.ic_messenger_location_placeholder_24);
                            }
                            imageFromUri2 = imageFromUri;
                            style = style2;
                            attributed = res2;
                            str2 = null;
                            z13 = false;
                            z14 = z12;
                        }
                        attributed = plain2;
                        imageFromUri2 = imageTypeB2;
                        style = style2;
                        str2 = priceString;
                        z14 = false;
                        z13 = true;
                        G0 g02222 = G0.f406611a;
                        return new QuoteViewData(str, attributed, str2, z13, style, imageFromUri2, z14, quote);
                    }
                    res = new QuoteViewData.TextType.Plain(((MessageBody.Text) body).getText());
                    attributed = res;
                    style = style2;
                    str2 = null;
                    imageFromUri2 = null;
                    z13 = false;
                    z14 = false;
                    G0 g022222 = G0.f406611a;
                    return new QuoteViewData(str, attributed, str2, z13, style, imageFromUri2, z14, quote);
                }
                QuoteViewData.TextType res3 = new QuoteViewData.TextType.Res(R.string.message_body_description_image_full);
                Uri source = ((MessageBody.LocalImage) body).getSource();
                attributed = res3;
                style = style2;
                imageFromUri2 = source != null ? new QuoteViewData.ImageType.ImageFromUri(source) : new QuoteViewData.ImageType.Static(R.drawable.ic_messenger_image_placeholder_24);
                str2 = null;
                z13 = false;
                z14 = false;
                G0 g0222222 = G0.f406611a;
                return new QuoteViewData(str, attributed, str2, z13, style, imageFromUri2, z14, quote);
            }
            plain = new QuoteViewData.TextType.Res(R.string.message_body_description_image_full);
            imageTypeB = new QuoteViewData.ImageType.Static(R.drawable.ic_messenger_image_placeholder_24);
        }
        attributed = plain;
        imageFromUri2 = imageTypeB;
        style = style2;
        str2 = extensionFromMimeType;
        z13 = false;
        z14 = false;
        G0 g02222222 = G0.f406611a;
        return new QuoteViewData(str, attributed, str2, z13, style, imageFromUri2, z14, quote);
    }
}
