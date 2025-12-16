package Hb1;

import androidx.compose.foundation.layout.C20563e2;
import androidx.compose.foundation.layout.C20568f2;
import androidx.compose.foundation.layout.C20576h2;
import androidx.compose.foundation.layout.C20585k;
import androidx.compose.foundation.layout.C20588k2;
import androidx.compose.foundation.layout.C20608p2;
import androidx.compose.foundation.layout.C20646z1;
import androidx.compose.foundation.layout.IntrinsicSize;
import androidx.compose.foundation.layout.R1;
import androidx.compose.runtime.C22039c2;
import androidx.compose.runtime.C22187u0;
import androidx.compose.runtime.C22190v;
import androidx.compose.runtime.InterfaceC22078i;
import androidx.compose.runtime.InterfaceC22204y1;
import androidx.compose.runtime.J3;
import androidx.compose.runtime.internal.C22096n;
import androidx.compose.ui.InterfaceC22215f;
import androidx.compose.ui.i;
import androidx.compose.ui.layout.InterfaceC22374n;
import androidx.compose.ui.node.InterfaceC22413h;
import androidx.compose.ui.platform.InterfaceC22544x2;
import androidx.compose.ui.platform.Q0;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.v;
import androidx.view.M0;
import androidx.view.T0;
import gc1.InterfaceC40658b;
import java.util.List;
import kotlin.G0;
import kotlin.collections.C42745f0;
import w2.AbstractC49426b;

/* loaded from: classes9.dex */
public abstract class E {
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(InterfaceC40658b.h hVar, androidx.compose.ui.v vVar, long j12, Y41.p pVar, androidx.compose.runtime.A a12, int i12) {
        int i13;
        androidx.compose.runtime.B bE2 = a12.E(1878699541);
        if ((i12 & 14) == 0) {
            i13 = (bE2.B(hVar) ? 4 : 2) | i12;
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
            String strValueOf = String.valueOf(hVar.hashCode());
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
            C22187u0.d(new C13967s(wVar, hVar, null), bE2, wVar);
            Object obj = ((sberid.sdk.ui.screens.compose.elk.root.s) interfaceC22204y1A.getF42167b()).f437836e;
            InterfaceC40658b.h hVar2 = (InterfaceC40658b.h) (obj instanceof InterfaceC40658b.h ? obj : null);
            if (hVar2 == null) {
                hVar2 = hVar;
            }
            boolean z12 = ((sberid.sdk.ui.screens.compose.elk.root.s) interfaceC22204y1A.getF42167b()).f437832a && !hVar2.c();
            boolean z13 = (((sberid.sdk.ui.screens.compose.elk.root.s) interfaceC22204y1A.getF42167b()).f437832a || hVar2.c()) ? false : true;
            boolean zC2 = hVar2.c();
            C22187u0.f(Boolean.valueOf(zC2), ((sberid.sdk.ui.screens.compose.elk.root.s) interfaceC22204y1A.getF42167b()).f437836e, Boolean.valueOf(((sberid.sdk.ui.screens.compose.elk.root.s) interfaceC22204y1A.getF42167b()).f437832a), new C13970v(zC2, wVar, hVar2, interfaceC22204y1A, null), bE2);
            if (z12) {
                bE2.I(-792540989);
                xc1.f.a(vVar, bE2, (i13 >> 3) & 14);
                bE2.X(false);
            } else if (zC2) {
                bE2.I(-792540902);
                b(hVar2, vVar, j12, pVar, bE2, i13 & 8176);
                bE2.X(false);
            } else if (z13) {
                bE2.I(-792540721);
                bE2.X(false);
            } else {
                bE2.I(-792540711);
                bE2.X(false);
            }
        }
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z == null) {
            return;
        }
        c22039c2Z.f38184d = new C13973y(hVar, vVar, j12, pVar, i12);
    }

    public static final void b(InterfaceC40658b.h hVar, androidx.compose.ui.v vVar, long j12, Y41.p pVar, androidx.compose.runtime.A a12, int i12) {
        Y41.a<InterfaceC22413h> aVar;
        boolean z12;
        Y41.a<InterfaceC22413h> aVar2;
        androidx.compose.runtime.B bE2 = a12.E(1376569184);
        int i13 = (i12 & 14) == 0 ? (bE2.B(hVar) ? 4 : 2) | i12 : i12;
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
            bE2.I(-483455358);
            C20585k.f28659a.getClass();
            C20585k.l lVar = C20585k.f28662d;
            InterfaceC22215f.f39074a.getClass();
            androidx.compose.foundation.layout.I iA2 = androidx.compose.foundation.layout.H.a(lVar, InterfaceC22215f.a.f39088n, bE2, 0);
            bE2.I(-1323940314);
            J3 j32 = Q0.f41199h;
            androidx.compose.ui.unit.d dVar = (androidx.compose.ui.unit.d) bE2.o(j32);
            J3 j33 = Q0.f41205n;
            LayoutDirection layoutDirection = (LayoutDirection) bE2.o(j33);
            J3 j34 = Q0.f41210s;
            InterfaceC22544x2 interfaceC22544x2 = (InterfaceC22544x2) bE2.o(j34);
            InterfaceC22413h.a aVar3 = InterfaceC22413h.f40789C1;
            aVar3.getClass();
            Y41.a<InterfaceC22413h> aVar4 = InterfaceC22413h.a.f40791b;
            C22096n c22096nB = androidx.compose.ui.layout.M.b(vVar);
            InterfaceC22078i<?> interfaceC22078i = bE2.f37890b;
            if (interfaceC22078i == null) {
                C22190v.b();
                throw null;
            }
            bE2.A();
            if (bE2.f37887P) {
                bE2.b(aVar4);
            } else {
                bE2.d();
            }
            bE2.f37913y = false;
            int i14 = i13;
            x31.i.a(c22096nB, x31.h.a(aVar3, bE2, iA2, bE2, dVar, bE2, layoutDirection, bE2, interfaceC22544x2, bE2, bE2), bE2);
            androidx.compose.foundation.layout.K k12 = androidx.compose.foundation.layout.K.f28344a;
            bE2.I(-214211917);
            String str = hVar.f396550a;
            String str2 = hVar.f396551b;
            if ((str == null || str.length() == 0) && (str2 == null || str2.length() == 0)) {
                aVar = aVar4;
                z12 = false;
            } else {
                i.b bVar = InterfaceC22215f.a.f39086l;
                bE2.I(693286680);
                v.a aVar5 = androidx.compose.ui.v.f42878y1;
                C20568f2 c20568f2A = C20563e2.a(C20585k.f28660b, bVar, bE2, 48);
                bE2.I(-1323940314);
                androidx.compose.ui.unit.d dVar2 = (androidx.compose.ui.unit.d) bE2.o(j32);
                LayoutDirection layoutDirection2 = (LayoutDirection) bE2.o(j33);
                InterfaceC22544x2 interfaceC22544x22 = (InterfaceC22544x2) bE2.o(j34);
                C22096n c22096nB2 = androidx.compose.ui.layout.M.b(aVar5);
                if (interfaceC22078i == null) {
                    C22190v.b();
                    throw null;
                }
                bE2.A();
                if (bE2.f37887P) {
                    aVar2 = aVar4;
                    bE2.b(aVar2);
                } else {
                    aVar2 = aVar4;
                    bE2.d();
                }
                bE2.f37913y = false;
                aVar = aVar2;
                x31.i.a(c22096nB2, x31.h.a(aVar3, bE2, c20568f2A, bE2, dVar2, bE2, layoutDirection2, bE2, interfaceC22544x22, bE2, bE2), bE2);
                C20576h2 c20576h2 = C20576h2.f28641a;
                String str3 = str == null ? "" : str;
                androidx.compose.ui.v vVarA = c20576h2.a(aVar5, 1.0f, true);
                float f12 = AbstractC49426b.f441183Z;
                Mc1.s.k(str3, R1.m(vVarA, 0.0f, 0.0f, f12, 0.0f, 11), 0L, bE2, 0);
                InterfaceC22374n.f40491a.getClass();
                sberid.sdk.ui.utils.extensions.g.a(str2, str, C20588k2.t(C20588k2.f(aVar5, AbstractC49426b.f441171N), AbstractC49426b.f441172O), null, null, null, null, InterfaceC22374n.a.f40499h, 0.0f, null, 0, bE2, 384, 6, 15352);
                z12 = false;
                androidx.compose.foundation.H.B(bE2, false, true, false, false);
                C20608p2.a(bE2, C20588k2.f(aVar5, f12));
            }
            bE2.X(z12);
            androidx.compose.ui.v vVarA2 = C20646z1.a(C20588k2.d(androidx.compose.ui.v.f42878y1, 1.0f), IntrinsicSize.f28334c);
            i.a aVar6 = InterfaceC22215f.a.f39089o;
            C20585k.c cVar = C20585k.f28664f;
            bE2.I(-483455358);
            androidx.compose.foundation.layout.I iA3 = androidx.compose.foundation.layout.H.a(cVar, aVar6, bE2, 54);
            bE2.I(-1323940314);
            androidx.compose.ui.unit.d dVar3 = (androidx.compose.ui.unit.d) bE2.o(j32);
            LayoutDirection layoutDirection3 = (LayoutDirection) bE2.o(j33);
            InterfaceC22544x2 interfaceC22544x23 = (InterfaceC22544x2) bE2.o(j34);
            C22096n c22096nB3 = androidx.compose.ui.layout.M.b(vVarA2);
            if (interfaceC22078i == null) {
                C22190v.b();
                throw null;
            }
            bE2.A();
            if (bE2.f37887P) {
                bE2.b(aVar);
            } else {
                bE2.d();
            }
            bE2.f37913y = z12;
            boolean z13 = z12;
            androidx.compose.foundation.H.y(z13 ? 1 : 0, c22096nB3, x31.h.a(aVar3, bE2, iA3, bE2, dVar3, bE2, layoutDirection3, bE2, interfaceC22544x23, bE2, bE2), bE2, 2058660585);
            bE2.I(-214210816);
            List<InterfaceC40658b> list = hVar.f396555f;
            if (list != null) {
                for (InterfaceC40658b interfaceC40658b : list) {
                    if (interfaceC40658b instanceof InterfaceC40658b.g) {
                        AbstractC13965p.b((InterfaceC40658b.g) interfaceC40658b, null, j12, kotlin.jvm.internal.L.f(C42745f0.S(list), interfaceC40658b), pVar, bE2, (i14 & 896) | ((i14 << 3) & 57344));
                    }
                }
                G0 g02 = G0.f406611a;
            }
            androidx.compose.foundation.H.B(bE2, z13, z13, true, z13);
            androidx.compose.foundation.H.B(bE2, z13, z13, true, z13);
            bE2.X(z13);
        }
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z == null) {
            return;
        }
        c22039c2Z.f38184d = new B(hVar, vVar, j12, pVar, i12);
    }
}
