package com.avito.android.mortgage_calculator.internal;

import E10.a;
import androidx.compose.foundation.layout.C20563e2;
import androidx.compose.foundation.layout.C20568f2;
import androidx.compose.foundation.layout.C20576h2;
import androidx.compose.foundation.layout.C20585k;
import androidx.compose.foundation.layout.C20588k2;
import androidx.compose.foundation.layout.C20632w;
import androidx.compose.foundation.layout.R1;
import androidx.compose.runtime.C22039c2;
import androidx.compose.runtime.C22190v;
import androidx.compose.runtime.InterfaceC22078i;
import androidx.compose.runtime.InterfaceC22132o;
import androidx.compose.runtime.InterfaceC22181t;
import androidx.compose.runtime.O1;
import androidx.compose.runtime.R3;
import androidx.compose.ui.InterfaceC22215f;
import androidx.compose.ui.i;
import androidx.compose.ui.layout.InterfaceC22365i0;
import androidx.compose.ui.node.InterfaceC22413h;
import androidx.compose.ui.platform.C22501m2;
import androidx.compose.ui.unit.h;
import androidx.compose.ui.v;
import kotlin.Metadata;
import okhttp3.internal.http2.Http2;
import shark.AndroidResourceIdNames;
import y10.C50037b;

/* compiled from: MortgageCalculatorScreen.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002¨\u0006\u0002²\u0006\u0010\u0010\u0001\u001a\u0004\u0018\u00010\u00008\n@\nX\u008a\u008e\u0002"}, d2 = {"Ll0/j;", "buttonBounds", "_avito_mortgage-calculator_util"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class R0 {
    @InterfaceC22132o
    @InterfaceC22181t
    public static final void a(E10.a aVar, Y41.l lVar, Y41.a aVar2, Y41.l lVar2, Y41.a aVar3, Y41.l lVar3, Y41.a aVar4, Y41.l lVar4, Y41.a aVar5, Y41.l lVar5, Y41.a aVar6, Y41.l lVar6, Y41.a aVar7, Y41.l lVar7, androidx.compose.ui.v vVar, androidx.compose.runtime.A a12, int i12, int i13) {
        int i14;
        int i15;
        androidx.compose.runtime.B bE2 = a12.E(-1571658383);
        if ((i12 & 14) == 0) {
            i14 = (bE2.B(aVar) ? 4 : 2) | i12;
        } else {
            i14 = i12;
        }
        if ((i12 & 112) == 0) {
            i14 |= bE2.u(lVar) ? 32 : 16;
        }
        if ((i12 & 896) == 0) {
            i14 |= bE2.u(aVar2) ? 256 : 128;
        }
        if ((i12 & 7168) == 0) {
            i14 |= bE2.u(lVar2) ? 2048 : 1024;
        }
        if ((i12 & 57344) == 0) {
            i14 |= bE2.u(aVar3) ? 16384 : 8192;
        }
        if ((i12 & 458752) == 0) {
            i14 |= bE2.u(lVar3) ? 131072 : AndroidResourceIdNames.RESOURCE_ID_TYPE_ITERATOR;
        }
        if ((i12 & 3670016) == 0) {
            i14 |= bE2.u(aVar4) ? 1048576 : 524288;
        }
        if ((i12 & 29360128) == 0) {
            i14 |= bE2.u(lVar4) ? 8388608 : 4194304;
        }
        if ((i12 & 234881024) == 0) {
            i14 |= bE2.u(aVar5) ? 67108864 : 33554432;
        }
        if ((i12 & 1879048192) == 0) {
            i14 |= bE2.u(lVar5) ? 536870912 : 268435456;
        }
        if ((i13 & 14) == 0) {
            i15 = (bE2.u(aVar6) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        if ((i13 & 112) == 0) {
            i15 |= bE2.u(lVar6) ? 32 : 16;
        }
        if ((i13 & 896) == 0) {
            i15 |= bE2.u(aVar7) ? 256 : 128;
        }
        if ((i13 & 7168) == 0) {
            i15 |= bE2.u(lVar7) ? 2048 : 1024;
        }
        if ((i13 & 57344) == 0) {
            i15 |= bE2.B(vVar) ? 16384 : 8192;
        }
        if ((i14 & 1533916891) == 306783378 && (46811 & i15) == 9362 && bE2.c()) {
            bE2.f();
        } else if (aVar instanceof a.b) {
            bE2.C(-744757309);
            int i16 = i15 << 18;
            l((a.b) aVar, lVar, aVar2, lVar2, aVar3, lVar5, aVar6, lVar6, aVar7, lVar7, vVar, bE2, ((i14 >> 12) & 458752) | (65520 & i14) | (i16 & 3670016) | (i16 & 29360128) | (i16 & 234881024) | (i16 & 1879048192), (i15 >> 12) & 14);
            bE2.X(false);
        } else if (aVar instanceof a.C0210a) {
            bE2.C(-744735249);
            int i17 = i15 << 18;
            h((a.C0210a) aVar, lVar3, aVar4, lVar4, aVar5, lVar5, aVar6, lVar6, aVar7, lVar7, vVar, bE2, ((i14 >> 12) & 524272) | (i17 & 3670016) | (i17 & 29360128) | (i17 & 234881024) | (i17 & 1879048192), (i15 >> 12) & 14);
            bE2.X(false);
        } else {
            bE2.C(-1611323713);
            bE2.X(false);
        }
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new C32769r0(aVar, lVar, aVar2, lVar2, aVar3, lVar3, aVar4, lVar4, aVar5, lVar5, aVar6, lVar6, aVar7, lVar7, vVar, i12, i13);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x010c  */
    @androidx.compose.runtime.InterfaceC22132o
    @androidx.compose.runtime.InterfaceC22181t
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(y10.C50036a r22, Y41.l r23, androidx.compose.ui.v r24, androidx.compose.runtime.A r25, int r26) {
        /*
            Method dump skipped, instructions count: 339
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.mortgage_calculator.internal.R0.b(y10.a, Y41.l, androidx.compose.ui.v, androidx.compose.runtime.A, int):void");
    }

    @InterfaceC22132o
    @InterfaceC22181t
    public static final void c(androidx.compose.ui.v vVar, androidx.compose.runtime.A a12, int i12) {
        androidx.compose.runtime.B bE2 = a12.E(-1532190178);
        if ((i12 & 11) == 2 && bE2.c()) {
            bE2.f();
        } else {
            C20585k c20585k = C20585k.f28659a;
            float f12 = 16;
            h.a aVar = androidx.compose.ui.unit.h.f42849c;
            c20585k.getClass();
            C20585k.j jVarG = C20585k.g(f12);
            InterfaceC22215f.f39074a.getClass();
            androidx.compose.foundation.layout.I iA2 = androidx.compose.foundation.layout.H.a(jVarG, InterfaceC22215f.a.f39088n, bE2, 6);
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
            Y41.p<InterfaceC22413h, InterfaceC22365i0, kotlin.G0> pVar = InterfaceC22413h.a.f40796g;
            R3.b(pVar, bE2, iA2);
            Y41.p<InterfaceC22413h, androidx.compose.runtime.U, kotlin.G0> pVar2 = InterfaceC22413h.a.f40795f;
            R3.b(pVar2, bE2, o1S);
            Y41.p<InterfaceC22413h, Integer, kotlin.G0> pVar3 = InterfaceC22413h.a.f40799j;
            if (bE2.f37887P || !kotlin.jvm.internal.L.f(bE2.t(), Integer.valueOf(i13))) {
                AK.c.y(i13, bE2, i13, pVar3);
            }
            Y41.p<InterfaceC22413h, androidx.compose.ui.v, kotlin.G0> pVar4 = InterfaceC22413h.a.f40793d;
            R3.b(pVar4, bE2, vVarC);
            androidx.compose.foundation.layout.K k12 = androidx.compose.foundation.layout.K.f28344a;
            v.a aVar3 = androidx.compose.ui.v.f42878y1;
            boolean z12 = false;
            C20632w.a(com.akita.compose.component.skeleton.b.c(C20588k2.f(C20588k2.t(R1.m(aVar3, 0.0f, 6, 0.0f, 0.0f, 13), 134), 10), androidx.compose.foundation.shape.o.a(3), null, false, bE2, 6, 6), bE2, 0);
            C20585k.j jVarG2 = C20585k.g(f12);
            androidx.compose.ui.v vVarD = C20588k2.d(aVar3, 1.0f);
            C20568f2 c20568f2A = C20563e2.a(jVarG2, InterfaceC22215f.a.f39085k, bE2, 6);
            int i14 = bE2.f37888Q;
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
            if (bE2.f37887P || !kotlin.jvm.internal.L.f(bE2.t(), Integer.valueOf(i14))) {
                AK.c.y(i14, bE2, i14, pVar3);
            }
            R3.b(pVar4, bE2, vVarC2);
            C20576h2 c20576h2 = C20576h2.f28641a;
            bE2.C(553708423);
            int i15 = 0;
            while (i15 < 6) {
                boolean z13 = z12;
                C20632w.a(com.akita.compose.component.skeleton.b.c(C20588k2.f(C20588k2.t(androidx.compose.ui.v.f42878y1, 48), 44), androidx.compose.foundation.shape.o.a(12), null, false, bE2, 6, 6), bE2, z13 ? 1 : 0);
                i15++;
                z12 = z13 ? 1 : 0;
            }
            androidx.compose.foundation.H.A(bE2, z12, true, true);
        }
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new u0(vVar, i12);
        }
    }

    @InterfaceC22132o
    @InterfaceC22181t
    public static final void d(androidx.compose.ui.v vVar, androidx.compose.runtime.A a12, int i12) {
        androidx.compose.runtime.B bE2 = a12.E(-2130680786);
        if ((((bE2.B(vVar) ? 4 : 2) | i12) & 11) == 2 && bE2.c()) {
            bE2.f();
        } else {
            InterfaceC22215f.f39074a.getClass();
            i.a aVar = InterfaceC22215f.a.f39089o;
            C20585k.f28659a.getClass();
            androidx.compose.foundation.layout.I iA2 = androidx.compose.foundation.layout.H.a(C20585k.f28662d, aVar, bE2, 48);
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
            v.a aVar3 = androidx.compose.ui.v.f42878y1;
            androidx.compose.ui.v vVarD = C20588k2.d(aVar3, 1.0f);
            float f12 = 44;
            h.a aVar4 = androidx.compose.ui.unit.h.f42849c;
            float f13 = 12;
            C20632w.a(com.akita.compose.component.skeleton.b.c(C20588k2.f(vVarD, f12), androidx.compose.foundation.shape.o.a(f13), null, false, bE2, 6, 6), bE2, 0);
            C20632w.a(com.akita.compose.component.skeleton.b.c(C20588k2.f(C20588k2.d(R1.m(aVar3, 0.0f, 6, 0.0f, 0.0f, 13), 1.0f), f12), androidx.compose.foundation.shape.o.a(f13), null, false, bE2, 6, 6), bE2, 0);
            C20632w.a(com.akita.compose.component.skeleton.b.c(C20588k2.f(C20588k2.t(R1.m(aVar3, 0.0f, 18, 0.0f, 4, 5), 134), 10), androidx.compose.foundation.shape.o.a(3), null, false, bE2, 6, 6), bE2, 0);
            bE2.X(true);
        }
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new v0(vVar, i12);
        }
    }

    @InterfaceC22132o
    @InterfaceC22181t
    public static final void e(androidx.compose.ui.v vVar, androidx.compose.runtime.A a12, int i12) {
        androidx.compose.runtime.B bE2 = a12.E(787530647);
        if ((((bE2.B(vVar) ? 4 : 2) | i12) & 11) == 2 && bE2.c()) {
            bE2.f();
        } else {
            C20585k c20585k = C20585k.f28659a;
            h.a aVar = androidx.compose.ui.unit.h.f42849c;
            c20585k.getClass();
            C20585k.j jVarG = C20585k.g(20);
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
            bE2.C(1601968341);
            for (int i14 = 0; i14 < 2; i14++) {
                g(C20588k2.d(androidx.compose.ui.v.f42878y1, 1.0f), bE2, 6);
            }
            bE2.X(false);
            c(C20588k2.d(androidx.compose.ui.v.f42878y1, 1.0f), bE2, 6);
            bE2.X(true);
        }
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new w0(vVar, i12);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:75:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x025b  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0286  */
    @androidx.compose.runtime.InterfaceC22132o
    @androidx.compose.runtime.InterfaceC22181t
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void f(y10.C50037b r47, Y41.l r48, Y41.l r49, Y41.a r50, Y41.a r51, androidx.compose.ui.v r52, androidx.compose.runtime.A r53, int r54) {
        /*
            Method dump skipped, instructions count: 939
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.mortgage_calculator.internal.R0.f(y10.b, Y41.l, Y41.l, Y41.a, Y41.a, androidx.compose.ui.v, androidx.compose.runtime.A, int):void");
    }

    @InterfaceC22132o
    @InterfaceC22181t
    public static final void g(androidx.compose.ui.v vVar, androidx.compose.runtime.A a12, int i12) {
        androidx.compose.runtime.B bE2 = a12.E(1115099265);
        if ((i12 & 11) == 2 && bE2.c()) {
            bE2.f();
        } else {
            C20585k c20585k = C20585k.f28659a;
            h.a aVar = androidx.compose.ui.unit.h.f42849c;
            c20585k.getClass();
            C20585k.j jVarG = C20585k.g(16);
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
            v.a aVar3 = androidx.compose.ui.v.f42878y1;
            C20632w.a(com.akita.compose.component.skeleton.b.c(C20588k2.f(C20588k2.t(R1.m(aVar3, 0.0f, 6, 0.0f, 0.0f, 13), 134), 10), androidx.compose.foundation.shape.o.a(3), null, false, bE2, 6, 6), bE2, 0);
            C20632w.a(com.akita.compose.component.skeleton.b.c(C20588k2.f(C20588k2.d(aVar3, 1.0f), 44), androidx.compose.foundation.shape.o.a(12), null, false, bE2, 6, 6), bE2, 0);
            bE2.X(true);
        }
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new C0(vVar, i12);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:109:0x01ee  */
    @androidx.compose.runtime.InterfaceC22132o
    @androidx.compose.runtime.InterfaceC22181t
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void h(E10.a.C0210a r22, Y41.l r23, Y41.a r24, Y41.l r25, Y41.a r26, Y41.l r27, Y41.a r28, Y41.l r29, Y41.a r30, Y41.l r31, androidx.compose.ui.v r32, androidx.compose.runtime.A r33, int r34, int r35) {
        /*
            Method dump skipped, instructions count: 575
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.mortgage_calculator.internal.R0.h(E10.a$a, Y41.l, Y41.a, Y41.l, Y41.a, Y41.l, Y41.a, Y41.l, Y41.a, Y41.l, androidx.compose.ui.v, androidx.compose.runtime.A, int, int):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:268:0x042c  */
    /* JADX WARN: Removed duplicated region for block: B:329:0x075a  */
    @androidx.compose.runtime.InterfaceC22132o
    @androidx.compose.runtime.InterfaceC22181t
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void i(E10.e r50, float r51, Y41.l r52, Y41.l r53, Y41.a r54, Y41.l r55, Y41.a r56, Y41.l r57, Y41.a r58, Y41.l r59, Y41.a r60, Y41.l r61, Y41.a r62, Y41.l r63, Y41.a r64, Y41.l r65, Y41.a r66, Y41.a r67, Y41.l r68, Y41.l r69, Y41.l r70, Y41.l r71, Y41.l r72, Y41.a r73, Y41.l r74, Y41.a r75, Y41.a r76, Y41.a r77, Y41.a r78, Y41.a r79, androidx.compose.ui.v r80, androidx.compose.runtime.A r81, int r82, int r83, int r84) {
        /*
            Method dump skipped, instructions count: 2032
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.mortgage_calculator.internal.R0.i(E10.e, float, Y41.l, Y41.l, Y41.a, Y41.l, Y41.a, Y41.l, Y41.a, Y41.l, Y41.a, Y41.l, Y41.a, Y41.l, Y41.a, Y41.l, Y41.a, Y41.a, Y41.l, Y41.l, Y41.l, Y41.l, Y41.l, Y41.a, Y41.l, Y41.a, Y41.a, Y41.a, Y41.a, Y41.a, androidx.compose.ui.v, androidx.compose.runtime.A, int, int, int):void");
    }

    @InterfaceC22132o
    @InterfaceC22181t
    public static final void j(float f12, androidx.compose.ui.v vVar, androidx.compose.runtime.A a12, int i12) {
        int i13;
        androidx.compose.runtime.B bE2 = a12.E(-755151592);
        if ((i12 & 14) == 0) {
            i13 = (bE2.k(f12) ? 4 : 2) | i12;
        } else {
            i13 = i12;
        }
        if ((i12 & 112) == 0) {
            i13 |= bE2.B(vVar) ? 32 : 16;
        }
        if ((i13 & 91) == 18 && bE2.c()) {
            bE2.f();
        } else {
            C20585k.f28659a.getClass();
            C20585k.l lVar = C20585k.f28662d;
            InterfaceC22215f.f39074a.getClass();
            androidx.compose.foundation.layout.I iA2 = androidx.compose.foundation.layout.H.a(lVar, InterfaceC22215f.a.f39088n, bE2, 0);
            int i14 = bE2.f37888Q;
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
            if (bE2.f37887P || !kotlin.jvm.internal.L.f(bE2.t(), Integer.valueOf(i14))) {
                AK.c.y(i14, bE2, i14, pVar);
            }
            R3.b(InterfaceC22413h.a.f40793d, bE2, vVarC);
            androidx.compose.foundation.layout.K k12 = androidx.compose.foundation.layout.K.f28344a;
            v.a aVar2 = androidx.compose.ui.v.f42878y1;
            n(R1.k(f12, 0.0f, 2, C20588k2.d(aVar2, 1.0f)), bE2, 0);
            androidx.compose.ui.v vVarK = R1.k(f12, 0.0f, 2, C20588k2.d(aVar2, 1.0f));
            float f13 = 16;
            h.a aVar3 = androidx.compose.ui.unit.h.f42849c;
            m(R1.m(vVarK, 0.0f, f13, 0.0f, 0.0f, 13), bE2, 0);
            float f14 = 20;
            e(R1.m(R1.k(f12, 0.0f, 2, C20588k2.d(aVar2, 1.0f)), 0.0f, f14, 0.0f, 0.0f, 13), bE2, 0);
            C32768q0.d(f13, R1.m(C20588k2.d(aVar2, 1.0f), 0.0f, f14, 0.0f, 0.0f, 13), bE2, 54);
            d(R1.m(R1.k(f12, 0.0f, 2, C20588k2.d(aVar2, 1.0f)), 0.0f, f13, 0.0f, 0.0f, 13), bE2, 0);
            bE2.X(true);
        }
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new M0(f12, vVar, i12);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:129:0x026c  */
    /* JADX WARN: Removed duplicated region for block: B:131:? A[RETURN, SYNTHETIC] */
    @androidx.compose.runtime.InterfaceC22132o
    @androidx.compose.runtime.InterfaceC22181t
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void k(@Y61.k E10.e r37, float r38, @Y61.k Y41.l r39, @Y61.k Y41.l r40, @Y61.k Y41.a r41, @Y61.k Y41.l r42, @Y61.k Y41.a r43, @Y61.k Y41.l r44, @Y61.k Y41.a r45, @Y61.k Y41.l r46, @Y61.k Y41.a r47, @Y61.k Y41.l r48, @Y61.k Y41.a r49, @Y61.k Y41.l r50, @Y61.k Y41.a r51, @Y61.k Y41.l r52, @Y61.k Y41.a r53, @Y61.k Y41.a r54, @Y61.k Y41.l r55, @Y61.k Y41.l r56, @Y61.k Y41.l r57, @Y61.k Y41.l r58, @Y61.k Y41.l r59, @Y61.k Y41.a r60, @Y61.k Y41.l r61, @Y61.k Y41.a r62, @Y61.k Y41.a r63, @Y61.k Y41.a r64, @Y61.k Y41.a r65, @Y61.k Y41.a r66, @Y61.l androidx.compose.ui.v r67, @Y61.l androidx.compose.runtime.A r68, int r69) {
        /*
            Method dump skipped, instructions count: 701
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.mortgage_calculator.internal.R0.k(E10.e, float, Y41.l, Y41.l, Y41.a, Y41.l, Y41.a, Y41.l, Y41.a, Y41.l, Y41.a, Y41.l, Y41.a, Y41.l, Y41.a, Y41.l, Y41.a, Y41.a, Y41.l, Y41.l, Y41.l, Y41.l, Y41.l, Y41.a, Y41.l, Y41.a, Y41.a, Y41.a, Y41.a, Y41.a, androidx.compose.ui.v, androidx.compose.runtime.A, int):void");
    }

    @InterfaceC22132o
    @InterfaceC22181t
    public static final void l(a.b bVar, Y41.l lVar, Y41.a aVar, Y41.l lVar2, Y41.a aVar2, Y41.l lVar3, Y41.a aVar3, Y41.l lVar4, Y41.a aVar4, Y41.l lVar5, androidx.compose.ui.v vVar, androidx.compose.runtime.A a12, int i12, int i13) {
        int i14;
        int i15;
        androidx.compose.runtime.B bE2 = a12.E(-1004434631);
        if ((i12 & 14) == 0) {
            i14 = (bE2.B(bVar) ? 4 : 2) | i12;
        } else {
            i14 = i12;
        }
        if ((i12 & 112) == 0) {
            i14 |= bE2.u(lVar) ? 32 : 16;
        }
        if ((i12 & 896) == 0) {
            i14 |= bE2.u(aVar) ? 256 : 128;
        }
        if ((i12 & 7168) == 0) {
            i14 |= bE2.u(lVar2) ? 2048 : 1024;
        }
        if ((i12 & 57344) == 0) {
            i14 |= bE2.u(aVar2) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192;
        }
        if ((458752 & i12) == 0) {
            i14 |= bE2.u(lVar3) ? 131072 : AndroidResourceIdNames.RESOURCE_ID_TYPE_ITERATOR;
        }
        if ((3670016 & i12) == 0) {
            i14 |= bE2.u(aVar3) ? 1048576 : 524288;
        }
        if ((i12 & 29360128) == 0) {
            i14 |= bE2.u(lVar4) ? 8388608 : 4194304;
        }
        if ((i12 & 234881024) == 0) {
            i14 |= bE2.u(aVar4) ? 67108864 : 33554432;
        }
        if ((i12 & 1879048192) == 0) {
            i14 |= bE2.u(lVar5) ? 536870912 : 268435456;
        }
        if ((i13 & 14) == 0) {
            i15 = i13 | (bE2.B(vVar) ? 4 : 2);
        } else {
            i15 = i13;
        }
        if ((i14 & 1533916891) == 306783378 && (i15 & 11) == 2 && bE2.c()) {
            bE2.f();
        } else {
            C20585k c20585k = C20585k.f28659a;
            h.a aVar5 = androidx.compose.ui.unit.h.f42849c;
            c20585k.getClass();
            C20585k.j jVarG = C20585k.g(20);
            androidx.compose.ui.v vVarD = C20588k2.d(vVar, 1.0f);
            InterfaceC22215f.f39074a.getClass();
            androidx.compose.foundation.layout.I iA2 = androidx.compose.foundation.layout.H.a(jVarG, InterfaceC22215f.a.f39088n, bE2, 6);
            int i16 = bE2.f37888Q;
            O1 o1S = bE2.S();
            androidx.compose.ui.v vVarC = androidx.compose.ui.n.c(bE2, vVarD);
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
            R3.b(InterfaceC22413h.a.f40796g, bE2, iA2);
            R3.b(InterfaceC22413h.a.f40795f, bE2, o1S);
            Y41.p<InterfaceC22413h, Integer, kotlin.G0> pVar = InterfaceC22413h.a.f40799j;
            if (bE2.f37887P || !kotlin.jvm.internal.L.f(bE2.t(), Integer.valueOf(i16))) {
                AK.c.y(i16, bE2, i16, pVar);
            }
            R3.b(InterfaceC22413h.a.f40793d, bE2, vVarC);
            androidx.compose.foundation.layout.K k12 = androidx.compose.foundation.layout.K.f28344a;
            bE2.C(1379010066);
            C50037b c50037b = bVar.f3672b;
            if (c50037b != null) {
                f(c50037b, lVar2, null, aVar2, null, C22501m2.a(C20588k2.d(androidx.compose.ui.v.f42878y1, 1.0f), "landCost"), bE2, ((i14 >> 6) & 112) | 221568 | ((i14 >> 3) & 7168));
            }
            bE2.X(false);
            v.a aVar7 = androidx.compose.ui.v.f42878y1;
            f(bVar.f3671a, lVar, null, aVar, null, C22501m2.a(C20588k2.d(aVar7, 1.0f), "propertyCost"), bE2, 221568 | (i14 & 112) | ((i14 << 3) & 7168));
            int i17 = i14 >> 12;
            f(bVar.f3673c, lVar3, lVar4, aVar3, aVar4, C22501m2.a(C20588k2.d(aVar7, 1.0f), "downPayment"), bE2, (i17 & 112) | 196608 | ((i14 >> 15) & 896) | ((i14 >> 9) & 7168) | (i17 & 57344));
            b(bVar.f3674d, lVar5, C22501m2.a(C20588k2.d(aVar7, 1.0f), "creditTerm"), bE2, ((i14 >> 24) & 112) | 384);
            bE2.X(true);
        }
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new O0(bVar, lVar, aVar, lVar2, aVar2, lVar3, aVar3, lVar4, aVar4, lVar5, vVar, i12, i13);
        }
    }

    @InterfaceC22132o
    @InterfaceC22181t
    public static final void m(androidx.compose.ui.v vVar, androidx.compose.runtime.A a12, int i12) {
        androidx.compose.runtime.B bE2 = a12.E(-1797058095);
        if ((((bE2.B(vVar) ? 4 : 2) | i12) & 11) == 2 && bE2.c()) {
            bE2.f();
        } else {
            C20585k c20585k = C20585k.f28659a;
            h.a aVar = androidx.compose.ui.unit.h.f42849c;
            c20585k.getClass();
            C20585k.j jVarG = C20585k.g(6);
            InterfaceC22215f.f39074a.getClass();
            C20568f2 c20568f2A = C20563e2.a(jVarG, InterfaceC22215f.a.f39085k, bE2, 6);
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
            R3.b(InterfaceC22413h.a.f40796g, bE2, c20568f2A);
            R3.b(InterfaceC22413h.a.f40795f, bE2, o1S);
            Y41.p<InterfaceC22413h, Integer, kotlin.G0> pVar = InterfaceC22413h.a.f40799j;
            if (bE2.f37887P || !kotlin.jvm.internal.L.f(bE2.t(), Integer.valueOf(i13))) {
                AK.c.y(i13, bE2, i13, pVar);
            }
            R3.b(InterfaceC22413h.a.f40793d, bE2, vVarC);
            C20576h2 c20576h2 = C20576h2.f28641a;
            v.a aVar3 = androidx.compose.ui.v.f42878y1;
            float f12 = 44;
            float f13 = 12;
            C20632w.a(com.akita.compose.component.skeleton.b.c(C20588k2.f(c20576h2.a(aVar3, 1.0f, true), f12), androidx.compose.foundation.shape.o.a(f13), null, false, bE2, 0, 6), bE2, 0);
            C20632w.a(com.akita.compose.component.skeleton.b.c(C20588k2.f(c20576h2.a(aVar3, 1.0f, true), f12), androidx.compose.foundation.shape.o.a(f13), null, false, bE2, 0, 6), bE2, 0);
            bE2.X(true);
        }
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new P0(vVar, i12);
        }
    }

    @InterfaceC22132o
    @InterfaceC22181t
    public static final void n(androidx.compose.ui.v vVar, androidx.compose.runtime.A a12, int i12) {
        androidx.compose.runtime.B bE2 = a12.E(-1225827953);
        if ((((bE2.B(vVar) ? 4 : 2) | i12) & 11) == 2 && bE2.c()) {
            bE2.f();
        } else {
            C20585k c20585k = C20585k.f28659a;
            h.a aVar = androidx.compose.ui.unit.h.f42849c;
            c20585k.getClass();
            C20585k.j jVarG = C20585k.g(13);
            androidx.compose.ui.v vVarM = R1.m(vVar, 0.0f, 7, 0.0f, 5, 5);
            InterfaceC22215f.f39074a.getClass();
            androidx.compose.foundation.layout.I iA2 = androidx.compose.foundation.layout.H.a(jVarG, InterfaceC22215f.a.f39088n, bE2, 6);
            int i13 = bE2.f37888Q;
            O1 o1S = bE2.S();
            androidx.compose.ui.v vVarC = androidx.compose.ui.n.c(bE2, vVarM);
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
            v.a aVar3 = androidx.compose.ui.v.f42878y1;
            float f12 = 14;
            float f13 = 4;
            C20632w.a(com.akita.compose.component.skeleton.b.c(C20588k2.f(C20588k2.t(aVar3, 249), f12), androidx.compose.foundation.shape.o.a(f13), null, false, bE2, 6, 6), bE2, 0);
            C20632w.a(com.akita.compose.component.skeleton.b.c(C20588k2.f(C20588k2.t(aVar3, 187), f12), androidx.compose.foundation.shape.o.a(f13), null, false, bE2, 6, 6), bE2, 0);
            bE2.X(true);
        }
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new Q0(vVar, i12);
        }
    }
}
