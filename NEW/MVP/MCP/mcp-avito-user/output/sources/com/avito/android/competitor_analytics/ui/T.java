package com.avito.android.competitor_analytics.ui;

import androidx.compose.foundation.layout.C20585k;
import androidx.compose.foundation.layout.C20588k2;
import androidx.compose.foundation.layout.R1;
import androidx.compose.runtime.C22039c2;
import androidx.compose.runtime.C22190v;
import androidx.compose.runtime.InterfaceC22132o;
import androidx.compose.runtime.InterfaceC22181t;
import androidx.compose.runtime.O1;
import androidx.compose.runtime.R3;
import androidx.compose.ui.InterfaceC22215f;
import androidx.compose.ui.node.InterfaceC22413h;
import androidx.compose.ui.platform.C22501m2;
import androidx.compose.ui.unit.h;
import androidx.compose.ui.v;
import com.avito.android.competitor_analytics.mvi.entity.b;
import kotlin.Metadata;
import kotlin.collections.C42745f0;

/* compiled from: CompetitorAnalyticsMetrics.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_competitor-analytics_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class T {
    @InterfaceC22132o
    @InterfaceC22181t
    public static final void a(@Y61.l b.f fVar, @Y61.k Y41.l lVar, @Y61.l androidx.compose.runtime.A a12, int i12) {
        androidx.compose.runtime.B bE2 = a12.E(184598031);
        v.a aVar = androidx.compose.ui.v.f42878y1;
        if (fVar == null) {
            C22039c2 c22039c2Z = bE2.Z();
            if (c22039c2Z != null) {
                c22039c2Z.f38184d = new S(fVar, lVar, aVar, i12);
                return;
            }
            return;
        }
        h.a aVar2 = androidx.compose.ui.unit.h.f42849c;
        androidx.compose.ui.v vVarA = C22501m2.a(R1.m(C20588k2.d(aVar, 1.0f), 0.0f, 36, 0.0f, 0.0f, 13), "metrics_container");
        C20585k.f28659a.getClass();
        C20585k.l lVar2 = C20585k.f28662d;
        InterfaceC22215f.f39074a.getClass();
        androidx.compose.foundation.layout.I iA2 = androidx.compose.foundation.layout.H.a(lVar2, InterfaceC22215f.a.f39088n, bE2, 0);
        int i13 = bE2.f37888Q;
        O1 o1S = bE2.S();
        androidx.compose.ui.v vVarC = androidx.compose.ui.n.c(bE2, vVarA);
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
        R3.b(InterfaceC22413h.a.f40796g, bE2, iA2);
        R3.b(InterfaceC22413h.a.f40795f, bE2, o1S);
        Y41.p<InterfaceC22413h, Integer, kotlin.G0> pVar = InterfaceC22413h.a.f40799j;
        if (bE2.f37887P || !kotlin.jvm.internal.L.f(bE2.t(), Integer.valueOf(i13))) {
            AK.c.y(i13, bE2, i13, pVar);
        }
        R3.b(InterfaceC22413h.a.f40793d, bE2, vVarC);
        androidx.compose.foundation.layout.K k12 = androidx.compose.foundation.layout.K.f28344a;
        com.akita.compose.theme.re23.b.f63983a.getClass();
        com.akita.compose.foundation.ui.p.b(fVar.f124499a, com.akita.compose.theme.re23.b.f63988f.f65236g, C22501m2.a(R1.k(16, 0.0f, 2, aVar), "metrics_title"), false, 0L, null, 0, 0, false, null, bE2, 384, 1016);
        bE2.C(495111528);
        int i14 = 0;
        for (Object obj : fVar.f124500b) {
            int i15 = i14 + 1;
            if (i14 < 0) {
                C42745f0.H0();
                throw null;
            }
            b.g gVar = (b.g) obj;
            if (gVar.f124507g == null) {
                bE2.C(-1385744321);
                C29548u.b(gVar, i14, lVar, bE2, ((i12 << 3) & 896) | 8);
                bE2.X(false);
            } else {
                bE2.C(-1385625343);
                C29534i.a(gVar, i14, lVar, bE2, ((i12 << 3) & 896) | 8);
                bE2.X(false);
            }
            i14 = i15;
        }
        C22039c2 c22039c2N = com.avito.android.actions_sheet.a.n(bE2, false, true);
        if (c22039c2N != null) {
            c22039c2N.f38184d = new Q(fVar, lVar, aVar, i12);
        }
    }
}
