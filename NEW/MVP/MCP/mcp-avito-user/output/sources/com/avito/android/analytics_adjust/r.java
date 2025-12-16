package com.avito.android.analytics_adjust;

import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: AdjustTrackerDetails.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/analytics_adjust/r;", "", "_common_analytics-adjust_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class r {

    /* renamed from: a, reason: collision with root package name */
    @Y61.l
    public final String f91243a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f91244b;

    public r(@Y61.l String str, boolean z12) {
        this.f91243a = str;
        this.f91244b = z12;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return L.f(this.f91243a, rVar.f91243a) && this.f91244b == rVar.f91244b;
    }

    public final int hashCode() {
        String str = this.f91243a;
        return Boolean.hashCode(this.f91244b) + ((str == null ? 0 : str.hashCode()) * 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AdjustTrackerDetails(defaultTracker=");
        sb2.append(this.f91243a);
        sb2.append(", preinstallTrackingEnabled=");
        return androidx.appcompat.app.r.x(sb2, this.f91244b, ')');
    }
}
