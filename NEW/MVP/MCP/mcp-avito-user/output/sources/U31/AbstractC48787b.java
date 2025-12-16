package u31;

import androidx.compose.foundation.H;
import androidx.compose.foundation.layout.C20588k2;
import androidx.compose.foundation.layout.C20632w;
import androidx.compose.foundation.layout.C20644z;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.runtime.A;
import androidx.compose.runtime.B;
import androidx.compose.runtime.C22039c2;
import androidx.compose.runtime.C22190v;
import androidx.compose.runtime.I3;
import androidx.compose.runtime.InterfaceC22204y1;
import androidx.compose.runtime.internal.C22096n;
import androidx.compose.ui.InterfaceC22215f;
import androidx.compose.ui.graphics.T;
import androidx.compose.ui.graphics.V;
import androidx.compose.ui.layout.InterfaceC22365i0;
import androidx.compose.ui.layout.M;
import androidx.compose.ui.node.InterfaceC22413h;
import androidx.compose.ui.platform.InterfaceC22544x2;
import androidx.compose.ui.platform.Q0;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.v;
import w2.AbstractC49425a;
import x31.h;
import x31.i;

/* renamed from: u31.b, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC48787b {
    public static final void a(InterfaceC22204y1 interfaceC22204y1, A a12, int i12) {
        int i13;
        int iIntValue;
        B bE2 = a12.E(-312278460);
        if ((i12 & 14) == 0) {
            i13 = (bE2.B(interfaceC22204y1) ? 4 : 2) | i12;
        } else {
            i13 = i12;
        }
        if ((i13 & 11) == 2 && bE2.c()) {
            bE2.f();
        } else {
            bE2.I(-492369756);
            Object objT = bE2.t();
            A.f37866a.getClass();
            if (objT == A.a.f37868b) {
                bE2.H(interfaceC22204y1);
                objT = interfaceC22204y1;
            }
            bE2.X(false);
            Integer num = ((C48788c) ((I3) objT).getF42167b()).f439757a;
            bE2.I(-2115984910);
            if (num == null) {
                T.a aVar = T.f39320b;
                iIntValue = V.j(AbstractC49425a.c(bE2));
            } else {
                iIntValue = num.intValue();
            }
            int i14 = iIntValue;
            bE2.X(false);
            v.a aVar2 = v.f42878y1;
            FillElement fillElement = C20588k2.f28682c;
            aVar2.getClass();
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
            C22096n c22096nB = M.b(fillElement);
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
            i.a(c22096nB, h.a(aVar3, bE2, interfaceC22365i0E, bE2, dVar, bE2, layoutDirection, bE2, interfaceC22544x2, bE2, bE2), bE2);
            Ec1.b.a(C20644z.f28804a.d(aVar2, InterfaceC22215f.a.f39080f), V.b(i14), null, null, 0, null, null, bE2, 0);
            H.B(bE2, false, true, false, false);
        }
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z == null) {
            return;
        }
        c22039c2Z.f38184d = new C48786a(i12, interfaceC22204y1);
    }
}
