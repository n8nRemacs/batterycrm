package com.avito.android.realty_agency.inline_filters.location_suggest.mvi.entity;

import AK.c;
import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import com.avito.android.analytics.screens.J;
import com.avito.android.analytics.screens.mvi.TrackableContent;
import com.avito.android.analytics.screens.mvi.TrackableError;
import com.avito.android.analytics.screens.mvi.TrackableLoadingStarted;
import com.avito.android.analytics.screens.mvi.n;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.util.ApiException;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import oi0.C44782a;
import oi0.C44783b;

/* compiled from: LocationSuggestInternalAction.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0005\u0007\b\t\n\u000b¨\u0006\f"}, d2 = {"Lcom/avito/android/realty_agency/inline_filters/location_suggest/mvi/entity/LocationSuggestInternalAction;", "Lcom/avito/android/analytics/screens/mvi/n;", "CloseScreenWithSelectedLocation", "Init", "LocationsLoading", "ShowToast", "UpdateQueryString", "Lcom/avito/android/realty_agency/inline_filters/location_suggest/mvi/entity/LocationSuggestInternalAction$CloseScreenWithSelectedLocation;", "Lcom/avito/android/realty_agency/inline_filters/location_suggest/mvi/entity/LocationSuggestInternalAction$Init;", "Lcom/avito/android/realty_agency/inline_filters/location_suggest/mvi/entity/LocationSuggestInternalAction$LocationsLoading;", "Lcom/avito/android/realty_agency/inline_filters/location_suggest/mvi/entity/LocationSuggestInternalAction$ShowToast;", "Lcom/avito/android/realty_agency/inline_filters/location_suggest/mvi/entity/LocationSuggestInternalAction$UpdateQueryString;", "_avito_realty-agency_inline-filters_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public interface LocationSuggestInternalAction extends n {

    /* compiled from: LocationSuggestInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/realty_agency/inline_filters/location_suggest/mvi/entity/LocationSuggestInternalAction$CloseScreenWithSelectedLocation;", "Lcom/avito/android/realty_agency/inline_filters/location_suggest/mvi/entity/LocationSuggestInternalAction;", "_avito_realty-agency_inline-filters_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class CloseScreenWithSelectedLocation implements LocationSuggestInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final C44783b f251693b;

        public CloseScreenWithSelectedLocation(@k C44783b c44783b) {
            this.f251693b = c44783b;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof CloseScreenWithSelectedLocation) && L.f(this.f251693b, ((CloseScreenWithSelectedLocation) obj).f251693b);
        }

        public final int hashCode() {
            return this.f251693b.hashCode();
        }

        @k
        public final String toString() {
            return "CloseScreenWithSelectedLocation(location=" + this.f251693b + ')';
        }
    }

    /* compiled from: LocationSuggestInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/realty_agency/inline_filters/location_suggest/mvi/entity/LocationSuggestInternalAction$Init;", "Lcom/avito/android/realty_agency/inline_filters/location_suggest/mvi/entity/LocationSuggestInternalAction;", "_avito_realty-agency_inline-filters_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Init implements LocationSuggestInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @l
        public final String f251694b;

        public Init(@l String str) {
            this.f251694b = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Init) && L.f(this.f251694b, ((Init) obj).f251694b);
        }

        public final int hashCode() {
            String str = this.f251694b;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("Init(locationId="), this.f251694b, ')');
        }
    }

    /* compiled from: LocationSuggestInternalAction.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/realty_agency/inline_filters/location_suggest/mvi/entity/LocationSuggestInternalAction$LocationsLoading;", "Lcom/avito/android/realty_agency/inline_filters/location_suggest/mvi/entity/LocationSuggestInternalAction;", "Loaded", "LoadingError", "StartLoading", "Lcom/avito/android/realty_agency/inline_filters/location_suggest/mvi/entity/LocationSuggestInternalAction$LocationsLoading$Loaded;", "Lcom/avito/android/realty_agency/inline_filters/location_suggest/mvi/entity/LocationSuggestInternalAction$LocationsLoading$LoadingError;", "Lcom/avito/android/realty_agency/inline_filters/location_suggest/mvi/entity/LocationSuggestInternalAction$LocationsLoading$StartLoading;", "_avito_realty-agency_inline-filters_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface LocationsLoading extends LocationSuggestInternalAction {

        /* compiled from: LocationSuggestInternalAction.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/realty_agency/inline_filters/location_suggest/mvi/entity/LocationSuggestInternalAction$LocationsLoading$Loaded;", "Lcom/avito/android/realty_agency/inline_filters/location_suggest/mvi/entity/LocationSuggestInternalAction$LocationsLoading;", "Lcom/avito/android/analytics/screens/mvi/TrackableContent;", "_avito_realty-agency_inline-filters_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class Loaded implements LocationsLoading, TrackableContent {

            /* renamed from: b, reason: collision with root package name */
            @k
            public final C44782a f251695b;

            public Loaded(@k C44782a c44782a) {
                this.f251695b = c44782a;
            }

            @Override // com.avito.android.analytics.screens.mvi.s
            @l
            /* renamed from: d */
            public final String getF115373d() {
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
                return (obj instanceof Loaded) && L.f(this.f251695b, ((Loaded) obj).f251695b);
            }

            public final int hashCode() {
                return this.f251695b.hashCode();
            }

            @k
            public final String toString() {
                return "Loaded(response=" + this.f251695b + ')';
            }
        }

        /* compiled from: LocationSuggestInternalAction.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/realty_agency/inline_filters/location_suggest/mvi/entity/LocationSuggestInternalAction$LocationsLoading$LoadingError;", "Lcom/avito/android/realty_agency/inline_filters/location_suggest/mvi/entity/LocationSuggestInternalAction$LocationsLoading;", "Lcom/avito/android/analytics/screens/mvi/TrackableError;", "_avito_realty-agency_inline-filters_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class LoadingError implements LocationsLoading, TrackableError {

            /* renamed from: b, reason: collision with root package name */
            @k
            public final ApiException f251696b;

            /* renamed from: c, reason: collision with root package name */
            @k
            public final J.a f251697c;

            public LoadingError(@k ApiException apiException) {
                this.f251696b = apiException;
                this.f251697c = new J.a(apiException);
            }

            @Override // com.avito.android.analytics.screens.mvi.s
            @l
            /* renamed from: d */
            public final String getF115373d() {
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
                return (obj instanceof LoadingError) && this.f251696b.equals(((LoadingError) obj).f251696b);
            }

            @Override // com.avito.android.analytics.screens.mvi.TrackableError
            @k
            /* renamed from: g, reason: from getter */
            public final J.a getF213835c() {
                return this.f251697c;
            }

            public final int hashCode() {
                return this.f251696b.hashCode();
            }

            @k
            public final String toString() {
                return c.q(new StringBuilder("LoadingError(e="), this.f251696b, ')');
            }
        }

        /* compiled from: LocationSuggestInternalAction.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/realty_agency/inline_filters/location_suggest/mvi/entity/LocationSuggestInternalAction$LocationsLoading$StartLoading;", "Lcom/avito/android/realty_agency/inline_filters/location_suggest/mvi/entity/LocationSuggestInternalAction$LocationsLoading;", "Lcom/avito/android/analytics/screens/mvi/TrackableLoadingStarted;", "_avito_realty-agency_inline-filters_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class StartLoading extends TrackableLoadingStarted implements LocationsLoading {

            /* renamed from: d, reason: collision with root package name */
            @k
            public final G0 f251698d;

            public StartLoading() {
                this(null, 1, null);
            }

            @Override // com.avito.android.analytics.screens.mvi.TrackableLoadingStarted
            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof StartLoading) && L.f(this.f251698d, ((StartLoading) obj).f251698d);
            }

            @Override // com.avito.android.analytics.screens.mvi.TrackableLoadingStarted
            public final int hashCode() {
                return this.f251698d.hashCode();
            }

            @k
            public final String toString() {
                return c.v(new StringBuilder("StartLoading(stub="), this.f251698d, ')');
            }

            public StartLoading(G0 g02, int i12, C42822w c42822w) {
                this.f251698d = (i12 & 1) != 0 ? G0.f406611a : g02;
            }
        }
    }

    /* compiled from: LocationSuggestInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/realty_agency/inline_filters/location_suggest/mvi/entity/LocationSuggestInternalAction$ShowToast;", "Lcom/avito/android/realty_agency/inline_filters/location_suggest/mvi/entity/LocationSuggestInternalAction;", "_avito_realty-agency_inline-filters_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ShowToast implements LocationSuggestInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final PrintableText f251699b;

        public ShowToast(@k PrintableText printableText) {
            this.f251699b = printableText;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ShowToast) && L.f(this.f251699b, ((ShowToast) obj).f251699b);
        }

        public final int hashCode() {
            return this.f251699b.hashCode();
        }

        @k
        public final String toString() {
            return c.m(new StringBuilder("ShowToast(text="), this.f251699b, ')');
        }
    }

    /* compiled from: LocationSuggestInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/realty_agency/inline_filters/location_suggest/mvi/entity/LocationSuggestInternalAction$UpdateQueryString;", "Lcom/avito/android/realty_agency/inline_filters/location_suggest/mvi/entity/LocationSuggestInternalAction;", "_avito_realty-agency_inline-filters_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class UpdateQueryString implements LocationSuggestInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f251700b;

        public UpdateQueryString(@k String str) {
            this.f251700b = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof UpdateQueryString) && L.f(this.f251700b, ((UpdateQueryString) obj).f251700b);
        }

        public final int hashCode() {
            return this.f251700b.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("UpdateQueryString(query="), this.f251700b, ')');
        }
    }
}
