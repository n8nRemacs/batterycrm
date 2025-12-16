package CN;

import com.avito.android.analytics.screens.J;
import com.avito.android.analytics.screens.SerpScreen;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import kotlin.Metadata;

/* compiled from: InlineFiltersTracker.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LCN/p;", "LCN/o;", "_avito_inline-filters_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class p implements o {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final ScreenPerformanceTracker f2126a;

    public p(@Y61.k ScreenPerformanceTracker screenPerformanceTracker) {
        this.f2126a = screenPerformanceTracker;
    }

    @Override // CN.o
    public final void g() {
        SerpScreen.f90483d.getClass();
        ScreenPerformanceTracker.a.d(this.f2126a, SerpScreen.f90485f, null, null, null, 14);
    }

    @Override // CN.o
    public final void h() {
        SerpScreen.f90483d.getClass();
        ScreenPerformanceTracker.a.c(this.f2126a, SerpScreen.f90485f, null, null, 6);
    }

    @Override // CN.o
    public final void i() {
        SerpScreen.f90483d.getClass();
        this.f2126a.m(SerpScreen.f90485f);
    }

    @Override // CN.o
    public final void j(@Y61.k Throwable th2) {
        SerpScreen.f90483d.getClass();
        ScreenPerformanceTracker.a.d(this.f2126a, SerpScreen.f90485f, null, new J.a(th2), null, 10);
    }
}
