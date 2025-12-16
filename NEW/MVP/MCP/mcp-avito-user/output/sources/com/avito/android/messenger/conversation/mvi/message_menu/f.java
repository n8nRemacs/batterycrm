package com.avito.android.messenger.conversation.mvi.message_menu;

import android.content.Context;
import android.net.Uri;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.adjust.sdk.Constants;
import com.avito.android.messenger.conversation.T1;
import com.avito.android.messenger.conversation.mvi.message_menu.d;
import com.avito.android.messenger.conversation.mvi.message_menu.h;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.Size;
import com.avito.android.remote.model.messenger.message.LocalMessage;
import com.avito.android.remote.model.messenger.message.MessageBody;
import com.avito.android.util.C35809h6;
import com.avito.android.util.V2;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.s0;
import kotlin.text.C43066x;

/* compiled from: MessageContextDataFactory.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/message_menu/f;", "Lcom/avito/android/messenger/conversation/mvi/message_menu/e;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class f implements e {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Context f191741a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.util.text.a f191742b;

    @Inject
    public f(@Y61.k Context context, @Y61.k com.avito.android.util.text.a aVar) {
        this.f191741a = context;
        this.f191742b = aVar;
    }

    public static Integer b(LocalMessage localMessage, MessageBody.SystemMessageBody.Platform.Bubble bubble) {
        List<MessageBody.SystemMessageBody.Platform.Bubble> chunks;
        MessageBody body = localMessage.getBody();
        MessageBody.SystemMessageBody.Platform platform = body instanceof MessageBody.SystemMessageBody.Platform ? (MessageBody.SystemMessageBody.Platform) body : null;
        if (platform == null || (chunks = platform.getChunks()) == null) {
            return null;
        }
        return Integer.valueOf(chunks.indexOf(bubble));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v4, types: [com.avito.android.messenger.conversation.mvi.message_menu.d] */
    /* JADX WARN: Type inference failed for: r1v5, types: [com.avito.android.messenger.conversation.mvi.message_menu.d$g] */
    @Override // com.avito.android.messenger.conversation.mvi.message_menu.e
    @Y61.l
    public final d a(@Y61.k Y81.a aVar, @Y61.k T1.d.b bVar, @Y61.k LocalMessage localMessage, @Y61.l String str, boolean z12, boolean z13) {
        d aVar2;
        Object next;
        Object next2;
        d.c cVar;
        String strS = str;
        String[] strArr = C35809h6.f318898a;
        boolean z14 = false;
        if (strS != null) {
            int i12 = 0;
            while (true) {
                if (i12 >= 3) {
                    strS = AK.c.s(new StringBuilder(), strArr[0], strS);
                    break;
                }
                String str2 = strArr[i12];
                if (!C43066x.h0(strS, str2, true)) {
                    i12++;
                } else if (!strS.startsWith(str2)) {
                    StringBuilder sbR = H.r(str2);
                    sbR.append(strS.substring(str2.length()));
                    strS = sbR.toString();
                }
            }
            String str3 = strS;
            h.f191745j.getClass();
            h hVarA = h.a.a(localMessage);
            MessageBody body = localMessage.getBody();
            if (!(body instanceof MessageBody.Text)) {
                return body instanceof MessageBody.Link ? new d.C5661d(aVar, hVarA, str3, z12, null, z13, 16, null) : new d.e(aVar, hVarA, str3, z12, null, z13, 16, null);
            }
            List<MessageBody.Text.Chunk> chunks = ((MessageBody.Text) body).getChunks();
            return (chunks == null || chunks.size() != 1) ? new d.e(aVar, hVarA, str3, z12, null, z13, 16, null) : new d.C5661d(aVar, hVarA, str3, z12, null, z13, 16, null);
        }
        h.f191745j.getClass();
        h hVarA2 = h.a.a(localMessage);
        MessageBody f189194a = bVar.getF189194a();
        if (f189194a instanceof MessageBody.ItemReference) {
            MessageBody.ItemReference itemReference = (MessageBody.ItemReference) f189194a;
            cVar = new d.c(aVar, hVarA2, itemReference.getItemId(), new Uri.Builder().scheme(Constants.SCHEME).authority("avito.ru").appendPath(itemReference.getItemId()).toString(), z12, null, z13, 32, null);
        } else {
            if (!(f189194a instanceof MessageBody.Item)) {
                if (f189194a instanceof MessageBody.Link) {
                    MessageBody.Link link = (MessageBody.Link) f189194a;
                    if (!link.getUrlsAreTrusted()) {
                        return new d.h(aVar, hVarA2, link.getUrl(), false, z12, null, z13, 32, null);
                    }
                    String url = link.getUrl();
                    int i13 = 0;
                    while (true) {
                        if (i13 >= 3) {
                            url = AK.c.s(new StringBuilder(), strArr[0], url);
                            break;
                        }
                        String str4 = strArr[i13];
                        if (!C43066x.h0(url, str4, true)) {
                            i13++;
                        } else if (!url.startsWith(str4)) {
                            StringBuilder sbR2 = H.r(str4);
                            sbR2.append(url.substring(str4.length()));
                            url = sbR2.toString();
                        }
                    }
                    return new d.C5661d(aVar, hVarA2, url, z12, null, z13, 16, null);
                }
                if (f189194a instanceof MessageBody.ImageBody) {
                    Iterator it = ((MessageBody.ImageBody) f189194a).getImage().getVariants().entrySet().iterator();
                    if (it.hasNext()) {
                        next2 = it.next();
                        if (it.hasNext()) {
                            Size size = (Size) ((Map.Entry) next2).getKey();
                            int width = size.getWidth() * size.getHeight();
                            do {
                                Object next3 = it.next();
                                Size size2 = (Size) ((Map.Entry) next3).getKey();
                                int width2 = size2.getWidth() * size2.getHeight();
                                if (width < width2) {
                                    next2 = next3;
                                    width = width2;
                                }
                            } while (it.hasNext());
                        }
                    } else {
                        next2 = null;
                    }
                    Map.Entry entry = (Map.Entry) next2;
                    Uri uri = entry != null ? (Uri) entry.getValue() : null;
                    gVar = uri != null ? uri.toString() : null;
                    return new d.b(aVar, hVarA2, z12, null, gVar != null ? gVar : "", z13, 8, null);
                }
                if (f189194a instanceof MessageBody.LocalImage) {
                    return new d.f(aVar, hVarA2, z12, null, z13, 8, null);
                }
                if (f189194a instanceof MessageBody.Text) {
                    MessageBody.Text text = (MessageBody.Text) f189194a;
                    List<MessageBody.Text.Chunk> chunks2 = text.getChunks();
                    if (chunks2 == null) {
                        chunks2 = C42784z0.f406748b;
                    }
                    MessageBody.Text.Chunk chunk = (MessageBody.Text.Chunk) C42745f0.w0(chunks2);
                    boolean z15 = f189194a instanceof MessageBody.Text.Regular;
                    MessageBody.Text.Regular regular = (MessageBody.Text.Regular) (!z15 ? null : f189194a);
                    if ((regular != null && !regular.getUrlsAreTrusted()) || !(chunk instanceof MessageBody.Text.Chunk.Link)) {
                        String text2 = text.getText();
                        if (!z15) {
                            f189194a = null;
                        }
                        MessageBody.Text.Regular regular2 = (MessageBody.Text.Regular) f189194a;
                        if (regular2 != null && !regular2.getUrlsAreTrusted()) {
                            z14 = true;
                        }
                        return new d.h(aVar, hVarA2, text2, !z14, z12, null, z13, 32, null);
                    }
                    String text3 = text.getText();
                    int i14 = 0;
                    while (true) {
                        if (i14 >= 3) {
                            text3 = AK.c.s(new StringBuilder(), strArr[0], text3);
                            break;
                        }
                        String str5 = strArr[i14];
                        if (!C43066x.h0(text3, str5, true)) {
                            i14++;
                        } else if (!text3.startsWith(str5)) {
                            StringBuilder sbR3 = H.r(str5);
                            sbR3.append(text3.substring(str5.length()));
                            text3 = sbR3.toString();
                        }
                    }
                    return new d.C5661d(aVar, hVarA2, text3, z12, null, z13, 16, null);
                }
                if (f189194a instanceof MessageBody.Location) {
                    return new d.g(aVar, hVarA2, ((MessageBody.Location) f189194a).getTitle(), z12, null, z13, 16, null);
                }
                if (f189194a instanceof MessageBody.File) {
                    return new d.a(aVar, hVarA2, z12, null, z13, 8, null);
                }
                if (f189194a instanceof MessageBody.Video) {
                    return new d.i(aVar, hVarA2, z12, null, z13, 8, null);
                }
                if (f189194a instanceof MessageBody.Voice) {
                    return new d.j(aVar, hVarA2, z12, null, z13, 8, null);
                }
                MessageBody.SystemMessageBody.Platform.Bubble f189195a = bVar.getF189195a();
                if (f189195a instanceof MessageBody.SystemMessageBody.Platform.Bubble.Text) {
                    return new d.h(aVar, hVarA2, String.valueOf(this.f191742b.c(this.f191741a, ((MessageBody.SystemMessageBody.Platform.Bubble.Text) f189195a).getText())), true, z12, b(localMessage, f189195a), z13);
                }
                if (!(f189195a instanceof MessageBody.SystemMessageBody.Platform.Bubble.Image)) {
                    if (!(f189195a instanceof MessageBody.SystemMessageBody.Platform.Bubble.GeoLocation)) {
                        if (f189195a instanceof MessageBody.SystemMessageBody.Platform.Bubble.Item) {
                            MessageBody.SystemMessageBody.Platform.Bubble.Item item = (MessageBody.SystemMessageBody.Platform.Bubble.Item) f189195a;
                            return new d.c(aVar, hVarA2, item.getId(), new Uri.Builder().scheme(Constants.SCHEME).authority("avito.ru").appendPath(item.getId()).toString(), z12, b(localMessage, f189195a), z13);
                        }
                        if (f189195a instanceof MessageBody.SystemMessageBody.Platform.Bubble.Video) {
                            aVar2 = new d.i(aVar, hVarA2, z12, b(localMessage, f189195a), z13);
                        } else if (f189195a instanceof MessageBody.SystemMessageBody.Platform.Bubble.File) {
                            aVar2 = new d.a(aVar, hVarA2, z12, b(localMessage, f189195a), z13);
                        } else {
                            V2.f318762a.c("ContextDataFactory", "Message body or bubble type is not supported: " + bVar, null);
                        }
                        return aVar2;
                    }
                    if (!(localMessage.getBody() instanceof MessageBody.SystemMessageBody.Platform.FromAvito)) {
                        gVar = new d.g(aVar, hVarA2, b(localMessage, f189195a), ((MessageBody.SystemMessageBody.Platform.Bubble.GeoLocation) f189195a).getTitle(), z12, z13);
                    }
                    return gVar;
                }
                Image image = ((MessageBody.SystemMessageBody.Platform.Bubble.Image) f189195a).getImage();
                if (image != null) {
                    Iterator it2 = image.getVariants().entrySet().iterator();
                    if (it2.hasNext()) {
                        next = it2.next();
                        if (it2.hasNext()) {
                            Size size3 = (Size) ((Map.Entry) next).getKey();
                            int width3 = size3.getWidth() * size3.getHeight();
                            do {
                                Object next4 = it2.next();
                                Size size4 = (Size) ((Map.Entry) next4).getKey();
                                int width4 = size4.getWidth() * size4.getHeight();
                                if (width3 < width4) {
                                    next = next4;
                                    width3 = width4;
                                }
                            } while (it2.hasNext());
                        }
                    } else {
                        next = null;
                    }
                    Map.Entry entry2 = (Map.Entry) next;
                    Uri uri2 = entry2 != null ? (Uri) entry2.getValue() : null;
                    if (uri2 != null) {
                        gVar = uri2.toString();
                    }
                }
                if (gVar == null) {
                    gVar = "";
                }
                return new d.b(aVar, hVarA2, b(localMessage, f189195a), gVar, z12, z13);
            }
            MessageBody.Item item2 = (MessageBody.Item) f189194a;
            cVar = new d.c(aVar, hVarA2, item2.getId(), new Uri.Builder().scheme(Constants.SCHEME).authority("avito.ru").appendPath(item2.getId()).toString(), z12, null, z13, 32, null);
        }
        return cVar;
    }
}
