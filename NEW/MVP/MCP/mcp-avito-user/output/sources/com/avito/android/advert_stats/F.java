package com.avito.android.advert_stats;

import androidx.recyclerview.widget.C23424o;
import com.avito.android.advert_stats.item.C28336o;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: StatsCallback.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert_stats/F;", "Landroidx/recyclerview/widget/o$b;", "_avito_advert-stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class F extends C23424o.b {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final List<com.avito.conveyor_item.a> f86023a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final List<com.avito.conveyor_item.a> f86024b;

    /* JADX WARN: Multi-variable type inference failed */
    public F(@Y61.k List<? extends com.avito.conveyor_item.a> list, @Y61.k List<? extends com.avito.conveyor_item.a> list2) {
        this.f86023a = list;
        this.f86024b = list2;
    }

    @Override // androidx.recyclerview.widget.C23424o.b
    public final boolean areContentsTheSame(int i12, int i13) {
        com.avito.conveyor_item.a aVar = this.f86023a.get(i12);
        com.avito.conveyor_item.a aVar2 = this.f86024b.get(i13);
        if ((aVar instanceof com.avito.android.advert_stats.item.details.a) && (aVar2 instanceof com.avito.android.advert_stats.item.details.a)) {
            com.avito.android.advert_stats.item.details.a aVar3 = (com.avito.android.advert_stats.item.details.a) aVar;
            com.avito.android.advert_stats.item.details.a aVar4 = (com.avito.android.advert_stats.item.details.a) aVar2;
            return L.f(aVar3.f86736c, aVar4.f86736c) && aVar3.f86740g == aVar4.f86740g;
        }
        if (!(aVar instanceof com.avito.android.advert_stats.item.period.a) || !(aVar2 instanceof com.avito.android.advert_stats.item.period.a)) {
            return ((aVar instanceof com.avito.android.advert_stats.item.title.a) && (aVar2 instanceof com.avito.android.advert_stats.item.title.a)) ? L.f(((com.avito.android.advert_stats.item.title.a) aVar).f86804b, ((com.avito.android.advert_stats.item.title.a) aVar2).f86804b) : (aVar instanceof C28336o) && (aVar2 instanceof C28336o);
        }
        com.avito.android.advert_stats.item.period.a aVar5 = (com.avito.android.advert_stats.item.period.a) aVar;
        com.avito.android.advert_stats.item.period.a aVar6 = (com.avito.android.advert_stats.item.period.a) aVar2;
        return L.f(aVar5.f86781c, aVar6.f86781c) && aVar5.f86782d == aVar6.f86782d;
    }

    @Override // androidx.recyclerview.widget.C23424o.b
    public final boolean areItemsTheSame(int i12, int i13) {
        List<com.avito.conveyor_item.a> list = this.f86023a;
        com.avito.conveyor_item.a aVar = list.get(i12);
        List<com.avito.conveyor_item.a> list2 = this.f86024b;
        com.avito.conveyor_item.a aVar2 = list2.get(i13);
        if ((aVar instanceof com.avito.android.advert_stats.item.details.a) && (aVar2 instanceof com.avito.android.advert_stats.item.details.a)) {
            return L.f(((com.avito.android.advert_stats.item.details.a) aVar).getF86780b(), ((com.avito.android.advert_stats.item.details.a) aVar2).getF86780b());
        }
        if ((aVar instanceof com.avito.android.advert_stats.item.period.a) && (aVar2 instanceof com.avito.android.advert_stats.item.period.a)) {
            return L.f(((com.avito.android.advert_stats.item.period.a) aVar).getF86780b(), ((com.avito.android.advert_stats.item.period.a) aVar2).getF86780b());
        }
        if ((aVar instanceof C28336o) && (aVar2 instanceof C28336o)) {
            return true;
        }
        return ((aVar instanceof com.avito.android.advert_stats.item.title.a) && (aVar2 instanceof com.avito.android.advert_stats.item.title.a)) || list.get(i12).getF79541k() == list2.get(i13).getF79541k();
    }

    @Override // androidx.recyclerview.widget.C23424o.b
    public final int getNewListSize() {
        return this.f86024b.size();
    }

    @Override // androidx.recyclerview.widget.C23424o.b
    public final int getOldListSize() {
        return this.f86023a.size();
    }
}
