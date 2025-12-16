package tc1;

import Y41.l;
import androidx.compose.foundation.H;
import androidx.compose.foundation.layout.C20588k2;
import androidx.compose.foundation.layout.C20632w;
import androidx.compose.foundation.layout.C20644z;
import androidx.compose.foundation.layout.R1;
import androidx.compose.foundation.shape.o;
import androidx.compose.runtime.A;
import androidx.compose.runtime.B;
import androidx.compose.runtime.C22039c2;
import androidx.compose.runtime.C22126m3;
import androidx.compose.runtime.C22190v;
import androidx.compose.runtime.InterfaceC22204y1;
import androidx.compose.runtime.internal.C22096n;
import androidx.compose.ui.InterfaceC22215f;
import androidx.compose.ui.draw.k;
import androidx.compose.ui.graphics.F;
import androidx.compose.ui.graphics.Y0;
import androidx.compose.ui.layout.InterfaceC22365i0;
import androidx.compose.ui.layout.InterfaceC22374n;
import androidx.compose.ui.layout.M;
import androidx.compose.ui.node.InterfaceC22413h;
import androidx.compose.ui.platform.InterfaceC22544x2;
import androidx.compose.ui.platform.Q0;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.v;
import w2.AbstractC49426b;
import x31.i;

/* loaded from: classes9.dex */
public abstract class e {
    public static final void a(String str, v vVar, float f12, long j12, float f13, InterfaceC22374n.a.C1667a c1667a, float f14, F f15, Y41.a aVar, Y41.a aVar2, A a12, int i12, int i13) {
        int i14;
        float f16;
        float f17;
        InterfaceC22374n.a.C1667a c1667a2;
        float f18;
        float f19;
        float f22;
        InterfaceC22374n.a.C1667a c1667a3;
        float f23;
        B bE2 = a12.E(-530818705);
        if ((i12 & 14) == 0) {
            i14 = (bE2.B(str) ? 4 : 2) | i12;
        } else {
            i14 = i12;
        }
        if ((i12 & 112) == 0) {
            i14 |= bE2.B(vVar) ? 32 : 16;
        }
        int i15 = i14 | 384;
        if ((i12 & 7168) == 0) {
            i15 |= bE2.n(j12) ? 2048 : 1024;
        }
        int i16 = i15 | 14376960;
        if ((234881024 & i12) == 0) {
            i16 |= bE2.B(f15) ? 67108864 : 33554432;
        }
        int i17 = i16 | 268435456;
        int i18 = i13 | 6;
        if ((i13 & 112) == 0) {
            i18 |= bE2.u(aVar) ? 32 : 16;
        }
        if ((i13 & 896) == 0) {
            i18 |= bE2.u(aVar2) ? 256 : 128;
        }
        if ((1533916891 & i17) == 306783378 && (i18 & 731) == 146 && bE2.c()) {
            bE2.f();
            f19 = f12;
            f22 = f13;
            c1667a3 = c1667a;
            f23 = f14;
        } else {
            bE2.y0();
            if ((i12 & 1) == 0 || bE2.g0()) {
                f16 = AbstractC49426b.f441186b;
                f17 = AbstractC49426b.f441201i0;
                InterfaceC22374n.f40491a.getClass();
                c1667a2 = InterfaceC22374n.a.f40493b;
                f18 = 1.0f;
            } else {
                bE2.f();
                f16 = f12;
                f17 = f13;
                c1667a2 = c1667a;
                f18 = f14;
            }
            bE2.Y();
            v vVarI = R1.i(androidx.compose.foundation.A.b(k.a(C20588k2.o(vVar, f16), o.a(f17)), j12, Y0.f39346a), AbstractC49426b.f441192e);
            bE2.I(733328855);
            InterfaceC22215f.f39074a.getClass();
            InterfaceC22365i0 interfaceC22365i0E = C20632w.e(InterfaceC22215f.a.f39076b, false, bE2, 0);
            bE2.I(-1323940314);
            androidx.compose.ui.unit.d dVar = (androidx.compose.ui.unit.d) bE2.o(Q0.f41199h);
            LayoutDirection layoutDirection = (LayoutDirection) bE2.o(Q0.f41205n);
            InterfaceC22544x2 interfaceC22544x2 = (InterfaceC22544x2) bE2.o(Q0.f41210s);
            InterfaceC22413h.a aVar3 = InterfaceC22413h.f40789C1;
            aVar3.getClass();
            Y41.a<InterfaceC22413h> aVar4 = InterfaceC22413h.a.f40791b;
            C22096n c22096nB = M.b(vVarI);
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
            i.a(c22096nB, x31.h.a(aVar3, bE2, interfaceC22365i0E, bE2, dVar, bE2, layoutDirection, bE2, interfaceC22544x2, bE2, bE2), bE2);
            C20644z c20644z = C20644z.f28804a;
            bE2.I(-492369756);
            Object objT = bE2.t();
            A.f37866a.getClass();
            Object obj = A.a.f37868b;
            if (objT == obj) {
                objT = C22126m3.g(Boolean.FALSE);
                bE2.H(objT);
            }
            bE2.X(false);
            InterfaceC22204y1 interfaceC22204y1 = (InterfaceC22204y1) objT;
            bE2.I(-408993257);
            bE2.X(false);
            v vVarB = c20644z.b(v.f42878y1);
            bE2.I(1157296644);
            boolean zB2 = bE2.B(null);
            Object objT2 = bE2.t();
            if (zB2 || objT2 == obj) {
                objT2 = new a(1);
                bE2.H(objT2);
            }
            bE2.X(false);
            l lVar = (l) objT2;
            bE2.I(511388516);
            boolean zB3 = bE2.B(interfaceC22204y1) | bE2.B(aVar);
            Object objT3 = bE2.t();
            if (zB3 || objT3 == obj) {
                objT3 = new b(aVar, interfaceC22204y1);
                bE2.H(objT3);
            }
            bE2.X(false);
            l lVar2 = (l) objT3;
            bE2.I(1157296644);
            boolean zB4 = bE2.B(aVar2);
            Object objT4 = bE2.t();
            if (zB4 || objT4 == obj) {
                objT4 = new c(aVar2);
                bE2.H(objT4);
            }
            bE2.X(false);
            sberid.sdk.ui.utils.extensions.g.a(str, null, vVarB, lVar, lVar2, (l) objT4, null, c1667a2, f18, f15, 0, bE2, (i17 & 14) | ((i17 >> 9) & 112), (i17 >> 18) & 1022, 8760);
            H.B(bE2, false, true, false, false);
            f19 = f16;
            f22 = f17;
            c1667a3 = c1667a2;
            f23 = f18;
        }
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z == null) {
            return;
        }
        c22039c2Z.f38184d = new d(str, vVar, f19, j12, f22, c1667a3, f23, f15, aVar, aVar2, i12, i13);
    }
}
