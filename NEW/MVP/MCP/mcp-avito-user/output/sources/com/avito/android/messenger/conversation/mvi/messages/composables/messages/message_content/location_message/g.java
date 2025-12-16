package com.avito.android.messenger.conversation.mvi.messages.composables.messages.message_content.location_message;

import Y61.k;
import Y61.l;
import android.net.Uri;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: LocationMessageData.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/messages/composables/messages/message_content/location_message/g;", "", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class g {

    /* renamed from: a, reason: collision with root package name */
    @l
    public final Uri f192541a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f192542b;

    public g(@l Uri uri, @k String str) {
        this.f192541a = uri;
        this.f192542b = str;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return L.f(this.f192541a, gVar.f192541a) && L.f(this.f192542b, gVar.f192542b);
    }

    public final int hashCode() {
        Uri uri = this.f192541a;
        return this.f192542b.hashCode() + ((uri == null ? 0 : uri.hashCode()) * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("LocationMessageData(imageUri=");
        sb2.append(this.f192541a);
        sb2.append(", text=");
        return C22026a.c(sb2, this.f192542b, ')');
    }
}
