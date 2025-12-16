package com.avito.android.messenger.channels.filter;

import androidx.appcompat.app.r;
import androidx.compose.runtime.internal.P;
import kotlin.Metadata;

/* compiled from: ChannelsFilterState.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/channels/filter/i;", "", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class i {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f187159a;

    /* renamed from: b, reason: collision with root package name */
    public final int f187160b;

    public i(boolean z12, int i12) {
        this.f187159a = z12;
        this.f187160b = i12;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return this.f187159a == iVar.f187159a && this.f187160b == iVar.f187160b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f187160b) + (Boolean.hashCode(this.f187159a) * 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ChannelsFilterState(isUnreadChannels=");
        sb2.append(this.f187159a);
        sb2.append(", unreadChannelsSize=");
        return r.t(sb2, this.f187160b, ')');
    }
}
