package com.avito.android.competitor_analytics.ui;

import androidx.compose.runtime.C22039c2;
import androidx.compose.runtime.C22066f2;
import androidx.compose.runtime.InterfaceC22132o;
import androidx.compose.runtime.InterfaceC22181t;
import androidx.compose.ui.platform.C22501m2;
import com.avito.android.competitor_analytics.mvi.entity.a;
import com.avito.android.competitor_analytics.mvi.entity.b;
import kotlin.C42829l0;
import kotlin.Metadata;

/* compiled from: CompetitorAnalyticsNavBar.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_competitor-analytics_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class V {

    /* compiled from: CompetitorAnalyticsNavBar.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends kotlin.jvm.internal.N implements Y41.a<kotlin.G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.l<com.avito.android.competitor_analytics.mvi.entity.a, kotlin.G0> f124701l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ com.avito.android.competitor_analytics.mvi.entity.a f124702m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(Y41.l<? super com.avito.android.competitor_analytics.mvi.entity.a, kotlin.G0> lVar, com.avito.android.competitor_analytics.mvi.entity.a aVar) {
            super(0);
            this.f124701l = lVar;
            this.f124702m = aVar;
        }

        @Override // Y41.a
        public final kotlin.G0 invoke() {
            this.f124701l.invoke(this.f124702m);
            return kotlin.G0.f406611a;
        }
    }

    /* compiled from: CompetitorAnalyticsNavBar.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/akita/compose/component/navbar/i;", "Lkotlin/G0;", "invoke", "(Lcom/akita/compose/component/navbar/i;Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends kotlin.jvm.internal.N implements Y41.q<com.akita.compose.component.navbar.i, androidx.compose.runtime.A, Integer, kotlin.G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ com.avito.android.competitor_analytics.mvi.entity.b f124703l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ Y41.l<com.avito.android.competitor_analytics.mvi.entity.a, kotlin.G0> f124704m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Y41.l lVar, com.avito.android.competitor_analytics.mvi.entity.b bVar) {
            super(3);
            this.f124703l = bVar;
            this.f124704m = lVar;
        }

        @Override // Y41.q
        public final kotlin.G0 invoke(com.akita.compose.component.navbar.i iVar, androidx.compose.runtime.A a12, Integer num) {
            kotlin.G0 g02;
            com.akita.compose.component.navbar.i iVar2 = iVar;
            androidx.compose.runtime.A a13 = a12;
            int iIntValue = num.intValue();
            if ((iIntValue & 14) == 0) {
                iIntValue |= a13.B(iVar2) ? 4 : 2;
            }
            if ((iIntValue & 91) == 18 && a13.c()) {
                a13.f();
            } else {
                com.avito.android.competitor_analytics.mvi.entity.b bVar = this.f124703l;
                b.g gVar = bVar.f124479j;
                b.g.c cVar = gVar != null ? gVar.f124502b : null;
                a13.C(633008248);
                Y41.l<com.avito.android.competitor_analytics.mvi.entity.a, kotlin.G0> lVar = this.f124704m;
                if (cVar == null) {
                    g02 = null;
                } else {
                    com.akita.compose.component.navbar.h.b(iVar2, new W(lVar, cVar), null, androidx.compose.runtime.internal.r.c(623449514, new X(cVar), a13), a13, (iIntValue & 14) | 3072, 2);
                    g02 = kotlin.G0.f406611a;
                }
                a13.h();
                if (g02 == null) {
                    b.d dVar = bVar.f124472c;
                    String str = dVar != null ? dVar.f124493a : null;
                    if (str != null) {
                        com.akita.compose.component.navbar.h.b(iVar2, new Y(lVar, bVar), null, androidx.compose.runtime.internal.r.c(-1298498842, new Z(str), a13), a13, (iIntValue & 14) | 3072, 2);
                    }
                }
            }
            return kotlin.G0.f406611a;
        }
    }

    /* compiled from: CompetitorAnalyticsNavBar.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "(Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends kotlin.jvm.internal.N implements Y41.p<androidx.compose.runtime.A, Integer, kotlin.G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ String f124705l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ com.avito.android.competitor_analytics.mvi.entity.b f124706m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str, com.avito.android.competitor_analytics.mvi.entity.b bVar) {
            super(2);
            this.f124705l = str;
            this.f124706m = bVar;
        }

        @Override // Y41.p
        public final kotlin.G0 invoke(androidx.compose.runtime.A a12, Integer num) {
            androidx.compose.runtime.A a13 = a12;
            if ((num.intValue() & 11) == 2 && a13.c()) {
                a13.f();
            } else {
                com.avito.android.competitor_analytics.mvi.entity.b bVar = this.f124706m;
                b.h.a aVar = bVar.f124473d;
                P.a(this.f124705l, aVar != null ? aVar.f124528c : null, bVar.f124482m, bVar.f124483n, a13, 0);
            }
            return kotlin.G0.f406611a;
        }
    }

    /* compiled from: CompetitorAnalyticsNavBar.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class d extends kotlin.jvm.internal.N implements Y41.p<androidx.compose.runtime.A, Integer, kotlin.G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ com.avito.android.competitor_analytics.mvi.entity.b f124707l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ Y41.l<com.avito.android.competitor_analytics.mvi.entity.a, kotlin.G0> f124708m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public d(com.avito.android.competitor_analytics.mvi.entity.b bVar, Y41.l<? super com.avito.android.competitor_analytics.mvi.entity.a, kotlin.G0> lVar, int i12) {
            super(2);
            this.f124707l = bVar;
            this.f124708m = lVar;
        }

        @Override // Y41.p
        public final kotlin.G0 invoke(androidx.compose.runtime.A a12, Integer num) {
            num.intValue();
            int iA2 = C22066f2.a(9);
            V.a(this.f124707l, this.f124708m, a12, iA2);
            return kotlin.G0.f406611a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC22132o
    @InterfaceC22181t
    public static final void a(@Y61.k com.avito.android.competitor_analytics.mvi.entity.b bVar, @Y61.k Y41.l<? super com.avito.android.competitor_analytics.mvi.entity.a, kotlin.G0> lVar, @Y61.l androidx.compose.runtime.A a12, int i12) {
        C42829l0 c42829l0;
        androidx.compose.runtime.B bE2 = a12.E(1074648768);
        b.g gVar = bVar.f124479j;
        if (gVar == null) {
            com.akita.compose.theme.re23.b.f63983a.getClass();
            com.akita.compose.theme.re23.b.f63985c.getClass();
            c42829l0 = new C42829l0(bVar.f124471b, Integer.valueOf(com.akita.compose.theme.re23.e.f64237O3), a.f.f124461a);
        } else {
            com.akita.compose.theme.re23.b.f63983a.getClass();
            com.akita.compose.theme.re23.b.f63985c.getClass();
            c42829l0 = new C42829l0(gVar.f124501a, Integer.valueOf(com.akita.compose.theme.re23.e.f64233O), a.C3711a.f124456a);
        }
        String str = (String) c42829l0.f406871b;
        int iIntValue = ((Number) c42829l0.f406872c).intValue();
        com.avito.android.competitor_analytics.mvi.entity.a aVar = (com.avito.android.competitor_analytics.mvi.entity.a) c42829l0.f406873d;
        androidx.compose.ui.v vVarA = C22501m2.a(androidx.compose.ui.v.f42878y1, "nav_bar");
        com.akita.compose.theme.re23.b.f63983a.getClass();
        com.akita.compose.component.navbar.t.c(vVarA, com.akita.compose.theme.re23.b.n(bE2).getF66454b(), new a(lVar, aVar), iIntValue, androidx.compose.runtime.internal.r.c(1966207393, new b(lVar, bVar), bE2), androidx.compose.runtime.internal.r.c(1225924674, new c(str, bVar), bE2), bE2, 221190, 0);
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new d(bVar, lVar, i12);
        }
    }
}
