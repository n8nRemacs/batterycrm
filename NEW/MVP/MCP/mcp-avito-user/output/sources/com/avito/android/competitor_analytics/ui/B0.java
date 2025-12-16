package com.avito.android.competitor_analytics.ui;

import androidx.compose.animation.C20340d0;
import androidx.compose.foundation.C21086w0;
import androidx.compose.foundation.layout.C20563e2;
import androidx.compose.foundation.layout.C20568f2;
import androidx.compose.foundation.layout.C20576h2;
import androidx.compose.foundation.layout.C20585k;
import androidx.compose.foundation.layout.C20588k2;
import androidx.compose.foundation.layout.C20632w;
import androidx.compose.foundation.layout.C20644z;
import androidx.compose.foundation.layout.R1;
import androidx.compose.runtime.A;
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
import androidx.compose.ui.platform.C22501m2;
import androidx.compose.ui.unit.h;
import androidx.compose.ui.v;
import com.avito.android.competitor_analytics.domain.model.SuggestsStatus;
import com.avito.android.competitor_analytics.mvi.entity.b;
import kotlin.Metadata;

/* compiled from: CompetitorAnalyticsSuggestsV2.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_competitor-analytics_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class B0 {

    /* compiled from: CompetitorAnalyticsSuggestsV2.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a extends kotlin.jvm.internal.N implements Y41.p<androidx.compose.runtime.A, Integer, kotlin.G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ b.k f124585l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ boolean f124586m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ Y41.l<com.avito.android.competitor_analytics.mvi.entity.a, kotlin.G0> f124587n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ int f124588o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(b.k kVar, boolean z12, Y41.l<? super com.avito.android.competitor_analytics.mvi.entity.a, kotlin.G0> lVar, int i12) {
            super(2);
            this.f124585l = kVar;
            this.f124586m = z12;
            this.f124587n = lVar;
            this.f124588o = i12;
        }

        @Override // Y41.p
        public final kotlin.G0 invoke(androidx.compose.runtime.A a12, Integer num) {
            num.intValue();
            int iA2 = C22066f2.a(this.f124588o | 1);
            boolean z12 = this.f124586m;
            Y41.l<com.avito.android.competitor_analytics.mvi.entity.a, kotlin.G0> lVar = this.f124587n;
            B0.a(this.f124585l, z12, lVar, a12, iA2);
            return kotlin.G0.f406611a;
        }
    }

    /* compiled from: CompetitorAnalyticsSuggestsV2.kt */
    @kotlin.jvm.internal.s0
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "(Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends kotlin.jvm.internal.N implements Y41.p<androidx.compose.runtime.A, Integer, kotlin.G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ b.k f124589l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ Y41.l<com.avito.android.competitor_analytics.mvi.entity.a, kotlin.G0> f124590m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ boolean f124591n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(b.k kVar, Y41.l<? super com.avito.android.competitor_analytics.mvi.entity.a, kotlin.G0> lVar, boolean z12) {
            super(2);
            this.f124589l = kVar;
            this.f124590m = lVar;
            this.f124591n = z12;
        }

        @Override // Y41.p
        public final kotlin.G0 invoke(androidx.compose.runtime.A a12, Integer num) {
            boolean z12;
            androidx.compose.runtime.A a13 = a12;
            if ((num.intValue() & 11) == 2 && a13.c()) {
                a13.f();
            } else {
                v.a aVar = androidx.compose.ui.v.f42878y1;
                androidx.compose.ui.v vVarD = C20588k2.d(aVar, 1.0f);
                float f12 = 8;
                h.a aVar2 = androidx.compose.ui.unit.h.f42849c;
                androidx.compose.ui.v vVarM = R1.m(vVarD, 0.0f, 0.0f, 0.0f, f12, 7);
                C20585k.f28659a.getClass();
                C20585k.l lVar = C20585k.f28662d;
                InterfaceC22215f.f39074a.getClass();
                androidx.compose.foundation.layout.I iA2 = androidx.compose.foundation.layout.H.a(lVar, InterfaceC22215f.a.f39088n, a13, 0);
                int f37888q = a13.getF37888Q();
                O1 o1Y = a13.y();
                androidx.compose.ui.v vVarC = androidx.compose.ui.n.c(a13, vVarM);
                InterfaceC22413h.f40789C1.getClass();
                Y41.a<InterfaceC22413h> aVar3 = InterfaceC22413h.a.f40791b;
                if (a13.F() == null) {
                    C22190v.b();
                    throw null;
                }
                a13.A();
                if (a13.getF37887P()) {
                    a13.b(aVar3);
                } else {
                    a13.d();
                }
                Y41.p<InterfaceC22413h, InterfaceC22365i0, kotlin.G0> pVar = InterfaceC22413h.a.f40796g;
                R3.b(pVar, a13, iA2);
                Y41.p<InterfaceC22413h, androidx.compose.runtime.U, kotlin.G0> pVar2 = InterfaceC22413h.a.f40795f;
                R3.b(pVar2, a13, o1Y);
                Y41.p<InterfaceC22413h, Integer, kotlin.G0> pVar3 = InterfaceC22413h.a.f40799j;
                if (a13.getF37887P() || !kotlin.jvm.internal.L.f(a13.t(), Integer.valueOf(f37888q))) {
                    androidx.appcompat.app.r.B(f37888q, a13, f37888q, pVar3);
                }
                Y41.p<InterfaceC22413h, androidx.compose.ui.v, kotlin.G0> pVar4 = InterfaceC22413h.a.f40793d;
                R3.b(pVar4, a13, vVarC);
                androidx.compose.foundation.layout.K k12 = androidx.compose.foundation.layout.K.f28344a;
                androidx.compose.ui.v vVarD2 = C20588k2.d(aVar, 1.0f);
                a13.C(-33242432);
                Object objT = a13.t();
                androidx.compose.runtime.A.f37866a.getClass();
                Object obj = A.a.f37868b;
                if (objT == obj) {
                    objT = androidx.compose.foundation.interaction.l.a();
                    a13.H(objT);
                }
                androidx.compose.foundation.interaction.m mVar = (androidx.compose.foundation.interaction.m) objT;
                a13.h();
                b.k kVar = this.f124589l;
                boolean z13 = !kVar.f124545d.isEmpty();
                a13.C(-33236303);
                Y41.l<com.avito.android.competitor_analytics.mvi.entity.a, kotlin.G0> lVar2 = this.f124590m;
                boolean zB2 = a13.B(lVar2);
                boolean z14 = this.f124591n;
                boolean zJ2 = zB2 | a13.j(z14);
                Object objT2 = a13.t();
                if (zJ2 || objT2 == obj) {
                    objT2 = new C0(lVar2, z14);
                    a13.H(objT2);
                }
                a13.h();
                androidx.compose.ui.v vVarB = C21086w0.b(vVarD2, mVar, null, z13, null, (Y41.a) objT2, 24);
                C20585k.C1589k c1589k = C20585k.f28660b;
                C20568f2 c20568f2A = C20563e2.a(c1589k, InterfaceC22215f.a.f39085k, a13, 0);
                int f37888q2 = a13.getF37888Q();
                O1 o1Y2 = a13.y();
                androidx.compose.ui.v vVarC2 = androidx.compose.ui.n.c(a13, vVarB);
                if (a13.F() == null) {
                    C22190v.b();
                    throw null;
                }
                a13.A();
                if (a13.getF37887P()) {
                    a13.b(aVar3);
                } else {
                    a13.d();
                }
                R3.b(pVar, a13, c20568f2A);
                R3.b(pVar2, a13, o1Y2);
                if (a13.getF37887P() || !kotlin.jvm.internal.L.f(a13.t(), Integer.valueOf(f37888q2))) {
                    androidx.appcompat.app.r.B(f37888q2, a13, f37888q2, pVar3);
                }
                R3.b(pVar4, a13, vVarC2);
                C20576h2 c20576h2 = C20576h2.f28641a;
                com.akita.compose.theme.re23.b.f63983a.getClass();
                com.akita.compose.theme.re23.i iVar = com.akita.compose.theme.re23.b.f63988f;
                com.akita.compose.foundation.ui.p.b(kVar.f124542a, iVar.f65239j, C22501m2.a(R1.m(C20588k2.d(c20576h2.a(aVar, 1.0f, true), 1.0f), 0.0f, 0.0f, 12, 0.0f, 11), "suggests_title"), false, 0L, null, 0, 0, false, null, a13, 0, 1016);
                SuggestsStatus suggestsStatus = kVar.f124543b;
                androidx.compose.ui.v vVarA = C22501m2.a(R1.l(androidx.compose.foundation.A.b(aVar, suggestsStatus.f124348b.c(a13), androidx.compose.foundation.shape.o.a(32)), f12, 6, f12, f12), "suggests_status_block");
                C20568f2 c20568f2A2 = C20563e2.a(c1589k, InterfaceC22215f.a.f39086l, a13, 48);
                int f37888q3 = a13.getF37888Q();
                O1 o1Y3 = a13.y();
                androidx.compose.ui.v vVarC3 = androidx.compose.ui.n.c(a13, vVarA);
                if (a13.F() == null) {
                    C22190v.b();
                    throw null;
                }
                a13.A();
                if (a13.getF37887P()) {
                    a13.b(aVar3);
                } else {
                    a13.d();
                }
                R3.b(pVar, a13, c20568f2A2);
                R3.b(pVar2, a13, o1Y3);
                if (a13.getF37887P() || !kotlin.jvm.internal.L.f(a13.t(), Integer.valueOf(f37888q3))) {
                    androidx.appcompat.app.r.B(f37888q3, a13, f37888q3, pVar3);
                }
                R3.b(pVar4, a13, vVarC3);
                com.akita.compose.foundation.ui.o.a(suggestsStatus.f124350d, iVar.f65245p, C22501m2.a(aVar, "suggests_status_icon"), suggestsStatus.f124349c, a13, 384, 0);
                androidx.compose.ui.v vVarA2 = C22501m2.a(R1.k(3, 0.0f, 2, C20588k2.v(0.0f, 150, 1, aVar)), "suggests_status_text");
                androidx.compose.ui.text.style.s.f42720b.getClass();
                com.akita.compose.foundation.ui.p.b(kVar.f124544c, iVar.f65245p, vVarA2, false, 0L, null, 1, androidx.compose.ui.text.style.s.f42722d, false, null, a13, 14156160, 824);
                a13.C(1055142812);
                if (kVar.f124545d.isEmpty()) {
                    z12 = z14;
                } else {
                    z12 = z14;
                    androidx.compose.runtime.S.a(com.akita.compose.foundation.d.f63579a.b(iVar.f65245p.f63644a), androidx.compose.runtime.internal.r.c(1799036905, new D0(z12), a13), a13, 56);
                }
                a13.h();
                a13.z();
                a13.z();
                C20340d0.b(k12, z12, null, null, null, null, androidx.compose.runtime.internal.r.c(-65223266, new E0(kVar, lVar2), a13), a13, 1572870, 30);
                a13.z();
            }
            return kotlin.G0.f406611a;
        }
    }

    /* compiled from: CompetitorAnalyticsSuggestsV2.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class c extends kotlin.jvm.internal.N implements Y41.p<androidx.compose.runtime.A, Integer, kotlin.G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ b.k f124592l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ boolean f124593m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ Y41.l<com.avito.android.competitor_analytics.mvi.entity.a, kotlin.G0> f124594n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ int f124595o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public c(b.k kVar, boolean z12, Y41.l<? super com.avito.android.competitor_analytics.mvi.entity.a, kotlin.G0> lVar, int i12) {
            super(2);
            this.f124592l = kVar;
            this.f124593m = z12;
            this.f124594n = lVar;
            this.f124595o = i12;
        }

        @Override // Y41.p
        public final kotlin.G0 invoke(androidx.compose.runtime.A a12, Integer num) {
            num.intValue();
            int iA2 = C22066f2.a(this.f124595o | 1);
            boolean z12 = this.f124593m;
            Y41.l<com.avito.android.competitor_analytics.mvi.entity.a, kotlin.G0> lVar = this.f124594n;
            B0.a(this.f124592l, z12, lVar, a12, iA2);
            return kotlin.G0.f406611a;
        }
    }

    @InterfaceC22132o
    @InterfaceC22181t
    public static final void a(@Y61.l b.k kVar, boolean z12, @Y61.k Y41.l<? super com.avito.android.competitor_analytics.mvi.entity.a, kotlin.G0> lVar, @Y61.l androidx.compose.runtime.A a12, int i12) {
        androidx.compose.runtime.B bE2 = a12.E(776640144);
        if (kVar == null) {
            C22039c2 c22039c2Z = bE2.Z();
            if (c22039c2Z != null) {
                c22039c2Z.f38184d = new a(kVar, z12, lVar, i12);
                return;
            }
            return;
        }
        com.akita.compose.theme.re23.b.f63983a.getClass();
        com.akita.compose.component.banner.h f66906p = com.akita.compose.theme.re23.b.b(bE2).getF66906p();
        androidx.compose.ui.v vVarD = C20588k2.d(androidx.compose.ui.v.f42878y1, 1.0f);
        float f12 = 10;
        h.a aVar = androidx.compose.ui.unit.h.f42849c;
        com.akita.compose.component.banner.g.c(f66906p, C22501m2.a(R1.m(vVarD, f12, 20, f12, 0.0f, 8), "suggests_container"), null, null, null, 0.0f, null, androidx.compose.runtime.internal.r.c(1657026000, new b(kVar, lVar, z12), bE2), bE2, com.akita.compose.component.banner.h.f60462o | 12582960, 124);
        C22039c2 c22039c2Z2 = bE2.Z();
        if (c22039c2Z2 != null) {
            c22039c2Z2.f38184d = new c(kVar, z12, lVar, i12);
        }
    }

    public static final void b(b.k.a aVar, boolean z12, Y41.l lVar, androidx.compose.runtime.A a12, int i12) {
        com.akita.compose.theme.re23.i iVar;
        boolean z13;
        boolean z14;
        androidx.compose.runtime.B bE2 = a12.E(2119493876);
        v.a aVar2 = androidx.compose.ui.v.f42878y1;
        androidx.compose.ui.v vVarC = C21086w0.c(aVar2, aVar.f124548c != null, null, null, new F0(aVar, lVar), 6);
        C20585k.f28659a.getClass();
        C20585k.l lVar2 = C20585k.f28662d;
        InterfaceC22215f.f39074a.getClass();
        androidx.compose.foundation.layout.I iA2 = androidx.compose.foundation.layout.H.a(lVar2, InterfaceC22215f.a.f39088n, bE2, 0);
        int i13 = bE2.f37888Q;
        O1 o1S = bE2.S();
        androidx.compose.ui.v vVarC2 = androidx.compose.ui.n.c(bE2, vVarC);
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
        R3.b(pVar4, bE2, vVarC2);
        androidx.compose.foundation.layout.K k12 = androidx.compose.foundation.layout.K.f28344a;
        h.a aVar4 = androidx.compose.ui.unit.h.f42849c;
        androidx.compose.ui.v vVarM = R1.m(aVar2, 0.0f, 11, 0.0f, 0.0f, 13);
        InterfaceC22365i0 interfaceC22365i0D = C20632w.d(InterfaceC22215f.a.f39076b, false);
        int i14 = bE2.f37888Q;
        O1 o1S2 = bE2.S();
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
        R3.b(pVar, bE2, interfaceC22365i0D);
        R3.b(pVar2, bE2, o1S2);
        if (bE2.f37887P || !kotlin.jvm.internal.L.f(bE2.t(), Integer.valueOf(i14))) {
            AK.c.y(i14, bE2, i14, pVar3);
        }
        R3.b(pVar4, bE2, vVarC3);
        C20644z c20644z = C20644z.f28804a;
        com.akita.compose.theme.re23.b.f63983a.getClass();
        com.akita.compose.theme.re23.i iVar2 = com.akita.compose.theme.re23.b.f63988f;
        float f12 = 32;
        com.akita.compose.foundation.ui.p.b(aVar.f124546a, iVar2.f65241l, C22501m2.a(R1.m(C20588k2.d(aVar2, 1.0f), 0.0f, 0.0f, f12, 0.0f, 11), "suggests_banner_title"), false, 0L, null, 0, 0, false, null, bE2, 384, 1016);
        bE2.C(-1571876164);
        if (aVar.f124548c == null) {
            iVar = iVar2;
        } else {
            com.akita.compose.theme.re23.g.f65049a.getClass();
            iVar = iVar2;
            com.akita.compose.foundation.ui.o.a(com.akita.compose.theme.re23.g.f65021V1, iVar.f65241l, C22501m2.a(R1.m(c20644z.d(C20588k2.f28681b, InterfaceC22215f.a.f39078d), 0.0f, 0.0f, 6, 0.0f, 11), "suggests_banner_icon"), null, bE2, 0, 8);
        }
        bE2.X(false);
        bE2.X(true);
        float f13 = 2;
        androidx.compose.ui.v vVarA = C22501m2.a(R1.m(C20588k2.d(aVar2, 1.0f), 0.0f, f13, f12, f13, 1), "suggests_banner_description");
        com.akita.compose.theme.re23.b.f63987e.getClass();
        W2.q qVar = com.akita.compose.theme.re23.semantic.b.f65954b;
        qVar.getText().getClass();
        com.akita.compose.foundation.ui.p.b(aVar.f124547b, iVar.f65245p, vVarA, false, X2.h.f18557e.c(bE2), null, 0, 0, false, null, bE2, 384, 1000);
        bE2.C(977498553);
        if (z12) {
            z13 = true;
            z14 = false;
        } else {
            com.akita.compose.foundation.ui.g.a(10, null, bE2, 6);
            z13 = true;
            androidx.compose.ui.v vVarF = C20588k2.f(C20588k2.d(aVar2, 1.0f), 1);
            qVar.b().getClass();
            z14 = false;
            C20632w.a(C22501m2.a(androidx.compose.foundation.A.b(vVarF, X2.e.f18537d.c(bE2), Y0.f39346a), "suggests_banner_divider"), bE2, 0);
        }
        C22039c2 c22039c2N = com.avito.android.actions_sheet.a.n(bE2, z14, z13);
        if (c22039c2N != null) {
            c22039c2N.f38184d = new G0(aVar, z12, lVar, i12);
        }
    }
}
