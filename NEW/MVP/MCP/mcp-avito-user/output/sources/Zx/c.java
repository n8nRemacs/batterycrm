package ZX;

import CN.o;
import CN.p;
import Y61.k;
import androidx.view.InterfaceC22983P;
import com.avito.android.analytics.screens.SearchMapScreen;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.memory.consumption.f;
import is0.C42102d;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: MapTracker.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"LZX/c;", "LZX/a;", "LZX/b;", "LCN/o;", "_avito_search-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class c implements a, b, o {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final ScreenPerformanceTracker f20197a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p f20198b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final C42102d f20199c = new C42102d();

    @Inject
    public c(@k ScreenPerformanceTracker screenPerformanceTracker) {
        this.f20197a = screenPerformanceTracker;
        this.f20198b = new p(screenPerformanceTracker);
    }

    @Override // ZX.a
    public final void a(long j12) {
        this.f20197a.a(j12);
    }

    @Override // ZX.a
    public final void c(@k InterfaceC22983P interfaceC22983P, @k f.a aVar) {
        ScreenPerformanceTracker screenPerformanceTracker = this.f20197a;
        screenPerformanceTracker.c(interfaceC22983P, aVar);
        screenPerformanceTracker.B(this.f20199c, interfaceC22983P);
    }

    @Override // ZX.a
    public final void d() {
        this.f20197a.d();
    }

    @Override // ZX.a
    public final void e() {
        this.f20197a.e();
    }

    @Override // ZX.b
    public final void f() {
        SearchMapScreen.f90473d.getClass();
        ScreenPerformanceTracker.a.d(this.f20197a, SearchMapScreen.f90474e, null, null, null, 14);
    }

    @Override // CN.o
    public final void g() {
        SearchMapScreen.f90473d.getClass();
        ScreenPerformanceTracker.a.d(this.f20197a, SearchMapScreen.f90475f, null, null, null, 14);
    }

    @Override // CN.o
    public final void h() {
        SearchMapScreen.f90473d.getClass();
        ScreenPerformanceTracker.a.c(this.f20197a, SearchMapScreen.f90475f, null, null, 6);
    }

    @Override // CN.o
    public final void i() {
        SearchMapScreen.f90473d.getClass();
        this.f20197a.m(SearchMapScreen.f90475f);
    }

    @Override // CN.o
    public final void j(@k Throwable th2) {
        this.f20198b.j(th2);
    }

    @Override // ZX.b
    public final void k() {
        SearchMapScreen.f90473d.getClass();
        ScreenPerformanceTracker.a.b(this.f20197a, SearchMapScreen.f90474e, 2);
    }
}
