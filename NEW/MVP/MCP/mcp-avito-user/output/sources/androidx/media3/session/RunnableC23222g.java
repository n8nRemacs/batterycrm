package androidx.media3.session;

import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import androidx.media.AbstractServiceC23085i;
import androidx.media.C;
import androidx.media3.common.H;
import androidx.media3.common.util.C23110a;
import androidx.media3.common.util.C23118i;
import androidx.media3.common.util.InterfaceC23119j;
import androidx.media3.session.A1;
import androidx.media3.session.B0;
import androidx.media3.session.C23225h;
import androidx.media3.session.M0;
import androidx.media3.session.O0;
import com.google.common.collect.AbstractC37401r1;
import com.google.common.util.concurrent.AbstractC37532c;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: R8$$SyntheticClass */
/* renamed from: androidx.media3.session.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC23222g implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f52464b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f52465c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f52466d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f52467e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f52468f;

    public /* synthetic */ RunnableC23222g(C23225h c23225h, AtomicBoolean atomicBoolean, C23225h.b bVar, AtomicBoolean atomicBoolean2) {
        this.f52464b = 0;
        this.f52465c = c23225h;
        this.f52466d = atomicBoolean;
        this.f52468f = bVar;
        this.f52467e = atomicBoolean2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z12 = false;
        boolean z13 = true;
        switch (this.f52464b) {
            case 0:
                C23225h c23225h = (C23225h) this.f52465c;
                AtomicBoolean atomicBoolean = (AtomicBoolean) this.f52466d;
                C23225h.b bVar = (C23225h.b) this.f52468f;
                AtomicBoolean atomicBoolean2 = (AtomicBoolean) this.f52467e;
                synchronized (c23225h.f52476a) {
                    try {
                        if (atomicBoolean.get()) {
                            atomicBoolean2.set(true);
                        } else {
                            c23225h.b(bVar);
                        }
                    } finally {
                    }
                }
                return;
            case 1:
                int i12 = B0.f51923o;
                B0 b02 = (B0) this.f52465c;
                C23225h<C.b> c23225h2 = b02.f52450l;
                O0.g gVar = (O0.g) this.f52466d;
                if (c23225h2.i(gVar, 50001)) {
                    G0 g02 = b02.f51925n;
                    C1.j(g02.f52291e, (Bundle) this.f52467e);
                    g02.q(gVar, (String) this.f52468f);
                    return;
                }
                return;
            case 2:
                B0 b03 = (B0) this.f52465c;
                O0.g gVar2 = (O0.g) this.f52466d;
                AbstractServiceC23085i.C1812i c1812i = (AbstractServiceC23085i.C1812i) this.f52467e;
                Bundle bundle = (Bundle) this.f52468f;
                int i13 = B0.f51923o;
                if (!b03.f52450l.i(gVar2, 50005)) {
                    c1812i.f(null);
                    return;
                }
                O0.f fVar = gVar2.f52222d;
                C23110a.h(fVar);
                B0.b bVar2 = (B0.b) fVar;
                synchronized (bVar2.f51926a) {
                    bVar2.f51928c.add(new B0.d());
                }
                C1.j(b03.f51925n.f52291e, bundle);
                b03.f51925n.getClass();
                throw null;
            case 3:
                int i14 = G0.f52048x;
                G0 g03 = (G0) this.f52465c;
                g03.getClass();
                C23252q c23252q = (C23252q) G0.s((com.google.common.util.concurrent.D0) this.f52466d);
                if (c23252q == null || c23252q.f52617b != 0) {
                    g03.r((O0.f) this.f52467e, (String) this.f52468f);
                    return;
                }
                return;
            case 4:
                com.google.common.util.concurrent.D0 d02 = (com.google.common.util.concurrent.D0) this.f52466d;
                M0.c cVar = (M0.c) this.f52467e;
                O0 o02 = (O0) this.f52468f;
                M0 m02 = (M0) this.f52465c;
                m02.getClass();
                try {
                    J j12 = (J) ((AbstractC37532c) d02).get(0L, TimeUnit.MILLISECONDS);
                    J jA2 = m02.a(o02);
                    if (jA2 == null || jA2.getCurrentTimeline().x() || jA2.getPlaybackState() == 1) {
                        z13 = false;
                    }
                    if (z13) {
                        cVar.f52142b.f(cVar.f52143c, false);
                    }
                    j12.F(cVar);
                    return;
                } catch (InterruptedException | CancellationException | ExecutionException | TimeoutException unused) {
                    m02.f52131a.g(o02);
                    return;
                }
            case 5:
                T0 t02 = ((ServiceC23218e1) this.f52465c).f52449k;
                ((AtomicReference) this.f52466d).set(t02.f52290d.d(t02.f52296j, (O0.g) this.f52467e));
                ((C23118i) this.f52468f).d();
                return;
            case 6:
                O0.g gVar3 = (O0.g) this.f52466d;
                T0 t03 = (T0) this.f52467e;
                O0.d dVar = t03.f52290d;
                InterfaceC23243n interfaceC23243n = (InterfaceC23243n) this.f52468f;
                A1 a12 = (A1) this.f52465c;
                C23225h<IBinder> c23225h3 = a12.f51918q;
                try {
                    a12.f51919r.remove(gVar3);
                    if (!t03.f()) {
                        A1.a aVar = (A1.a) gVar3.f52222d;
                        C23110a.h(aVar);
                        IBinder iBinderAsBinder = aVar.f51922a.asBinder();
                        O0.e eVarD = dVar.d(t03.f52296j, gVar3);
                        boolean z14 = eVarD.f52215a;
                        if (z14 || gVar3.f52221c) {
                            if (!z14) {
                                eVarD = new O0.e(true, L1.f52123c, H.c.f47239c, null);
                            }
                            if (c23225h3.g(gVar3)) {
                                gVar3.toString();
                                androidx.media3.common.util.s.g();
                            }
                            c23225h3.a(iBinderAsBinder, gVar3, eVarD.f52216b, eVarD.f52217c);
                            J1 j1F = c23225h3.f(gVar3);
                            C23110a.h(j1F);
                            G1 g12 = t03.f52302p;
                            D1 d1G4 = a12.g4(g12.n0());
                            AbstractC37401r1<C23213d> abstractC37401r1 = eVarD.f52218d;
                            if (abstractC37401r1 == null) {
                                abstractC37401r1 = t03.f52308v;
                            }
                            C23234k c23234k = new C23234k(1001001300, 2, a12, null, abstractC37401r1, eVarD.f52216b, eVarD.f52217c, g12.n(), t03.f52295i.f52238b.getExtras(), d1G4);
                            if (!t03.f()) {
                                try {
                                    interfaceC23243n.a2(j1F.a(), c23234k.k());
                                    z12 = true;
                                } catch (RemoteException unused2) {
                                }
                                dVar.getClass();
                                if (z12) {
                                    return;
                                }
                            }
                        }
                    }
                    try {
                        interfaceC23243n.f();
                        return;
                    } catch (RemoteException unused3) {
                        return;
                    }
                } catch (Throwable th2) {
                    if (!z12) {
                        try {
                            interfaceC23243n.f();
                        } catch (RemoteException unused4) {
                        }
                    }
                    throw th2;
                }
            case 7:
                InterfaceC23119j interfaceC23119j = (InterfaceC23119j) this.f52467e;
                com.google.common.util.concurrent.D0 d03 = (com.google.common.util.concurrent.D0) this.f52468f;
                int i15 = A1.f51915u;
                boolean zF2 = ((T0) this.f52465c).f();
                com.google.common.util.concurrent.e1 e1Var = (com.google.common.util.concurrent.e1) this.f52466d;
                if (zF2) {
                    e1Var.n(null);
                    return;
                }
                try {
                    interfaceC23119j.accept(d03);
                    e1Var.n(null);
                    return;
                } catch (Throwable th3) {
                    e1Var.o(th3);
                    return;
                }
            default:
                int i16 = A1.f51915u;
                T0 t04 = (T0) this.f52465c;
                if (t04.f()) {
                    return;
                }
                ((A1.c) this.f52466d).e(t04.f52302p, (O0.g) this.f52467e, (List) this.f52468f);
                return;
        }
    }

    public /* synthetic */ RunnableC23222g(B0 b02, O0.g gVar, AbstractServiceC23085i.C1812i c1812i, Bundle bundle, String str) {
        this.f52464b = 2;
        this.f52465c = b02;
        this.f52466d = gVar;
        this.f52467e = c1812i;
        this.f52468f = bundle;
    }

    public /* synthetic */ RunnableC23222g(Object obj, Object obj2, Object obj3, Object obj4, int i12) {
        this.f52464b = i12;
        this.f52465c = obj;
        this.f52466d = obj2;
        this.f52467e = obj3;
        this.f52468f = obj4;
    }
}
