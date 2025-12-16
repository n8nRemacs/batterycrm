package com.avito.android.mortgage.root.list.items.bank.details;

import Y41.p;
import Y61.l;
import android.content.Context;
import androidx.compose.foundation.layout.C20563e2;
import androidx.compose.foundation.layout.C20568f2;
import androidx.compose.foundation.layout.C20576h2;
import androidx.compose.foundation.layout.C20585k;
import androidx.compose.foundation.layout.C20588k2;
import androidx.compose.foundation.layout.C20632w;
import androidx.compose.foundation.layout.C20644z;
import androidx.compose.foundation.layout.H;
import androidx.compose.foundation.layout.I;
import androidx.compose.foundation.layout.K;
import androidx.compose.foundation.layout.R1;
import androidx.compose.foundation.shape.o;
import androidx.compose.runtime.A;
import androidx.compose.runtime.B;
import androidx.compose.runtime.C22039c2;
import androidx.compose.runtime.C22190v;
import androidx.compose.runtime.InterfaceC22132o;
import androidx.compose.runtime.InterfaceC22181t;
import androidx.compose.runtime.O1;
import androidx.compose.runtime.R3;
import androidx.compose.ui.InterfaceC22215f;
import androidx.compose.ui.draw.k;
import androidx.compose.ui.draw.y;
import androidx.compose.ui.i;
import androidx.compose.ui.layout.InterfaceC22365i0;
import androidx.compose.ui.n;
import androidx.compose.ui.node.InterfaceC22413h;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.unit.h;
import androidx.compose.ui.v;
import com.akita.compose.component.button.m;
import com.akita.compose.foundation.r;
import com.avito.android.mortgage.root.list.items.bank.details.model.MortgageRootBankAdditionalBlock;
import com.avito.android.mortgage.root.list.items.bank.details.model.MortgageRootBankAdditionalDetails;
import com.avito.android.mortgage.root.list.items.bank.details.model.MortgageRootBankDetails;
import com.avito.android.remote.model.text.AttributedText;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: MortgageRootBankDetailsScreen.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_mortgage_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class j {
    @InterfaceC22132o
    @InterfaceC22181t
    public static final void a(String str, ArrayList arrayList, v vVar, A a12, int i12) {
        B bE2 = a12.E(113784710);
        C20585k c20585k = C20585k.f28659a;
        h.a aVar = androidx.compose.ui.unit.h.f42849c;
        c20585k.getClass();
        C20585k.j jVarG = C20585k.g(6);
        InterfaceC22215f.f39074a.getClass();
        I iA2 = H.a(jVarG, InterfaceC22215f.a.f39088n, bE2, 6);
        int i13 = bE2.f37888Q;
        O1 o1S = bE2.S();
        v vVarC = n.c(bE2, vVar);
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
        p<InterfaceC22413h, Integer, G0> pVar = InterfaceC22413h.a.f40799j;
        if (bE2.f37887P || !L.f(bE2.t(), Integer.valueOf(i13))) {
            AK.c.y(i13, bE2, i13, pVar);
        }
        R3.b(InterfaceC22413h.a.f40793d, bE2, vVarC);
        K k12 = K.f28344a;
        com.akita.compose.theme.re23.b.f63983a.getClass();
        com.akita.compose.foundation.ui.p.b(str, com.akita.compose.theme.re23.b.f63988f.f65236g, R1.m(C20588k2.d(v.f42878y1, 1.0f), 0.0f, 0.0f, 0.0f, 2, 7), false, 0L, null, 0, 0, false, null, bE2, 384, 1016);
        bE2.C(459640725);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            MortgageRootBankAdditionalBlock mortgageRootBankAdditionalBlock = (MortgageRootBankAdditionalBlock) it.next();
            b(mortgageRootBankAdditionalBlock.f202343b, mortgageRootBankAdditionalBlock.f202344c, C20588k2.d(v.f42878y1, 1.0f), bE2, 448);
        }
        C22039c2 c22039c2N = com.avito.android.actions_sheet.a.n(bE2, false, true);
        if (c22039c2N != null) {
            c22039c2N.f38184d = new e(str, arrayList, vVar, i12);
        }
    }

    @InterfaceC22132o
    @InterfaceC22181t
    public static final void b(String str, AttributedText attributedText, v vVar, A a12, int i12) {
        B bE2 = a12.E(1330500464);
        C20585k c20585k = C20585k.f28659a;
        h.a aVar = androidx.compose.ui.unit.h.f42849c;
        c20585k.getClass();
        C20585k.j jVarG = C20585k.g(6);
        InterfaceC22215f.f39074a.getClass();
        i.b bVar = InterfaceC22215f.a.f39085k;
        com.akita.compose.theme.re23.b.f63983a.getClass();
        float f12 = 16;
        v vVarI = R1.i(androidx.compose.foundation.A.b(vVar, com.akita.compose.theme.re23.b.f63984b.f63973w1.c(bE2), o.a(f12)), f12);
        C20568f2 c20568f2A = C20563e2.a(jVarG, bVar, bE2, 54);
        int i13 = bE2.f37888Q;
        O1 o1S = bE2.S();
        v vVarC = n.c(bE2, vVarI);
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
        R3.b(InterfaceC22413h.a.f40796g, bE2, c20568f2A);
        R3.b(InterfaceC22413h.a.f40795f, bE2, o1S);
        p<InterfaceC22413h, Integer, G0> pVar = InterfaceC22413h.a.f40799j;
        if (bE2.f37887P || !L.f(bE2.t(), Integer.valueOf(i13))) {
            AK.c.y(i13, bE2, i13, pVar);
        }
        R3.b(InterfaceC22413h.a.f40793d, bE2, vVarC);
        C20576h2 c20576h2 = C20576h2.f28641a;
        String strO = com.avito.android.lib.util.f.o((Context) bE2.o(AndroidCompositionLocals_androidKt.f41069b), str);
        bE2.C(296486492);
        if (strO != null) {
            com.akita.compose.foundation.ui.o.a(strO, com.akita.compose.theme.re23.b.f63988f.f65241l, R1.m(v.f42878y1, 0.0f, 1, 0.0f, 0.0f, 13), null, bE2, 384, 8);
        }
        bE2.X(false);
        com.avito.android.lib.compose.design.component.attributedtext.a.b(attributedText, null, 0, null, null, 0, bE2, 8, 62);
        bE2.X(true);
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new f(str, attributedText, vVar, i12);
        }
    }

    /* JADX WARN: Failed to analyze thrown exceptions
    java.util.ConcurrentModificationException
    	at java.base/java.util.ArrayList$Itr.checkForComodification(Unknown Source)
    	at java.base/java.util.ArrayList$Itr.next(Unknown Source)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.processInstructions(MethodThrowsVisitor.java:118)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.visit(MethodThrowsVisitor.java:69)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.checkInsn(MethodThrowsVisitor.java:179)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.processInstructions(MethodThrowsVisitor.java:132)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.visit(MethodThrowsVisitor.java:69)
     */
    @InterfaceC22132o
    @InterfaceC22181t
    public static final void c(String str, Y41.a aVar, v.a aVar2, A a12, int i12) {
        B b12;
        v.a aVar3;
        B bE2 = a12.E(-1724205213);
        int i13 = (bE2.B(str) ? 4 : 2) | i12 | (bE2.u(aVar) ? 32 : 16) | 384;
        if ((i13 & 731) == 146 && bE2.c()) {
            bE2.f();
            aVar3 = aVar2;
            b12 = bE2;
        } else {
            v.a aVar4 = v.f42878y1;
            h.a aVar5 = androidx.compose.ui.unit.h.f42849c;
            float f12 = 24;
            v vVarA = y.a(aVar4, 12, o.c(f12, f12, 0.0f, 0.0f, 12), false, 28);
            com.akita.compose.theme.re23.b.f63983a.getClass();
            v vVarB = androidx.compose.foundation.A.b(vVarA, com.akita.compose.theme.re23.b.f63984b.f63851H1.c(bE2), o.c(f12, f12, 0.0f, 0.0f, 12));
            float f13 = 10;
            v vVarM = R1.m(R1.k(f13, 0.0f, 2, vVarB), 0.0f, f13, 0.0f, 16, 5);
            InterfaceC22215f.f39074a.getClass();
            InterfaceC22365i0 interfaceC22365i0D = C20632w.d(InterfaceC22215f.a.f39076b, false);
            int i14 = bE2.f37888Q;
            O1 o1S = bE2.S();
            v vVarC = n.c(bE2, vVarM);
            InterfaceC22413h.f40789C1.getClass();
            Y41.a<InterfaceC22413h> aVar6 = InterfaceC22413h.a.f40791b;
            if (bE2.f37890b == null) {
                C22190v.b();
                throw null;
            }
            bE2.A();
            if (bE2.f37887P) {
                bE2.b(aVar6);
            } else {
                bE2.d();
            }
            R3.b(InterfaceC22413h.a.f40796g, bE2, interfaceC22365i0D);
            R3.b(InterfaceC22413h.a.f40795f, bE2, o1S);
            p<InterfaceC22413h, Integer, G0> pVar = InterfaceC22413h.a.f40799j;
            if (bE2.f37887P || !L.f(bE2.t(), Integer.valueOf(i14))) {
                AK.c.y(i14, bE2, i14, pVar);
            }
            R3.b(InterfaceC22413h.a.f40793d, bE2, vVarC);
            C20644z c20644z = C20644z.f28804a;
            b12 = bE2;
            m.c(str, aVar, com.akita.compose.theme.re23.b.c(bE2).f2(), C20588k2.d(aVar4, 1.0f), null, null, null, false, false, null, bE2, (i13 & 112) | (i13 & 14) | 3072 | 512, 1008);
            b12.X(true);
            aVar3 = aVar4;
        }
        C22039c2 c22039c2Z = b12.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new g(str, aVar, aVar3, i12);
        }
    }

    @InterfaceC22132o
    @InterfaceC22181t
    public static final void d(int i12, A a12, v vVar, String str, String str2) {
        B b12;
        B bE2 = a12.E(-1341950352);
        int i13 = (bE2.B(str) ? 4 : 2) | i12 | (bE2.B(str2) ? 32 : 16);
        if ((i13 & 731) == 146 && bE2.c()) {
            bE2.f();
            b12 = bE2;
        } else {
            InterfaceC22215f.f39074a.getClass();
            i.b bVar = InterfaceC22215f.a.f39086l;
            C20585k c20585k = C20585k.f28659a;
            h.a aVar = androidx.compose.ui.unit.h.f42849c;
            c20585k.getClass();
            C20568f2 c20568f2A = C20563e2.a(C20585k.g(12), bVar, bE2, 54);
            int i14 = bE2.f37888Q;
            O1 o1S = bE2.S();
            v vVarC = n.c(bE2, vVar);
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
            R3.b(InterfaceC22413h.a.f40796g, bE2, c20568f2A);
            R3.b(InterfaceC22413h.a.f40795f, bE2, o1S);
            p<InterfaceC22413h, Integer, G0> pVar = InterfaceC22413h.a.f40799j;
            if (bE2.f37887P || !L.f(bE2.t(), Integer.valueOf(i14))) {
                AK.c.y(i14, bE2, i14, pVar);
            }
            R3.b(InterfaceC22413h.a.f40793d, bE2, vVarC);
            C20576h2 c20576h2 = C20576h2.f28641a;
            com.akita.compose.theme.re23.b.f63983a.getClass();
            r rVar = com.akita.compose.theme.re23.b.f63988f.f65232c;
            v.a aVar3 = v.f42878y1;
            com.akita.compose.foundation.ui.p.b(str, rVar, c20576h2.a(aVar3, 1.0f, true), false, 0L, null, 0, 0, false, null, bE2, i13 & 14, 1016);
            coil.compose.v.b(str2, str, k.a(C20588k2.o(aVar3, 48), o.f30153a), null, null, null, bE2, ((i13 >> 3) & 14) | ((i13 << 3) & 112), 4088);
            b12 = bE2;
            b12.X(true);
        }
        C22039c2 c22039c2Z = b12.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new h(str, str2, vVar, i12);
        }
    }

    @InterfaceC22132o
    @InterfaceC22181t
    public static final void e(@Y61.k MortgageRootBankDetails mortgageRootBankDetails, @Y61.k Y41.a aVar, @l A a12, int i12) {
        B bE2 = a12.E(-1139598374);
        v.a aVar2 = v.f42878y1;
        v vVarD = C20588k2.d(aVar2, 1.0f);
        C20585k.f28659a.getClass();
        C20585k.l lVar = C20585k.f28662d;
        InterfaceC22215f.f39074a.getClass();
        I iA2 = H.a(lVar, InterfaceC22215f.a.f39088n, bE2, 0);
        int i13 = bE2.f37888Q;
        O1 o1S = bE2.S();
        v vVarC = n.c(bE2, vVarD);
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
        p<InterfaceC22413h, Integer, G0> pVar = InterfaceC22413h.a.f40799j;
        if (bE2.f37887P || !L.f(bE2.t(), Integer.valueOf(i13))) {
            AK.c.y(i13, bE2, i13, pVar);
        }
        R3.b(InterfaceC22413h.a.f40793d, bE2, vVarC);
        K k12 = K.f28344a;
        v vVarD2 = C20588k2.d(aVar2, 1.0f);
        float f12 = 16;
        h.a aVar4 = androidx.compose.ui.unit.h.f42849c;
        d(384, bE2, R1.k(f12, 0.0f, 2, vVarD2), mortgageRootBankDetails.f202347b, mortgageRootBankDetails.f202348c);
        com.akita.compose.foundation.ui.g.a(8, null, bE2, 6);
        com.avito.android.lib.compose.design.component.attributedtext.a.b(mortgageRootBankDetails.f202349d, R1.k(f12, 0.0f, 2, C20588k2.d(aVar2, 1.0f)), 0, null, null, 0, bE2, 56, 60);
        float f13 = 24;
        com.akita.compose.foundation.ui.g.a(f13, null, bE2, 6);
        bE2.C(-1699586752);
        MortgageRootBankAdditionalDetails mortgageRootBankAdditionalDetails = mortgageRootBankDetails.f202350e;
        if (mortgageRootBankAdditionalDetails != null) {
            a(mortgageRootBankAdditionalDetails.f202345b, mortgageRootBankAdditionalDetails.f202346c, R1.k(f12, 0.0f, 2, C20588k2.d(aVar2, 1.0f)), bE2, 448);
            com.akita.compose.foundation.ui.g.a(f13, null, bE2, 6);
        }
        bE2.X(false);
        c(mortgageRootBankDetails.f202351f, aVar, null, bE2, 0);
        bE2.X(true);
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new i(mortgageRootBankDetails, aVar, aVar2, i12);
        }
    }
}
