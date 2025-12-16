package Pd0;

import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.screens.J;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: MarketPriceSlotTracker.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LPd0/p;", "LPd0/o;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class p implements o {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final ScreenPerformanceTracker f13171a;

    @Inject
    public p(@Y61.k ScreenPerformanceTracker screenPerformanceTracker) {
        this.f13171a = screenPerformanceTracker;
    }

    @Override // Pd0.o
    public final void C(@Y61.k Throwable th2) {
        ScreenPerformanceTracker.a.d(this.f13171a, "market-price", null, new J.a(th2), null, 10);
    }

    @Override // Pd0.o
    public final void h() {
        ScreenPerformanceTracker.a.b(this.f13171a, "market-price", 2);
    }

    @Override // Pd0.o
    public final void m() {
        this.f13171a.m("market-price");
    }

    @Override // Pd0.o
    public final void n() {
        ScreenPerformanceTracker.a.d(this.f13171a, "market-price", null, J.b.f90385a, null, 10);
    }

    @Override // Pd0.o
    public final void s() {
        ScreenPerformanceTracker.a.c(this.f13171a, "market-price", null, null, 6);
    }
}
