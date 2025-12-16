package bD;

import Y61.k;
import androidx.compose.runtime.internal.P;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.analytics.screens.J;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.favorites.FavoritesFragment;
import com.avito.android.favorites.tracker.FavoritesScreen;
import com.avito.android.memory.consumption.f;
import com.avito.android.remote.error.ApiError;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: FavoritesTracker.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LbD/c;", "LbD/b;", "_avito_favorites_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: bD.c, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C25498c implements InterfaceC25497b {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final ScreenPerformanceTracker f57006a;

    @Inject
    public C25498c(@k ScreenPerformanceTracker screenPerformanceTracker) {
        this.f57006a = screenPerformanceTracker;
    }

    @Override // bD.InterfaceC25497b
    public final void a(long j12) {
        this.f57006a.a(j12);
    }

    @Override // bD.InterfaceC25497b
    public final void b(@k RecyclerView recyclerView) {
        this.f57006a.b(recyclerView);
    }

    @Override // bD.InterfaceC25497b
    public final void c(@k Throwable th2) {
        FavoritesScreen.f157546d.getClass();
        ScreenPerformanceTracker.a.d(this.f57006a, FavoritesScreen.f157547e, null, new J.a(th2), null, 10);
    }

    @Override // bD.InterfaceC25497b
    public final void d() {
        this.f57006a.d();
    }

    @Override // bD.InterfaceC25497b
    public final void e() {
        this.f57006a.e();
    }

    @Override // bD.InterfaceC25497b
    public final void f(@k ApiError apiError) {
        FavoritesScreen.f157546d.getClass();
        ScreenPerformanceTracker.a.d(this.f57006a, FavoritesScreen.f157547e, null, new J.a(apiError), null, 10);
    }

    @Override // bD.InterfaceC25497b
    public final void g(@k ApiError apiError) {
        FavoritesScreen.f157546d.getClass();
        ScreenPerformanceTracker.a.c(this.f57006a, FavoritesScreen.f157547e, new J.a(apiError), null, 4);
    }

    @Override // bD.InterfaceC25497b
    public final void h() {
        FavoritesScreen.f157546d.getClass();
        this.f57006a.m(FavoritesScreen.f157547e);
    }

    @Override // bD.InterfaceC25497b
    public final void i() {
        FavoritesScreen.f157546d.getClass();
        ScreenPerformanceTracker.a.b(this.f57006a, FavoritesScreen.f157547e, 2);
    }

    @Override // bD.InterfaceC25497b
    public final void j() {
        FavoritesScreen.f157546d.getClass();
        ScreenPerformanceTracker.a.d(this.f57006a, FavoritesScreen.f157547e, null, null, null, 14);
    }

    @Override // bD.InterfaceC25497b
    public final void k() {
        FavoritesScreen.f157546d.getClass();
        ScreenPerformanceTracker.a.c(this.f57006a, FavoritesScreen.f157547e, J.b.f90385a, null, 4);
    }

    @Override // bD.InterfaceC25497b
    public final void l(@k f.a aVar, @k FavoritesFragment favoritesFragment) {
        this.f57006a.c(favoritesFragment, aVar);
    }
}
