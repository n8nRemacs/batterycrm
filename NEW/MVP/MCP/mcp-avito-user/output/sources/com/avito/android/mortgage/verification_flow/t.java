package com.avito.android.mortgage.verification_flow;

import android.content.Context;
import androidx.compose.foundation.C20806p1;
import androidx.compose.foundation.layout.C20563e2;
import androidx.compose.foundation.layout.C20568f2;
import androidx.compose.foundation.layout.C20576h2;
import androidx.compose.foundation.layout.C20585k;
import androidx.compose.foundation.layout.C20588k2;
import androidx.compose.foundation.layout.C20608p2;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.foundation.layout.H;
import androidx.compose.foundation.layout.I;
import androidx.compose.foundation.layout.K;
import androidx.compose.foundation.layout.R1;
import androidx.compose.runtime.A;
import androidx.compose.runtime.B;
import androidx.compose.runtime.C22039c2;
import androidx.compose.runtime.C22187u0;
import androidx.compose.runtime.C22190v;
import androidx.compose.runtime.InterfaceC22132o;
import androidx.compose.runtime.InterfaceC22181t;
import androidx.compose.runtime.InterfaceC22204y1;
import androidx.compose.runtime.O1;
import androidx.compose.runtime.R3;
import androidx.compose.ui.InterfaceC22215f;
import androidx.compose.ui.graphics.Y0;
import androidx.compose.ui.i;
import androidx.compose.ui.layout.InterfaceC22374n;
import androidx.compose.ui.node.InterfaceC22413h;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.unit.h;
import androidx.compose.ui.v;
import coil.compose.w;
import coil.request.p;
import coil.view.C27251e;
import coil.view.C27253g;
import coil.view.Scale;
import com.avito.android.R;
import com.avito.android.mortgage.api.model.ActionButton;
import com.avito.android.util.C35835l0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: VerificationFlowScreen.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_mortgage_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class t {
    @InterfaceC22132o
    @InterfaceC22181t
    public static final void a(@Y61.k InterfaceC22204y1 interfaceC22204y1, @Y61.k InterfaceC43160i interfaceC43160i, @Y61.k Y41.a aVar, @Y61.k Y41.l lVar, @Y61.k Y41.l lVar2, @Y61.k Y41.a aVar2, @Y61.k Y41.l lVar3, @Y61.l A a12, int i12) {
        B bE2 = a12.E(-623576891);
        C22187u0.e(aVar2, lVar3, new n(aVar2, lVar3, null, interfaceC43160i), bE2);
        v.a aVar3 = androidx.compose.ui.v.f42878y1;
        FillElement fillElement = C20588k2.f28682c;
        aVar3.getClass();
        com.akita.compose.theme.re23.b.f63983a.getClass();
        com.akita.compose.component.scaffold.g.a(androidx.compose.foundation.A.b(fillElement, com.akita.compose.theme.re23.b.f63984b.f63851H1.c(bE2), Y0.f39346a), androidx.compose.runtime.internal.r.c(-1795239551, new o(aVar), bE2), androidx.compose.runtime.internal.r.c(1462611168, new p(interfaceC22204y1, lVar, lVar2), bE2), null, null, null, null, androidx.compose.runtime.internal.r.c(-290518248, new q(interfaceC22204y1), bE2), bE2, 12583344, 120);
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new r(interfaceC22204y1, interfaceC43160i, aVar, lVar, lVar2, aVar2, lVar3, i12);
        }
    }

    public static final void b(ActionButton actionButton, ActionButton actionButton2, Y41.l lVar, Y41.l lVar2, A a12, int i12) {
        boolean z12;
        v.a aVar;
        boolean z13;
        B bE2 = a12.E(1559540318);
        v.a aVar2 = androidx.compose.ui.v.f42878y1;
        InterfaceC22215f.f39074a.getClass();
        i.b bVar = InterfaceC22215f.a.f39086l;
        C20585k c20585k = C20585k.f28659a;
        h.a aVar3 = androidx.compose.ui.unit.h.f42849c;
        c20585k.getClass();
        C20585k.j jVarG = C20585k.g(6);
        androidx.compose.ui.v vVarI = R1.i(C20588k2.d(aVar2, 1.0f), 16);
        C20568f2 c20568f2A = C20563e2.a(jVarG, bVar, bE2, 54);
        int i13 = bE2.f37888Q;
        O1 o1S = bE2.S();
        androidx.compose.ui.v vVarC = androidx.compose.ui.n.c(bE2, vVarI);
        InterfaceC22413h.f40789C1.getClass();
        Y41.a<InterfaceC22413h> aVar4 = InterfaceC22413h.a.f40791b;
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
        R3.b(InterfaceC22413h.a.f40796g, bE2, c20568f2A);
        R3.b(InterfaceC22413h.a.f40795f, bE2, o1S);
        Y41.p<InterfaceC22413h, Integer, G0> pVar = InterfaceC22413h.a.f40799j;
        if (bE2.f37887P || !L.f(bE2.t(), Integer.valueOf(i13))) {
            AK.c.y(i13, bE2, i13, pVar);
        }
        R3.b(InterfaceC22413h.a.f40793d, bE2, vVarC);
        C20576h2 c20576h2 = C20576h2.f28641a;
        bE2.C(-600264955);
        if ((actionButton2 != null ? actionButton2.getTitle() : null) != null) {
            i iVar = new i(lVar2, actionButton2);
            com.akita.compose.theme.re23.b.f63983a.getClass();
            z12 = true;
            com.akita.compose.component.button.m.b(iVar, com.akita.compose.theme.re23.b.c(bE2).M(), c20576h2.a(aVar2, 1.0f, true), false, null, androidx.compose.runtime.internal.r.c(-782709343, new j(actionButton2), bE2), bE2, 196672, 24);
        } else {
            z12 = true;
        }
        bE2.X(false);
        bE2.C(-600251128);
        if ((actionButton != null ? actionButton.getTitle() : null) != null) {
            String title = actionButton.getTitle();
            k kVar = new k(lVar, actionButton);
            com.akita.compose.theme.re23.b.f63983a.getClass();
            aVar = aVar2;
            com.akita.compose.component.button.m.c(title, kVar, com.akita.compose.theme.re23.b.c(bE2).f2(), c20576h2.a(aVar2, 1.0f, z12), null, null, null, false, false, null, bE2, 512, 1008);
            z13 = false;
        } else {
            aVar = aVar2;
            z13 = false;
        }
        C22039c2 c22039c2N = com.avito.android.actions_sheet.a.n(bE2, z13, z12);
        if (c22039c2N != null) {
            c22039c2N.f38184d = new l(actionButton, actionButton2, lVar, lVar2, aVar, i12);
        }
    }

    public static final void c(String str, String str2, String str3, androidx.compose.ui.v vVar, A a12, int i12) {
        int i13;
        boolean z12;
        B b12;
        B bE2 = a12.E(1861014918);
        if ((i12 & 14) == 0) {
            i13 = (bE2.B(str) ? 4 : 2) | i12;
        } else {
            i13 = i12;
        }
        if ((i12 & 112) == 0) {
            i13 |= bE2.B(str2) ? 32 : 16;
        }
        if ((i12 & 896) == 0) {
            i13 |= bE2.B(str3) ? 256 : 128;
        }
        if ((i12 & 7168) == 0) {
            i13 |= bE2.B(vVar) ? 2048 : 1024;
        }
        if ((i13 & 5851) == 1170 && bE2.c()) {
            bE2.f();
            b12 = bE2;
        } else {
            InterfaceC22215f.f39074a.getClass();
            i.a aVar = InterfaceC22215f.a.f39089o;
            C20585k.f28659a.getClass();
            C20585k.l lVar = C20585k.f28662d;
            h.a aVar2 = androidx.compose.ui.unit.h.f42849c;
            androidx.compose.ui.v vVarI = R1.i(C20588k2.d(vVar, 1.0f), 16);
            I iA2 = H.a(lVar, aVar, bE2, 54);
            int i14 = bE2.f37888Q;
            O1 o1S = bE2.S();
            androidx.compose.ui.v vVarC = androidx.compose.ui.n.c(bE2, vVarI);
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
            R3.b(InterfaceC22413h.a.f40796g, bE2, iA2);
            R3.b(InterfaceC22413h.a.f40795f, bE2, o1S);
            Y41.p<InterfaceC22413h, Integer, G0> pVar = InterfaceC22413h.a.f40799j;
            if (bE2.f37887P || !L.f(bE2.t(), Integer.valueOf(i14))) {
                AK.c.y(i14, bE2, i14, pVar);
            }
            R3.b(InterfaceC22413h.a.f40793d, bE2, vVarC);
            K k12 = K.f28344a;
            bE2.C(965653907);
            if (str != null) {
                p.a aVar4 = new p.a((Context) bE2.o(AndroidCompositionLocals_androidKt.f41069b));
                aVar4.f58691c = str;
                aVar4.f58714z = new C27251e(C27253g.f58764c);
                aVar4.b();
                aVar4.f58685A = Scale.f58756c;
                coil.request.p pVarA = aVar4.a();
                InterfaceC22374n.f40491a.getClass();
                C20806p1.a(w.a(pVarA, InterfaceC22374n.a.f40493b, bE2, 3080, 54), "Верификация", C20588k2.f(C20588k2.d(androidx.compose.ui.v.f42878y1, 1.0f), 248), null, null, 0.0f, null, bE2, 432, 120);
            }
            bE2.X(false);
            v.a aVar5 = androidx.compose.ui.v.f42878y1;
            C20608p2.a(bE2, C20588k2.f(aVar5, 12));
            com.akita.compose.theme.re23.b.f63983a.getClass();
            com.akita.compose.theme.re23.i iVar = com.akita.compose.theme.re23.b.f63988f;
            com.akita.compose.foundation.ui.p.b(str2, iVar.f65233d, C20588k2.d(aVar5, 1.0f), false, 0L, null, 0, 0, false, null, bE2, ((i13 >> 3) & 14) | 384, 1016);
            bE2.C(965678898);
            if (str3 != null) {
                C20608p2.a(bE2, C20588k2.f(aVar5, 8));
                com.akita.compose.foundation.ui.p.b(str3, iVar.f65241l, C20588k2.d(aVar5, 1.0f), false, 0L, null, 0, 0, false, null, bE2, ((i13 >> 6) & 14) | 384, 1016);
                b12 = bE2;
                z12 = false;
            } else {
                z12 = false;
                b12 = bE2;
            }
            b12.X(z12);
            b12.X(true);
        }
        C22039c2 c22039c2Z = b12.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new m(str, str2, str3, vVar, i12);
        }
    }

    public static final void d(int i12, Y41.a aVar, A a12, v.a aVar2) {
        B bE2 = a12.E(-1126136164);
        int i13 = i12 | 6;
        if ((i12 & 112) == 0) {
            i13 |= bE2.u(aVar) ? 32 : 16;
        }
        if ((i13 & 91) == 18 && bE2.c()) {
            bE2.f();
        } else {
            aVar2 = androidx.compose.ui.v.f42878y1;
            InterfaceC22215f.f39074a.getClass();
            i.b bVar = InterfaceC22215f.a.f39086l;
            C20585k.f28659a.getClass();
            C20585k.C1589k c1589k = C20585k.f28660b;
            androidx.compose.ui.v vVarD = C20588k2.d(aVar2, 1.0f);
            float f12 = 48;
            h.a aVar3 = androidx.compose.ui.unit.h.f42849c;
            androidx.compose.ui.v vVarK = R1.k(14, 0.0f, 2, C20588k2.f(vVarD, f12));
            C20568f2 c20568f2A = C20563e2.a(c1589k, bVar, bE2, 54);
            int i14 = bE2.f37888Q;
            O1 o1S = bE2.S();
            androidx.compose.ui.v vVarC = androidx.compose.ui.n.c(bE2, vVarK);
            InterfaceC22413h.f40789C1.getClass();
            Y41.a<InterfaceC22413h> aVar4 = InterfaceC22413h.a.f40791b;
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
            R3.b(InterfaceC22413h.a.f40796g, bE2, c20568f2A);
            R3.b(InterfaceC22413h.a.f40795f, bE2, o1S);
            Y41.p<InterfaceC22413h, Integer, G0> pVar = InterfaceC22413h.a.f40799j;
            if (bE2.f37887P || !L.f(bE2.t(), Integer.valueOf(i14))) {
                AK.c.y(i14, bE2, i14, pVar);
            }
            R3.b(InterfaceC22413h.a.f40793d, bE2, vVarC);
            C20576h2 c20576h2 = C20576h2.f28641a;
            com.avito.android.mortgage.widgets.b.a(C35835l0.j(R.attr.ic_arrowBack24, (Context) bE2.o(AndroidCompositionLocals_androidKt.f41069b)), aVar, C20588k2.o(aVar2, f12), InterfaceC22215f.a.f39079e, false, null, bE2, (i13 & 112) | 3456, 48);
            bE2.X(true);
        }
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new s(i12, aVar, aVar2);
        }
    }
}
