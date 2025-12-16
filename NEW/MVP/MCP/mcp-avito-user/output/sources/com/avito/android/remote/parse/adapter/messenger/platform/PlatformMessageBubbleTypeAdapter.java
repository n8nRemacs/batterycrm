package com.avito.android.remote.parse.adapter.messenger.platform;

import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.messenger.message.MessageBody;
import com.avito.android.remote.model.text.AttributedText;
import com.google.gson.h;
import com.google.gson.i;
import com.google.gson.k;
import com.google.gson.n;
import com.google.gson.o;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.s0;

/* compiled from: PlatformMessageBubbleTypeAdapter.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/remote/parse/adapter/messenger/platform/PlatformMessageBubbleTypeAdapter;", "Lcom/google/gson/h;", "Lcom/avito/android/remote/model/messenger/message/MessageBody$SystemMessageBody$Platform$Bubble;", "Lcom/google/gson/o;", "<init>", "()V", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class PlatformMessageBubbleTypeAdapter implements h<MessageBody.SystemMessageBody.Platform.Bubble>, o<MessageBody.SystemMessageBody.Platform.Bubble> {
    @Override // com.google.gson.o
    public final i a(Object obj, n nVar) {
        MessageBody.SystemMessageBody.Platform.Bubble bubble = (MessageBody.SystemMessageBody.Platform.Bubble) obj;
        k kVar = new k();
        if (bubble instanceof MessageBody.SystemMessageBody.Platform.Bubble.Text) {
            kVar.y("type", "text");
            kVar.t("value", nVar.a(((MessageBody.SystemMessageBody.Platform.Bubble.Text) bubble).getText(), AttributedText.class));
        } else if (bubble instanceof MessageBody.SystemMessageBody.Platform.Bubble.Image) {
            kVar.y("type", "image");
            kVar.t("value", nVar.c(bubble));
        } else if (bubble instanceof MessageBody.SystemMessageBody.Platform.Bubble.GeoLocation) {
            kVar.y("type", MessageBody.SystemMessageBody.Platform.Bubble.GeoLocation.TYPE);
            kVar.t("value", nVar.c(bubble));
        } else if (bubble instanceof MessageBody.SystemMessageBody.Platform.Bubble.Item) {
            kVar.y("type", "item");
            kVar.t("value", nVar.c(bubble));
        } else if (bubble instanceof MessageBody.SystemMessageBody.Platform.Bubble.Video) {
            kVar.y("type", "video");
            kVar.t("value", nVar.c(bubble));
        } else {
            if (!(bubble instanceof MessageBody.SystemMessageBody.Platform.Bubble.File)) {
                throw new NoWhenBranchMatchedException();
            }
            kVar.y("type", "file");
            kVar.t("value", nVar.c(bubble));
        }
        G0 g02 = G0.f406611a;
        return kVar;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0060  */
    @Override // com.google.gson.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.avito.android.remote.model.messenger.message.MessageBody.SystemMessageBody.Platform.Bubble deserialize(com.google.gson.i r6, java.lang.reflect.Type r7, com.google.gson.g r8) {
        /*
            Method dump skipped, instructions count: 366
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.remote.parse.adapter.messenger.platform.PlatformMessageBubbleTypeAdapter.deserialize(com.google.gson.i, java.lang.reflect.Type, com.google.gson.g):java.lang.Object");
    }
}
