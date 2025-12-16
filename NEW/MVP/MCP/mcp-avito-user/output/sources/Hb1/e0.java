package Hb1;

import androidx.compose.foundation.layout.C20563e2;
import androidx.compose.foundation.layout.C20568f2;
import androidx.compose.foundation.layout.C20576h2;
import androidx.compose.foundation.layout.C20585k;
import androidx.compose.foundation.layout.C20588k2;
import androidx.compose.foundation.layout.R1;
import androidx.compose.runtime.C22039c2;
import androidx.compose.runtime.C22187u0;
import androidx.compose.runtime.C22190v;
import androidx.compose.runtime.InterfaceC22204y1;
import androidx.compose.runtime.internal.C22096n;
import androidx.compose.ui.InterfaceC22215f;
import androidx.compose.ui.graphics.U;
import androidx.compose.ui.node.InterfaceC22413h;
import androidx.compose.ui.platform.InterfaceC22544x2;
import androidx.compose.ui.platform.Q0;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.view.M0;
import androidx.view.T0;
import gc1.C40657a;
import gc1.InterfaceC40658b;
import java.util.List;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;
import w2.AbstractC49426b;

/* loaded from: classes9.dex */
public abstract class e0 {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f7452a = 0;

    static {
        C42745f0.U(new InterfaceC40658b.c("Недвижимость", "https://www.pngaaa.com/api-download/3018884", new C40657a((String) null, (String) null, (String) null, (gc1.g) null, (Boolean) null, 31, (C42822w) null), null, null, null, null, 120, null), new InterfaceC40658b.c("Оплата", "https://www.pngaaa.com/api-download/3018884", new C40657a((String) null, (String) null, (String) null, (gc1.g) null, (Boolean) null, 31, (C42822w) null), null, null, null, null, 120, null), new InterfaceC40658b.c("Избранное", "https://www.pngaaa.com/api-download/3018884", new C40657a((String) null, (String) null, (String) null, (gc1.g) null, (Boolean) null, 31, (C42822w) null), null, null, null, null, 120, null), new InterfaceC40658b.c("Корзина", "https://www.pngaaa.com/api-download/3018884", new C40657a((String) null, (String) null, (String) null, (gc1.g) null, (Boolean) null, 31, (C42822w) null), null, null, null, null, 120, null));
        C42745f0.U(new InterfaceC40658b.c("Недвижимость", "https://www.pa.com/api-download/3018884", new C40657a((String) null, (String) null, (String) null, (gc1.g) null, (Boolean) null, 31, (C42822w) null), null, null, null, null, 120, null), new InterfaceC40658b.c("Оплата", "https://www.pa.com/api-download/3018884", new C40657a((String) null, (String) null, (String) null, (gc1.g) null, (Boolean) null, 31, (C42822w) null), null, null, null, null, 120, null), new InterfaceC40658b.c("Избранное", "https://www.pa.com/api-download/3018884", new C40657a((String) null, (String) null, (String) null, (gc1.g) null, (Boolean) null, 31, (C42822w) null), null, null, null, null, 120, null), new InterfaceC40658b.c("Корзина", "https://www.pa.com/api-download/3018884", new C40657a((String) null, (String) null, (String) null, (gc1.g) null, (Boolean) null, 31, (C42822w) null), null, null, null, null, 120, null));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(InterfaceC40658b.o oVar, androidx.compose.ui.v vVar, long j12, Y41.p pVar, androidx.compose.runtime.A a12, int i12) {
        int i13;
        androidx.compose.runtime.B bE2 = a12.E(1743822619);
        if ((i12 & 14) == 0) {
            i13 = (bE2.B(oVar) ? 4 : 2) | i12;
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
            String strValueOf = String.valueOf(oVar.hashCode());
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
            C22187u0.d(new V(wVar, oVar, null), bE2, wVar);
            Object obj = ((sberid.sdk.ui.screens.compose.elk.root.s) interfaceC22204y1A.getF42167b()).f437836e;
            InterfaceC40658b.o oVar2 = (InterfaceC40658b.o) (obj instanceof InterfaceC40658b.o ? obj : null);
            if (oVar2 == null) {
                oVar2 = oVar;
            }
            boolean z12 = ((sberid.sdk.ui.screens.compose.elk.root.s) interfaceC22204y1A.getF42167b()).f437832a;
            boolean z13 = (((sberid.sdk.ui.screens.compose.elk.root.s) interfaceC22204y1A.getF42167b()).f437832a || oVar2.c()) ? false : true;
            boolean zC2 = oVar2.c();
            C22187u0.f(Boolean.valueOf(zC2), ((sberid.sdk.ui.screens.compose.elk.root.s) interfaceC22204y1A.getF42167b()).f437836e, Boolean.valueOf(((sberid.sdk.ui.screens.compose.elk.root.s) interfaceC22204y1A.getF42167b()).f437832a), new Y(zC2, wVar, oVar2, interfaceC22204y1A, null), bE2);
            if (z12) {
                bE2.I(-1551957039);
                xc1.l.a(vVar, bE2, (i13 >> 3) & 14);
                bE2.X(false);
            } else if (zC2) {
                bE2.I(-1551956957);
                c(oVar2, vVar, j12, pVar, bE2, i13 & 8176);
                bE2.X(false);
            } else if (z13) {
                bE2.I(-1551956768);
                bE2.X(false);
            } else {
                bE2.I(-1551956758);
                bE2.X(false);
            }
        }
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z == null) {
            return;
        }
        c22039c2Z.f38184d = new b0(oVar, vVar, j12, pVar, i12);
    }

    public static final void b(List list, long j12, Y41.p pVar, androidx.compose.runtime.A a12, int i12) {
        androidx.compose.runtime.B bE2 = a12.E(-1882986034);
        C20585k.f fVarA = sberid.sdk.ui.utils.extensions.a.a(C20585k.f28659a, bE2);
        androidx.compose.ui.v vVarK = R1.k(kotlin.jvm.internal.L.f(fVarA, C20585k.f28665g) ? AbstractC49426b.f441180W : AbstractC49426b.f441187b0, 0.0f, 2, C20588k2.d(androidx.compose.ui.v.f42878y1, 1.0f));
        bE2.I(693286680);
        InterfaceC22215f.f39074a.getClass();
        C20568f2 c20568f2A = C20563e2.a(fVarA, InterfaceC22215f.a.f39085k, bE2, 0);
        bE2.I(-1323940314);
        androidx.compose.ui.unit.d dVar = (androidx.compose.ui.unit.d) bE2.o(Q0.f41199h);
        LayoutDirection layoutDirection = (LayoutDirection) bE2.o(Q0.f41205n);
        InterfaceC22544x2 interfaceC22544x2 = (InterfaceC22544x2) bE2.o(Q0.f41210s);
        InterfaceC22413h.a aVar = InterfaceC22413h.f40789C1;
        aVar.getClass();
        Y41.a<InterfaceC22413h> aVar2 = InterfaceC22413h.a.f40791b;
        C22096n c22096nB = androidx.compose.ui.layout.M.b(vVarK);
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
        bE2.I(-806387289);
        for (InterfaceC40658b interfaceC40658b : C42745f0.E0(list, 4)) {
            if (interfaceC40658b instanceof InterfaceC40658b.c) {
                U.a aVar3 = androidx.compose.ui.graphics.U.f39332b;
                androidx.compose.ui.graphics.T.f39320b.getClass();
                W.b((InterfaceC40658b.c) interfaceC40658b, null, j12, U.a.a(aVar3, androidx.compose.ui.graphics.T.f39323e), pVar, bE2, ((i12 << 3) & 896) | 3072 | ((i12 << 6) & 57344), 2);
            } else {
                boolean z12 = interfaceC40658b instanceof InterfaceC40658b.d;
            }
        }
        androidx.compose.foundation.H.B(bE2, false, false, true, false);
        bE2.X(false);
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z == null) {
            return;
        }
        c22039c2Z.f38184d = new S(list, j12, pVar, i12);
    }

    public static final void c(InterfaceC40658b.o oVar, androidx.compose.ui.v vVar, long j12, Y41.p pVar, androidx.compose.runtime.A a12, int i12) {
        int i13;
        androidx.compose.runtime.B b12;
        androidx.compose.runtime.B bE2 = a12.E(1418798644);
        if ((i12 & 14) == 0) {
            i13 = (bE2.B(oVar) ? 4 : 2) | i12;
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
        int i14 = i13;
        if ((i14 & 5851) == 1170 && bE2.c()) {
            bE2.f();
            b12 = bE2;
        } else {
            List list = oVar.f396614k;
            if (list == null) {
                list = C42784z0.f406748b;
            }
            b12 = bE2;
            I81.l.a(vVar, androidx.compose.runtime.internal.r.b(bE2, 194577448, new L(oVar.f396605b, oVar.f396607d, j12, oVar.f396608e, i14, oVar.f396604a, oVar.f396609f, oVar.f396606c, oVar.f396610g, pVar, oVar, list)), b12, ((i14 >> 3) & 14) | 48);
        }
        C22039c2 c22039c2Z = b12.Z();
        if (c22039c2Z == null) {
            return;
        }
        c22039c2Z.f38184d = new O(oVar, vVar, j12, pVar, i12);
    }
}
