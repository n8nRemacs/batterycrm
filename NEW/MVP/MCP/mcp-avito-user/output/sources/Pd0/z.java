package Pd0;

import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import kotlin.Metadata;

/* compiled from: SalaryRangeSlotTracker.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LPd0/z;", "LPd0/y;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class z implements y {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final ScreenPerformanceTracker f13186a;

    public z(@Y61.k ScreenPerformanceTracker screenPerformanceTracker) {
        this.f13186a = screenPerformanceTracker;
    }

    @Override // Pd0.y
    public final void c() {
        ScreenPerformanceTracker.a.c(this.f13186a, "salary-range-slot", null, null, 6);
    }

    @Override // Pd0.y
    public final void w() {
        this.f13186a.m("salary-range-slot");
    }
}
