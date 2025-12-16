package Hb1;

import androidx.compose.foundation.C20806p1;
import androidx.compose.foundation.layout.C20563e2;
import androidx.compose.foundation.layout.C20568f2;
import androidx.compose.foundation.layout.C20576h2;
import androidx.compose.foundation.layout.C20585k;
import androidx.compose.foundation.layout.C20588k2;
import androidx.compose.foundation.layout.C20608p2;
import androidx.compose.runtime.A;
import androidx.compose.runtime.C22039c2;
import androidx.compose.runtime.C22126m3;
import androidx.compose.runtime.C22187u0;
import androidx.compose.runtime.C22190v;
import androidx.compose.runtime.InterfaceC22204y1;
import androidx.compose.runtime.internal.C22096n;
import androidx.compose.ui.InterfaceC22215f;
import androidx.compose.ui.graphics.T;
import androidx.compose.ui.graphics.U;
import androidx.compose.ui.i;
import androidx.compose.ui.node.InterfaceC22413h;
import androidx.compose.ui.platform.C22535v1;
import androidx.compose.ui.platform.InterfaceC22544x2;
import androidx.compose.ui.platform.Q0;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.v;
import androidx.view.M0;
import androidx.view.T0;
import com.avito.android.R;
import gc1.C40657a;
import gc1.InterfaceC40658b;
import w2.AbstractC49425a;
import w2.AbstractC49426b;

/* renamed from: Hb1.n, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC13963n {
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(InterfaceC40658b.j jVar, androidx.compose.ui.v vVar, long j12, Y41.p pVar, androidx.compose.runtime.A a12, int i12) {
        int i13;
        androidx.compose.runtime.B bE2 = a12.E(1821147381);
        if ((i12 & 14) == 0) {
            i13 = (bE2.B(jVar) ? 4 : 2) | i12;
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
            String strValueOf = String.valueOf(jVar.hashCode());
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
            C22187u0.d(new m0(wVar, jVar, null), bE2, wVar);
            InterfaceC40658b interfaceC40658b = ((sberid.sdk.ui.screens.compose.elk.root.s) interfaceC22204y1A.getF42167b()).f437836e;
            if (!(interfaceC40658b instanceof InterfaceC40658b.j)) {
                interfaceC40658b = null;
            }
            InterfaceC40658b.j jVar2 = (InterfaceC40658b.j) interfaceC40658b;
            if (jVar2 == null) {
                jVar2 = jVar;
            }
            boolean z12 = ((sberid.sdk.ui.screens.compose.elk.root.s) interfaceC22204y1A.getF42167b()).f437832a && !jVar2.c();
            boolean z13 = (((sberid.sdk.ui.screens.compose.elk.root.s) interfaceC22204y1A.getF42167b()).f437832a || jVar2.c()) ? false : true;
            boolean zC2 = jVar2.c();
            C22187u0.f(Boolean.valueOf(zC2), ((sberid.sdk.ui.screens.compose.elk.root.s) interfaceC22204y1A.getF42167b()).f437836e, Boolean.valueOf(((sberid.sdk.ui.screens.compose.elk.root.s) interfaceC22204y1A.getF42167b()).f437832a), new o0(zC2, wVar, jVar2, interfaceC22204y1A, null), bE2);
            if (z12) {
                bE2.I(26694411);
                xc1.j.a(null, bE2, 0);
                bE2.X(false);
            } else if (zC2) {
                bE2.I(26694454);
                b(jVar2, vVar, j12, pVar, bE2, i13 & 8176);
                bE2.X(false);
            } else if (z13) {
                bE2.I(26694635);
                bE2.X(false);
            } else {
                bE2.I(26694645);
                bE2.X(false);
            }
        }
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z == null) {
            return;
        }
        c22039c2Z.f38184d = new q0(jVar, vVar, j12, pVar, i12);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void b(InterfaceC40658b.j jVar, androidx.compose.ui.v vVar, long j12, Y41.p pVar, androidx.compose.runtime.A a12, int i12) {
        int i13;
        long jB2;
        androidx.compose.runtime.B bE2 = a12.E(1873507188);
        if ((i12 & 14) == 0) {
            i13 = (bE2.B(jVar) ? 4 : 2) | i12;
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
            androidx.compose.ui.v vVarD = C20588k2.d(vVar, 1.0f);
            C40657a c40657a = jVar.f396566c;
            androidx.compose.ui.v vVarA = androidx.compose.ui.n.a(vVarD, C22535v1.f41625a, new C13960k(pVar, jVar, c40657a));
            InterfaceC22215f.f39074a.getClass();
            i.b bVar = InterfaceC22215f.a.f39086l;
            C20585k.f28659a.getClass();
            C20585k.c cVar = C20585k.f28664f;
            bE2.I(693286680);
            C20568f2 c20568f2A = C20563e2.a(cVar, bVar, bE2, 54);
            bE2.I(-1323940314);
            androidx.compose.ui.unit.d dVar = (androidx.compose.ui.unit.d) bE2.o(Q0.f41199h);
            LayoutDirection layoutDirection = (LayoutDirection) bE2.o(Q0.f41205n);
            InterfaceC22544x2 interfaceC22544x2 = (InterfaceC22544x2) bE2.o(Q0.f41210s);
            InterfaceC22413h.a aVar = InterfaceC22413h.f40789C1;
            aVar.getClass();
            Y41.a<InterfaceC22413h> aVar2 = InterfaceC22413h.a.f40791b;
            C22096n c22096nB = androidx.compose.ui.layout.M.b(vVarA);
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
            x31.i.a(c22096nB, x31.h.a(aVar, bE2, c20568f2A, bE2, dVar, bE2, layoutDirection, bE2, interfaceC22544x2, bE2, bE2), bE2);
            C20576h2 c20576h2 = C20576h2.f28641a;
            bE2.I(-214211607);
            String str = jVar.f396565b;
            if (str != null) {
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
                v.a aVar3 = androidx.compose.ui.v.f42878y1;
                androidx.compose.ui.v vVarF = C20588k2.f(C20588k2.t(aVar3, AbstractC49426b.f441232y), AbstractC49426b.f441234z);
                bE2.I(1157296644);
                boolean zB2 = bE2.B(interfaceC22204y1);
                Object objT2 = bE2.t();
                if (zB2 || objT2 == obj) {
                    objT2 = new s0(interfaceC22204y1);
                    bE2.H(objT2);
                }
                bE2.X(false);
                Y41.l lVar = (Y41.l) objT2;
                bE2.I(1157296644);
                boolean zB3 = bE2.B(interfaceC22204y1);
                Object objT3 = bE2.t();
                if (zB3 || objT3 == obj) {
                    objT3 = new C13951b(interfaceC22204y1);
                    bE2.H(objT3);
                }
                bE2.X(false);
                sberid.sdk.ui.utils.extensions.g.a(str, "", vVarF, null, lVar, (Y41.l) objT3, null, null, 0.0f, null, 0, bE2, 48, 0, 15992);
                if (((Boolean) interfaceC22204y1.getF42167b()).booleanValue()) {
                    C20608p2.a(bE2, C20588k2.t(aVar3, AbstractC49426b.f441228w));
                }
            }
            bE2.X(false);
            bE2.I(-214210928);
            if (c40657a == null) {
                T.a aVar4 = androidx.compose.ui.graphics.T.f39320b;
                jB2 = AbstractC49425a.b(bE2);
            } else {
                jB2 = j12;
            }
            bE2.X(false);
            String str2 = jVar.f396564a;
            if (str2 == null) {
                str2 = "";
            }
            Mc1.s.m(str2, null, jB2, bE2, 0);
            bE2.I(51390496);
            if (c40657a != null) {
                C20608p2.a(bE2, C20588k2.t(androidx.compose.ui.v.f42878y1, AbstractC49426b.f441230x));
                C20806p1.a(u0.e.a(R.drawable.ic_arrow_mini_right, 0, bE2), "", null, null, null, 0.0f, U.a.a(androidx.compose.ui.graphics.U.f39332b, j12), bE2, 56, 60);
            }
            androidx.compose.foundation.H.B(bE2, false, false, true, false);
            bE2.X(false);
        }
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z == null) {
            return;
        }
        c22039c2Z.f38184d = new C13954e(jVar, vVar, j12, pVar, i12);
    }
}
