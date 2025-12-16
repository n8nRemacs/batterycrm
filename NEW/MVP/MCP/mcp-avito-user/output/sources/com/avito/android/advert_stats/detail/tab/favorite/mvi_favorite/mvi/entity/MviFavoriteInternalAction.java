package com.avito.android.advert_stats.detail.tab.favorite.mvi_favorite.mvi.entity;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import com.avito.android.advert_stats.detail.tab.AdvertDetailStatsTabItem;
import com.avito.android.analytics.screens.mvi.n;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: MviFavoriteInternalAction.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/advert_stats/detail/tab/favorite/mvi_favorite/mvi/entity/MviFavoriteInternalAction;", "Lcom/avito/android/analytics/screens/mvi/n;", "SelectedPeriod", "Start", "Lcom/avito/android/advert_stats/detail/tab/favorite/mvi_favorite/mvi/entity/MviFavoriteInternalAction$SelectedPeriod;", "Lcom/avito/android/advert_stats/detail/tab/favorite/mvi_favorite/mvi/entity/MviFavoriteInternalAction$Start;", "_avito_advert-stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public interface MviFavoriteInternalAction extends n {

    /* compiled from: MviFavoriteInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert_stats/detail/tab/favorite/mvi_favorite/mvi/entity/MviFavoriteInternalAction$SelectedPeriod;", "Lcom/avito/android/advert_stats/detail/tab/favorite/mvi_favorite/mvi/entity/MviFavoriteInternalAction;", "_avito_advert-stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class SelectedPeriod implements MviFavoriteInternalAction {

        /* renamed from: b, reason: collision with root package name */
        public final long f86232b;

        public SelectedPeriod(long j12) {
            this.f86232b = j12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof SelectedPeriod) && this.f86232b == ((SelectedPeriod) obj).f86232b;
        }

        public final int hashCode() {
            return Long.hashCode(this.f86232b);
        }

        @k
        public final String toString() {
            return r.u(new StringBuilder("SelectedPeriod(date="), this.f86232b, ')');
        }
    }

    /* compiled from: MviFavoriteInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert_stats/detail/tab/favorite/mvi_favorite/mvi/entity/MviFavoriteInternalAction$Start;", "Lcom/avito/android/advert_stats/detail/tab/favorite/mvi_favorite/mvi/entity/MviFavoriteInternalAction;", "_avito_advert-stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Start implements MviFavoriteInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @l
        public final AdvertDetailStatsTabItem f86233b;

        public Start(@l AdvertDetailStatsTabItem advertDetailStatsTabItem) {
            this.f86233b = advertDetailStatsTabItem;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Start) && L.f(this.f86233b, ((Start) obj).f86233b);
        }

        public final int hashCode() {
            AdvertDetailStatsTabItem advertDetailStatsTabItem = this.f86233b;
            if (advertDetailStatsTabItem == null) {
                return 0;
            }
            return advertDetailStatsTabItem.hashCode();
        }

        @k
        public final String toString() {
            return "Start(tabModel=" + this.f86233b + ')';
        }
    }
}
