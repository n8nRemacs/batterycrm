package com.avito.android.vas_autoprolong.screens.autoprolong.ui;

import androidx.compose.foundation.C21086w0;
import androidx.compose.foundation.layout.C20563e2;
import androidx.compose.foundation.layout.C20568f2;
import androidx.compose.foundation.layout.C20576h2;
import androidx.compose.foundation.layout.C20585k;
import androidx.compose.foundation.layout.C20588k2;
import androidx.compose.foundation.layout.H;
import androidx.compose.foundation.layout.I;
import androidx.compose.foundation.layout.K;
import androidx.compose.foundation.layout.R1;
import androidx.compose.runtime.A;
import androidx.compose.runtime.B;
import androidx.compose.runtime.C22039c2;
import androidx.compose.runtime.C22190v;
import androidx.compose.runtime.InterfaceC22078i;
import androidx.compose.runtime.InterfaceC22132o;
import androidx.compose.runtime.InterfaceC22181t;
import androidx.compose.runtime.O1;
import androidx.compose.runtime.R3;
import androidx.compose.runtime.U;
import androidx.compose.ui.InterfaceC22215f;
import androidx.compose.ui.layout.InterfaceC22365i0;
import androidx.compose.ui.node.InterfaceC22413h;
import androidx.compose.ui.unit.h;
import androidx.compose.ui.v;
import com.adjust.sdk.network.ErrorCodes;
import com.akita.compose.component.toggle.r;
import jL0.C42282c;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: AutoprolongToggleSection.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_vas-autoprolong_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class p {
    @InterfaceC22132o
    @InterfaceC22181t
    public static final void a(@Y61.k C42282c.d dVar, @Y61.k Y41.l lVar, @Y61.l v vVar, @Y61.l A a12, int i12) {
        B bE2 = a12.E(8483726);
        int i13 = (bE2.B(dVar) ? 4 : 2) | i12 | (bE2.u(lVar) ? 32 : 16);
        if ((i13 & 731) == 146 && bE2.c()) {
            bE2.f();
        } else {
            v.a aVar = v.f42878y1;
            v vVarD = C20588k2.d(aVar, 1.0f);
            bE2.C(-246206361);
            Object objT = bE2.t();
            A.f37866a.getClass();
            A.a.C1651a c1651a = A.a.f37868b;
            if (objT == c1651a) {
                objT = androidx.compose.foundation.interaction.l.a();
                bE2.H(objT);
            }
            androidx.compose.foundation.interaction.m mVar = (androidx.compose.foundation.interaction.m) objT;
            bE2.X(false);
            bE2.C(-246204558);
            boolean z12 = ((i13 & 14) == 4) | ((i13 & 112) == 32);
            Object objT2 = bE2.t();
            if (z12 || objT2 == c1651a) {
                objT2 = new n(lVar, dVar);
                bE2.H(objT2);
            }
            bE2.X(false);
            v vVarD0 = C21086w0.b(vVarD, mVar, null, false, null, (Y41.a) objT2, 28).d0(vVar);
            float f12 = 12;
            h.a aVar2 = androidx.compose.ui.unit.h.f42849c;
            v vVarK = R1.k(0.0f, f12, 1, vVarD0);
            C20585k.f28659a.getClass();
            C20585k.C1589k c1589k = C20585k.f28660b;
            InterfaceC22215f.f39074a.getClass();
            C20568f2 c20568f2A = C20563e2.a(c1589k, InterfaceC22215f.a.f39085k, bE2, 0);
            int i14 = bE2.f37888Q;
            O1 o1S = bE2.S();
            v vVarC = androidx.compose.ui.n.c(bE2, vVarK);
            InterfaceC22413h.f40789C1.getClass();
            Y41.a<InterfaceC22413h> aVar3 = InterfaceC22413h.a.f40791b;
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
            Y41.p<InterfaceC22413h, InterfaceC22365i0, G0> pVar = InterfaceC22413h.a.f40796g;
            R3.b(pVar, bE2, c20568f2A);
            Y41.p<InterfaceC22413h, U, G0> pVar2 = InterfaceC22413h.a.f40795f;
            R3.b(pVar2, bE2, o1S);
            Y41.p<InterfaceC22413h, Integer, G0> pVar3 = InterfaceC22413h.a.f40799j;
            if (bE2.f37887P || !L.f(bE2.t(), Integer.valueOf(i14))) {
                AK.c.y(i14, bE2, i14, pVar3);
            }
            Y41.p<InterfaceC22413h, v, G0> pVar4 = InterfaceC22413h.a.f40793d;
            R3.b(pVar4, bE2, vVarC);
            v vVarA = C20576h2.f28641a.a(aVar, 1.0f, true);
            I iA2 = H.a(C20585k.f28662d, InterfaceC22215f.a.f39088n, bE2, 0);
            int i15 = bE2.f37888Q;
            O1 o1S2 = bE2.S();
            v vVarC2 = androidx.compose.ui.n.c(bE2, vVarA);
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
            R3.b(pVar, bE2, iA2);
            R3.b(pVar2, bE2, o1S2);
            if (bE2.f37887P || !L.f(bE2.t(), Integer.valueOf(i15))) {
                AK.c.y(i15, bE2, i15, pVar3);
            }
            R3.b(pVar4, bE2, vVarC2);
            K k12 = K.f28344a;
            com.akita.compose.theme.re23.b.f63983a.getClass();
            com.akita.compose.theme.re23.i iVar = com.akita.compose.theme.re23.b.f63988f;
            com.akita.compose.foundation.ui.p.b(dVar.f405580a, iVar.f65241l, null, false, 0L, null, 0, 0, false, null, bE2, 0, 1020);
            bE2.C(1282712562);
            if (dVar.f405582c) {
                com.akita.compose.foundation.ui.g.a(2, null, bE2, 6);
                com.akita.compose.foundation.ui.p.b(dVar.f405581b, iVar.f65245p, null, false, com.akita.compose.theme.re23.b.f63984b.f63918e0.c(bE2), null, 0, 0, false, null, bE2, 0, ErrorCodes.PROTOCOL_EXCEPTION);
            }
            bE2.X(false);
            bE2.X(true);
            com.akita.compose.foundation.ui.g.b(f12, null, bE2, 6, 2);
            r.a(dVar.f405582c, null, com.akita.compose.theme.re23.b.s(bE2).getF66730b(), null, null, null, bE2, 48, 120);
            bE2.X(true);
        }
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new o(dVar, lVar, vVar, i12);
        }
    }
}
