package com.avito.android.advert_stats.detail.tab.favorite.mvi_favorite.mvi;

import cb.InterfaceC27156b;
import com.avito.android.advert_stats.detail.tab.favorite.mvi_favorite.mvi.entity.MviFavoriteInternalAction;
import com.avito.android.arch.mvi.t;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: MviFavoriteOneTimeEventProducer.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/advert_stats/detail/tab/favorite/mvi_favorite/mvi/f;", "Lcom/avito/android/arch/mvi/t;", "Lcom/avito/android/advert_stats/detail/tab/favorite/mvi_favorite/mvi/entity/MviFavoriteInternalAction;", "Lcb/b;", "<init>", "()V", "_avito_advert-stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class f implements t<MviFavoriteInternalAction, InterfaceC27156b> {
    @Inject
    public f() {
    }

    @Override // com.avito.android.arch.mvi.t
    public final InterfaceC27156b b(MviFavoriteInternalAction mviFavoriteInternalAction) {
        MviFavoriteInternalAction mviFavoriteInternalAction2 = mviFavoriteInternalAction;
        if ((mviFavoriteInternalAction2 instanceof MviFavoriteInternalAction.SelectedPeriod) || (mviFavoriteInternalAction2 instanceof MviFavoriteInternalAction.Start)) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
    }
}
