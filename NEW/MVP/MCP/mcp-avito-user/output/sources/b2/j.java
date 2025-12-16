package B2;

import Hb1.AbstractC13963n;
import Hb1.AbstractC13969u;
import Hb1.E;
import Hb1.e0;
import Hb1.k0;
import androidx.compose.foundation.layout.C20585k;
import androidx.compose.foundation.layout.C20588k2;
import androidx.compose.foundation.layout.C20608p2;
import androidx.compose.foundation.layout.H;
import androidx.compose.foundation.layout.I;
import androidx.compose.foundation.layout.K;
import androidx.compose.foundation.layout.R1;
import androidx.compose.runtime.A;
import androidx.compose.runtime.B;
import androidx.compose.runtime.C22039c2;
import androidx.compose.runtime.C22187u0;
import androidx.compose.runtime.C22190v;
import androidx.compose.runtime.InterfaceC22204y1;
import androidx.compose.runtime.internal.C22096n;
import androidx.compose.ui.InterfaceC22215f;
import androidx.compose.ui.layout.M;
import androidx.compose.ui.node.InterfaceC22413h;
import androidx.compose.ui.platform.InterfaceC22544x2;
import androidx.compose.ui.platform.Q0;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.v;
import androidx.fragment.app.ActivityC22955m;
import androidx.view.M0;
import androidx.view.T0;
import gc1.InterfaceC40658b;
import kotlin.jvm.internal.m0;
import sberid.sdk.ui.screens.compose.elk.root.s;
import sberid.sdk.ui.screens.compose.elk.root.w;
import w2.AbstractC49426b;

/* loaded from: classes10.dex */
public abstract class j {
    public static final void a(v vVar, InterfaceC40658b.k kVar, long j12, h hVar, A a12, int i12) {
        B bE2 = a12.E(-1838146225);
        int i13 = (i12 & 14) == 0 ? (bE2.B(kVar) ? 4 : 2) | i12 : i12;
        if ((i12 & 112) == 0) {
            i13 |= bE2.B(vVar) ? 32 : 16;
        }
        if ((i12 & 896) == 0) {
            i13 |= bE2.n(j12) ? 256 : 128;
        }
        if ((i12 & 7168) == 0) {
            i13 |= bE2.u(hVar) ? 2048 : 1024;
        }
        if ((i13 & 5851) == 1170 && bE2.c()) {
            bE2.f();
        } else {
            v vVarW = C20588k2.w(C20588k2.d(vVar, 1.0f), null, 1);
            bE2.I(-483455358);
            C20585k.f28659a.getClass();
            C20585k.l lVar = C20585k.f28662d;
            InterfaceC22215f.f39074a.getClass();
            I iA2 = H.a(lVar, InterfaceC22215f.a.f39088n, bE2, 0);
            bE2.I(-1323940314);
            androidx.compose.ui.unit.d dVar = (androidx.compose.ui.unit.d) bE2.o(Q0.f41199h);
            LayoutDirection layoutDirection = (LayoutDirection) bE2.o(Q0.f41205n);
            InterfaceC22544x2 interfaceC22544x2 = (InterfaceC22544x2) bE2.o(Q0.f41210s);
            InterfaceC22413h.a aVar = InterfaceC22413h.f40789C1;
            aVar.getClass();
            Y41.a<InterfaceC22413h> aVar2 = InterfaceC22413h.a.f40791b;
            C22096n c22096nB = M.b(vVarW);
            if (bE2.f37890b == null) {
                C22190v.b();
                throw null;
            }
            bE2.A();
            if (bE2.f37887P) {
                bE2.b(aVar2);
            } else {
                bE2.d();
            }
            bE2.f37913y = false;
            x31.i.a(c22096nB, x31.h.a(aVar, bE2, iA2, bE2, dVar, bE2, layoutDirection, bE2, interfaceC22544x2, bE2, bE2), bE2);
            K k12 = K.f28344a;
            C20608p2.a(bE2, R1.i(v.f42878y1, AbstractC49426b.f441185a0));
            bE2.I(-700927433);
            for (InterfaceC40658b interfaceC40658b : kVar.f396577e) {
                if (interfaceC40658b instanceof InterfaceC40658b.k) {
                    bE2.I(-480560056);
                    bE2.X(false);
                } else if (interfaceC40658b instanceof InterfaceC40658b.o) {
                    bE2.I(-480560011);
                    e0.a((InterfaceC40658b.o) interfaceC40658b, R1.k(AbstractC49426b.f441187b0, 0.0f, 2, v.f42878y1), j12, hVar, bE2, i13 & 8064);
                    bE2.X(false);
                } else if (interfaceC40658b instanceof InterfaceC40658b.j) {
                    bE2.I(-480559744);
                    AbstractC13963n.a((InterfaceC40658b.j) interfaceC40658b, R1.k(AbstractC49426b.f441187b0, 0.0f, 2, v.f42878y1), j12, hVar, bE2, i13 & 8064);
                    bE2.X(false);
                } else if (interfaceC40658b instanceof InterfaceC40658b.i) {
                    bE2.I(-480559474);
                    k0.b((InterfaceC40658b.i) interfaceC40658b, R1.k(AbstractC49426b.f441187b0, 0.0f, 2, v.f42878y1), j12, hVar, bE2, i13 & 8064);
                    bE2.X(false);
                } else {
                    if (interfaceC40658b instanceof InterfaceC40658b.h) {
                        bE2.I(-480559203);
                        E.a((InterfaceC40658b.h) interfaceC40658b, R1.k(AbstractC49426b.f441187b0, 0.0f, 2, v.f42878y1), j12, hVar, bE2, i13 & 8064);
                        bE2.X(false);
                    } else {
                        bE2.I(-480558954);
                        bE2.X(false);
                    }
                    C20608p2.a(bE2, R1.i(v.f42878y1, AbstractC49426b.f441185a0));
                }
                C20608p2.a(bE2, R1.i(v.f42878y1, AbstractC49426b.f441185a0));
            }
            androidx.compose.foundation.H.B(bE2, false, false, true, false);
            bE2.X(false);
        }
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z == null) {
            return;
        }
        c22039c2Z.f38184d = new i(vVar, kVar, j12, hVar, i12);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void b(InterfaceC40658b.k kVar, ActivityC22955m activityC22955m, A a12, int i12) {
        B bE2 = a12.E(-706431753);
        v.a aVar = v.f42878y1;
        String strValueOf = String.valueOf(kVar.hashCode());
        bE2.I(-1614864554);
        androidx.view.viewmodel.compose.a.f46897a.getClass();
        T0 t0A = androidx.view.viewmodel.compose.a.a(bE2);
        if (t0A == null) {
            throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
        }
        M0 m0A = org.koin.androidx.viewmodel.b.a(m0.f406844a.b(w.class), t0A.getF42820b(), strValueOf, j71.d.a(t0A, bE2), (org.koin.core.scope.a) bE2.o(org.koin.compose.g.f421440a));
        bE2.X(false);
        w wVar = (w) m0A;
        InterfaceC22204y1 interfaceC22204y1A = K31.e.a(wVar.f437862O, bE2);
        C22187u0.d(new a(wVar, kVar, null), bE2, wVar);
        long jA2 = K31.b.a(((s) interfaceC22204y1A.getF42167b()).f437835d, bE2);
        h hVar = new h(wVar, kVar, activityC22955m);
        InterfaceC40658b interfaceC40658b = ((s) interfaceC22204y1A.getF42167b()).f437836e;
        if (!(interfaceC40658b instanceof InterfaceC40658b.k)) {
            interfaceC40658b = null;
        }
        InterfaceC40658b.k kVar2 = (InterfaceC40658b.k) interfaceC40658b;
        InterfaceC40658b.k kVar3 = kVar2 == null ? kVar : kVar2;
        boolean z12 = ((s) interfaceC22204y1A.getF42167b()).f437832a && !((s) interfaceC22204y1A.getF42167b()).f437833b;
        boolean z13 = kVar3.c() && !((s) interfaceC22204y1A.getF42167b()).f437833b;
        boolean z14 = ((s) interfaceC22204y1A.getF42167b()).f437833b && !((s) interfaceC22204y1A.getF42167b()).f437832a;
        C22187u0.g(new Object[]{Boolean.valueOf(z13), ((s) interfaceC22204y1A.getF42167b()).f437836e, Boolean.valueOf(((s) interfaceC22204y1A.getF42167b()).f437832a), Boolean.valueOf(((s) interfaceC22204y1A.getF42167b()).f437833b), Boolean.valueOf(((s) interfaceC22204y1A.getF42167b()).f437834c)}, new b(z13, wVar, kVar3, interfaceC22204y1A, null), bE2);
        C22187u0.d(new c(z14, wVar, kVar3, null), bE2, Boolean.valueOf(z14));
        C22187u0.a(null, new e(wVar, kVar3), bE2);
        if (z12) {
            bE2.I(-1350263405);
            A81.b.a(null, jA2, AbstractC49426b.f441162E, bE2, 0);
            bE2.X(false);
        } else if (z13) {
            bE2.I(-1350263271);
            a(aVar, kVar3, jA2, hVar, bE2, (i12 >> 3) & 112);
            bE2.X(false);
        } else if (z14) {
            bE2.I(-1350263081);
            AbstractC13969u.a(aVar, jA2, 0.0f, new f(wVar, kVar3), bE2, (i12 >> 6) & 14);
            bE2.X(false);
        } else {
            bE2.I(-1350262876);
            bE2.X(false);
        }
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z == null) {
            return;
        }
        c22039c2Z.f38184d = new g(kVar, activityC22955m, aVar, i12);
    }
}
