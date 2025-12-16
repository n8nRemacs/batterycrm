package com.avito.android.messenger.conversation.mvi.messages.composables;

import androidx.compose.runtime.internal.P;
import kotlin.Metadata;

/* compiled from: MessageList.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/messages/composables/a;", "", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class a {

    /* renamed from: a, reason: collision with root package name */
    public final int f192192a;

    public a(int i12) {
        this.f192192a = i12;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a) && this.f192192a == ((a) obj).f192192a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f192192a);
    }

    @Y61.k
    public final String toString() {
        return androidx.appcompat.app.r.t(new StringBuilder("MessageListItemTestData(position="), this.f192192a, ')');
    }
}
