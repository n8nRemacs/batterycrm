package com.avito.android.position_in_search.stats.screen.old_position_in_search.mvi.info.entity;

import AK.c;
import V80.h;
import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.avito.android.actions_sheet.a;
import com.avito.android.analytics.screens.J;
import com.avito.android.analytics.screens.mvi.TrackableContent;
import com.avito.android.analytics.screens.mvi.TrackableError;
import com.avito.android.analytics.screens.mvi.TrackableLoadingStarted;
import com.avito.android.analytics.screens.mvi.n;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.position_in_search.stats.screen.old_position_in_search.view.tracker.SearchPositionScreen;
import com.avito.android.remote.error.ApiError;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: PositionInfoInternalAction.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\t\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u0082\u0001\t\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013¨\u0006\u0014"}, d2 = {"Lcom/avito/android/position_in_search/stats/screen/old_position_in_search/mvi/info/entity/PositionInfoInternalAction;", "Lcom/avito/android/analytics/screens/mvi/n;", "BannerClosed", "Close", "LoadingError", "LoadingResult", "LoadingStart", "NoChange", "OpenDeepLink", "PeriodSelected", "ToastClosed", "Lcom/avito/android/position_in_search/stats/screen/old_position_in_search/mvi/info/entity/PositionInfoInternalAction$BannerClosed;", "Lcom/avito/android/position_in_search/stats/screen/old_position_in_search/mvi/info/entity/PositionInfoInternalAction$Close;", "Lcom/avito/android/position_in_search/stats/screen/old_position_in_search/mvi/info/entity/PositionInfoInternalAction$LoadingError;", "Lcom/avito/android/position_in_search/stats/screen/old_position_in_search/mvi/info/entity/PositionInfoInternalAction$LoadingResult;", "Lcom/avito/android/position_in_search/stats/screen/old_position_in_search/mvi/info/entity/PositionInfoInternalAction$LoadingStart;", "Lcom/avito/android/position_in_search/stats/screen/old_position_in_search/mvi/info/entity/PositionInfoInternalAction$NoChange;", "Lcom/avito/android/position_in_search/stats/screen/old_position_in_search/mvi/info/entity/PositionInfoInternalAction$OpenDeepLink;", "Lcom/avito/android/position_in_search/stats/screen/old_position_in_search/mvi/info/entity/PositionInfoInternalAction$PeriodSelected;", "Lcom/avito/android/position_in_search/stats/screen/old_position_in_search/mvi/info/entity/PositionInfoInternalAction$ToastClosed;", "_avito_position-in-search_stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface PositionInfoInternalAction extends n {

    /* compiled from: PositionInfoInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/position_in_search/stats/screen/old_position_in_search/mvi/info/entity/PositionInfoInternalAction$BannerClosed;", "Lcom/avito/android/position_in_search/stats/screen/old_position_in_search/mvi/info/entity/PositionInfoInternalAction;", "_avito_position-in-search_stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class BannerClosed implements PositionInfoInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f220512b;

        public BannerClosed(@k String str) {
            this.f220512b = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof BannerClosed) && L.f(this.f220512b, ((BannerClosed) obj).f220512b);
        }

        public final int hashCode() {
            return this.f220512b.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("BannerClosed(bannerId="), this.f220512b, ')');
        }
    }

    /* compiled from: PositionInfoInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/position_in_search/stats/screen/old_position_in_search/mvi/info/entity/PositionInfoInternalAction$Close;", "Lcom/avito/android/position_in_search/stats/screen/old_position_in_search/mvi/info/entity/PositionInfoInternalAction;", "<init>", "()V", "_avito_position-in-search_stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Close implements PositionInfoInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final Close f220513b = new Close();

        private Close() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof Close);
        }

        public final int hashCode() {
            return -1323567429;
        }

        @k
        public final String toString() {
            return "Close";
        }
    }

    /* compiled from: PositionInfoInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/position_in_search/stats/screen/old_position_in_search/mvi/info/entity/PositionInfoInternalAction$LoadingError;", "Lcom/avito/android/position_in_search/stats/screen/old_position_in_search/mvi/info/entity/PositionInfoInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableError;", "_avito_position-in-search_stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class LoadingError implements PositionInfoInternalAction, TrackableError {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final ApiError f220514b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final Throwable f220515c;

        /* renamed from: d, reason: collision with root package name */
        @k
        public final J.a f220516d;

        /* renamed from: e, reason: collision with root package name */
        @k
        public final String f220517e;

        public LoadingError(@k ApiError apiError, @l Throwable th2) {
            this.f220514b = apiError;
            this.f220515c = th2;
            J.a.f90383b.getClass();
            this.f220516d = J.a.C2676a.a(apiError, th2);
            SearchPositionScreen.f221262d.getClass();
            this.f220517e = SearchPositionScreen.f221263e;
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @k
        /* renamed from: d, reason: from getter */
        public final String getF314462e() {
            return this.f220517e;
        }

        @Override // com.avito.android.analytics.screens.mvi.t
        @l
        /* renamed from: e */
        public final String getF314460f() {
            return this.f220517e;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof LoadingError)) {
                return false;
            }
            LoadingError loadingError = (LoadingError) obj;
            return L.f(this.f220514b, loadingError.f220514b) && L.f(this.f220515c, loadingError.f220515c);
        }

        @Override // com.avito.android.analytics.screens.mvi.TrackableError
        @k
        /* renamed from: g, reason: from getter */
        public final J.a getF287355c() {
            return this.f220516d;
        }

        public final int hashCode() {
            int iHashCode = this.f220514b.hashCode() * 31;
            Throwable th2 = this.f220515c;
            return iHashCode + (th2 == null ? 0 : th2.hashCode());
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("LoadingError(error=");
            sb2.append(this.f220514b);
            sb2.append(", cause=");
            return com.avito.android.advert.item.delivery_suggests.l.t(sb2, this.f220515c, ')');
        }
    }

    /* compiled from: PositionInfoInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/position_in_search/stats/screen/old_position_in_search/mvi/info/entity/PositionInfoInternalAction$LoadingResult;", "Lcom/avito/android/position_in_search/stats/screen/old_position_in_search/mvi/info/entity/PositionInfoInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableContent;", "_avito_position-in-search_stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class LoadingResult implements PositionInfoInternalAction, TrackableContent {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final h f220518b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final Set<String> f220519c;

        /* renamed from: d, reason: collision with root package name */
        @k
        public final String f220520d;

        public LoadingResult(@k h hVar, @k Set<String> set) {
            this.f220518b = hVar;
            this.f220519c = set;
            SearchPositionScreen.f221262d.getClass();
            this.f220520d = SearchPositionScreen.f221263e;
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @k
        /* renamed from: d, reason: from getter */
        public final String getF314462e() {
            return this.f220520d;
        }

        @Override // com.avito.android.analytics.screens.mvi.t
        @l
        /* renamed from: e */
        public final String getF314460f() {
            return this.f220520d;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof LoadingResult)) {
                return false;
            }
            LoadingResult loadingResult = (LoadingResult) obj;
            return L.f(this.f220518b, loadingResult.f220518b) && L.f(this.f220519c, loadingResult.f220519c);
        }

        public final int hashCode() {
            return this.f220519c.hashCode() + (this.f220518b.hashCode() * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("LoadingResult(info=");
            sb2.append(this.f220518b);
            sb2.append(", closedBanners=");
            return c.u(sb2, this.f220519c, ')');
        }
    }

    /* compiled from: PositionInfoInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/position_in_search/stats/screen/old_position_in_search/mvi/info/entity/PositionInfoInternalAction$LoadingStart;", "Lcom/avito/android/position_in_search/stats/screen/old_position_in_search/mvi/info/entity/PositionInfoInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableLoadingStarted;", "<init>", "()V", "_avito_position-in-search_stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class LoadingStart extends TrackableLoadingStarted implements PositionInfoInternalAction {

        /* renamed from: d, reason: collision with root package name */
        @k
        public final String f220521d;

        /* renamed from: e, reason: collision with root package name */
        @k
        public final ScreenPerformanceTracker.LoadingType f220522e;

        public LoadingStart() {
            SearchPositionScreen.f221262d.getClass();
            this.f220521d = SearchPositionScreen.f221263e;
            this.f220522e = ScreenPerformanceTracker.LoadingType.f90785b;
        }

        @Override // com.avito.android.analytics.screens.mvi.TrackableLoadingStarted, com.avito.android.analytics.screens.mvi.s
        @k
        /* renamed from: d, reason: from getter */
        public final String getF314462e() {
            return this.f220521d;
        }

        @Override // com.avito.android.analytics.screens.mvi.TrackableLoadingStarted
        @k
        /* renamed from: h, reason: from getter */
        public final ScreenPerformanceTracker.LoadingType getF111995e() {
            return this.f220522e;
        }
    }

    /* compiled from: PositionInfoInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/position_in_search/stats/screen/old_position_in_search/mvi/info/entity/PositionInfoInternalAction$NoChange;", "Lcom/avito/android/position_in_search/stats/screen/old_position_in_search/mvi/info/entity/PositionInfoInternalAction;", "<init>", "()V", "_avito_position-in-search_stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class NoChange implements PositionInfoInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final NoChange f220523b = new NoChange();

        private NoChange() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof NoChange);
        }

        public final int hashCode() {
            return 786203950;
        }

        @k
        public final String toString() {
            return "NoChange";
        }
    }

    /* compiled from: PositionInfoInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/position_in_search/stats/screen/old_position_in_search/mvi/info/entity/PositionInfoInternalAction$OpenDeepLink;", "Lcom/avito/android/position_in_search/stats/screen/old_position_in_search/mvi/info/entity/PositionInfoInternalAction;", "_avito_position-in-search_stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class OpenDeepLink implements PositionInfoInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final DeepLink f220524b;

        public OpenDeepLink(@k DeepLink deepLink) {
            this.f220524b = deepLink;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OpenDeepLink) && L.f(this.f220524b, ((OpenDeepLink) obj).f220524b);
        }

        public final int hashCode() {
            return this.f220524b.hashCode();
        }

        @k
        public final String toString() {
            return a.v(new StringBuilder("OpenDeepLink(deepLink="), this.f220524b, ')');
        }
    }

    /* compiled from: PositionInfoInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/position_in_search/stats/screen/old_position_in_search/mvi/info/entity/PositionInfoInternalAction$PeriodSelected;", "Lcom/avito/android/position_in_search/stats/screen/old_position_in_search/mvi/info/entity/PositionInfoInternalAction;", "_avito_position-in-search_stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class PeriodSelected implements PositionInfoInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f220525b;

        public PeriodSelected(@k String str) {
            this.f220525b = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof PeriodSelected) && L.f(this.f220525b, ((PeriodSelected) obj).f220525b);
        }

        public final int hashCode() {
            return this.f220525b.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("PeriodSelected(selectedPeriod="), this.f220525b, ')');
        }
    }

    /* compiled from: PositionInfoInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/position_in_search/stats/screen/old_position_in_search/mvi/info/entity/PositionInfoInternalAction$ToastClosed;", "Lcom/avito/android/position_in_search/stats/screen/old_position_in_search/mvi/info/entity/PositionInfoInternalAction;", "_avito_position-in-search_stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ToastClosed implements PositionInfoInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f220526b;

        public ToastClosed(@k String str) {
            this.f220526b = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ToastClosed) && L.f(this.f220526b, ((ToastClosed) obj).f220526b);
        }

        public final int hashCode() {
            return this.f220526b.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("ToastClosed(toastId="), this.f220526b, ')');
        }
    }
}
