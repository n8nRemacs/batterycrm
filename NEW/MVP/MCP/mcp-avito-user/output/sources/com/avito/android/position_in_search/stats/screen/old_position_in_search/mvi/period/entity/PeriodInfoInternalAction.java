package com.avito.android.position_in_search.stats.screen.old_position_in_search.mvi.period.entity;

import V80.c;
import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.screens.J;
import com.avito.android.analytics.screens.mvi.TrackableContent;
import com.avito.android.analytics.screens.mvi.TrackableError;
import com.avito.android.analytics.screens.mvi.TrackableLoadingStarted;
import com.avito.android.analytics.screens.mvi.n;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.position_in_search.stats.screen.old_position_in_search.domain.model.PositionInfoPeriod;
import com.avito.android.position_in_search.stats.screen.old_position_in_search.view.tracker.SearchPositionScreen;
import com.avito.android.remote.error.ApiError;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: PeriodInfoInternalAction.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u000e\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0082\u0001\u000b\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a¨\u0006\u001b"}, d2 = {"Lcom/avito/android/position_in_search/stats/screen/old_position_in_search/mvi/period/entity/PeriodInfoInternalAction;", "Lcom/avito/android/analytics/screens/mvi/n;", "BannerClosed", "ChangeSortItem", "ExpandQueryItem", "LoadingAction", "LoadingError", "LoadingResult", "LoadingStart", "NextPage", "NoChange", "OpenDeepLink", "OpenSortDeepLink", "PeriodSelected", "Sort", "ToastClosed", "Lcom/avito/android/position_in_search/stats/screen/old_position_in_search/mvi/period/entity/PeriodInfoInternalAction$BannerClosed;", "Lcom/avito/android/position_in_search/stats/screen/old_position_in_search/mvi/period/entity/PeriodInfoInternalAction$ChangeSortItem;", "Lcom/avito/android/position_in_search/stats/screen/old_position_in_search/mvi/period/entity/PeriodInfoInternalAction$ExpandQueryItem;", "Lcom/avito/android/position_in_search/stats/screen/old_position_in_search/mvi/period/entity/PeriodInfoInternalAction$LoadingAction;", "Lcom/avito/android/position_in_search/stats/screen/old_position_in_search/mvi/period/entity/PeriodInfoInternalAction$NextPage;", "Lcom/avito/android/position_in_search/stats/screen/old_position_in_search/mvi/period/entity/PeriodInfoInternalAction$NoChange;", "Lcom/avito/android/position_in_search/stats/screen/old_position_in_search/mvi/period/entity/PeriodInfoInternalAction$OpenDeepLink;", "Lcom/avito/android/position_in_search/stats/screen/old_position_in_search/mvi/period/entity/PeriodInfoInternalAction$OpenSortDeepLink;", "Lcom/avito/android/position_in_search/stats/screen/old_position_in_search/mvi/period/entity/PeriodInfoInternalAction$PeriodSelected;", "Lcom/avito/android/position_in_search/stats/screen/old_position_in_search/mvi/period/entity/PeriodInfoInternalAction$Sort;", "Lcom/avito/android/position_in_search/stats/screen/old_position_in_search/mvi/period/entity/PeriodInfoInternalAction$ToastClosed;", "_avito_position-in-search_stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface PeriodInfoInternalAction extends n {

    /* compiled from: PeriodInfoInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/position_in_search/stats/screen/old_position_in_search/mvi/period/entity/PeriodInfoInternalAction$BannerClosed;", "Lcom/avito/android/position_in_search/stats/screen/old_position_in_search/mvi/period/entity/PeriodInfoInternalAction;", "_avito_position-in-search_stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class BannerClosed implements PeriodInfoInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f220587b;

        public BannerClosed(@k String str) {
            this.f220587b = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof BannerClosed) && L.f(this.f220587b, ((BannerClosed) obj).f220587b);
        }

        public final int hashCode() {
            return this.f220587b.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("BannerClosed(bannerId="), this.f220587b, ')');
        }
    }

    /* compiled from: PeriodInfoInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/position_in_search/stats/screen/old_position_in_search/mvi/period/entity/PeriodInfoInternalAction$ChangeSortItem;", "Lcom/avito/android/position_in_search/stats/screen/old_position_in_search/mvi/period/entity/PeriodInfoInternalAction;", "_avito_position-in-search_stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ChangeSortItem implements PeriodInfoInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f220588b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final String f220589c;

        public ChangeSortItem(@k String str, @k String str2) {
            this.f220588b = str;
            this.f220589c = str2;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ChangeSortItem)) {
                return false;
            }
            ChangeSortItem changeSortItem = (ChangeSortItem) obj;
            return L.f(this.f220588b, changeSortItem.f220588b) && L.f(this.f220589c, changeSortItem.f220589c);
        }

        public final int hashCode() {
            return this.f220589c.hashCode() + (this.f220588b.hashCode() * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ChangeSortItem(slug=");
            sb2.append(this.f220588b);
            sb2.append(", sortTitle=");
            return C22026a.c(sb2, this.f220589c, ')');
        }
    }

    /* compiled from: PeriodInfoInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/position_in_search/stats/screen/old_position_in_search/mvi/period/entity/PeriodInfoInternalAction$ExpandQueryItem;", "Lcom/avito/android/position_in_search/stats/screen/old_position_in_search/mvi/period/entity/PeriodInfoInternalAction;", "_avito_position-in-search_stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ExpandQueryItem implements PeriodInfoInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f220590b;

        public ExpandQueryItem(@k String str) {
            this.f220590b = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ExpandQueryItem) && L.f(this.f220590b, ((ExpandQueryItem) obj).f220590b);
        }

        public final int hashCode() {
            return this.f220590b.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("ExpandQueryItem(queryId="), this.f220590b, ')');
        }
    }

    /* compiled from: PeriodInfoInternalAction.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001\u0082\u0001\u0003\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/position_in_search/stats/screen/old_position_in_search/mvi/period/entity/PeriodInfoInternalAction$LoadingAction;", "Lcom/avito/android/position_in_search/stats/screen/old_position_in_search/mvi/period/entity/PeriodInfoInternalAction;", "Lcom/avito/android/position_in_search/stats/screen/old_position_in_search/mvi/period/entity/PeriodInfoInternalAction$LoadingError;", "Lcom/avito/android/position_in_search/stats/screen/old_position_in_search/mvi/period/entity/PeriodInfoInternalAction$LoadingResult;", "Lcom/avito/android/position_in_search/stats/screen/old_position_in_search/mvi/period/entity/PeriodInfoInternalAction$LoadingStart;", "_avito_position-in-search_stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface LoadingAction extends PeriodInfoInternalAction {
    }

    /* compiled from: PeriodInfoInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/position_in_search/stats/screen/old_position_in_search/mvi/period/entity/PeriodInfoInternalAction$LoadingError;", "Lcom/avito/android/position_in_search/stats/screen/old_position_in_search/mvi/period/entity/PeriodInfoInternalAction$LoadingAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableError;", "_avito_position-in-search_stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class LoadingError implements LoadingAction, TrackableError {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final ApiError f220591b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final Throwable f220592c;

        /* renamed from: d, reason: collision with root package name */
        @k
        public final String f220593d;

        /* renamed from: e, reason: collision with root package name */
        @k
        public final J.a f220594e;

        public LoadingError(@k ApiError apiError, @l Throwable th2) {
            this.f220591b = apiError;
            this.f220592c = th2;
            SearchPositionScreen.f221262d.getClass();
            this.f220593d = SearchPositionScreen.f221264f;
            J.a.f90383b.getClass();
            this.f220594e = J.a.C2676a.a(apiError, th2);
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @k
        /* renamed from: d, reason: from getter */
        public final String getF267993e() {
            return this.f220593d;
        }

        @Override // com.avito.android.analytics.screens.mvi.t
        @l
        /* renamed from: e */
        public final String getF303160d() {
            return this.f220593d;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof LoadingError)) {
                return false;
            }
            LoadingError loadingError = (LoadingError) obj;
            return L.f(this.f220591b, loadingError.f220591b) && L.f(this.f220592c, loadingError.f220592c);
        }

        @Override // com.avito.android.analytics.screens.mvi.TrackableError
        @k
        /* renamed from: g, reason: from getter */
        public final J.a getF208324d() {
            return this.f220594e;
        }

        public final int hashCode() {
            int iHashCode = this.f220591b.hashCode() * 31;
            Throwable th2 = this.f220592c;
            return iHashCode + (th2 == null ? 0 : th2.hashCode());
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("LoadingError(error=");
            sb2.append(this.f220591b);
            sb2.append(", cause=");
            return com.avito.android.advert.item.delivery_suggests.l.t(sb2, this.f220592c, ')');
        }
    }

    /* compiled from: PeriodInfoInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/position_in_search/stats/screen/old_position_in_search/mvi/period/entity/PeriodInfoInternalAction$LoadingResult;", "Lcom/avito/android/position_in_search/stats/screen/old_position_in_search/mvi/period/entity/PeriodInfoInternalAction$LoadingAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableContent;", "_avito_position-in-search_stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class LoadingResult implements LoadingAction, TrackableContent {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final PositionInfoPeriod f220595b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final c f220596c;

        /* renamed from: d, reason: collision with root package name */
        @k
        public final String f220597d;

        public LoadingResult(@k PositionInfoPeriod positionInfoPeriod, @k c cVar) {
            this.f220595b = positionInfoPeriod;
            this.f220596c = cVar;
            SearchPositionScreen.f221262d.getClass();
            this.f220597d = SearchPositionScreen.f221264f;
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @k
        /* renamed from: d, reason: from getter */
        public final String getF267993e() {
            return this.f220597d;
        }

        @Override // com.avito.android.analytics.screens.mvi.t
        @l
        /* renamed from: e */
        public final String getF303160d() {
            return this.f220597d;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof LoadingResult)) {
                return false;
            }
            LoadingResult loadingResult = (LoadingResult) obj;
            return L.f(this.f220595b, loadingResult.f220595b) && L.f(this.f220596c, loadingResult.f220596c);
        }

        public final int hashCode() {
            return this.f220596c.hashCode() + (this.f220595b.hashCode() * 31);
        }

        @k
        public final String toString() {
            return "LoadingResult(info=" + this.f220595b + ", closedBanners=" + this.f220596c + ')';
        }
    }

    /* compiled from: PeriodInfoInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/position_in_search/stats/screen/old_position_in_search/mvi/period/entity/PeriodInfoInternalAction$LoadingStart;", "Lcom/avito/android/position_in_search/stats/screen/old_position_in_search/mvi/period/entity/PeriodInfoInternalAction$LoadingAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableLoadingStarted;", "<init>", "()V", "_avito_position-in-search_stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class LoadingStart extends TrackableLoadingStarted implements LoadingAction {

        /* renamed from: d, reason: collision with root package name */
        @k
        public final String f220598d;

        /* renamed from: e, reason: collision with root package name */
        @k
        public final ScreenPerformanceTracker.LoadingType f220599e;

        public LoadingStart() {
            SearchPositionScreen.f221262d.getClass();
            this.f220598d = SearchPositionScreen.f221264f;
            this.f220599e = ScreenPerformanceTracker.LoadingType.f90785b;
        }

        @Override // com.avito.android.analytics.screens.mvi.TrackableLoadingStarted, com.avito.android.analytics.screens.mvi.s
        @k
        /* renamed from: d, reason: from getter */
        public final String getF267993e() {
            return this.f220598d;
        }

        @Override // com.avito.android.analytics.screens.mvi.TrackableLoadingStarted
        @k
        /* renamed from: h, reason: from getter */
        public final ScreenPerformanceTracker.LoadingType getF220522e() {
            return this.f220599e;
        }
    }

    /* compiled from: PeriodInfoInternalAction.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/position_in_search/stats/screen/old_position_in_search/mvi/period/entity/PeriodInfoInternalAction$NextPage;", "Lcom/avito/android/position_in_search/stats/screen/old_position_in_search/mvi/period/entity/PeriodInfoInternalAction;", "LoadingError", "LoadingResult", "LoadingStart", "Lcom/avito/android/position_in_search/stats/screen/old_position_in_search/mvi/period/entity/PeriodInfoInternalAction$NextPage$LoadingError;", "Lcom/avito/android/position_in_search/stats/screen/old_position_in_search/mvi/period/entity/PeriodInfoInternalAction$NextPage$LoadingResult;", "Lcom/avito/android/position_in_search/stats/screen/old_position_in_search/mvi/period/entity/PeriodInfoInternalAction$NextPage$LoadingStart;", "_avito_position-in-search_stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface NextPage extends PeriodInfoInternalAction {

        /* compiled from: PeriodInfoInternalAction.kt */
        @P
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/position_in_search/stats/screen/old_position_in_search/mvi/period/entity/PeriodInfoInternalAction$NextPage$LoadingError;", "Lcom/avito/android/position_in_search/stats/screen/old_position_in_search/mvi/period/entity/PeriodInfoInternalAction$NextPage;", "Lcom/avito/android/analytics/screens/mvi/TrackableError;", "_avito_position-in-search_stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class LoadingError implements NextPage, TrackableError {

            /* renamed from: b, reason: collision with root package name */
            @k
            public final LoadingError f220600b;

            /* renamed from: c, reason: collision with root package name */
            @k
            public final String f220601c;

            public LoadingError(@k LoadingError loadingError) {
                this.f220600b = loadingError;
                SearchPositionScreen.f221262d.getClass();
                this.f220601c = SearchPositionScreen.f221266h;
            }

            @Override // com.avito.android.position_in_search.stats.screen.old_position_in_search.mvi.period.entity.PeriodInfoInternalAction.NextPage
            public final LoadingAction a() {
                return this.f220600b;
            }

            @Override // com.avito.android.analytics.screens.mvi.s
            @k
            /* renamed from: d, reason: from getter */
            public final String getF267993e() {
                return this.f220601c;
            }

            @Override // com.avito.android.analytics.screens.mvi.t
            @l
            /* renamed from: e */
            public final String getF303160d() {
                return this.f220600b.f220593d;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof LoadingError) && L.f(this.f220600b, ((LoadingError) obj).f220600b);
            }

            @Override // com.avito.android.analytics.screens.mvi.TrackableError
            @k
            /* renamed from: g */
            public final J.a getF208324d() {
                return this.f220600b.f220594e;
            }

            public final int hashCode() {
                return this.f220600b.hashCode();
            }

            @k
            public final String toString() {
                return "LoadingError(loadingAction=" + this.f220600b + ')';
            }
        }

        /* compiled from: PeriodInfoInternalAction.kt */
        @P
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/position_in_search/stats/screen/old_position_in_search/mvi/period/entity/PeriodInfoInternalAction$NextPage$LoadingResult;", "Lcom/avito/android/position_in_search/stats/screen/old_position_in_search/mvi/period/entity/PeriodInfoInternalAction$NextPage;", "Lcom/avito/android/analytics/screens/mvi/TrackableContent;", "_avito_position-in-search_stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class LoadingResult implements NextPage, TrackableContent {

            /* renamed from: b, reason: collision with root package name */
            @k
            public final LoadingResult f220602b;

            /* renamed from: c, reason: collision with root package name */
            @k
            public final String f220603c;

            public LoadingResult(@k LoadingResult loadingResult) {
                this.f220602b = loadingResult;
                SearchPositionScreen.f221262d.getClass();
                this.f220603c = SearchPositionScreen.f221266h;
            }

            @Override // com.avito.android.position_in_search.stats.screen.old_position_in_search.mvi.period.entity.PeriodInfoInternalAction.NextPage
            public final LoadingAction a() {
                return this.f220602b;
            }

            @Override // com.avito.android.analytics.screens.mvi.s
            @k
            /* renamed from: d, reason: from getter */
            public final String getF267993e() {
                return this.f220603c;
            }

            @Override // com.avito.android.analytics.screens.mvi.t
            @l
            /* renamed from: e */
            public final String getF303160d() {
                return this.f220602b.f220597d;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof LoadingResult) && L.f(this.f220602b, ((LoadingResult) obj).f220602b);
            }

            public final int hashCode() {
                return this.f220602b.hashCode();
            }

            @k
            public final String toString() {
                return "LoadingResult(loadingAction=" + this.f220602b + ')';
            }
        }

        /* compiled from: PeriodInfoInternalAction.kt */
        @P
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/position_in_search/stats/screen/old_position_in_search/mvi/period/entity/PeriodInfoInternalAction$NextPage$LoadingStart;", "Lcom/avito/android/position_in_search/stats/screen/old_position_in_search/mvi/period/entity/PeriodInfoInternalAction$NextPage;", "Lcom/avito/android/analytics/screens/mvi/TrackableLoadingStarted;", "_avito_position-in-search_stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class LoadingStart extends TrackableLoadingStarted implements NextPage {

            /* renamed from: d, reason: collision with root package name */
            @k
            public final LoadingStart f220604d;

            /* renamed from: e, reason: collision with root package name */
            @k
            public final String f220605e;

            /* renamed from: f, reason: collision with root package name */
            @k
            public final ScreenPerformanceTracker.LoadingType f220606f;

            public LoadingStart(@k LoadingStart loadingStart) {
                this.f220604d = loadingStart;
                SearchPositionScreen.f221262d.getClass();
                this.f220605e = SearchPositionScreen.f221266h;
                this.f220606f = ScreenPerformanceTracker.LoadingType.f90785b;
            }

            @Override // com.avito.android.position_in_search.stats.screen.old_position_in_search.mvi.period.entity.PeriodInfoInternalAction.NextPage
            public final LoadingAction a() {
                return this.f220604d;
            }

            @Override // com.avito.android.analytics.screens.mvi.TrackableLoadingStarted, com.avito.android.analytics.screens.mvi.s
            @k
            /* renamed from: d, reason: from getter */
            public final String getF267993e() {
                return this.f220605e;
            }

            @Override // com.avito.android.analytics.screens.mvi.TrackableLoadingStarted
            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof LoadingStart) && L.f(this.f220604d, ((LoadingStart) obj).f220604d);
            }

            @Override // com.avito.android.analytics.screens.mvi.TrackableLoadingStarted
            @k
            /* renamed from: h, reason: from getter */
            public final ScreenPerformanceTracker.LoadingType getF220522e() {
                return this.f220606f;
            }

            @Override // com.avito.android.analytics.screens.mvi.TrackableLoadingStarted
            public final int hashCode() {
                return this.f220604d.hashCode();
            }

            @k
            public final String toString() {
                return "LoadingStart(loadingAction=" + this.f220604d + ')';
            }
        }

        @k
        LoadingAction a();
    }

    /* compiled from: PeriodInfoInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/position_in_search/stats/screen/old_position_in_search/mvi/period/entity/PeriodInfoInternalAction$NoChange;", "Lcom/avito/android/position_in_search/stats/screen/old_position_in_search/mvi/period/entity/PeriodInfoInternalAction;", "<init>", "()V", "_avito_position-in-search_stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class NoChange implements PeriodInfoInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final NoChange f220607b = new NoChange();

        private NoChange() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof NoChange);
        }

        public final int hashCode() {
            return 27634467;
        }

        @k
        public final String toString() {
            return "NoChange";
        }
    }

    /* compiled from: PeriodInfoInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/position_in_search/stats/screen/old_position_in_search/mvi/period/entity/PeriodInfoInternalAction$OpenDeepLink;", "Lcom/avito/android/position_in_search/stats/screen/old_position_in_search/mvi/period/entity/PeriodInfoInternalAction;", "_avito_position-in-search_stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class OpenDeepLink implements PeriodInfoInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final DeepLink f220608b;

        public OpenDeepLink(@k DeepLink deepLink) {
            this.f220608b = deepLink;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OpenDeepLink) && L.f(this.f220608b, ((OpenDeepLink) obj).f220608b);
        }

        public final int hashCode() {
            return this.f220608b.hashCode();
        }

        @k
        public final String toString() {
            return com.avito.android.actions_sheet.a.v(new StringBuilder("OpenDeepLink(deepLink="), this.f220608b, ')');
        }
    }

    /* compiled from: PeriodInfoInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/position_in_search/stats/screen/old_position_in_search/mvi/period/entity/PeriodInfoInternalAction$OpenSortDeepLink;", "Lcom/avito/android/position_in_search/stats/screen/old_position_in_search/mvi/period/entity/PeriodInfoInternalAction;", "_avito_position-in-search_stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class OpenSortDeepLink implements PeriodInfoInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final DeepLink f220609b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final String f220610c;

        public OpenSortDeepLink(@k DeepLink deepLink, @k String str) {
            this.f220609b = deepLink;
            this.f220610c = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OpenSortDeepLink)) {
                return false;
            }
            OpenSortDeepLink openSortDeepLink = (OpenSortDeepLink) obj;
            return L.f(this.f220609b, openSortDeepLink.f220609b) && L.f(this.f220610c, openSortDeepLink.f220610c);
        }

        public final int hashCode() {
            return this.f220610c.hashCode() + (this.f220609b.hashCode() * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("OpenSortDeepLink(deepLink=");
            sb2.append(this.f220609b);
            sb2.append(", slug=");
            return C22026a.c(sb2, this.f220610c, ')');
        }
    }

    /* compiled from: PeriodInfoInternalAction.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/position_in_search/stats/screen/old_position_in_search/mvi/period/entity/PeriodInfoInternalAction$PeriodSelected;", "Lcom/avito/android/position_in_search/stats/screen/old_position_in_search/mvi/period/entity/PeriodInfoInternalAction;", "LoadingError", "LoadingResult", "LoadingStart", "Lcom/avito/android/position_in_search/stats/screen/old_position_in_search/mvi/period/entity/PeriodInfoInternalAction$PeriodSelected$LoadingError;", "Lcom/avito/android/position_in_search/stats/screen/old_position_in_search/mvi/period/entity/PeriodInfoInternalAction$PeriodSelected$LoadingResult;", "Lcom/avito/android/position_in_search/stats/screen/old_position_in_search/mvi/period/entity/PeriodInfoInternalAction$PeriodSelected$LoadingStart;", "_avito_position-in-search_stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface PeriodSelected extends PeriodInfoInternalAction {

        /* compiled from: PeriodInfoInternalAction.kt */
        @P
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/position_in_search/stats/screen/old_position_in_search/mvi/period/entity/PeriodInfoInternalAction$PeriodSelected$LoadingError;", "Lcom/avito/android/position_in_search/stats/screen/old_position_in_search/mvi/period/entity/PeriodInfoInternalAction$PeriodSelected;", "Lcom/avito/android/analytics/screens/mvi/TrackableError;", "_avito_position-in-search_stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class LoadingError implements PeriodSelected, TrackableError {

            /* renamed from: b, reason: collision with root package name */
            @k
            public final LoadingError f220611b;

            /* renamed from: c, reason: collision with root package name */
            @k
            public final String f220612c;

            /* renamed from: d, reason: collision with root package name */
            @k
            public final String f220613d;

            public LoadingError(@k LoadingError loadingError, @k String str) {
                this.f220611b = loadingError;
                this.f220612c = str;
                SearchPositionScreen.f221262d.getClass();
                this.f220613d = SearchPositionScreen.f221265g;
            }

            @Override // com.avito.android.position_in_search.stats.screen.old_position_in_search.mvi.period.entity.PeriodInfoInternalAction.PeriodSelected
            public final LoadingAction a() {
                return this.f220611b;
            }

            @Override // com.avito.android.position_in_search.stats.screen.old_position_in_search.mvi.period.entity.PeriodInfoInternalAction.PeriodSelected
            @k
            /* renamed from: b, reason: from getter */
            public final String getF220618e() {
                return this.f220612c;
            }

            @Override // com.avito.android.analytics.screens.mvi.s
            @k
            /* renamed from: d, reason: from getter */
            public final String getF267993e() {
                return this.f220613d;
            }

            @Override // com.avito.android.analytics.screens.mvi.t
            @l
            /* renamed from: e */
            public final String getF303160d() {
                return this.f220611b.f220593d;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof LoadingError)) {
                    return false;
                }
                LoadingError loadingError = (LoadingError) obj;
                return L.f(this.f220611b, loadingError.f220611b) && L.f(this.f220612c, loadingError.f220612c);
            }

            @Override // com.avito.android.analytics.screens.mvi.TrackableError
            @k
            /* renamed from: g */
            public final J.a getF208324d() {
                return this.f220611b.f220594e;
            }

            public final int hashCode() {
                return this.f220612c.hashCode() + (this.f220611b.hashCode() * 31);
            }

            @k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("LoadingError(loadingAction=");
                sb2.append(this.f220611b);
                sb2.append(", periodId=");
                return C22026a.c(sb2, this.f220612c, ')');
            }
        }

        /* compiled from: PeriodInfoInternalAction.kt */
        @P
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/position_in_search/stats/screen/old_position_in_search/mvi/period/entity/PeriodInfoInternalAction$PeriodSelected$LoadingResult;", "Lcom/avito/android/position_in_search/stats/screen/old_position_in_search/mvi/period/entity/PeriodInfoInternalAction$PeriodSelected;", "Lcom/avito/android/analytics/screens/mvi/TrackableContent;", "_avito_position-in-search_stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class LoadingResult implements PeriodSelected, TrackableContent {

            /* renamed from: b, reason: collision with root package name */
            @k
            public final LoadingResult f220614b;

            /* renamed from: c, reason: collision with root package name */
            @k
            public final String f220615c;

            /* renamed from: d, reason: collision with root package name */
            @k
            public final String f220616d;

            public LoadingResult(@k LoadingResult loadingResult, @k String str) {
                this.f220614b = loadingResult;
                this.f220615c = str;
                SearchPositionScreen.f221262d.getClass();
                this.f220616d = SearchPositionScreen.f221265g;
            }

            @Override // com.avito.android.position_in_search.stats.screen.old_position_in_search.mvi.period.entity.PeriodInfoInternalAction.PeriodSelected
            public final LoadingAction a() {
                return this.f220614b;
            }

            @Override // com.avito.android.position_in_search.stats.screen.old_position_in_search.mvi.period.entity.PeriodInfoInternalAction.PeriodSelected
            @k
            /* renamed from: b, reason: from getter */
            public final String getF220618e() {
                return this.f220615c;
            }

            @Override // com.avito.android.analytics.screens.mvi.s
            @k
            /* renamed from: d, reason: from getter */
            public final String getF267993e() {
                return this.f220616d;
            }

            @Override // com.avito.android.analytics.screens.mvi.t
            @l
            /* renamed from: e */
            public final String getF303160d() {
                return this.f220614b.f220597d;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof LoadingResult)) {
                    return false;
                }
                LoadingResult loadingResult = (LoadingResult) obj;
                return L.f(this.f220614b, loadingResult.f220614b) && L.f(this.f220615c, loadingResult.f220615c);
            }

            public final int hashCode() {
                return this.f220615c.hashCode() + (this.f220614b.hashCode() * 31);
            }

            @k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("LoadingResult(loadingAction=");
                sb2.append(this.f220614b);
                sb2.append(", periodId=");
                return C22026a.c(sb2, this.f220615c, ')');
            }
        }

        /* compiled from: PeriodInfoInternalAction.kt */
        @P
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/position_in_search/stats/screen/old_position_in_search/mvi/period/entity/PeriodInfoInternalAction$PeriodSelected$LoadingStart;", "Lcom/avito/android/position_in_search/stats/screen/old_position_in_search/mvi/period/entity/PeriodInfoInternalAction$PeriodSelected;", "Lcom/avito/android/analytics/screens/mvi/TrackableLoadingStarted;", "_avito_position-in-search_stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class LoadingStart extends TrackableLoadingStarted implements PeriodSelected {

            /* renamed from: d, reason: collision with root package name */
            @k
            public final LoadingStart f220617d;

            /* renamed from: e, reason: collision with root package name */
            @k
            public final String f220618e;

            /* renamed from: f, reason: collision with root package name */
            @k
            public final String f220619f;

            /* renamed from: g, reason: collision with root package name */
            @k
            public final ScreenPerformanceTracker.LoadingType f220620g;

            public LoadingStart(@k LoadingStart loadingStart, @k String str) {
                this.f220617d = loadingStart;
                this.f220618e = str;
                SearchPositionScreen.f221262d.getClass();
                this.f220619f = SearchPositionScreen.f221265g;
                this.f220620g = ScreenPerformanceTracker.LoadingType.f90785b;
            }

            @Override // com.avito.android.position_in_search.stats.screen.old_position_in_search.mvi.period.entity.PeriodInfoInternalAction.PeriodSelected
            public final LoadingAction a() {
                return this.f220617d;
            }

            @Override // com.avito.android.position_in_search.stats.screen.old_position_in_search.mvi.period.entity.PeriodInfoInternalAction.PeriodSelected
            @k
            /* renamed from: b, reason: from getter */
            public final String getF220618e() {
                return this.f220618e;
            }

            @Override // com.avito.android.analytics.screens.mvi.TrackableLoadingStarted, com.avito.android.analytics.screens.mvi.s
            @k
            /* renamed from: d, reason: from getter */
            public final String getF267993e() {
                return this.f220619f;
            }

            @Override // com.avito.android.analytics.screens.mvi.TrackableLoadingStarted
            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof LoadingStart)) {
                    return false;
                }
                LoadingStart loadingStart = (LoadingStart) obj;
                return L.f(this.f220617d, loadingStart.f220617d) && L.f(this.f220618e, loadingStart.f220618e);
            }

            @Override // com.avito.android.analytics.screens.mvi.TrackableLoadingStarted
            @k
            /* renamed from: h, reason: from getter */
            public final ScreenPerformanceTracker.LoadingType getF220522e() {
                return this.f220620g;
            }

            @Override // com.avito.android.analytics.screens.mvi.TrackableLoadingStarted
            public final int hashCode() {
                return this.f220618e.hashCode() + (this.f220617d.hashCode() * 31);
            }

            @k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("LoadingStart(loadingAction=");
                sb2.append(this.f220617d);
                sb2.append(", periodId=");
                return C22026a.c(sb2, this.f220618e, ')');
            }
        }

        @k
        LoadingAction a();

        @k
        /* renamed from: b */
        String getF220618e();
    }

    /* compiled from: PeriodInfoInternalAction.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/position_in_search/stats/screen/old_position_in_search/mvi/period/entity/PeriodInfoInternalAction$Sort;", "Lcom/avito/android/position_in_search/stats/screen/old_position_in_search/mvi/period/entity/PeriodInfoInternalAction;", "LoadingError", "LoadingResult", "LoadingStart", "Lcom/avito/android/position_in_search/stats/screen/old_position_in_search/mvi/period/entity/PeriodInfoInternalAction$Sort$LoadingError;", "Lcom/avito/android/position_in_search/stats/screen/old_position_in_search/mvi/period/entity/PeriodInfoInternalAction$Sort$LoadingResult;", "Lcom/avito/android/position_in_search/stats/screen/old_position_in_search/mvi/period/entity/PeriodInfoInternalAction$Sort$LoadingStart;", "_avito_position-in-search_stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface Sort extends PeriodInfoInternalAction {

        /* compiled from: PeriodInfoInternalAction.kt */
        @P
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/position_in_search/stats/screen/old_position_in_search/mvi/period/entity/PeriodInfoInternalAction$Sort$LoadingError;", "Lcom/avito/android/position_in_search/stats/screen/old_position_in_search/mvi/period/entity/PeriodInfoInternalAction$Sort;", "Lcom/avito/android/analytics/screens/mvi/TrackableError;", "_avito_position-in-search_stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class LoadingError implements Sort, TrackableError {

            /* renamed from: b, reason: collision with root package name */
            @k
            public final LoadingError f220621b;

            /* renamed from: c, reason: collision with root package name */
            @k
            public final String f220622c;

            public LoadingError(@k LoadingError loadingError) {
                this.f220621b = loadingError;
                SearchPositionScreen.f221262d.getClass();
                this.f220622c = SearchPositionScreen.f221267i;
            }

            @Override // com.avito.android.position_in_search.stats.screen.old_position_in_search.mvi.period.entity.PeriodInfoInternalAction.Sort
            public final LoadingAction a() {
                return this.f220621b;
            }

            @Override // com.avito.android.analytics.screens.mvi.s
            @k
            /* renamed from: d, reason: from getter */
            public final String getF267993e() {
                return this.f220622c;
            }

            @Override // com.avito.android.analytics.screens.mvi.t
            @l
            /* renamed from: e */
            public final String getF303160d() {
                return this.f220621b.f220593d;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof LoadingError) && L.f(this.f220621b, ((LoadingError) obj).f220621b);
            }

            @Override // com.avito.android.analytics.screens.mvi.TrackableError
            @k
            /* renamed from: g */
            public final J.a getF208324d() {
                return this.f220621b.f220594e;
            }

            public final int hashCode() {
                return this.f220621b.hashCode();
            }

            @k
            public final String toString() {
                return "LoadingError(loadingAction=" + this.f220621b + ')';
            }
        }

        /* compiled from: PeriodInfoInternalAction.kt */
        @P
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/position_in_search/stats/screen/old_position_in_search/mvi/period/entity/PeriodInfoInternalAction$Sort$LoadingResult;", "Lcom/avito/android/position_in_search/stats/screen/old_position_in_search/mvi/period/entity/PeriodInfoInternalAction$Sort;", "Lcom/avito/android/analytics/screens/mvi/TrackableContent;", "_avito_position-in-search_stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class LoadingResult implements Sort, TrackableContent {

            /* renamed from: b, reason: collision with root package name */
            @k
            public final LoadingResult f220623b;

            /* renamed from: c, reason: collision with root package name */
            @k
            public final String f220624c;

            public LoadingResult(@k LoadingResult loadingResult) {
                this.f220623b = loadingResult;
                SearchPositionScreen.f221262d.getClass();
                this.f220624c = SearchPositionScreen.f221267i;
            }

            @Override // com.avito.android.position_in_search.stats.screen.old_position_in_search.mvi.period.entity.PeriodInfoInternalAction.Sort
            public final LoadingAction a() {
                return this.f220623b;
            }

            @Override // com.avito.android.analytics.screens.mvi.s
            @k
            /* renamed from: d, reason: from getter */
            public final String getF267993e() {
                return this.f220624c;
            }

            @Override // com.avito.android.analytics.screens.mvi.t
            @l
            /* renamed from: e */
            public final String getF303160d() {
                return this.f220623b.f220597d;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof LoadingResult) && L.f(this.f220623b, ((LoadingResult) obj).f220623b);
            }

            public final int hashCode() {
                return this.f220623b.hashCode();
            }

            @k
            public final String toString() {
                return "LoadingResult(loadingAction=" + this.f220623b + ')';
            }
        }

        /* compiled from: PeriodInfoInternalAction.kt */
        @P
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/position_in_search/stats/screen/old_position_in_search/mvi/period/entity/PeriodInfoInternalAction$Sort$LoadingStart;", "Lcom/avito/android/position_in_search/stats/screen/old_position_in_search/mvi/period/entity/PeriodInfoInternalAction$Sort;", "Lcom/avito/android/analytics/screens/mvi/TrackableLoadingStarted;", "_avito_position-in-search_stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class LoadingStart extends TrackableLoadingStarted implements Sort {

            /* renamed from: d, reason: collision with root package name */
            @k
            public final LoadingStart f220625d;

            /* renamed from: e, reason: collision with root package name */
            @k
            public final String f220626e;

            /* renamed from: f, reason: collision with root package name */
            @k
            public final ScreenPerformanceTracker.LoadingType f220627f;

            public LoadingStart(@k LoadingStart loadingStart) {
                this.f220625d = loadingStart;
                SearchPositionScreen.f221262d.getClass();
                this.f220626e = SearchPositionScreen.f221267i;
                this.f220627f = ScreenPerformanceTracker.LoadingType.f90785b;
            }

            @Override // com.avito.android.position_in_search.stats.screen.old_position_in_search.mvi.period.entity.PeriodInfoInternalAction.Sort
            public final LoadingAction a() {
                return this.f220625d;
            }

            @Override // com.avito.android.analytics.screens.mvi.TrackableLoadingStarted, com.avito.android.analytics.screens.mvi.s
            @k
            /* renamed from: d, reason: from getter */
            public final String getF267993e() {
                return this.f220626e;
            }

            @Override // com.avito.android.analytics.screens.mvi.TrackableLoadingStarted
            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof LoadingStart) && L.f(this.f220625d, ((LoadingStart) obj).f220625d);
            }

            @Override // com.avito.android.analytics.screens.mvi.TrackableLoadingStarted
            @k
            /* renamed from: h, reason: from getter */
            public final ScreenPerformanceTracker.LoadingType getF220522e() {
                return this.f220627f;
            }

            @Override // com.avito.android.analytics.screens.mvi.TrackableLoadingStarted
            public final int hashCode() {
                return this.f220625d.hashCode();
            }

            @k
            public final String toString() {
                return "LoadingStart(loadingAction=" + this.f220625d + ')';
            }
        }

        @k
        LoadingAction a();
    }

    /* compiled from: PeriodInfoInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/position_in_search/stats/screen/old_position_in_search/mvi/period/entity/PeriodInfoInternalAction$ToastClosed;", "Lcom/avito/android/position_in_search/stats/screen/old_position_in_search/mvi/period/entity/PeriodInfoInternalAction;", "_avito_position-in-search_stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ToastClosed implements PeriodInfoInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f220628b;

        public ToastClosed(@k String str) {
            this.f220628b = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ToastClosed) && L.f(this.f220628b, ((ToastClosed) obj).f220628b);
        }

        public final int hashCode() {
            return this.f220628b.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("ToastClosed(toastId="), this.f220628b, ')');
        }
    }
}
