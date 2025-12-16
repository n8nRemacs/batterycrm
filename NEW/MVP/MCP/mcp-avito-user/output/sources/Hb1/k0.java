package Hb1;

import androidx.compose.foundation.layout.C20563e2;
import androidx.compose.foundation.layout.C20568f2;
import androidx.compose.foundation.layout.C20576h2;
import androidx.compose.foundation.layout.C20585k;
import androidx.compose.foundation.layout.C20588k2;
import androidx.compose.foundation.layout.C20646z1;
import androidx.compose.foundation.layout.IntrinsicSize;
import androidx.compose.runtime.A;
import androidx.compose.runtime.C22039c2;
import androidx.compose.runtime.C22126m3;
import androidx.compose.runtime.C22187u0;
import androidx.compose.runtime.C22190v;
import androidx.compose.runtime.InterfaceC22204y1;
import androidx.compose.runtime.internal.C22096n;
import androidx.compose.ui.InterfaceC22215f;
import androidx.compose.ui.i;
import androidx.compose.ui.node.InterfaceC22413h;
import androidx.compose.ui.platform.InterfaceC22544x2;
import androidx.compose.ui.platform.Q0;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.view.M0;
import androidx.view.T0;
import gc1.InterfaceC40658b;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.C42745f0;
import w2.AbstractC49426b;

/* loaded from: classes9.dex */
public abstract class k0 {
    public static final void a(androidx.compose.ui.v vVar, List list, long j12, Y41.p pVar, Y41.l lVar, androidx.compose.runtime.A a12, int i12) {
        androidx.compose.runtime.B bE2 = a12.E(-1459418272);
        androidx.compose.ui.v vVarA = C20588k2.a(C20646z1.a(C20588k2.d(vVar, 1.0f), IntrinsicSize.f28333b), AbstractC49426b.f441178U, AbstractC49426b.f441177T);
        C20585k c20585k = C20585k.f28659a;
        float f12 = AbstractC49426b.f441166I;
        InterfaceC22215f.f39074a.getClass();
        i.b bVar = InterfaceC22215f.a.f39086l;
        c20585k.getClass();
        C20585k.j jVarI = C20585k.i(f12, bVar);
        i.a aVar = InterfaceC22215f.a.f39089o;
        bE2.I(-483455358);
        androidx.compose.foundation.layout.I iA2 = androidx.compose.foundation.layout.H.a(jVarI, aVar, bE2, 54);
        bE2.I(-1323940314);
        androidx.compose.ui.unit.d dVar = (androidx.compose.ui.unit.d) bE2.o(Q0.f41199h);
        LayoutDirection layoutDirection = (LayoutDirection) bE2.o(Q0.f41205n);
        InterfaceC22544x2 interfaceC22544x2 = (InterfaceC22544x2) bE2.o(Q0.f41210s);
        InterfaceC22413h.a aVar2 = InterfaceC22413h.f40789C1;
        aVar2.getClass();
        Y41.a<InterfaceC22413h> aVar3 = InterfaceC22413h.a.f40791b;
        C22096n c22096nB = androidx.compose.ui.layout.M.b(vVarA);
        if (bE2.f37890b == null) {
            C22190v.b();
            throw null;
        }
        bE2.A();
        if (bE2.f37887P) {
            bE2.b(aVar3);
        } else {
            bE2.d();
        }
        bE2.f37913y = false;
        x31.i.a(c22096nB, x31.h.a(aVar2, bE2, iA2, bE2, dVar, bE2, layoutDirection, bE2, interfaceC22544x2, bE2, bE2), bE2);
        androidx.compose.foundation.layout.K k12 = androidx.compose.foundation.layout.K.f28344a;
        bE2.I(-232705763);
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                InterfaceC40658b interfaceC40658b = (InterfaceC40658b) it.next();
                if (interfaceC40658b instanceof InterfaceC40658b.e) {
                    InterfaceC40658b.e eVar = (InterfaceC40658b.e) interfaceC40658b;
                    p0.a((i12 >> 3) & 8064, 0, bE2, k12.a(androidx.compose.ui.v.f42878y1, 1.0f, true), lVar, pVar, eVar);
                }
            }
        }
        androidx.compose.foundation.H.B(bE2, false, false, true, false);
        bE2.X(false);
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z == null) {
            return;
        }
        c22039c2Z.f38184d = new U(vVar, list, j12, pVar, lVar, i12);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void b(InterfaceC40658b.i iVar, androidx.compose.ui.v vVar, long j12, Y41.p pVar, androidx.compose.runtime.A a12, int i12) {
        int i13;
        androidx.compose.runtime.B bE2 = a12.E(158391045);
        if ((i12 & 14) == 0) {
            i13 = (bE2.B(iVar) ? 4 : 2) | i12;
        } else {
            i13 = i12;
        }
        if ((i12 & 112) == 0) {
            i13 |= bE2.B(vVar) ? 32 : 16;
        }
        if ((i12 & 896) == 0) {
            i13 |= bE2.n(j12) ? 256 : 128;
        }
        if ((i12 & 7168) == 0) {
            i13 |= bE2.u(pVar) ? 2048 : 1024;
        }
        if ((i13 & 5851) == 1170 && bE2.c()) {
            bE2.f();
        } else {
            bE2.y0();
            if ((i12 & 1) != 0 && !bE2.g0()) {
                bE2.f();
            }
            bE2.Y();
            String strValueOf = String.valueOf(iVar.hashCode());
            bE2.I(-1614864554);
            androidx.view.viewmodel.compose.a.f46897a.getClass();
            T0 t0A = androidx.view.viewmodel.compose.a.a(bE2);
            if (t0A == null) {
                throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
            }
            M0 m0A = org.koin.androidx.viewmodel.b.a(kotlin.jvm.internal.m0.f406844a.b(sberid.sdk.ui.screens.compose.elk.root.w.class), t0A.getF42820b(), strValueOf, j71.d.a(t0A, bE2), (org.koin.core.scope.a) bE2.o(org.koin.compose.g.f421440a));
            bE2.X(false);
            sberid.sdk.ui.screens.compose.elk.root.w wVar = (sberid.sdk.ui.screens.compose.elk.root.w) m0A;
            InterfaceC22204y1 interfaceC22204y1A = K31.e.a(wVar.f437862O, bE2);
            C22187u0.d(new H(wVar, iVar, null), bE2, wVar);
            Object obj = ((sberid.sdk.ui.screens.compose.elk.root.s) interfaceC22204y1A.getF42167b()).f437836e;
            InterfaceC40658b.i iVar2 = (InterfaceC40658b.i) (obj instanceof InterfaceC40658b.i ? obj : null);
            InterfaceC40658b.i iVar3 = iVar2 == null ? iVar : iVar2;
            boolean z12 = ((sberid.sdk.ui.screens.compose.elk.root.s) interfaceC22204y1A.getF42167b()).f437832a && !iVar3.c();
            boolean z13 = (((sberid.sdk.ui.screens.compose.elk.root.s) interfaceC22204y1A.getF42167b()).f437832a || iVar3.c()) ? false : true;
            boolean zC2 = iVar3.c();
            InterfaceC40658b.i iVar4 = iVar3;
            C22187u0.f(Boolean.valueOf(zC2), ((sberid.sdk.ui.screens.compose.elk.root.s) interfaceC22204y1A.getF42167b()).f437836e, Boolean.valueOf(((sberid.sdk.ui.screens.compose.elk.root.s) interfaceC22204y1A.getF42167b()).f437832a), new K(zC2, wVar, iVar3, interfaceC22204y1A, null), bE2);
            if (z12) {
                bE2.I(-2069768938);
                xc1.h.a(vVar, bE2, (i13 >> 3) & 14);
                bE2.X(false);
            } else if (zC2) {
                bE2.I(-2069768848);
                c(iVar4.f396562f, vVar, j12, new N(wVar), pVar, bE2, (i13 & 112) | 8 | (i13 & 896) | ((i13 << 3) & 57344));
                bE2.X(false);
            } else if (z13) {
                bE2.I(-2069768553);
                bE2.X(false);
            } else {
                bE2.I(-2069768543);
                bE2.X(false);
            }
        }
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z == null) {
            return;
        }
        c22039c2Z.f38184d = new Q(iVar, vVar, j12, pVar, i12);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void c(List list, androidx.compose.ui.v vVar, long j12, N n12, Y41.p pVar, androidx.compose.runtime.A a12, int i12) {
        androidx.compose.runtime.B bE2 = a12.E(471521841);
        bE2.I(-492369756);
        Object objT = bE2.t();
        androidx.compose.runtime.A.f37866a.getClass();
        Object obj = A.a.f37868b;
        if (objT == obj) {
            objT = C22126m3.g(Boolean.FALSE);
            bE2.H(objT);
        }
        bE2.X(false);
        InterfaceC22204y1 interfaceC22204y1 = (InterfaceC22204y1) objT;
        bE2.I(1157296644);
        boolean zB2 = bE2.B(interfaceC22204y1);
        Object objT2 = bE2.t();
        if (zB2 || objT2 == obj) {
            objT2 = new g0(interfaceC22204y1);
            bE2.H(objT2);
        }
        bE2.X(false);
        Y41.l lVar = (Y41.l) objT2;
        boolean z12 = list != null ? !C42745f0.B(list, InterfaceC40658b.e.class).isEmpty() : false;
        if (((Boolean) interfaceC22204y1.getF42167b()).booleanValue() && z12) {
            bE2.I(51389707);
            n12.invoke();
            bE2.I(1157296644);
            boolean zB3 = bE2.B(pVar);
            Object objT3 = bE2.t();
            if (zB3 || objT3 == obj) {
                objT3 = new X(pVar);
                bE2.H(objT3);
            }
            bE2.X(false);
            a(vVar, list, j12, (Y41.p) objT3, lVar, bE2, ((i12 >> 3) & 14) | 64 | (i12 & 896));
            bE2.X(false);
        } else {
            bE2.I(51390057);
            bE2.I(1157296644);
            boolean zB4 = bE2.B(pVar);
            Object objT4 = bE2.t();
            if (zB4 || objT4 == obj) {
                objT4 = new a0(pVar);
                bE2.H(objT4);
            }
            bE2.X(false);
            d(vVar, list, j12, (Y41.p) objT4, lVar, bE2, ((i12 >> 3) & 14) | 64 | (i12 & 896));
            bE2.X(false);
        }
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z == null) {
            return;
        }
        c22039c2Z.f38184d = new d0(list, vVar, j12, n12, pVar, i12);
    }

    public static final void d(androidx.compose.ui.v vVar, List list, long j12, Y41.p pVar, Y41.l lVar, androidx.compose.runtime.A a12, int i12) {
        androidx.compose.runtime.B bE2 = a12.E(643526482);
        androidx.compose.ui.v vVarA = C20646z1.a(C20588k2.d(vVar, 1.0f), IntrinsicSize.f28333b);
        C20585k c20585k = C20585k.f28659a;
        float f12 = AbstractC49426b.f441165H;
        InterfaceC22215f.f39074a.getClass();
        i.a aVar = InterfaceC22215f.a.f39089o;
        c20585k.getClass();
        C20585k.j jVarH = C20585k.h(f12, aVar);
        i.b bVar = InterfaceC22215f.a.f39086l;
        bE2.I(693286680);
        C20568f2 c20568f2A = C20563e2.a(jVarH, bVar, bE2, 54);
        bE2.I(-1323940314);
        androidx.compose.ui.unit.d dVar = (androidx.compose.ui.unit.d) bE2.o(Q0.f41199h);
        LayoutDirection layoutDirection = (LayoutDirection) bE2.o(Q0.f41205n);
        InterfaceC22544x2 interfaceC22544x2 = (InterfaceC22544x2) bE2.o(Q0.f41210s);
        InterfaceC22413h.a aVar2 = InterfaceC22413h.f40789C1;
        aVar2.getClass();
        Y41.a<InterfaceC22413h> aVar3 = InterfaceC22413h.a.f40791b;
        C22096n c22096nB = androidx.compose.ui.layout.M.b(vVarA);
        if (bE2.f37890b == null) {
            C22190v.b();
            throw null;
        }
        bE2.A();
        if (bE2.f37887P) {
            bE2.b(aVar3);
        } else {
            bE2.d();
        }
        bE2.f37913y = false;
        x31.i.a(c22096nB, x31.h.a(aVar2, bE2, c20568f2A, bE2, dVar, bE2, layoutDirection, bE2, interfaceC22544x2, bE2, bE2), bE2);
        C20576h2 c20576h2 = C20576h2.f28641a;
        bE2.I(-948713126);
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                InterfaceC40658b interfaceC40658b = (InterfaceC40658b) it.next();
                if (interfaceC40658b instanceof InterfaceC40658b.c) {
                    bE2.I(1348187245);
                    W.b((InterfaceC40658b.c) interfaceC40658b, c20576h2.a(androidx.compose.ui.v.f42878y1, 1.0f, true), j12, null, pVar, bE2, (i12 & 896) | ((i12 << 3) & 57344), 8);
                    bE2.X(false);
                } else if (interfaceC40658b instanceof InterfaceC40658b.e) {
                    bE2.I(1348187500);
                    InterfaceC40658b.e eVar = (InterfaceC40658b.e) interfaceC40658b;
                    p0.a((i12 >> 3) & 8064, 0, bE2, c20576h2.a(androidx.compose.ui.v.f42878y1, 1.0f, true), lVar, pVar, eVar);
                    bE2.X(false);
                } else {
                    bE2.I(1348187736);
                    bE2.X(false);
                }
            }
        }
        androidx.compose.foundation.H.B(bE2, false, false, true, false);
        bE2.X(false);
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z == null) {
            return;
        }
        c22039c2Z.f38184d = new i0(vVar, list, j12, pVar, lVar, i12);
    }
}
