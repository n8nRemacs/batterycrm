package com.avito.android.travel_search.mvi.entity;

import AK.c;
import Y61.k;
import Y61.l;
import android.os.Bundle;
import androidx.compose.runtime.C22026a;
import com.avito.android.analytics.screens.J;
import com.avito.android.analytics.screens.mvi.TrackableContent;
import com.avito.android.analytics.screens.mvi.TrackableError;
import com.avito.android.analytics.screens.mvi.TrackableLoadingStarted;
import com.avito.android.analytics.screens.mvi.TrackablePreloadedContent;
import com.avito.android.analytics.screens.mvi.n;
import com.avito.android.bxcontent.mvi.entity.f;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.error.ApiError;
import com.avito.android.remote.model.SearchParams;
import com.avito.android.remote.model.search.Filter;
import com.avito.android.remote.model.search.InlineFilters;
import com.avito.android.travel_search.TravelSearchOpenParams;
import com.avito.android.travel_search.analytics.TravelSearchScreen;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import uF0.C48890a;

/* compiled from: TravelSearchInternalAction.kt */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\f\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u0082\u0001\f\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019¨\u0006\u001a"}, d2 = {"Lcom/avito/android/travel_search/mvi/entity/TravelSearchInternalAction;", "Lcom/avito/android/analytics/screens/mvi/n;", "CloseScreen", "ContentError", "ContentLoaded", "ContentLoading", "FiltersError", "FiltersLoaded", "FiltersLoading", "HandleDeeplink", "InitInlineFilters", "InitState", "OpenInlineFilter", "UpdateSearchParams", "Lcom/avito/android/travel_search/mvi/entity/TravelSearchInternalAction$CloseScreen;", "Lcom/avito/android/travel_search/mvi/entity/TravelSearchInternalAction$ContentError;", "Lcom/avito/android/travel_search/mvi/entity/TravelSearchInternalAction$ContentLoaded;", "Lcom/avito/android/travel_search/mvi/entity/TravelSearchInternalAction$ContentLoading;", "Lcom/avito/android/travel_search/mvi/entity/TravelSearchInternalAction$FiltersError;", "Lcom/avito/android/travel_search/mvi/entity/TravelSearchInternalAction$FiltersLoaded;", "Lcom/avito/android/travel_search/mvi/entity/TravelSearchInternalAction$FiltersLoading;", "Lcom/avito/android/travel_search/mvi/entity/TravelSearchInternalAction$HandleDeeplink;", "Lcom/avito/android/travel_search/mvi/entity/TravelSearchInternalAction$InitInlineFilters;", "Lcom/avito/android/travel_search/mvi/entity/TravelSearchInternalAction$InitState;", "Lcom/avito/android/travel_search/mvi/entity/TravelSearchInternalAction$OpenInlineFilter;", "Lcom/avito/android/travel_search/mvi/entity/TravelSearchInternalAction$UpdateSearchParams;", "_avito_travel-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface TravelSearchInternalAction extends n {

    /* compiled from: TravelSearchInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/travel_search/mvi/entity/TravelSearchInternalAction$CloseScreen;", "Lcom/avito/android/travel_search/mvi/entity/TravelSearchInternalAction;", "<init>", "()V", "_avito_travel-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class CloseScreen implements TravelSearchInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final CloseScreen f303145b = new CloseScreen();

        private CloseScreen() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof CloseScreen);
        }

        public final int hashCode() {
            return 521951036;
        }

        @k
        public final String toString() {
            return "CloseScreen";
        }
    }

    /* compiled from: TravelSearchInternalAction.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/travel_search/mvi/entity/TravelSearchInternalAction$ContentError;", "Lcom/avito/android/analytics/screens/mvi/TrackableError;", "Lcom/avito/android/travel_search/mvi/entity/TravelSearchInternalAction;", "_avito_travel-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ContentError implements TrackableError, TravelSearchInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final ApiError f303146b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final String f303147c;

        /* renamed from: d, reason: collision with root package name */
        @k
        public final String f303148d;

        /* renamed from: e, reason: collision with root package name */
        @k
        public final J.a f303149e;

        public ContentError(@k ApiError apiError) {
            this.f303146b = apiError;
            TravelSearchScreen.f302767d.getClass();
            String str = TravelSearchScreen.f302768e;
            this.f303147c = str;
            this.f303148d = str;
            this.f303149e = new J.a(apiError);
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @k
        /* renamed from: d, reason: from getter */
        public final String getF212751d() {
            return this.f303147c;
        }

        @Override // com.avito.android.analytics.screens.mvi.t
        @k
        /* renamed from: e, reason: from getter */
        public final String getF112001c() {
            return this.f303148d;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ContentError) && L.f(this.f303146b, ((ContentError) obj).f303146b);
        }

        @Override // com.avito.android.analytics.screens.mvi.TrackableError
        @k
        /* renamed from: g, reason: from getter */
        public final J.a getF226419d() {
            return this.f303149e;
        }

        public final int hashCode() {
            return this.f303146b.hashCode();
        }

        @k
        public final String toString() {
            return c.n(new StringBuilder("ContentError(error="), this.f303146b, ')');
        }
    }

    /* compiled from: TravelSearchInternalAction.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/travel_search/mvi/entity/TravelSearchInternalAction$ContentLoaded;", "Lcom/avito/android/analytics/screens/mvi/TrackableContent;", "Lcom/avito/android/travel_search/mvi/entity/TravelSearchInternalAction;", "_avito_travel-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ContentLoaded implements TrackableContent, TravelSearchInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final C48890a f303150b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final String f303151c;

        /* renamed from: d, reason: collision with root package name */
        @k
        public final String f303152d;

        public ContentLoaded(@k C48890a c48890a) {
            this.f303150b = c48890a;
            TravelSearchScreen travelSearchScreen = TravelSearchScreen.f302767d;
            travelSearchScreen.getClass();
            String str = TravelSearchScreen.f302768e;
            this.f303151c = str;
            travelSearchScreen.getClass();
            this.f303152d = str;
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @k
        /* renamed from: d, reason: from getter */
        public final String getF212751d() {
            return this.f303151c;
        }

        @Override // com.avito.android.analytics.screens.mvi.t
        @k
        /* renamed from: e, reason: from getter */
        public final String getF112001c() {
            return this.f303152d;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ContentLoaded) && L.f(this.f303150b, ((ContentLoaded) obj).f303150b);
        }

        public final int hashCode() {
            return this.f303150b.hashCode();
        }

        @k
        public final String toString() {
            return "ContentLoaded(data=" + this.f303150b + ')';
        }
    }

    /* compiled from: TravelSearchInternalAction.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/travel_search/mvi/entity/TravelSearchInternalAction$ContentLoading;", "Lcom/avito/android/analytics/screens/mvi/TrackableLoadingStarted;", "Lcom/avito/android/travel_search/mvi/entity/TravelSearchInternalAction;", "<init>", "()V", "_avito_travel-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class ContentLoading extends TrackableLoadingStarted implements TravelSearchInternalAction {

        /* renamed from: d, reason: collision with root package name */
        @k
        public final String f303153d;

        public ContentLoading() {
            TravelSearchScreen.f302767d.getClass();
            this.f303153d = TravelSearchScreen.f302768e;
        }

        @Override // com.avito.android.analytics.screens.mvi.TrackableLoadingStarted, com.avito.android.analytics.screens.mvi.s
        @k
        /* renamed from: d, reason: from getter */
        public final String getF212751d() {
            return this.f303153d;
        }
    }

    /* compiled from: TravelSearchInternalAction.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/travel_search/mvi/entity/TravelSearchInternalAction$FiltersError;", "Lcom/avito/android/analytics/screens/mvi/TrackableError;", "Lcom/avito/android/travel_search/mvi/entity/TravelSearchInternalAction;", "_avito_travel-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class FiltersError implements TrackableError, TravelSearchInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final ApiError f303154b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final String f303155c;

        /* renamed from: d, reason: collision with root package name */
        @k
        public final String f303156d;

        /* renamed from: e, reason: collision with root package name */
        @k
        public final J.a f303157e;

        public FiltersError(@k ApiError apiError) {
            this.f303154b = apiError;
            TravelSearchScreen.f302767d.getClass();
            String str = TravelSearchScreen.f302769f;
            this.f303155c = str;
            this.f303156d = str;
            this.f303157e = new J.a(apiError);
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @k
        /* renamed from: d, reason: from getter */
        public final String getF212751d() {
            return this.f303155c;
        }

        @Override // com.avito.android.analytics.screens.mvi.t
        @k
        /* renamed from: e, reason: from getter */
        public final String getF112001c() {
            return this.f303156d;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof FiltersError) && L.f(this.f303154b, ((FiltersError) obj).f303154b);
        }

        @Override // com.avito.android.analytics.screens.mvi.TrackableError
        @k
        /* renamed from: g, reason: from getter */
        public final J.a getF226419d() {
            return this.f303157e;
        }

        public final int hashCode() {
            return this.f303154b.hashCode();
        }

        @k
        public final String toString() {
            return c.n(new StringBuilder("FiltersError(error="), this.f303154b, ')');
        }
    }

    /* compiled from: TravelSearchInternalAction.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/travel_search/mvi/entity/TravelSearchInternalAction$FiltersLoaded;", "Lcom/avito/android/analytics/screens/mvi/TrackableContent;", "Lcom/avito/android/travel_search/mvi/entity/TravelSearchInternalAction;", "_avito_travel-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class FiltersLoaded implements TrackableContent, TravelSearchInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @l
        public final InlineFilters f303158b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final String f303159c;

        /* renamed from: d, reason: collision with root package name */
        @k
        public final String f303160d;

        public FiltersLoaded(@l InlineFilters inlineFilters) {
            this.f303158b = inlineFilters;
            TravelSearchScreen travelSearchScreen = TravelSearchScreen.f302767d;
            travelSearchScreen.getClass();
            String str = TravelSearchScreen.f302769f;
            this.f303159c = str;
            travelSearchScreen.getClass();
            this.f303160d = str;
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @k
        /* renamed from: d, reason: from getter */
        public final String getF212751d() {
            return this.f303159c;
        }

        @Override // com.avito.android.analytics.screens.mvi.t
        @k
        /* renamed from: e, reason: from getter */
        public final String getF112001c() {
            return this.f303160d;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof FiltersLoaded) && L.f(this.f303158b, ((FiltersLoaded) obj).f303158b);
        }

        public final int hashCode() {
            InlineFilters inlineFilters = this.f303158b;
            if (inlineFilters == null) {
                return 0;
            }
            return inlineFilters.hashCode();
        }

        @k
        public final String toString() {
            return "FiltersLoaded(filters=" + this.f303158b + ')';
        }
    }

    /* compiled from: TravelSearchInternalAction.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/travel_search/mvi/entity/TravelSearchInternalAction$FiltersLoading;", "Lcom/avito/android/analytics/screens/mvi/TrackableLoadingStarted;", "Lcom/avito/android/travel_search/mvi/entity/TravelSearchInternalAction;", "<init>", "()V", "_avito_travel-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class FiltersLoading extends TrackableLoadingStarted implements TravelSearchInternalAction {

        /* renamed from: d, reason: collision with root package name */
        @k
        public final String f303161d;

        public FiltersLoading() {
            TravelSearchScreen.f302767d.getClass();
            this.f303161d = TravelSearchScreen.f302769f;
        }

        @Override // com.avito.android.analytics.screens.mvi.TrackableLoadingStarted, com.avito.android.analytics.screens.mvi.s
        @k
        /* renamed from: d, reason: from getter */
        public final String getF212751d() {
            return this.f303161d;
        }
    }

    /* compiled from: TravelSearchInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/travel_search/mvi/entity/TravelSearchInternalAction$InitInlineFilters;", "Lcom/avito/android/travel_search/mvi/entity/TravelSearchInternalAction;", "_avito_travel-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class InitInlineFilters implements TravelSearchInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final SearchParams f303165b;

        public InitInlineFilters(@k SearchParams searchParams) {
            this.f303165b = searchParams;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof InitInlineFilters) && L.f(this.f303165b, ((InitInlineFilters) obj).f303165b);
        }

        public final int hashCode() {
            return this.f303165b.hashCode();
        }

        @k
        public final String toString() {
            return f.m(new StringBuilder("InitInlineFilters(searchParams="), this.f303165b, ')');
        }
    }

    /* compiled from: TravelSearchInternalAction.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/travel_search/mvi/entity/TravelSearchInternalAction$InitState;", "Lcom/avito/android/analytics/screens/mvi/TrackablePreloadedContent;", "Lcom/avito/android/travel_search/mvi/entity/TravelSearchInternalAction;", "_avito_travel-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class InitState implements TrackablePreloadedContent, TravelSearchInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final TravelSearchOpenParams f303166b;

        public InitState(@k TravelSearchOpenParams travelSearchOpenParams) {
            this.f303166b = travelSearchOpenParams;
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
            return (obj instanceof InitState) && L.f(this.f303166b, ((InitState) obj).f303166b);
        }

        public final int hashCode() {
            return this.f303166b.hashCode();
        }

        @k
        public final String toString() {
            return "InitState(openParams=" + this.f303166b + ')';
        }
    }

    /* compiled from: TravelSearchInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/travel_search/mvi/entity/TravelSearchInternalAction$OpenInlineFilter;", "Lcom/avito/android/travel_search/mvi/entity/TravelSearchInternalAction;", "_avito_travel-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class OpenInlineFilter implements TravelSearchInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @l
        public final Filter f303167b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final SearchParams f303168c;

        public OpenInlineFilter(@k SearchParams searchParams, @l Filter filter) {
            this.f303167b = filter;
            this.f303168c = searchParams;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OpenInlineFilter)) {
                return false;
            }
            OpenInlineFilter openInlineFilter = (OpenInlineFilter) obj;
            return L.f(this.f303167b, openInlineFilter.f303167b) && L.f(this.f303168c, openInlineFilter.f303168c);
        }

        public final int hashCode() {
            Filter filter = this.f303167b;
            return this.f303168c.hashCode() + ((filter == null ? 0 : filter.hashCode()) * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("OpenInlineFilter(filter=");
            sb2.append(this.f303167b);
            sb2.append(", searchParams=");
            return f.m(sb2, this.f303168c, ')');
        }
    }

    /* compiled from: TravelSearchInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/travel_search/mvi/entity/TravelSearchInternalAction$UpdateSearchParams;", "Lcom/avito/android/travel_search/mvi/entity/TravelSearchInternalAction;", "_avito_travel-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class UpdateSearchParams implements TravelSearchInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final SearchParams f303169b;

        public UpdateSearchParams(@k SearchParams searchParams) {
            this.f303169b = searchParams;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof UpdateSearchParams) && L.f(this.f303169b, ((UpdateSearchParams) obj).f303169b);
        }

        public final int hashCode() {
            return this.f303169b.hashCode();
        }

        @k
        public final String toString() {
            return f.m(new StringBuilder("UpdateSearchParams(searchParams="), this.f303169b, ')');
        }
    }

    /* compiled from: TravelSearchInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/travel_search/mvi/entity/TravelSearchInternalAction$HandleDeeplink;", "Lcom/avito/android/travel_search/mvi/entity/TravelSearchInternalAction;", "_avito_travel-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class HandleDeeplink implements TravelSearchInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final DeepLink f303162b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final Bundle f303163c;

        /* renamed from: d, reason: collision with root package name */
        @l
        public final String f303164d;

        public HandleDeeplink(@l Bundle bundle, @k DeepLink deepLink, @l String str) {
            this.f303162b = deepLink;
            this.f303163c = bundle;
            this.f303164d = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof HandleDeeplink)) {
                return false;
            }
            HandleDeeplink handleDeeplink = (HandleDeeplink) obj;
            return L.f(this.f303162b, handleDeeplink.f303162b) && L.f(this.f303163c, handleDeeplink.f303163c) && L.f(this.f303164d, handleDeeplink.f303164d);
        }

        public final int hashCode() {
            int iHashCode = this.f303162b.hashCode() * 31;
            Bundle bundle = this.f303163c;
            int iHashCode2 = (iHashCode + (bundle == null ? 0 : bundle.hashCode())) * 31;
            String str = this.f303164d;
            return iHashCode2 + (str != null ? str.hashCode() : 0);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("HandleDeeplink(deeplink=");
            sb2.append(this.f303162b);
            sb2.append(", args=");
            sb2.append(this.f303163c);
            sb2.append(", requestKey=");
            return C22026a.c(sb2, this.f303164d, ')');
        }

        public /* synthetic */ HandleDeeplink(DeepLink deepLink, Bundle bundle, String str, int i12, C42822w c42822w) {
            this((i12 & 2) != 0 ? null : bundle, deepLink, (i12 & 4) != 0 ? null : str);
        }
    }
}
