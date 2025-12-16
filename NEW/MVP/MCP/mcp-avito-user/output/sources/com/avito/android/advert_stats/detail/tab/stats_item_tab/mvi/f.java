package com.avito.android.advert_stats.detail.tab.stats_item_tab.mvi;

import com.avito.android.advert_stats.detail.tab.stats_item_tab.mvi.entity.StatsItemTabInternalAction;
import com.avito.android.arch.mvi.t;
import eb.InterfaceC40079b;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: StatsItemTabOneTimeEventProducer.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/advert_stats/detail/tab/stats_item_tab/mvi/f;", "Lcom/avito/android/arch/mvi/t;", "Lcom/avito/android/advert_stats/detail/tab/stats_item_tab/mvi/entity/StatsItemTabInternalAction;", "Leb/b;", "<init>", "()V", "_avito_advert-stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class f implements t<StatsItemTabInternalAction, InterfaceC40079b> {
    @Inject
    public f() {
    }

    @Override // com.avito.android.arch.mvi.t
    public final InterfaceC40079b b(StatsItemTabInternalAction statsItemTabInternalAction) {
        StatsItemTabInternalAction statsItemTabInternalAction2 = statsItemTabInternalAction;
        if (statsItemTabInternalAction2 instanceof StatsItemTabInternalAction.HandleDeeplink) {
            return new InterfaceC40079b.a(((StatsItemTabInternalAction.HandleDeeplink) statsItemTabInternalAction2).f86554b);
        }
        if (statsItemTabInternalAction2 instanceof StatsItemTabInternalAction.OpenDialog) {
            return new InterfaceC40079b.C11091b(((StatsItemTabInternalAction.OpenDialog) statsItemTabInternalAction2).f86555b);
        }
        if (!(statsItemTabInternalAction2 instanceof StatsItemTabInternalAction.SelectedPeriod)) {
            return null;
        }
        StatsItemTabInternalAction.SelectedPeriod selectedPeriod = (StatsItemTabInternalAction.SelectedPeriod) statsItemTabInternalAction2;
        return new InterfaceC40079b.c(selectedPeriod.f86557c, selectedPeriod.f86558d, selectedPeriod.f86556b);
    }
}
