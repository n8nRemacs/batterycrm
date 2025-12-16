package xc1;

import androidx.compose.foundation.layout.C20563e2;
import androidx.compose.foundation.layout.C20568f2;
import androidx.compose.foundation.layout.C20576h2;
import androidx.compose.foundation.layout.C20585k;
import androidx.compose.foundation.layout.C20588k2;
import androidx.compose.foundation.layout.C20608p2;
import androidx.compose.runtime.A;
import androidx.compose.runtime.B;
import androidx.compose.runtime.C22039c2;
import androidx.compose.runtime.C22190v;
import androidx.compose.runtime.internal.C22096n;
import androidx.compose.ui.InterfaceC22215f;
import androidx.compose.ui.layout.M;
import androidx.compose.ui.node.InterfaceC22413h;
import androidx.compose.ui.platform.InterfaceC22544x2;
import androidx.compose.ui.platform.Q0;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.unit.h;
import androidx.compose.ui.v;

/* loaded from: classes9.dex */
public abstract class h {
    public static final void a(v vVar, A a12, int i12) {
        int i13;
        B bE2 = a12.E(492122646);
        if ((i12 & 14) == 0) {
            i13 = (bE2.B(vVar) ? 4 : 2) | i12;
        } else {
            i13 = i12;
        }
        if ((i13 & 11) == 2 && bE2.c()) {
            bE2.f();
        } else {
            bE2.I(693286680);
            C20585k.f28659a.getClass();
            C20585k.C1589k c1589k = C20585k.f28660b;
            InterfaceC22215f.f39074a.getClass();
            C20568f2 c20568f2A = C20563e2.a(c1589k, InterfaceC22215f.a.f39085k, bE2, 0);
            bE2.I(-1323940314);
            androidx.compose.ui.unit.d dVar = (androidx.compose.ui.unit.d) bE2.o(Q0.f41199h);
            LayoutDirection layoutDirection = (LayoutDirection) bE2.o(Q0.f41205n);
            InterfaceC22544x2 interfaceC22544x2 = (InterfaceC22544x2) bE2.o(Q0.f41210s);
            InterfaceC22413h.a aVar = InterfaceC22413h.f40789C1;
            aVar.getClass();
            Y41.a<InterfaceC22413h> aVar2 = InterfaceC22413h.a.f40791b;
            C22096n c22096nB = M.b(vVar);
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
            v.a aVar3 = v.f42878y1;
            Ac1.d.a(c20576h2.a(aVar3, 0.5f, true), bE2, 0);
            h.a aVar4 = androidx.compose.ui.unit.h.f42849c;
            C20608p2.a(bE2, C20588k2.t(aVar3, 8));
            Ac1.d.a(c20576h2.a(aVar3, 0.5f, true), bE2, 0);
            bE2.X(false);
            bE2.X(true);
            bE2.X(false);
            bE2.X(false);
        }
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z == null) {
            return;
        }
        c22039c2Z.f38184d = new g(vVar, i12);
    }
}
