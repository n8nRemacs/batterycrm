package com.avito.android.home;

import kotlin.Metadata;

/* compiled from: Counters.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/home/d;", "", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.home.d, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final /* data */ class C30769d {

    /* renamed from: a, reason: collision with root package name */
    public final int f162375a;

    /* renamed from: b, reason: collision with root package name */
    public final int f162376b;

    /* renamed from: c, reason: collision with root package name */
    public final int f162377c;

    /* renamed from: d, reason: collision with root package name */
    public final int f162378d;

    /* renamed from: e, reason: collision with root package name */
    public final int f162379e;

    public C30769d(int i12, int i13, int i14, int i15, int i16) {
        this.f162375a = i12;
        this.f162376b = i13;
        this.f162377c = i14;
        this.f162378d = i15;
        this.f162379e = i16;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C30769d)) {
            return false;
        }
        C30769d c30769d = (C30769d) obj;
        return this.f162375a == c30769d.f162375a && this.f162376b == c30769d.f162376b && this.f162377c == c30769d.f162377c && this.f162378d == c30769d.f162378d && this.f162379e == c30769d.f162379e;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f162379e) + androidx.appcompat.app.r.e(this.f162378d, androidx.appcompat.app.r.e(this.f162377c, androidx.appcompat.app.r.e(this.f162376b, Integer.hashCode(this.f162375a) * 31, 31), 31), 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Counters(expiredAdvertCount=");
        sb2.append(this.f162375a);
        sb2.append(", unreadNotificationCount=");
        sb2.append(this.f162376b);
        sb2.append(", missedCallCount=");
        sb2.append(this.f162377c);
        sb2.append(", ordersBadgeCount=");
        sb2.append(this.f162378d);
        sb2.append(", campaignsSaleCount=");
        return androidx.appcompat.app.r.t(sb2, this.f162379e, ')');
    }
}
