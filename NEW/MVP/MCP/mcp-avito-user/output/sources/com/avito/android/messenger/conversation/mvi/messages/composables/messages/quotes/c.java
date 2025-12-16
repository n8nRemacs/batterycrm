package com.avito.android.messenger.conversation.mvi.messages.composables.messages.quotes;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.akita.compose.component.accordion.s;
import j.InterfaceC42161q;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: QuoteRenderingParams.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/messages/composables/messages/quotes/c;", "", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class c {

    /* renamed from: a, reason: collision with root package name */
    @l
    public final Integer f192713a;

    public c(@InterfaceC42161q @l Integer num) {
        this.f192713a = num;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c) && L.f(this.f192713a, ((c) obj).f192713a);
    }

    public final int hashCode() {
        Integer num = this.f192713a;
        if (num == null) {
            return 0;
        }
        return num.hashCode();
    }

    @k
    public final String toString() {
        return s.j(new StringBuilder("QuoteRenderingParams(maxQuoteWidth="), this.f192713a, ')');
    }
}
