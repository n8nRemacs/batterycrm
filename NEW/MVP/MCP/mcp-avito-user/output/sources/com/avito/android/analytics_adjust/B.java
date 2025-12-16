package com.avito.android.analytics_adjust;

import androidx.compose.runtime.C22026a;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: AnalyticsIdsAppStartEvent.kt */
@X41.g
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087@\u0018\u00002\u00020\u0001\u0088\u0001\u0002\u0092\u0001\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/analytics_adjust/B;", "", "id", "", "_common_analytics-adjust_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class B {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final String f91189a;

    private /* synthetic */ B(String str) {
        this.f91189a = str;
    }

    public static final /* synthetic */ B a(String str) {
        return new B(str);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof B) {
            return L.f(this.f91189a, ((B) obj).f91189a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f91189a.hashCode();
    }

    public final String toString() {
        return C22026a.c(new StringBuilder("MyTrackerID(id="), this.f91189a, ')');
    }
}
