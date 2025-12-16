package xI;

import Y61.k;
import Y61.l;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import androidx.view.InterfaceC22983P;
import com.avito.android.analytics.screens.HomeScreen;
import com.avito.android.analytics.screens.J;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.memory.consumption.f;
import java.lang.ref.WeakReference;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: HomeTracker.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LxI/f;", "LxI/e;", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class f implements e {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final ScreenPerformanceTracker f442323a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final C49843b f442324b = new C49843b();

    /* renamed from: c, reason: collision with root package name */
    @l
    public String f442325c;

    @Inject
    public f(@k ScreenPerformanceTracker screenPerformanceTracker, @k Fragment fragment) {
        this.f442323a = screenPerformanceTracker;
        new WeakReference(fragment.l1());
    }

    @Override // xI.e
    public final void L(@l String str) {
        this.f442325c = str;
        HomeScreen.f90372d.getClass();
        String str2 = HomeScreen.f90375g;
        ScreenPerformanceTracker.LoadingType loadingType = ScreenPerformanceTracker.LoadingType.f90786c;
        ScreenPerformanceTracker.a.d(this.f442323a, str2, loadingType, J.b.f90385a, null, 8);
        String str3 = HomeScreen.f90374f;
        if (this.f442325c != null) {
            loadingType = ScreenPerformanceTracker.LoadingType.f90785b;
        }
        this.f442323a.s(str3, loadingType);
    }

    @Override // xI.e, ZX.a
    public final void a(long j12) {
        this.f442323a.a(j12);
    }

    @Override // xI.e, com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker
    public final void b(@k RecyclerView recyclerView) {
        this.f442323a.b(recyclerView);
    }

    @Override // xI.e, ZX.a
    public final void c(@k InterfaceC22983P interfaceC22983P, @k f.a aVar) {
        ScreenPerformanceTracker screenPerformanceTracker = this.f442323a;
        screenPerformanceTracker.c(interfaceC22983P, aVar);
        screenPerformanceTracker.B(this.f442324b, interfaceC22983P);
    }

    @Override // xI.e, ZX.a
    public final void d() {
        this.f442323a.d();
    }

    @Override // xI.e, ZX.a
    public final void e() {
        this.f442323a.e();
    }

    @Override // xI.e
    public final void g() {
        HomeScreen.f90372d.getClass();
        ScreenPerformanceTracker.a.d(this.f442323a, HomeScreen.f90373e, ScreenPerformanceTracker.LoadingType.f90785b, J.b.f90385a, null, 8);
    }

    @Override // xI.e
    public final void h() {
        HomeScreen.f90372d.getClass();
        ScreenPerformanceTracker.a.c(this.f442323a, HomeScreen.f90373e, J.b.f90385a, null, 4);
    }

    @Override // xI.e
    public final void i() {
        HomeScreen.f90372d.getClass();
        this.f442323a.m(HomeScreen.f90373e);
    }

    @Override // xI.e
    public final void j(@k Throwable th2) {
        HomeScreen.f90372d.getClass();
        ScreenPerformanceTracker.a.d(this.f442323a, HomeScreen.f90373e, ScreenPerformanceTracker.LoadingType.f90785b, new J.a(th2), null, 8);
    }

    @Override // xI.e
    public final void stop() {
    }
}
