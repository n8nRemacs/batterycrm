package com.avito.android.btob_business_trip.screens.infoScreen.composables;

import androidx.compose.foundation.layout.C20563e2;
import androidx.compose.foundation.layout.C20568f2;
import androidx.compose.foundation.layout.C20576h2;
import androidx.compose.foundation.layout.C20585k;
import androidx.compose.foundation.layout.C20588k2;
import androidx.compose.foundation.layout.R1;
import androidx.compose.runtime.A;
import androidx.compose.runtime.B;
import androidx.compose.runtime.C22039c2;
import androidx.compose.runtime.C22190v;
import androidx.compose.runtime.InterfaceC22132o;
import androidx.compose.runtime.InterfaceC22181t;
import androidx.compose.runtime.O1;
import androidx.compose.runtime.R3;
import androidx.compose.ui.InterfaceC22215f;
import androidx.compose.ui.i;
import androidx.compose.ui.node.InterfaceC22413h;
import androidx.compose.ui.unit.h;
import androidx.compose.ui.v;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: ConditionItem.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_btob-business-trip_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class g {
    @InterfaceC22132o
    @InterfaceC22181t
    public static final void a(int i12, @Y61.l A a12, @Y61.l v vVar, @Y61.k String str, @Y61.k String str2) {
        int i13;
        B b12;
        v vVar2;
        B bE2 = a12.E(-405423717);
        if ((i12 & 14) == 0) {
            i13 = (bE2.B(str) ? 4 : 2) | i12;
        } else {
            i13 = i12;
        }
        if ((i12 & 112) == 0) {
            i13 |= bE2.B(str2) ? 32 : 16;
        }
        int i14 = i13 | 384;
        if ((i14 & 731) == 146 && bE2.c()) {
            bE2.f();
            vVar2 = vVar;
            b12 = bE2;
        } else {
            v.a aVar = v.f42878y1;
            com.akita.compose.theme.re23.b.f63983a.getClass();
            long jC2 = com.akita.compose.theme.re23.b.f63984b.f63973w1.c(bE2);
            h.a aVar2 = androidx.compose.ui.unit.h.f42849c;
            v vVarD = C20588k2.d(R1.i(androidx.compose.foundation.A.b(aVar, jC2, androidx.compose.foundation.shape.o.a(12)), 16), 1.0f);
            InterfaceC22215f.f39074a.getClass();
            i.b bVar = InterfaceC22215f.a.f39085k;
            C20585k.f28659a.getClass();
            C20568f2 c20568f2A = C20563e2.a(C20585k.f28660b, bVar, bE2, 48);
            int i15 = bE2.f37888Q;
            O1 o1S = bE2.S();
            v vVarC = androidx.compose.ui.n.c(bE2, vVarD);
            InterfaceC22413h.f40789C1.getClass();
            Y41.a<InterfaceC22413h> aVar3 = InterfaceC22413h.a.f40791b;
            if (bE2.f37890b == null) {
                C22190v.b();
                throw null;
            }
            bE2.A();
            if (bE2.f37887P) {
                bE2.b(aVar3);
            } else {
                bE2.d();
            }
            R3.b(InterfaceC22413h.a.f40796g, bE2, c20568f2A);
            R3.b(InterfaceC22413h.a.f40795f, bE2, o1S);
            Y41.p<InterfaceC22413h, Integer, G0> pVar = InterfaceC22413h.a.f40799j;
            if (bE2.f37887P || !L.f(bE2.t(), Integer.valueOf(i15))) {
                AK.c.y(i15, bE2, i15, pVar);
            }
            R3.b(InterfaceC22413h.a.f40793d, bE2, vVarC);
            C20576h2 c20576h2 = C20576h2.f28641a;
            com.akita.compose.theme.re23.g.f65049a.getClass();
            String strA = com.akita.compose.theme.re23.g.a(str);
            bE2.C(500298999);
            if (strA != null) {
                com.akita.compose.foundation.ui.o.a(strA, com.akita.compose.theme.re23.b.f63988f.f65245p, R1.m(aVar, 0.0f, 2, 0.0f, 0.0f, 13), null, bE2, 384, 8);
            }
            bE2.X(false);
            com.akita.compose.foundation.ui.p.b(str2, com.akita.compose.theme.re23.b.f63988f.f65245p, R1.m(aVar, 8, 0.0f, 0.0f, 0.0f, 14), false, 0L, null, 0, 0, false, null, bE2, ((i14 >> 3) & 14) | 384, 1016);
            b12 = bE2;
            b12.X(true);
            vVar2 = aVar;
        }
        C22039c2 c22039c2Z = b12.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new e(str, str2, vVar2, i12);
        }
    }
}
