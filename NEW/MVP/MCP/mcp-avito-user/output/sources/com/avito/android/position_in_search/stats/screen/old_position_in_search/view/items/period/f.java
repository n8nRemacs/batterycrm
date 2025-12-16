package com.avito.android.position_in_search.stats.screen.old_position_in_search.view.items.period;

import androidx.compose.runtime.internal.P;
import com.avito.android.position_in_search.stats.screen.old_position_in_search.view.items.period.a;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;

/* compiled from: PeriodItemPresenter.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/position_in_search/stats/screen/old_position_in_search/view/items/period/f;", "LTV0/f;", "Lcom/avito/android/position_in_search/stats/screen/old_position_in_search/view/items/period/g;", "Lcom/avito/android/position_in_search/stats/screen/old_position_in_search/view/items/period/a;", "<init>", "()V", "_avito_position-in-search_stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class f implements TV0.f<g, a> {
    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        g gVar = (g) eVar;
        a aVar2 = (a) aVar;
        gVar.getClass();
        gVar.f221048b.r(aVar2.f221035d, aVar2.f221037f);
        gVar.f221049c = aVar2;
    }

    @Override // TV0.f
    public final void g2(TV0.e eVar, TV0.a aVar, int i12, List list) {
        g gVar = (g) eVar;
        a aVar2 = (a) aVar;
        Object objG = C42745f0.G(list);
        a.C6678a c6678a = null;
        if (objG != null) {
            if (!(objG instanceof a.C6678a)) {
                objG = null;
            }
            c6678a = (a.C6678a) objG;
        }
        if (c6678a == null) {
            gVar.getClass();
            gVar.f221048b.r(aVar2.f221035d, aVar2.f221037f);
            gVar.f221049c = aVar2;
            return;
        }
        Iterator it = c6678a.f221038a.iterator();
        while (it.hasNext()) {
            a.b bVar = (a.b) it.next();
            if (!(bVar instanceof a.b.C6679a ? true : bVar instanceof a.b.c) && (bVar instanceof a.b.C6680b)) {
                gVar.getClass();
                gVar.f221048b.r(aVar2.f221035d, aVar2.f221037f);
            }
        }
        gVar.f221049c = aVar2;
    }
}
