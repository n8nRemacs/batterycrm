package com.avito.android.developments_agency_search.screen.location_group.mvi.entity;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.screens.J;
import com.avito.android.analytics.screens.mvi.TrackableContent;
import com.avito.android.analytics.screens.mvi.TrackableError;
import com.avito.android.analytics.screens.mvi.TrackableLoadingStarted;
import com.avito.android.analytics.screens.mvi.n;
import com.avito.android.bxcontent.mvi.entity.f;
import com.avito.android.remote.model.District;
import com.avito.android.remote.model.SearchParameters;
import com.avito.android.remote.model.SearchParams;
import com.avito.android.remote.model.metro_lines.MetroResponseBody;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: LocationGroupInternalAction.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0005\u0007\b\t\n\u000b¨\u0006\f"}, d2 = {"Lcom/avito/android/developments_agency_search/screen/location_group/mvi/entity/LocationGroupInternalAction;", "Lcom/avito/android/analytics/screens/mvi/n;", "AnalyticsEvent", "CloseScreen", "FiltersLoading", "SendScreenResult", "UpdateSearchParams", "Lcom/avito/android/developments_agency_search/screen/location_group/mvi/entity/LocationGroupInternalAction$AnalyticsEvent;", "Lcom/avito/android/developments_agency_search/screen/location_group/mvi/entity/LocationGroupInternalAction$CloseScreen;", "Lcom/avito/android/developments_agency_search/screen/location_group/mvi/entity/LocationGroupInternalAction$FiltersLoading;", "Lcom/avito/android/developments_agency_search/screen/location_group/mvi/entity/LocationGroupInternalAction$SendScreenResult;", "Lcom/avito/android/developments_agency_search/screen/location_group/mvi/entity/LocationGroupInternalAction$UpdateSearchParams;", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public interface LocationGroupInternalAction extends n {

    /* compiled from: LocationGroupInternalAction.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/avito/android/developments_agency_search/screen/location_group/mvi/entity/LocationGroupInternalAction$AnalyticsEvent;", "Lcom/avito/android/developments_agency_search/screen/location_group/mvi/entity/LocationGroupInternalAction;", "ApplyButtonClicked", "ClosedWithoutApplying", "LocationGroupShown", "ResetButtonClicked", "Lcom/avito/android/developments_agency_search/screen/location_group/mvi/entity/LocationGroupInternalAction$AnalyticsEvent$ApplyButtonClicked;", "Lcom/avito/android/developments_agency_search/screen/location_group/mvi/entity/LocationGroupInternalAction$AnalyticsEvent$ClosedWithoutApplying;", "Lcom/avito/android/developments_agency_search/screen/location_group/mvi/entity/LocationGroupInternalAction$AnalyticsEvent$LocationGroupShown;", "Lcom/avito/android/developments_agency_search/screen/location_group/mvi/entity/LocationGroupInternalAction$AnalyticsEvent$ResetButtonClicked;", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface AnalyticsEvent extends LocationGroupInternalAction {

        /* compiled from: LocationGroupInternalAction.kt */
        @P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/developments_agency_search/screen/location_group/mvi/entity/LocationGroupInternalAction$AnalyticsEvent$ApplyButtonClicked;", "Lcom/avito/android/developments_agency_search/screen/location_group/mvi/entity/LocationGroupInternalAction$AnalyticsEvent;", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class ApplyButtonClicked implements AnalyticsEvent {

            /* renamed from: b, reason: collision with root package name */
            @k
            public final SearchParams f138166b;

            public ApplyButtonClicked(@k SearchParams searchParams) {
                this.f138166b = searchParams;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof ApplyButtonClicked) && L.f(this.f138166b, ((ApplyButtonClicked) obj).f138166b);
            }

            public final int hashCode() {
                return this.f138166b.hashCode();
            }

            @k
            public final String toString() {
                return f.m(new StringBuilder("ApplyButtonClicked(searchParams="), this.f138166b, ')');
            }
        }

        /* compiled from: LocationGroupInternalAction.kt */
        @P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/developments_agency_search/screen/location_group/mvi/entity/LocationGroupInternalAction$AnalyticsEvent$ClosedWithoutApplying;", "Lcom/avito/android/developments_agency_search/screen/location_group/mvi/entity/LocationGroupInternalAction$AnalyticsEvent;", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class ClosedWithoutApplying implements AnalyticsEvent {

            /* renamed from: b, reason: collision with root package name */
            @k
            public final SearchParams f138167b;

            public ClosedWithoutApplying(@k SearchParams searchParams) {
                this.f138167b = searchParams;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof ClosedWithoutApplying) && L.f(this.f138167b, ((ClosedWithoutApplying) obj).f138167b);
            }

            public final int hashCode() {
                return this.f138167b.hashCode();
            }

            @k
            public final String toString() {
                return f.m(new StringBuilder("ClosedWithoutApplying(searchParams="), this.f138167b, ')');
            }
        }

        /* compiled from: LocationGroupInternalAction.kt */
        @P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/developments_agency_search/screen/location_group/mvi/entity/LocationGroupInternalAction$AnalyticsEvent$LocationGroupShown;", "Lcom/avito/android/developments_agency_search/screen/location_group/mvi/entity/LocationGroupInternalAction$AnalyticsEvent;", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class LocationGroupShown implements AnalyticsEvent {

            /* renamed from: b, reason: collision with root package name */
            @k
            public final SearchParams f138168b;

            public LocationGroupShown(@k SearchParams searchParams) {
                this.f138168b = searchParams;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof LocationGroupShown) && L.f(this.f138168b, ((LocationGroupShown) obj).f138168b);
            }

            public final int hashCode() {
                return this.f138168b.hashCode();
            }

            @k
            public final String toString() {
                return f.m(new StringBuilder("LocationGroupShown(searchParams="), this.f138168b, ')');
            }
        }

        /* compiled from: LocationGroupInternalAction.kt */
        @P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/developments_agency_search/screen/location_group/mvi/entity/LocationGroupInternalAction$AnalyticsEvent$ResetButtonClicked;", "Lcom/avito/android/developments_agency_search/screen/location_group/mvi/entity/LocationGroupInternalAction$AnalyticsEvent;", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class ResetButtonClicked implements AnalyticsEvent {

            /* renamed from: b, reason: collision with root package name */
            @k
            public final SearchParams f138169b;

            public ResetButtonClicked(@k SearchParams searchParams) {
                this.f138169b = searchParams;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof ResetButtonClicked) && L.f(this.f138169b, ((ResetButtonClicked) obj).f138169b);
            }

            public final int hashCode() {
                return this.f138169b.hashCode();
            }

            @k
            public final String toString() {
                return f.m(new StringBuilder("ResetButtonClicked(searchParams="), this.f138169b, ')');
            }
        }
    }

    /* compiled from: LocationGroupInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/developments_agency_search/screen/location_group/mvi/entity/LocationGroupInternalAction$CloseScreen;", "Lcom/avito/android/developments_agency_search/screen/location_group/mvi/entity/LocationGroupInternalAction;", "<init>", "()V", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class CloseScreen implements LocationGroupInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final CloseScreen f138170b = new CloseScreen();

        private CloseScreen() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof CloseScreen);
        }

        public final int hashCode() {
            return -1221186827;
        }

        @k
        public final String toString() {
            return "CloseScreen";
        }
    }

    /* compiled from: LocationGroupInternalAction.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/developments_agency_search/screen/location_group/mvi/entity/LocationGroupInternalAction$FiltersLoading;", "Lcom/avito/android/developments_agency_search/screen/location_group/mvi/entity/LocationGroupInternalAction;", "Loaded", "LoadingError", "StartLoading", "Lcom/avito/android/developments_agency_search/screen/location_group/mvi/entity/LocationGroupInternalAction$FiltersLoading$Loaded;", "Lcom/avito/android/developments_agency_search/screen/location_group/mvi/entity/LocationGroupInternalAction$FiltersLoading$LoadingError;", "Lcom/avito/android/developments_agency_search/screen/location_group/mvi/entity/LocationGroupInternalAction$FiltersLoading$StartLoading;", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface FiltersLoading extends LocationGroupInternalAction {

        /* compiled from: LocationGroupInternalAction.kt */
        @P
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/developments_agency_search/screen/location_group/mvi/entity/LocationGroupInternalAction$FiltersLoading$Loaded;", "Lcom/avito/android/developments_agency_search/screen/location_group/mvi/entity/LocationGroupInternalAction$FiltersLoading;", "Lcom/avito/android/analytics/screens/mvi/TrackableContent;", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class Loaded implements FiltersLoading, TrackableContent {

            /* renamed from: b, reason: collision with root package name */
            @k
            public final SearchParameters f138171b;

            /* renamed from: c, reason: collision with root package name */
            @l
            public final List<District> f138172c;

            /* renamed from: d, reason: collision with root package name */
            @l
            public final MetroResponseBody f138173d;

            public Loaded(@k SearchParameters searchParameters, @l List<District> list, @l MetroResponseBody metroResponseBody) {
                this.f138171b = searchParameters;
                this.f138172c = list;
                this.f138173d = metroResponseBody;
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
            public final String getF303160d() {
                return null;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Loaded)) {
                    return false;
                }
                Loaded loaded = (Loaded) obj;
                return L.f(this.f138171b, loaded.f138171b) && L.f(this.f138172c, loaded.f138172c) && L.f(this.f138173d, loaded.f138173d);
            }

            public final int hashCode() {
                int iHashCode = this.f138171b.hashCode() * 31;
                List<District> list = this.f138172c;
                int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
                MetroResponseBody metroResponseBody = this.f138173d;
                return iHashCode2 + (metroResponseBody != null ? metroResponseBody.hashCode() : 0);
            }

            @k
            public final String toString() {
                return "Loaded(searchParameters=" + this.f138171b + ", districts=" + this.f138172c + ", metroResponseBody=" + this.f138173d + ')';
            }
        }

        /* compiled from: LocationGroupInternalAction.kt */
        @P
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/developments_agency_search/screen/location_group/mvi/entity/LocationGroupInternalAction$FiltersLoading$LoadingError;", "Lcom/avito/android/developments_agency_search/screen/location_group/mvi/entity/LocationGroupInternalAction$FiltersLoading;", "Lcom/avito/android/analytics/screens/mvi/TrackableError;", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class LoadingError implements FiltersLoading, TrackableError {

            /* renamed from: b, reason: collision with root package name */
            @k
            public final Throwable f138174b;

            /* renamed from: c, reason: collision with root package name */
            @k
            public final J.a f138175c;

            public LoadingError(@k Throwable th2) {
                this.f138174b = th2;
                this.f138175c = new J.a(th2);
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
            public final String getF303160d() {
                return null;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof LoadingError) && L.f(this.f138174b, ((LoadingError) obj).f138174b);
            }

            @Override // com.avito.android.analytics.screens.mvi.TrackableError
            @k
            /* renamed from: g, reason: from getter */
            public final J.a getF277368c() {
                return this.f138175c;
            }

            public final int hashCode() {
                return this.f138174b.hashCode();
            }

            @k
            public final String toString() {
                return com.avito.android.advert.item.delivery_suggests.l.t(new StringBuilder("LoadingError(e="), this.f138174b, ')');
            }
        }

        /* compiled from: LocationGroupInternalAction.kt */
        @P
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/developments_agency_search/screen/location_group/mvi/entity/LocationGroupInternalAction$FiltersLoading$StartLoading;", "Lcom/avito/android/developments_agency_search/screen/location_group/mvi/entity/LocationGroupInternalAction$FiltersLoading;", "Lcom/avito/android/analytics/screens/mvi/TrackableLoadingStarted;", "()V", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class StartLoading extends TrackableLoadingStarted implements FiltersLoading {
        }
    }

    /* compiled from: LocationGroupInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/developments_agency_search/screen/location_group/mvi/entity/LocationGroupInternalAction$SendScreenResult;", "Lcom/avito/android/developments_agency_search/screen/location_group/mvi/entity/LocationGroupInternalAction;", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class SendScreenResult implements LocationGroupInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final SearchParams f138176b;

        public SendScreenResult(@k SearchParams searchParams) {
            this.f138176b = searchParams;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof SendScreenResult) && L.f(this.f138176b, ((SendScreenResult) obj).f138176b);
        }

        public final int hashCode() {
            return this.f138176b.hashCode();
        }

        @k
        public final String toString() {
            return f.m(new StringBuilder("SendScreenResult(searchParams="), this.f138176b, ')');
        }
    }

    /* compiled from: LocationGroupInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/developments_agency_search/screen/location_group/mvi/entity/LocationGroupInternalAction$UpdateSearchParams;", "Lcom/avito/android/developments_agency_search/screen/location_group/mvi/entity/LocationGroupInternalAction;", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class UpdateSearchParams implements LocationGroupInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final SearchParams f138177b;

        public UpdateSearchParams(@k SearchParams searchParams) {
            this.f138177b = searchParams;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof UpdateSearchParams) && L.f(this.f138177b, ((UpdateSearchParams) obj).f138177b);
        }

        public final int hashCode() {
            return this.f138177b.hashCode();
        }

        @k
        public final String toString() {
            return f.m(new StringBuilder("UpdateSearchParams(searchParams="), this.f138177b, ')');
        }
    }
}
