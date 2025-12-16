package com.avito.android.position_in_search.stats.screen.old_position_in_search.view.items.sort;

import android.content.Context;
import androidx.compose.runtime.internal.P;
import com.avito.android.lib.design.input.Input;
import com.avito.android.lib.design.select.BaseSelect;
import com.avito.android.position_in_search.stats.screen.old_position_in_search.domain.model.PeriodSortDirection;
import com.avito.android.position_in_search.stats.screen.old_position_in_search.view.items.sort.a;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: SortItemPresenter.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/position_in_search/stats/screen/old_position_in_search/view/items/sort/f;", "LTV0/f;", "Lcom/avito/android/position_in_search/stats/screen/old_position_in_search/view/items/sort/h;", "Lcom/avito/android/position_in_search/stats/screen/old_position_in_search/view/items/sort/a;", "<init>", "()V", "_avito_position-in-search_stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class f implements TV0.f<h, a> {
    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        ((h) eVar).B80((a) aVar);
    }

    @Override // TV0.f
    public final void g2(TV0.e eVar, TV0.a aVar, int i12, List list) {
        h hVar = (h) eVar;
        a aVar2 = (a) aVar;
        Object objG = C42745f0.G(list);
        a.C6688a c6688a = null;
        if (objG != null) {
            if (!(objG instanceof a.C6688a)) {
                objG = null;
            }
            c6688a = (a.C6688a) objG;
        }
        if (c6688a == null) {
            hVar.B80(aVar2);
        } else {
            Iterator it = c6688a.f221176a.iterator();
            while (it.hasNext()) {
                a.b bVar = (a.b) it.next();
                if (L.f(bVar, a.b.c.f221179a)) {
                    String str = aVar2.f221169b;
                    BaseSelect baseSelect = hVar.f221185b;
                    Input.t(baseSelect, "", false, 6);
                    Input.t(baseSelect, str, false, 6);
                } else if (L.f(bVar, a.b.C6690b.f221178a)) {
                    PeriodSortDirection periodSortDirection = aVar2.f221171d;
                    hVar.getClass();
                    FV.a aVar3 = FV.a.f4720a;
                    Context context = hVar.itemView.getContext();
                    int i13 = periodSortDirection.f220413b;
                    aVar3.getClass();
                    hVar.f221186c.setText(FV.a.i("", context, i13, 0));
                } else if (L.f(bVar, a.b.C6689a.f221177a)) {
                    boolean z12 = aVar2.f221175h;
                    hVar.f221185b.setEnabled(!z12);
                    hVar.f221186c.setLoading(z12);
                }
            }
            hVar.f221187d = aVar2;
        }
        hVar.B80(aVar2);
    }
}
