package Fc1;

import androidx.compose.foundation.C20529i0;
import androidx.compose.foundation.layout.C20563e2;
import androidx.compose.foundation.layout.C20568f2;
import androidx.compose.foundation.layout.C20576h2;
import androidx.compose.foundation.layout.C20585k;
import androidx.compose.runtime.C22039c2;
import androidx.compose.runtime.C22190v;
import androidx.compose.runtime.InterfaceC22132o;
import androidx.compose.runtime.InterfaceC22137p;
import androidx.compose.runtime.InterfaceC22204y1;
import androidx.compose.runtime.internal.C22096n;
import androidx.compose.ui.InterfaceC22215f;
import androidx.compose.ui.i;
import androidx.compose.ui.node.InterfaceC22413h;
import androidx.compose.ui.unit.h;
import kotlin.NoWhenBranchMatchedException;

@kotlin.jvm.internal.s0
/* renamed from: Fc1.t1, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C13732t1 {
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC22132o
    @InterfaceC22137p
    public static final void a(@Y61.l androidx.compose.ui.v vVar, boolean z12, @Y61.k C22096n c22096n, @Y61.l androidx.compose.runtime.A a12, int i12) {
        int i13;
        N7 n7M;
        long jA2;
        androidx.compose.runtime.B bE2 = a12.E(295928426);
        if ((i12 & 14) == 0) {
            i13 = (bE2.B(vVar) ? 4 : 2) | i12;
        } else {
            i13 = i12;
        }
        if ((i12 & 112) == 0) {
            i13 |= bE2.j(z12) ? 32 : 16;
        }
        if ((i12 & 896) == 0) {
            i13 |= bE2.u(c22096n) ? 256 : 128;
        }
        if ((i13 & 731) == 146 && bE2.c()) {
            bE2.f();
        } else {
            InterfaceC13779y3 interfaceC13779y3 = (InterfaceC13779y3) bE2.o(C13707q2.f5762a);
            boolean zBooleanValue = ((Boolean) ((InterfaceC22204y1) bE2.o(C13788z3.f5920a)).getF42167b()).booleanValue();
            if (z12) {
                n7M = interfaceC13779y3.e();
            } else {
                if (z12) {
                    throw new NoWhenBranchMatchedException();
                }
                n7M = interfaceC13779y3.m();
            }
            long jA3 = C13775y.a(n7M);
            if (zBooleanValue) {
                jA2 = C13775y.a(interfaceC13779y3.k());
            } else {
                if (zBooleanValue) {
                    throw new NoWhenBranchMatchedException();
                }
                androidx.compose.ui.graphics.T.f39320b.getClass();
                jA2 = androidx.compose.ui.graphics.T.f39330l;
            }
            InterfaceC22215f.f39074a.getClass();
            i.b bVar = InterfaceC22215f.a.f39086l;
            float fA2 = interfaceC13779y3.q().a();
            h.a aVar = androidx.compose.ui.unit.h.f42849c;
            androidx.compose.ui.v vVarA = C20529i0.a(androidx.compose.foundation.A.b(vVar, jA3, androidx.compose.foundation.shape.o.a(fA2)), 2, jA2, androidx.compose.foundation.shape.o.a(interfaceC13779y3.q().a()));
            int i14 = ((i13 << 3) & 7168) | 384;
            bE2.I(693286680);
            C20585k.f28659a.getClass();
            C20568f2 c20568f2A = C20563e2.a(C20585k.f28660b, bVar, bE2, 48);
            bE2.I(-1323940314);
            int i15 = bE2.f37888Q;
            androidx.compose.runtime.O1 o1S = bE2.S();
            InterfaceC22413h.f40789C1.getClass();
            Y41.a<InterfaceC22413h> aVar2 = InterfaceC22413h.a.f40791b;
            C22096n c22096nC = androidx.compose.ui.layout.M.c(vVarA);
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
            androidx.compose.runtime.R3.b(InterfaceC22413h.a.f40796g, bE2, c20568f2A);
            androidx.compose.runtime.R3.b(InterfaceC22413h.a.f40795f, bE2, o1S);
            Y41.p<InterfaceC22413h, Integer, kotlin.G0> pVar = InterfaceC22413h.a.f40799j;
            if (bE2.f37887P || !kotlin.jvm.internal.L.f(bE2.t(), Integer.valueOf(i15))) {
                C13653k2.a(i15, bE2, i15, pVar);
            }
            A2.a(c22096nC, androidx.compose.runtime.J2.a(bE2), bE2);
            c22096n.invoke(C20576h2.f28641a, bE2, Integer.valueOf(((i14 >> 6) & 112) | 6));
            bE2.X(false);
            androidx.compose.foundation.H.A(bE2, true, false, false);
        }
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z == null) {
            return;
        }
        c22039c2Z.f38184d = new C13723s1(vVar, z12, c22096n, i12);
    }
}
