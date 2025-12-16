package coil.request;

import androidx.view.InterfaceC22982O;
import androidx.view.InterfaceC22983P;
import androidx.view.Lifecycle;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.C43262l0;
import kotlinx.coroutines.D0;
import kotlinx.coroutines.N0;
import kotlinx.coroutines.V0;
import kotlinx.coroutines.internal.K;

/* compiled from: RequestDelegate.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcoil/request/A;", "Lcoil/request/v;", "coil-base_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class A implements v {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final coil.n f58603b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final p f58604c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final K2.d<?> f58605d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final Lifecycle f58606e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final N0 f58607f;

    public A(@Y61.k coil.n nVar, @Y61.k p pVar, @Y61.k K2.d dVar, @Y61.k Lifecycle lifecycle, @Y61.k N0 n02) {
        this.f58603b = nVar;
        this.f58604c = pVar;
        this.f58605d = dVar;
        this.f58606e = lifecycle;
        this.f58607f = n02;
    }

    @Override // coil.request.v
    public final void KO() {
        K2.d<?> dVar = this.f58605d;
        if (dVar.getView().isAttachedToWindow()) {
            return;
        }
        C c12 = coil.util.l.c(dVar.getView());
        A a12 = c12.f58612e;
        if (a12 != null) {
            a12.f58607f.c(null);
            K2.d<?> dVar2 = a12.f58605d;
            boolean z12 = dVar2 instanceof InterfaceC22982O;
            Lifecycle lifecycle = a12.f58606e;
            if (z12) {
                lifecycle.c((InterfaceC22982O) dVar2);
            }
            lifecycle.c(a12);
        }
        c12.f58612e = this;
        throw new CancellationException("'ViewTarget.view' must be attached to a window.");
    }

    @Override // androidx.view.InterfaceC23057q
    public final void onDestroy(@Y61.k InterfaceC22983P interfaceC22983P) {
        C c12 = coil.util.l.c(this.f58605d.getView());
        synchronized (c12) {
            N0 n02 = c12.f58611d;
            if (n02 != null) {
                ((V0) n02).c(null);
            }
            D0 d02 = D0.f410691b;
            kotlinx.coroutines.scheduling.c cVar = C43262l0.f411945a;
            c12.f58611d = C43259k.d(d02, K.f411877a.y(), null, new B(c12, null), 2);
            c12.f58610c = null;
        }
    }

    @Override // coil.request.v
    public final void start() {
        Lifecycle lifecycle = this.f58606e;
        lifecycle.a(this);
        K2.d<?> dVar = this.f58605d;
        if (dVar instanceof InterfaceC22982O) {
            InterfaceC22982O interfaceC22982O = (InterfaceC22982O) dVar;
            lifecycle.c(interfaceC22982O);
            lifecycle.a(interfaceC22982O);
        }
        C c12 = coil.util.l.c(dVar.getView());
        A a12 = c12.f58612e;
        if (a12 != null) {
            a12.f58607f.c(null);
            K2.d<?> dVar2 = a12.f58605d;
            boolean z12 = dVar2 instanceof InterfaceC22982O;
            Lifecycle lifecycle2 = a12.f58606e;
            if (z12) {
                lifecycle2.c((InterfaceC22982O) dVar2);
            }
            lifecycle2.c(a12);
        }
        c12.f58612e = this;
    }
}
