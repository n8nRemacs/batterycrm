package com.avito.android.analytics.coverage;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: PerfScreenCoverageTracker.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/analytics/coverage/g;", "", "_avito_analytics-screens_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
final /* data */ class g {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final String f89881a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f89882b;

    public g(@k String str, @k String str2) {
        this.f89881a = str;
        this.f89882b = str2;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return L.f(this.f89881a, gVar.f89881a) && L.f(this.f89882b, gVar.f89882b);
    }

    public final int hashCode() {
        return this.f89882b.hashCode() + (this.f89881a.hashCode() * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ScreenInitEventMask(hostClassName=");
        sb2.append(this.f89881a);
        sb2.append(", screenName=");
        return C22026a.c(sb2, this.f89882b, ')');
    }
}
