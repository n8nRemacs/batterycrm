package com.avito.android.position_in_search.stats.screen.old_position_in_search.view.items.chart_dynamic;

import androidx.compose.runtime.internal.P;
import com.avito.android.position_in_search.stats.screen.old_position_in_search.view.items.chart_dynamic.c;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;

/* compiled from: ChartDynamicPresenter.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/position_in_search/stats/screen/old_position_in_search/view/items/chart_dynamic/f;", "LTV0/f;", "Lcom/avito/android/position_in_search/stats/screen/old_position_in_search/view/items/chart_dynamic/h;", "Lcom/avito/android/position_in_search/stats/screen/old_position_in_search/view/items/chart_dynamic/c;", "<init>", "()V", "_avito_position-in-search_stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class f implements TV0.f<h, c> {
    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        ((h) eVar).B80((c) aVar);
    }

    @Override // TV0.f
    public final void g2(TV0.e eVar, TV0.a aVar, int i12, List list) {
        h hVar = (h) eVar;
        c cVar = (c) aVar;
        Object objG = C42745f0.G(list);
        c.b bVar = null;
        if (objG != null) {
            if (!(objG instanceof c.b)) {
                objG = null;
            }
            bVar = (c.b) objG;
        }
        if (bVar == null) {
            hVar.B80(cVar);
            return;
        }
        Iterator it = bVar.f220926a.iterator();
        while (it.hasNext()) {
            if (((c.InterfaceC6674c) it.next()) instanceof c.InterfaceC6674c.a) {
                hVar.B80(cVar);
            }
        }
    }
}
