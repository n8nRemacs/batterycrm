package com.avito.android.loyalty.ui.criteria.items.tab;

import Y61.k;
import androidx.compose.runtime.internal.P;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.loyalty.di.criteria.l;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.text.C43066x;

/* compiled from: TabItemPresenter.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/loyalty/ui/criteria/items/tab/d;", "LTV0/d;", "Lcom/avito/android/loyalty/ui/criteria/items/tab/g;", "Lcom/avito/android/loyalty/ui/criteria/items/tab/a;", "_avito_loyalty_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class d implements TV0.d<g, a> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final l f183516b;

    @Inject
    public d(@k l lVar) {
        this.f183516b = lVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        g gVar = (g) eVar;
        a aVar2 = (a) aVar;
        com.avito.android.loyalty.ui.criteria.l lVar = (com.avito.android.loyalty.ui.criteria.l) this.f183516b.get();
        RecyclerView recyclerView = gVar.f183518b;
        recyclerView.setAdapter(lVar);
        List<com.avito.conveyor_item.a> list = aVar2.f183510c;
        com.avito.konveyor.util.a.a(lVar.f183520f, list);
        String str = aVar2.f183511d;
        int iIntValue = 0;
        if (str != null && !C43066x.K(str)) {
            Iterator<com.avito.conveyor_item.a> it = list.iterator();
            int i13 = 0;
            while (true) {
                if (!it.hasNext()) {
                    i13 = -1;
                    break;
                }
                com.avito.conveyor_item.a next = it.next();
                if (next instanceof com.avito.android.loyalty.ui.criteria.items.card.a ? L.f(((com.avito.android.loyalty.ui.criteria.items.card.a) next).f183469b, str) : false) {
                    break;
                } else {
                    i13++;
                }
            }
            Integer numValueOf = Integer.valueOf(i13);
            if (!(i13 >= 0)) {
                numValueOf = null;
            }
            if (numValueOf != null) {
                iIntValue = numValueOf.intValue();
            }
        }
        f fVar = new f(gVar.itemView.getContext());
        fVar.f53878a = iIntValue;
        RecyclerView.m layoutManager = recyclerView.getLayoutManager();
        if (layoutManager != null) {
            layoutManager.x1(fVar);
        }
    }
}
