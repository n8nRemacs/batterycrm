package com.avito.android.analytics.screens.mvi;

import androidx.compose.runtime.F3;
import com.avito.android.analytics.screens.J;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: TrackableState.kt */
@F3
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/analytics/screens/mvi/r;", "", "_avito_analytics-screens-mvi_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class r {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final String f90666a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final J f90667b;

    public r(@Y61.k String str, @Y61.k J j12) {
        this.f90666a = str;
        this.f90667b = j12;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return L.f(this.f90666a, rVar.f90666a) && L.f(this.f90667b, rVar.f90667b);
    }

    public final int hashCode() {
        return this.f90667b.hashCode() + (this.f90666a.hashCode() * 31);
    }

    @Y61.k
    public final String toString() {
        return "TrackerParams(contentType=" + this.f90666a + ", result=" + this.f90667b + ')';
    }
}
