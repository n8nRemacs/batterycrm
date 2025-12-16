package Hb1;

import androidx.compose.foundation.C20806p1;
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
import androidx.compose.runtime.InterfaceC22078i;
import androidx.compose.runtime.InterfaceC22204y1;
import androidx.compose.runtime.J3;
import androidx.compose.runtime.internal.C22096n;
import androidx.compose.ui.InterfaceC22215f;
import androidx.compose.ui.graphics.T;
import androidx.compose.ui.graphics.U;
import androidx.compose.ui.i;
import androidx.compose.ui.layout.InterfaceC22374n;
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
import kotlin.text.C43066x;
import okhttp3.internal.http2.Http2;
import w2.AbstractC49425a;
import w2.AbstractC49426b;

/* renamed from: Hb1.p, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC13965p {
    public static final void a(C20576h2 c20576h2, C40657a c40657a, androidx.compose.runtime.A a12, int i12) {
        androidx.compose.runtime.B bE2 = a12.E(525982658);
        if (c40657a != null) {
            bE2.I(2083884424);
            androidx.compose.ui.v vVarO = C20588k2.o(androidx.compose.ui.v.f42878y1, AbstractC49426b.f441196g);
            InterfaceC22215f.f39074a.getClass();
            androidx.compose.ui.v vVarC = c20576h2.c(vVarO, InterfaceC22215f.a.f39086l);
            androidx.compose.ui.graphics.painter.e eVarA = u0.e.a(R.drawable.ic_arrow_right, 0, bE2);
            U.a aVar = androidx.compose.ui.graphics.U.f39332b;
            T.a aVar2 = androidx.compose.ui.graphics.T.f39320b;
            bE2.I(1567581961);
            long jD2 = androidx.compose.ui.graphics.V.d(ic1.d.a(bE2) ? 4287269772L : 4285166195L);
            bE2.O();
            C20806p1.a(eVarA, "", vVarC, null, null, 0.0f, U.a.a(aVar, jD2), bE2, 56, 56);
            bE2.X(false);
        } else {
            bE2.I(2083884798);
            C20608p2.a(bE2, C20588k2.o(androidx.compose.ui.v.f42878y1, AbstractC49426b.f441196g));
            bE2.X(false);
        }
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z == null) {
            return;
        }
        c22039c2Z.f38184d = new C13953d(c20576h2, c40657a, i12);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void b(InterfaceC40658b.g gVar, v.a aVar, long j12, boolean z12, Y41.p pVar, androidx.compose.runtime.A a12, int i12) {
        int i13;
        v.a aVar2;
        v.a aVar3;
        androidx.compose.runtime.B bE2 = a12.E(-1410648852);
        if ((i12 & 14) == 0) {
            i13 = (bE2.B(gVar) ? 4 : 2) | i12;
        } else {
            i13 = i12;
        }
        int i14 = i13 | 48;
        if ((i12 & 896) == 0) {
            i14 |= bE2.n(j12) ? 256 : 128;
        }
        if ((i12 & 7168) == 0) {
            i14 |= bE2.j(z12) ? 2048 : 1024;
        }
        if ((57344 & i12) == 0) {
            i14 |= bE2.u(pVar) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192;
        }
        if ((46811 & i14) == 9362 && bE2.c()) {
            bE2.f();
            aVar3 = aVar;
        } else {
            bE2.y0();
            if ((i12 & 1) == 0 || bE2.g0()) {
                aVar2 = androidx.compose.ui.v.f42878y1;
            } else {
                bE2.f();
                aVar2 = aVar;
            }
            bE2.Y();
            String strValueOf = String.valueOf(gVar.hashCode());
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
            C22187u0.d(new r0(wVar, gVar, null), bE2, wVar);
            InterfaceC40658b interfaceC40658b = ((sberid.sdk.ui.screens.compose.elk.root.s) interfaceC22204y1A.getF42167b()).f437836e;
            if (!(interfaceC40658b instanceof InterfaceC40658b.g)) {
                interfaceC40658b = null;
            }
            InterfaceC40658b.g gVar2 = (InterfaceC40658b.g) interfaceC40658b;
            if (gVar2 == null) {
                gVar2 = gVar;
            }
            boolean z13 = ((sberid.sdk.ui.screens.compose.elk.root.s) interfaceC22204y1A.getF42167b()).f437832a && !gVar2.c();
            boolean z14 = (((sberid.sdk.ui.screens.compose.elk.root.s) interfaceC22204y1A.getF42167b()).f437832a || gVar2.c()) ? false : true;
            boolean zC2 = gVar2.c();
            C22187u0.f(Boolean.valueOf(zC2), ((sberid.sdk.ui.screens.compose.elk.root.s) interfaceC22204y1A.getF42167b()).f437836e, Boolean.valueOf(((sberid.sdk.ui.screens.compose.elk.root.s) interfaceC22204y1A.getF42167b()).f437832a), new t0(zC2, wVar, gVar2, interfaceC22204y1A, null), bE2);
            if (z13) {
                bE2.I(927226094);
                xc1.d.a(null, z12, bE2, (i14 >> 6) & 112, 1);
                bE2.X(false);
            } else if (zC2) {
                bE2.I(927226198);
                c(gVar2, aVar2, j12, z12, pVar, bE2, i14 & 65520);
                bE2.X(false);
            } else if (z14) {
                bE2.I(927226422);
                bE2.X(false);
            } else {
                bE2.I(927226432);
                bE2.X(false);
            }
            aVar3 = aVar2;
        }
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z == null) {
            return;
        }
        c22039c2Z.f38184d = new C13950a(gVar, aVar3, j12, z12, pVar, i12);
    }

    public static final void c(InterfaceC40658b.g gVar, androidx.compose.ui.v vVar, long j12, boolean z12, Y41.p pVar, androidx.compose.runtime.A a12, int i12) {
        int i13;
        Y41.a<InterfaceC22413h> aVar;
        androidx.compose.runtime.B bE2 = a12.E(520122062);
        if ((i12 & 14) == 0) {
            i13 = (bE2.B(gVar) ? 4 : 2) | i12;
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
            i13 |= bE2.j(z12) ? 2048 : 1024;
        }
        if ((57344 & i12) == 0) {
            i13 |= bE2.u(pVar) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192;
        }
        if ((i13 & 46811) == 9362 && bE2.c()) {
            bE2.f();
        } else {
            InterfaceC22215f.f39074a.getClass();
            i.b bVar = InterfaceC22215f.a.f39086l;
            androidx.compose.ui.v vVarA = C20646z1.a(vVar, IntrinsicSize.f28334c);
            C40657a c40657a = gVar.f396544d;
            androidx.compose.ui.v vVarA2 = androidx.compose.ui.n.a(vVarA, C22535v1.f41625a, new C13962m(pVar, gVar, c40657a));
            bE2.I(693286680);
            C20585k.f28659a.getClass();
            C20585k.C1589k c1589k = C20585k.f28660b;
            C20568f2 c20568f2A = C20563e2.a(c1589k, bVar, bE2, 48);
            bE2.I(-1323940314);
            J3 j32 = Q0.f41199h;
            androidx.compose.ui.unit.d dVar = (androidx.compose.ui.unit.d) bE2.o(j32);
            J3 j33 = Q0.f41205n;
            LayoutDirection layoutDirection = (LayoutDirection) bE2.o(j33);
            J3 j34 = Q0.f41210s;
            InterfaceC22544x2 interfaceC22544x2 = (InterfaceC22544x2) bE2.o(j34);
            InterfaceC22413h.a aVar2 = InterfaceC22413h.f40789C1;
            aVar2.getClass();
            Y41.a<InterfaceC22413h> aVar3 = InterfaceC22413h.a.f40791b;
            C22096n c22096nB = androidx.compose.ui.layout.M.b(vVarA2);
            InterfaceC22078i<?> interfaceC22078i = bE2.f37890b;
            if (interfaceC22078i == null) {
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
            InterfaceC22374n.f40491a.getClass();
            InterfaceC22374n.a.b bVar2 = InterfaceC22374n.a.f40499h;
            androidx.compose.ui.graphics.F fA2 = gVar.f396543c ? U.a.a(androidx.compose.ui.graphics.U.f39332b, j12) : null;
            v.a aVar4 = androidx.compose.ui.v.f42878y1;
            float f12 = AbstractC49426b.f441183Z;
            androidx.compose.ui.v vVarO = C20588k2.o(R1.m(aVar4, 0.0f, f12, AbstractC49426b.f441185a0, f12, 1), AbstractC49426b.f441170M);
            String str = gVar.f396542b;
            String str2 = gVar.f396541a;
            sberid.sdk.ui.utils.extensions.g.a(str, str2, vVarO, null, null, null, null, bVar2, 0.0f, fA2, 0, bE2, 0, 6, 11256);
            FillElement fillElement = C20588k2.f28681b;
            aVar4.getClass();
            bE2.I(-483455358);
            androidx.compose.foundation.layout.I iA2 = androidx.compose.foundation.layout.H.a(C20585k.f28662d, InterfaceC22215f.a.f39088n, bE2, 0);
            bE2.I(-1323940314);
            androidx.compose.ui.unit.d dVar2 = (androidx.compose.ui.unit.d) bE2.o(j32);
            LayoutDirection layoutDirection2 = (LayoutDirection) bE2.o(j33);
            InterfaceC22544x2 interfaceC22544x22 = (InterfaceC22544x2) bE2.o(j34);
            C22096n c22096nB2 = androidx.compose.ui.layout.M.b(fillElement);
            if (interfaceC22078i == null) {
                C22190v.b();
                throw null;
            }
            bE2.A();
            if (bE2.f37887P) {
                aVar = aVar3;
                bE2.b(aVar);
            } else {
                aVar = aVar3;
                bE2.d();
            }
            bE2.f37913y = false;
            Y41.a<InterfaceC22413h> aVar5 = aVar;
            x31.i.a(c22096nB2, x31.h.a(aVar2, bE2, iA2, bE2, dVar2, bE2, layoutDirection2, bE2, interfaceC22544x22, bE2, bE2), bE2);
            androidx.compose.ui.v vVarA3 = androidx.compose.foundation.layout.K.f28344a.a(aVar4, 1.0f, true);
            bE2.I(693286680);
            C20568f2 c20568f2A2 = C20563e2.a(c1589k, bVar, bE2, 54);
            bE2.I(-1323940314);
            androidx.compose.ui.unit.d dVar3 = (androidx.compose.ui.unit.d) bE2.o(j32);
            LayoutDirection layoutDirection3 = (LayoutDirection) bE2.o(j33);
            InterfaceC22544x2 interfaceC22544x23 = (InterfaceC22544x2) bE2.o(j34);
            C22096n c22096nB3 = androidx.compose.ui.layout.M.b(vVarA3);
            if (interfaceC22078i == null) {
                C22190v.b();
                throw null;
            }
            bE2.A();
            if (bE2.f37887P) {
                bE2.b(aVar5);
            } else {
                bE2.d();
            }
            bE2.f37913y = false;
            androidx.compose.foundation.H.y(0, c22096nB3, x31.h.a(aVar2, bE2, c20568f2A2, bE2, dVar3, bE2, layoutDirection3, bE2, interfaceC22544x23, bE2, bE2), bE2, 2058660585);
            bE2.I(-994301417);
            if (str2 != null && !C43066x.K(str2)) {
                T.a aVar6 = androidx.compose.ui.graphics.T.f39320b;
                Mc1.s.i(str2, R1.k(0.0f, AbstractC49426b.f441187b0, 1, c20576h2.a(aVar4, 1.0f, true)), AbstractC49425a.b(bE2), bE2, 0);
            }
            bE2.X(false);
            a(c20576h2, c40657a, bE2, 70);
            androidx.compose.foundation.H.B(bE2, false, true, false, false);
            bE2.I(-214210007);
            if (!z12) {
                AbstractC13964o.a(R1.m(aVar4, 0.0f, 0.0f, f12, 0.0f, 11), 0L, 0.0f, bE2, 0);
            }
            androidx.compose.foundation.H.B(bE2, false, false, true, false);
            androidx.compose.foundation.H.B(bE2, false, false, true, false);
            bE2.X(false);
        }
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z == null) {
            return;
        }
        c22039c2Z.f38184d = new C13956g(gVar, vVar, j12, z12, pVar, i12);
    }
}
