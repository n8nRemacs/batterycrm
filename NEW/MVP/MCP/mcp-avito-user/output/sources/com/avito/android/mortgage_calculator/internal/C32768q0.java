package com.avito.android.mortgage_calculator.internal;

import G10.b;
import androidx.compose.foundation.C20806p1;
import androidx.compose.foundation.a2;
import androidx.compose.foundation.layout.C20563e2;
import androidx.compose.foundation.layout.C20568f2;
import androidx.compose.foundation.layout.C20576h2;
import androidx.compose.foundation.layout.C20585k;
import androidx.compose.foundation.layout.C20588k2;
import androidx.compose.foundation.layout.C20608p2;
import androidx.compose.foundation.layout.C20632w;
import androidx.compose.foundation.layout.C20646z1;
import androidx.compose.foundation.layout.IntrinsicSize;
import androidx.compose.foundation.layout.R1;
import androidx.compose.runtime.A;
import androidx.compose.runtime.C22039c2;
import androidx.compose.runtime.C22126m3;
import androidx.compose.runtime.C22187u0;
import androidx.compose.runtime.C22190v;
import androidx.compose.runtime.I3;
import androidx.compose.runtime.InterfaceC22078i;
import androidx.compose.runtime.InterfaceC22132o;
import androidx.compose.runtime.InterfaceC22181t;
import androidx.compose.runtime.InterfaceC22204y1;
import androidx.compose.runtime.O1;
import androidx.compose.runtime.R3;
import androidx.compose.ui.InterfaceC22215f;
import androidx.compose.ui.graphics.Y0;
import androidx.compose.ui.i;
import androidx.compose.ui.layout.C22392w0;
import androidx.compose.ui.layout.InterfaceC22365i0;
import androidx.compose.ui.layout.InterfaceC22374n;
import androidx.compose.ui.node.InterfaceC22413h;
import androidx.compose.ui.unit.h;
import androidx.compose.ui.v;
import com.avito.android.R;
import com.avito.android.mortgage_calculator.internal.items.offers.OfferPreviewRenderType;
import com.avito.android.remote.model.text.AttributedText;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import okhttp3.internal.http2.Http2;
import okhttp3.internal.ws.WebSocketProtocol;
import shark.AndroidResourceIdNames;
import z10.InterfaceC50353f;

/* compiled from: MortgageCalculatorOffers.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004¨\u0006\u0004²\u0006\u0010\u0010\u0001\u001a\u0004\u0018\u00010\u00008\n@\nX\u008a\u008e\u0002²\u0006\u0010\u0010\u0001\u001a\u0004\u0018\u00010\u00008\n@\nX\u008a\u008e\u0002²\u0006\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u00008\n@\nX\u008a\u008e\u0002²\u0006\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u00008\n@\nX\u008a\u008e\u0002"}, d2 = {"Ll0/j;", "offerBounds", "teaserGlobalBounds", "teaserWindowBounds", "_avito_mortgage-calculator_util"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.mortgage_calculator.internal.q0, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C32768q0 {

    /* compiled from: MortgageCalculatorOffers.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.mortgage_calculator.internal.q0$a */
    public /* synthetic */ class a {
        static {
            int[] iArr = new int[OfferPreviewRenderType.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                OfferPreviewRenderType offerPreviewRenderType = OfferPreviewRenderType.f204391b;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    @InterfaceC22132o
    @InterfaceC22181t
    public static final void a(androidx.compose.ui.v vVar, androidx.compose.runtime.A a12, int i12) {
        androidx.compose.runtime.B bE2 = a12.E(-858234364);
        if ((((bE2.B(vVar) ? 4 : 2) | i12) & 11) == 2 && bE2.c()) {
            bE2.f();
        } else {
            androidx.compose.ui.v vVarD = C20588k2.d(vVar, 1.0f);
            float f12 = 12;
            h.a aVar = androidx.compose.ui.unit.h.f42849c;
            androidx.compose.ui.v vVarA = androidx.compose.ui.draw.k.a(vVarD, androidx.compose.foundation.shape.o.a(f12));
            com.akita.compose.theme.re23.b.f63983a.getClass();
            float f13 = 20;
            androidx.compose.ui.v vVarL = R1.l(androidx.compose.foundation.A.b(vVarA, com.akita.compose.theme.re23.b.f63984b.f63973w1.c(bE2), Y0.f39346a), f13, f13, f13, 28);
            C20585k.f28659a.getClass();
            C20585k.l lVar = C20585k.f28662d;
            InterfaceC22215f.f39074a.getClass();
            i.a aVar2 = InterfaceC22215f.a.f39088n;
            androidx.compose.foundation.layout.I iA2 = androidx.compose.foundation.layout.H.a(lVar, aVar2, bE2, 0);
            int i13 = bE2.f37888Q;
            O1 o1S = bE2.S();
            androidx.compose.ui.v vVarC = androidx.compose.ui.n.c(bE2, vVarL);
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
            C20585k.h hVar = C20585k.f28666h;
            i.b bVar = InterfaceC22215f.a.f39086l;
            v.a aVar4 = androidx.compose.ui.v.f42878y1;
            androidx.compose.ui.v vVarD2 = C20588k2.d(aVar4, 1.0f);
            C20568f2 c20568f2A = C20563e2.a(hVar, bVar, bE2, 54);
            int i14 = bE2.f37888Q;
            O1 o1S2 = bE2.S();
            androidx.compose.ui.v vVarC2 = androidx.compose.ui.n.c(bE2, vVarD2);
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
            R3.b(pVar, bE2, c20568f2A);
            R3.b(pVar2, bE2, o1S2);
            if (bE2.f37887P || !kotlin.jvm.internal.L.f(bE2.t(), Integer.valueOf(i14))) {
                AK.c.y(i14, bE2, i14, pVar3);
            }
            R3.b(pVar4, bE2, vVarC2);
            C20576h2 c20576h2 = C20576h2.f28641a;
            float f14 = 4;
            float f15 = 134;
            C20632w.a(com.akita.compose.component.skeleton.b.c(C20588k2.f(C20588k2.t(R1.m(aVar4, 0.0f, 6, 0.0f, f14, 5), f15), 22), androidx.compose.foundation.shape.o.a(f14), null, false, bE2, 6, 6), bE2, 0);
            float f16 = 18;
            C20632w.a(com.akita.compose.component.skeleton.b.c(C20588k2.f(C20588k2.t(aVar4, f16), f16), androidx.compose.foundation.shape.o.f30153a, null, false, bE2, 6, 6), bE2, 0);
            bE2.X(true);
            C20585k.j jVarG = C20585k.g(f12);
            float f17 = f15;
            androidx.compose.ui.v vVarM = R1.m(C20588k2.t(aVar4, 152), 0.0f, f13, 0.0f, 0.0f, 13);
            androidx.compose.foundation.layout.I iA3 = androidx.compose.foundation.layout.H.a(jVarG, aVar2, bE2, 6);
            int i15 = bE2.f37888Q;
            O1 o1S3 = bE2.S();
            androidx.compose.ui.v vVarC3 = androidx.compose.ui.n.c(bE2, vVarM);
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
            R3.b(pVar, bE2, iA3);
            R3.b(pVar2, bE2, o1S3);
            if (bE2.f37887P || !kotlin.jvm.internal.L.f(bE2.t(), Integer.valueOf(i15))) {
                AK.c.y(i15, bE2, i15, pVar3);
            }
            R3.b(pVar4, bE2, vVarC3);
            bE2.C(-716724531);
            int i16 = 0;
            while (i16 < 2) {
                C20585k.f28659a.getClass();
                C20585k.h hVar2 = C20585k.f28666h;
                v.a aVar5 = androidx.compose.ui.v.f42878y1;
                androidx.compose.ui.v vVarD3 = C20588k2.d(aVar5, 1.0f);
                InterfaceC22215f.f39074a.getClass();
                C20568f2 c20568f2A2 = C20563e2.a(hVar2, InterfaceC22215f.a.f39085k, bE2, 6);
                int i17 = bE2.f37888Q;
                O1 o1S4 = bE2.S();
                androidx.compose.ui.v vVarC4 = androidx.compose.ui.n.c(bE2, vVarD3);
                InterfaceC22413h.f40789C1.getClass();
                Y41.a<InterfaceC22413h> aVar6 = InterfaceC22413h.a.f40791b;
                if (interfaceC22078i == null) {
                    C22190v.b();
                    throw null;
                }
                bE2.A();
                if (bE2.f37887P) {
                    bE2.b(aVar6);
                } else {
                    bE2.d();
                }
                R3.b(InterfaceC22413h.a.f40796g, bE2, c20568f2A2);
                R3.b(InterfaceC22413h.a.f40795f, bE2, o1S4);
                Y41.p<InterfaceC22413h, Integer, kotlin.G0> pVar5 = InterfaceC22413h.a.f40799j;
                if (bE2.f37887P || !kotlin.jvm.internal.L.f(bE2.t(), Integer.valueOf(i17))) {
                    AK.c.y(i17, bE2, i17, pVar5);
                }
                R3.b(InterfaceC22413h.a.f40793d, bE2, vVarC4);
                C20576h2 c20576h22 = C20576h2.f28641a;
                float f18 = 72;
                float f19 = 9;
                float f22 = 3;
                C20632w.a(com.akita.compose.component.skeleton.b.c(C20588k2.f(C20588k2.t(aVar5, f18), f19), androidx.compose.foundation.shape.o.a(f22), null, false, bE2, 6, 6), bE2, 0);
                C20632w.a(com.akita.compose.component.skeleton.b.c(C20588k2.f(C20588k2.t(aVar5, f18), f19), androidx.compose.foundation.shape.o.a(f22), null, false, bE2, 6, 6), bE2, 0);
                bE2.X(true);
                i16++;
                f17 = f17;
            }
            bE2.X(false);
            bE2.X(true);
            v.a aVar7 = androidx.compose.ui.v.f42878y1;
            float f23 = 10;
            C20632w.a(com.akita.compose.component.skeleton.b.c(C20588k2.f(C20588k2.t(R1.m(aVar7, 0.0f, 25, 0.0f, 0.0f, 13), f17), f23), androidx.compose.foundation.shape.o.a(3), null, false, bE2, 6, 6), bE2, 0);
            C20632w.a(com.akita.compose.component.skeleton.b.c(C20588k2.f(C20588k2.d(R1.m(aVar7, 0.0f, f23, 0.0f, 0.0f, 13), 1.0f), f16), androidx.compose.foundation.shape.o.a(f12), null, false, bE2, 6, 6), bE2, 0);
            C20632w.a(com.akita.compose.component.skeleton.b.c(C20588k2.f(C20588k2.d(R1.m(aVar7, 0.0f, 2, 0.0f, 0.0f, 13), 1.0f), f16), androidx.compose.foundation.shape.o.a(f12), null, false, bE2, 6, 6), bE2, 0);
            bE2.X(true);
        }
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new C32737m(vVar, i12);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:61:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0108  */
    @androidx.compose.runtime.InterfaceC22132o
    @androidx.compose.runtime.InterfaceC22181t
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(G10.b.a r16, androidx.compose.runtime.I3 r17, Y41.l r18, Y41.l r19, Y41.l r20, androidx.compose.ui.v r21, androidx.compose.runtime.A r22, int r23) {
        /*
            Method dump skipped, instructions count: 324
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.mortgage_calculator.internal.C32768q0.b(G10.b$a, androidx.compose.runtime.I3, Y41.l, Y41.l, Y41.l, androidx.compose.ui.v, androidx.compose.runtime.A, int):void");
    }

    @InterfaceC22132o
    @InterfaceC22181t
    public static final void c(ArrayList arrayList, float f12, androidx.compose.ui.v vVar, androidx.compose.runtime.A a12, int i12) {
        androidx.compose.runtime.B bE2 = a12.E(1769661185);
        InterfaceC22215f.f39074a.getClass();
        i.b bVar = InterfaceC22215f.a.f39086l;
        C20585k.f28659a.getClass();
        int i13 = 48;
        C20568f2 c20568f2A = C20563e2.a(C20585k.g(f12), bVar, bE2, 48);
        int i14 = bE2.f37888Q;
        O1 o1S = bE2.S();
        androidx.compose.ui.v vVarC = androidx.compose.ui.n.c(bE2, vVar);
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
        R3.b(InterfaceC22413h.a.f40796g, bE2, c20568f2A);
        R3.b(InterfaceC22413h.a.f40795f, bE2, o1S);
        Y41.p<InterfaceC22413h, Integer, kotlin.G0> pVar = InterfaceC22413h.a.f40799j;
        if (bE2.f37887P || !kotlin.jvm.internal.L.f(bE2.t(), Integer.valueOf(i14))) {
            AK.c.y(i14, bE2, i14, pVar);
        }
        R3.b(InterfaceC22413h.a.f40793d, bE2, vVarC);
        C20576h2 c20576h2 = C20576h2.f28641a;
        bE2.C(-377910496);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            B10.d dVar = (B10.d) it.next();
            InterfaceC22215f.f39074a.getClass();
            i.a aVar2 = InterfaceC22215f.a.f39088n;
            v.a aVar3 = androidx.compose.ui.v.f42878y1;
            androidx.compose.ui.v vVarC2 = C20646z1.c(aVar3, IntrinsicSize.f28334c);
            C20585k.f28659a.getClass();
            androidx.compose.foundation.layout.I iA2 = androidx.compose.foundation.layout.H.a(C20585k.f28662d, aVar2, bE2, i13);
            int i15 = bE2.f37888Q;
            O1 o1S2 = bE2.S();
            androidx.compose.ui.v vVarC3 = androidx.compose.ui.n.c(bE2, vVarC2);
            InterfaceC22413h.f40789C1.getClass();
            Y41.a<InterfaceC22413h> aVar4 = InterfaceC22413h.a.f40791b;
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
            R3.b(InterfaceC22413h.a.f40796g, bE2, iA2);
            R3.b(InterfaceC22413h.a.f40795f, bE2, o1S2);
            Y41.p<InterfaceC22413h, Integer, kotlin.G0> pVar2 = InterfaceC22413h.a.f40799j;
            if (bE2.f37887P || !kotlin.jvm.internal.L.f(bE2.t(), Integer.valueOf(i15))) {
                AK.c.y(i15, bE2, i15, pVar2);
            }
            R3.b(InterfaceC22413h.a.f40793d, bE2, vVarC3);
            androidx.compose.foundation.layout.K k12 = androidx.compose.foundation.layout.K.f28344a;
            String str = dVar.f798a;
            com.akita.compose.theme.re23.b.f63983a.getClass();
            com.akita.compose.foundation.r rVar = com.akita.compose.theme.re23.b.f63988f.f65245p;
            androidx.compose.ui.unit.y.f42874b.getClass();
            long j12 = androidx.compose.ui.unit.y.f42876d;
            com.akita.compose.foundation.ui.p.b(str, com.akita.compose.foundation.r.a(rVar, com.akita.compose.theme.re23.b.f63984b.f63918e0, 0L, 0L, null, j12, j12, 254), C20588k2.d(aVar3, 1.0f), false, 0L, null, 0, 0, false, null, bE2, 384, 1016);
            com.avito.android.lib.compose.design.component.attributedtext.a.b(dVar.f799b, C20588k2.d(aVar3, 1.0f), R.attr.textM20, null, null, 0, bE2, 56, 56);
            bE2.X(true);
            interfaceC22078i = interfaceC22078i;
            i13 = i13;
        }
        C22039c2 c22039c2N = com.avito.android.actions_sheet.a.n(bE2, false, true);
        if (c22039c2N != null) {
            c22039c2N.f38184d = new r(arrayList, f12, vVar, i12);
        }
    }

    @InterfaceC22132o
    @InterfaceC22181t
    public static final void d(float f12, @Y61.l androidx.compose.ui.v vVar, @Y61.l androidx.compose.runtime.A a12, int i12) {
        int i13;
        androidx.compose.runtime.B bE2 = a12.E(559788163);
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
            C20585k c20585k = C20585k.f28659a;
            h.a aVar = androidx.compose.ui.unit.h.f42849c;
            c20585k.getClass();
            C20585k.j jVarG = C20585k.g(16);
            InterfaceC22215f.f39074a.getClass();
            androidx.compose.foundation.layout.I iA2 = androidx.compose.foundation.layout.H.a(jVarG, InterfaceC22215f.a.f39088n, bE2, 6);
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
            R3.b(InterfaceC22413h.a.f40796g, bE2, iA2);
            R3.b(InterfaceC22413h.a.f40795f, bE2, o1S);
            Y41.p<InterfaceC22413h, Integer, kotlin.G0> pVar = InterfaceC22413h.a.f40799j;
            if (bE2.f37887P || !kotlin.jvm.internal.L.f(bE2.t(), Integer.valueOf(i14))) {
                AK.c.y(i14, bE2, i14, pVar);
            }
            R3.b(InterfaceC22413h.a.f40793d, bE2, vVarC);
            androidx.compose.foundation.layout.K k12 = androidx.compose.foundation.layout.K.f28344a;
            v.a aVar3 = androidx.compose.ui.v.f42878y1;
            C20632w.a(com.akita.compose.component.skeleton.b.c(C20588k2.f(C20588k2.t(R1.m(aVar3, f12, 6, 0.0f, 0.0f, 12), 134), 10), androidx.compose.foundation.shape.o.a(3), null, false, bE2, 0, 6), bE2, 0);
            y(f12, C20588k2.d(aVar3, 1.0f), bE2, (i13 & 14) | 48);
            bE2.X(true);
        }
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new C32770s(f12, vVar, i12);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:124:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:126:? A[RETURN, SYNTHETIC] */
    @androidx.compose.runtime.InterfaceC22132o
    @androidx.compose.runtime.InterfaceC22181t
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void e(@Y61.k G10.b r27, @Y61.k androidx.compose.runtime.I3 r28, @Y61.k Y41.a r29, @Y61.k Y41.a r30, @Y61.k Y41.l r31, @Y61.k Y41.l r32, @Y61.k Y41.l r33, @Y61.k Y41.l r34, @Y61.k Y41.l r35, @Y61.k Y41.a r36, @Y61.k Y41.l r37, @Y61.k Y41.a r38, float r39, @Y61.l androidx.compose.ui.v r40, @Y61.l androidx.compose.runtime.A r41, int r42, int r43) {
        /*
            Method dump skipped, instructions count: 544
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.mortgage_calculator.internal.C32768q0.e(G10.b, androidx.compose.runtime.I3, Y41.a, Y41.a, Y41.l, Y41.l, Y41.l, Y41.l, Y41.l, Y41.a, Y41.l, Y41.a, float, androidx.compose.ui.v, androidx.compose.runtime.A, int, int):void");
    }

    @InterfaceC22132o
    @InterfaceC22181t
    public static final void f(AttributedText attributedText, androidx.compose.ui.v vVar, androidx.compose.runtime.A a12, int i12) {
        androidx.compose.runtime.B bE2 = a12.E(286236288);
        InterfaceC22215f.f39074a.getClass();
        i.b bVar = InterfaceC22215f.a.f39086l;
        C20585k.f28659a.getClass();
        C20568f2 c20568f2A = C20563e2.a(C20585k.f28666h, bVar, bE2, 54);
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
        R3.b(InterfaceC22413h.a.f40796g, bE2, c20568f2A);
        R3.b(InterfaceC22413h.a.f40795f, bE2, o1S);
        Y41.p<InterfaceC22413h, Integer, kotlin.G0> pVar = InterfaceC22413h.a.f40799j;
        if (bE2.f37887P || !kotlin.jvm.internal.L.f(bE2.t(), Integer.valueOf(i13))) {
            AK.c.y(i13, bE2, i13, pVar);
        }
        R3.b(InterfaceC22413h.a.f40793d, bE2, vVarC);
        C20576h2 c20576h2 = C20576h2.f28641a;
        v.a aVar2 = androidx.compose.ui.v.f42878y1;
        com.avito.android.lib.compose.design.component.attributedtext.a.b(attributedText, c20576h2.a(aVar2, 1.0f, true), R.attr.textH40, null, null, 0, bE2, 8, 56);
        h.a aVar3 = androidx.compose.ui.unit.h.f42849c;
        C20608p2.a(bE2, C20588k2.t(aVar2, 8));
        com.akita.compose.theme.re23.b.f63983a.getClass();
        com.akita.compose.theme.re23.b.f63985c.getClass();
        C20806p1.a(u0.e.a(com.akita.compose.theme.re23.e.f64403Y, 0, bE2), u0.i.c(bE2, R.string.open_offer_content_description), R1.i(androidx.compose.foundation.A.b(C20588k2.o(aVar2, 20), com.akita.compose.theme.re23.b.f63984b.f63955q1.c(bE2), androidx.compose.foundation.shape.o.a(10)), 4), null, null, 0.0f, null, bE2, 8, 120);
        bE2.X(true);
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new C32774u(attributedText, vVar, i12);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC22132o
    @InterfaceC22181t
    public static final void g(InterfaceC50353f interfaceC50353f, I3 i32, Y41.a aVar, Y41.a aVar2, Y41.a aVar3, androidx.compose.ui.v vVar, androidx.compose.runtime.A a12, int i12) {
        int i13;
        androidx.compose.runtime.B bE2 = a12.E(-91914393);
        if ((i12 & 14) == 0) {
            i13 = (bE2.B(interfaceC50353f) ? 4 : 2) | i12;
        } else {
            i13 = i12;
        }
        if ((i12 & 112) == 0) {
            i13 |= bE2.B(i32) ? 32 : 16;
        }
        if ((i12 & 896) == 0) {
            i13 |= bE2.u(aVar) ? 256 : 128;
        }
        if ((i12 & 7168) == 0) {
            i13 |= bE2.u(aVar2) ? 2048 : 1024;
        }
        if ((i12 & 57344) == 0) {
            i13 |= bE2.u(aVar3) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192;
        }
        if ((458752 & i12) == 0) {
            i13 |= bE2.B(vVar) ? 131072 : AndroidResourceIdNames.RESOURCE_ID_TYPE_ITERATOR;
        }
        if ((374491 & i13) == 74898 && bE2.c()) {
            bE2.f();
        } else {
            bE2.C(-2009292618);
            Object objT = bE2.t();
            androidx.compose.runtime.A.f37866a.getClass();
            A.a.C1651a c1651a = A.a.f37868b;
            if (objT == c1651a) {
                objT = C22126m3.g(null);
                bE2.H(objT);
            }
            InterfaceC22204y1 interfaceC22204y1 = (InterfaceC22204y1) objT;
            bE2.X(false);
            long j12 = ((androidx.compose.ui.unit.u) i32.getF42167b()).f42872a;
            l0.j jVar = (l0.j) interfaceC22204y1.getF42167b();
            bE2.C(-2009290335);
            boolean zN2 = bE2.n(j12) | bE2.B(jVar);
            Object objT2 = bE2.t();
            if (zN2 || objT2 == c1651a) {
                l0.j jVar2 = (l0.j) interfaceC22204y1.getF42167b();
                objT2 = Boolean.valueOf(jVar2 == null ? false : z(((androidx.compose.ui.unit.u) i32.getF42167b()).f42872a, jVar2));
                bE2.H(objT2);
            }
            Boolean bool = (Boolean) objT2;
            boolean zBooleanValue = bool.booleanValue();
            bE2.X(false);
            bE2.C(-2009282873);
            boolean zJ2 = ((57344 & i13) == 16384) | bE2.j(zBooleanValue);
            Object objT3 = bE2.t();
            if (zJ2 || objT3 == c1651a) {
                objT3 = new C32775v(zBooleanValue, aVar3, null);
                bE2.H(objT3);
            }
            bE2.X(false);
            C22187u0.e(bool, aVar3, (Y41.p) objT3, bE2);
            if (interfaceC50353f instanceof InterfaceC50353f.d) {
                bE2.C(-2009279069);
                InterfaceC50353f.d dVar = (InterfaceC50353f.d) interfaceC50353f;
                bE2.C(-2009274553);
                Object objT4 = bE2.t();
                if (objT4 == c1651a) {
                    objT4 = new C32776w(interfaceC22204y1);
                    bE2.H(objT4);
                }
                bE2.X(false);
                m(dVar, aVar, C22392w0.a(vVar, (Y41.l) objT4), bE2, (i13 >> 3) & 112);
                bE2.X(false);
            } else if (interfaceC50353f instanceof InterfaceC50353f.c) {
                bE2.C(-2009269880);
                InterfaceC50353f.c cVar = (InterfaceC50353f.c) interfaceC50353f;
                bE2.C(-2009265209);
                Object objT5 = bE2.t();
                if (objT5 == c1651a) {
                    objT5 = new C32777x(interfaceC22204y1);
                    bE2.H(objT5);
                }
                bE2.X(false);
                j(cVar, aVar, C22392w0.a(vVar, (Y41.l) objT5), bE2, (i13 >> 3) & 112);
                bE2.X(false);
            } else if (interfaceC50353f instanceof InterfaceC50353f.b) {
                bE2.C(-2009260451);
                InterfaceC50353f.b bVar = (InterfaceC50353f.b) interfaceC50353f;
                bE2.C(-2009254137);
                Object objT6 = bE2.t();
                if (objT6 == c1651a) {
                    objT6 = new C32778y(interfaceC22204y1);
                    bE2.H(objT6);
                }
                bE2.X(false);
                h(bVar, aVar, aVar2, C22392w0.a(vVar, (Y41.l) objT6), bE2, (i13 >> 3) & 1008);
                bE2.X(false);
            } else {
                bE2.C(2137732596);
                bE2.X(false);
            }
        }
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new C32779z(interfaceC50353f, i32, aVar, aVar2, aVar3, vVar, i12);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x019d  */
    @androidx.compose.runtime.InterfaceC22132o
    @androidx.compose.runtime.InterfaceC22181t
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void h(z10.InterfaceC50353f.b r26, Y41.a r27, Y41.a r28, androidx.compose.ui.v r29, androidx.compose.runtime.A r30, int r31) {
        /*
            Method dump skipped, instructions count: 508
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.mortgage_calculator.internal.C32768q0.h(z10.f$b, Y41.a, Y41.a, androidx.compose.ui.v, androidx.compose.runtime.A, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01eb  */
    @androidx.compose.runtime.InterfaceC22132o
    @androidx.compose.runtime.InterfaceC22181t
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void i(z10.InterfaceC50353f.b r38, Y41.a r39, Y41.l r40, androidx.compose.ui.v r41, androidx.compose.runtime.A r42, int r43) {
        /*
            Method dump skipped, instructions count: 593
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.mortgage_calculator.internal.C32768q0.i(z10.f$b, Y41.a, Y41.l, androidx.compose.ui.v, androidx.compose.runtime.A, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x009e  */
    @androidx.compose.runtime.InterfaceC22132o
    @androidx.compose.runtime.InterfaceC22181t
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void j(z10.InterfaceC50353f.c r42, Y41.a r43, androidx.compose.ui.v r44, androidx.compose.runtime.A r45, int r46) {
        /*
            Method dump skipped, instructions count: 419
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.mortgage_calculator.internal.C32768q0.j(z10.f$c, Y41.a, androidx.compose.ui.v, androidx.compose.runtime.A, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x0099  */
    @androidx.compose.runtime.InterfaceC22132o
    @androidx.compose.runtime.InterfaceC22181t
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void k(z10.InterfaceC50353f.c r33, Y41.a r34, androidx.compose.ui.v r35, androidx.compose.runtime.A r36, int r37) {
        /*
            Method dump skipped, instructions count: 472
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.mortgage_calculator.internal.C32768q0.k(z10.f$c, Y41.a, androidx.compose.ui.v, androidx.compose.runtime.A, int):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC22132o
    @InterfaceC22181t
    public static final void l(InterfaceC50353f interfaceC50353f, I3 i32, Y41.a aVar, Y41.l lVar, Y41.a aVar2, androidx.compose.ui.v vVar, androidx.compose.runtime.A a12, int i12) {
        int i13;
        androidx.compose.runtime.B bE2 = a12.E(770273857);
        if ((i12 & 14) == 0) {
            i13 = (bE2.B(interfaceC50353f) ? 4 : 2) | i12;
        } else {
            i13 = i12;
        }
        if ((i12 & 112) == 0) {
            i13 |= bE2.B(i32) ? 32 : 16;
        }
        if ((i12 & 896) == 0) {
            i13 |= bE2.u(aVar) ? 256 : 128;
        }
        if ((i12 & 7168) == 0) {
            i13 |= bE2.u(lVar) ? 2048 : 1024;
        }
        if ((i12 & 57344) == 0) {
            i13 |= bE2.u(aVar2) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192;
        }
        if ((458752 & i12) == 0) {
            i13 |= bE2.B(vVar) ? 131072 : AndroidResourceIdNames.RESOURCE_ID_TYPE_ITERATOR;
        }
        if ((374491 & i13) == 74898 && bE2.c()) {
            bE2.f();
        } else {
            bE2.C(-1027041507);
            Object objT = bE2.t();
            androidx.compose.runtime.A.f37866a.getClass();
            A.a.C1651a c1651a = A.a.f37868b;
            if (objT == c1651a) {
                objT = C22126m3.g(null);
                bE2.H(objT);
            }
            InterfaceC22204y1 interfaceC22204y1 = (InterfaceC22204y1) objT;
            bE2.X(false);
            long j12 = ((androidx.compose.ui.unit.u) i32.getF42167b()).f42872a;
            l0.j jVar = (l0.j) interfaceC22204y1.getF42167b();
            bE2.C(-1027039224);
            boolean zN2 = bE2.n(j12) | bE2.B(jVar);
            Object objT2 = bE2.t();
            if (zN2 || objT2 == c1651a) {
                l0.j jVar2 = (l0.j) interfaceC22204y1.getF42167b();
                objT2 = Boolean.valueOf(jVar2 == null ? false : z(((androidx.compose.ui.unit.u) i32.getF42167b()).f42872a, jVar2));
                bE2.H(objT2);
            }
            Boolean bool = (Boolean) objT2;
            boolean zBooleanValue = bool.booleanValue();
            bE2.X(false);
            bE2.C(-1027031762);
            boolean zJ2 = ((57344 & i13) == 16384) | bE2.j(zBooleanValue);
            Object objT3 = bE2.t();
            if (zJ2 || objT3 == c1651a) {
                objT3 = new K(zBooleanValue, aVar2, null);
                bE2.H(objT3);
            }
            bE2.X(false);
            C22187u0.e(bool, aVar2, (Y41.p) objT3, bE2);
            if (interfaceC50353f instanceof InterfaceC50353f.d) {
                bE2.C(-1027027956);
                InterfaceC50353f.d dVar = (InterfaceC50353f.d) interfaceC50353f;
                bE2.C(-1027023378);
                Object objT4 = bE2.t();
                if (objT4 == c1651a) {
                    objT4 = new L(interfaceC22204y1);
                    bE2.H(objT4);
                }
                bE2.X(false);
                n(dVar, aVar, C22392w0.a(vVar, (Y41.l) objT4), bE2, (i13 >> 3) & 112);
                bE2.X(false);
            } else if (interfaceC50353f instanceof InterfaceC50353f.b) {
                bE2.C(-1027018623);
                InterfaceC50353f.b bVar = (InterfaceC50353f.b) interfaceC50353f;
                bE2.C(-1027012402);
                Object objT5 = bE2.t();
                if (objT5 == c1651a) {
                    objT5 = new M(interfaceC22204y1);
                    bE2.H(objT5);
                }
                bE2.X(false);
                i(bVar, aVar, lVar, C22392w0.a(vVar, (Y41.l) objT5), bE2, (i13 >> 3) & 1008);
                bE2.X(false);
            } else if (interfaceC50353f instanceof InterfaceC50353f.c) {
                bE2.C(-1027007727);
                InterfaceC50353f.c cVar = (InterfaceC50353f.c) interfaceC50353f;
                bE2.C(-1027002994);
                Object objT6 = bE2.t();
                if (objT6 == c1651a) {
                    objT6 = new N(interfaceC22204y1);
                    bE2.H(objT6);
                }
                bE2.X(false);
                k(cVar, aVar, C22392w0.a(vVar, (Y41.l) objT6), bE2, (i13 >> 3) & 112);
                bE2.X(false);
            } else {
                bE2.C(-1772220339);
                bE2.X(false);
            }
        }
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new O(interfaceC50353f, i32, aVar, lVar, aVar2, vVar, i12);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0228  */
    @androidx.compose.runtime.InterfaceC22132o
    @androidx.compose.runtime.InterfaceC22181t
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m(z10.InterfaceC50353f.d r29, Y41.a r30, androidx.compose.ui.v r31, androidx.compose.runtime.A r32, int r33) {
        /*
            Method dump skipped, instructions count: 579
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.mortgage_calculator.internal.C32768q0.m(z10.f$d, Y41.a, androidx.compose.ui.v, androidx.compose.runtime.A, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0334  */
    @androidx.compose.runtime.InterfaceC22132o
    @androidx.compose.runtime.InterfaceC22181t
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void n(z10.InterfaceC50353f.d r40, Y41.a r41, androidx.compose.ui.v r42, androidx.compose.runtime.A r43, int r44) {
        /*
            Method dump skipped, instructions count: 887
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.mortgage_calculator.internal.C32768q0.n(z10.f$d, Y41.a, androidx.compose.ui.v, androidx.compose.runtime.A, int):void");
    }

    @InterfaceC22132o
    @InterfaceC22181t
    public static final void o(AttributedText attributedText, androidx.compose.ui.v vVar, androidx.compose.runtime.A a12, int i12) {
        androidx.compose.runtime.B bE2 = a12.E(-1490989369);
        InterfaceC22215f.f39074a.getClass();
        i.b bVar = InterfaceC22215f.a.f39086l;
        C20585k.f28659a.getClass();
        C20568f2 c20568f2A = C20563e2.a(C20585k.f28666h, bVar, bE2, 54);
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
        R3.b(InterfaceC22413h.a.f40796g, bE2, c20568f2A);
        R3.b(InterfaceC22413h.a.f40795f, bE2, o1S);
        Y41.p<InterfaceC22413h, Integer, kotlin.G0> pVar = InterfaceC22413h.a.f40799j;
        if (bE2.f37887P || !kotlin.jvm.internal.L.f(bE2.t(), Integer.valueOf(i13))) {
            AK.c.y(i13, bE2, i13, pVar);
        }
        R3.b(InterfaceC22413h.a.f40793d, bE2, vVarC);
        C20576h2 c20576h2 = C20576h2.f28641a;
        com.avito.android.lib.compose.design.component.attributedtext.a.b(attributedText, null, R.attr.textH50, V.f204266l, null, 0, bE2, 3080, 50);
        v.a aVar2 = androidx.compose.ui.v.f42878y1;
        float f12 = 8;
        h.a aVar3 = androidx.compose.ui.unit.h.f42849c;
        C20608p2.a(bE2, c20576h2.a(C20588k2.v(f12, 0.0f, 2, aVar2), 1.0f, true));
        com.akita.compose.theme.re23.b.f63983a.getClass();
        com.akita.compose.theme.re23.b.f63985c.getClass();
        C20806p1.a(u0.e.a(com.akita.compose.theme.re23.e.f64403Y, 0, bE2), u0.i.c(bE2, R.string.open_offer_content_description), R1.i(androidx.compose.foundation.A.b(C20588k2.o(aVar2, 16), com.akita.compose.theme.re23.b.f63984b.f63955q1.c(bE2), androidx.compose.foundation.shape.o.a(f12)), 2), null, null, 0.0f, null, bE2, 8, 120);
        bE2.X(true);
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new W(attributedText, vVar, i12);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0112  */
    @androidx.compose.runtime.InterfaceC22132o
    @androidx.compose.runtime.InterfaceC22181t
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void p(z10.InterfaceC50351d.b r40, androidx.compose.runtime.I3 r41, Y41.l r42, Y41.a r43, androidx.compose.ui.v r44, androidx.compose.runtime.A r45, int r46) {
        /*
            Method dump skipped, instructions count: 939
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.mortgage_calculator.internal.C32768q0.p(z10.d$b, androidx.compose.runtime.I3, Y41.l, Y41.a, androidx.compose.ui.v, androidx.compose.runtime.A, int):void");
    }

    @InterfaceC22132o
    @InterfaceC22181t
    public static final void q(b.a aVar, I3 i32, Y41.a aVar2, Y41.l lVar, Y41.l lVar2, Y41.l lVar3, Y41.l lVar4, Y41.l lVar5, Y41.a aVar3, Y41.l lVar6, Y41.a aVar4, float f12, androidx.compose.ui.v vVar, androidx.compose.runtime.A a12, int i12, int i13) {
        int i14;
        int i15;
        boolean z12;
        int i16;
        androidx.compose.runtime.B b12;
        boolean z13;
        androidx.compose.runtime.B bE2 = a12.E(274482981);
        if ((i12 & 14) == 0) {
            i14 = (bE2.B(aVar) ? 4 : 2) | i12;
        } else {
            i14 = i12;
        }
        if ((i12 & 112) == 0) {
            i14 |= bE2.B(i32) ? 32 : 16;
        }
        if ((i12 & 896) == 0) {
            i14 |= bE2.u(aVar2) ? 256 : 128;
        }
        if ((i12 & 7168) == 0) {
            i14 |= bE2.u(lVar) ? 2048 : 1024;
        }
        if ((i12 & 57344) == 0) {
            i14 |= bE2.u(lVar2) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192;
        }
        if ((i12 & 458752) == 0) {
            i14 |= bE2.u(lVar3) ? 131072 : AndroidResourceIdNames.RESOURCE_ID_TYPE_ITERATOR;
        }
        if ((i12 & 3670016) == 0) {
            i14 |= bE2.u(lVar4) ? 1048576 : 524288;
        }
        if ((i12 & 29360128) == 0) {
            i14 |= bE2.u(lVar5) ? 8388608 : 4194304;
        }
        if ((i12 & 234881024) == 0) {
            i14 |= bE2.u(aVar3) ? 67108864 : 33554432;
        }
        if ((i12 & 1879048192) == 0) {
            i14 |= bE2.u(lVar6) ? 536870912 : 268435456;
        }
        if ((i13 & 14) == 0) {
            i15 = (bE2.u(aVar4) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        if ((i13 & 112) == 0) {
            i15 |= bE2.k(f12) ? 32 : 16;
        }
        if ((i13 & 896) == 0) {
            i15 |= bE2.B(vVar) ? 256 : 128;
        }
        int i17 = i15;
        if ((1533916891 & i14) == 306783378 && (i17 & 731) == 146 && bE2.c()) {
            bE2.f();
            b12 = bE2;
        } else {
            bE2.C(-914420091);
            G10.c cVar = aVar.f6187e;
            if (cVar.f6194d) {
                z12 = true;
                i16 = i17;
                C32735l.c(cVar, aVar2, lVar, lVar2, null, bE2, (i14 >> 3) & 8176);
            } else {
                z12 = true;
                i16 = i17;
            }
            bE2.X(false);
            C20585k c20585k = C20585k.f28659a;
            h.a aVar5 = androidx.compose.ui.unit.h.f42849c;
            c20585k.getClass();
            C20585k.j jVarG = C20585k.g(12);
            InterfaceC22215f.f39074a.getClass();
            androidx.compose.foundation.layout.I iA2 = androidx.compose.foundation.layout.H.a(jVarG, InterfaceC22215f.a.f39088n, bE2, 6);
            int i18 = bE2.f37888Q;
            O1 o1S = bE2.S();
            androidx.compose.ui.v vVarC = androidx.compose.ui.n.c(bE2, vVar);
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
            if (bE2.f37887P || !kotlin.jvm.internal.L.f(bE2.t(), Integer.valueOf(i18))) {
                AK.c.y(i18, bE2, i18, pVar);
            }
            R3.b(InterfaceC22413h.a.f40793d, bE2, vVarC);
            androidx.compose.foundation.layout.K k12 = androidx.compose.foundation.layout.K.f28344a;
            v.a aVar7 = androidx.compose.ui.v.f42878y1;
            t(aVar, R1.k(f12, 0.0f, 2, C20588k2.d(aVar7, 1.0f)), bE2, i14 & 14);
            int iOrdinal = aVar.f6186d.ordinal();
            if (iOrdinal == 0) {
                bE2.C(-2052559172);
                int i19 = i14 & WebSocketProtocol.PAYLOAD_SHORT;
                int i22 = i14 >> 9;
                int i23 = (i22 & 3670016) | i19 | (i22 & 896) | (i22 & 7168) | (i22 & 57344) | (i22 & 458752);
                int i24 = i16 << 21;
                x(aVar, i32, lVar3, lVar4, lVar5, aVar3, lVar6, aVar4, f12, null, bE2, i23 | (i24 & 29360128) | (i24 & 234881024));
                b12 = bE2;
                b12.X(false);
            } else if (iOrdinal != z12) {
                bE2.C(796116766);
                bE2.X(false);
                z13 = z12;
                b12 = bE2;
                b12.X(z13);
            } else {
                bE2.C(-2052541733);
                int i25 = i14 >> 9;
                b(aVar, i32, lVar3, lVar4, lVar6, R1.k(f12, 0.0f, 2, C20588k2.d(aVar7, 1.0f)), bE2, (i14 & WebSocketProtocol.PAYLOAD_SHORT) | (i25 & 896) | (i25 & 7168) | ((i14 >> 15) & 57344));
                bE2.X(false);
                b12 = bE2;
            }
            z13 = true;
            b12.X(z13);
        }
        C22039c2 c22039c2Z = b12.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new C32716b0(aVar, i32, aVar2, lVar, lVar2, lVar3, lVar4, lVar5, aVar3, lVar6, aVar4, f12, vVar, i12, i13);
        }
    }

    @InterfaceC22132o
    @InterfaceC22181t
    public static final void r(boolean z12, float f12, androidx.compose.ui.v vVar, androidx.compose.runtime.A a12, int i12) {
        int i13;
        androidx.compose.runtime.B bE2 = a12.E(704424940);
        if ((i12 & 14) == 0) {
            i13 = (bE2.j(z12) ? 4 : 2) | i12;
        } else {
            i13 = i12;
        }
        if ((i12 & 112) == 0) {
            i13 |= bE2.k(f12) ? 32 : 16;
        }
        if ((i12 & 896) == 0) {
            i13 |= bE2.B(vVar) ? 256 : 128;
        }
        int i14 = i13;
        if ((i14 & 731) == 146 && bE2.c()) {
            bE2.f();
        } else {
            C20585k c20585k = C20585k.f28659a;
            h.a aVar = androidx.compose.ui.unit.h.f42849c;
            c20585k.getClass();
            C20585k.j jVarG = C20585k.g(12);
            InterfaceC22215f.f39074a.getClass();
            androidx.compose.foundation.layout.I iA2 = androidx.compose.foundation.layout.H.a(jVarG, InterfaceC22215f.a.f39088n, bE2, 6);
            int i15 = bE2.f37888Q;
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
            if (bE2.f37887P || !kotlin.jvm.internal.L.f(bE2.t(), Integer.valueOf(i15))) {
                AK.c.y(i15, bE2, i15, pVar3);
            }
            Y41.p<InterfaceC22413h, androidx.compose.ui.v, kotlin.G0> pVar4 = InterfaceC22413h.a.f40793d;
            R3.b(pVar4, bE2, vVarC);
            androidx.compose.foundation.layout.K k12 = androidx.compose.foundation.layout.K.f28344a;
            i.b bVar = InterfaceC22215f.a.f39086l;
            v.a aVar3 = androidx.compose.ui.v.f42878y1;
            androidx.compose.ui.v vVarK = R1.k(f12, 0.0f, 2, C20588k2.d(aVar3, 1.0f));
            C20568f2 c20568f2A = C20563e2.a(C20585k.f28660b, bVar, bE2, 48);
            int i16 = bE2.f37888Q;
            O1 o1S2 = bE2.S();
            androidx.compose.ui.v vVarC2 = androidx.compose.ui.n.c(bE2, vVarK);
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
            if (bE2.f37887P || !kotlin.jvm.internal.L.f(bE2.t(), Integer.valueOf(i16))) {
                AK.c.y(i16, bE2, i16, pVar3);
            }
            R3.b(pVar4, bE2, vVarC2);
            C20576h2 c20576h2 = C20576h2.f28641a;
            String strC = u0.i.c(bE2, R.string.offers_reloading);
            com.akita.compose.theme.re23.b.f63983a.getClass();
            com.akita.compose.foundation.ui.p.b(strC, com.akita.compose.theme.re23.b.f63988f.f65239j, null, false, 0L, null, 0, 0, false, null, bE2, 0, 1020);
            C20608p2.a(bE2, c20576h2.a(aVar3, 1.0f, true));
            com.akita.compose.component.spinner.b.b(C20588k2.o(aVar3, 24), null, 0.0f, 0, null, bE2, 6, 30);
            bE2.X(true);
            if (z12) {
                bE2.C(1837310081);
                y(f12, C20588k2.d(aVar3, 1.0f), bE2, ((i14 >> 3) & 14) | 48);
                bE2.X(false);
            } else {
                bE2.C(1837473606);
                a(R1.k(f12, 0.0f, 2, C20588k2.d(aVar3, 1.0f)), bE2, 0);
                bE2.X(false);
            }
            bE2.X(true);
        }
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new C32718c0(z12, f12, vVar, i12);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x01fe  */
    @androidx.compose.runtime.InterfaceC22132o
    @androidx.compose.runtime.InterfaceC22181t
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void s(int r43, Y41.a r44, androidx.compose.runtime.A r45, androidx.compose.ui.v r46) {
        /*
            Method dump skipped, instructions count: 601
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.mortgage_calculator.internal.C32768q0.s(int, Y41.a, androidx.compose.runtime.A, androidx.compose.ui.v):void");
    }

    @InterfaceC22132o
    @InterfaceC22181t
    public static final void t(b.a aVar, androidx.compose.ui.v vVar, androidx.compose.runtime.A a12, int i12) {
        int i13;
        androidx.compose.runtime.B bE2 = a12.E(-760129268);
        if ((i12 & 14) == 0) {
            i13 = (bE2.B(aVar) ? 4 : 2) | i12;
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
            h.a aVar2 = androidx.compose.ui.unit.h.f42849c;
            c20585k.getClass();
            C20585k.j jVarG = C20585k.g(16);
            InterfaceC22215f.f39074a.getClass();
            C20568f2 c20568f2A = C20563e2.a(jVarG, InterfaceC22215f.a.f39085k, bE2, 54);
            int i14 = bE2.f37888Q;
            O1 o1S = bE2.S();
            androidx.compose.ui.v vVarC = androidx.compose.ui.n.c(bE2, vVar);
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
            Y41.p<InterfaceC22413h, Integer, kotlin.G0> pVar = InterfaceC22413h.a.f40799j;
            if (bE2.f37887P || !kotlin.jvm.internal.L.f(bE2.t(), Integer.valueOf(i14))) {
                AK.c.y(i14, bE2, i14, pVar);
            }
            R3.b(InterfaceC22413h.a.f40793d, bE2, vVarC);
            C20576h2 c20576h2 = C20576h2.f28641a;
            bE2.C(-173798332);
            AttributedText attributedText = aVar.f6183a;
            if (attributedText != null) {
                com.avito.android.lib.compose.design.component.attributedtext.a.b(attributedText, c20576h2.a(androidx.compose.ui.v.f42878y1, 1.0f, true), R.attr.textH5, null, null, 0, bE2, 8, 56);
            }
            bE2.X(false);
            bE2.C(-173790541);
            String str = aVar.f6184b;
            if (str != null) {
                InterfaceC22374n.f40491a.getClass();
                coil.compose.v.b(str, u0.i.c(bE2, R.string.bank_icons_content_description), C20588k2.v(0.0f, 150, 1, C20588k2.f(androidx.compose.ui.v.f42878y1, 24)), null, InterfaceC22374n.a.f40495d, null, bE2, 1573248, 4024);
            }
            bE2.X(false);
            bE2.X(true);
        }
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new C32724f0(aVar, vVar, i12);
        }
    }

    @InterfaceC22132o
    @InterfaceC22181t
    public static final void u(float f12, androidx.compose.ui.v vVar, androidx.compose.runtime.A a12, int i12) {
        int i13;
        androidx.compose.runtime.B bE2 = a12.E(-706889376);
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
            d(f12, vVar, bE2, i13 & WebSocketProtocol.PAYLOAD_SHORT);
        }
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new C32726g0(f12, vVar, i12);
        }
    }

    @InterfaceC22132o
    @InterfaceC22181t
    public static final void v(B10.e eVar, androidx.compose.ui.v vVar, androidx.compose.runtime.A a12, int i12) {
        androidx.compose.runtime.B bE2 = a12.E(829890058);
        if ((((bE2.B(eVar) ? 4 : 2) | i12) & 91) == 18 && bE2.c()) {
            bE2.f();
        } else {
            androidx.compose.ui.v vVarC = C20646z1.c(vVar, IntrinsicSize.f28334c);
            C20585k.f28659a.getClass();
            C20585k.l lVar = C20585k.f28662d;
            InterfaceC22215f.f39074a.getClass();
            androidx.compose.foundation.layout.I iA2 = androidx.compose.foundation.layout.H.a(lVar, InterfaceC22215f.a.f39088n, bE2, 0);
            int i13 = bE2.f37888Q;
            O1 o1S = bE2.S();
            androidx.compose.ui.v vVarC2 = androidx.compose.ui.n.c(bE2, vVarC);
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
            R3.b(InterfaceC22413h.a.f40793d, bE2, vVarC2);
            androidx.compose.foundation.layout.K k12 = androidx.compose.foundation.layout.K.f28344a;
            com.akita.compose.theme.re23.b.f63983a.getClass();
            com.akita.compose.theme.re23.i iVar = com.akita.compose.theme.re23.b.f63988f;
            com.akita.compose.foundation.r rVar = iVar.f65245p;
            androidx.compose.ui.unit.y.f42874b.getClass();
            long j12 = androidx.compose.ui.unit.y.f42876d;
            com.akita.compose.foundation.r rVarA = com.akita.compose.foundation.r.a(rVar, com.akita.compose.theme.re23.b.f63984b.f63918e0, 0L, 0L, null, j12, j12, 254);
            v.a aVar2 = androidx.compose.ui.v.f42878y1;
            h.a aVar3 = androidx.compose.ui.unit.h.f42849c;
            com.akita.compose.foundation.ui.p.b(eVar.f800a, rVarA, C20588k2.d(R1.m(aVar2, 0.0f, 8, 0.0f, 0.0f, 13), 1.0f), false, 0L, null, 0, 0, false, null, bE2, 384, 1016);
            com.akita.compose.foundation.ui.p.b(eVar.f801b, com.akita.compose.foundation.r.a(iVar.f65234e, null, 0L, 0L, null, j12, j12, 255), C20588k2.d(aVar2, 1.0f), false, 0L, null, 0, 0, false, null, bE2, 384, 1016);
            bE2.X(true);
        }
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new C32728h0(eVar, vVar, i12);
        }
    }

    @InterfaceC22132o
    @InterfaceC22181t
    public static final void w(androidx.compose.ui.v vVar, androidx.compose.runtime.A a12, int i12) {
        androidx.compose.ui.v vVar2;
        androidx.compose.runtime.B bE2 = a12.E(425024413);
        if (((i12 | 6) & 11) == 2 && bE2.c()) {
            bE2.f();
            vVar2 = vVar;
        } else {
            vVar2 = androidx.compose.ui.v.f42878y1;
            h.a aVar = androidx.compose.ui.unit.h.f42849c;
            androidx.compose.ui.v vVarA = androidx.compose.ui.draw.k.a(C20588k2.t(vVar2, 248), androidx.compose.foundation.shape.o.a(24));
            com.akita.compose.theme.re23.b.f63983a.getClass();
            float f12 = 20;
            androidx.compose.ui.v vVarL = R1.l(androidx.compose.foundation.A.b(vVarA, com.akita.compose.theme.re23.b.f63984b.f63973w1.c(bE2), Y0.f39346a), f12, 21, f12, 30);
            C20585k.f28659a.getClass();
            C20585k.l lVar = C20585k.f28662d;
            InterfaceC22215f.f39074a.getClass();
            i.a aVar2 = InterfaceC22215f.a.f39088n;
            androidx.compose.foundation.layout.I iA2 = androidx.compose.foundation.layout.H.a(lVar, aVar2, bE2, 0);
            int i13 = bE2.f37888Q;
            O1 o1S = bE2.S();
            androidx.compose.ui.v vVarC = androidx.compose.ui.n.c(bE2, vVarL);
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
            C20585k.h hVar = C20585k.f28666h;
            i.b bVar = InterfaceC22215f.a.f39086l;
            androidx.compose.ui.v vVarD = C20588k2.d(vVar2, 1.0f);
            C20568f2 c20568f2A = C20563e2.a(hVar, bVar, bE2, 54);
            int i14 = bE2.f37888Q;
            O1 o1S2 = bE2.S();
            androidx.compose.ui.v vVarC2 = androidx.compose.ui.n.c(bE2, vVarD);
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
            R3.b(pVar, bE2, c20568f2A);
            R3.b(pVar2, bE2, o1S2);
            if (bE2.f37887P || !kotlin.jvm.internal.L.f(bE2.t(), Integer.valueOf(i14))) {
                AK.c.y(i14, bE2, i14, pVar3);
            }
            R3.b(pVar4, bE2, vVarC2);
            C20576h2 c20576h2 = C20576h2.f28641a;
            float f13 = 4;
            float f14 = 134;
            float f15 = 10;
            float f16 = 3;
            C20632w.a(com.akita.compose.component.skeleton.b.c(C20588k2.f(C20588k2.t(R1.m(vVar2, 0.0f, 6, 0.0f, f13, 5), f14), f15), androidx.compose.foundation.shape.o.a(f16), null, false, bE2, 6, 6), bE2, 0);
            float f17 = 18;
            C20632w.a(com.akita.compose.component.skeleton.b.c(C20588k2.f(C20588k2.t(vVar2, f17), f17), androidx.compose.foundation.shape.o.f30153a, null, false, bE2, 6, 6), bE2, 0);
            bE2.X(true);
            float f18 = 14;
            C20632w.a(com.akita.compose.component.skeleton.b.c(C20588k2.f(C20588k2.t(R1.m(vVar2, 0.0f, f18, 0.0f, f13, 5), f14), f15), androidx.compose.foundation.shape.o.a(f16), null, false, bE2, 6, 6), bE2, 0);
            C20632w.a(com.akita.compose.component.skeleton.b.c(C20588k2.f(C20588k2.t(R1.m(vVar2, 0.0f, 7, 0.0f, f13, 5), f14), f18), androidx.compose.foundation.shape.o.a(f13), null, false, bE2, 6, 6), bE2, 0);
            float f19 = 12;
            C20585k.j jVarG = C20585k.g(f19);
            androidx.compose.ui.v vVarC3 = C20646z1.c(vVar2, IntrinsicSize.f28333b);
            androidx.compose.foundation.layout.I iA3 = androidx.compose.foundation.layout.H.a(jVarG, aVar2, bE2, 6);
            int i15 = bE2.f37888Q;
            O1 o1S3 = bE2.S();
            androidx.compose.ui.v vVarC4 = androidx.compose.ui.n.c(bE2, vVarC3);
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
            R3.b(pVar, bE2, iA3);
            R3.b(pVar2, bE2, o1S3);
            if (bE2.f37887P || !kotlin.jvm.internal.L.f(bE2.t(), Integer.valueOf(i15))) {
                AK.c.y(i15, bE2, i15, pVar3);
            }
            R3.b(pVar4, bE2, vVarC4);
            C20632w.a(com.akita.compose.component.skeleton.b.c(C20588k2.f(C20588k2.t(R1.m(vVar2, 0.0f, 15, 0.0f, 0.0f, 13), 182), f17), androidx.compose.foundation.shape.o.a(f19), null, false, bE2, 6, 6), bE2, 0);
            bE2.C(-1151690458);
            for (int i16 = 0; i16 < 2; i16++) {
                C20585k.f28659a.getClass();
                C20585k.h hVar2 = C20585k.f28666h;
                v.a aVar4 = androidx.compose.ui.v.f42878y1;
                androidx.compose.ui.v vVarD2 = C20588k2.d(aVar4, 1.0f);
                InterfaceC22215f.f39074a.getClass();
                C20568f2 c20568f2A2 = C20563e2.a(hVar2, InterfaceC22215f.a.f39085k, bE2, 6);
                int i17 = bE2.f37888Q;
                O1 o1S4 = bE2.S();
                androidx.compose.ui.v vVarC5 = androidx.compose.ui.n.c(bE2, vVarD2);
                InterfaceC22413h.f40789C1.getClass();
                Y41.a<InterfaceC22413h> aVar5 = InterfaceC22413h.a.f40791b;
                if (interfaceC22078i == null) {
                    C22190v.b();
                    throw null;
                }
                bE2.A();
                if (bE2.f37887P) {
                    bE2.b(aVar5);
                } else {
                    bE2.d();
                }
                R3.b(InterfaceC22413h.a.f40796g, bE2, c20568f2A2);
                R3.b(InterfaceC22413h.a.f40795f, bE2, o1S4);
                Y41.p<InterfaceC22413h, Integer, kotlin.G0> pVar5 = InterfaceC22413h.a.f40799j;
                if (bE2.f37887P || !kotlin.jvm.internal.L.f(bE2.t(), Integer.valueOf(i17))) {
                    AK.c.y(i17, bE2, i17, pVar5);
                }
                R3.b(InterfaceC22413h.a.f40793d, bE2, vVarC5);
                C20576h2 c20576h22 = C20576h2.f28641a;
                float f22 = 72;
                float f23 = 9;
                C20632w.a(com.akita.compose.component.skeleton.b.c(C20588k2.f(C20588k2.t(aVar4, f22), f23), androidx.compose.foundation.shape.o.a(f16), null, false, bE2, 6, 6), bE2, 0);
                C20632w.a(com.akita.compose.component.skeleton.b.c(C20588k2.f(C20588k2.t(aVar4, f22), f23), androidx.compose.foundation.shape.o.a(f16), null, false, bE2, 6, 6), bE2, 0);
                bE2.X(true);
            }
            androidx.compose.foundation.H.A(bE2, false, true, true);
        }
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new C32730i0(vVar2, i12);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0104  */
    @androidx.compose.runtime.InterfaceC22132o
    @androidx.compose.runtime.InterfaceC22181t
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void x(G10.b.a r22, androidx.compose.runtime.I3 r23, Y41.l r24, Y41.l r25, Y41.l r26, Y41.a r27, Y41.l r28, Y41.a r29, float r30, androidx.compose.ui.v r31, androidx.compose.runtime.A r32, int r33) {
        /*
            Method dump skipped, instructions count: 766
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.mortgage_calculator.internal.C32768q0.x(G10.b$a, androidx.compose.runtime.I3, Y41.l, Y41.l, Y41.l, Y41.a, Y41.l, Y41.a, float, androidx.compose.ui.v, androidx.compose.runtime.A, int):void");
    }

    @InterfaceC22132o
    @InterfaceC22181t
    public static final void y(float f12, androidx.compose.ui.v vVar, androidx.compose.runtime.A a12, int i12) {
        androidx.compose.runtime.B bE2 = a12.E(117896544);
        int i13 = (i12 & 14) == 0 ? (bE2.k(f12) ? 4 : 2) | i12 : i12;
        if ((i12 & 112) == 0) {
            i13 |= bE2.B(vVar) ? 32 : 16;
        }
        if ((i13 & 91) == 18 && bE2.c()) {
            bE2.f();
        } else {
            C20585k c20585k = C20585k.f28659a;
            h.a aVar = androidx.compose.ui.unit.h.f42849c;
            c20585k.getClass();
            C20585k.j jVarG = C20585k.g(6);
            androidx.compose.ui.v vVarK = R1.k(f12, 0.0f, 2, a2.b(vVar, a2.a(bE2), false, true));
            InterfaceC22215f.f39074a.getClass();
            C20568f2 c20568f2A = C20563e2.a(jVarG, InterfaceC22215f.a.f39085k, bE2, 6);
            int i14 = bE2.f37888Q;
            O1 o1S = bE2.S();
            androidx.compose.ui.v vVarC = androidx.compose.ui.n.c(bE2, vVarK);
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
            bE2.C(-190852989);
            for (int i15 = 0; i15 < 3; i15++) {
                w(null, bE2, 0);
            }
            bE2.X(false);
            bE2.X(true);
        }
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new C32766p0(f12, vVar, i12);
        }
    }

    public static final boolean z(long j12, l0.j jVar) {
        if (jVar.f413391b > 0.0f) {
            if (jVar.f413393d < ((int) (4294967295L & j12)) && jVar.f413390a > 0.0f) {
                if (jVar.f413392c < ((int) (j12 >> 32))) {
                    return true;
                }
            }
        }
        return false;
    }
}
