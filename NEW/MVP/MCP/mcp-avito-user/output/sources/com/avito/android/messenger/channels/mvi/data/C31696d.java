package com.avito.android.messenger.channels.mvi.data;

import com.avito.android.persistence.messenger.O1;
import java.util.ArrayList;
import kotlin.Metadata;

/* compiled from: ChannelEntityConverter.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/channels/mvi/data/d;", "", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.messenger.channels.mvi.data.d, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final /* data */ class C31696d {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.persistence.messenger.Y f187210a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final ArrayList f187211b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final ArrayList f187212c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public final O1 f187213d;

    public C31696d(@Y61.k com.avito.android.persistence.messenger.Y y12, @Y61.k ArrayList arrayList, @Y61.k ArrayList arrayList2, @Y61.l O1 o12) {
        this.f187210a = y12;
        this.f187211b = arrayList;
        this.f187212c = arrayList2;
        this.f187213d = o12;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C31696d)) {
            return false;
        }
        C31696d c31696d = (C31696d) obj;
        return this.f187210a.equals(c31696d.f187210a) && this.f187211b.equals(c31696d.f187211b) && this.f187212c.equals(c31696d.f187212c) && kotlin.jvm.internal.L.f(this.f187213d, c31696d.f187213d);
    }

    public final int hashCode() {
        int iG2 = androidx.compose.ui.graphics.colorspace.e.g(this.f187212c, androidx.compose.ui.graphics.colorspace.e.g(this.f187211b, this.f187210a.hashCode() * 31, 31), 31);
        O1 o12 = this.f187213d;
        return iG2 + (o12 == null ? 0 : o12.hashCode());
    }

    @Y61.k
    public final String toString() {
        return "ChannelDbEntities(channelEntity=" + this.f187210a + ", userEntities=" + this.f187211b + ", channelTags=" + this.f187212c + ", lastMessage=" + this.f187213d + ')';
    }
}
