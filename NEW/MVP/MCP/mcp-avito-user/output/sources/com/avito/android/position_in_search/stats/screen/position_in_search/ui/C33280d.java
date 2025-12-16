package com.avito.android.position_in_search.stats.screen.position_in_search.ui;

import androidx.compose.foundation.layout.C20588k2;
import androidx.compose.foundation.layout.R1;
import androidx.compose.runtime.C22039c2;
import androidx.compose.runtime.InterfaceC22132o;
import androidx.compose.runtime.InterfaceC22181t;
import androidx.compose.ui.platform.C22501m2;
import androidx.compose.ui.unit.h;
import androidx.compose.ui.v;
import c90.c;
import kotlin.Metadata;

/* compiled from: PositionInSearchAdviceBanner.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_position-in-search_stats_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.position_in_search.stats.screen.position_in_search.ui.d, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C33280d {
    @InterfaceC22132o
    @InterfaceC22181t
    public static final void a(@Y61.k c.a aVar, @Y61.k Y41.l lVar, boolean z12, @Y61.l androidx.compose.runtime.A a12, int i12) {
        androidx.compose.runtime.B bE2 = a12.E(-1613026222);
        v.a aVar2 = androidx.compose.ui.v.f42878y1;
        com.akita.compose.theme.re23.b.f63983a.getClass();
        com.akita.compose.component.banner.h f66889a = com.akita.compose.theme.re23.b.b(bE2).getF66889a();
        float f12 = 16;
        h.a aVar3 = androidx.compose.ui.unit.h.f42849c;
        float f13 = 20;
        com.akita.compose.component.banner.h hVarA = com.akita.compose.component.banner.h.a(f66889a, R1.b(f13, f12), null, com.akita.compose.component.close_button.c.a(com.akita.compose.theme.re23.b.b(bE2).getF66889a().f60472j, f12), R1.d(24, f12, f13, 26), 14846);
        if (!z12) {
            com.akita.compose.foundation.ui.g.a(f12, null, bE2, 6);
            com.akita.compose.component.banner.g.c(hVarA, C22501m2.a(androidx.compose.ui.draw.k.a(R1.k(10, 0.0f, 2, C20588k2.d(aVar2, 1.0f)), hVarA.f60464b), "advice_banner_container"), null, null, null, 0.0f, new C33276a(lVar, aVar), androidx.compose.runtime.internal.r.c(916888279, new C33278b(aVar), bE2), bE2, com.akita.compose.component.banner.h.f60462o | 12582912, 60);
        }
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new C33279c(aVar, lVar, z12, aVar2, i12);
        }
    }
}
