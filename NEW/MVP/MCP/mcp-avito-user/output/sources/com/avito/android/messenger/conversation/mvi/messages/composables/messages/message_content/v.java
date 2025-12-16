package com.avito.android.messenger.conversation.mvi.messages.composables.messages.message_content;

import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: PlatformTextMessageContent.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/messages/composables/messages/message_content/v;", "", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class v {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final String f192622a;

    public v(@Y61.k String str) {
        this.f192622a = str;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof v) && L.f(this.f192622a, ((v) obj).f192622a);
    }

    public final int hashCode() {
        return this.f192622a.hashCode();
    }

    @Y61.k
    public final String toString() {
        return C22026a.c(new StringBuilder("PlatformTextMessageTestData(listItemStringId="), this.f192622a, ')');
    }
}
