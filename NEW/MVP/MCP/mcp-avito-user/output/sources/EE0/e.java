package EE0;

import Y61.k;
import Y61.l;
import com.avito.android.analytics.screens.J;
import com.avito.android.analytics.screens.o;
import com.avito.android.analytics.screens.tracker.C28484f;
import com.avito.android.analytics.screens.tracker.InterfaceC28483e;
import com.avito.android.analytics.screens.tracker.InterfaceC28489k;
import com.avito.android.analytics.screens.tracker.InterfaceC28499v;
import com.avito.android.analytics.screens.tracker.InterfaceC28501x;
import com.avito.android.analytics.screens.tracker.P;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: SearchSubscriptionsTracker.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LEE0/e;", "LEE0/d;", "_avito_search_subscriptions_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class e implements d {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final InterfaceC28499v f3897a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final InterfaceC28501x f3898b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final o f3899c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public InterfaceC28489k f3900d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public InterfaceC28483e f3901e;

    @Inject
    public e(@k InterfaceC28499v interfaceC28499v, @k InterfaceC28501x interfaceC28501x, @k o oVar) {
        this.f3897a = interfaceC28499v;
        this.f3898b = interfaceC28501x;
        this.f3899c = oVar;
    }

    @Override // EE0.d
    public final void a(long j12) {
        this.f3897a.a(j12);
    }

    @Override // EE0.d
    public final void d() {
        this.f3898b.b(-1L);
    }

    @Override // EE0.d
    public final void e() {
        this.f3898b.start();
    }

    @Override // EE0.d
    public final void f() {
        InterfaceC28483e interfaceC28483e = this.f3901e;
        if (interfaceC28483e != null) {
            interfaceC28483e.d(null, J.b.f90385a);
        }
        this.f3901e = null;
    }

    @Override // EE0.d
    public final void g(@k Throwable th2) {
        InterfaceC28489k interfaceC28489k = this.f3900d;
        if (interfaceC28489k != null) {
            InterfaceC28489k.a.a(interfaceC28489k, null, new J.a(th2), 0L, 5);
        }
        this.f3900d = null;
    }

    @Override // EE0.d
    public final void h(@k Throwable th2) {
        InterfaceC28483e interfaceC28483e = this.f3901e;
        if (interfaceC28483e != null) {
            interfaceC28483e.d(null, new J.a(th2));
        }
        this.f3901e = null;
    }

    @Override // EE0.d
    public final void i() {
        InterfaceC28489k interfaceC28489k = this.f3900d;
        if (interfaceC28489k != null) {
            InterfaceC28489k.a.a(interfaceC28489k, null, J.b.f90385a, 0L, 5);
        }
        this.f3900d = null;
    }

    @Override // EE0.d
    public final void j() {
        P pE2 = this.f3899c.e("subscriptions");
        pE2.start();
        this.f3900d = pE2;
    }

    @Override // EE0.d
    public final void k() {
        C28484f c28484fH = this.f3899c.h("subscriptions");
        c28484fH.start();
        this.f3901e = c28484fH;
    }
}
