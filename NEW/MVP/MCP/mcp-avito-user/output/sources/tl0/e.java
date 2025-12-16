package TL0;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.screens.J;
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

/* compiled from: VisualVasTracker.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LTL0/e;", "LTL0/d;", "_avito_vas-performance_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class e implements d {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final InterfaceC28499v f15600a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final InterfaceC28501x f15601b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final o f15602c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final String f15603d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public InterfaceC28489k f15604e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public InterfaceC28483e f15605f;

    @Inject
    public e(@k @com.avito.android.vas_performance.di.visual_legacy.b InterfaceC28499v interfaceC28499v, @k @com.avito.android.vas_performance.di.visual_legacy.b InterfaceC28501x interfaceC28501x, @k @com.avito.android.vas_performance.di.visual_legacy.b o oVar, @k @com.avito.android.vas_performance.di.visual_legacy.b String str) {
        this.f15600a = interfaceC28499v;
        this.f15601b = interfaceC28501x;
        this.f15602c = oVar;
        this.f15603d = str;
    }

    @Override // TL0.d
    public final void a(long j12) {
        this.f15600a.a(j12);
    }

    @Override // TL0.d
    public final void c() {
        com.avito.android.analytics.screens.tracker.P pE2 = this.f15602c.e(this.f15603d);
        pE2.start();
        this.f15604e = pE2;
    }

    @Override // TL0.d
    public final void d() {
        this.f15601b.b(-1L);
    }

    @Override // TL0.d
    public final void e() {
        this.f15601b.start();
    }

    @Override // TL0.d
    public final void f() {
        C28484f c28484fH = this.f15602c.h(this.f15603d);
        c28484fH.start();
        this.f15605f = c28484fH;
    }

    @Override // TL0.d
    public final void g() {
        InterfaceC28483e interfaceC28483e = this.f15605f;
        if (interfaceC28483e != null) {
            interfaceC28483e.d(null, J.b.f90385a);
        }
        this.f15605f = null;
    }

    @Override // TL0.d
    public final void h() {
        InterfaceC28489k interfaceC28489k = this.f15604e;
        if (interfaceC28489k != null) {
            InterfaceC28489k.a.a(interfaceC28489k, null, J.b.f90385a, 0L, 5);
        }
        this.f15604e = null;
    }

    @Override // TL0.d
    public final void i(@k ApiError apiError) {
        InterfaceC28489k interfaceC28489k = this.f15604e;
        if (interfaceC28489k != null) {
            InterfaceC28489k.a.a(interfaceC28489k, null, new J.a(apiError), 0L, 5);
        }
        this.f15604e = null;
    }

    @Override // TL0.d
    public final void j(@k ApiError apiError) {
        InterfaceC28483e interfaceC28483e = this.f15605f;
        if (interfaceC28483e != null) {
            interfaceC28483e.d(null, new J.a(apiError));
        }
        this.f15605f = null;
    }
}
