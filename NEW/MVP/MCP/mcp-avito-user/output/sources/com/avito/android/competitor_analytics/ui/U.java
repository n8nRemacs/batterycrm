package com.avito.android.competitor_analytics.ui;

import androidx.compose.foundation.layout.C20585k;
import androidx.compose.foundation.layout.C20588k2;
import androidx.compose.foundation.layout.R1;
import androidx.compose.runtime.C22039c2;
import androidx.compose.runtime.C22066f2;
import androidx.compose.runtime.C22190v;
import androidx.compose.runtime.InterfaceC22132o;
import androidx.compose.runtime.InterfaceC22181t;
import androidx.compose.runtime.O1;
import androidx.compose.runtime.R3;
import androidx.compose.ui.InterfaceC22215f;
import androidx.compose.ui.node.InterfaceC22413h;
import androidx.compose.ui.platform.C22501m2;
import androidx.compose.ui.unit.h;
import com.avito.android.competitor_analytics.mvi.entity.b;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42745f0;

/* compiled from: CompetitorAnalyticsMetricsV2.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_competitor-analytics_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class U {

    /* compiled from: CompetitorAnalyticsMetricsV2.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a extends kotlin.jvm.internal.N implements Y41.p<androidx.compose.runtime.A, Integer, kotlin.G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ List<b.g> f124695l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ Y41.l<com.avito.android.competitor_analytics.mvi.entity.a, kotlin.G0> f124696m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ int f124697n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(List list, int i12, Y41.l lVar) {
            super(2);
            this.f124695l = list;
            this.f124696m = lVar;
            this.f124697n = i12;
        }

        @Override // Y41.p
        public final kotlin.G0 invoke(androidx.compose.runtime.A a12, Integer num) {
            num.intValue();
            int iA2 = C22066f2.a(this.f124697n | 1);
            U.a(this.f124695l, this.f124696m, a12, iA2);
            return kotlin.G0.f406611a;
        }
    }

    /* compiled from: CompetitorAnalyticsMetricsV2.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b extends kotlin.jvm.internal.N implements Y41.p<androidx.compose.runtime.A, Integer, kotlin.G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ List<b.g> f124698l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ Y41.l<com.avito.android.competitor_analytics.mvi.entity.a, kotlin.G0> f124699m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ int f124700n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(List list, int i12, Y41.l lVar) {
            super(2);
            this.f124698l = list;
            this.f124699m = lVar;
            this.f124700n = i12;
        }

        @Override // Y41.p
        public final kotlin.G0 invoke(androidx.compose.runtime.A a12, Integer num) {
            num.intValue();
            int iA2 = C22066f2.a(this.f124700n | 1);
            U.a(this.f124698l, this.f124699m, a12, iA2);
            return kotlin.G0.f406611a;
        }
    }

    @InterfaceC22132o
    @InterfaceC22181t
    public static final void a(@Y61.l List<b.g> list, @Y61.k Y41.l<? super com.avito.android.competitor_analytics.mvi.entity.a, kotlin.G0> lVar, @Y61.l androidx.compose.runtime.A a12, int i12) {
        androidx.compose.runtime.B bE2 = a12.E(1411805487);
        List<b.g> list2 = list;
        if (list2 == null || list2.isEmpty()) {
            C22039c2 c22039c2Z = bE2.Z();
            if (c22039c2Z != null) {
                c22039c2Z.f38184d = new a(list, i12, lVar);
                return;
            }
            return;
        }
        h.a aVar = androidx.compose.ui.unit.h.f42849c;
        androidx.compose.ui.v vVarA = C22501m2.a(R1.m(C20588k2.d(androidx.compose.ui.v.f42878y1, 1.0f), 0.0f, 4, 0.0f, 0.0f, 13), "metrics_container_v2");
        C20585k.f28659a.getClass();
        C20585k.l lVar2 = C20585k.f28662d;
        InterfaceC22215f.f39074a.getClass();
        androidx.compose.foundation.layout.I iA2 = androidx.compose.foundation.layout.H.a(lVar2, InterfaceC22215f.a.f39088n, bE2, 0);
        int i13 = bE2.f37888Q;
        O1 o1S = bE2.S();
        androidx.compose.ui.v vVarC = androidx.compose.ui.n.c(bE2, vVarA);
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
        bE2.C(-292205980);
        int i14 = 0;
        for (Object obj : list) {
            int i15 = i14 + 1;
            if (i14 < 0) {
                C42745f0.H0();
                throw null;
            }
            b.g gVar = (b.g) obj;
            if (gVar.f124507g == null) {
                bE2.C(1053131971);
                C29548u.b(gVar, i14, lVar, bE2, ((i12 << 3) & 896) | 8);
                bE2.X(false);
            } else {
                bE2.C(1053250949);
                C29534i.a(gVar, i14, lVar, bE2, ((i12 << 3) & 896) | 8);
                bE2.X(false);
            }
            i14 = i15;
        }
        C22039c2 c22039c2N = com.avito.android.actions_sheet.a.n(bE2, false, true);
        if (c22039c2N != null) {
            c22039c2N.f38184d = new b(list, i12, lVar);
        }
    }
}
