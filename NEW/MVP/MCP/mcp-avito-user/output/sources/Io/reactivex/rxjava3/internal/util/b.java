package io.reactivex.rxjava3.internal.util;

import io.reactivex.rxjava3.core.G;
import io.reactivex.rxjava3.core.InterfaceC41771d;
import io.reactivex.rxjava3.core.L;
import java.util.concurrent.atomic.AtomicReference;
import s41.C47998a;

/* compiled from: AtomicThrowable.java */
/* loaded from: classes8.dex */
public final class b extends AtomicReference<Throwable> {
    private static final long serialVersionUID = 3949248817947090603L;

    public final Throwable a() {
        return h.d(this);
    }

    public final boolean b(Throwable th2) {
        if (h.a(this, th2)) {
            return true;
        }
        C47998a.b(th2);
        return false;
    }

    public final void c() {
        Throwable thD = h.d(this);
        if (thD == null || thD == h.f404834a) {
            return;
        }
        C47998a.b(thD);
    }

    public final void d(InterfaceC41771d interfaceC41771d) {
        Throwable thD = h.d(this);
        if (thD == null) {
            interfaceC41771d.e();
        } else if (thD != h.f404834a) {
            interfaceC41771d.onError(thD);
        }
    }

    public final void e(G<?> g12) {
        Throwable thD = h.d(this);
        if (thD == null) {
            g12.e();
        } else if (thD != h.f404834a) {
            g12.onError(thD);
        }
    }

    public final void f(L<?> l12) {
        Throwable thD = h.d(this);
        if (thD == null || thD == h.f404834a) {
            return;
        }
        l12.onError(thD);
    }

    public final void g(org.reactivestreams.d<?> dVar) {
        Throwable thD = h.d(this);
        if (thD == null) {
            dVar.e();
        } else if (thD != h.f404834a) {
            dVar.onError(thD);
        }
    }
}
