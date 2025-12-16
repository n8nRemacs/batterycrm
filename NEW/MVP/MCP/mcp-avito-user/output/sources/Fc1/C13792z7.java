package Fc1;

import android.graphics.Color;
import androidx.compose.foundation.layout.C20588k2;
import androidx.compose.foundation.layout.C20632w;
import androidx.compose.runtime.C22039c2;
import androidx.compose.runtime.InterfaceC22132o;
import androidx.compose.runtime.InterfaceC22181t;
import androidx.compose.ui.unit.h;

@kotlin.jvm.internal.s0
/* renamed from: Fc1.z7, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C13792z7 {
    @InterfaceC22132o
    @InterfaceC22181t
    public static final void a(int i12, @Y61.l androidx.compose.runtime.A a12, @Y61.l androidx.compose.ui.v vVar, boolean z12) {
        int i13;
        androidx.compose.ui.v vVarB;
        androidx.compose.runtime.B bE2 = a12.E(1991068699);
        if ((i12 & 14) == 0) {
            i13 = (bE2.B(vVar) ? 4 : 2) | i12;
        } else {
            i13 = i12;
        }
        if ((i12 & 112) == 0) {
            i13 |= bE2.j(z12) ? 32 : 16;
        }
        if ((i13 & 91) == 18 && bE2.c()) {
            bE2.f();
        } else {
            InterfaceC13779y3 interfaceC13779y3 = (InterfaceC13779y3) bE2.o(C13707q2.f5762a);
            h.a aVar = androidx.compose.ui.unit.h.f42849c;
            androidx.compose.ui.v vVarO = C20588k2.o(vVar, 24);
            if (z12) {
                long jB2 = androidx.compose.ui.graphics.V.b(Color.parseColor(C13566a5.a(77, interfaceC13779y3.t()).f5864a));
                androidx.compose.foundation.shape.n nVar = androidx.compose.foundation.shape.o.f30153a;
                vVarB = androidx.compose.foundation.A.b(androidx.compose.foundation.layout.R1.i(androidx.compose.foundation.A.b(androidx.compose.foundation.layout.R1.i(androidx.compose.foundation.A.b(androidx.compose.foundation.layout.R1.i(androidx.compose.foundation.A.b(vVarO, jB2, nVar), 4), C13775y.a(interfaceC13779y3.t()), nVar), 2), C13775y.a(interfaceC13779y3.l()), nVar), 3), C13775y.a(interfaceC13779y3.t()), nVar);
            } else {
                androidx.compose.ui.v vVarI = androidx.compose.foundation.layout.R1.i(vVarO, 4);
                long jA2 = C13775y.a(interfaceC13779y3.r());
                androidx.compose.foundation.shape.n nVar2 = androidx.compose.foundation.shape.o.f30153a;
                vVarB = androidx.compose.foundation.A.b(androidx.compose.foundation.layout.R1.i(androidx.compose.foundation.A.b(vVarI, jA2, nVar2), 2), C13775y.a(interfaceC13779y3.m()), nVar2);
            }
            C20632w.a(vVarB, bE2, 0);
        }
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z == null) {
            return;
        }
        c22039c2Z.f38184d = new C13783y7(i12, vVar, z12);
    }
}
