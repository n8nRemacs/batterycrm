package com.avito.android.mortgage_calculator.internal;

import androidx.compose.foundation.layout.C20563e2;
import androidx.compose.foundation.layout.C20568f2;
import androidx.compose.foundation.layout.C20576h2;
import androidx.compose.foundation.layout.C20585k;
import androidx.compose.foundation.layout.C20588k2;
import androidx.compose.foundation.layout.C20608p2;
import androidx.compose.foundation.layout.R1;
import androidx.compose.runtime.C22039c2;
import androidx.compose.runtime.C22190v;
import androidx.compose.runtime.InterfaceC22078i;
import androidx.compose.runtime.InterfaceC22132o;
import androidx.compose.runtime.InterfaceC22181t;
import androidx.compose.runtime.O1;
import androidx.compose.runtime.R3;
import androidx.compose.ui.InterfaceC22215f;
import androidx.compose.ui.layout.InterfaceC22365i0;
import androidx.compose.ui.layout.InterfaceC22374n;
import androidx.compose.ui.node.InterfaceC22413h;
import androidx.compose.ui.unit.h;
import androidx.compose.ui.v;
import com.avito.android.R;
import com.avito.android.remote.model.text.AttributedText;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import z10.C50350c;

/* compiled from: MortgageCalculatorOfferDescription.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_mortgage-calculator_util"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.mortgage_calculator.internal.l, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C32735l {
    @InterfaceC22132o
    @InterfaceC22181t
    public static final void a(B10.b bVar, androidx.compose.ui.v vVar, androidx.compose.runtime.A a12, int i12) {
        androidx.compose.runtime.B bE2 = a12.E(-264344860);
        if ((((bE2.B(bVar) ? 4 : 2) | i12) & 91) == 18 && bE2.c()) {
            bE2.f();
        } else {
            C20585k c20585k = C20585k.f28659a;
            h.a aVar = androidx.compose.ui.unit.h.f42849c;
            c20585k.getClass();
            C20585k.j jVarG = C20585k.g(2);
            InterfaceC22215f.f39074a.getClass();
            androidx.compose.foundation.layout.I iA2 = androidx.compose.foundation.layout.H.a(jVarG, InterfaceC22215f.a.f39088n, bE2, 6);
            int i13 = bE2.f37888Q;
            O1 o1S = bE2.S();
            androidx.compose.ui.v vVarC = androidx.compose.ui.n.c(bE2, vVar);
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
            Y41.p<InterfaceC22413h, Integer, kotlin.G0> pVar = InterfaceC22413h.a.f40799j;
            if (bE2.f37887P || !kotlin.jvm.internal.L.f(bE2.t(), Integer.valueOf(i13))) {
                AK.c.y(i13, bE2, i13, pVar);
            }
            R3.b(InterfaceC22413h.a.f40793d, bE2, vVarC);
            androidx.compose.foundation.layout.K k12 = androidx.compose.foundation.layout.K.f28344a;
            String str = bVar.f794a;
            com.akita.compose.theme.re23.b.f63983a.getClass();
            com.akita.compose.foundation.ui.p.b(str, com.akita.compose.foundation.r.a(com.akita.compose.theme.re23.b.f63988f.f65245p, com.akita.compose.theme.re23.b.f63984b.f63918e0, 0L, 0L, null, 0L, 0L, 1022), R1.m(androidx.compose.ui.v.f42878y1, 0.0f, 0.0f, 0.0f, 6, 7), false, 0L, null, 0, 0, false, null, bE2, 384, 1016);
            bE2.C(-1120783564);
            List<B10.a> list = bVar.f795b;
            List<B10.a> list2 = list;
            ArrayList arrayList = new ArrayList(C42745f0.q(list2, 10));
            Iterator<T> it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(GU.a.a(((B10.a) it.next()).f793d, bE2));
            }
            bE2.X(false);
            bE2.C(-1120781583);
            ArrayList arrayList2 = new ArrayList(C42745f0.q(list2, 10));
            Iterator<T> it2 = list2.iterator();
            while (it2.hasNext()) {
                arrayList2.add(((B10.a) it2.next()).f792c.invoke(bE2, 0));
            }
            bE2.X(false);
            com.akita.compose.component.docking_badge.f.a(C20588k2.d(androidx.compose.ui.v.f42878y1, 1.0f), 7, 0.0f, new C32713a(list, arrayList, arrayList2), bE2, 54, 4);
            bE2.X(true);
        }
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new C32715b(bVar, vVar, i12);
        }
    }

    @InterfaceC22132o
    @InterfaceC22181t
    public static final void b(ArrayList arrayList, androidx.compose.ui.v vVar, androidx.compose.runtime.A a12, int i12) {
        androidx.compose.runtime.B bE2 = a12.E(-1487249377);
        C20585k c20585k = C20585k.f28659a;
        h.a aVar = androidx.compose.ui.unit.h.f42849c;
        c20585k.getClass();
        C20585k.j jVarG = C20585k.g(16);
        InterfaceC22215f.f39074a.getClass();
        C20568f2 c20568f2A = C20563e2.a(jVarG, InterfaceC22215f.a.f39085k, bE2, 6);
        int i13 = bE2.f37888Q;
        O1 o1S = bE2.S();
        androidx.compose.ui.v vVarC = androidx.compose.ui.n.c(bE2, vVar);
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
        R3.b(InterfaceC22413h.a.f40796g, bE2, c20568f2A);
        R3.b(InterfaceC22413h.a.f40795f, bE2, o1S);
        Y41.p<InterfaceC22413h, Integer, kotlin.G0> pVar = InterfaceC22413h.a.f40799j;
        if (bE2.f37887P || !kotlin.jvm.internal.L.f(bE2.t(), Integer.valueOf(i13))) {
            AK.c.y(i13, bE2, i13, pVar);
        }
        R3.b(InterfaceC22413h.a.f40793d, bE2, vVarC);
        C20576h2 c20576h2 = C20576h2.f28641a;
        bE2.C(-942910342);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            B10.d dVar = (B10.d) it.next();
            androidx.compose.ui.v vVarA = c20576h2.a(androidx.compose.ui.v.f42878y1, 1.0f, true);
            C20585k.f28659a.getClass();
            C20585k.l lVar = C20585k.f28662d;
            InterfaceC22215f.f39074a.getClass();
            androidx.compose.foundation.layout.I iA2 = androidx.compose.foundation.layout.H.a(lVar, InterfaceC22215f.a.f39088n, bE2, 0);
            int i14 = bE2.f37888Q;
            O1 o1S2 = bE2.S();
            androidx.compose.ui.v vVarC2 = androidx.compose.ui.n.c(bE2, vVarA);
            InterfaceC22413h.f40789C1.getClass();
            Y41.a<InterfaceC22413h> aVar3 = InterfaceC22413h.a.f40791b;
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
            R3.b(InterfaceC22413h.a.f40796g, bE2, iA2);
            R3.b(InterfaceC22413h.a.f40795f, bE2, o1S2);
            Y41.p<InterfaceC22413h, Integer, kotlin.G0> pVar2 = InterfaceC22413h.a.f40799j;
            if (bE2.f37887P || !kotlin.jvm.internal.L.f(bE2.t(), Integer.valueOf(i14))) {
                AK.c.y(i14, bE2, i14, pVar2);
            }
            R3.b(InterfaceC22413h.a.f40793d, bE2, vVarC2);
            androidx.compose.foundation.layout.K k12 = androidx.compose.foundation.layout.K.f28344a;
            String str = dVar.f798a;
            com.akita.compose.theme.re23.b.f63983a.getClass();
            com.akita.compose.foundation.ui.p.b(str, com.akita.compose.foundation.r.a(com.akita.compose.theme.re23.b.f63988f.f65244o, com.akita.compose.theme.re23.b.f63984b.f63918e0, 0L, 0L, null, 0L, 0L, 1022), null, false, 0L, null, 0, 0, false, null, bE2, 0, 1020);
            com.avito.android.lib.compose.design.component.attributedtext.a.b(dVar.f799b, null, R.attr.textM10, null, null, 0, bE2, 8, 58);
            bE2.X(true);
            c20576h2 = c20576h2;
            interfaceC22078i = interfaceC22078i;
        }
        C22039c2 c22039c2N = com.avito.android.actions_sheet.a.n(bE2, false, true);
        if (c22039c2N != null) {
            c22039c2N.f38184d = new C32717c(arrayList, vVar, i12);
        }
    }

    @InterfaceC22132o
    @InterfaceC22181t
    public static final void c(@Y61.k G10.c cVar, @Y61.k Y41.a aVar, @Y61.k Y41.l lVar, @Y61.k Y41.l lVar2, @Y61.l v.a aVar2, @Y61.l androidx.compose.runtime.A a12, int i12) {
        int i13;
        androidx.compose.runtime.B b12;
        v.a aVar3;
        androidx.compose.runtime.B bE2 = a12.E(1343924422);
        if ((i12 & 14) == 0) {
            i13 = (bE2.B(cVar) ? 4 : 2) | i12;
        } else {
            i13 = i12;
        }
        if ((i12 & 112) == 0) {
            i13 |= bE2.u(aVar) ? 32 : 16;
        }
        if ((i12 & 896) == 0) {
            i13 |= bE2.u(lVar) ? 256 : 128;
        }
        if ((i12 & 7168) == 0) {
            i13 |= bE2.u(lVar2) ? 2048 : 1024;
        }
        int i14 = i13 | 24576;
        if ((46811 & i14) == 9362 && bE2.c()) {
            bE2.f();
            aVar3 = aVar2;
            b12 = bE2;
        } else {
            v.a aVar4 = androidx.compose.ui.v.f42878y1;
            b12 = bE2;
            com.akita.compose.component.bottom_sheet.H.a(aVar, aVar4, com.akita.compose.component.bottom_sheet.N.a(true, 0.0f, bE2, 6, 6), null, null, null, null, true, false, null, null, null, androidx.compose.runtime.internal.r.c(188361190, new C32725g(cVar, lVar, aVar, lVar2), bE2), b12, ((i14 >> 3) & 14) | 12582912 | ((i14 >> 9) & 112), 384, 3960);
            aVar3 = aVar4;
        }
        C22039c2 c22039c2Z = b12.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new C32727h(cVar, aVar, lVar, lVar2, aVar3, i12);
        }
    }

    @InterfaceC22132o
    @InterfaceC22181t
    public static final void d(C50350c c50350c, androidx.compose.ui.v vVar, androidx.compose.runtime.A a12, int i12) {
        int i13;
        androidx.compose.runtime.B bE2 = a12.E(130473900);
        if ((i12 & 14) == 0) {
            i13 = (bE2.B(c50350c) ? 4 : 2) | i12;
        } else {
            i13 = i12;
        }
        if ((i12 & 112) == 0) {
            i13 |= bE2.B(vVar) ? 32 : 16;
        }
        if ((i13 & 91) == 18 && bE2.c()) {
            bE2.f();
        } else {
            C20585k c20585k = C20585k.f28659a;
            h.a aVar = androidx.compose.ui.unit.h.f42849c;
            c20585k.getClass();
            C20585k.j jVarG = C20585k.g(16);
            InterfaceC22215f.f39074a.getClass();
            C20568f2 c20568f2A = C20563e2.a(jVarG, InterfaceC22215f.a.f39085k, bE2, 54);
            int i14 = bE2.f37888Q;
            O1 o1S = bE2.S();
            androidx.compose.ui.v vVarC = androidx.compose.ui.n.c(bE2, vVar);
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
            Y41.p<InterfaceC22413h, Integer, kotlin.G0> pVar = InterfaceC22413h.a.f40799j;
            if (bE2.f37887P || !kotlin.jvm.internal.L.f(bE2.t(), Integer.valueOf(i14))) {
                AK.c.y(i14, bE2, i14, pVar);
            }
            R3.b(InterfaceC22413h.a.f40793d, bE2, vVarC);
            C20576h2 c20576h2 = C20576h2.f28641a;
            bE2.C(259496334);
            AttributedText attributedText = c50350c.f443773a;
            if (attributedText != null) {
                com.avito.android.lib.compose.design.component.attributedtext.a.b(attributedText, c20576h2.a(androidx.compose.ui.v.f42878y1, 1.0f, true), R.attr.textH40, null, null, 0, bE2, 8, 56);
            }
            bE2.X(false);
            bE2.C(259504082);
            String str = c50350c.f443774b;
            if (str != null) {
                InterfaceC22374n.f40491a.getClass();
                coil.compose.v.b(str, u0.i.c(bE2, R.string.bank_icons_content_description), C20588k2.v(0.0f, 150, 1, C20588k2.f(androidx.compose.ui.v.f42878y1, 24)), null, InterfaceC22374n.a.f40495d, null, bE2, 1573248, 4024);
            }
            bE2.X(false);
            bE2.X(true);
        }
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new C32729i(c50350c, vVar, i12);
        }
    }

    @InterfaceC22132o
    @InterfaceC22181t
    public static final void e(z10.g gVar, androidx.compose.ui.v vVar, androidx.compose.runtime.A a12, int i12) {
        androidx.compose.runtime.B bE2 = a12.E(959807047);
        if ((((bE2.B(gVar) ? 4 : 2) | i12 | (bE2.B(vVar) ? 32 : 16)) & 91) == 18 && bE2.c()) {
            bE2.f();
        } else {
            C20585k.f28659a.getClass();
            C20585k.l lVar = C20585k.f28662d;
            InterfaceC22215f.f39074a.getClass();
            androidx.compose.foundation.layout.I iA2 = androidx.compose.foundation.layout.H.a(lVar, InterfaceC22215f.a.f39088n, bE2, 0);
            int i13 = bE2.f37888Q;
            O1 o1S = bE2.S();
            androidx.compose.ui.v vVarC = androidx.compose.ui.n.c(bE2, vVar);
            InterfaceC22413h.f40789C1.getClass();
            Y41.a<InterfaceC22413h> aVar = InterfaceC22413h.a.f40791b;
            if (bE2.f37890b == null) {
                C22190v.b();
                throw null;
            }
            bE2.A();
            if (bE2.f37887P) {
                bE2.b(aVar);
            } else {
                bE2.d();
            }
            R3.b(InterfaceC22413h.a.f40796g, bE2, iA2);
            R3.b(InterfaceC22413h.a.f40795f, bE2, o1S);
            Y41.p<InterfaceC22413h, Integer, kotlin.G0> pVar = InterfaceC22413h.a.f40799j;
            if (bE2.f37887P || !kotlin.jvm.internal.L.f(bE2.t(), Integer.valueOf(i13))) {
                AK.c.y(i13, bE2, i13, pVar);
            }
            R3.b(InterfaceC22413h.a.f40793d, bE2, vVarC);
            androidx.compose.foundation.layout.K k12 = androidx.compose.foundation.layout.K.f28344a;
            String str = gVar.f443795a;
            com.akita.compose.theme.re23.b.f63983a.getClass();
            com.akita.compose.theme.re23.i iVar = com.akita.compose.theme.re23.b.f63988f;
            com.akita.compose.foundation.ui.p.b(str, com.akita.compose.foundation.r.a(iVar.f65245p, com.akita.compose.theme.re23.b.f63984b.f63918e0, 0L, 0L, null, 0L, 0L, 1022), null, false, 0L, null, 0, 0, false, null, bE2, 0, 1020);
            com.akita.compose.foundation.ui.p.b(gVar.f443796b, iVar.f65234e, null, false, 0L, null, 0, 0, false, null, bE2, 0, 1020);
            bE2.C(438743404);
            String str2 = gVar.f443797c;
            if (str2 != null) {
                h.a aVar2 = androidx.compose.ui.unit.h.f42849c;
                com.akita.compose.foundation.ui.p.b(str2, iVar.f65244o, R1.m(androidx.compose.ui.v.f42878y1, 0.0f, 2, 0.0f, 0.0f, 13), false, 0L, null, 0, 0, false, null, bE2, 384, 1016);
            }
            bE2.X(false);
            bE2.X(true);
        }
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new C32731j(gVar, vVar, i12);
        }
    }

    public static final void f(C50350c c50350c, androidx.compose.ui.v vVar, androidx.compose.runtime.A a12, int i12) {
        int i13;
        boolean z12;
        androidx.compose.runtime.B bE2 = a12.E(-1168001075);
        if ((i12 & 14) == 0) {
            i13 = (bE2.B(c50350c) ? 4 : 2) | i12;
        } else {
            i13 = i12;
        }
        if ((i12 & 112) == 0) {
            i13 |= bE2.B(vVar) ? 32 : 16;
        }
        if ((i13 & 91) == 18 && bE2.c()) {
            bE2.f();
        } else {
            C20585k c20585k = C20585k.f28659a;
            h.a aVar = androidx.compose.ui.unit.h.f42849c;
            c20585k.getClass();
            C20585k.j jVarG = C20585k.g(12);
            InterfaceC22215f.f39074a.getClass();
            androidx.compose.foundation.layout.I iA2 = androidx.compose.foundation.layout.H.a(jVarG, InterfaceC22215f.a.f39088n, bE2, 6);
            int i14 = bE2.f37888Q;
            O1 o1S = bE2.S();
            androidx.compose.ui.v vVarC = androidx.compose.ui.n.c(bE2, vVar);
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
            Y41.p<InterfaceC22413h, InterfaceC22365i0, kotlin.G0> pVar = InterfaceC22413h.a.f40796g;
            R3.b(pVar, bE2, iA2);
            Y41.p<InterfaceC22413h, androidx.compose.runtime.U, kotlin.G0> pVar2 = InterfaceC22413h.a.f40795f;
            R3.b(pVar2, bE2, o1S);
            Y41.p<InterfaceC22413h, Integer, kotlin.G0> pVar3 = InterfaceC22413h.a.f40799j;
            if (bE2.f37887P || !kotlin.jvm.internal.L.f(bE2.t(), Integer.valueOf(i14))) {
                AK.c.y(i14, bE2, i14, pVar3);
            }
            Y41.p<InterfaceC22413h, androidx.compose.ui.v, kotlin.G0> pVar4 = InterfaceC22413h.a.f40793d;
            R3.b(pVar4, bE2, vVarC);
            androidx.compose.foundation.layout.K k12 = androidx.compose.foundation.layout.K.f28344a;
            v.a aVar3 = androidx.compose.ui.v.f42878y1;
            d(c50350c, C20588k2.d(aVar3, 1.0f), bE2, (i13 & 14) | 48);
            bE2.C(1254161159);
            if (c50350c.f443775c != null) {
                C20568f2 c20568f2A = C20563e2.a(C20585k.f28660b, InterfaceC22215f.a.f39085k, bE2, 0);
                int i15 = bE2.f37888Q;
                O1 o1S2 = bE2.S();
                androidx.compose.ui.v vVarC2 = androidx.compose.ui.n.c(bE2, aVar3);
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
                R3.b(pVar, bE2, c20568f2A);
                R3.b(pVar2, bE2, o1S2);
                if (bE2.f37887P || !kotlin.jvm.internal.L.f(bE2.t(), Integer.valueOf(i15))) {
                    AK.c.y(i15, bE2, i15, pVar3);
                }
                R3.b(pVar4, bE2, vVarC2);
                C20576h2 c20576h2 = C20576h2.f28641a;
                e(c50350c.f443775c, c20576h2.a(aVar3, 2.0f, true), bE2, 0);
                C20608p2.a(bE2, c20576h2.a(aVar3, 1.5f, true));
                bE2.X(true);
                z12 = false;
            } else {
                z12 = false;
            }
            bE2.X(z12);
            bE2.C(1254170505);
            ArrayList arrayList = c50350c.f443776d;
            if (arrayList != null && !arrayList.isEmpty()) {
                b(arrayList, C20588k2.d(aVar3, 1.0f), bE2, 56);
            }
            bE2.X(false);
            bE2.C(1254176977);
            B10.b bVar = c50350c.f443777e;
            if (bVar != null && !bVar.f795b.isEmpty()) {
                a(bVar, C20588k2.d(aVar3, 1.0f), bE2, 48);
            }
            bE2.X(false);
            bE2.X(true);
        }
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new C32719d(c50350c, vVar, i12);
        }
    }

    public static final void g(B10.c cVar, androidx.compose.ui.v vVar, androidx.compose.runtime.A a12, int i12) {
        androidx.compose.runtime.B bE2 = a12.E(484613476);
        int i13 = (i12 & 14) == 0 ? (bE2.B(cVar) ? 4 : 2) | i12 : i12;
        if ((i12 & 112) == 0) {
            i13 |= bE2.B(vVar) ? 32 : 16;
        }
        if ((i13 & 91) == 18 && bE2.c()) {
            bE2.f();
        } else {
            C20585k c20585k = C20585k.f28659a;
            h.a aVar = androidx.compose.ui.unit.h.f42849c;
            c20585k.getClass();
            C20585k.j jVarG = C20585k.g(12);
            InterfaceC22215f.f39074a.getClass();
            androidx.compose.foundation.layout.I iA2 = androidx.compose.foundation.layout.H.a(jVarG, InterfaceC22215f.a.f39088n, bE2, 6);
            int i14 = bE2.f37888Q;
            O1 o1S = bE2.S();
            androidx.compose.ui.v vVarC = androidx.compose.ui.n.c(bE2, vVar);
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
            Y41.p<InterfaceC22413h, InterfaceC22365i0, kotlin.G0> pVar = InterfaceC22413h.a.f40796g;
            R3.b(pVar, bE2, iA2);
            Y41.p<InterfaceC22413h, androidx.compose.runtime.U, kotlin.G0> pVar2 = InterfaceC22413h.a.f40795f;
            R3.b(pVar2, bE2, o1S);
            Y41.p<InterfaceC22413h, Integer, kotlin.G0> pVar3 = InterfaceC22413h.a.f40799j;
            if (bE2.f37887P || !kotlin.jvm.internal.L.f(bE2.t(), Integer.valueOf(i14))) {
                AK.c.y(i14, bE2, i14, pVar3);
            }
            Y41.p<InterfaceC22413h, androidx.compose.ui.v, kotlin.G0> pVar4 = InterfaceC22413h.a.f40793d;
            R3.b(pVar4, bE2, vVarC);
            androidx.compose.foundation.layout.K k12 = androidx.compose.foundation.layout.K.f28344a;
            String str = cVar.f796a;
            com.akita.compose.theme.re23.b.f63983a.getClass();
            com.akita.compose.foundation.ui.p.b(str, com.akita.compose.theme.re23.b.f63988f.f65236g, null, false, 0L, null, 0, 0, false, null, bE2, 0, 1020);
            C20585k.j jVarG2 = C20585k.g(16);
            float f12 = 1.0f;
            androidx.compose.ui.v vVarD = C20588k2.d(androidx.compose.ui.v.f42878y1, 1.0f);
            C20568f2 c20568f2A = C20563e2.a(jVarG2, InterfaceC22215f.a.f39085k, bE2, 6);
            int i15 = bE2.f37888Q;
            O1 o1S2 = bE2.S();
            androidx.compose.ui.v vVarC2 = androidx.compose.ui.n.c(bE2, vVarD);
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
            R3.b(pVar, bE2, c20568f2A);
            R3.b(pVar2, bE2, o1S2);
            if (bE2.f37887P || !kotlin.jvm.internal.L.f(bE2.t(), Integer.valueOf(i15))) {
                AK.c.y(i15, bE2, i15, pVar3);
            }
            R3.b(pVar4, bE2, vVarC2);
            C20576h2 c20576h2 = C20576h2.f28641a;
            bE2.C(294339536);
            for (B10.e eVar : cVar.f797b) {
                androidx.compose.ui.v vVarA = c20576h2.a(androidx.compose.ui.v.f42878y1, f12, true);
                C20585k.f28659a.getClass();
                C20585k.l lVar = C20585k.f28662d;
                InterfaceC22215f.f39074a.getClass();
                androidx.compose.foundation.layout.I iA3 = androidx.compose.foundation.layout.H.a(lVar, InterfaceC22215f.a.f39088n, bE2, 0);
                int i16 = bE2.f37888Q;
                O1 o1S3 = bE2.S();
                androidx.compose.ui.v vVarC3 = androidx.compose.ui.n.c(bE2, vVarA);
                InterfaceC22413h.f40789C1.getClass();
                Y41.a<InterfaceC22413h> aVar3 = InterfaceC22413h.a.f40791b;
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
                R3.b(InterfaceC22413h.a.f40796g, bE2, iA3);
                R3.b(InterfaceC22413h.a.f40795f, bE2, o1S3);
                Y41.p<InterfaceC22413h, Integer, kotlin.G0> pVar5 = InterfaceC22413h.a.f40799j;
                if (bE2.f37887P || !kotlin.jvm.internal.L.f(bE2.t(), Integer.valueOf(i16))) {
                    AK.c.y(i16, bE2, i16, pVar5);
                }
                R3.b(InterfaceC22413h.a.f40793d, bE2, vVarC3);
                androidx.compose.foundation.layout.K k13 = androidx.compose.foundation.layout.K.f28344a;
                String str2 = eVar.f800a;
                com.akita.compose.theme.re23.b.f63983a.getClass();
                com.akita.compose.theme.re23.i iVar = com.akita.compose.theme.re23.b.f63988f;
                com.akita.compose.foundation.ui.p.b(str2, com.akita.compose.foundation.r.a(iVar.f65244o, com.akita.compose.theme.re23.b.f63984b.f63918e0, 0L, 0L, null, 0L, 0L, 1022), null, false, 0L, null, 0, 0, false, null, bE2, 0, 1020);
                com.akita.compose.foundation.ui.p.b(eVar.f801b, iVar.f65240k, null, false, 0L, null, 0, 0, false, null, bE2, 0, 1020);
                bE2.X(true);
                c20576h2 = c20576h2;
                f12 = f12;
            }
            androidx.compose.foundation.H.A(bE2, false, true, true);
        }
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new C32733k(cVar, vVar, i12);
        }
    }
}
