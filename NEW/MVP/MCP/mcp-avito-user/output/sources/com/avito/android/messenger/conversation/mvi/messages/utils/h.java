package com.avito.android.messenger.conversation.mvi.messages.utils;

import androidx.compose.runtime.internal.P;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: TestTagsAndData.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/messages/utils/h;", "", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class h {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.akita.compose.foundation.p f193586a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.akita.compose.foundation.p f193587b;

    public h(@Y61.k com.akita.compose.foundation.p pVar, @Y61.k com.akita.compose.foundation.p pVar2) {
        this.f193586a = pVar;
        this.f193587b = pVar2;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return L.f(this.f193586a, hVar.f193586a) && L.f(this.f193587b, hVar.f193587b);
    }

    public final int hashCode() {
        return this.f193587b.hashCode() + (this.f193586a.hashCode() * 31);
    }

    @Y61.k
    public final String toString() {
        return "MessageBubbleTestData(bodyColor=" + this.f193586a + ", highlightColor=" + this.f193587b + ')';
    }
}
