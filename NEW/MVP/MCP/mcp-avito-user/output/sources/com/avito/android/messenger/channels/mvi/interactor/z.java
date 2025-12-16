package com.avito.android.messenger.channels.mvi.interactor;

import androidx.compose.runtime.internal.P;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import ru.avito.messenger.MessengerUserHashInfo;

/* compiled from: LocallyDeletedChannelsInteractor.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/channels/mvi/interactor/z;", "", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class z {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final MessengerUserHashInfo f187675a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f187676b;

    /* renamed from: c, reason: collision with root package name */
    public final long f187677c;

    public z(long j12, @Y61.k String str, @Y61.k MessengerUserHashInfo messengerUserHashInfo) {
        this.f187675a = messengerUserHashInfo;
        this.f187676b = str;
        this.f187677c = j12;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z)) {
            return false;
        }
        z zVar = (z) obj;
        return L.f(this.f187675a, zVar.f187675a) && L.f(this.f187676b, zVar.f187676b) && this.f187677c == zVar.f187677c;
    }

    public final int hashCode() {
        return Long.hashCode(this.f187677c) + androidx.compose.foundation.H.d(this.f187675a.hashCode() * 31, 31, this.f187676b);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("LocallyDeletedChannelInfo(userInfo=");
        sb2.append(this.f187675a);
        sb2.append(", channelId=");
        sb2.append(this.f187676b);
        sb2.append(", timestamp=");
        return androidx.appcompat.app.r.u(sb2, this.f187677c, ')');
    }
}
