package com.avito.android.safety.safety_settings.ui;

import androidx.compose.foundation.C21086w0;
import androidx.compose.foundation.layout.C20563e2;
import androidx.compose.foundation.layout.C20568f2;
import androidx.compose.foundation.layout.C20576h2;
import androidx.compose.foundation.layout.C20585k;
import androidx.compose.foundation.layout.R1;
import androidx.compose.runtime.A;
import androidx.compose.runtime.C22039c2;
import androidx.compose.runtime.C22190v;
import androidx.compose.runtime.InterfaceC22078i;
import androidx.compose.runtime.InterfaceC22132o;
import androidx.compose.runtime.InterfaceC22181t;
import androidx.compose.runtime.O1;
import androidx.compose.runtime.R3;
import androidx.compose.ui.InterfaceC22215f;
import androidx.compose.ui.layout.InterfaceC22365i0;
import androidx.compose.ui.node.InterfaceC22413h;
import androidx.compose.ui.platform.C22501m2;
import androidx.compose.ui.unit.h;
import androidx.compose.ui.v;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: SafetySettingsPassword.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_safety_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.safety.safety_settings.ui.j, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C34450j {
    @InterfaceC22132o
    @InterfaceC22181t
    public static final void a(@Y61.k String str, @Y61.k String str2, @Y61.k Y41.l lVar, @Y61.l androidx.compose.ui.v vVar, @Y61.l androidx.compose.runtime.A a12, int i12) {
        androidx.compose.runtime.B bE2 = a12.E(169214713);
        int i13 = i12 | (bE2.B(str) ? 4 : 2) | (bE2.B(str2) ? 32 : 16) | (bE2.u(lVar) ? 256 : 128);
        if ((i13 & 5851) == 1170 && bE2.c()) {
            bE2.f();
        } else {
            androidx.compose.ui.v vVarA = C22501m2.a(vVar, "changePasswordItemTag");
            C20585k.f28659a.getClass();
            C20585k.l lVar2 = C20585k.f28662d;
            InterfaceC22215f.f39074a.getClass();
            androidx.compose.foundation.layout.I iA2 = androidx.compose.foundation.layout.H.a(lVar2, InterfaceC22215f.a.f39088n, bE2, 0);
            int i14 = bE2.f37888Q;
            O1 o1S = bE2.S();
            androidx.compose.ui.v vVarC = androidx.compose.ui.n.c(bE2, vVarA);
            InterfaceC22413h.f40789C1.getClass();
            Y41.a<InterfaceC22413h> aVar = InterfaceC22413h.a.f40791b;
            InterfaceC22078i<?> interfaceC22078i = bE2.f37890b;
            if (interfaceC22078i == null) {
                C22190v.b();
                throw null;
            }
            bE2.A();
            if (bE2.f37887P) {
                bE2.b(aVar);
            } else {
                bE2.d();
            }
            Y41.p<InterfaceC22413h, InterfaceC22365i0, G0> pVar = InterfaceC22413h.a.f40796g;
            R3.b(pVar, bE2, iA2);
            Y41.p<InterfaceC22413h, androidx.compose.runtime.U, G0> pVar2 = InterfaceC22413h.a.f40795f;
            R3.b(pVar2, bE2, o1S);
            Y41.p<InterfaceC22413h, Integer, G0> pVar3 = InterfaceC22413h.a.f40799j;
            if (bE2.f37887P || !kotlin.jvm.internal.L.f(bE2.t(), Integer.valueOf(i14))) {
                AK.c.y(i14, bE2, i14, pVar3);
            }
            Y41.p<InterfaceC22413h, androidx.compose.ui.v, G0> pVar4 = InterfaceC22413h.a.f40793d;
            R3.b(pVar4, bE2, vVarC);
            androidx.compose.foundation.layout.K k12 = androidx.compose.foundation.layout.K.f28344a;
            v.a aVar2 = androidx.compose.ui.v.f42878y1;
            com.akita.compose.theme.re23.b.f63983a.getClass();
            com.akita.compose.theme.re23.i iVar = com.akita.compose.theme.re23.b.f63988f;
            com.akita.compose.foundation.ui.p.b(str, iVar.f65233d, aVar2, false, 0L, null, 0, 0, false, null, bE2, (i13 & 14) | 384, 1016);
            bE2.C(1894688289);
            Object objT = bE2.t();
            androidx.compose.runtime.A.f37866a.getClass();
            A.a.C1651a c1651a = A.a.f37868b;
            if (objT == c1651a) {
                objT = androidx.compose.foundation.interaction.l.a();
                bE2.H(objT);
            }
            androidx.compose.foundation.interaction.m mVar = (androidx.compose.foundation.interaction.m) objT;
            bE2.X(false);
            bE2.C(1894690571);
            boolean z12 = (i13 & 896) == 256;
            Object objT2 = bE2.t();
            if (z12 || objT2 == c1651a) {
                objT2 = new C34448h(lVar);
                bE2.H(objT2);
            }
            bE2.X(false);
            h.a aVar3 = androidx.compose.ui.unit.h.f42849c;
            androidx.compose.ui.v vVarM = R1.m(C21086w0.b(aVar2, mVar, null, false, null, (Y41.a) objT2, 28), 0.0f, 11, 0.0f, 0.0f, 13);
            C20568f2 c20568f2A = C20563e2.a(C20585k.f28660b, InterfaceC22215f.a.f39085k, bE2, 0);
            int i15 = bE2.f37888Q;
            O1 o1S2 = bE2.S();
            androidx.compose.ui.v vVarC2 = androidx.compose.ui.n.c(bE2, vVarM);
            if (interfaceC22078i == null) {
                C22190v.b();
                throw null;
            }
            bE2.A();
            if (bE2.f37887P) {
                bE2.b(aVar);
            } else {
                bE2.d();
            }
            R3.b(pVar, bE2, c20568f2A);
            R3.b(pVar2, bE2, o1S2);
            if (bE2.f37887P || !kotlin.jvm.internal.L.f(bE2.t(), Integer.valueOf(i15))) {
                AK.c.y(i15, bE2, i15, pVar3);
            }
            R3.b(pVar4, bE2, vVarC2);
            com.akita.compose.foundation.ui.p.b(str2, iVar.f65241l, R1.m(C20576h2.f28641a.a(aVar2, 1.0f, true), 0.0f, 0.0f, 6, 0.0f, 11), false, 0L, null, 0, 0, false, null, bE2, (i13 >> 3) & 14, 1016);
            com.akita.compose.theme.re23.b.f63985c.getClass();
            com.akita.compose.foundation.ui.e.a(u0.e.a(com.akita.compose.theme.re23.e.f64527f0, 0, bE2), null, null, com.akita.compose.theme.re23.b.f63984b.f63938l, bE2, 56, 4);
            bE2.X(true);
            bE2.X(true);
        }
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new C34449i(str, str2, lVar, vVar, i12);
        }
    }
}
