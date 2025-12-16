package com.avito.android.analytics.screens.mvi;

import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import j.InterfaceC42148d;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: TrackableInternalAction.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b'\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/analytics/screens/mvi/TrackableLoadingStarted;", "Lcom/avito/android/analytics/screens/mvi/n;", "Lcom/avito/android/analytics/screens/mvi/s;", "<init>", "()V", "_avito_analytics-screens-mvi_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@InterfaceC42148d
/* loaded from: classes11.dex */
public abstract class TrackableLoadingStarted implements n, s {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final AtomicLong f90639b = new AtomicLong(0);

    /* renamed from: c, reason: collision with root package name */
    public final long f90640c;

    public TrackableLoadingStarted() {
        com.avito.android.time.c.f301452a.getClass();
        this.f90640c = com.avito.android.time.c.f301453b.a();
    }

    @Y61.l
    /* renamed from: d */
    public String getF203255e() {
        return null;
    }

    @Y61.l
    public final Long e() {
        AtomicLong atomicLong = this.f90639b;
        if (atomicLong.get() != 0) {
            return Long.valueOf(atomicLong.get());
        }
        return null;
    }

    public boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!getClass().equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        TrackableLoadingStarted trackableLoadingStarted = (TrackableLoadingStarted) obj;
        return this.f90640c == trackableLoadingStarted.f90640c && getF220522e() == trackableLoadingStarted.getF220522e() && L.f(e(), trackableLoadingStarted.e());
    }

    @Y61.l
    /* renamed from: h */
    public ScreenPerformanceTracker.LoadingType getF220522e() {
        return null;
    }

    public int hashCode() {
        int iHashCode = Long.hashCode(this.f90640c) * 31;
        ScreenPerformanceTracker.LoadingType f220522e = getF220522e();
        int iHashCode2 = (iHashCode + (f220522e != null ? f220522e.hashCode() : 0)) * 31;
        Long lE2 = e();
        return iHashCode2 + (lE2 != null ? lE2.hashCode() : 0);
    }
}
