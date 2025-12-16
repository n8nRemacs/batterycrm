package com.avito.android.mortgage_invite.participant;

import android.content.Context;
import androidx.compose.foundation.layout.C20585k;
import androidx.compose.foundation.layout.C20588k2;
import androidx.compose.foundation.layout.C20608p2;
import androidx.compose.foundation.layout.C20632w;
import androidx.compose.foundation.layout.C20644z;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.foundation.layout.R1;
import androidx.compose.foundation.lazy.C20650b;
import androidx.compose.runtime.C22039c2;
import androidx.compose.runtime.C22187u0;
import androidx.compose.runtime.C22190v;
import androidx.compose.runtime.InterfaceC22078i;
import androidx.compose.runtime.InterfaceC22132o;
import androidx.compose.runtime.InterfaceC22181t;
import androidx.compose.runtime.O1;
import androidx.compose.runtime.R3;
import androidx.compose.runtime.U;
import androidx.compose.runtime.internal.C22096n;
import androidx.compose.ui.InterfaceC22215f;
import androidx.compose.ui.focus.C22218c;
import androidx.compose.ui.i;
import androidx.compose.ui.layout.InterfaceC22365i0;
import androidx.compose.ui.node.InterfaceC22413h;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.Q0;
import androidx.compose.ui.unit.h;
import androidx.compose.ui.v;
import com.adjust.sdk.network.ErrorCodes;
import com.akita.compose.component.input.InputState;
import com.akita.compose.component.input.transformation.k;
import com.avito.android.mortgage_invite.participant.domain.model.ParticipantType;
import com.avito.android.printable_text.PrintableText;
import java.util.Iterator;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.InterfaceC43160i;
import o20.C44572a;
import p20.C46879d;
import p20.e;

/* compiled from: ParticipantScreen.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_mortgage-invite_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class M {
    @InterfaceC22132o
    @InterfaceC22181t
    public static final void a(o20.d dVar, Y41.p pVar, Y41.p pVar2, androidx.compose.runtime.A a12, int i12) {
        C22096n c22096n;
        androidx.compose.runtime.B bE2 = a12.E(-2052545275);
        v.a aVar = androidx.compose.ui.v.f42878y1;
        C20585k.f28659a.getClass();
        C20585k.l lVar = C20585k.f28662d;
        InterfaceC22215f.f39074a.getClass();
        androidx.compose.foundation.layout.I iA2 = androidx.compose.foundation.layout.H.a(lVar, InterfaceC22215f.a.f39088n, bE2, 0);
        int i13 = bE2.f37888Q;
        O1 o1S = bE2.S();
        androidx.compose.ui.v vVarC = androidx.compose.ui.n.c(bE2, aVar);
        InterfaceC22413h.f40789C1.getClass();
        Y41.a<InterfaceC22413h> aVar2 = InterfaceC22413h.a.f40791b;
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
        R3.b(InterfaceC22413h.a.f40796g, bE2, iA2);
        R3.b(InterfaceC22413h.a.f40795f, bE2, o1S);
        Y41.p<InterfaceC22413h, Integer, G0> pVar3 = InterfaceC22413h.a.f40799j;
        if (bE2.f37887P || !kotlin.jvm.internal.L.f(bE2.t(), Integer.valueOf(i13))) {
            AK.c.y(i13, bE2, i13, pVar3);
        }
        R3.b(InterfaceC22413h.a.f40793d, bE2, vVarC);
        androidx.compose.foundation.layout.K k12 = androidx.compose.foundation.layout.K.f28344a;
        String str = dVar.f419330c;
        com.akita.compose.theme.re23.b.f63983a.getClass();
        com.akita.compose.theme.re23.i iVar = com.akita.compose.theme.re23.b.f63988f;
        com.akita.compose.foundation.ui.p.b(str, iVar.f65239j, null, false, 0L, null, 0, 0, false, null, bE2, 0, 1020);
        h.a aVar3 = androidx.compose.ui.unit.h.f42849c;
        com.akita.compose.foundation.ui.g.a(12, null, bE2, 6);
        boolean z12 = dVar.f419337j;
        String str2 = dVar.f419334g;
        String str3 = !z12 ? str2 : null;
        if (str3 == null) {
            str3 = "";
        }
        com.akita.compose.component.input.v f66388c = com.akita.compose.theme.re23.b.l(bE2).getF66388c();
        ParticipantType participantType = ParticipantType.f206111b;
        ParticipantType participantType2 = dVar.f419329b;
        if (participantType2 == participantType && str2.length() == 0) {
            C32831a.f206058a.getClass();
            c22096n = C32831a.f206060c;
        } else {
            c22096n = null;
        }
        ParticipantType participantType3 = ParticipantType.f206113d;
        com.akita.compose.component.input.transformation.k iVar2 = (participantType2 == participantType3 && dVar.f419336i) ? new k.i() : participantType2 == participantType3 ? k.h.f61825d : k.d.f61820d;
        PrintableText printableText = dVar.f419335h;
        com.akita.compose.component.input.u.b(str3, f66388c, new z(pVar2, dVar), C22218c.a(aVar, new y(pVar, dVar)), dVar.f419331d, false, printableText == null ? InputState.f61668b : InputState.f61669c, false, null, null, iVar2, 0, false, 0, null, c22096n, androidx.compose.runtime.internal.r.c(-722226762, new B(pVar2, dVar), bE2), null, bE2, 0, 1572864, 162720);
        bE2.C(1291865274);
        if (printableText != null) {
            com.akita.compose.foundation.ui.g.a(8, null, bE2, 6);
            com.akita.compose.foundation.ui.p.b(printableText.k0((Context) bE2.o(AndroidCompositionLocals_androidKt.f41069b)), iVar.f65244o, null, false, com.akita.compose.theme.re23.b.f63984b.f63880R0.c(bE2), null, 0, 0, false, null, bE2, 0, ErrorCodes.PROTOCOL_EXCEPTION);
        }
        C22039c2 c22039c2N = com.avito.android.actions_sheet.a.n(bE2, false, true);
        if (c22039c2N != null) {
            c22039c2N.f38184d = new C(dVar, pVar, pVar2, aVar, i12);
        }
    }

    @InterfaceC22132o
    @InterfaceC22181t
    public static final void b(@Y61.k C46879d c46879d, @Y61.k InterfaceC43160i interfaceC43160i, @Y61.k InterfaceC43160i interfaceC43160i2, @Y61.k Y41.l lVar, @Y61.k Y41.l lVar2, @Y61.k Y41.a aVar, @Y61.k Y41.l lVar3, @Y61.k Y41.l lVar4, @Y61.k Y41.a aVar2, @Y61.k Y41.a aVar3, @Y61.k Y41.p pVar, @Y61.k Y41.p pVar2, @Y61.k Y41.p pVar3, @Y61.k Y41.p pVar4, @Y61.k Y41.a aVar4, @Y61.l androidx.compose.runtime.A a12, int i12) {
        androidx.compose.runtime.B bE2 = a12.E(-2085807093);
        v.a aVar5 = androidx.compose.ui.v.f42878y1;
        com.akita.compose.component.toast_bar.u uVarA = com.akita.compose.component.toast_bar.w.a(bE2);
        com.akita.compose.theme.re23.b.f63983a.getClass();
        com.akita.compose.component.toast_bar.J f66804a = com.akita.compose.theme.re23.b.u(bE2).getF66804a();
        C22187u0.g(new Object[]{interfaceC43160i, lVar, lVar2, lVar4, aVar, uVarA, lVar3}, new E(interfaceC43160i, lVar2, lVar, lVar3, aVar, lVar4, (Context) bE2.o(AndroidCompositionLocals_androidKt.f41069b), uVarA, f66804a, null), bE2);
        androidx.compose.ui.focus.r rVar = (androidx.compose.ui.focus.r) bE2.o(Q0.f41200i);
        C22187u0.e(interfaceC43160i2, rVar, new F(interfaceC43160i2, rVar, null), bE2);
        com.akita.compose.component.scaffold.g.a(aVar5, androidx.compose.runtime.internal.r.c(-1563058233, new G(c46879d, aVar2), bE2), androidx.compose.runtime.internal.r.c(-1905942042, new H(c46879d, aVar4), bE2), uVarA, null, null, null, androidx.compose.runtime.internal.r.c(1560823326, new J(c46879d, aVar3, pVar, pVar2, pVar3, pVar4), bE2), bE2, 12583344, 112);
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new K(c46879d, interfaceC43160i, interfaceC43160i2, lVar, lVar2, aVar, lVar3, lVar4, aVar2, aVar3, pVar, pVar2, pVar3, pVar4, aVar4, aVar5, i12);
        }
    }

    public static final void c(e.a aVar, Y41.p pVar, Y41.p pVar2, Y41.p pVar3, Y41.p pVar4, androidx.compose.ui.v vVar, androidx.compose.runtime.A a12, int i12) {
        androidx.compose.runtime.B bE2 = a12.E(-608452905);
        C20585k c20585k = C20585k.f28659a;
        h.a aVar2 = androidx.compose.ui.unit.h.f42849c;
        c20585k.getClass();
        C20650b.a(vVar.d0(C20588k2.f28682c), null, null, false, C20585k.g(24), null, null, false, null, new v(aVar, pVar, pVar3, pVar2, pVar4), bE2, 24576, 494);
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new w(aVar, pVar, pVar2, pVar3, pVar4, vVar, i12);
        }
    }

    public static final void d(C44572a c44572a, Y41.p pVar, Y41.p pVar2, androidx.compose.ui.v vVar, androidx.compose.runtime.A a12, int i12, int i13) {
        androidx.compose.runtime.B bE2 = a12.E(791774932);
        androidx.compose.ui.v vVar2 = (i13 & 8) != 0 ? androidx.compose.ui.v.f42878y1 : vVar;
        C20585k.f28659a.getClass();
        C20585k.l lVar = C20585k.f28662d;
        InterfaceC22215f.f39074a.getClass();
        i.a aVar = InterfaceC22215f.a.f39088n;
        androidx.compose.foundation.layout.I iA2 = androidx.compose.foundation.layout.H.a(lVar, aVar, bE2, 0);
        int i14 = bE2.f37888Q;
        O1 o1S = bE2.S();
        androidx.compose.ui.v vVarC = androidx.compose.ui.n.c(bE2, vVar2);
        InterfaceC22413h.f40789C1.getClass();
        Y41.a<InterfaceC22413h> aVar2 = InterfaceC22413h.a.f40791b;
        InterfaceC22078i<?> interfaceC22078i = bE2.f37890b;
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
        Y41.p<InterfaceC22413h, InterfaceC22365i0, G0> pVar3 = InterfaceC22413h.a.f40796g;
        R3.b(pVar3, bE2, iA2);
        Y41.p<InterfaceC22413h, U, G0> pVar4 = InterfaceC22413h.a.f40795f;
        R3.b(pVar4, bE2, o1S);
        Y41.p<InterfaceC22413h, Integer, G0> pVar5 = InterfaceC22413h.a.f40799j;
        if (bE2.f37887P || !kotlin.jvm.internal.L.f(bE2.t(), Integer.valueOf(i14))) {
            AK.c.y(i14, bE2, i14, pVar5);
        }
        Y41.p<InterfaceC22413h, androidx.compose.ui.v, G0> pVar6 = InterfaceC22413h.a.f40793d;
        R3.b(pVar6, bE2, vVarC);
        androidx.compose.foundation.layout.K k12 = androidx.compose.foundation.layout.K.f28344a;
        String str = c44572a.f419314a;
        com.akita.compose.theme.re23.b.f63983a.getClass();
        com.akita.compose.foundation.ui.p.b(str, com.akita.compose.theme.re23.b.f63988f.f65234e, null, false, 0L, null, 0, 0, false, null, bE2, 0, 1020);
        h.a aVar3 = androidx.compose.ui.unit.h.f42849c;
        com.akita.compose.foundation.ui.g.a(16, null, bE2, 6);
        C20585k.j jVarG = C20585k.g(20);
        v.a aVar4 = androidx.compose.ui.v.f42878y1;
        androidx.compose.foundation.layout.I iA3 = androidx.compose.foundation.layout.H.a(jVarG, aVar, bE2, 6);
        int i15 = bE2.f37888Q;
        O1 o1S2 = bE2.S();
        androidx.compose.ui.v vVarC2 = androidx.compose.ui.n.c(bE2, aVar4);
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
        R3.b(pVar3, bE2, iA3);
        R3.b(pVar4, bE2, o1S2);
        if (bE2.f37887P || !kotlin.jvm.internal.L.f(bE2.t(), Integer.valueOf(i15))) {
            AK.c.y(i15, bE2, i15, pVar5);
        }
        R3.b(pVar6, bE2, vVarC2);
        bE2.C(1017481738);
        Iterator<T> it = c44572a.f419315b.iterator();
        while (it.hasNext()) {
            a((o20.d) it.next(), pVar, pVar2, bE2, (i12 & 112) | 8 | (i12 & 896));
        }
        bE2.X(false);
        bE2.X(true);
        bE2.X(true);
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new x(c44572a, pVar, pVar2, vVar2, i12, i13);
        }
    }

    public static final void e(androidx.compose.ui.v vVar, androidx.compose.runtime.A a12, int i12) {
        androidx.compose.ui.v vVar2;
        androidx.compose.runtime.B bE2 = a12.E(-329304267);
        if (((i12 | 6) & 11) == 2 && bE2.c()) {
            bE2.f();
            vVar2 = vVar;
        } else {
            vVar2 = androidx.compose.ui.v.f42878y1;
            FillElement fillElement = C20588k2.f28682c;
            vVar2.getClass();
            float f12 = 16;
            h.a aVar = androidx.compose.ui.unit.h.f42849c;
            androidx.compose.ui.v vVarK = R1.k(f12, 0.0f, 2, fillElement);
            C20585k.f28659a.getClass();
            C20585k.l lVar = C20585k.f28662d;
            InterfaceC22215f.f39074a.getClass();
            androidx.compose.foundation.layout.I iA2 = androidx.compose.foundation.layout.H.a(lVar, InterfaceC22215f.a.f39088n, bE2, 0);
            int i13 = bE2.f37888Q;
            O1 o1S = bE2.S();
            androidx.compose.ui.v vVarC = androidx.compose.ui.n.c(bE2, vVarK);
            InterfaceC22413h.f40789C1.getClass();
            Y41.a<InterfaceC22413h> aVar2 = InterfaceC22413h.a.f40791b;
            InterfaceC22078i<?> interfaceC22078i = bE2.f37890b;
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
            Y41.p<InterfaceC22413h, InterfaceC22365i0, G0> pVar = InterfaceC22413h.a.f40796g;
            R3.b(pVar, bE2, iA2);
            Y41.p<InterfaceC22413h, U, G0> pVar2 = InterfaceC22413h.a.f40795f;
            R3.b(pVar2, bE2, o1S);
            Y41.p<InterfaceC22413h, Integer, G0> pVar3 = InterfaceC22413h.a.f40799j;
            if (bE2.f37887P || !kotlin.jvm.internal.L.f(bE2.t(), Integer.valueOf(i13))) {
                AK.c.y(i13, bE2, i13, pVar3);
            }
            Y41.p<InterfaceC22413h, androidx.compose.ui.v, G0> pVar4 = InterfaceC22413h.a.f40793d;
            R3.b(pVar4, bE2, vVarC);
            androidx.compose.foundation.layout.K k12 = androidx.compose.foundation.layout.K.f28344a;
            com.akita.compose.foundation.ui.g.a(20, null, bE2, 6);
            androidx.compose.ui.v vVarA = androidx.compose.ui.draw.k.a(C20588k2.f(C20588k2.t(vVar2, 287), 17), androidx.compose.foundation.shape.o.a(6));
            int i14 = com.google.accompanist.placeholder.c.f342887a;
            com.google.accompanist.placeholder.c cVarA = com.google.accompanist.placeholder.material.a.a(bE2);
            com.akita.compose.theme.re23.b.f63983a.getClass();
            com.akita.compose.theme.re23.a aVar3 = com.akita.compose.theme.re23.b.f63984b;
            C20608p2.a(bE2, com.google.accompanist.placeholder.material.e.a(vVarA, aVar3.f63842E1.c(bE2), null, cVarA, 52));
            com.akita.compose.foundation.ui.g.a(48, null, bE2, 6);
            float f13 = 95;
            float f14 = 14;
            float f15 = 4;
            androidx.compose.ui.v vVarA2 = androidx.compose.ui.draw.k.a(C20588k2.f(C20588k2.t(vVar2, f13), f14), androidx.compose.foundation.shape.o.a(f15));
            com.google.accompanist.placeholder.c cVarA2 = com.google.accompanist.placeholder.material.a.a(bE2);
            com.akita.compose.foundation.p pVar5 = aVar3.f63842E1;
            C20608p2.a(bE2, com.google.accompanist.placeholder.material.e.a(vVarA2, pVar5.c(bE2), null, cVarA2, 52));
            com.akita.compose.foundation.ui.g.a(37, null, bE2, 6);
            float f16 = 134;
            float f17 = 10;
            float f18 = 3;
            C20608p2.a(bE2, com.google.accompanist.placeholder.material.e.a(androidx.compose.ui.draw.k.a(C20588k2.f(C20588k2.t(vVar2, f16), f17), androidx.compose.foundation.shape.o.a(f18)), pVar5.c(bE2), null, com.google.accompanist.placeholder.material.a.a(bE2), 52));
            com.akita.compose.foundation.ui.g.a(f12, null, bE2, 6);
            float f19 = 44;
            float f22 = 12;
            C20608p2.a(bE2, com.google.accompanist.placeholder.material.e.a(androidx.compose.ui.draw.k.a(C20588k2.f(C20588k2.d(vVar2, 1.0f), f19), androidx.compose.foundation.shape.o.a(f22)), pVar5.c(bE2), null, com.google.accompanist.placeholder.material.a.a(bE2), 52));
            com.akita.compose.foundation.ui.g.a(22, null, bE2, 6);
            C20608p2.a(bE2, com.google.accompanist.placeholder.material.e.a(androidx.compose.ui.draw.k.a(C20588k2.f(C20588k2.t(vVar2, f16), f17), androidx.compose.foundation.shape.o.a(f18)), pVar5.c(bE2), null, com.google.accompanist.placeholder.material.a.a(bE2), 52));
            com.akita.compose.foundation.ui.g.a(f12, null, bE2, 6);
            C20608p2.a(bE2, com.google.accompanist.placeholder.material.e.a(androidx.compose.ui.draw.k.a(C20588k2.f(C20588k2.d(vVar2, 1.0f), f19), androidx.compose.foundation.shape.o.a(f22)), pVar5.c(bE2), null, com.google.accompanist.placeholder.material.a.a(bE2), 52));
            com.akita.compose.foundation.ui.g.a(29, null, bE2, 6);
            C20608p2.a(bE2, com.google.accompanist.placeholder.material.e.a(androidx.compose.ui.draw.k.a(C20588k2.f(C20588k2.t(vVar2, f13), f14), androidx.compose.foundation.shape.o.a(f15)), pVar5.c(bE2), null, com.google.accompanist.placeholder.material.a.a(bE2), 52));
            com.akita.compose.foundation.ui.g.a(27, null, bE2, 6);
            C20608p2.a(bE2, com.google.accompanist.placeholder.material.e.a(androidx.compose.ui.draw.k.a(C20588k2.f(C20588k2.t(vVar2, f16), f17), androidx.compose.foundation.shape.o.a(f18)), pVar5.c(bE2), null, com.google.accompanist.placeholder.material.a.a(bE2), 52));
            com.akita.compose.foundation.ui.g.a(f12, null, bE2, 6);
            C20608p2.a(bE2, com.google.accompanist.placeholder.material.e.a(androidx.compose.ui.draw.k.a(C20588k2.f(C20588k2.d(vVar2, 1.0f), f19), androidx.compose.foundation.shape.o.a(f22)), pVar5.c(bE2), null, com.google.accompanist.placeholder.material.a.a(bE2), 52));
            androidx.compose.ui.v vVarM = R1.m(k12.a(C20588k2.d(vVar2, 1.0f), 1.0f, true), 0.0f, 0.0f, 0.0f, f12, 7);
            InterfaceC22365i0 interfaceC22365i0D = C20632w.d(InterfaceC22215f.a.f39076b, false);
            int i15 = bE2.f37888Q;
            O1 o1S2 = bE2.S();
            androidx.compose.ui.v vVarC2 = androidx.compose.ui.n.c(bE2, vVarM);
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
            R3.b(pVar, bE2, interfaceC22365i0D);
            R3.b(pVar2, bE2, o1S2);
            if (bE2.f37887P || !kotlin.jvm.internal.L.f(bE2.t(), Integer.valueOf(i15))) {
                AK.c.y(i15, bE2, i15, pVar3);
            }
            R3.b(pVar4, bE2, vVarC2);
            C20608p2.a(bE2, com.google.accompanist.placeholder.material.e.a(C20644z.f28804a.d(androidx.compose.ui.draw.k.a(C20588k2.f(C20588k2.d(vVar2, 1.0f), 52), androidx.compose.foundation.shape.o.a(f22)), InterfaceC22215f.a.f39083i), pVar5.c(bE2), null, com.google.accompanist.placeholder.material.a.a(bE2), 52));
            bE2.X(true);
            bE2.X(true);
        }
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new D(vVar2, i12);
        }
    }

    public static final void f(o20.c cVar, androidx.compose.runtime.A a12, int i12) {
        v.a aVar;
        androidx.compose.runtime.B bE2 = a12.E(-1271497956);
        v.a aVar2 = androidx.compose.ui.v.f42878y1;
        String str = cVar.f419322b;
        if (str == null || str.length() == 0) {
            aVar = aVar2;
        } else {
            C20585k c20585k = C20585k.f28659a;
            h.a aVar3 = androidx.compose.ui.unit.h.f42849c;
            c20585k.getClass();
            C20585k.j jVarG = C20585k.g(12);
            InterfaceC22215f.f39074a.getClass();
            androidx.compose.foundation.layout.I iA2 = androidx.compose.foundation.layout.H.a(jVarG, InterfaceC22215f.a.f39088n, bE2, 6);
            int i13 = bE2.f37888Q;
            O1 o1S = bE2.S();
            androidx.compose.ui.v vVarC = androidx.compose.ui.n.c(bE2, aVar2);
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
            R3.b(InterfaceC22413h.a.f40796g, bE2, iA2);
            R3.b(InterfaceC22413h.a.f40795f, bE2, o1S);
            Y41.p<InterfaceC22413h, Integer, G0> pVar = InterfaceC22413h.a.f40799j;
            if (bE2.f37887P || !kotlin.jvm.internal.L.f(bE2.t(), Integer.valueOf(i13))) {
                AK.c.y(i13, bE2, i13, pVar);
            }
            R3.b(InterfaceC22413h.a.f40793d, bE2, vVarC);
            androidx.compose.foundation.layout.K k12 = androidx.compose.foundation.layout.K.f28344a;
            com.akita.compose.theme.re23.b.f63983a.getClass();
            aVar = aVar2;
            com.akita.compose.foundation.ui.p.b(cVar.f419322b, com.akita.compose.theme.re23.b.f63988f.f65232c, null, false, 0L, null, 0, 0, false, null, bE2, 0, 1020);
            bE2.X(true);
        }
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new L(cVar, aVar, i12);
        }
    }
}
