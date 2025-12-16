package is0;

import CN.o;
import CN.p;
import Y61.k;
import androidx.compose.runtime.internal.P;
import androidx.recyclerview.widget.RecyclerView;
import androidx.view.InterfaceC22983P;
import com.avito.android.analytics.screens.SerpScreen;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.memory.consumption.f;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: SerpTracker.kt */
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lis0/f;", "Lis0/e;", "LCN/o;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: is0.f, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C42104f implements InterfaceC42103e, o {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final ScreenPerformanceTracker f405332a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p f405333b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final C42102d f405334c = new C42102d();

    @Inject
    public C42104f(@k ScreenPerformanceTracker screenPerformanceTracker) {
        this.f405332a = screenPerformanceTracker;
        this.f405333b = new p(screenPerformanceTracker);
        ScreenPerformanceTracker.LoadingType loadingType = ScreenPerformanceTracker.LoadingType.f90785b;
        SerpScreen serpScreen = SerpScreen.f90483d;
        serpScreen.getClass();
        SerpScreen serpScreen2 = SerpScreen.f90483d;
        ScreenPerformanceTracker.LoadingType loadingType2 = ScreenPerformanceTracker.LoadingType.f90785b;
        serpScreen.getClass();
        SerpScreen serpScreen3 = SerpScreen.f90483d;
    }

    @Override // is0.InterfaceC42103e, xI.e, ZX.a
    public final void a(long j12) {
        this.f405332a.a(j12);
    }

    @Override // is0.InterfaceC42103e, xI.e, com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker
    public final void b(@k RecyclerView recyclerView) {
        this.f405332a.b(recyclerView);
    }

    @Override // is0.InterfaceC42103e, xI.e, ZX.a
    public final void c(@k InterfaceC22983P interfaceC22983P, @k f.a aVar) {
        ScreenPerformanceTracker screenPerformanceTracker = this.f405332a;
        screenPerformanceTracker.c(interfaceC22983P, aVar);
        screenPerformanceTracker.B(this.f405334c, interfaceC22983P);
    }

    @Override // is0.InterfaceC42103e, xI.e, ZX.a
    public final void d() {
        this.f405332a.d();
    }

    @Override // is0.InterfaceC42103e, xI.e, ZX.a
    public final void e() {
        this.f405332a.e();
    }

    @Override // CN.o
    public final void g() {
        this.f405333b.g();
    }

    @Override // CN.o
    public final void h() {
        this.f405333b.h();
    }

    @Override // CN.o
    public final void i() {
        this.f405333b.i();
    }

    @Override // CN.o
    public final void j(@k Throwable th2) {
        this.f405333b.j(th2);
    }
}
