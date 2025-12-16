package com.avito.android.early_access.mvi;

import Mx.InterfaceC14538a;
import androidx.compose.foundation.layout.C20585k;
import androidx.compose.foundation.layout.C20632w;
import androidx.compose.foundation.layout.C20644z;
import androidx.compose.foundation.layout.R1;
import androidx.compose.foundation.lazy.C20650b;
import androidx.compose.runtime.C22039c2;
import androidx.compose.runtime.C22066f2;
import androidx.compose.runtime.C22190v;
import androidx.compose.runtime.InterfaceC22078i;
import androidx.compose.runtime.InterfaceC22132o;
import androidx.compose.runtime.InterfaceC22181t;
import androidx.compose.runtime.O1;
import androidx.compose.runtime.R3;
import androidx.compose.ui.InterfaceC22215f;
import androidx.compose.ui.graphics.Y0;
import androidx.compose.ui.layout.InterfaceC22365i0;
import androidx.compose.ui.node.InterfaceC22413h;
import androidx.compose.ui.unit.h;
import androidx.compose.ui.v;
import com.adjust.sdk.network.ErrorCodes;
import com.avito.android.R;
import com.avito.android.early_access.mvi.entity.EarlyAccessState;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: EarlyAccessScreen.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_early-access_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class A {

    /* compiled from: EarlyAccessScreen.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a extends kotlin.jvm.internal.N implements Y41.p<androidx.compose.runtime.A, Integer, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ EarlyAccessState f145394l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ kotlin.jvm.internal.N f145395m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ androidx.compose.ui.v f145396n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ int f145397o;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ int f145398p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(EarlyAccessState earlyAccessState, Y41.l<? super InterfaceC14538a, G0> lVar, androidx.compose.ui.v vVar, int i12, int i13) {
            super(2);
            this.f145394l = earlyAccessState;
            this.f145395m = (kotlin.jvm.internal.N) lVar;
            this.f145396n = vVar;
            this.f145397o = i12;
            this.f145398p = i13;
        }

        /* JADX WARN: Type inference failed for: r1v0, types: [Y41.l, kotlin.jvm.internal.N] */
        @Override // Y41.p
        public final G0 invoke(androidx.compose.runtime.A a12, Integer num) {
            num.intValue();
            int iA2 = C22066f2.a(this.f145397o | 1);
            ?? r12 = this.f145395m;
            EarlyAccessState earlyAccessState = this.f145394l;
            A.a(earlyAccessState, r12, this.f145396n, a12, iA2, this.f145398p);
            return G0.f406611a;
        }
    }

    @InterfaceC22132o
    @InterfaceC22181t
    public static final void a(@Y61.k EarlyAccessState earlyAccessState, @Y61.k Y41.l<? super InterfaceC14538a, G0> lVar, @Y61.l androidx.compose.ui.v vVar, @Y61.l androidx.compose.runtime.A a12, int i12, int i13) {
        int i14;
        androidx.compose.ui.v vVar2;
        int i15;
        boolean z12;
        boolean z13;
        androidx.compose.runtime.B bE2 = a12.E(-2019502897);
        if ((i12 & 14) == 0) {
            i14 = i12 | (bE2.B(earlyAccessState) ? 4 : 2);
        } else {
            i14 = i12;
        }
        if ((i12 & 112) == 0) {
            i14 |= bE2.u(lVar) ? 32 : 16;
        }
        int i16 = i13 & 4;
        if (i16 != 0) {
            i15 = i14 | 384;
            vVar2 = vVar;
        } else {
            vVar2 = vVar;
            i15 = i14 | (bE2.B(vVar2) ? 256 : 128);
        }
        if ((i15 & 731) == 146 && bE2.c()) {
            bE2.f();
        } else {
            androidx.compose.ui.v vVar3 = i16 != 0 ? androidx.compose.ui.v.f42878y1 : vVar2;
            if ((earlyAccessState instanceof EarlyAccessState.Content ? (EarlyAccessState.Content) earlyAccessState : null) != null) {
                InterfaceC22215f.f39074a.getClass();
                InterfaceC22365i0 interfaceC22365i0D = C20632w.d(InterfaceC22215f.a.f39076b, false);
                int i17 = bE2.f37888Q;
                O1 o1S = bE2.S();
                androidx.compose.ui.v vVarC = androidx.compose.ui.n.c(bE2, vVar3);
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
                R3.b(pVar, bE2, interfaceC22365i0D);
                Y41.p<InterfaceC22413h, androidx.compose.runtime.U, G0> pVar2 = InterfaceC22413h.a.f40795f;
                R3.b(pVar2, bE2, o1S);
                Y41.p<InterfaceC22413h, Integer, G0> pVar3 = InterfaceC22413h.a.f40799j;
                if (bE2.f37887P || !kotlin.jvm.internal.L.f(bE2.t(), Integer.valueOf(i17))) {
                    AK.c.y(i17, bE2, i17, pVar3);
                }
                Y41.p<InterfaceC22413h, androidx.compose.ui.v, G0> pVar4 = InterfaceC22413h.a.f40793d;
                R3.b(pVar4, bE2, vVarC);
                C20644z c20644z = C20644z.f28804a;
                EarlyAccessState.Content content = (EarlyAccessState.Content) earlyAccessState;
                b(content, lVar, bE2, (i15 & 112) | 8);
                bE2.C(-1436261434);
                if (content.f145479i) {
                    androidx.compose.ui.v vVarB = c20644z.b(androidx.compose.ui.v.f42878y1);
                    com.akita.compose.theme.re23.b.f63983a.getClass();
                    com.akita.compose.theme.re23.semantic.b bVar = com.akita.compose.theme.re23.b.f63987e;
                    bVar.getClass();
                    W2.q qVar = com.akita.compose.theme.re23.semantic.b.f65954b;
                    qVar.c().getClass();
                    androidx.compose.ui.v vVarB2 = androidx.compose.foundation.A.b(vVarB, X2.b.f18125d.c(bE2), Y0.f39346a);
                    C20585k.f28659a.getClass();
                    androidx.compose.foundation.layout.I iA2 = androidx.compose.foundation.layout.H.a(C20585k.f28664f, InterfaceC22215f.a.f39089o, bE2, 54);
                    int i18 = bE2.f37888Q;
                    O1 o1S2 = bE2.S();
                    androidx.compose.ui.v vVarC2 = androidx.compose.ui.n.c(bE2, vVarB2);
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
                    R3.b(pVar, bE2, iA2);
                    R3.b(pVar2, bE2, o1S2);
                    if (bE2.f37887P || !kotlin.jvm.internal.L.f(bE2.t(), Integer.valueOf(i18))) {
                        AK.c.y(i18, bE2, i18, pVar3);
                    }
                    R3.b(pVar4, bE2, vVarC2);
                    androidx.compose.foundation.layout.K k12 = androidx.compose.foundation.layout.K.f28344a;
                    com.akita.compose.component.spinner.b.a(com.akita.compose.theme.re23.b.r(bE2).getF66694c(), null, bE2, 0, 2);
                    com.akita.compose.foundation.ui.g.a(16, null, bE2, 6);
                    String strC = u0.i.c(bE2, R.string.making_payment);
                    com.akita.compose.foundation.r rVar = com.akita.compose.theme.re23.b.f63988f.f65240k;
                    bVar.getClass();
                    qVar.getText().getClass();
                    com.akita.compose.foundation.ui.p.b(strC, rVar, null, false, X2.h.f18556d.c(bE2), null, 0, 0, false, null, bE2, 0, ErrorCodes.PROTOCOL_EXCEPTION);
                    z12 = true;
                    bE2.X(true);
                    z13 = false;
                } else {
                    z12 = true;
                    z13 = false;
                }
                bE2.X(z13);
                bE2.X(z12);
            }
            vVar2 = vVar3;
        }
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new a(earlyAccessState, lVar, vVar2, i12, i13);
        }
    }

    @InterfaceC22132o
    @InterfaceC22181t
    public static final void b(@Y61.k EarlyAccessState.Content content, @Y61.k Y41.l lVar, @Y61.l androidx.compose.runtime.A a12, int i12) {
        androidx.compose.runtime.B bE2 = a12.E(1634177271);
        v.a aVar = androidx.compose.ui.v.f42878y1;
        C20585k.f28659a.getClass();
        C20585k.l lVar2 = C20585k.f28662d;
        InterfaceC22215f.f39074a.getClass();
        androidx.compose.foundation.layout.I iA2 = androidx.compose.foundation.layout.H.a(lVar2, InterfaceC22215f.a.f39088n, bE2, 0);
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
        Y41.p<InterfaceC22413h, Integer, G0> pVar = InterfaceC22413h.a.f40799j;
        if (bE2.f37887P || !kotlin.jvm.internal.L.f(bE2.t(), Integer.valueOf(i13))) {
            AK.c.y(i13, bE2, i13, pVar);
        }
        R3.b(InterfaceC22413h.a.f40793d, bE2, vVarC);
        androidx.compose.foundation.layout.K k12 = androidx.compose.foundation.layout.K.f28344a;
        h.a aVar3 = androidx.compose.ui.unit.h.f42849c;
        C20650b.a(R1.m(aVar, 0.0f, 6, 0.0f, 20, 5), null, null, false, null, null, null, false, null, new K(content, lVar), bE2, 0, 510);
        c(content, lVar, bE2, (i12 & 112) | 8);
        bE2.X(true);
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new L(content, lVar, aVar, i12);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x01db  */
    @androidx.compose.runtime.InterfaceC22132o
    @androidx.compose.runtime.InterfaceC22181t
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void c(com.avito.android.early_access.mvi.entity.EarlyAccessState.Content r48, Y41.l r49, androidx.compose.runtime.A r50, int r51) {
        /*
            Method dump skipped, instructions count: 544
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.early_access.mvi.A.c(com.avito.android.early_access.mvi.entity.EarlyAccessState$Content, Y41.l, androidx.compose.runtime.A, int):void");
    }
}
