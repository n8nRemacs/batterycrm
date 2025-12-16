package Fc1;

import android.graphics.Color;
import androidx.compose.animation.core.C20293k0;
import androidx.compose.animation.core.C20310q;
import androidx.compose.animation.core.RepeatMode;
import androidx.compose.foundation.layout.C20632w;
import androidx.compose.foundation.layout.C20644z;
import androidx.compose.runtime.C22039c2;
import androidx.compose.runtime.C22082i3;
import androidx.compose.runtime.C22190v;
import androidx.compose.runtime.InterfaceC22078i;
import androidx.compose.runtime.InterfaceC22132o;
import androidx.compose.runtime.InterfaceC22137p;
import androidx.compose.runtime.internal.C22096n;
import androidx.compose.ui.InterfaceC22215f;
import androidx.compose.ui.graphics.C22274n0;
import androidx.compose.ui.graphics.C22322z0;
import androidx.compose.ui.graphics.J;
import androidx.compose.ui.layout.InterfaceC22365i0;
import androidx.compose.ui.node.InterfaceC22413h;
import androidx.compose.ui.unit.h;
import kotlin.collections.C42745f0;

@kotlin.jvm.internal.s0
/* loaded from: classes9.dex */
public final class N4 {
    @InterfaceC22132o
    @InterfaceC22137p
    public static final void a(@Y61.l androidx.compose.ui.v vVar, boolean z12, @Y61.k C22096n c22096n, @Y61.l androidx.compose.runtime.A a12, int i12) {
        int i13;
        boolean z13;
        androidx.compose.runtime.B bE2 = a12.E(-1433400150);
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
        int i14 = i13;
        if ((i14 & 731) == 146 && bE2.c()) {
            bE2.f();
        } else {
            C22322z0 c22322z0A = J.a.a(androidx.compose.ui.graphics.J.f39287a, C42745f0.U(androidx.compose.ui.graphics.T.a(androidx.compose.ui.graphics.T.c(C13775y.a(C13705q0.f5760a), 0.6f)), androidx.compose.ui.graphics.T.a(androidx.compose.ui.graphics.T.c(androidx.compose.ui.graphics.V.b(Color.parseColor("#FFEDEDED")), 0.2f)), androidx.compose.ui.graphics.T.a(androidx.compose.ui.graphics.T.c(androidx.compose.ui.graphics.V.b(Color.parseColor("#FFEDEDED")), 0.6f))), 0.0f, ((Number) ((C22082i3) C20293k0.a(C20293k0.c("", bE2, 0), 0.0f, 1000.0f, C20310q.a(C20310q.e(800, 300, null, 4), RepeatMode.f26133b, 0L, 4), "", bE2, 29112, 0).f26280e).getF42167b()).floatValue(), 10);
            InterfaceC22078i<?> interfaceC22078i = bE2.f37890b;
            if (z12) {
                bE2.I(-313050326);
                h.a aVar = androidx.compose.ui.unit.h.f42849c;
                androidx.compose.ui.v vVarA = androidx.compose.foundation.A.a(androidx.compose.ui.draw.k.a(vVar, androidx.compose.foundation.shape.o.a(4)), c22322z0A);
                bE2.I(733328855);
                InterfaceC22215f.f39074a.getClass();
                z13 = false;
                InterfaceC22365i0 interfaceC22365i0E = C20632w.e(InterfaceC22215f.a.f39076b, false, bE2, 0);
                bE2.I(-1323940314);
                int i15 = bE2.f37888Q;
                androidx.compose.runtime.O1 o1S = bE2.S();
                InterfaceC22413h.f40789C1.getClass();
                Y41.a<InterfaceC22413h> aVar2 = InterfaceC22413h.a.f40791b;
                C22096n c22096nC = androidx.compose.ui.layout.M.c(vVarA);
                if (interfaceC22078i == null) {
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
                if (bE2.f37887P || !kotlin.jvm.internal.L.f(bE2.t(), Integer.valueOf(i15))) {
                    C13653k2.a(i15, bE2, i15, pVar);
                }
                A2.a(c22096nC, androidx.compose.runtime.J2.a(bE2), bE2);
                C20632w.a(C22274n0.a(C20644z.f28804a.b(androidx.compose.ui.v.f42878y1), L4.f5077l), bE2, 0);
                bE2.X(false);
            } else {
                z13 = false;
                bE2.I(-313050079);
                h.a aVar3 = androidx.compose.ui.unit.h.f42849c;
                androidx.compose.ui.v vVarA2 = androidx.compose.ui.draw.k.a(vVar, androidx.compose.foundation.shape.o.a(4));
                InterfaceC22215f.f39074a.getClass();
                androidx.compose.ui.i iVar = InterfaceC22215f.a.f39080f;
                bE2.I(733328855);
                InterfaceC22365i0 interfaceC22365i0E2 = C20632w.e(iVar, false, bE2, 6);
                bE2.I(-1323940314);
                int i16 = bE2.f37888Q;
                androidx.compose.runtime.O1 o1S2 = bE2.S();
                InterfaceC22413h.f40789C1.getClass();
                Y41.a<InterfaceC22413h> aVar4 = InterfaceC22413h.a.f40791b;
                C22096n c22096nC2 = androidx.compose.ui.layout.M.c(vVarA2);
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
                androidx.compose.runtime.R3.b(InterfaceC22413h.a.f40796g, bE2, interfaceC22365i0E2);
                androidx.compose.runtime.R3.b(InterfaceC22413h.a.f40795f, bE2, o1S2);
                Y41.p<InterfaceC22413h, Integer, kotlin.G0> pVar2 = InterfaceC22413h.a.f40799j;
                if (bE2.f37887P || !kotlin.jvm.internal.L.f(bE2.t(), Integer.valueOf(i16))) {
                    C13653k2.a(i16, bE2, i16, pVar2);
                }
                A2.a(c22096nC2, androidx.compose.runtime.J2.a(bE2), bE2);
                c22096n.invoke(C20644z.f28804a, bE2, Integer.valueOf(((i14 >> 3) & 112) | 6));
                bE2.X(false);
            }
            androidx.compose.foundation.H.B(bE2, true, z13, z13, z13);
        }
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z == null) {
            return;
        }
        c22039c2Z.f38184d = new M4(vVar, z12, c22096n, i12);
    }
}
