package com.avito.android.messenger.conversation.mvi.messages.composables.messages.message_content.image_message;

import Y61.k;
import Y61.l;
import android.net.Uri;
import androidx.compose.runtime.internal.P;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: ImageMessageData.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/messages/composables/messages/message_content/image_message/i;", "", "a", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class i {

    /* renamed from: c, reason: collision with root package name */
    @k
    public static final a f192514c = new a(null);

    /* renamed from: d, reason: collision with root package name */
    @k
    public static final i f192515d = new i(null, null);

    /* renamed from: a, reason: collision with root package name */
    @l
    public final Uri f192516a;

    /* renamed from: b, reason: collision with root package name */
    @l
    public final Uri f192517b;

    /* compiled from: ImageMessageData.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/messages/composables/messages/message_content/image_message/i$a;", "", "<init>", "()V", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public i(@l Uri uri, @l Uri uri2) {
        this.f192516a = uri;
        this.f192517b = uri2;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return L.f(this.f192516a, iVar.f192516a) && L.f(this.f192517b, iVar.f192517b);
    }

    public final int hashCode() {
        Uri uri = this.f192516a;
        int iHashCode = (uri == null ? 0 : uri.hashCode()) * 31;
        Uri uri2 = this.f192517b;
        return iHashCode + (uri2 != null ? uri2.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ImageMessageData(mainImageUri=");
        sb2.append(this.f192516a);
        sb2.append(", thumbnailUri=");
        return com.avito.android.actions_sheet.a.t(sb2, this.f192517b, ')');
    }
}
