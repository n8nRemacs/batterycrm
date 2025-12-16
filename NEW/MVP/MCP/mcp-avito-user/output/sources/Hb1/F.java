package Hb1;

import androidx.compose.foundation.a2;
import androidx.compose.foundation.layout.C20563e2;
import androidx.compose.foundation.layout.C20568f2;
import androidx.compose.foundation.layout.C20576h2;
import androidx.compose.foundation.layout.C20585k;
import androidx.compose.foundation.layout.C20588k2;
import androidx.compose.foundation.layout.C20608p2;
import androidx.compose.foundation.layout.C20646z1;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.foundation.layout.IntrinsicSize;
import androidx.compose.foundation.layout.R1;
import androidx.compose.runtime.C22039c2;
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
import androidx.compose.ui.v;
import androidx.view.M0;
import androidx.view.T0;
import gc1.InterfaceC40658b;
import java.util.Iterator;
import java.util.List;
import w2.AbstractC49426b;

/* loaded from: classes9.dex */
public abstract class F {
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(InterfaceC40658b.l lVar, v.a aVar, long j12, Y41.p pVar, androidx.compose.runtime.A a12, int i12) {
        int i13;
        androidx.compose.runtime.B bE2 = a12.E(1098198178);
        if ((i12 & 14) == 0) {
            i13 = (bE2.B(lVar) ? 4 : 2) | i12;
        } else {
            i13 = i12;
        }
        if ((i12 & 112) == 0) {
            i13 |= bE2.B(aVar) ? 32 : 16;
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
            String strValueOf = String.valueOf(lVar.hashCode());
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
            C22187u0.d(new C13966q(wVar, lVar, null), bE2, wVar);
            Object obj = ((sberid.sdk.ui.screens.compose.elk.root.s) interfaceC22204y1A.getF42167b()).f437836e;
            InterfaceC40658b.l lVar2 = (InterfaceC40658b.l) (obj instanceof InterfaceC40658b.l ? obj : null);
            if (lVar2 == null) {
                lVar2 = lVar;
            }
            boolean z12 = ((sberid.sdk.ui.screens.compose.elk.root.s) interfaceC22204y1A.getF42167b()).f437832a && !lVar2.c();
            boolean z13 = (((sberid.sdk.ui.screens.compose.elk.root.s) interfaceC22204y1A.getF42167b()).f437832a || lVar2.c()) ? false : true;
            boolean zC2 = lVar2.c();
            C22187u0.f(Boolean.valueOf(zC2), ((sberid.sdk.ui.screens.compose.elk.root.s) interfaceC22204y1A.getF42167b()).f437836e, Boolean.valueOf(((sberid.sdk.ui.screens.compose.elk.root.s) interfaceC22204y1A.getF42167b()).f437832a), new C13968t(zC2, wVar, lVar2, interfaceC22204y1A, null), bE2);
            if (z12) {
                bE2.I(-1738370966);
                xc1.h.a(aVar, bE2, (i13 >> 3) & 14);
                bE2.X(false);
            } else if (zC2) {
                bE2.I(-1738370876);
                b(lVar2.f396587f, aVar, j12, pVar, bE2, (i13 & 112) | 8 | (i13 & 896) | (i13 & 7168));
                bE2.X(false);
            } else if (z13) {
                bE2.I(-1738370684);
                bE2.X(false);
            } else {
                bE2.I(-1738370674);
                bE2.X(false);
            }
        }
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z == null) {
            return;
        }
        c22039c2Z.f38184d = new C13971w(lVar, aVar, j12, pVar, i12);
    }

    public static final void b(List list, v.a aVar, long j12, Y41.p pVar, androidx.compose.runtime.A a12, int i12) {
        androidx.compose.runtime.B bE2 = a12.E(894024836);
        if (list == null) {
            C22039c2 c22039c2Z = bE2.Z();
            if (c22039c2Z == null) {
                return;
            }
            c22039c2Z.f38184d = new C(list, aVar, j12, pVar, i12);
            return;
        }
        androidx.compose.ui.v vVarB = a2.b(C20646z1.a(C20588k2.d(aVar, 1.0f), IntrinsicSize.f28334c), a2.a(bE2), false, true);
        C20585k c20585k = C20585k.f28659a;
        float f12 = AbstractC49426b.f441165H;
        InterfaceC22215f.f39074a.getClass();
        i.a aVar2 = InterfaceC22215f.a.f39089o;
        c20585k.getClass();
        C20585k.j jVarH = C20585k.h(f12, aVar2);
        i.b bVar = InterfaceC22215f.a.f39086l;
        bE2.I(693286680);
        C20568f2 c20568f2A = C20563e2.a(jVarH, bVar, bE2, 54);
        bE2.I(-1323940314);
        androidx.compose.ui.unit.d dVar = (androidx.compose.ui.unit.d) bE2.o(Q0.f41199h);
        LayoutDirection layoutDirection = (LayoutDirection) bE2.o(Q0.f41205n);
        InterfaceC22544x2 interfaceC22544x2 = (InterfaceC22544x2) bE2.o(Q0.f41210s);
        InterfaceC22413h.a aVar3 = InterfaceC22413h.f40789C1;
        aVar3.getClass();
        Y41.a<InterfaceC22413h> aVar4 = InterfaceC22413h.a.f40791b;
        C22096n c22096nB = androidx.compose.ui.layout.M.b(vVarB);
        if (bE2.f37890b == null) {
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
        x31.i.a(c22096nB, x31.h.a(aVar3, bE2, c20568f2A, bE2, dVar, bE2, layoutDirection, bE2, interfaceC22544x2, bE2, bE2), bE2);
        C20576h2 c20576h2 = C20576h2.f28641a;
        C20608p2.a(bE2, R1.i(androidx.compose.ui.v.f42878y1, AbstractC49426b.f441179V));
        bE2.I(-214211590);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            InterfaceC40658b interfaceC40658b = (InterfaceC40658b) it.next();
            if (interfaceC40658b instanceof InterfaceC40658b.e) {
                v.a aVar5 = androidx.compose.ui.v.f42878y1;
                FillElement fillElement = C20588k2.f28681b;
                aVar5.getClass();
                InterfaceC40658b.e eVar = (InterfaceC40658b.e) interfaceC40658b;
                p0.a(((i12 >> 3) & 896) | 48, 8, bE2, C20588k2.u(C20646z1.c(fillElement, IntrinsicSize.f28334c), AbstractC49426b.f441224u, AbstractC49426b.f441226v), null, pVar, eVar);
            }
        }
        bE2.X(false);
        C20608p2.a(bE2, R1.i(androidx.compose.ui.v.f42878y1, AbstractC49426b.f441179V));
        bE2.X(false);
        bE2.X(true);
        C22039c2 c22039c2N = com.avito.android.actions_sheet.a.n(bE2, false, false);
        if (c22039c2N == null) {
            return;
        }
        c22039c2N.f38184d = new C13974z(list, aVar, j12, pVar, i12);
    }
}
