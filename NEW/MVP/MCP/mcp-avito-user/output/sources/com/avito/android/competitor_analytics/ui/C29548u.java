package com.avito.android.competitor_analytics.ui;

import androidx.compose.foundation.C21086w0;
import androidx.compose.foundation.layout.C20563e2;
import androidx.compose.foundation.layout.C20568f2;
import androidx.compose.foundation.layout.C20576h2;
import androidx.compose.foundation.layout.C20585k;
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
import com.avito.android.competitor_analytics.mvi.entity.a;
import com.avito.android.competitor_analytics.mvi.entity.b;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.text.AttributedText;
import kotlin.Metadata;

/* compiled from: CompetitorAnalyticsDefaultMetrics.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_competitor-analytics_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.competitor_analytics.ui.u, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C29548u {

    /* compiled from: CompetitorAnalyticsDefaultMetrics.kt */
    @kotlin.jvm.internal.s0
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.competitor_analytics.ui.u$a */
    public static final class a extends kotlin.jvm.internal.N implements Y41.a<kotlin.G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ b.g f124854l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ Y41.l<com.avito.android.competitor_analytics.mvi.entity.a, kotlin.G0> f124855m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Y41.l lVar, b.g gVar) {
            super(0);
            this.f124854l = gVar;
            this.f124855m = lVar;
        }

        @Override // Y41.a
        public final kotlin.G0 invoke() {
            DeepLink deepLink;
            b.g.c cVar = this.f124854l.f124502b;
            if (cVar != null && (deepLink = cVar.f124522b) != null) {
                this.f124855m.invoke(new a.i(deepLink));
            }
            return kotlin.G0.f406611a;
        }
    }

    /* compiled from: CompetitorAnalyticsDefaultMetrics.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.competitor_analytics.ui.u$b */
    public static final class b extends kotlin.jvm.internal.N implements Y41.a<kotlin.G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.l<com.avito.android.competitor_analytics.mvi.entity.a, kotlin.G0> f124856l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ ActionButton f124857m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(Y41.l<? super com.avito.android.competitor_analytics.mvi.entity.a, kotlin.G0> lVar, ActionButton actionButton) {
            super(0);
            this.f124856l = lVar;
            this.f124857m = actionButton;
        }

        @Override // Y41.a
        public final kotlin.G0 invoke() {
            this.f124856l.invoke(new a.i(this.f124857m.f124316b));
            return kotlin.G0.f406611a;
        }
    }

    /* compiled from: CompetitorAnalyticsDefaultMetrics.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.competitor_analytics.ui.u$c */
    public static final class c extends kotlin.jvm.internal.N implements Y41.p<androidx.compose.runtime.A, Integer, kotlin.G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ b.g f124858l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ int f124859m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ Y41.l<com.avito.android.competitor_analytics.mvi.entity.a, kotlin.G0> f124860n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ int f124861o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public c(b.g gVar, int i12, Y41.l<? super com.avito.android.competitor_analytics.mvi.entity.a, kotlin.G0> lVar, int i13) {
            super(2);
            this.f124858l = gVar;
            this.f124859m = i12;
            this.f124860n = lVar;
            this.f124861o = i13;
        }

        @Override // Y41.p
        public final kotlin.G0 invoke(androidx.compose.runtime.A a12, Integer num) {
            num.intValue();
            int iA2 = C22066f2.a(this.f124861o | 1);
            int i12 = this.f124859m;
            Y41.l<com.avito.android.competitor_analytics.mvi.entity.a, kotlin.G0> lVar = this.f124860n;
            C29548u.b(this.f124858l, i12, lVar, a12, iA2);
            return kotlin.G0.f406611a;
        }
    }

    @InterfaceC22132o
    @InterfaceC22181t
    public static final void a(String str, String str2, AttributedText attributedText, String str3, androidx.compose.ui.v vVar, androidx.compose.runtime.A a12, int i12) {
        androidx.compose.runtime.B bE2 = a12.E(399532852);
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
        v.a aVar2 = androidx.compose.ui.v.f42878y1;
        r.e(str, C22501m2.a(aVar2, "metrics_items_title_" + str3), bE2, 0);
        h.a aVar3 = androidx.compose.ui.unit.h.f42849c;
        S0.d(R1.m(aVar2, 0.0f, (float) 4, 0.0f, 0.0f, 13), C20585k.g((float) 6), null, null, 0, 0, androidx.compose.runtime.internal.r.c(1055848057, new C29546s(str2, str3, attributedText), bE2), bE2, 1572918, 60);
        bE2.X(true);
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new C29547t(str, str2, attributedText, str3, vVar, i12);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v40 */
    /* JADX WARN: Type inference failed for: r5v41, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r5v44 */
    @InterfaceC22132o
    @InterfaceC22181t
    public static final void b(@Y61.k b.g gVar, int i12, @Y61.k Y41.l<? super com.avito.android.competitor_analytics.mvi.entity.a, kotlin.G0> lVar, @Y61.l androidx.compose.runtime.A a12, int i13) {
        v.a aVar;
        boolean z12;
        ActionButton actionButton;
        float f12;
        ?? r52;
        androidx.compose.runtime.B bE2 = a12.E(-1880170894);
        v.a aVar2 = androidx.compose.ui.v.f42878y1;
        float f13 = 16;
        h.a aVar3 = androidx.compose.ui.unit.h.f42849c;
        androidx.compose.ui.v vVarM = R1.m(aVar2, f13, 20, f13, 0.0f, 8);
        C20585k.f28659a.getClass();
        C20585k.l lVar2 = C20585k.f28662d;
        InterfaceC22215f.f39074a.getClass();
        androidx.compose.foundation.layout.I iA2 = androidx.compose.foundation.layout.H.a(lVar2, InterfaceC22215f.a.f39088n, bE2, 0);
        int i14 = bE2.f37888Q;
        O1 o1S = bE2.S();
        androidx.compose.ui.v vVarC = androidx.compose.ui.n.c(bE2, vVarM);
        InterfaceC22413h.f40789C1.getClass();
        Y41.a<InterfaceC22413h> aVar4 = InterfaceC22413h.a.f40791b;
        InterfaceC22078i<?> interfaceC22078i = bE2.f37890b;
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
        b.g.c cVar = gVar.f124502b;
        androidx.compose.ui.v vVarC2 = C21086w0.c(aVar2, cVar != null, null, null, new a(lVar, gVar), 6);
        C20585k.j jVarG = C20585k.g(7);
        i.b bVar = InterfaceC22215f.a.f39085k;
        C20568f2 c20568f2A = C20563e2.a(jVarG, bVar, bE2, 6);
        int i15 = bE2.f37888Q;
        O1 o1S2 = bE2.S();
        androidx.compose.ui.v vVarC3 = androidx.compose.ui.n.c(bE2, vVarC2);
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
        R3.b(pVar, bE2, c20568f2A);
        R3.b(pVar2, bE2, o1S2);
        if (bE2.f37887P || !kotlin.jvm.internal.L.f(bE2.t(), Integer.valueOf(i15))) {
            AK.c.y(i15, bE2, i15, pVar3);
        }
        R3.b(pVar4, bE2, vVarC3);
        C20576h2 c20576h2 = C20576h2.f28641a;
        com.akita.compose.theme.re23.b.f63983a.getClass();
        com.akita.compose.foundation.ui.p.b(gVar.f124501a, com.akita.compose.theme.re23.b.f63988f.f65239j, com.avito.android.bxcontent.mvi.entity.f.d(i12, c20576h2.a(aVar2, 1.0f, false), "metrics_item_title"), false, 0L, null, 0, 0, false, null, bE2, 0, 1016);
        bE2.C(2139477636);
        if (cVar == null) {
            aVar = aVar2;
            z12 = false;
        } else {
            aVar = aVar2;
            z12 = false;
            r.d(cVar.f124521a, C22501m2.a(aVar, "metrics_item_title_hint" + i12), bE2, 0);
            kotlin.G0 g02 = kotlin.G0.f406611a;
        }
        bE2.X(z12);
        bE2.X(true);
        float f14 = 8;
        androidx.compose.ui.v vVarM2 = R1.m(aVar, 0.0f, f14, 0.0f, 0.0f, 13);
        C20568f2 c20568f2A2 = C20563e2.a(C20585k.g(f13), bVar, bE2, 6);
        int i16 = bE2.f37888Q;
        O1 o1S3 = bE2.S();
        androidx.compose.ui.v vVarC4 = androidx.compose.ui.n.c(bE2, vVarM2);
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
        R3.b(pVar, bE2, c20568f2A2);
        R3.b(pVar2, bE2, o1S3);
        if (bE2.f37887P || !kotlin.jvm.internal.L.f(bE2.t(), Integer.valueOf(i16))) {
            AK.c.y(i16, bE2, i16, pVar3);
        }
        R3.b(pVar4, bE2, vVarC4);
        b.g.a aVar5 = gVar.f124503c;
        a(aVar5.f124508a, aVar5.f124509b, aVar5.f124510c, AK.c.g(i12, "metrics_current"), c20576h2.a(aVar, 1.0f, true), bE2, 512);
        b.g.a aVar6 = gVar.f124504d;
        a(aVar6.f124508a, aVar6.f124509b, aVar6.f124510c, AK.c.g(i12, "metrics_micromarket"), c20576h2.a(aVar, 1.0f, true), bE2, 512);
        bE2.X(true);
        bE2.C(-359395516);
        AttributedText attributedText = gVar.f124505e;
        if (attributedText != null) {
            r.a(attributedText, lVar, R1.m(aVar, 0.0f, f13, 0.0f, 0.0f, 13), bE2, ((i13 >> 3) & 112) | 392);
            kotlin.G0 g03 = kotlin.G0.f406611a;
        }
        bE2.X(false);
        bE2.C(-359387888);
        ActionButton actionButton2 = gVar.f124506f;
        if (actionButton2 == null) {
            actionButton = actionButton2;
            r52 = 0;
            f12 = f14;
        } else {
            actionButton = actionButton2;
            f12 = f14;
            com.akita.compose.component.button.m.c(actionButton2.f124315a, new b(lVar, actionButton2), com.akita.compose.theme.re23.b.c(bE2).g0(), com.avito.android.bxcontent.mvi.entity.f.d(i12, R1.m(aVar, 0.0f, f13, 0.0f, 0.0f, 13), "metrics_item_button"), null, null, null, false, false, null, bE2, 512, 1008);
            kotlin.G0 g04 = kotlin.G0.f406611a;
            r52 = 0;
        }
        bE2.X(r52);
        com.akita.compose.foundation.ui.g.a(actionButton == null ? 4 : f12, null, bE2, r52);
        bE2.X(true);
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new c(gVar, i12, lVar, i13);
        }
    }
}
