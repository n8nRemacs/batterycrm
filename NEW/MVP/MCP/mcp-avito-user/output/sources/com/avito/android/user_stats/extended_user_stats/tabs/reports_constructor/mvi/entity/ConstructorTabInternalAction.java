package com.avito.android.user_stats.extended_user_stats.tabs.reports_constructor.mvi.entity;

import WJ0.a;
import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import com.avito.android.analytics.screens.J;
import com.avito.android.analytics.screens.mvi.TrackableContent;
import com.avito.android.analytics.screens.mvi.TrackableError;
import com.avito.android.analytics.screens.mvi.TrackableLoadingStarted;
import com.avito.android.analytics.screens.mvi.n;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.error.ApiError;
import com.avito.android.user_stats.extended_user_stats.StatsConfig;
import com.avito.android.user_stats.extended_user_stats.tabs.expenses.items.date_select.SegmentType;
import com.avito.android.user_stats.extended_user_stats.tabs.reports_constructor.split.SplitListDialogItem;
import com.avito.user_stats.model.extended_user_stats.Hint;
import com.avito.user_stats.model.extended_user_stats.StatsDynamicChart;
import com.avito.user_stats.model.extended_user_stats.StatsDynamicItems;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: ConstructorTabInternalAction.kt */
@Metadata(d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u001c\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u0082\u0001\u001c\u001e\u001f !\"#$%&'()*+,-./0123456789¨\u0006:"}, d2 = {"Lcom/avito/android/user_stats/extended_user_stats/tabs/reports_constructor/mvi/entity/ConstructorTabInternalAction;", "Lcom/avito/android/analytics/screens/mvi/n;", "ContentCategoriesSplit", "ContentChart", "ContentChartV2", "ContentItems", "ContentLocationsSplit", "ErrorChart", "ErrorItems", "HandleDeeplink", "LoadingChart", "LoadingItems", "OnCloseSplitDialog", "OnColumnClick", "OnHideTooltipClick", "OnMetricHintClick", "OnOpenVasesClick", "OnPeriodClick", "OnSelectedPeriod", "OnSplitClick", "OnSplitDialogClick", "OnSplitHintClick", "OnSplitItemClick", "ScreenOpened", "ShowABUxFeedback", "ShowEmptyTodayToast", "ShowLoadingIfEmptyData", "ShowOneStatsOpenUxFeedback", "ShowSplitUxFeedback", "ShowVisitUxFeedback", "Lcom/avito/android/user_stats/extended_user_stats/tabs/reports_constructor/mvi/entity/ConstructorTabInternalAction$ContentCategoriesSplit;", "Lcom/avito/android/user_stats/extended_user_stats/tabs/reports_constructor/mvi/entity/ConstructorTabInternalAction$ContentChart;", "Lcom/avito/android/user_stats/extended_user_stats/tabs/reports_constructor/mvi/entity/ConstructorTabInternalAction$ContentChartV2;", "Lcom/avito/android/user_stats/extended_user_stats/tabs/reports_constructor/mvi/entity/ConstructorTabInternalAction$ContentItems;", "Lcom/avito/android/user_stats/extended_user_stats/tabs/reports_constructor/mvi/entity/ConstructorTabInternalAction$ContentLocationsSplit;", "Lcom/avito/android/user_stats/extended_user_stats/tabs/reports_constructor/mvi/entity/ConstructorTabInternalAction$ErrorChart;", "Lcom/avito/android/user_stats/extended_user_stats/tabs/reports_constructor/mvi/entity/ConstructorTabInternalAction$ErrorItems;", "Lcom/avito/android/user_stats/extended_user_stats/tabs/reports_constructor/mvi/entity/ConstructorTabInternalAction$HandleDeeplink;", "Lcom/avito/android/user_stats/extended_user_stats/tabs/reports_constructor/mvi/entity/ConstructorTabInternalAction$LoadingChart;", "Lcom/avito/android/user_stats/extended_user_stats/tabs/reports_constructor/mvi/entity/ConstructorTabInternalAction$LoadingItems;", "Lcom/avito/android/user_stats/extended_user_stats/tabs/reports_constructor/mvi/entity/ConstructorTabInternalAction$OnCloseSplitDialog;", "Lcom/avito/android/user_stats/extended_user_stats/tabs/reports_constructor/mvi/entity/ConstructorTabInternalAction$OnColumnClick;", "Lcom/avito/android/user_stats/extended_user_stats/tabs/reports_constructor/mvi/entity/ConstructorTabInternalAction$OnHideTooltipClick;", "Lcom/avito/android/user_stats/extended_user_stats/tabs/reports_constructor/mvi/entity/ConstructorTabInternalAction$OnMetricHintClick;", "Lcom/avito/android/user_stats/extended_user_stats/tabs/reports_constructor/mvi/entity/ConstructorTabInternalAction$OnOpenVasesClick;", "Lcom/avito/android/user_stats/extended_user_stats/tabs/reports_constructor/mvi/entity/ConstructorTabInternalAction$OnPeriodClick;", "Lcom/avito/android/user_stats/extended_user_stats/tabs/reports_constructor/mvi/entity/ConstructorTabInternalAction$OnSelectedPeriod;", "Lcom/avito/android/user_stats/extended_user_stats/tabs/reports_constructor/mvi/entity/ConstructorTabInternalAction$OnSplitClick;", "Lcom/avito/android/user_stats/extended_user_stats/tabs/reports_constructor/mvi/entity/ConstructorTabInternalAction$OnSplitDialogClick;", "Lcom/avito/android/user_stats/extended_user_stats/tabs/reports_constructor/mvi/entity/ConstructorTabInternalAction$OnSplitHintClick;", "Lcom/avito/android/user_stats/extended_user_stats/tabs/reports_constructor/mvi/entity/ConstructorTabInternalAction$OnSplitItemClick;", "Lcom/avito/android/user_stats/extended_user_stats/tabs/reports_constructor/mvi/entity/ConstructorTabInternalAction$ScreenOpened;", "Lcom/avito/android/user_stats/extended_user_stats/tabs/reports_constructor/mvi/entity/ConstructorTabInternalAction$ShowABUxFeedback;", "Lcom/avito/android/user_stats/extended_user_stats/tabs/reports_constructor/mvi/entity/ConstructorTabInternalAction$ShowEmptyTodayToast;", "Lcom/avito/android/user_stats/extended_user_stats/tabs/reports_constructor/mvi/entity/ConstructorTabInternalAction$ShowLoadingIfEmptyData;", "Lcom/avito/android/user_stats/extended_user_stats/tabs/reports_constructor/mvi/entity/ConstructorTabInternalAction$ShowOneStatsOpenUxFeedback;", "Lcom/avito/android/user_stats/extended_user_stats/tabs/reports_constructor/mvi/entity/ConstructorTabInternalAction$ShowSplitUxFeedback;", "Lcom/avito/android/user_stats/extended_user_stats/tabs/reports_constructor/mvi/entity/ConstructorTabInternalAction$ShowVisitUxFeedback;", "_avito_user-stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public interface ConstructorTabInternalAction extends n {

    /* compiled from: ConstructorTabInternalAction.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/user_stats/extended_user_stats/tabs/reports_constructor/mvi/entity/ConstructorTabInternalAction$ContentCategoriesSplit;", "Lcom/avito/android/user_stats/extended_user_stats/tabs/reports_constructor/mvi/entity/ConstructorTabInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableContent;", "_avito_user-stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ContentCategoriesSplit implements ConstructorTabInternalAction, TrackableContent {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final a f318168b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final StatsConfig f318169c;

        public ContentCategoriesSplit(@k a aVar, @l StatsConfig statsConfig) {
            this.f318168b = aVar;
            this.f318169c = statsConfig;
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @l
        /* renamed from: d */
        public final String getF261005e() {
            return null;
        }

        @Override // com.avito.android.analytics.screens.mvi.t
        @l
        /* renamed from: e */
        public final String getF112001c() {
            return null;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ContentCategoriesSplit)) {
                return false;
            }
            ContentCategoriesSplit contentCategoriesSplit = (ContentCategoriesSplit) obj;
            return L.f(this.f318168b, contentCategoriesSplit.f318168b) && L.f(this.f318169c, contentCategoriesSplit.f318169c);
        }

        public final int hashCode() {
            int iHashCode = this.f318168b.hashCode() * 31;
            StatsConfig statsConfig = this.f318169c;
            return iHashCode + (statsConfig == null ? 0 : statsConfig.hashCode());
        }

        @k
        public final String toString() {
            return "ContentCategoriesSplit(data=" + this.f318168b + ", config=" + this.f318169c + ')';
        }
    }

    /* compiled from: ConstructorTabInternalAction.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/user_stats/extended_user_stats/tabs/reports_constructor/mvi/entity/ConstructorTabInternalAction$ContentChart;", "Lcom/avito/android/user_stats/extended_user_stats/tabs/reports_constructor/mvi/entity/ConstructorTabInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableContent;", "_avito_user-stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ContentChart implements ConstructorTabInternalAction, TrackableContent {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final StatsDynamicChart f318170b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final StatsConfig f318171c;

        public ContentChart(@k StatsDynamicChart statsDynamicChart, @l StatsConfig statsConfig) {
            this.f318170b = statsDynamicChart;
            this.f318171c = statsConfig;
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @l
        /* renamed from: d */
        public final String getF261005e() {
            return null;
        }

        @Override // com.avito.android.analytics.screens.mvi.t
        @l
        /* renamed from: e */
        public final String getF112001c() {
            return null;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ContentChart)) {
                return false;
            }
            ContentChart contentChart = (ContentChart) obj;
            return L.f(this.f318170b, contentChart.f318170b) && L.f(this.f318171c, contentChart.f318171c);
        }

        public final int hashCode() {
            int iHashCode = this.f318170b.hashCode() * 31;
            StatsConfig statsConfig = this.f318171c;
            return iHashCode + (statsConfig == null ? 0 : statsConfig.hashCode());
        }

        @k
        public final String toString() {
            return "ContentChart(data=" + this.f318170b + ", config=" + this.f318171c + ')';
        }
    }

    /* compiled from: ConstructorTabInternalAction.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/user_stats/extended_user_stats/tabs/reports_constructor/mvi/entity/ConstructorTabInternalAction$ContentChartV2;", "Lcom/avito/android/user_stats/extended_user_stats/tabs/reports_constructor/mvi/entity/ConstructorTabInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableContent;", "_avito_user-stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ContentChartV2 implements ConstructorTabInternalAction, TrackableContent {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final YJ0.a f318172b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final StatsConfig f318173c;

        public ContentChartV2(@k YJ0.a aVar, @l StatsConfig statsConfig) {
            this.f318172b = aVar;
            this.f318173c = statsConfig;
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @l
        /* renamed from: d */
        public final String getF261005e() {
            return null;
        }

        @Override // com.avito.android.analytics.screens.mvi.t
        @l
        /* renamed from: e */
        public final String getF112001c() {
            return null;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ContentChartV2)) {
                return false;
            }
            ContentChartV2 contentChartV2 = (ContentChartV2) obj;
            return L.f(this.f318172b, contentChartV2.f318172b) && L.f(this.f318173c, contentChartV2.f318173c);
        }

        public final int hashCode() {
            int iHashCode = this.f318172b.hashCode() * 31;
            StatsConfig statsConfig = this.f318173c;
            return iHashCode + (statsConfig == null ? 0 : statsConfig.hashCode());
        }

        @k
        public final String toString() {
            return "ContentChartV2(data=" + this.f318172b + ", config=" + this.f318173c + ')';
        }
    }

    /* compiled from: ConstructorTabInternalAction.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/user_stats/extended_user_stats/tabs/reports_constructor/mvi/entity/ConstructorTabInternalAction$ContentItems;", "Lcom/avito/android/user_stats/extended_user_stats/tabs/reports_constructor/mvi/entity/ConstructorTabInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableContent;", "_avito_user-stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ContentItems implements ConstructorTabInternalAction, TrackableContent {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final StatsDynamicItems f318174b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final StatsConfig f318175c;

        public ContentItems(@k StatsDynamicItems statsDynamicItems, @l StatsConfig statsConfig) {
            this.f318174b = statsDynamicItems;
            this.f318175c = statsConfig;
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @l
        /* renamed from: d */
        public final String getF261005e() {
            return null;
        }

        @Override // com.avito.android.analytics.screens.mvi.t
        @l
        /* renamed from: e */
        public final String getF112001c() {
            return null;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ContentItems)) {
                return false;
            }
            ContentItems contentItems = (ContentItems) obj;
            return L.f(this.f318174b, contentItems.f318174b) && L.f(this.f318175c, contentItems.f318175c);
        }

        public final int hashCode() {
            int iHashCode = this.f318174b.hashCode() * 31;
            StatsConfig statsConfig = this.f318175c;
            return iHashCode + (statsConfig == null ? 0 : statsConfig.hashCode());
        }

        @k
        public final String toString() {
            return "ContentItems(data=" + this.f318174b + ", config=" + this.f318175c + ')';
        }
    }

    /* compiled from: ConstructorTabInternalAction.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/user_stats/extended_user_stats/tabs/reports_constructor/mvi/entity/ConstructorTabInternalAction$ContentLocationsSplit;", "Lcom/avito/android/user_stats/extended_user_stats/tabs/reports_constructor/mvi/entity/ConstructorTabInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableContent;", "_avito_user-stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ContentLocationsSplit implements ConstructorTabInternalAction, TrackableContent {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final XJ0.a f318176b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final StatsConfig f318177c;

        public ContentLocationsSplit(@k XJ0.a aVar, @l StatsConfig statsConfig) {
            this.f318176b = aVar;
            this.f318177c = statsConfig;
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @l
        /* renamed from: d */
        public final String getF261005e() {
            return null;
        }

        @Override // com.avito.android.analytics.screens.mvi.t
        @l
        /* renamed from: e */
        public final String getF112001c() {
            return null;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ContentLocationsSplit)) {
                return false;
            }
            ContentLocationsSplit contentLocationsSplit = (ContentLocationsSplit) obj;
            return L.f(this.f318176b, contentLocationsSplit.f318176b) && L.f(this.f318177c, contentLocationsSplit.f318177c);
        }

        public final int hashCode() {
            int iHashCode = this.f318176b.hashCode() * 31;
            StatsConfig statsConfig = this.f318177c;
            return iHashCode + (statsConfig == null ? 0 : statsConfig.hashCode());
        }

        @k
        public final String toString() {
            return "ContentLocationsSplit(data=" + this.f318176b + ", config=" + this.f318177c + ')';
        }
    }

    /* compiled from: ConstructorTabInternalAction.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/user_stats/extended_user_stats/tabs/reports_constructor/mvi/entity/ConstructorTabInternalAction$ErrorChart;", "Lcom/avito/android/user_stats/extended_user_stats/tabs/reports_constructor/mvi/entity/ConstructorTabInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableError;", "_avito_user-stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ErrorChart implements ConstructorTabInternalAction, TrackableError {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final ApiError f318178b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final StatsConfig f318179c;

        /* renamed from: d, reason: collision with root package name */
        @k
        public final J.a f318180d;

        public ErrorChart(@k ApiError apiError, @l StatsConfig statsConfig) {
            this.f318178b = apiError;
            this.f318179c = statsConfig;
            this.f318180d = new J.a(apiError);
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @l
        /* renamed from: d */
        public final String getF261005e() {
            return null;
        }

        @Override // com.avito.android.analytics.screens.mvi.t
        @l
        /* renamed from: e */
        public final String getF112001c() {
            return null;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ErrorChart)) {
                return false;
            }
            ErrorChart errorChart = (ErrorChart) obj;
            return L.f(this.f318178b, errorChart.f318178b) && L.f(this.f318179c, errorChart.f318179c);
        }

        @Override // com.avito.android.analytics.screens.mvi.TrackableError
        @k
        /* renamed from: g, reason: from getter */
        public final J.a getF261002d() {
            return this.f318180d;
        }

        public final int hashCode() {
            int iHashCode = this.f318178b.hashCode() * 31;
            StatsConfig statsConfig = this.f318179c;
            return iHashCode + (statsConfig == null ? 0 : statsConfig.hashCode());
        }

        @k
        public final String toString() {
            return "ErrorChart(throwable=" + this.f318178b + ", config=" + this.f318179c + ')';
        }
    }

    /* compiled from: ConstructorTabInternalAction.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/user_stats/extended_user_stats/tabs/reports_constructor/mvi/entity/ConstructorTabInternalAction$ErrorItems;", "Lcom/avito/android/user_stats/extended_user_stats/tabs/reports_constructor/mvi/entity/ConstructorTabInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableError;", "_avito_user-stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ErrorItems implements ConstructorTabInternalAction, TrackableError {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final ApiError f318181b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final StatsConfig f318182c;

        /* renamed from: d, reason: collision with root package name */
        @k
        public final J.a f318183d;

        public ErrorItems(@k ApiError apiError, @l StatsConfig statsConfig) {
            this.f318181b = apiError;
            this.f318182c = statsConfig;
            this.f318183d = new J.a(apiError);
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @l
        /* renamed from: d */
        public final String getF261005e() {
            return null;
        }

        @Override // com.avito.android.analytics.screens.mvi.t
        @l
        /* renamed from: e */
        public final String getF112001c() {
            return null;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ErrorItems)) {
                return false;
            }
            ErrorItems errorItems = (ErrorItems) obj;
            return L.f(this.f318181b, errorItems.f318181b) && L.f(this.f318182c, errorItems.f318182c);
        }

        @Override // com.avito.android.analytics.screens.mvi.TrackableError
        @k
        /* renamed from: g, reason: from getter */
        public final J.a getF261002d() {
            return this.f318183d;
        }

        public final int hashCode() {
            int iHashCode = this.f318181b.hashCode() * 31;
            StatsConfig statsConfig = this.f318182c;
            return iHashCode + (statsConfig == null ? 0 : statsConfig.hashCode());
        }

        @k
        public final String toString() {
            return "ErrorItems(throwable=" + this.f318181b + ", config=" + this.f318182c + ')';
        }
    }

    /* compiled from: ConstructorTabInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_stats/extended_user_stats/tabs/reports_constructor/mvi/entity/ConstructorTabInternalAction$HandleDeeplink;", "Lcom/avito/android/user_stats/extended_user_stats/tabs/reports_constructor/mvi/entity/ConstructorTabInternalAction;", "_avito_user-stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class HandleDeeplink implements ConstructorTabInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final DeepLink f318184b;

        public HandleDeeplink(@k DeepLink deepLink) {
            this.f318184b = deepLink;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof HandleDeeplink) && L.f(this.f318184b, ((HandleDeeplink) obj).f318184b);
        }

        public final int hashCode() {
            return this.f318184b.hashCode();
        }

        @k
        public final String toString() {
            return com.avito.android.actions_sheet.a.v(new StringBuilder("HandleDeeplink(deepLink="), this.f318184b, ')');
        }
    }

    /* compiled from: ConstructorTabInternalAction.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/user_stats/extended_user_stats/tabs/reports_constructor/mvi/entity/ConstructorTabInternalAction$LoadingChart;", "Lcom/avito/android/user_stats/extended_user_stats/tabs/reports_constructor/mvi/entity/ConstructorTabInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableLoadingStarted;", "_avito_user-stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class LoadingChart extends TrackableLoadingStarted implements ConstructorTabInternalAction {

        /* renamed from: d, reason: collision with root package name */
        @l
        public final StatsConfig f318185d;

        public LoadingChart(@l StatsConfig statsConfig) {
            this.f318185d = statsConfig;
        }

        @Override // com.avito.android.analytics.screens.mvi.TrackableLoadingStarted
        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof LoadingChart) && L.f(this.f318185d, ((LoadingChart) obj).f318185d);
        }

        @Override // com.avito.android.analytics.screens.mvi.TrackableLoadingStarted
        public final int hashCode() {
            StatsConfig statsConfig = this.f318185d;
            if (statsConfig == null) {
                return 0;
            }
            return statsConfig.hashCode();
        }

        @k
        public final String toString() {
            return "LoadingChart(config=" + this.f318185d + ')';
        }
    }

    /* compiled from: ConstructorTabInternalAction.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/user_stats/extended_user_stats/tabs/reports_constructor/mvi/entity/ConstructorTabInternalAction$LoadingItems;", "Lcom/avito/android/user_stats/extended_user_stats/tabs/reports_constructor/mvi/entity/ConstructorTabInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableLoadingStarted;", "_avito_user-stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class LoadingItems extends TrackableLoadingStarted implements ConstructorTabInternalAction {

        /* renamed from: d, reason: collision with root package name */
        @l
        public final StatsConfig f318186d;

        public LoadingItems(@l StatsConfig statsConfig) {
            this.f318186d = statsConfig;
        }

        @Override // com.avito.android.analytics.screens.mvi.TrackableLoadingStarted
        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof LoadingItems) && L.f(this.f318186d, ((LoadingItems) obj).f318186d);
        }

        @Override // com.avito.android.analytics.screens.mvi.TrackableLoadingStarted
        public final int hashCode() {
            StatsConfig statsConfig = this.f318186d;
            if (statsConfig == null) {
                return 0;
            }
            return statsConfig.hashCode();
        }

        @k
        public final String toString() {
            return "LoadingItems(config=" + this.f318186d + ')';
        }
    }

    /* compiled from: ConstructorTabInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/user_stats/extended_user_stats/tabs/reports_constructor/mvi/entity/ConstructorTabInternalAction$OnCloseSplitDialog;", "Lcom/avito/android/user_stats/extended_user_stats/tabs/reports_constructor/mvi/entity/ConstructorTabInternalAction;", "<init>", "()V", "_avito_user-stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class OnCloseSplitDialog implements ConstructorTabInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final OnCloseSplitDialog f318187b = new OnCloseSplitDialog();

        private OnCloseSplitDialog() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof OnCloseSplitDialog);
        }

        public final int hashCode() {
            return 1881963003;
        }

        @k
        public final String toString() {
            return "OnCloseSplitDialog";
        }
    }

    /* compiled from: ConstructorTabInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_stats/extended_user_stats/tabs/reports_constructor/mvi/entity/ConstructorTabInternalAction$OnColumnClick;", "Lcom/avito/android/user_stats/extended_user_stats/tabs/reports_constructor/mvi/entity/ConstructorTabInternalAction;", "_avito_user-stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class OnColumnClick implements ConstructorTabInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @l
        public final Integer f318188b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final String f318189c;

        /* JADX WARN: Multi-variable type inference failed */
        public OnColumnClick() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnColumnClick)) {
                return false;
            }
            OnColumnClick onColumnClick = (OnColumnClick) obj;
            return L.f(this.f318188b, onColumnClick.f318188b) && L.f(this.f318189c, onColumnClick.f318189c);
        }

        public final int hashCode() {
            Integer num = this.f318188b;
            int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
            String str = this.f318189c;
            return iHashCode + (str != null ? str.hashCode() : 0);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("OnColumnClick(index=");
            sb2.append(this.f318188b);
            sb2.append(", period=");
            return C22026a.c(sb2, this.f318189c, ')');
        }

        public OnColumnClick(@l Integer num, @l String str) {
            this.f318188b = num;
            this.f318189c = str;
        }

        public /* synthetic */ OnColumnClick(Integer num, String str, int i12, C42822w c42822w) {
            this((i12 & 1) != 0 ? null : num, (i12 & 2) != 0 ? null : str);
        }
    }

    /* compiled from: ConstructorTabInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_stats/extended_user_stats/tabs/reports_constructor/mvi/entity/ConstructorTabInternalAction$OnHideTooltipClick;", "Lcom/avito/android/user_stats/extended_user_stats/tabs/reports_constructor/mvi/entity/ConstructorTabInternalAction;", "_avito_user-stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class OnHideTooltipClick implements ConstructorTabInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @l
        public final List<SplitListDialogItem> f318190b;

        public OnHideTooltipClick(@l List<SplitListDialogItem> list) {
            this.f318190b = list;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OnHideTooltipClick) && L.f(this.f318190b, ((OnHideTooltipClick) obj).f318190b);
        }

        public final int hashCode() {
            List<SplitListDialogItem> list = this.f318190b;
            if (list == null) {
                return 0;
            }
            return list.hashCode();
        }

        @k
        public final String toString() {
            return H.p(new StringBuilder("OnHideTooltipClick(items="), this.f318190b, ')');
        }
    }

    /* compiled from: ConstructorTabInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_stats/extended_user_stats/tabs/reports_constructor/mvi/entity/ConstructorTabInternalAction$OnMetricHintClick;", "Lcom/avito/android/user_stats/extended_user_stats/tabs/reports_constructor/mvi/entity/ConstructorTabInternalAction;", "_avito_user-stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class OnMetricHintClick implements ConstructorTabInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final Hint f318191b;

        public OnMetricHintClick(@k Hint hint) {
            this.f318191b = hint;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OnMetricHintClick) && L.f(this.f318191b, ((OnMetricHintClick) obj).f318191b);
        }

        public final int hashCode() {
            return this.f318191b.hashCode();
        }

        @k
        public final String toString() {
            return "OnMetricHintClick(hint=" + this.f318191b + ')';
        }
    }

    /* compiled from: ConstructorTabInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/user_stats/extended_user_stats/tabs/reports_constructor/mvi/entity/ConstructorTabInternalAction$OnOpenVasesClick;", "Lcom/avito/android/user_stats/extended_user_stats/tabs/reports_constructor/mvi/entity/ConstructorTabInternalAction;", "<init>", "()V", "_avito_user-stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class OnOpenVasesClick implements ConstructorTabInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final OnOpenVasesClick f318192b = new OnOpenVasesClick();

        private OnOpenVasesClick() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof OnOpenVasesClick);
        }

        public final int hashCode() {
            return -774819443;
        }

        @k
        public final String toString() {
            return "OnOpenVasesClick";
        }
    }

    /* compiled from: ConstructorTabInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_stats/extended_user_stats/tabs/reports_constructor/mvi/entity/ConstructorTabInternalAction$OnPeriodClick;", "Lcom/avito/android/user_stats/extended_user_stats/tabs/reports_constructor/mvi/entity/ConstructorTabInternalAction;", "_avito_user-stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class OnPeriodClick implements ConstructorTabInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @l
        public final StatsConfig f318193b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final SegmentType f318194c;

        public OnPeriodClick(@l StatsConfig statsConfig, @k SegmentType segmentType) {
            this.f318193b = statsConfig;
            this.f318194c = segmentType;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnPeriodClick)) {
                return false;
            }
            OnPeriodClick onPeriodClick = (OnPeriodClick) obj;
            return L.f(this.f318193b, onPeriodClick.f318193b) && this.f318194c == onPeriodClick.f318194c;
        }

        public final int hashCode() {
            StatsConfig statsConfig = this.f318193b;
            return this.f318194c.hashCode() + ((statsConfig == null ? 0 : statsConfig.hashCode()) * 31);
        }

        @k
        public final String toString() {
            return "OnPeriodClick(config=" + this.f318193b + ", selectedSegment=" + this.f318194c + ')';
        }
    }

    /* compiled from: ConstructorTabInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_stats/extended_user_stats/tabs/reports_constructor/mvi/entity/ConstructorTabInternalAction$OnSelectedPeriod;", "Lcom/avito/android/user_stats/extended_user_stats/tabs/reports_constructor/mvi/entity/ConstructorTabInternalAction;", "_avito_user-stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class OnSelectedPeriod implements ConstructorTabInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @l
        public final String f318195b;

        /* JADX WARN: Multi-variable type inference failed */
        public OnSelectedPeriod() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OnSelectedPeriod) && L.f(this.f318195b, ((OnSelectedPeriod) obj).f318195b);
        }

        public final int hashCode() {
            String str = this.f318195b;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("OnSelectedPeriod(period="), this.f318195b, ')');
        }

        public OnSelectedPeriod(@l String str) {
            this.f318195b = str;
        }

        public /* synthetic */ OnSelectedPeriod(String str, int i12, C42822w c42822w) {
            this((i12 & 1) != 0 ? null : str);
        }
    }

    /* compiled from: ConstructorTabInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_stats/extended_user_stats/tabs/reports_constructor/mvi/entity/ConstructorTabInternalAction$OnSplitClick;", "Lcom/avito/android/user_stats/extended_user_stats/tabs/reports_constructor/mvi/entity/ConstructorTabInternalAction;", "_avito_user-stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class OnSplitClick implements ConstructorTabInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @l
        public final List<SplitListDialogItem> f318196b;

        public OnSplitClick(@l List<SplitListDialogItem> list) {
            this.f318196b = list;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OnSplitClick) && L.f(this.f318196b, ((OnSplitClick) obj).f318196b);
        }

        public final int hashCode() {
            List<SplitListDialogItem> list = this.f318196b;
            if (list == null) {
                return 0;
            }
            return list.hashCode();
        }

        @k
        public final String toString() {
            return H.p(new StringBuilder("OnSplitClick(items="), this.f318196b, ')');
        }
    }

    /* compiled from: ConstructorTabInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_stats/extended_user_stats/tabs/reports_constructor/mvi/entity/ConstructorTabInternalAction$OnSplitDialogClick;", "Lcom/avito/android/user_stats/extended_user_stats/tabs/reports_constructor/mvi/entity/ConstructorTabInternalAction;", "_avito_user-stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class OnSplitDialogClick implements ConstructorTabInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @l
        public final String f318197b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final StatsConfig f318198c;

        public OnSplitDialogClick(@l StatsConfig statsConfig, @l String str) {
            this.f318197b = str;
            this.f318198c = statsConfig;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnSplitDialogClick)) {
                return false;
            }
            OnSplitDialogClick onSplitDialogClick = (OnSplitDialogClick) obj;
            return L.f(this.f318197b, onSplitDialogClick.f318197b) && L.f(this.f318198c, onSplitDialogClick.f318198c);
        }

        public final int hashCode() {
            String str = this.f318197b;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            StatsConfig statsConfig = this.f318198c;
            return iHashCode + (statsConfig != null ? statsConfig.hashCode() : 0);
        }

        @k
        public final String toString() {
            return "OnSplitDialogClick(selectedSplitSlug=" + this.f318197b + ", config=" + this.f318198c + ')';
        }
    }

    /* compiled from: ConstructorTabInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_stats/extended_user_stats/tabs/reports_constructor/mvi/entity/ConstructorTabInternalAction$OnSplitHintClick;", "Lcom/avito/android/user_stats/extended_user_stats/tabs/reports_constructor/mvi/entity/ConstructorTabInternalAction;", "_avito_user-stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class OnSplitHintClick implements ConstructorTabInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f318199b;

        public OnSplitHintClick(@k String str) {
            this.f318199b = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OnSplitHintClick) && L.f(this.f318199b, ((OnSplitHintClick) obj).f318199b);
        }

        public final int hashCode() {
            return this.f318199b.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("OnSplitHintClick(helpText="), this.f318199b, ')');
        }
    }

    /* compiled from: ConstructorTabInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_stats/extended_user_stats/tabs/reports_constructor/mvi/entity/ConstructorTabInternalAction$OnSplitItemClick;", "Lcom/avito/android/user_stats/extended_user_stats/tabs/reports_constructor/mvi/entity/ConstructorTabInternalAction;", "_avito_user-stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class OnSplitItemClick implements ConstructorTabInternalAction {

        /* renamed from: b, reason: collision with root package name */
        public final long f318200b;

        public OnSplitItemClick(long j12) {
            this.f318200b = j12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OnSplitItemClick) && this.f318200b == ((OnSplitItemClick) obj).f318200b;
        }

        public final int hashCode() {
            return Long.hashCode(this.f318200b);
        }

        @k
        public final String toString() {
            return r.u(new StringBuilder("OnSplitItemClick(splitId="), this.f318200b, ')');
        }
    }

    /* compiled from: ConstructorTabInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/user_stats/extended_user_stats/tabs/reports_constructor/mvi/entity/ConstructorTabInternalAction$ScreenOpened;", "Lcom/avito/android/user_stats/extended_user_stats/tabs/reports_constructor/mvi/entity/ConstructorTabInternalAction;", "<init>", "()V", "_avito_user-stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ScreenOpened implements ConstructorTabInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final ScreenOpened f318201b = new ScreenOpened();

        private ScreenOpened() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof ScreenOpened);
        }

        public final int hashCode() {
            return 315361159;
        }

        @k
        public final String toString() {
            return "ScreenOpened";
        }
    }

    /* compiled from: ConstructorTabInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/user_stats/extended_user_stats/tabs/reports_constructor/mvi/entity/ConstructorTabInternalAction$ShowABUxFeedback;", "Lcom/avito/android/user_stats/extended_user_stats/tabs/reports_constructor/mvi/entity/ConstructorTabInternalAction;", "<init>", "()V", "_avito_user-stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ShowABUxFeedback implements ConstructorTabInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final ShowABUxFeedback f318202b = new ShowABUxFeedback();

        private ShowABUxFeedback() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof ShowABUxFeedback);
        }

        public final int hashCode() {
            return 1462287448;
        }

        @k
        public final String toString() {
            return "ShowABUxFeedback";
        }
    }

    /* compiled from: ConstructorTabInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/user_stats/extended_user_stats/tabs/reports_constructor/mvi/entity/ConstructorTabInternalAction$ShowEmptyTodayToast;", "Lcom/avito/android/user_stats/extended_user_stats/tabs/reports_constructor/mvi/entity/ConstructorTabInternalAction;", "<init>", "()V", "_avito_user-stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ShowEmptyTodayToast implements ConstructorTabInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final ShowEmptyTodayToast f318203b = new ShowEmptyTodayToast();

        private ShowEmptyTodayToast() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof ShowEmptyTodayToast);
        }

        public final int hashCode() {
            return 1556665348;
        }

        @k
        public final String toString() {
            return "ShowEmptyTodayToast";
        }
    }

    /* compiled from: ConstructorTabInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/user_stats/extended_user_stats/tabs/reports_constructor/mvi/entity/ConstructorTabInternalAction$ShowLoadingIfEmptyData;", "Lcom/avito/android/user_stats/extended_user_stats/tabs/reports_constructor/mvi/entity/ConstructorTabInternalAction;", "<init>", "()V", "_avito_user-stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ShowLoadingIfEmptyData implements ConstructorTabInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final ShowLoadingIfEmptyData f318204b = new ShowLoadingIfEmptyData();

        private ShowLoadingIfEmptyData() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof ShowLoadingIfEmptyData);
        }

        public final int hashCode() {
            return -427467251;
        }

        @k
        public final String toString() {
            return "ShowLoadingIfEmptyData";
        }
    }

    /* compiled from: ConstructorTabInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/user_stats/extended_user_stats/tabs/reports_constructor/mvi/entity/ConstructorTabInternalAction$ShowOneStatsOpenUxFeedback;", "Lcom/avito/android/user_stats/extended_user_stats/tabs/reports_constructor/mvi/entity/ConstructorTabInternalAction;", "<init>", "()V", "_avito_user-stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ShowOneStatsOpenUxFeedback implements ConstructorTabInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final ShowOneStatsOpenUxFeedback f318205b = new ShowOneStatsOpenUxFeedback();

        private ShowOneStatsOpenUxFeedback() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof ShowOneStatsOpenUxFeedback);
        }

        public final int hashCode() {
            return 289993434;
        }

        @k
        public final String toString() {
            return "ShowOneStatsOpenUxFeedback";
        }
    }

    /* compiled from: ConstructorTabInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_stats/extended_user_stats/tabs/reports_constructor/mvi/entity/ConstructorTabInternalAction$ShowSplitUxFeedback;", "Lcom/avito/android/user_stats/extended_user_stats/tabs/reports_constructor/mvi/entity/ConstructorTabInternalAction;", "_avito_user-stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ShowSplitUxFeedback implements ConstructorTabInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @l
        public final String f318206b;

        public ShowSplitUxFeedback(@l String str) {
            this.f318206b = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ShowSplitUxFeedback) && L.f(this.f318206b, ((ShowSplitUxFeedback) obj).f318206b);
        }

        public final int hashCode() {
            String str = this.f318206b;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("ShowSplitUxFeedback(type="), this.f318206b, ')');
        }
    }

    /* compiled from: ConstructorTabInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/user_stats/extended_user_stats/tabs/reports_constructor/mvi/entity/ConstructorTabInternalAction$ShowVisitUxFeedback;", "Lcom/avito/android/user_stats/extended_user_stats/tabs/reports_constructor/mvi/entity/ConstructorTabInternalAction;", "<init>", "()V", "_avito_user-stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ShowVisitUxFeedback implements ConstructorTabInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final ShowVisitUxFeedback f318207b = new ShowVisitUxFeedback();

        private ShowVisitUxFeedback() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof ShowVisitUxFeedback);
        }

        public final int hashCode() {
            return 200596068;
        }

        @k
        public final String toString() {
            return "ShowVisitUxFeedback";
        }
    }
}
