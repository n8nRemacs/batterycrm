package com.avito.android.cpx_promo_geo.screens.region_sheet.ui.compose.search;

import Y41.p;
import Y61.k;
import Y61.l;
import androidx.compose.foundation.layout.C20585k;
import androidx.compose.foundation.layout.C20588k2;
import androidx.compose.foundation.layout.H;
import androidx.compose.foundation.layout.I;
import androidx.compose.foundation.layout.K;
import androidx.compose.foundation.layout.R1;
import androidx.compose.runtime.A;
import androidx.compose.runtime.B;
import androidx.compose.runtime.C22039c2;
import androidx.compose.runtime.C22190v;
import androidx.compose.runtime.InterfaceC22132o;
import androidx.compose.runtime.InterfaceC22181t;
import androidx.compose.runtime.O1;
import androidx.compose.runtime.R3;
import androidx.compose.ui.InterfaceC22215f;
import androidx.compose.ui.i;
import androidx.compose.ui.n;
import androidx.compose.ui.node.InterfaceC22413h;
import androidx.compose.ui.unit.h;
import androidx.compose.ui.v;
import com.akita.compose.component.button.m;
import com.avito.android.cpx_promo_geo.screens.region_sheet.mvi.entity.RegionSheetState;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: RegionSheetSearchError.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_cpx-promo-geo_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class b {
    @InterfaceC22132o
    @InterfaceC22181t
    public static final void a(@k RegionSheetState.SearchState.a.C3812a c3812a, @k Y41.a aVar, @l v.a aVar2, @l A a12, int i12) {
        int i13;
        v.a aVar3;
        int i14;
        v vVar;
        int i15;
        B b12;
        boolean z12;
        v.a aVar4;
        B bE2 = a12.E(382061706);
        if ((i12 & 112) == 0) {
            i13 = (bE2.u(aVar) ? 32 : 16) | i12;
        } else {
            i13 = i12;
        }
        int i16 = i13 | 384;
        if ((i16 & 731) == 146 && bE2.c()) {
            bE2.f();
            aVar4 = aVar2;
            b12 = bE2;
        } else {
            v.a aVar5 = v.f42878y1;
            InterfaceC22215f.f39074a.getClass();
            i.a aVar6 = InterfaceC22215f.a.f39089o;
            v vVarD = C20588k2.d(aVar5, 1.0f);
            float f12 = 16;
            h.a aVar7 = androidx.compose.ui.unit.h.f42849c;
            v vVarK = R1.k(f12, 0.0f, 2, vVarD);
            C20585k.f28659a.getClass();
            I iA2 = H.a(C20585k.f28662d, aVar6, bE2, 48);
            int i17 = bE2.f37888Q;
            O1 o1S = bE2.S();
            v vVarC = n.c(bE2, vVarK);
            InterfaceC22413h.f40789C1.getClass();
            Y41.a<InterfaceC22413h> aVar8 = InterfaceC22413h.a.f40791b;
            if (bE2.f37890b == null) {
                C22190v.b();
                throw null;
            }
            bE2.A();
            if (bE2.f37887P) {
                bE2.b(aVar8);
            } else {
                bE2.d();
            }
            R3.b(InterfaceC22413h.a.f40796g, bE2, iA2);
            R3.b(InterfaceC22413h.a.f40795f, bE2, o1S);
            p<InterfaceC22413h, Integer, G0> pVar = InterfaceC22413h.a.f40799j;
            if (bE2.f37887P || !L.f(bE2.t(), Integer.valueOf(i17))) {
                AK.c.y(i17, bE2, i17, pVar);
            }
            R3.b(InterfaceC22413h.a.f40793d, bE2, vVarC);
            K k12 = K.f28344a;
            com.akita.compose.foundation.ui.g.a(f12, null, bE2, 6);
            bE2.C(-1240156034);
            wZ.l lVar = c3812a.f128424a;
            if (lVar == null) {
                i14 = 12;
                i15 = 6;
                vVar = null;
                aVar3 = aVar5;
            } else {
                float f13 = 100;
                aVar3 = aVar5;
                com.avito.android.mnz_common.compose.i.b(lVar, f13, f13, "region_sheet_search_error_image", null, null, null, null, bE2, 3512, 496);
                i14 = 12;
                vVar = null;
                i15 = 6;
                com.akita.compose.foundation.ui.g.a(12, null, bE2, 6);
            }
            bE2.X(false);
            com.akita.compose.theme.re23.b.f63983a.getClass();
            com.akita.compose.theme.re23.i iVar = com.akita.compose.theme.re23.b.f63988f;
            com.akita.compose.foundation.ui.p.b(c3812a.f128425b, iVar.f65239j, null, false, 0L, null, 0, 0, false, null, bE2, 0, 1020);
            com.akita.compose.foundation.ui.g.a(2, vVar, bE2, i15);
            com.akita.compose.foundation.ui.p.b(c3812a.f128426c, iVar.f65241l, null, false, 0L, null, 0, 0, false, null, bE2, 0, 1020);
            bE2.C(-1240139292);
            String str = c3812a.f128427d;
            if (str == null) {
                z12 = false;
                b12 = bE2;
            } else {
                com.akita.compose.foundation.ui.g.a(i14, vVar, bE2, i15);
                b12 = bE2;
                m.c(str, aVar, com.akita.compose.theme.re23.b.c(bE2).r2(), null, null, null, null, false, false, null, bE2, (i16 & 112) | 512, 1016);
                z12 = false;
            }
            b12.X(z12);
            b12.X(true);
            aVar4 = aVar3;
        }
        C22039c2 c22039c2Z = b12.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new a(c3812a, aVar, aVar4, i12);
        }
    }
}
