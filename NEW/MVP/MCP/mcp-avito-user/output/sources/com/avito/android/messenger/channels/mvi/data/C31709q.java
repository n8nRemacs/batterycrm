package com.avito.android.messenger.channels.mvi.data;

import com.avito.android.persistence.messenger.C33091m0;
import com.avito.android.persistence.messenger.O1;
import java.util.List;
import kotlin.Metadata;

/* compiled from: MessengerDebugRepo.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/channels/mvi/data/q;", "", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.messenger.channels.mvi.data.q, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final /* data */ class C31709q {

    /* renamed from: a, reason: collision with root package name */
    @Y61.l
    public final com.avito.android.persistence.messenger.Y f187241a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final List<C33091m0> f187242b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final O1 f187243c;

    public C31709q(@Y61.l com.avito.android.persistence.messenger.Y y12, @Y61.k List<C33091m0> list, @Y61.l O1 o12) {
        this.f187241a = y12;
        this.f187242b = list;
        this.f187243c = o12;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C31709q)) {
            return false;
        }
        C31709q c31709q = (C31709q) obj;
        return kotlin.jvm.internal.L.f(this.f187241a, c31709q.f187241a) && kotlin.jvm.internal.L.f(this.f187242b, c31709q.f187242b) && kotlin.jvm.internal.L.f(this.f187243c, c31709q.f187243c);
    }

    public final int hashCode() {
        com.avito.android.persistence.messenger.Y y12 = this.f187241a;
        int iE2 = androidx.compose.foundation.H.e((y12 == null ? 0 : y12.hashCode()) * 31, 31, this.f187242b);
        O1 o12 = this.f187243c;
        return iE2 + (o12 != null ? o12.hashCode() : 0);
    }

    @Y61.k
    public final String toString() {
        return "ChannelRelatedEntities(channelEntity=" + this.f187241a + ", tagEntities=" + this.f187242b + ", messageEntity=" + this.f187243c + ')';
    }
}
