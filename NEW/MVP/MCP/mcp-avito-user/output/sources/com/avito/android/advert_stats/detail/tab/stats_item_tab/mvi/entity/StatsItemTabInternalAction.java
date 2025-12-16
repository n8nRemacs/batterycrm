package com.avito.android.advert_stats.detail.tab.stats_item_tab.mvi.entity;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import com.avito.android.actions_sheet.a;
import com.avito.android.advert_stats.detail.tab.AdvertDetailStatsTabItem;
import com.avito.android.advert_stats.detail.tab.StatsDialogType;
import com.avito.android.advert_stats.detail.tab.items.chart.StatsBarItem;
import com.avito.android.analytics.screens.mvi.n;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: StatsItemTabInternalAction.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0007\u0002\u0003\u0004\u0005\u0006\u0007\b\u0082\u0001\u0007\t\n\u000b\f\r\u000e\u000f¨\u0006\u0010"}, d2 = {"Lcom/avito/android/advert_stats/detail/tab/stats_item_tab/mvi/entity/StatsItemTabInternalAction;", "Lcom/avito/android/analytics/screens/mvi/n;", "BarSelected", "HandleDeeplink", "OpenDialog", "SelectedPeriod", "Start", "UnselectBarItems", "UpdateSelectedPeriod", "Lcom/avito/android/advert_stats/detail/tab/stats_item_tab/mvi/entity/StatsItemTabInternalAction$BarSelected;", "Lcom/avito/android/advert_stats/detail/tab/stats_item_tab/mvi/entity/StatsItemTabInternalAction$HandleDeeplink;", "Lcom/avito/android/advert_stats/detail/tab/stats_item_tab/mvi/entity/StatsItemTabInternalAction$OpenDialog;", "Lcom/avito/android/advert_stats/detail/tab/stats_item_tab/mvi/entity/StatsItemTabInternalAction$SelectedPeriod;", "Lcom/avito/android/advert_stats/detail/tab/stats_item_tab/mvi/entity/StatsItemTabInternalAction$Start;", "Lcom/avito/android/advert_stats/detail/tab/stats_item_tab/mvi/entity/StatsItemTabInternalAction$UnselectBarItems;", "Lcom/avito/android/advert_stats/detail/tab/stats_item_tab/mvi/entity/StatsItemTabInternalAction$UpdateSelectedPeriod;", "_avito_advert-stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public interface StatsItemTabInternalAction extends n {

    /* compiled from: StatsItemTabInternalAction.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/advert_stats/detail/tab/stats_item_tab/mvi/entity/StatsItemTabInternalAction$BarSelected;", "Lcom/avito/android/advert_stats/detail/tab/stats_item_tab/mvi/entity/StatsItemTabInternalAction;", "Lcom/avito/android/analytics/screens/mvi/n;", "_avito_advert-stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class BarSelected implements StatsItemTabInternalAction, n {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final StatsBarItem f86553b;

        public BarSelected(@k StatsBarItem statsBarItem) {
            this.f86553b = statsBarItem;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof BarSelected) && L.f(this.f86553b, ((BarSelected) obj).f86553b);
        }

        public final int hashCode() {
            return this.f86553b.hashCode();
        }

        @k
        public final String toString() {
            return "BarSelected(barItem=" + this.f86553b + ')';
        }
    }

    /* compiled from: StatsItemTabInternalAction.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/advert_stats/detail/tab/stats_item_tab/mvi/entity/StatsItemTabInternalAction$HandleDeeplink;", "Lcom/avito/android/advert_stats/detail/tab/stats_item_tab/mvi/entity/StatsItemTabInternalAction;", "Lcom/avito/android/analytics/screens/mvi/n;", "_avito_advert-stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class HandleDeeplink implements StatsItemTabInternalAction, n {

        /* renamed from: b, reason: collision with root package name */
        @l
        public final DeepLink f86554b;

        public HandleDeeplink(@l DeepLink deepLink) {
            this.f86554b = deepLink;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof HandleDeeplink) && L.f(this.f86554b, ((HandleDeeplink) obj).f86554b);
        }

        public final int hashCode() {
            DeepLink deepLink = this.f86554b;
            if (deepLink == null) {
                return 0;
            }
            return deepLink.hashCode();
        }

        @k
        public final String toString() {
            return a.v(new StringBuilder("HandleDeeplink(deeplink="), this.f86554b, ')');
        }
    }

    /* compiled from: StatsItemTabInternalAction.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/advert_stats/detail/tab/stats_item_tab/mvi/entity/StatsItemTabInternalAction$OpenDialog;", "Lcom/avito/android/advert_stats/detail/tab/stats_item_tab/mvi/entity/StatsItemTabInternalAction;", "Lcom/avito/android/analytics/screens/mvi/n;", "_avito_advert-stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class OpenDialog implements StatsItemTabInternalAction, n {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final StatsDialogType f86555b;

        public OpenDialog(@k StatsDialogType statsDialogType) {
            this.f86555b = statsDialogType;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OpenDialog) && L.f(this.f86555b, ((OpenDialog) obj).f86555b);
        }

        public final int hashCode() {
            return this.f86555b.hashCode();
        }

        @k
        public final String toString() {
            return "OpenDialog(dialogType=" + this.f86555b + ')';
        }
    }

    /* compiled from: StatsItemTabInternalAction.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/advert_stats/detail/tab/stats_item_tab/mvi/entity/StatsItemTabInternalAction$SelectedPeriod;", "Lcom/avito/android/advert_stats/detail/tab/stats_item_tab/mvi/entity/StatsItemTabInternalAction;", "Lcom/avito/android/analytics/screens/mvi/n;", "_avito_advert-stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class SelectedPeriod implements StatsItemTabInternalAction, n {

        /* renamed from: b, reason: collision with root package name */
        @l
        public final Long f86556b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final String f86557c;

        /* renamed from: d, reason: collision with root package name */
        public final int f86558d;

        public SelectedPeriod(@k String str, int i12, @l Long l12) {
            this.f86556b = l12;
            this.f86557c = str;
            this.f86558d = i12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SelectedPeriod)) {
                return false;
            }
            SelectedPeriod selectedPeriod = (SelectedPeriod) obj;
            return L.f(this.f86556b, selectedPeriod.f86556b) && L.f(this.f86557c, selectedPeriod.f86557c) && this.f86558d == selectedPeriod.f86558d;
        }

        public final int hashCode() {
            Long l12 = this.f86556b;
            return Integer.hashCode(this.f86558d) + H.d((l12 == null ? 0 : l12.hashCode()) * 31, 31, this.f86557c);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("SelectedPeriod(dateFrom=");
            sb2.append(this.f86556b);
            sb2.append(", tabId=");
            sb2.append(this.f86557c);
            sb2.append(", itemIndex=");
            return r.t(sb2, this.f86558d, ')');
        }
    }

    /* compiled from: StatsItemTabInternalAction.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/advert_stats/detail/tab/stats_item_tab/mvi/entity/StatsItemTabInternalAction$Start;", "Lcom/avito/android/advert_stats/detail/tab/stats_item_tab/mvi/entity/StatsItemTabInternalAction;", "Lcom/avito/android/analytics/screens/mvi/n;", "_avito_advert-stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Start implements StatsItemTabInternalAction, n {

        /* renamed from: b, reason: collision with root package name */
        @l
        public final AdvertDetailStatsTabItem f86559b;

        /* JADX WARN: Multi-variable type inference failed */
        public Start() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Start) && L.f(this.f86559b, ((Start) obj).f86559b);
        }

        public final int hashCode() {
            AdvertDetailStatsTabItem advertDetailStatsTabItem = this.f86559b;
            if (advertDetailStatsTabItem == null) {
                return 0;
            }
            return advertDetailStatsTabItem.hashCode();
        }

        @k
        public final String toString() {
            return "Start(tabModel=" + this.f86559b + ')';
        }

        public Start(@l AdvertDetailStatsTabItem advertDetailStatsTabItem) {
            this.f86559b = advertDetailStatsTabItem;
        }

        public /* synthetic */ Start(AdvertDetailStatsTabItem advertDetailStatsTabItem, int i12, C42822w c42822w) {
            this((i12 & 1) != 0 ? null : advertDetailStatsTabItem);
        }
    }

    /* compiled from: StatsItemTabInternalAction.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/advert_stats/detail/tab/stats_item_tab/mvi/entity/StatsItemTabInternalAction$UnselectBarItems;", "Lcom/avito/android/advert_stats/detail/tab/stats_item_tab/mvi/entity/StatsItemTabInternalAction;", "Lcom/avito/android/analytics/screens/mvi/n;", "<init>", "()V", "_avito_advert-stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class UnselectBarItems implements StatsItemTabInternalAction, n {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final UnselectBarItems f86560b = new UnselectBarItems();

        private UnselectBarItems() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof UnselectBarItems);
        }

        public final int hashCode() {
            return 1969672123;
        }

        @k
        public final String toString() {
            return "UnselectBarItems";
        }
    }

    /* compiled from: StatsItemTabInternalAction.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/advert_stats/detail/tab/stats_item_tab/mvi/entity/StatsItemTabInternalAction$UpdateSelectedPeriod;", "Lcom/avito/android/advert_stats/detail/tab/stats_item_tab/mvi/entity/StatsItemTabInternalAction;", "Lcom/avito/android/analytics/screens/mvi/n;", "_avito_advert-stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class UpdateSelectedPeriod implements StatsItemTabInternalAction, n {

        /* renamed from: b, reason: collision with root package name */
        public final long f86561b;

        public UpdateSelectedPeriod(long j12) {
            this.f86561b = j12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof UpdateSelectedPeriod) && this.f86561b == ((UpdateSelectedPeriod) obj).f86561b;
        }

        public final int hashCode() {
            return Long.hashCode(this.f86561b);
        }

        @k
        public final String toString() {
            return r.u(new StringBuilder("UpdateSelectedPeriod(fromPeriod="), this.f86561b, ')');
        }
    }
}
