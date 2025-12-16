package com.avito.android.vas_performance.screens.competitive.ui.compose.items;

import androidx.compose.runtime.A;
import androidx.compose.runtime.B;
import androidx.compose.runtime.C22039c2;
import androidx.compose.runtime.InterfaceC22132o;
import androidx.compose.runtime.InterfaceC22181t;
import androidx.compose.ui.platform.C22501m2;
import androidx.compose.ui.v;
import com.akita.compose.component.chips.ChipsDisplayType;
import java.util.List;
import kotlin.Metadata;

/* compiled from: CompetitiveVasV2Tabs.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_vas-performance_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class r {
    @InterfaceC22132o
    @InterfaceC22181t
    public static final void a(int i12, @Y61.k Y41.l lVar, @Y61.l A a12, @Y61.l v vVar, @Y61.k List list) {
        B bE2 = a12.E(-275926332);
        if (list.size() < 2) {
            C22039c2 c22039c2Z = bE2.Z();
            if (c22039c2Z != null) {
                c22039c2Z.f38184d = new o(i12, lVar, vVar, list);
                return;
            }
            return;
        }
        com.akita.compose.theme.re23.b.f63983a.getClass();
        com.akita.compose.component.chips.d.b(list, com.akita.compose.theme.re23.b.d(bE2).getF66026e(), ChipsDisplayType.f60861b, new p(lVar, list), C22501m2.a(vVar, "COMPETITIVE_VAS_TABS_TEST_TAG"), null, null, bE2, 456, 96);
        C22039c2 c22039c2Z2 = bE2.Z();
        if (c22039c2Z2 != null) {
            c22039c2Z2.f38184d = new q(i12, lVar, vVar, list);
        }
    }
}
