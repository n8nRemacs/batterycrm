package TL0;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.screens.J;
import com.avito.android.analytics.screens.PerformanceVasScreen;
import com.avito.android.analytics.screens.o;
import com.avito.android.analytics.screens.tracker.C28484f;
import com.avito.android.analytics.screens.tracker.InterfaceC28483e;
import com.avito.android.analytics.screens.tracker.InterfaceC28489k;
import com.avito.android.analytics.screens.tracker.InterfaceC28499v;
import com.avito.android.analytics.screens.tracker.InterfaceC28501x;
import com.avito.android.remote.error.ApiError;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: PerformanceVasTracker.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LTL0/b;", "LTL0/a;", "_avito_vas-performance_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class b implements a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final InterfaceC28499v f15592a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final InterfaceC28501x f15593b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final o f15594c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public InterfaceC28489k f15595d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public InterfaceC28483e f15596e;

    @Inject
    public b(@com.avito.android.vas_performance.di.perfomance.e @k InterfaceC28499v interfaceC28499v, @com.avito.android.vas_performance.di.perfomance.e @k InterfaceC28501x interfaceC28501x, @com.avito.android.vas_performance.di.perfomance.e @k o oVar) {
        this.f15592a = interfaceC28499v;
        this.f15593b = interfaceC28501x;
        this.f15594c = oVar;
    }

    @Override // TL0.a
    public final void c() {
        PerformanceVasScreen.f90446d.getClass();
        com.avito.android.analytics.screens.tracker.P pE2 = this.f15594c.e(PerformanceVasScreen.f90447e);
        pE2.start();
        this.f15595d = pE2;
    }

    @Override // TL0.a
    public final void d() {
        this.f15593b.b(-1L);
    }

    @Override // TL0.a
    public final void e() {
        this.f15593b.start();
    }

    @Override // TL0.a
    public final void f() {
        PerformanceVasScreen.f90446d.getClass();
        C28484f c28484fH = this.f15594c.h(PerformanceVasScreen.f90447e);
        c28484fH.start();
        this.f15596e = c28484fH;
    }

    @Override // TL0.a
    public final void g() {
        InterfaceC28483e interfaceC28483e = this.f15596e;
        if (interfaceC28483e != null) {
            interfaceC28483e.d(null, J.b.f90385a);
        }
        this.f15596e = null;
    }

    @Override // TL0.a
    public final void h() {
        InterfaceC28489k interfaceC28489k = this.f15595d;
        if (interfaceC28489k != null) {
            InterfaceC28489k.a.a(interfaceC28489k, null, J.b.f90385a, 0L, 5);
        }
        this.f15595d = null;
    }

    @Override // TL0.a
    public final void i(@k ApiError apiError) {
        InterfaceC28489k interfaceC28489k = this.f15595d;
        if (interfaceC28489k != null) {
            InterfaceC28489k.a.a(interfaceC28489k, null, new J.a(apiError), 0L, 5);
        }
        this.f15595d = null;
    }

    @Override // TL0.a
    public final void j(@k ApiError apiError) {
        InterfaceC28483e interfaceC28483e = this.f15596e;
        if (interfaceC28483e != null) {
            interfaceC28483e.d(null, new J.a(apiError));
        }
        this.f15596e = null;
    }
}
