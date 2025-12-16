package androidx.media3.session;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.view.Surface;
import androidx.media.C;
import androidx.media3.common.BinderC23095i;
import androidx.media3.common.H;
import androidx.media3.common.U;
import androidx.media3.common.V;
import androidx.media3.common.util.C23110a;
import androidx.media3.common.util.C23114e;
import androidx.media3.common.util.InterfaceC23119j;
import androidx.media3.session.A1;
import androidx.media3.session.C23225h;
import androidx.media3.session.D1;
import androidx.media3.session.InterfaceC23246o;
import androidx.media3.session.O0;
import com.google.common.collect.AbstractC37366l1;
import com.google.common.collect.AbstractC37401r1;
import com.google.common.collect.N4;
import com.google.common.util.concurrent.C37568u0;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;

/* compiled from: MediaSessionStub.java */
/* loaded from: classes.dex */
final class A1 extends InterfaceC23246o.b {

    /* renamed from: u, reason: collision with root package name */
    public static final /* synthetic */ int f51915u = 0;

    /* renamed from: b, reason: collision with root package name */
    public final WeakReference<T0> f51916b;

    /* renamed from: p, reason: collision with root package name */
    public final androidx.media.C f51917p;

    /* renamed from: q, reason: collision with root package name */
    public final C23225h<IBinder> f51918q;

    /* renamed from: r, reason: collision with root package name */
    public final Set<O0.g> f51919r = Collections.synchronizedSet(new HashSet());

    /* renamed from: s, reason: collision with root package name */
    public AbstractC37366l1<androidx.media3.common.Q, String> f51920s = AbstractC37366l1.t();

    /* renamed from: t, reason: collision with root package name */
    public int f51921t;

    /* compiled from: MediaSessionStub.java */
    public static final class a implements O0.f {

        /* renamed from: a, reason: collision with root package name */
        public final InterfaceC23243n f51922a;

        public a(InterfaceC23243n interfaceC23243n) {
            this.f51922a = interfaceC23243n;
        }

        @Override // androidx.media3.session.O0.f
        public final void a(int i12, C23252q<?> c23252q) {
            this.f51922a.b1(i12, c23252q.k());
        }

        @Override // androidx.media3.session.O0.f
        public final void b(int i12, D1 d12, H.c cVar, boolean z12, boolean z13, int i13) {
            C23110a.g(i13 != 0);
            boolean z14 = z12 || !cVar.a(17);
            boolean z15 = z13 || !cVar.a(30);
            InterfaceC23243n interfaceC23243n = this.f51922a;
            if (i13 >= 2) {
                interfaceC23243n.N3(i12, d12.q(cVar, z12, z13), new D1.b(z14, z15).k());
            } else {
                interfaceC23243n.M1(i12, d12.q(cVar, z12, true), z14);
            }
        }

        @Override // androidx.media3.session.O0.f
        public final void c(int i12, O1 o12) {
            this.f51922a.m2(i12, o12.k());
        }

        @Override // androidx.media3.session.O0.f
        public final void d(int i12, N1 n12, boolean z12, boolean z13) {
            this.f51922a.L3(i12, n12.a(z12, z13));
        }

        @Override // androidx.media3.session.O0.f
        public final void e(int i12, H.c cVar) {
            this.f51922a.t0(i12, cVar.k());
        }

        public final boolean equals(@j.P Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || obj.getClass() != a.class) {
                return false;
            }
            return androidx.media3.common.util.M.a(this.f51922a.asBinder(), ((a) obj).f51922a.asBinder());
        }

        @Override // androidx.media3.session.O0.f
        public final void f() {
            this.f51922a.f();
        }

        @Override // androidx.media3.session.O0.f
        public final void g(int i12) {
            this.f51922a.g(i12);
        }

        public final int hashCode() {
            return Objects.hash(this.f51922a.asBinder());
        }
    }

    /* compiled from: MediaSessionStub.java */
    public interface b {
        void b(G1 g12, O0.g gVar);
    }

    /* compiled from: MediaSessionStub.java */
    public interface c {
        void e(G1 g12, O0.g gVar, List<androidx.media3.common.z> list);
    }

    /* compiled from: MediaSessionStub.java */
    public interface d {
        void c(G1 g12, O0.i iVar);
    }

    /* compiled from: MediaSessionStub.java */
    public interface e<T, K extends T0> {
        T d(K k12, O0.g gVar, int i12);
    }

    public A1(T0 t02) {
        this.f51916b = new WeakReference<>(t02);
        this.f51917p = androidx.media.C.a(t02.f52291e);
        this.f51918q = new C23225h<>(t02);
    }

    public static <T, K extends T0> com.google.common.util.concurrent.D0<Void> h4(K k12, O0.g gVar, int i12, e<com.google.common.util.concurrent.D0<T>, K> eVar, InterfaceC23119j<com.google.common.util.concurrent.D0<T>> interfaceC23119j) {
        if (k12.f()) {
            return C37568u0.e();
        }
        com.google.common.util.concurrent.D0<T> d0D = eVar.d(k12, gVar, i12);
        com.google.common.util.concurrent.e1 e1Var = new com.google.common.util.concurrent.e1();
        d0D.N(new RunnableC23222g(k12, e1Var, interfaceC23119j, d0D, 7), com.google.common.util.concurrent.Q0.a());
        return e1Var;
    }

    public static void k4(O0.g gVar, int i12, O1 o12) {
        try {
            O0.f fVar = gVar.f52222d;
            C23110a.h(fVar);
            fVar.c(i12, o12);
        } catch (RemoteException e12) {
            androidx.media3.common.util.s.h("Failed to send result to controller " + gVar, e12);
        }
    }

    public static C23264u0 l4(InterfaceC23119j interfaceC23119j) {
        return new C23264u0(new C23264u0(interfaceC23119j, 7), 6);
    }

    @Override // androidx.media3.session.InterfaceC23246o
    public final void A0(@j.P InterfaceC23243n interfaceC23243n, int i12, @j.P Bundle bundle, boolean z12) {
        if (interfaceC23243n == null || bundle == null) {
            return;
        }
        try {
            j4(interfaceC23243n, i12, 31, new C23268v1(new N(11, new C23242m1(0, (androidx.media3.common.z) androidx.media3.common.z.f47977o.fromBundle(bundle), z12), new C23228i(27)), 1));
        } catch (RuntimeException e12) {
            androidx.media3.common.util.s.h("Ignoring malformed Bundle for MediaItem", e12);
        }
    }

    @Override // androidx.media3.session.InterfaceC23246o
    public final void B3(@j.P InterfaceC23243n interfaceC23243n, int i12, int i13, int i14) {
        if (interfaceC23243n == null) {
            return;
        }
        j4(interfaceC23243n, i12, 33, l4(new C23251p1(i13, i14, 0)));
    }

    @Override // androidx.media3.session.InterfaceC23246o
    public final void C3(@j.P InterfaceC23243n interfaceC23243n, int i12, boolean z12) {
        if (interfaceC23243n == null) {
            return;
        }
        j4(interfaceC23243n, i12, 26, l4(new C23227h1(z12, 1)));
    }

    @Override // androidx.media3.session.InterfaceC23246o
    public final void D0(@j.P InterfaceC23243n interfaceC23243n, int i12) {
        O0.g gVarE;
        if (interfaceC23243n == null || (gVarE = this.f51918q.e(interfaceC23243n.asBinder())) == null) {
            return;
        }
        j4(interfaceC23243n, i12, 1, l4(new C23264u0(this, gVarE)));
    }

    @Override // androidx.media3.session.InterfaceC23246o
    public final void D2(@j.P InterfaceC23243n interfaceC23243n) {
        if (interfaceC23243n == null) {
            return;
        }
        long jClearCallingIdentity = Binder.clearCallingIdentity();
        try {
            T0 t02 = this.f51916b.get();
            if (t02 != null && !t02.f()) {
                O0.g gVarE = this.f51918q.e(interfaceC23243n.asBinder());
                if (gVarE != null) {
                    androidx.media3.common.util.M.I(t02.f52297k, new RunnableC23253q0(12, this, gVarE));
                }
            }
        } finally {
            Binder.restoreCallingIdentity(jClearCallingIdentity);
        }
    }

    @Override // androidx.media3.session.InterfaceC23246o
    public final void E0(@j.P InterfaceC23243n interfaceC23243n, int i12, boolean z12) {
        if (interfaceC23243n == null) {
            return;
        }
        j4(interfaceC23243n, i12, 1, l4(new C23227h1(z12, 0)));
    }

    @Override // androidx.media3.session.InterfaceC23246o
    public final void E2(@j.P InterfaceC23243n interfaceC23243n, int i12, int i13, int i14) {
        if (interfaceC23243n == null) {
            return;
        }
        j4(interfaceC23243n, i12, 20, new C23264u0(new C23221f1(this, i13, i14), 6));
    }

    @Override // androidx.media3.session.InterfaceC23246o
    public final void H1(@j.P InterfaceC23243n interfaceC23243n, int i12, int i13) {
        if (interfaceC23243n == null) {
            return;
        }
        j4(interfaceC23243n, i12, 34, l4(new C23261t0(i13, 2)));
    }

    @Override // androidx.media3.session.InterfaceC23246o
    public final void J3(@j.P InterfaceC23243n interfaceC23243n, int i12, @j.P Surface surface) {
        if (interfaceC23243n == null) {
            return;
        }
        j4(interfaceC23243n, i12, 27, l4(new C23264u0(surface, 4)));
    }

    @Override // androidx.media3.session.InterfaceC23246o
    public final void K2(@j.P InterfaceC23243n interfaceC23243n, int i12) {
        if (interfaceC23243n == null) {
            return;
        }
        j4(interfaceC23243n, i12, 3, l4(new C23228i(12)));
    }

    @Override // androidx.media3.session.InterfaceC23246o
    public final void K3(@j.P InterfaceC23243n interfaceC23243n, int i12) {
        if (interfaceC23243n == null) {
            return;
        }
        j4(interfaceC23243n, i12, 2, l4(new C23228i(23)));
    }

    @Override // androidx.media3.session.InterfaceC23246o
    public final void L0(@j.P InterfaceC23243n interfaceC23243n, int i12, final boolean z12, final int i13) {
        if (interfaceC23243n == null) {
            return;
        }
        j4(interfaceC23243n, i12, 34, l4(new InterfaceC23119j() { // from class: androidx.media3.session.q1
            @Override // androidx.media3.common.util.InterfaceC23119j
            public final void accept(Object obj) {
                int i14 = A1.f51915u;
                ((G1) obj).r(i13, z12);
            }
        }));
    }

    @Override // androidx.media3.session.InterfaceC23246o
    public final void M0(@j.P InterfaceC23243n interfaceC23243n, int i12, @j.P Bundle bundle, @j.P Bundle bundle2) {
        if (interfaceC23243n == null || bundle == null || bundle2 == null) {
            return;
        }
        try {
            K1 k12 = (K1) K1.f52114j.fromBundle(bundle);
            f4(interfaceC23243n, i12, k12, 0, new C23268v1(new N(10, k12, bundle2), 1));
        } catch (RuntimeException e12) {
            androidx.media3.common.util.s.h("Ignoring malformed Bundle for SessionCommand", e12);
        }
    }

    @Override // androidx.media3.session.InterfaceC23246o
    public final void N0(@j.P InterfaceC23243n interfaceC23243n, int i12, @j.P IBinder iBinder, int i13, long j12) {
        if (interfaceC23243n == null || iBinder == null) {
            return;
        }
        try {
            j4(interfaceC23243n, i12, 20, new C23268v1(new N(11, new C23233j1(i13, j12, C23114e.a(androidx.media3.common.z.f47977o, BinderC23095i.a(iBinder))), new C23228i(27)), 1));
        } catch (RuntimeException e12) {
            androidx.media3.common.util.s.h("Ignoring malformed Bundle for MediaItem", e12);
        }
    }

    @Override // androidx.media3.session.InterfaceC23246o
    public final void O2(InterfaceC23243n interfaceC23243n, int i12, int i13, int i14, IBinder iBinder) {
        if (interfaceC23243n == null || iBinder == null) {
            return;
        }
        try {
            j4(interfaceC23243n, i12, 20, new C23268v1(new N(12, new C23264u0(C23114e.a(androidx.media3.common.z.f47977o, BinderC23095i.a(iBinder)), 2), new C23221f1(this, i13, i14)), 1));
        } catch (RuntimeException e12) {
            androidx.media3.common.util.s.h("Ignoring malformed Bundle for MediaItem", e12);
        }
    }

    @Override // androidx.media3.session.InterfaceC23246o
    public final void Q1(@j.P InterfaceC23243n interfaceC23243n, int i12, Bundle bundle) {
        if (interfaceC23243n == null) {
            return;
        }
        try {
            androidx.media3.common.U u12 = androidx.media3.common.U.f47456B;
            j4(interfaceC23243n, i12, 29, l4(new N(9, this, new androidx.media3.common.U(new U.a(bundle)))));
        } catch (RuntimeException e12) {
            androidx.media3.common.util.s.h("Ignoring malformed Bundle for TrackSelectionParameters", e12);
        }
    }

    @Override // androidx.media3.session.InterfaceC23246o
    public final void T1(@j.P InterfaceC23243n interfaceC23243n, int i12) {
        if (interfaceC23243n == null) {
            return;
        }
        j4(interfaceC23243n, i12, 1, l4(new C23228i(17)));
    }

    @Override // androidx.media3.session.InterfaceC23246o
    public final void W0(@j.P InterfaceC23243n interfaceC23243n, int i12, @j.P Bundle bundle) {
        A0(interfaceC23243n, i12, bundle, true);
    }

    @Override // androidx.media3.session.InterfaceC23246o
    public final void Z(@j.P InterfaceC23243n interfaceC23243n, int i12, @j.P Bundle bundle, long j12) {
        if (interfaceC23243n == null || bundle == null) {
            return;
        }
        try {
            j4(interfaceC23243n, i12, 31, new C23268v1(new N(11, new O((androidx.media3.common.z) androidx.media3.common.z.f47977o.fromBundle(bundle), j12), new C23228i(27)), 1));
        } catch (RuntimeException e12) {
            androidx.media3.common.util.s.h("Ignoring malformed Bundle for MediaItem", e12);
        }
    }

    @Override // androidx.media3.session.InterfaceC23246o
    public final void Z0(@j.P InterfaceC23243n interfaceC23243n, int i12) {
        if (interfaceC23243n == null) {
            return;
        }
        long jClearCallingIdentity = Binder.clearCallingIdentity();
        try {
            T0 t02 = this.f51916b.get();
            if (t02 != null && !t02.f()) {
                androidx.media3.common.util.M.I(t02.f52297k, new RunnableC23253q0(11, this, interfaceC23243n));
            }
        } finally {
            Binder.restoreCallingIdentity(jClearCallingIdentity);
        }
    }

    @Override // androidx.media3.session.InterfaceC23246o
    public final void a0(@j.P InterfaceC23243n interfaceC23243n, int i12, final long j12) {
        if (interfaceC23243n == null) {
            return;
        }
        j4(interfaceC23243n, i12, 5, l4(new InterfaceC23119j() { // from class: androidx.media3.session.t1
            @Override // androidx.media3.common.util.InterfaceC23119j
            public final void accept(Object obj) {
                int i13 = A1.f51915u;
                ((G1) obj).seekTo(j12);
            }
        }));
    }

    @Override // androidx.media3.session.InterfaceC23246o
    public final void a1(@j.P InterfaceC23243n interfaceC23243n, int i12, int i13) {
        if (interfaceC23243n == null) {
            return;
        }
        j4(interfaceC23243n, i12, 25, l4(new C23261t0(i13, 5)));
    }

    @Override // androidx.media3.session.InterfaceC23246o
    public final void a3(@j.P InterfaceC23243n interfaceC23243n, int i12, boolean z12) {
        if (interfaceC23243n == null) {
            return;
        }
        j4(interfaceC23243n, i12, 14, l4(new C23227h1(z12, 2)));
    }

    @Override // androidx.media3.session.InterfaceC23246o
    public final void b4(@j.P InterfaceC23243n interfaceC23243n, int i12) {
        if (interfaceC23243n == null) {
            return;
        }
        j4(interfaceC23243n, i12, 26, l4(new C23228i(15)));
    }

    @Override // androidx.media3.session.InterfaceC23246o
    public final void e3(@j.P InterfaceC23243n interfaceC23243n, int i12, @j.P IBinder iBinder, boolean z12) {
        if (interfaceC23243n == null || iBinder == null) {
            return;
        }
        try {
            j4(interfaceC23243n, i12, 20, new C23268v1(new N(11, new C23242m1(1, C23114e.a(androidx.media3.common.z.f47977o, BinderC23095i.a(iBinder)), z12), new C23228i(27)), 1));
        } catch (RuntimeException e12) {
            androidx.media3.common.util.s.h("Ignoring malformed Bundle for MediaItem", e12);
        }
    }

    public final void e4(InterfaceC23243n interfaceC23243n, int i12, String str, int i13, int i14) {
        C.b bVar = new C.b(str, i13, i14);
        O0.g gVar = new O0.g(bVar, i12, this.f51917p.b(bVar), new a(interfaceC23243n));
        T0 t02 = this.f51916b.get();
        if (t02 == null || t02.f()) {
            try {
                interfaceC23243n.f();
            } catch (RemoteException unused) {
            }
        } else {
            this.f51919r.add(gVar);
            androidx.media3.common.util.M.I(t02.f52297k, new RunnableC23222g(this, gVar, t02, interfaceC23243n, 6));
        }
    }

    public final <K extends T0> void f4(InterfaceC23243n interfaceC23243n, final int i12, @j.P final K1 k12, final int i13, final e<com.google.common.util.concurrent.D0<Void>, K> eVar) {
        long jClearCallingIdentity = Binder.clearCallingIdentity();
        try {
            final T0 t02 = this.f51916b.get();
            if (t02 != null && !t02.f()) {
                final O0.g gVarE = this.f51918q.e(interfaceC23243n.asBinder());
                if (gVarE == null) {
                    return;
                }
                androidx.media3.common.util.M.I(t02.f52297k, new Runnable() { // from class: androidx.media3.session.u1
                    @Override // java.lang.Runnable
                    public final void run() {
                        C23225h<IBinder> c23225h = this.f52640b.f51918q;
                        O0.g gVar = gVarE;
                        if (c23225h.g(gVar)) {
                            K1 k13 = k12;
                            int i14 = i12;
                            if (k13 != null) {
                                if (!c23225h.j(gVar, k13)) {
                                    A1.k4(gVar, i14, new O1(-4));
                                    return;
                                }
                            } else if (!c23225h.i(gVar, i13)) {
                                A1.k4(gVar, i14, new O1(-4));
                                return;
                            }
                            eVar.d(t02, gVar, i14);
                        }
                    }
                });
            }
        } finally {
            Binder.restoreCallingIdentity(jClearCallingIdentity);
        }
    }

    public final D1 g4(D1 d12) {
        AbstractC37401r1<V.a> abstractC37401r1A = d12.f51973E.a();
        AbstractC37401r1.a aVarS = AbstractC37401r1.s();
        AbstractC37366l1.a aVar = new AbstractC37366l1.a();
        for (int i12 = 0; i12 < abstractC37401r1A.size(); i12++) {
            V.a aVar2 = abstractC37401r1A.get(i12);
            androidx.media3.common.Q q12 = aVar2.f47545c;
            String string = this.f51920s.get(q12);
            if (string == null) {
                StringBuilder sb2 = new StringBuilder();
                int i13 = this.f51921t;
                this.f51921t = i13 + 1;
                int i14 = androidx.media3.common.util.M.f47887a;
                sb2.append(Integer.toString(i13, 36));
                sb2.append("-");
                sb2.append(q12.f47440c);
                string = sb2.toString();
            }
            aVar.f(q12, string);
            aVarS.g(new V.a(aVar2.f47545c.a(string), aVar2.f47546d, aVar2.f47547e, aVar2.f47548f));
        }
        this.f51920s = aVar.b();
        D1 d1A = d12.a(new androidx.media3.common.V(aVarS.i()));
        androidx.media3.common.U u12 = d1A.f51974F;
        if (u12.f47508z.isEmpty()) {
            return d1A;
        }
        U.a aVarC = u12.a().c();
        N4<androidx.media3.common.T> it = u12.f47508z.values().iterator();
        while (it.hasNext()) {
            androidx.media3.common.T next = it.next();
            androidx.media3.common.Q q13 = next.f47454b;
            String str = this.f51920s.get(q13);
            if (str != null) {
                aVarC.a(new androidx.media3.common.T(q13.a(str), next.f47455c));
            } else {
                aVarC.a(next);
            }
        }
        return d1A.o(aVarC.b());
    }

    @Override // androidx.media3.session.InterfaceC23246o
    public final void h0(@j.P InterfaceC23243n interfaceC23243n, int i12, int i13) {
        if (interfaceC23243n == null) {
            return;
        }
        j4(interfaceC23243n, i12, 15, l4(new C23261t0(i13, 3)));
    }

    @Override // androidx.media3.session.InterfaceC23246o
    public final void i2(@j.P InterfaceC23243n interfaceC23243n, int i12, int i13) {
        if (interfaceC23243n == null) {
            return;
        }
        j4(interfaceC23243n, i12, 34, l4(new C23261t0(i13, 1)));
    }

    public final int i4(O0.g gVar, G1 g12, int i12) {
        if (!g12.u(17)) {
            return i12;
        }
        C23225h<IBinder> c23225h = this.f51918q;
        return (c23225h.h(gVar, 17) || !c23225h.h(gVar, 16)) ? i12 : i12 + g12.getCurrentMediaItemIndex();
    }

    @Override // androidx.media3.session.InterfaceC23246o
    public final void j2(@j.P InterfaceC23243n interfaceC23243n, int i12, float f12) {
        if (interfaceC23243n == null) {
            return;
        }
        j4(interfaceC23243n, i12, 24, l4(new C23230i1(f12, 1)));
    }

    public final <K extends T0> void j4(InterfaceC23243n interfaceC23243n, final int i12, final int i13, final e<com.google.common.util.concurrent.D0<Void>, K> eVar) {
        long jClearCallingIdentity = Binder.clearCallingIdentity();
        try {
            final T0 t02 = this.f51916b.get();
            if (t02 != null && !t02.f()) {
                final O0.g gVarE = this.f51918q.e(interfaceC23243n.asBinder());
                if (gVarE == null) {
                    return;
                }
                androidx.media3.common.util.M.I(t02.f52297k, new Runnable() { // from class: androidx.media3.session.w1
                    @Override // java.lang.Runnable
                    public final void run() {
                        A1 a12 = this.f52664b;
                        final O0.g gVar = gVarE;
                        int i14 = i13;
                        final int i15 = i12;
                        final T0 t03 = t02;
                        final A1.e eVar2 = eVar;
                        if (!a12.f51918q.h(gVar, i14)) {
                            A1.k4(gVar, i15, new O1(-4));
                            return;
                        }
                        t03.f52290d.getClass();
                        if (i14 == 27) {
                            int i16 = T0.f52286w;
                            int i17 = A1.f51915u;
                            eVar2.d(t03, gVar, i15);
                            return;
                        }
                        C23225h<IBinder> c23225h = a12.f51918q;
                        C23225h.a aVar = new C23225h.a() { // from class: androidx.media3.session.z1
                            @Override // androidx.media3.session.C23225h.a
                            public final com.google.common.util.concurrent.D0 run() {
                                int i18 = A1.f51915u;
                                return (com.google.common.util.concurrent.D0) eVar2.d(t03, gVar, i15);
                            }
                        };
                        synchronized (c23225h.f52476a) {
                            try {
                                C23225h.b<IBinder> bVar = c23225h.f52478c.get(gVar);
                                if (bVar != null) {
                                    bVar.f52482c.add(aVar);
                                }
                            } catch (Throwable th2) {
                                throw th2;
                            }
                        }
                    }
                });
            }
        } finally {
            Binder.restoreCallingIdentity(jClearCallingIdentity);
        }
    }

    @Override // androidx.media3.session.InterfaceC23246o
    public final void k1(InterfaceC23243n interfaceC23243n, int i12) {
        if (interfaceC23243n == null) {
            return;
        }
        j4(interfaceC23243n, i12, 4, l4(new C23228i(21)));
    }

    @Override // androidx.media3.session.InterfaceC23246o
    public final void k2(@j.P InterfaceC23243n interfaceC23243n, int i12, float f12) {
        if (interfaceC23243n == null) {
            return;
        }
        j4(interfaceC23243n, i12, 13, l4(new C23230i1(f12, 0)));
    }

    @Override // androidx.media3.session.InterfaceC23246o
    public final void m1(@j.P InterfaceC23243n interfaceC23243n, int i12, @j.P Bundle bundle) {
        C23225h.b<IBinder> bVar;
        if (interfaceC23243n == null || bundle == null) {
            return;
        }
        try {
            O1 o12 = (O1) O1.f52229h.fromBundle(bundle);
            long jClearCallingIdentity = Binder.clearCallingIdentity();
            try {
                C23225h<IBinder> c23225h = this.f51918q;
                IBinder iBinderAsBinder = interfaceC23243n.asBinder();
                synchronized (c23225h.f52476a) {
                    try {
                        O0.g gVarE = c23225h.e(iBinderAsBinder);
                        bVar = gVarE != null ? c23225h.f52478c.get(gVarE) : null;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                J1 j12 = bVar != null ? bVar.f52481b : null;
                if (j12 == null) {
                    return;
                }
                j12.c(i12, o12);
            } finally {
                Binder.restoreCallingIdentity(jClearCallingIdentity);
            }
        } catch (RuntimeException e12) {
            androidx.media3.common.util.s.h("Ignoring malformed Bundle for SessionResult", e12);
        }
    }

    @Override // androidx.media3.session.InterfaceC23246o
    public final void n0(@j.P InterfaceC23243n interfaceC23243n, int i12, final int i13, final int i14, final int i15) {
        if (interfaceC23243n == null) {
            return;
        }
        j4(interfaceC23243n, i12, 20, l4(new InterfaceC23119j() { // from class: androidx.media3.session.o1
            @Override // androidx.media3.common.util.InterfaceC23119j
            public final void accept(Object obj) {
                int i16 = A1.f51915u;
                ((G1) obj).W(i13, i14, i15);
            }
        }));
    }

    @Override // androidx.media3.session.InterfaceC23246o
    public final void n3(@j.P InterfaceC23243n interfaceC23243n, int i12, @j.P Bundle bundle) {
        if (interfaceC23243n == null || bundle == null) {
            return;
        }
        try {
            C23231j c23231j = (C23231j) C23231j.f52532l.fromBundle(bundle);
            int callingUid = Binder.getCallingUid();
            int callingPid = Binder.getCallingPid();
            long jClearCallingIdentity = Binder.clearCallingIdentity();
            if (callingPid == 0) {
                callingPid = c23231j.f52536e;
            }
            try {
                e4(interfaceC23243n, c23231j.f52534c, c23231j.f52535d, callingPid, callingUid);
            } finally {
                Binder.restoreCallingIdentity(jClearCallingIdentity);
            }
        } catch (RuntimeException e12) {
            androidx.media3.common.util.s.h("Ignoring malformed Bundle for ConnectionRequest", e12);
        }
    }

    @Override // androidx.media3.session.InterfaceC23246o
    public final void q0(@j.P InterfaceC23243n interfaceC23243n, int i12, @j.P Bundle bundle) {
        if (interfaceC23243n == null || bundle == null) {
            return;
        }
        try {
            j4(interfaceC23243n, i12, 19, l4(new C23256r1((androidx.media3.common.B) androidx.media3.common.B.f47144r0.fromBundle(bundle))));
        } catch (RuntimeException e12) {
            androidx.media3.common.util.s.h("Ignoring malformed Bundle for MediaMetadata", e12);
        }
    }

    @Override // androidx.media3.session.InterfaceC23246o
    public final void q2(@j.P InterfaceC23243n interfaceC23243n, int i12, Bundle bundle) {
        if (interfaceC23243n == null || bundle == null) {
            return;
        }
        j4(interfaceC23243n, i12, 13, l4(new C23239l1((androidx.media3.common.G) androidx.media3.common.G.f47235h.fromBundle(bundle), 0)));
    }

    @Override // androidx.media3.session.InterfaceC23246o
    public final void r(@j.P InterfaceC23243n interfaceC23243n, int i12) {
        if (interfaceC23243n == null) {
            return;
        }
        j4(interfaceC23243n, i12, 26, l4(new C23228i(11)));
    }

    @Override // androidx.media3.session.InterfaceC23246o
    public final void z1(@j.P InterfaceC23243n interfaceC23243n, int i12, int i13, @j.P IBinder iBinder) {
        if (interfaceC23243n == null || iBinder == null) {
            return;
        }
        try {
            j4(interfaceC23243n, i12, 20, new C23268v1(new N(12, new C23245n1(C23114e.a(androidx.media3.common.z.f47977o, BinderC23095i.a(iBinder)), 0), new C23224g1(this, i13, 3)), 1));
        } catch (RuntimeException e12) {
            androidx.media3.common.util.s.h("Ignoring malformed Bundle for MediaItem", e12);
        }
    }
}
