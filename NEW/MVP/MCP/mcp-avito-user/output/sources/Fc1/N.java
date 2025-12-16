package Fc1;

import androidx.compose.foundation.layout.C20632w;
import androidx.compose.foundation.layout.C20644z;
import androidx.compose.runtime.A;
import androidx.compose.runtime.C22039c2;
import androidx.compose.runtime.C22126m3;
import androidx.compose.runtime.C22190v;
import androidx.compose.runtime.InterfaceC22132o;
import androidx.compose.runtime.InterfaceC22181t;
import androidx.compose.runtime.InterfaceC22196w1;
import androidx.compose.runtime.InterfaceC22204y1;
import androidx.compose.runtime.internal.C22096n;
import androidx.compose.ui.InterfaceC22215f;
import androidx.compose.ui.layout.InterfaceC22365i0;
import androidx.compose.ui.node.InterfaceC22413h;

@kotlin.jvm.internal.s0
/* loaded from: classes9.dex */
public final class N {

    /* renamed from: a, reason: collision with root package name */
    public static final long f5104a;

    static {
        androidx.compose.ui.graphics.T.f39320b.getClass();
        f5104a = androidx.compose.ui.graphics.T.f39321c;
    }

    @InterfaceC22132o
    @InterfaceC22181t
    public static final void a(int i12, @Y61.k androidx.compose.runtime.external.kotlinx.collections.immutable.g gVar, @Y61.k Y41.a aVar, @Y61.l androidx.compose.runtime.A a12, int i13) {
        androidx.compose.runtime.B bE2 = a12.E(-1084426165);
        if (!gVar.isEmpty()) {
            bE2.I(-492369756);
            Object objT = bE2.t();
            androidx.compose.runtime.A.f37866a.getClass();
            A.a.C1651a c1651a = A.a.f37868b;
            if (objT == c1651a) {
                objT = androidx.compose.runtime.U2.a(i12);
                bE2.H(objT);
            }
            bE2.X(false);
            InterfaceC22196w1 interfaceC22196w1 = (InterfaceC22196w1) objT;
            bE2.I(-492369756);
            Object objT2 = bE2.t();
            if (objT2 == c1651a) {
                objT2 = C22126m3.g(Boolean.TRUE);
                bE2.H(objT2);
            }
            bE2.X(false);
            InterfaceC22204y1 interfaceC22204y1 = (InterfaceC22204y1) objT2;
            androidx.compose.ui.v vVarB = androidx.compose.foundation.A.b(androidx.compose.ui.v.f42878y1, f5104a, androidx.compose.ui.graphics.Y0.f39346a);
            bE2.I(733328855);
            InterfaceC22215f.f39074a.getClass();
            InterfaceC22365i0 interfaceC22365i0E = C20632w.e(InterfaceC22215f.a.f39076b, false, bE2, 0);
            bE2.I(-1323940314);
            int i14 = bE2.f37888Q;
            androidx.compose.runtime.O1 o1S = bE2.S();
            InterfaceC22413h.f40789C1.getClass();
            Y41.a<InterfaceC22413h> aVar2 = InterfaceC22413h.a.f40791b;
            C22096n c22096nC = androidx.compose.ui.layout.M.c(vVarB);
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
            androidx.compose.runtime.R3.b(InterfaceC22413h.a.f40796g, bE2, interfaceC22365i0E);
            androidx.compose.runtime.R3.b(InterfaceC22413h.a.f40795f, bE2, o1S);
            Y41.p<InterfaceC22413h, Integer, kotlin.G0> pVar = InterfaceC22413h.a.f40799j;
            if (bE2.f37887P || !kotlin.jvm.internal.L.f(bE2.t(), Integer.valueOf(i14))) {
                C13653k2.a(i14, bE2, i14, pVar);
            }
            A2.a(c22096nC, androidx.compose.runtime.J2.a(bE2), bE2);
            C20644z c20644z = C20644z.f28804a;
            C13752v3.a(interfaceC22196w1, gVar, interfaceC22204y1, bE2, 454);
            W2.a(interfaceC22196w1, gVar.size(), interfaceC22204y1, aVar, bE2, 390);
            androidx.compose.foundation.H.B(bE2, false, true, false, false);
        }
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z == null) {
            return;
        }
        c22039c2Z.f38184d = new M(i12, gVar, aVar, i13);
    }
}
