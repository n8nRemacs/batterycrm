package com.avito.android.competitor_analytics.ui;

import androidx.compose.foundation.C21086w0;
import androidx.compose.foundation.layout.C20563e2;
import androidx.compose.foundation.layout.C20568f2;
import androidx.compose.foundation.layout.C20576h2;
import androidx.compose.foundation.layout.C20585k;
import androidx.compose.foundation.layout.C20588k2;
import androidx.compose.foundation.layout.R1;
import androidx.compose.foundation.layout.S0;
import androidx.compose.runtime.C22039c2;
import androidx.compose.runtime.C22066f2;
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
import com.avito.android.competitor_analytics.domain.model.ActionButton;
import com.avito.android.competitor_analytics.domain.model.ChartColor;
import com.avito.android.competitor_analytics.mvi.entity.a;
import com.avito.android.competitor_analytics.mvi.entity.b;
import com.avito.android.remote.model.text.AttributedText;
import kotlin.Metadata;

/* compiled from: CompetitorAnalyticsChartMetrics.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_competitor-analytics_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.competitor_analytics.ui.i, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C29534i {

    /* compiled from: CompetitorAnalyticsChartMetrics.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.competitor_analytics.ui.i$a */
    public static final class a extends kotlin.jvm.internal.N implements Y41.a<kotlin.G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.l<com.avito.android.competitor_analytics.mvi.entity.a, kotlin.G0> f124784l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ b.g f124785m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(Y41.l<? super com.avito.android.competitor_analytics.mvi.entity.a, kotlin.G0> lVar, b.g gVar) {
            super(0);
            this.f124784l = lVar;
            this.f124785m = gVar;
        }

        @Override // Y41.a
        public final kotlin.G0 invoke() {
            this.f124784l.invoke(new a.c(this.f124785m));
            return kotlin.G0.f406611a;
        }
    }

    /* compiled from: CompetitorAnalyticsChartMetrics.kt */
    @kotlin.jvm.internal.s0
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "(Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.competitor_analytics.ui.i$b */
    public static final class b extends kotlin.jvm.internal.N implements Y41.p<androidx.compose.runtime.A, Integer, kotlin.G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ b.g f124786l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ int f124787m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ b.g.C3713b f124788n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ Y41.l<com.avito.android.competitor_analytics.mvi.entity.a, kotlin.G0> f124789o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(b.g gVar, int i12, b.g.C3713b c3713b, Y41.l<? super com.avito.android.competitor_analytics.mvi.entity.a, kotlin.G0> lVar) {
            super(2);
            this.f124786l = gVar;
            this.f124787m = i12;
            this.f124788n = c3713b;
            this.f124789o = lVar;
        }

        @Override // Y41.p
        public final kotlin.G0 invoke(androidx.compose.runtime.A a12, Integer num) {
            Y41.a<InterfaceC22413h> aVar;
            Y41.p<InterfaceC22413h, Integer, kotlin.G0> pVar;
            Y41.p<InterfaceC22413h, androidx.compose.ui.v, kotlin.G0> pVar2;
            androidx.compose.runtime.A a13 = a12;
            if ((num.intValue() & 11) == 2 && a13.c()) {
                a13.f();
            } else {
                v.a aVar2 = androidx.compose.ui.v.f42878y1;
                C20585k.f28659a.getClass();
                C20585k.l lVar = C20585k.f28662d;
                InterfaceC22215f.f39074a.getClass();
                i.a aVar3 = InterfaceC22215f.a.f39088n;
                androidx.compose.foundation.layout.I iA2 = androidx.compose.foundation.layout.H.a(lVar, aVar3, a13, 0);
                int f37888q = a13.getF37888Q();
                O1 o1Y = a13.y();
                androidx.compose.ui.v vVarC = androidx.compose.ui.n.c(a13, aVar2);
                InterfaceC22413h.f40789C1.getClass();
                Y41.a<InterfaceC22413h> aVar4 = InterfaceC22413h.a.f40791b;
                if (a13.F() == null) {
                    C22190v.b();
                    throw null;
                }
                a13.A();
                if (a13.getF37887P()) {
                    a13.b(aVar4);
                } else {
                    a13.d();
                }
                Y41.p<InterfaceC22413h, InterfaceC22365i0, kotlin.G0> pVar3 = InterfaceC22413h.a.f40796g;
                R3.b(pVar3, a13, iA2);
                Y41.p<InterfaceC22413h, androidx.compose.runtime.U, kotlin.G0> pVar4 = InterfaceC22413h.a.f40795f;
                R3.b(pVar4, a13, o1Y);
                Y41.p<InterfaceC22413h, Integer, kotlin.G0> pVar5 = InterfaceC22413h.a.f40799j;
                if (a13.getF37887P() || !kotlin.jvm.internal.L.f(a13.t(), Integer.valueOf(f37888q))) {
                    androidx.appcompat.app.r.B(f37888q, a13, f37888q, pVar5);
                }
                Y41.p<InterfaceC22413h, androidx.compose.ui.v, kotlin.G0> pVar6 = InterfaceC22413h.a.f40793d;
                R3.b(pVar6, a13, vVarC);
                androidx.compose.foundation.layout.K k12 = androidx.compose.foundation.layout.K.f28344a;
                h.a aVar5 = androidx.compose.ui.unit.h.f42849c;
                C20585k.j jVarG = C20585k.g(2);
                i.b bVar = InterfaceC22215f.a.f39085k;
                C20568f2 c20568f2A = C20563e2.a(jVarG, bVar, a13, 6);
                int f37888q2 = a13.getF37888Q();
                O1 o1Y2 = a13.y();
                androidx.compose.ui.v vVarC2 = androidx.compose.ui.n.c(a13, aVar2);
                if (a13.F() == null) {
                    C22190v.b();
                    throw null;
                }
                a13.A();
                if (a13.getF37887P()) {
                    a13.b(aVar4);
                } else {
                    a13.d();
                }
                R3.b(pVar3, a13, c20568f2A);
                R3.b(pVar4, a13, o1Y2);
                if (a13.getF37887P() || !kotlin.jvm.internal.L.f(a13.t(), Integer.valueOf(f37888q2))) {
                    androidx.appcompat.app.r.B(f37888q2, a13, f37888q2, pVar5);
                }
                R3.b(pVar6, a13, vVarC2);
                C20576h2 c20576h2 = C20576h2.f28641a;
                b.g gVar = this.f124786l;
                com.akita.compose.theme.re23.b.f63983a.getClass();
                com.akita.compose.theme.re23.i iVar = com.akita.compose.theme.re23.b.f63988f;
                com.akita.compose.foundation.r rVar = iVar.f65239j;
                androidx.compose.ui.v vVarA = c20576h2.a(aVar2, 1.0f, false);
                StringBuilder sb2 = new StringBuilder("metrics_chart_item_title");
                int i12 = this.f124787m;
                sb2.append(i12);
                com.akita.compose.foundation.ui.p.b(gVar.f124501a, rVar, C22501m2.a(vVarA, sb2.toString()), false, 0L, null, 0, 0, false, null, a13, 0, 1016);
                com.akita.compose.theme.re23.b.f63986d.getClass();
                com.akita.compose.foundation.ui.o.a(com.akita.compose.theme.re23.g.f65066c2, iVar.f65239j, C22501m2.a(aVar2, "metrics_chart_item_title_icon" + i12), null, a13, 0, 8);
                a13.z();
                float f12 = (float) 16;
                androidx.compose.ui.v vVarM = R1.m(aVar2, 0.0f, f12, 0.0f, 0.0f, 13);
                C20568f2 c20568f2A2 = C20563e2.a(C20585k.g(f12), bVar, a13, 6);
                int f37888q3 = a13.getF37888Q();
                O1 o1Y3 = a13.y();
                androidx.compose.ui.v vVarC3 = androidx.compose.ui.n.c(a13, vVarM);
                if (a13.F() == null) {
                    C22190v.b();
                    throw null;
                }
                a13.A();
                if (a13.getF37887P()) {
                    aVar = aVar4;
                    a13.b(aVar);
                } else {
                    aVar = aVar4;
                    a13.d();
                }
                R3.b(pVar3, a13, c20568f2A2);
                R3.b(pVar4, a13, o1Y3);
                if (a13.getF37887P() || !kotlin.jvm.internal.L.f(a13.t(), Integer.valueOf(f37888q3))) {
                    pVar = pVar5;
                    androidx.appcompat.app.r.B(f37888q3, a13, f37888q3, pVar);
                    pVar2 = pVar6;
                } else {
                    pVar2 = pVar6;
                    pVar = pVar5;
                }
                R3.b(pVar2, a13, vVarC3);
                androidx.compose.ui.v vVarA2 = c20576h2.a(aVar2, 1.0f, true);
                androidx.compose.foundation.layout.I iA3 = androidx.compose.foundation.layout.H.a(C20585k.g(12), aVar3, a13, 6);
                int f37888q4 = a13.getF37888Q();
                O1 o1Y4 = a13.y();
                androidx.compose.ui.v vVarC4 = androidx.compose.ui.n.c(a13, vVarA2);
                if (a13.F() == null) {
                    C22190v.b();
                    throw null;
                }
                a13.A();
                if (a13.getF37887P()) {
                    a13.b(aVar);
                } else {
                    a13.d();
                }
                R3.b(pVar3, a13, iA3);
                R3.b(pVar4, a13, o1Y4);
                if (a13.getF37887P() || !kotlin.jvm.internal.L.f(a13.t(), Integer.valueOf(f37888q4))) {
                    androidx.appcompat.app.r.B(f37888q4, a13, f37888q4, pVar);
                }
                R3.b(pVar2, a13, vVarC4);
                b.g.a aVar6 = gVar.f124503c;
                b.g.C3713b c3713b = this.f124788n;
                C29534i.b(aVar6.f124508a, c3713b.f124511a, aVar6.f124509b, aVar6.f124510c, AK.c.g(i12, "metrics_chart_current"), a13, 4096);
                b.g.a aVar7 = gVar.f124504d;
                C29534i.b(aVar7.f124508a, c3713b.f124512b, aVar7.f124509b, aVar7.f124510c, AK.c.g(i12, "metrics_chart_micromarket"), a13, 4096);
                a13.z();
                y0.a(c3713b, com.avito.android.bxcontent.mvi.entity.f.d(i12, R1.m(C20588k2.f(c20576h2.a(aVar2, 1.0f, true), 100), 0.0f, f12, 0.0f, 0.0f, 13), "metrics_chart_item_chart"), a13, 8);
                a13.z();
                a13.C(-373552298);
                Y41.l<com.avito.android.competitor_analytics.mvi.entity.a, kotlin.G0> lVar2 = this.f124789o;
                AttributedText attributedText = gVar.f124505e;
                if (attributedText != null) {
                    r.a(attributedText, lVar2, R1.m(aVar2, 0.0f, f12, 0.0f, 0.0f, 13), a13, 392);
                    kotlin.G0 g02 = kotlin.G0.f406611a;
                }
                a13.h();
                a13.C(-373542841);
                ActionButton actionButton = gVar.f124506f;
                if (actionButton != null) {
                    com.akita.compose.component.button.m.c(actionButton.f124315a, new C29536j(lVar2, actionButton), com.akita.compose.theme.re23.b.c(a13).i(), com.avito.android.bxcontent.mvi.entity.f.d(i12, R1.m(aVar2, 0.0f, f12, 0.0f, 0.0f, 13), "metrics_chart_item_button"), null, null, null, false, false, null, a13, 512, 1008);
                    kotlin.G0 g03 = kotlin.G0.f406611a;
                }
                a13.h();
                a13.z();
            }
            return kotlin.G0.f406611a;
        }
    }

    /* compiled from: CompetitorAnalyticsChartMetrics.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.competitor_analytics.ui.i$c */
    public static final class c extends kotlin.jvm.internal.N implements Y41.p<androidx.compose.runtime.A, Integer, kotlin.G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ b.g f124790l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ int f124791m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ Y41.l<com.avito.android.competitor_analytics.mvi.entity.a, kotlin.G0> f124792n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ int f124793o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public c(b.g gVar, int i12, Y41.l<? super com.avito.android.competitor_analytics.mvi.entity.a, kotlin.G0> lVar, int i13) {
            super(2);
            this.f124790l = gVar;
            this.f124791m = i12;
            this.f124792n = lVar;
            this.f124793o = i13;
        }

        @Override // Y41.p
        public final kotlin.G0 invoke(androidx.compose.runtime.A a12, Integer num) {
            num.intValue();
            int iA2 = C22066f2.a(this.f124793o | 1);
            int i12 = this.f124791m;
            Y41.l<com.avito.android.competitor_analytics.mvi.entity.a, kotlin.G0> lVar = this.f124792n;
            C29534i.a(this.f124790l, i12, lVar, a12, iA2);
            return kotlin.G0.f406611a;
        }
    }

    /* compiled from: CompetitorAnalyticsChartMetrics.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.competitor_analytics.ui.i$d */
    public static final class d extends kotlin.jvm.internal.N implements Y41.p<androidx.compose.runtime.A, Integer, kotlin.G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ b.g f124794l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ int f124795m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ Y41.l<com.avito.android.competitor_analytics.mvi.entity.a, kotlin.G0> f124796n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ int f124797o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public d(b.g gVar, int i12, Y41.l<? super com.avito.android.competitor_analytics.mvi.entity.a, kotlin.G0> lVar, int i13) {
            super(2);
            this.f124794l = gVar;
            this.f124795m = i12;
            this.f124796n = lVar;
            this.f124797o = i13;
        }

        @Override // Y41.p
        public final kotlin.G0 invoke(androidx.compose.runtime.A a12, Integer num) {
            num.intValue();
            int iA2 = C22066f2.a(this.f124797o | 1);
            int i12 = this.f124795m;
            Y41.l<com.avito.android.competitor_analytics.mvi.entity.a, kotlin.G0> lVar = this.f124796n;
            C29534i.a(this.f124794l, i12, lVar, a12, iA2);
            return kotlin.G0.f406611a;
        }
    }

    @InterfaceC22132o
    @InterfaceC22181t
    public static final void a(@Y61.k b.g gVar, int i12, @Y61.k Y41.l<? super com.avito.android.competitor_analytics.mvi.entity.a, kotlin.G0> lVar, @Y61.l androidx.compose.runtime.A a12, int i13) {
        androidx.compose.runtime.B bE2 = a12.E(-505161684);
        b.g.C3713b c3713b = gVar.f124507g;
        if (c3713b == null) {
            C22039c2 c22039c2Z = bE2.Z();
            if (c22039c2Z != null) {
                c22039c2Z.f38184d = new d(gVar, i12, lVar, i13);
                return;
            }
            return;
        }
        bE2.C(2039536504);
        if (i12 == 0) {
            h.a aVar = androidx.compose.ui.unit.h.f42849c;
            com.akita.compose.foundation.ui.g.a(14, null, bE2, 6);
        }
        bE2.X(false);
        com.akita.compose.theme.re23.b.f63983a.getClass();
        com.akita.compose.component.banner.h f66902l = com.akita.compose.theme.re23.b.b(bE2).getF66902l();
        v.a aVar2 = androidx.compose.ui.v.f42878y1;
        float f12 = 10;
        h.a aVar3 = androidx.compose.ui.unit.h.f42849c;
        com.akita.compose.component.banner.g.c(f66902l, C21086w0.c(R1.m(aVar2, f12, 6, f12, 0.0f, 8), false, null, null, new a(lVar, gVar), 7), null, null, null, 0.0f, null, androidx.compose.runtime.internal.r.c(1016996076, new b(gVar, i12, c3713b, lVar), bE2), bE2, com.akita.compose.component.banner.h.f60462o | 12582912, 124);
        C22039c2 c22039c2Z2 = bE2.Z();
        if (c22039c2Z2 != null) {
            c22039c2Z2.f38184d = new c(gVar, i12, lVar, i13);
        }
    }

    public static final void b(String str, ChartColor chartColor, String str2, AttributedText attributedText, String str3, androidx.compose.runtime.A a12, int i12) {
        androidx.compose.runtime.B bE2 = a12.E(1551923891);
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
        float f12 = 6;
        h.a aVar3 = androidx.compose.ui.unit.h.f42849c;
        C20568f2 c20568f2A = C20563e2.a(C20585k.g(f12), InterfaceC22215f.a.f39085k, bE2, 6);
        int i14 = bE2.f37888Q;
        O1 o1S2 = bE2.S();
        androidx.compose.ui.v vVarC2 = androidx.compose.ui.n.c(bE2, aVar);
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
        r.e(str, C22501m2.a(C20576h2.f28641a.a(aVar, 1.0f, false), "metrics_chart_items_title_" + str3), bE2, i12 & 14);
        r.c(0, chartColor.f124329b, bE2, C22501m2.a(aVar, "metrics_chart_items_indicator_" + str3));
        bE2.X(true);
        S0.d(R1.m(aVar, 0.0f, (float) 4, 0.0f, 0.0f, 13), C20585k.g(f12), null, null, 0, 0, androidx.compose.runtime.internal.r.c(-2086728200, new C29530g(str2, str3, attributedText), bE2), bE2, 1572918, 60);
        bE2.X(true);
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new C29532h(str, chartColor, str2, attributedText, str3, i12);
        }
    }
}
