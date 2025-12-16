package com.avito.android.persistence.messenger;

import androidx.room.InterfaceC23472t;
import kotlin.Metadata;

/* compiled from: UserIdAndLastActionTime.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/persistence/messenger/d3;", "", "_avito-discouraged_persistence_messenger"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class d3 {

    /* renamed from: a, reason: collision with root package name */
    @InterfaceC23472t
    @Y61.k
    public final String f215442a;

    /* renamed from: b, reason: collision with root package name */
    @InterfaceC23472t
    @Y61.l
    public final Long f215443b;

    /* renamed from: c, reason: collision with root package name */
    @InterfaceC23472t
    @Y61.l
    public final Long f215444c;

    public d3(@Y61.k String str, @Y61.l Long l12, @Y61.l Long l13) {
        this.f215442a = str;
        this.f215443b = l12;
        this.f215444c = l13;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d3)) {
            return false;
        }
        d3 d3Var = (d3) obj;
        return kotlin.jvm.internal.L.f(this.f215442a, d3Var.f215442a) && kotlin.jvm.internal.L.f(this.f215443b, d3Var.f215443b) && kotlin.jvm.internal.L.f(this.f215444c, d3Var.f215444c);
    }

    public final int hashCode() {
        int iHashCode = this.f215442a.hashCode() * 31;
        Long l12 = this.f215443b;
        int iHashCode2 = (iHashCode + (l12 == null ? 0 : l12.hashCode())) * 31;
        Long l13 = this.f215444c;
        return iHashCode2 + (l13 != null ? l13.hashCode() : 0);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("UserIdAndLastActionTime(userId=");
        sb2.append(this.f215442a);
        sb2.append(", lastActionTime=");
        sb2.append(this.f215443b);
        sb2.append(", timeDiff=");
        return androidx.media3.exoplayer.analytics.m.m(sb2, this.f215444c, ')');
    }
}
