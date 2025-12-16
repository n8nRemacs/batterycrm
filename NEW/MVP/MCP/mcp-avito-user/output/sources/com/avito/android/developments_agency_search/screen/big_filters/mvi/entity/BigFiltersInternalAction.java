package com.avito.android.developments_agency_search.screen.big_filters.mvi.entity;

import AK.c;
import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.screens.J;
import com.avito.android.analytics.screens.mvi.TrackableContent;
import com.avito.android.analytics.screens.mvi.TrackableError;
import com.avito.android.analytics.screens.mvi.TrackableLoadingStarted;
import com.avito.android.analytics.screens.mvi.n;
import com.avito.android.bxcontent.mvi.entity.f;
import com.avito.android.remote.model.SearchParameters;
import com.avito.android.remote.model.SearchParams;
import com.avito.android.remote.model.search.InlineFilterValue;
import com.avito.android.util.ApiException;
import com.avito.conveyor_item.a;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: BigFiltersInternalAction.kt */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\r\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u0082\u0001\r\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b¨\u0006\u001c"}, d2 = {"Lcom/avito/android/developments_agency_search/screen/big_filters/mvi/entity/BigFiltersInternalAction;", "Lcom/avito/android/analytics/screens/mvi/n;", "AnalyticsEvent", "CloseScreen", "FiltersLoading", "RefreshSearchResultCount", "SearchResultCountLoading", "SendScreenResult", "ShowLocationGroupScreen", "UpdateApplyButtonVisibility", "UpdateInitSearchParams", "UpdateLastSearchParams", "UpdateParameterValue", "UpdateSelectedDeveloperDevelopmentValue", "UpdateSelectedQuarterValue", "Lcom/avito/android/developments_agency_search/screen/big_filters/mvi/entity/BigFiltersInternalAction$AnalyticsEvent;", "Lcom/avito/android/developments_agency_search/screen/big_filters/mvi/entity/BigFiltersInternalAction$CloseScreen;", "Lcom/avito/android/developments_agency_search/screen/big_filters/mvi/entity/BigFiltersInternalAction$FiltersLoading;", "Lcom/avito/android/developments_agency_search/screen/big_filters/mvi/entity/BigFiltersInternalAction$RefreshSearchResultCount;", "Lcom/avito/android/developments_agency_search/screen/big_filters/mvi/entity/BigFiltersInternalAction$SearchResultCountLoading;", "Lcom/avito/android/developments_agency_search/screen/big_filters/mvi/entity/BigFiltersInternalAction$SendScreenResult;", "Lcom/avito/android/developments_agency_search/screen/big_filters/mvi/entity/BigFiltersInternalAction$ShowLocationGroupScreen;", "Lcom/avito/android/developments_agency_search/screen/big_filters/mvi/entity/BigFiltersInternalAction$UpdateApplyButtonVisibility;", "Lcom/avito/android/developments_agency_search/screen/big_filters/mvi/entity/BigFiltersInternalAction$UpdateInitSearchParams;", "Lcom/avito/android/developments_agency_search/screen/big_filters/mvi/entity/BigFiltersInternalAction$UpdateLastSearchParams;", "Lcom/avito/android/developments_agency_search/screen/big_filters/mvi/entity/BigFiltersInternalAction$UpdateParameterValue;", "Lcom/avito/android/developments_agency_search/screen/big_filters/mvi/entity/BigFiltersInternalAction$UpdateSelectedDeveloperDevelopmentValue;", "Lcom/avito/android/developments_agency_search/screen/big_filters/mvi/entity/BigFiltersInternalAction$UpdateSelectedQuarterValue;", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public interface BigFiltersInternalAction extends n {

    /* compiled from: BigFiltersInternalAction.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/developments_agency_search/screen/big_filters/mvi/entity/BigFiltersInternalAction$AnalyticsEvent;", "Lcom/avito/android/developments_agency_search/screen/big_filters/mvi/entity/BigFiltersInternalAction;", "ApplyButtonClicked", "BigFiltersShown", "ResetButtonClicked", "Lcom/avito/android/developments_agency_search/screen/big_filters/mvi/entity/BigFiltersInternalAction$AnalyticsEvent$ApplyButtonClicked;", "Lcom/avito/android/developments_agency_search/screen/big_filters/mvi/entity/BigFiltersInternalAction$AnalyticsEvent$BigFiltersShown;", "Lcom/avito/android/developments_agency_search/screen/big_filters/mvi/entity/BigFiltersInternalAction$AnalyticsEvent$ResetButtonClicked;", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface AnalyticsEvent extends BigFiltersInternalAction {

        /* compiled from: BigFiltersInternalAction.kt */
        @P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/developments_agency_search/screen/big_filters/mvi/entity/BigFiltersInternalAction$AnalyticsEvent$ApplyButtonClicked;", "Lcom/avito/android/developments_agency_search/screen/big_filters/mvi/entity/BigFiltersInternalAction$AnalyticsEvent;", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class ApplyButtonClicked implements AnalyticsEvent {

            /* renamed from: b, reason: collision with root package name */
            @k
            public final SearchParams f136694b;

            public ApplyButtonClicked(@k SearchParams searchParams) {
                this.f136694b = searchParams;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof ApplyButtonClicked) && L.f(this.f136694b, ((ApplyButtonClicked) obj).f136694b);
            }

            public final int hashCode() {
                return this.f136694b.hashCode();
            }

            @k
            public final String toString() {
                return f.m(new StringBuilder("ApplyButtonClicked(searchParams="), this.f136694b, ')');
            }
        }

        /* compiled from: BigFiltersInternalAction.kt */
        @P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/developments_agency_search/screen/big_filters/mvi/entity/BigFiltersInternalAction$AnalyticsEvent$BigFiltersShown;", "Lcom/avito/android/developments_agency_search/screen/big_filters/mvi/entity/BigFiltersInternalAction$AnalyticsEvent;", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class BigFiltersShown implements AnalyticsEvent {

            /* renamed from: b, reason: collision with root package name */
            @k
            public final SearchParams f136695b;

            public BigFiltersShown(@k SearchParams searchParams) {
                this.f136695b = searchParams;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof BigFiltersShown) && L.f(this.f136695b, ((BigFiltersShown) obj).f136695b);
            }

            public final int hashCode() {
                return this.f136695b.hashCode();
            }

            @k
            public final String toString() {
                return f.m(new StringBuilder("BigFiltersShown(searchParams="), this.f136695b, ')');
            }
        }

        /* compiled from: BigFiltersInternalAction.kt */
        @P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/developments_agency_search/screen/big_filters/mvi/entity/BigFiltersInternalAction$AnalyticsEvent$ResetButtonClicked;", "Lcom/avito/android/developments_agency_search/screen/big_filters/mvi/entity/BigFiltersInternalAction$AnalyticsEvent;", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class ResetButtonClicked implements AnalyticsEvent {

            /* renamed from: b, reason: collision with root package name */
            @k
            public final SearchParams f136696b;

            public ResetButtonClicked(@k SearchParams searchParams) {
                this.f136696b = searchParams;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof ResetButtonClicked) && L.f(this.f136696b, ((ResetButtonClicked) obj).f136696b);
            }

            public final int hashCode() {
                return this.f136696b.hashCode();
            }

            @k
            public final String toString() {
                return f.m(new StringBuilder("ResetButtonClicked(searchParams="), this.f136696b, ')');
            }
        }
    }

    /* compiled from: BigFiltersInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/developments_agency_search/screen/big_filters/mvi/entity/BigFiltersInternalAction$CloseScreen;", "Lcom/avito/android/developments_agency_search/screen/big_filters/mvi/entity/BigFiltersInternalAction;", "<init>", "()V", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class CloseScreen implements BigFiltersInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final CloseScreen f136697b = new CloseScreen();

        private CloseScreen() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof CloseScreen);
        }

        public final int hashCode() {
            return -1489053291;
        }

        @k
        public final String toString() {
            return "CloseScreen";
        }
    }

    /* compiled from: BigFiltersInternalAction.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/developments_agency_search/screen/big_filters/mvi/entity/BigFiltersInternalAction$FiltersLoading;", "Lcom/avito/android/developments_agency_search/screen/big_filters/mvi/entity/BigFiltersInternalAction;", "Loaded", "LoadingError", "StartLoading", "Lcom/avito/android/developments_agency_search/screen/big_filters/mvi/entity/BigFiltersInternalAction$FiltersLoading$Loaded;", "Lcom/avito/android/developments_agency_search/screen/big_filters/mvi/entity/BigFiltersInternalAction$FiltersLoading$LoadingError;", "Lcom/avito/android/developments_agency_search/screen/big_filters/mvi/entity/BigFiltersInternalAction$FiltersLoading$StartLoading;", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface FiltersLoading extends BigFiltersInternalAction {

        /* compiled from: BigFiltersInternalAction.kt */
        @P
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/developments_agency_search/screen/big_filters/mvi/entity/BigFiltersInternalAction$FiltersLoading$Loaded;", "Lcom/avito/android/developments_agency_search/screen/big_filters/mvi/entity/BigFiltersInternalAction$FiltersLoading;", "Lcom/avito/android/analytics/screens/mvi/TrackableContent;", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class Loaded implements FiltersLoading, TrackableContent {

            /* renamed from: b, reason: collision with root package name */
            @k
            public final SearchParameters f136698b;

            public Loaded(@k SearchParameters searchParameters) {
                this.f136698b = searchParameters;
            }

            @Override // com.avito.android.analytics.screens.mvi.s
            @l
            /* renamed from: d */
            public final String getF267993e() {
                return null;
            }

            @Override // com.avito.android.analytics.screens.mvi.t
            @l
            /* renamed from: e */
            public final String getF303160d() {
                return null;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Loaded) && L.f(this.f136698b, ((Loaded) obj).f136698b);
            }

            public final int hashCode() {
                return this.f136698b.hashCode();
            }

            @k
            public final String toString() {
                return "Loaded(data=" + this.f136698b + ')';
            }
        }

        /* compiled from: BigFiltersInternalAction.kt */
        @P
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/developments_agency_search/screen/big_filters/mvi/entity/BigFiltersInternalAction$FiltersLoading$LoadingError;", "Lcom/avito/android/developments_agency_search/screen/big_filters/mvi/entity/BigFiltersInternalAction$FiltersLoading;", "Lcom/avito/android/analytics/screens/mvi/TrackableError;", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class LoadingError implements FiltersLoading, TrackableError {

            /* renamed from: b, reason: collision with root package name */
            @k
            public final ApiException f136699b;

            /* renamed from: c, reason: collision with root package name */
            @k
            public final J.a f136700c;

            public LoadingError(@k ApiException apiException) {
                this.f136699b = apiException;
                this.f136700c = new J.a(apiException);
            }

            @Override // com.avito.android.analytics.screens.mvi.s
            @l
            /* renamed from: d */
            public final String getF267993e() {
                return null;
            }

            @Override // com.avito.android.analytics.screens.mvi.t
            @l
            /* renamed from: e */
            public final String getF303160d() {
                return null;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof LoadingError) && this.f136699b.equals(((LoadingError) obj).f136699b);
            }

            @Override // com.avito.android.analytics.screens.mvi.TrackableError
            @k
            /* renamed from: g, reason: from getter */
            public final J.a getF277700c() {
                return this.f136700c;
            }

            public final int hashCode() {
                return this.f136699b.hashCode();
            }

            @k
            public final String toString() {
                return c.q(new StringBuilder("LoadingError(e="), this.f136699b, ')');
            }
        }

        /* compiled from: BigFiltersInternalAction.kt */
        @P
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/developments_agency_search/screen/big_filters/mvi/entity/BigFiltersInternalAction$FiltersLoading$StartLoading;", "Lcom/avito/android/developments_agency_search/screen/big_filters/mvi/entity/BigFiltersInternalAction$FiltersLoading;", "Lcom/avito/android/analytics/screens/mvi/TrackableLoadingStarted;", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class StartLoading extends TrackableLoadingStarted implements FiltersLoading {

            /* renamed from: d, reason: collision with root package name */
            @k
            public final G0 f136701d;

            public StartLoading() {
                this(null, 1, null);
            }

            @Override // com.avito.android.analytics.screens.mvi.TrackableLoadingStarted
            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof StartLoading) && L.f(this.f136701d, ((StartLoading) obj).f136701d);
            }

            @Override // com.avito.android.analytics.screens.mvi.TrackableLoadingStarted
            public final int hashCode() {
                return this.f136701d.hashCode();
            }

            @k
            public final String toString() {
                return c.v(new StringBuilder("StartLoading(stub="), this.f136701d, ')');
            }

            public StartLoading(G0 g02, int i12, C42822w c42822w) {
                this.f136701d = (i12 & 1) != 0 ? G0.f406611a : g02;
            }
        }
    }

    /* compiled from: BigFiltersInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/developments_agency_search/screen/big_filters/mvi/entity/BigFiltersInternalAction$RefreshSearchResultCount;", "Lcom/avito/android/developments_agency_search/screen/big_filters/mvi/entity/BigFiltersInternalAction;", "<init>", "()V", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class RefreshSearchResultCount implements BigFiltersInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final RefreshSearchResultCount f136702b = new RefreshSearchResultCount();

        private RefreshSearchResultCount() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof RefreshSearchResultCount);
        }

        public final int hashCode() {
            return 2134738206;
        }

        @k
        public final String toString() {
            return "RefreshSearchResultCount";
        }
    }

    /* compiled from: BigFiltersInternalAction.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/developments_agency_search/screen/big_filters/mvi/entity/BigFiltersInternalAction$SearchResultCountLoading;", "Lcom/avito/android/developments_agency_search/screen/big_filters/mvi/entity/BigFiltersInternalAction;", "Loaded", "StartLoading", "Lcom/avito/android/developments_agency_search/screen/big_filters/mvi/entity/BigFiltersInternalAction$SearchResultCountLoading$Loaded;", "Lcom/avito/android/developments_agency_search/screen/big_filters/mvi/entity/BigFiltersInternalAction$SearchResultCountLoading$StartLoading;", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface SearchResultCountLoading extends BigFiltersInternalAction {

        /* compiled from: BigFiltersInternalAction.kt */
        @P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/developments_agency_search/screen/big_filters/mvi/entity/BigFiltersInternalAction$SearchResultCountLoading$Loaded;", "Lcom/avito/android/developments_agency_search/screen/big_filters/mvi/entity/BigFiltersInternalAction$SearchResultCountLoading;", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class Loaded implements SearchResultCountLoading {

            /* renamed from: b, reason: collision with root package name */
            public final long f136703b;

            public Loaded(long j12) {
                this.f136703b = j12;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Loaded) && this.f136703b == ((Loaded) obj).f136703b;
            }

            public final int hashCode() {
                return Long.hashCode(this.f136703b);
            }

            @k
            public final String toString() {
                return r.u(new StringBuilder("Loaded(lotsCount="), this.f136703b, ')');
            }
        }

        /* compiled from: BigFiltersInternalAction.kt */
        @P
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/developments_agency_search/screen/big_filters/mvi/entity/BigFiltersInternalAction$SearchResultCountLoading$StartLoading;", "Lcom/avito/android/developments_agency_search/screen/big_filters/mvi/entity/BigFiltersInternalAction$SearchResultCountLoading;", "<init>", "()V", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class StartLoading implements SearchResultCountLoading {

            /* renamed from: b, reason: collision with root package name */
            @k
            public static final StartLoading f136704b = new StartLoading();

            private StartLoading() {
            }

            public final boolean equals(@l Object obj) {
                return this == obj || (obj instanceof StartLoading);
            }

            public final int hashCode() {
                return -632967385;
            }

            @k
            public final String toString() {
                return "StartLoading";
            }
        }
    }

    /* compiled from: BigFiltersInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/developments_agency_search/screen/big_filters/mvi/entity/BigFiltersInternalAction$SendScreenResult;", "Lcom/avito/android/developments_agency_search/screen/big_filters/mvi/entity/BigFiltersInternalAction;", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class SendScreenResult implements BigFiltersInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final SearchParams f136705b;

        public SendScreenResult(@k SearchParams searchParams) {
            this.f136705b = searchParams;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof SendScreenResult) && L.f(this.f136705b, ((SendScreenResult) obj).f136705b);
        }

        public final int hashCode() {
            return this.f136705b.hashCode();
        }

        @k
        public final String toString() {
            return f.m(new StringBuilder("SendScreenResult(searchParams="), this.f136705b, ')');
        }
    }

    /* compiled from: BigFiltersInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/developments_agency_search/screen/big_filters/mvi/entity/BigFiltersInternalAction$ShowLocationGroupScreen;", "Lcom/avito/android/developments_agency_search/screen/big_filters/mvi/entity/BigFiltersInternalAction;", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ShowLocationGroupScreen implements BigFiltersInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final SearchParams f136706b;

        public ShowLocationGroupScreen(@k SearchParams searchParams) {
            this.f136706b = searchParams;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ShowLocationGroupScreen) && L.f(this.f136706b, ((ShowLocationGroupScreen) obj).f136706b);
        }

        public final int hashCode() {
            return this.f136706b.hashCode();
        }

        @k
        public final String toString() {
            return f.m(new StringBuilder("ShowLocationGroupScreen(searchParams="), this.f136706b, ')');
        }
    }

    /* compiled from: BigFiltersInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/developments_agency_search/screen/big_filters/mvi/entity/BigFiltersInternalAction$UpdateApplyButtonVisibility;", "Lcom/avito/android/developments_agency_search/screen/big_filters/mvi/entity/BigFiltersInternalAction;", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class UpdateApplyButtonVisibility implements BigFiltersInternalAction {

        /* renamed from: b, reason: collision with root package name */
        public final boolean f136707b;

        public UpdateApplyButtonVisibility(boolean z12) {
            this.f136707b = z12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof UpdateApplyButtonVisibility) && this.f136707b == ((UpdateApplyButtonVisibility) obj).f136707b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f136707b);
        }

        @k
        public final String toString() {
            return r.x(new StringBuilder("UpdateApplyButtonVisibility(isVisible="), this.f136707b, ')');
        }
    }

    /* compiled from: BigFiltersInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/developments_agency_search/screen/big_filters/mvi/entity/BigFiltersInternalAction$UpdateInitSearchParams;", "Lcom/avito/android/developments_agency_search/screen/big_filters/mvi/entity/BigFiltersInternalAction;", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class UpdateInitSearchParams implements BigFiltersInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final SearchParams f136708b;

        public UpdateInitSearchParams(@k SearchParams searchParams) {
            this.f136708b = searchParams;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof UpdateInitSearchParams) && L.f(this.f136708b, ((UpdateInitSearchParams) obj).f136708b);
        }

        public final int hashCode() {
            return this.f136708b.hashCode();
        }

        @k
        public final String toString() {
            return f.m(new StringBuilder("UpdateInitSearchParams(searchParams="), this.f136708b, ')');
        }
    }

    /* compiled from: BigFiltersInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/developments_agency_search/screen/big_filters/mvi/entity/BigFiltersInternalAction$UpdateLastSearchParams;", "Lcom/avito/android/developments_agency_search/screen/big_filters/mvi/entity/BigFiltersInternalAction;", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class UpdateLastSearchParams implements BigFiltersInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final SearchParams f136709b;

        public UpdateLastSearchParams(@k SearchParams searchParams) {
            this.f136709b = searchParams;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof UpdateLastSearchParams) && L.f(this.f136709b, ((UpdateLastSearchParams) obj).f136709b);
        }

        public final int hashCode() {
            return this.f136709b.hashCode();
        }

        @k
        public final String toString() {
            return f.m(new StringBuilder("UpdateLastSearchParams(searchParams="), this.f136709b, ')');
        }
    }

    /* compiled from: BigFiltersInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/developments_agency_search/screen/big_filters/mvi/entity/BigFiltersInternalAction$UpdateParameterValue;", "Lcom/avito/android/developments_agency_search/screen/big_filters/mvi/entity/BigFiltersInternalAction;", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class UpdateParameterValue implements BigFiltersInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final a f136710b;

        public UpdateParameterValue(@k a aVar) {
            this.f136710b = aVar;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof UpdateParameterValue) && L.f(this.f136710b, ((UpdateParameterValue) obj).f136710b);
        }

        public final int hashCode() {
            return this.f136710b.hashCode();
        }

        @k
        public final String toString() {
            return "UpdateParameterValue(item=" + this.f136710b + ')';
        }
    }

    /* compiled from: BigFiltersInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/developments_agency_search/screen/big_filters/mvi/entity/BigFiltersInternalAction$UpdateSelectedDeveloperDevelopmentValue;", "Lcom/avito/android/developments_agency_search/screen/big_filters/mvi/entity/BigFiltersInternalAction;", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class UpdateSelectedDeveloperDevelopmentValue implements BigFiltersInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final InlineFilterValue.InlineFilterDeveloperDevelopmentValue f136711b;

        public UpdateSelectedDeveloperDevelopmentValue(@k InlineFilterValue.InlineFilterDeveloperDevelopmentValue inlineFilterDeveloperDevelopmentValue) {
            this.f136711b = inlineFilterDeveloperDevelopmentValue;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof UpdateSelectedDeveloperDevelopmentValue) && L.f(this.f136711b, ((UpdateSelectedDeveloperDevelopmentValue) obj).f136711b);
        }

        public final int hashCode() {
            return this.f136711b.hashCode();
        }

        @k
        public final String toString() {
            return "UpdateSelectedDeveloperDevelopmentValue(value=" + this.f136711b + ')';
        }
    }

    /* compiled from: BigFiltersInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/developments_agency_search/screen/big_filters/mvi/entity/BigFiltersInternalAction$UpdateSelectedQuarterValue;", "Lcom/avito/android/developments_agency_search/screen/big_filters/mvi/entity/BigFiltersInternalAction;", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class UpdateSelectedQuarterValue implements BigFiltersInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final InlineFilterValue.InlineFilterNumericRangeValue f136712b;

        public UpdateSelectedQuarterValue(@k InlineFilterValue.InlineFilterNumericRangeValue inlineFilterNumericRangeValue) {
            this.f136712b = inlineFilterNumericRangeValue;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof UpdateSelectedQuarterValue) && L.f(this.f136712b, ((UpdateSelectedQuarterValue) obj).f136712b);
        }

        public final int hashCode() {
            return this.f136712b.hashCode();
        }

        @k
        public final String toString() {
            return "UpdateSelectedQuarterValue(value=" + this.f136712b + ')';
        }
    }
}
