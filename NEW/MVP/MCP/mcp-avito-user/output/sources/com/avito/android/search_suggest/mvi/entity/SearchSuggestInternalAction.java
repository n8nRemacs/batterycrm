package com.avito.android.search_suggest.mvi.entity;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.runtime.C22026a;
import com.avito.android.actions_sheet.a;
import com.avito.android.analytics.screens.mvi.TrackableContent;
import com.avito.android.analytics.screens.mvi.TrackableLoadingStarted;
import com.avito.android.analytics.screens.mvi.n;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.search.o;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: SearchSuggestInternalAction.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\t\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u0082\u0001\t\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013¨\u0006\u0014"}, d2 = {"Lcom/avito/android/search_suggest/mvi/entity/SearchSuggestInternalAction;", "Lcom/avito/android/analytics/screens/mvi/n;", "CancelClicked", "DeeplinkAsNavigation", "DeeplinkAsResult", "RemoveHistorySearch", "RequestInputFocus", "SearchDeeplinkLoadingFailed", "SearchSuggestLoaded", "SearchSuggestLoading", "SuggestNewQuery", "Lcom/avito/android/search_suggest/mvi/entity/SearchSuggestInternalAction$CancelClicked;", "Lcom/avito/android/search_suggest/mvi/entity/SearchSuggestInternalAction$DeeplinkAsNavigation;", "Lcom/avito/android/search_suggest/mvi/entity/SearchSuggestInternalAction$DeeplinkAsResult;", "Lcom/avito/android/search_suggest/mvi/entity/SearchSuggestInternalAction$RemoveHistorySearch;", "Lcom/avito/android/search_suggest/mvi/entity/SearchSuggestInternalAction$RequestInputFocus;", "Lcom/avito/android/search_suggest/mvi/entity/SearchSuggestInternalAction$SearchDeeplinkLoadingFailed;", "Lcom/avito/android/search_suggest/mvi/entity/SearchSuggestInternalAction$SearchSuggestLoaded;", "Lcom/avito/android/search_suggest/mvi/entity/SearchSuggestInternalAction$SearchSuggestLoading;", "Lcom/avito/android/search_suggest/mvi/entity/SearchSuggestInternalAction$SuggestNewQuery;", "_avito_search-suggest_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface SearchSuggestInternalAction extends n {

    /* compiled from: SearchSuggestInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/search_suggest/mvi/entity/SearchSuggestInternalAction$CancelClicked;", "Lcom/avito/android/search_suggest/mvi/entity/SearchSuggestInternalAction;", "<init>", "()V", "_avito_search-suggest_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class CancelClicked implements SearchSuggestInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final CancelClicked f264327b = new CancelClicked();

        private CancelClicked() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof CancelClicked);
        }

        public final int hashCode() {
            return -978478937;
        }

        @k
        public final String toString() {
            return "CancelClicked";
        }
    }

    /* compiled from: SearchSuggestInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/search_suggest/mvi/entity/SearchSuggestInternalAction$DeeplinkAsNavigation;", "Lcom/avito/android/search_suggest/mvi/entity/SearchSuggestInternalAction;", "_avito_search-suggest_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class DeeplinkAsNavigation implements SearchSuggestInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final DeepLink f264328b;

        public DeeplinkAsNavigation(@k DeepLink deepLink) {
            this.f264328b = deepLink;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof DeeplinkAsNavigation) && L.f(this.f264328b, ((DeeplinkAsNavigation) obj).f264328b);
        }

        public final int hashCode() {
            return this.f264328b.hashCode();
        }

        @k
        public final String toString() {
            return a.v(new StringBuilder("DeeplinkAsNavigation(deeplink="), this.f264328b, ')');
        }
    }

    /* compiled from: SearchSuggestInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/search_suggest/mvi/entity/SearchSuggestInternalAction$DeeplinkAsResult;", "Lcom/avito/android/search_suggest/mvi/entity/SearchSuggestInternalAction;", "_avito_search-suggest_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class DeeplinkAsResult implements SearchSuggestInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final DeepLink f264329b;

        public DeeplinkAsResult(@k DeepLink deepLink) {
            this.f264329b = deepLink;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof DeeplinkAsResult) && L.f(this.f264329b, ((DeeplinkAsResult) obj).f264329b);
        }

        public final int hashCode() {
            return this.f264329b.hashCode();
        }

        @k
        public final String toString() {
            return a.v(new StringBuilder("DeeplinkAsResult(deeplink="), this.f264329b, ')');
        }
    }

    /* compiled from: SearchSuggestInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/search_suggest/mvi/entity/SearchSuggestInternalAction$RemoveHistorySearch;", "Lcom/avito/android/search_suggest/mvi/entity/SearchSuggestInternalAction;", "_avito_search-suggest_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class RemoveHistorySearch implements SearchSuggestInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f264330b;

        public RemoveHistorySearch(@k String str) {
            this.f264330b = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof RemoveHistorySearch) && L.f(this.f264330b, ((RemoveHistorySearch) obj).f264330b);
        }

        public final int hashCode() {
            return this.f264330b.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("RemoveHistorySearch(name="), this.f264330b, ')');
        }
    }

    /* compiled from: SearchSuggestInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/search_suggest/mvi/entity/SearchSuggestInternalAction$RequestInputFocus;", "Lcom/avito/android/search_suggest/mvi/entity/SearchSuggestInternalAction;", "<init>", "()V", "_avito_search-suggest_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class RequestInputFocus implements SearchSuggestInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final RequestInputFocus f264331b = new RequestInputFocus();

        private RequestInputFocus() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof RequestInputFocus);
        }

        public final int hashCode() {
            return 1647952503;
        }

        @k
        public final String toString() {
            return "RequestInputFocus";
        }
    }

    /* compiled from: SearchSuggestInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/search_suggest/mvi/entity/SearchSuggestInternalAction$SearchDeeplinkLoadingFailed;", "Lcom/avito/android/search_suggest/mvi/entity/SearchSuggestInternalAction;", "<init>", "()V", "_avito_search-suggest_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class SearchDeeplinkLoadingFailed implements SearchSuggestInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final SearchDeeplinkLoadingFailed f264332b = new SearchDeeplinkLoadingFailed();

        private SearchDeeplinkLoadingFailed() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof SearchDeeplinkLoadingFailed);
        }

        public final int hashCode() {
            return 630988133;
        }

        @k
        public final String toString() {
            return "SearchDeeplinkLoadingFailed";
        }
    }

    /* compiled from: SearchSuggestInternalAction.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/search_suggest/mvi/entity/SearchSuggestInternalAction$SearchSuggestLoaded;", "Lcom/avito/android/search_suggest/mvi/entity/SearchSuggestInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableContent;", "_avito_search-suggest_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class SearchSuggestLoaded implements SearchSuggestInternalAction, TrackableContent {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final o f264333b;

        public SearchSuggestLoaded(@k o oVar) {
            this.f264333b = oVar;
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @l
        /* renamed from: d */
        public final String getF212751d() {
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
            return (obj instanceof SearchSuggestLoaded) && L.f(this.f264333b, ((SearchSuggestLoaded) obj).f264333b);
        }

        public final int hashCode() {
            return this.f264333b.hashCode();
        }

        @k
        public final String toString() {
            return "SearchSuggestLoaded(result=" + this.f264333b + ')';
        }
    }

    /* compiled from: SearchSuggestInternalAction.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/search_suggest/mvi/entity/SearchSuggestInternalAction$SearchSuggestLoading;", "Lcom/avito/android/search_suggest/mvi/entity/SearchSuggestInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableLoadingStarted;", "()V", "_avito_search-suggest_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class SearchSuggestLoading extends TrackableLoadingStarted implements SearchSuggestInternalAction {
    }

    /* compiled from: SearchSuggestInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/search_suggest/mvi/entity/SearchSuggestInternalAction$SuggestNewQuery;", "Lcom/avito/android/search_suggest/mvi/entity/SearchSuggestInternalAction;", "_avito_search-suggest_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class SuggestNewQuery implements SearchSuggestInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f264334b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f264335c;

        public SuggestNewQuery(@k String str, boolean z12) {
            this.f264334b = str;
            this.f264335c = z12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SuggestNewQuery)) {
                return false;
            }
            SuggestNewQuery suggestNewQuery = (SuggestNewQuery) obj;
            return L.f(this.f264334b, suggestNewQuery.f264334b) && this.f264335c == suggestNewQuery.f264335c;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f264335c) + (this.f264334b.hashCode() * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("SuggestNewQuery(query=");
            sb2.append(this.f264334b);
            sb2.append(", fromBubbles=");
            return r.x(sb2, this.f264335c, ')');
        }
    }
}
