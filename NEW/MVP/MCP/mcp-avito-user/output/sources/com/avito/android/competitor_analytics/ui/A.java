package com.avito.android.competitor_analytics.ui;

import androidx.compose.foundation.layout.C20563e2;
import androidx.compose.foundation.layout.C20568f2;
import androidx.compose.foundation.layout.C20576h2;
import androidx.compose.foundation.layout.C20585k;
import androidx.compose.foundation.layout.C20588k2;
import androidx.compose.foundation.layout.R1;
import androidx.compose.runtime.C22039c2;
import androidx.compose.runtime.C22066f2;
import androidx.compose.runtime.C22126m3;
import androidx.compose.runtime.C22187u0;
import androidx.compose.runtime.C22190v;
import androidx.compose.runtime.InterfaceC22078i;
import androidx.compose.runtime.InterfaceC22132o;
import androidx.compose.runtime.InterfaceC22181t;
import androidx.compose.runtime.InterfaceC22204y1;
import androidx.compose.runtime.O1;
import androidx.compose.runtime.R3;
import androidx.compose.ui.InterfaceC22215f;
import androidx.compose.ui.i;
import androidx.compose.ui.layout.InterfaceC22365i0;
import androidx.compose.ui.node.InterfaceC22413h;
import androidx.compose.ui.platform.C22501m2;
import androidx.compose.ui.unit.h;
import androidx.compose.ui.v;
import com.avito.android.competitor_analytics.domain.model.ChartColor;
import com.avito.android.competitor_analytics.mvi.entity.a;
import com.avito.android.competitor_analytics.mvi.entity.b;
import com.avito.android.remote.model.text.AttributedText;
import kotlin.C42729a0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: CompetitorAnalyticsDynamicsIndicator.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002¨\u0006\u0004²\u0006\u0018\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u00008\nX\u008a\u0084\u0002"}, d2 = {"Lkotlin/Function1;", "Lcom/avito/android/competitor_analytics/mvi/entity/a;", "Lkotlin/G0;", "onActionState", "_avito_competitor-analytics_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class A {

    /* compiled from: CompetitorAnalyticsDynamicsIndicator.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a extends kotlin.jvm.internal.N implements Y41.p<androidx.compose.runtime.A, Integer, kotlin.G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ b.g f124574l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(b.g gVar, int i12) {
            super(2);
            this.f124574l = gVar;
        }

        @Override // Y41.p
        public final kotlin.G0 invoke(androidx.compose.runtime.A a12, Integer num) {
            num.intValue();
            int iA2 = C22066f2.a(9);
            A.a(this.f124574l, a12, iA2);
            return kotlin.G0.f406611a;
        }
    }

    /* compiled from: CompetitorAnalyticsDynamicsIndicator.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.competitor_analytics.ui.CompetitorAnalyticsDynamicsIndicatorKt$CompetitorAnalyticsDynamicsIndicator$1$1$1", f = "CompetitorAnalyticsDynamicsIndicator.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements Y41.p<kotlinx.coroutines.T, Continuation<? super kotlin.G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public final /* synthetic */ b.g f124575q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ InterfaceC22204y1 f124576r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(b.g gVar, InterfaceC22204y1 interfaceC22204y1, Continuation continuation) {
            super(2, continuation);
            this.f124575q = gVar;
            this.f124576r = interfaceC22204y1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<kotlin.G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return new b(this.f124575q, this.f124576r, continuation);
        }

        @Override // Y41.p
        public final Object invoke(kotlinx.coroutines.T t12, Continuation<? super kotlin.G0> continuation) {
            return ((b) create(t12, continuation)).invokeSuspend(kotlin.G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            ((Y41.l) this.f124576r.getF42167b()).invoke(new a.d(this.f124575q.f124507g.f124513c));
            return kotlin.G0.f406611a;
        }
    }

    /* compiled from: CompetitorAnalyticsDynamicsIndicator.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends kotlin.jvm.internal.N implements Y41.a<kotlin.G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ b.g f124577l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ InterfaceC22204y1 f124578m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(b.g gVar, InterfaceC22204y1 interfaceC22204y1) {
            super(0);
            this.f124577l = gVar;
            this.f124578m = interfaceC22204y1;
        }

        @Override // Y41.a
        public final kotlin.G0 invoke() {
            ((Y41.l) this.f124578m.getF42167b()).invoke(new a.e(this.f124577l.f124507g.f124513c));
            return kotlin.G0.f406611a;
        }
    }

    /* compiled from: CompetitorAnalyticsDynamicsIndicator.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class d extends kotlin.jvm.internal.N implements Y41.p<androidx.compose.runtime.A, Integer, kotlin.G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ b.g f124579l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ Y41.l<com.avito.android.competitor_analytics.mvi.entity.a, kotlin.G0> f124580m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ int f124581n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public d(b.g gVar, Y41.l<? super com.avito.android.competitor_analytics.mvi.entity.a, kotlin.G0> lVar, int i12) {
            super(2);
            this.f124579l = gVar;
            this.f124580m = lVar;
            this.f124581n = i12;
        }

        @Override // Y41.p
        public final kotlin.G0 invoke(androidx.compose.runtime.A a12, Integer num) {
            num.intValue();
            int iA2 = C22066f2.a(this.f124581n | 1);
            A.b(this.f124579l, this.f124580m, a12, iA2);
            return kotlin.G0.f406611a;
        }
    }

    @InterfaceC22132o
    @InterfaceC22181t
    public static final void a(b.g gVar, androidx.compose.runtime.A a12, int i12) {
        C20576h2 c20576h2;
        androidx.compose.ui.graphics.T tA2;
        b.g.C3713b c3713b;
        boolean z12;
        int i13;
        Y41.p<InterfaceC22413h, Integer, kotlin.G0> pVar;
        Y41.p<InterfaceC22413h, androidx.compose.ui.v, kotlin.G0> pVar2;
        int i14;
        boolean z13;
        ChartColor chartColor;
        ChartColor chartColor2;
        androidx.compose.runtime.B bE2 = a12.E(934408657);
        v.a aVar = androidx.compose.ui.v.f42878y1;
        float f12 = 16;
        h.a aVar2 = androidx.compose.ui.unit.h.f42849c;
        androidx.compose.ui.v vVarM = R1.m(aVar, f12, 0.0f, f12, 0.0f, 10);
        float f13 = 2;
        C20585k.f28659a.getClass();
        C20585k.j jVarG = C20585k.g(f13);
        InterfaceC22215f.f39074a.getClass();
        i.b bVar = InterfaceC22215f.a.f39085k;
        C20568f2 c20568f2A = C20563e2.a(jVarG, bVar, bE2, 6);
        int i15 = bE2.f37888Q;
        O1 o1S = bE2.S();
        androidx.compose.ui.v vVarC = androidx.compose.ui.n.c(bE2, vVarM);
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
        Y41.p<InterfaceC22413h, InterfaceC22365i0, kotlin.G0> pVar3 = InterfaceC22413h.a.f40796g;
        R3.b(pVar3, bE2, c20568f2A);
        Y41.p<InterfaceC22413h, androidx.compose.runtime.U, kotlin.G0> pVar4 = InterfaceC22413h.a.f40795f;
        R3.b(pVar4, bE2, o1S);
        Y41.p<InterfaceC22413h, Integer, kotlin.G0> pVar5 = InterfaceC22413h.a.f40799j;
        if (bE2.f37887P || !kotlin.jvm.internal.L.f(bE2.t(), Integer.valueOf(i15))) {
            AK.c.y(i15, bE2, i15, pVar5);
        }
        Y41.p<InterfaceC22413h, androidx.compose.ui.v, kotlin.G0> pVar6 = InterfaceC22413h.a.f40793d;
        R3.b(pVar6, bE2, vVarC);
        C20576h2 c20576h22 = C20576h2.f28641a;
        androidx.compose.ui.v vVarA = c20576h22.a(aVar, 1.0f, true);
        i.a aVar4 = InterfaceC22215f.a.f39088n;
        C20585k.l lVar = C20585k.f28662d;
        androidx.compose.foundation.layout.I iA2 = androidx.compose.foundation.layout.H.a(lVar, aVar4, bE2, 48);
        int i16 = bE2.f37888Q;
        O1 o1S2 = bE2.S();
        androidx.compose.ui.v vVarC2 = androidx.compose.ui.n.c(bE2, vVarA);
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
        R3.b(pVar3, bE2, iA2);
        R3.b(pVar4, bE2, o1S2);
        if (bE2.f37887P || !kotlin.jvm.internal.L.f(bE2.t(), Integer.valueOf(i16))) {
            AK.c.y(i16, bE2, i16, pVar5);
        }
        R3.b(pVar6, bE2, vVarC2);
        androidx.compose.foundation.layout.K k12 = androidx.compose.foundation.layout.K.f28344a;
        float f14 = 6;
        C20568f2 c20568f2A2 = C20563e2.a(C20585k.g(f14), bVar, bE2, 6);
        int i17 = bE2.f37888Q;
        O1 o1S3 = bE2.S();
        androidx.compose.ui.v vVarC3 = androidx.compose.ui.n.c(bE2, aVar);
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
        R3.b(pVar3, bE2, c20568f2A2);
        R3.b(pVar4, bE2, o1S3);
        if (bE2.f37887P || !kotlin.jvm.internal.L.f(bE2.t(), Integer.valueOf(i17))) {
            AK.c.y(i17, bE2, i17, pVar5);
        }
        R3.b(pVar6, bE2, vVarC3);
        r.e(gVar.f124503c.f124508a, C22501m2.a(c20576h22.a(aVar, 1.0f, false), "dynamics_indicator_current_title"), bE2, 0);
        b.g.C3713b c3713b2 = gVar.f124507g;
        if (c3713b2 == null || (chartColor2 = c3713b2.f124511a) == null) {
            c20576h2 = c20576h22;
            tA2 = null;
        } else {
            c20576h2 = c20576h22;
            tA2 = androidx.compose.ui.graphics.T.a(chartColor2.f124329b);
        }
        bE2.C(-1499586837);
        if (tA2 == null) {
            z12 = false;
            c3713b = c3713b2;
        } else {
            c3713b = c3713b2;
            r.c(48, tA2.f39331a, bE2, C22501m2.a(aVar, "dynamics_indicator_current_circle"));
            kotlin.G0 g02 = kotlin.G0.f406611a;
            z12 = false;
        }
        bE2.X(z12);
        bE2.X(true);
        b.g.a aVar5 = gVar.f124503c;
        float f15 = 4;
        r.f(aVar5.f124509b, C22501m2.a(R1.m(aVar, 0.0f, f15, 0.0f, 0.0f, 13), "dynamics_indicator_current_total"), bE2, 48);
        bE2.C(-1246528682);
        AttributedText attributedText = aVar5.f124510c;
        if (attributedText == null) {
            i13 = 56;
        } else {
            i13 = 56;
            r.b(attributedText, R1.m(aVar, 0.0f, f13, 0.0f, 0.0f, 13), bE2, 56);
            kotlin.G0 g03 = kotlin.G0.f406611a;
        }
        bE2.X(false);
        bE2.X(true);
        androidx.compose.ui.v vVarA2 = c20576h2.a(aVar, 1.0f, true);
        androidx.compose.foundation.layout.I iA3 = androidx.compose.foundation.layout.H.a(lVar, InterfaceC22215f.a.f39090p, bE2, 48);
        int i18 = bE2.f37888Q;
        O1 o1S4 = bE2.S();
        androidx.compose.ui.v vVarC4 = androidx.compose.ui.n.c(bE2, vVarA2);
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
        R3.b(pVar3, bE2, iA3);
        R3.b(pVar4, bE2, o1S4);
        if (bE2.f37887P || !kotlin.jvm.internal.L.f(bE2.t(), Integer.valueOf(i18))) {
            pVar = pVar5;
            AK.c.y(i18, bE2, i18, pVar);
            pVar2 = pVar6;
        } else {
            pVar2 = pVar6;
            pVar = pVar5;
        }
        R3.b(pVar2, bE2, vVarC4);
        C20568f2 c20568f2A3 = C20563e2.a(C20585k.g(f14), bVar, bE2, 6);
        int i19 = bE2.f37888Q;
        O1 o1S5 = bE2.S();
        androidx.compose.ui.v vVarC5 = androidx.compose.ui.n.c(bE2, aVar);
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
        R3.b(pVar3, bE2, c20568f2A3);
        R3.b(pVar4, bE2, o1S5);
        if (bE2.f37887P || !kotlin.jvm.internal.L.f(bE2.t(), Integer.valueOf(i19))) {
            AK.c.y(i19, bE2, i19, pVar);
        }
        R3.b(pVar2, bE2, vVarC5);
        androidx.compose.ui.graphics.T tA3 = (c3713b == null || (chartColor = c3713b.f124512b) == null) ? null : androidx.compose.ui.graphics.T.a(chartColor.f124329b);
        bE2.C(-1499556882);
        if (tA3 == null) {
            z13 = false;
            i14 = 48;
        } else {
            i14 = 48;
            r.c(48, tA3.f39331a, bE2, C22501m2.a(aVar, "dynamics_indicator_micromarket_circle"));
            kotlin.G0 g04 = kotlin.G0.f406611a;
            z13 = false;
        }
        bE2.X(z13);
        int i22 = i13;
        b.g.a aVar6 = gVar.f124504d;
        r.e(aVar6.f124508a, C22501m2.a(aVar, "dynamics_indicator_micromarket_title"), bE2, i14);
        bE2.X(true);
        r.f(aVar6.f124509b, C22501m2.a(R1.m(aVar, 0.0f, f15, 0.0f, 0.0f, 13), "dynamics_indicator_micromarket_total"), bE2, 48);
        bE2.C(-1246491882);
        AttributedText attributedText2 = aVar6.f124510c;
        if (attributedText2 != null) {
            r.b(attributedText2, R1.m(aVar, 0.0f, f13, 0.0f, 0.0f, 13), bE2, i22);
            kotlin.G0 g05 = kotlin.G0.f406611a;
        }
        bE2.X(false);
        bE2.X(true);
        bE2.X(true);
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new a(gVar, i12);
        }
    }

    @InterfaceC22132o
    @InterfaceC22181t
    public static final void b(@Y61.k b.g gVar, @Y61.k Y41.l<? super com.avito.android.competitor_analytics.mvi.entity.a, kotlin.G0> lVar, @Y61.l androidx.compose.runtime.A a12, int i12) {
        androidx.compose.runtime.B bE2 = a12.E(1536421309);
        InterfaceC22204y1 interfaceC22204y1M = C22126m3.m(lVar, bE2);
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
        Y41.p<InterfaceC22413h, Integer, kotlin.G0> pVar = InterfaceC22413h.a.f40799j;
        if (bE2.f37887P || !kotlin.jvm.internal.L.f(bE2.t(), Integer.valueOf(i13))) {
            AK.c.y(i13, bE2, i13, pVar);
        }
        R3.b(InterfaceC22413h.a.f40793d, bE2, vVarC);
        androidx.compose.foundation.layout.K k12 = androidx.compose.foundation.layout.K.f28344a;
        a(gVar, bE2, 8);
        bE2.C(657129091);
        b.g.C3713b c3713b = gVar.f124507g;
        if (c3713b != null) {
            C22187u0.d(new b(gVar, interfaceC22204y1M, null), bE2, kotlin.G0.f406611a);
            c cVar = new c(gVar, interfaceC22204y1M);
            androidx.compose.ui.v vVarD = C20588k2.d(aVar, 1.0f);
            float f12 = 10;
            h.a aVar3 = androidx.compose.ui.unit.h.f42849c;
            O.a(c3713b, cVar, R1.m(vVarD, f12, 24, f12, 0.0f, 8), bE2, 392);
        }
        bE2.X(false);
        bE2.C(657144862);
        AttributedText attributedText = gVar.f124505e;
        if (attributedText != null) {
            Y41.l lVar3 = (Y41.l) interfaceC22204y1M.getF42167b();
            float f13 = 16;
            h.a aVar4 = androidx.compose.ui.unit.h.f42849c;
            r.a(attributedText, lVar3, R1.m(aVar, f13, 24, f13, 0.0f, 8), bE2, 392);
        }
        C22039c2 c22039c2N = com.avito.android.actions_sheet.a.n(bE2, false, true);
        if (c22039c2N != null) {
            c22039c2N.f38184d = new d(gVar, lVar, i12);
        }
    }
}
