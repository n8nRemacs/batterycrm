package com.avito.android.advert_stats.detail.tab.favorite.mvi_favorite.mvi;

import com.avito.android.advert_stats.detail.tab.AdvertDetailStatsTabItem;
import com.avito.android.advert_stats.detail.tab.favorite.mvi_favorite.mvi.entity.MviFavoriteInternalAction;
import com.avito.android.advert_stats.detail.tab.favorite.mvi_favorite.mvi.entity.MviFavoriteState;
import com.avito.android.arch.mvi.u;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.s0;

/* compiled from: MviFavoriteReducer.kt */
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/advert_stats/detail/tab/favorite/mvi_favorite/mvi/h;", "Lcom/avito/android/arch/mvi/u;", "Lcom/avito/android/advert_stats/detail/tab/favorite/mvi_favorite/mvi/entity/MviFavoriteInternalAction;", "Lcom/avito/android/advert_stats/detail/tab/favorite/mvi_favorite/mvi/entity/MviFavoriteState;", "<init>", "()V", "_avito_advert-stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class h implements u<MviFavoriteInternalAction, MviFavoriteState> {
    @Inject
    public h() {
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0040  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.avito.android.advert_stats.detail.tab.favorite.mvi_favorite.mvi.entity.MviFavoriteState b(com.avito.android.advert_stats.detail.tab.AdvertDetailStatsTabItem r8, com.avito.android.advert_stats.detail.tab.favorite.mvi_favorite.mvi.entity.MviFavoriteState r9) {
        /*
            r0 = 0
            if (r8 == 0) goto L40
            com.avito.android.advert_stats.remote.model.detail_stats.AdvertStatTab r1 = r8.f86183f
            if (r1 == 0) goto L40
            java.util.List r2 = r1.g()
            if (r2 == 0) goto L40
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.util.Iterator r2 = r2.iterator()
        L13:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L2b
            java.lang.Object r3 = r2.next()
            r4 = r3
            com.avito.android.advert_stats.remote.model.detail_stats.Period r4 = (com.avito.android.advert_stats.remote.model.detail_stats.Period) r4
            long r4 = r4.getDateFrom()
            long r6 = r8.f86184g
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 != 0) goto L13
            goto L2c
        L2b:
            r3 = r0
        L2c:
            com.avito.android.advert_stats.remote.model.detail_stats.Period r3 = (com.avito.android.advert_stats.remote.model.detail_stats.Period) r3
            if (r3 != 0) goto L31
            goto L40
        L31:
            java.util.List r1 = r1.g()
            if (r1 == 0) goto L40
            int r1 = r1.indexOf(r3)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            goto L41
        L40:
            r1 = r0
        L41:
            if (r1 == 0) goto L48
            int r1 = r1.intValue()
            goto L49
        L48:
            r1 = 0
        L49:
            if (r8 == 0) goto L5c
            com.avito.android.advert_stats.remote.model.detail_stats.AdvertStatTab r2 = r8.f86183f
            if (r2 == 0) goto L5c
            java.util.List r2 = r2.g()
            if (r2 == 0) goto L5c
            java.lang.Object r1 = r2.get(r1)
            com.avito.android.advert_stats.remote.model.detail_stats.Period r1 = (com.avito.android.advert_stats.remote.model.detail_stats.Period) r1
            goto L5d
        L5c:
            r1 = r0
        L5d:
            if (r1 == 0) goto L64
            java.lang.String r2 = r1.getFavoriteCount()
            goto L65
        L64:
            r2 = r0
        L65:
            java.lang.String r3 = ""
            if (r2 != 0) goto L6a
            r2 = r3
        L6a:
            if (r1 == 0) goto L71
            java.lang.String r1 = r1.getFavoriteDesc()
            goto L72
        L71:
            r1 = r0
        L72:
            if (r1 != 0) goto L75
            r1 = r3
        L75:
            if (r8 == 0) goto L85
            com.avito.android.advert_stats.remote.model.detail_stats.AdvertStatTab r4 = r8.f86183f
            if (r4 == 0) goto L85
            com.avito.android.advert_stats.remote.model.detail_stats.Favorite r4 = r4.getFavorite()
            if (r4 == 0) goto L85
            java.lang.String r0 = r4.getDescription()
        L85:
            if (r0 != 0) goto L88
            goto L89
        L88:
            r3 = r0
        L89:
            r9.getClass()
            com.avito.android.advert_stats.detail.tab.favorite.mvi_favorite.mvi.entity.MviFavoriteState r9 = new com.avito.android.advert_stats.detail.tab.favorite.mvi_favorite.mvi.entity.MviFavoriteState
            r9.<init>(r2, r1, r3, r8)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.advert_stats.detail.tab.favorite.mvi_favorite.mvi.h.b(com.avito.android.advert_stats.detail.tab.AdvertDetailStatsTabItem, com.avito.android.advert_stats.detail.tab.favorite.mvi_favorite.mvi.entity.MviFavoriteState):com.avito.android.advert_stats.detail.tab.favorite.mvi_favorite.mvi.entity.MviFavoriteState");
    }

    @Override // com.avito.android.arch.mvi.u
    public final MviFavoriteState a(MviFavoriteInternalAction mviFavoriteInternalAction, MviFavoriteState mviFavoriteState) {
        MviFavoriteInternalAction mviFavoriteInternalAction2 = mviFavoriteInternalAction;
        MviFavoriteState mviFavoriteState2 = mviFavoriteState;
        boolean z12 = mviFavoriteInternalAction2 instanceof MviFavoriteInternalAction.SelectedPeriod;
        AdvertDetailStatsTabItem advertDetailStatsTabItem = mviFavoriteState2.f86239e;
        if (z12) {
            return b(advertDetailStatsTabItem != null ? AdvertDetailStatsTabItem.a(advertDetailStatsTabItem, ((MviFavoriteInternalAction.SelectedPeriod) mviFavoriteInternalAction2).f86232b) : null, mviFavoriteState2);
        }
        if (!(mviFavoriteInternalAction2 instanceof MviFavoriteInternalAction.Start)) {
            throw new NoWhenBranchMatchedException();
        }
        if (advertDetailStatsTabItem == null) {
            advertDetailStatsTabItem = ((MviFavoriteInternalAction.Start) mviFavoriteInternalAction2).f86233b;
        }
        return b(advertDetailStatsTabItem, mviFavoriteState2);
    }
}
