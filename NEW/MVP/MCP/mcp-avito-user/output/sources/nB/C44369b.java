package nb;

import Y61.k;
import com.avito.android.advert_stats.AdvertStatsFragment;
import com.avito.android.analytics.screens.J;
import com.avito.android.analytics.screens.MnzStatsScreen;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.memory.consumption.f;
import com.avito.android.remote.error.ApiError;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: AdvertStatsTracker.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lnb/b;", "Lnb/a;", "_avito_advert-stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: nb.b, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C44369b implements InterfaceC44368a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final ScreenPerformanceTracker f415189a;

    @Inject
    public C44369b(@k ScreenPerformanceTracker screenPerformanceTracker) {
        this.f415189a = screenPerformanceTracker;
    }

    @Override // nb.InterfaceC44368a
    public final void a(long j12) {
        this.f415189a.a(j12);
    }

    @Override // nb.InterfaceC44368a
    public final void b(@k Throwable th2) {
        MnzStatsScreen.f90406d.getClass();
        ScreenPerformanceTracker.a.c(this.f415189a, MnzStatsScreen.f90407e, new J.a(th2), null, 4);
    }

    @Override // nb.InterfaceC44368a
    public final void c() {
        MnzStatsScreen.f90406d.getClass();
        ScreenPerformanceTracker.a.b(this.f415189a, MnzStatsScreen.f90407e, 2);
    }

    @Override // nb.InterfaceC44368a
    public final void d() {
        this.f415189a.d();
    }

    @Override // nb.InterfaceC44368a
    public final void e() {
        this.f415189a.e();
    }

    @Override // nb.InterfaceC44368a
    public final void f() {
        MnzStatsScreen.f90406d.getClass();
        this.f415189a.m(MnzStatsScreen.f90407e);
    }

    @Override // nb.InterfaceC44368a
    public final void g() {
        MnzStatsScreen.f90406d.getClass();
        ScreenPerformanceTracker.a.c(this.f415189a, MnzStatsScreen.f90407e, null, null, 6);
    }

    @Override // nb.InterfaceC44368a
    public final void h() {
        MnzStatsScreen.f90406d.getClass();
        ScreenPerformanceTracker.a.d(this.f415189a, MnzStatsScreen.f90407e, null, null, null, 14);
    }

    @Override // nb.InterfaceC44368a
    public final void i(@k ApiError apiError) {
        MnzStatsScreen.f90406d.getClass();
        ScreenPerformanceTracker.a.d(this.f415189a, MnzStatsScreen.f90407e, null, new J.a(apiError), null, 10);
    }

    @Override // nb.InterfaceC44368a
    public final void j(@k f.a aVar, @k AdvertStatsFragment advertStatsFragment) {
        this.f415189a.c(advertStatsFragment, aVar);
    }
}
