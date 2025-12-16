package com.avito.android.position_in_search.stats.screen.position_in_search.mvi.entity;

import Q80.d;
import R80.c;
import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.avito.android.actions_sheet.a;
import com.avito.android.analytics.screens.J;
import com.avito.android.analytics.screens.mvi.TrackableContent;
import com.avito.android.analytics.screens.mvi.TrackableError;
import com.avito.android.analytics.screens.mvi.TrackableLoadingStarted;
import com.avito.android.analytics.screens.mvi.n;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.position_in_search.stats.screen.position_in_search.PositionInSearchPerfScreen;
import com.avito.android.util.ApiException;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: PositionInSearchInternalAction.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\b\u0002\u0003\u0004\u0005\u0006\u0007\b\t\u0082\u0001\b\n\u000b\f\r\u000e\u000f\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/avito/android/position_in_search/stats/screen/position_in_search/mvi/entity/PositionInSearchInternalAction;", "Lcom/avito/android/analytics/screens/mvi/n;", "Close", "CloseBanner", "HandleDeeplink", "MainInfo", "NextPageLoaded", "PeriodClicked", "PeriodInfo", "ShowMessage", "Lcom/avito/android/position_in_search/stats/screen/position_in_search/mvi/entity/PositionInSearchInternalAction$Close;", "Lcom/avito/android/position_in_search/stats/screen/position_in_search/mvi/entity/PositionInSearchInternalAction$CloseBanner;", "Lcom/avito/android/position_in_search/stats/screen/position_in_search/mvi/entity/PositionInSearchInternalAction$HandleDeeplink;", "Lcom/avito/android/position_in_search/stats/screen/position_in_search/mvi/entity/PositionInSearchInternalAction$MainInfo;", "Lcom/avito/android/position_in_search/stats/screen/position_in_search/mvi/entity/PositionInSearchInternalAction$NextPageLoaded;", "Lcom/avito/android/position_in_search/stats/screen/position_in_search/mvi/entity/PositionInSearchInternalAction$PeriodClicked;", "Lcom/avito/android/position_in_search/stats/screen/position_in_search/mvi/entity/PositionInSearchInternalAction$PeriodInfo;", "Lcom/avito/android/position_in_search/stats/screen/position_in_search/mvi/entity/PositionInSearchInternalAction$ShowMessage;", "_avito_position-in-search_stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface PositionInSearchInternalAction extends n {

    /* compiled from: PositionInSearchInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/position_in_search/stats/screen/position_in_search/mvi/entity/PositionInSearchInternalAction$Close;", "Lcom/avito/android/position_in_search/stats/screen/position_in_search/mvi/entity/PositionInSearchInternalAction;", "<init>", "()V", "_avito_position-in-search_stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Close implements PositionInSearchInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final Close f221498b = new Close();

        private Close() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof Close);
        }

        public final int hashCode() {
            return 939328810;
        }

        @k
        public final String toString() {
            return "Close";
        }
    }

    /* compiled from: PositionInSearchInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/position_in_search/stats/screen/position_in_search/mvi/entity/PositionInSearchInternalAction$CloseBanner;", "Lcom/avito/android/position_in_search/stats/screen/position_in_search/mvi/entity/PositionInSearchInternalAction;", "_avito_position-in-search_stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class CloseBanner implements PositionInSearchInternalAction {

        /* renamed from: b, reason: collision with root package name */
        public final boolean f221499b;

        public CloseBanner(boolean z12) {
            this.f221499b = z12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof CloseBanner) && this.f221499b == ((CloseBanner) obj).f221499b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f221499b);
        }

        @k
        public final String toString() {
            return r.x(new StringBuilder("CloseBanner(isAdviceBanner="), this.f221499b, ')');
        }
    }

    /* compiled from: PositionInSearchInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/position_in_search/stats/screen/position_in_search/mvi/entity/PositionInSearchInternalAction$HandleDeeplink;", "Lcom/avito/android/position_in_search/stats/screen/position_in_search/mvi/entity/PositionInSearchInternalAction;", "_avito_position-in-search_stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class HandleDeeplink implements PositionInSearchInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final DeepLink f221500b;

        public HandleDeeplink(@k DeepLink deepLink) {
            this.f221500b = deepLink;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof HandleDeeplink) && L.f(this.f221500b, ((HandleDeeplink) obj).f221500b);
        }

        public final int hashCode() {
            return this.f221500b.hashCode();
        }

        @k
        public final String toString() {
            return a.v(new StringBuilder("HandleDeeplink(deeplink="), this.f221500b, ')');
        }
    }

    /* compiled from: PositionInSearchInternalAction.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/position_in_search/stats/screen/position_in_search/mvi/entity/PositionInSearchInternalAction$MainInfo;", "Lcom/avito/android/position_in_search/stats/screen/position_in_search/mvi/entity/PositionInSearchInternalAction;", "Content", "Error", "Loading", "Lcom/avito/android/position_in_search/stats/screen/position_in_search/mvi/entity/PositionInSearchInternalAction$MainInfo$Content;", "Lcom/avito/android/position_in_search/stats/screen/position_in_search/mvi/entity/PositionInSearchInternalAction$MainInfo$Error;", "Lcom/avito/android/position_in_search/stats/screen/position_in_search/mvi/entity/PositionInSearchInternalAction$MainInfo$Loading;", "_avito_position-in-search_stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface MainInfo extends PositionInSearchInternalAction {

        /* compiled from: PositionInSearchInternalAction.kt */
        @P
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/position_in_search/stats/screen/position_in_search/mvi/entity/PositionInSearchInternalAction$MainInfo$Content;", "Lcom/avito/android/position_in_search/stats/screen/position_in_search/mvi/entity/PositionInSearchInternalAction$MainInfo;", "Lcom/avito/android/analytics/screens/mvi/TrackableContent;", "_avito_position-in-search_stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class Content implements MainInfo, TrackableContent {

            /* renamed from: b, reason: collision with root package name */
            @k
            public final c f221501b;

            /* renamed from: c, reason: collision with root package name */
            @k
            public final String f221502c;

            public Content(@k c cVar) {
                this.f221501b = cVar;
                PositionInSearchPerfScreen.f221325d.getClass();
                this.f221502c = PositionInSearchPerfScreen.f221326e;
            }

            @Override // com.avito.android.analytics.screens.mvi.s
            @k
            /* renamed from: d, reason: from getter */
            public final String getF174588d() {
                return this.f221502c;
            }

            @Override // com.avito.android.analytics.screens.mvi.t
            @l
            /* renamed from: e */
            public final String getF303160d() {
                return this.f221502c;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Content) && L.f(this.f221501b, ((Content) obj).f221501b);
            }

            public final int hashCode() {
                return this.f221501b.hashCode();
            }

            @k
            public final String toString() {
                return "Content(response=" + this.f221501b + ')';
            }
        }

        /* compiled from: PositionInSearchInternalAction.kt */
        @P
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/position_in_search/stats/screen/position_in_search/mvi/entity/PositionInSearchInternalAction$MainInfo$Error;", "Lcom/avito/android/position_in_search/stats/screen/position_in_search/mvi/entity/PositionInSearchInternalAction$MainInfo;", "Lcom/avito/android/analytics/screens/mvi/TrackableError;", "_avito_position-in-search_stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class Error implements MainInfo, TrackableError {

            /* renamed from: b, reason: collision with root package name */
            @k
            public final ApiException f221503b;

            /* renamed from: c, reason: collision with root package name */
            @k
            public final String f221504c;

            /* renamed from: d, reason: collision with root package name */
            @k
            public final J.a f221505d;

            public Error(@k ApiException apiException) {
                this.f221503b = apiException;
                PositionInSearchPerfScreen.f221325d.getClass();
                this.f221504c = PositionInSearchPerfScreen.f221326e;
                this.f221505d = new J.a(apiException);
            }

            @Override // com.avito.android.analytics.screens.mvi.s
            @k
            /* renamed from: d, reason: from getter */
            public final String getF174588d() {
                return this.f221504c;
            }

            @Override // com.avito.android.analytics.screens.mvi.t
            @l
            /* renamed from: e */
            public final String getF303160d() {
                return this.f221504c;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Error) && this.f221503b.equals(((Error) obj).f221503b);
            }

            @Override // com.avito.android.analytics.screens.mvi.TrackableError
            @k
            /* renamed from: g, reason: from getter */
            public final J.a getF174580c() {
                return this.f221505d;
            }

            public final int hashCode() {
                return this.f221503b.hashCode();
            }

            @k
            public final String toString() {
                return AK.c.q(new StringBuilder("Error(error="), this.f221503b, ')');
            }
        }

        /* compiled from: PositionInSearchInternalAction.kt */
        @P
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/position_in_search/stats/screen/position_in_search/mvi/entity/PositionInSearchInternalAction$MainInfo$Loading;", "Lcom/avito/android/position_in_search/stats/screen/position_in_search/mvi/entity/PositionInSearchInternalAction$MainInfo;", "Lcom/avito/android/analytics/screens/mvi/TrackableLoadingStarted;", "<init>", "()V", "_avito_position-in-search_stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class Loading extends TrackableLoadingStarted implements MainInfo {

            /* renamed from: d, reason: collision with root package name */
            @k
            public final String f221506d;

            public Loading() {
                PositionInSearchPerfScreen.f221325d.getClass();
                this.f221506d = PositionInSearchPerfScreen.f221326e;
            }

            @Override // com.avito.android.analytics.screens.mvi.TrackableLoadingStarted, com.avito.android.analytics.screens.mvi.s
            @k
            /* renamed from: d, reason: from getter */
            public final String getF174588d() {
                return this.f221506d;
            }
        }
    }

    /* compiled from: PositionInSearchInternalAction.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/position_in_search/stats/screen/position_in_search/mvi/entity/PositionInSearchInternalAction$NextPageLoaded;", "Lcom/avito/android/position_in_search/stats/screen/position_in_search/mvi/entity/PositionInSearchInternalAction;", "Content", "Error", "Loading", "Lcom/avito/android/position_in_search/stats/screen/position_in_search/mvi/entity/PositionInSearchInternalAction$NextPageLoaded$Content;", "Lcom/avito/android/position_in_search/stats/screen/position_in_search/mvi/entity/PositionInSearchInternalAction$NextPageLoaded$Error;", "Lcom/avito/android/position_in_search/stats/screen/position_in_search/mvi/entity/PositionInSearchInternalAction$NextPageLoaded$Loading;", "_avito_position-in-search_stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface NextPageLoaded extends PositionInSearchInternalAction {

        /* compiled from: PositionInSearchInternalAction.kt */
        @P
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/position_in_search/stats/screen/position_in_search/mvi/entity/PositionInSearchInternalAction$NextPageLoaded$Content;", "Lcom/avito/android/position_in_search/stats/screen/position_in_search/mvi/entity/PositionInSearchInternalAction$NextPageLoaded;", "Lcom/avito/android/analytics/screens/mvi/TrackableContent;", "_avito_position-in-search_stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class Content implements NextPageLoaded, TrackableContent {

            /* renamed from: b, reason: collision with root package name */
            @k
            public final d.b f221507b;

            /* renamed from: c, reason: collision with root package name */
            @k
            public final String f221508c;

            public Content(@k d.b bVar) {
                this.f221507b = bVar;
                PositionInSearchPerfScreen.f221325d.getClass();
                this.f221508c = PositionInSearchPerfScreen.f221328g;
            }

            @Override // com.avito.android.analytics.screens.mvi.s
            @k
            /* renamed from: d, reason: from getter */
            public final String getF174588d() {
                return this.f221508c;
            }

            @Override // com.avito.android.analytics.screens.mvi.t
            @l
            /* renamed from: e */
            public final String getF303160d() {
                return this.f221508c;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Content) && L.f(this.f221507b, ((Content) obj).f221507b);
            }

            public final int hashCode() {
                return this.f221507b.hashCode();
            }

            @k
            public final String toString() {
                return "Content(response=" + this.f221507b + ')';
            }
        }

        /* compiled from: PositionInSearchInternalAction.kt */
        @P
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/position_in_search/stats/screen/position_in_search/mvi/entity/PositionInSearchInternalAction$NextPageLoaded$Error;", "Lcom/avito/android/position_in_search/stats/screen/position_in_search/mvi/entity/PositionInSearchInternalAction$NextPageLoaded;", "Lcom/avito/android/analytics/screens/mvi/TrackableError;", "_avito_position-in-search_stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class Error implements NextPageLoaded, TrackableError {

            /* renamed from: b, reason: collision with root package name */
            @k
            public final ApiException f221509b;

            /* renamed from: c, reason: collision with root package name */
            @k
            public final String f221510c;

            /* renamed from: d, reason: collision with root package name */
            @k
            public final J.a f221511d;

            public Error(@k ApiException apiException) {
                this.f221509b = apiException;
                PositionInSearchPerfScreen.f221325d.getClass();
                this.f221510c = PositionInSearchPerfScreen.f221328g;
                this.f221511d = new J.a(apiException);
            }

            @Override // com.avito.android.analytics.screens.mvi.s
            @k
            /* renamed from: d, reason: from getter */
            public final String getF174588d() {
                return this.f221510c;
            }

            @Override // com.avito.android.analytics.screens.mvi.t
            @l
            /* renamed from: e */
            public final String getF303160d() {
                return this.f221510c;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Error) && this.f221509b.equals(((Error) obj).f221509b);
            }

            @Override // com.avito.android.analytics.screens.mvi.TrackableError
            @k
            /* renamed from: g, reason: from getter */
            public final J.a getF174580c() {
                return this.f221511d;
            }

            public final int hashCode() {
                return this.f221509b.hashCode();
            }

            @k
            public final String toString() {
                return AK.c.q(new StringBuilder("Error(error="), this.f221509b, ')');
            }
        }

        /* compiled from: PositionInSearchInternalAction.kt */
        @P
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/position_in_search/stats/screen/position_in_search/mvi/entity/PositionInSearchInternalAction$NextPageLoaded$Loading;", "Lcom/avito/android/position_in_search/stats/screen/position_in_search/mvi/entity/PositionInSearchInternalAction$NextPageLoaded;", "Lcom/avito/android/analytics/screens/mvi/TrackableLoadingStarted;", "<init>", "()V", "_avito_position-in-search_stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class Loading extends TrackableLoadingStarted implements NextPageLoaded {

            /* renamed from: d, reason: collision with root package name */
            @k
            public final String f221512d;

            public Loading() {
                PositionInSearchPerfScreen.f221325d.getClass();
                this.f221512d = PositionInSearchPerfScreen.f221328g;
            }

            @Override // com.avito.android.analytics.screens.mvi.TrackableLoadingStarted, com.avito.android.analytics.screens.mvi.s
            @k
            /* renamed from: d, reason: from getter */
            public final String getF174588d() {
                return this.f221512d;
            }
        }
    }

    /* compiled from: PositionInSearchInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/position_in_search/stats/screen/position_in_search/mvi/entity/PositionInSearchInternalAction$PeriodClicked;", "Lcom/avito/android/position_in_search/stats/screen/position_in_search/mvi/entity/PositionInSearchInternalAction;", "_avito_position-in-search_stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class PeriodClicked implements PositionInSearchInternalAction {

        /* renamed from: b, reason: collision with root package name */
        public final int f221513b;

        public PeriodClicked(int i12) {
            this.f221513b = i12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof PeriodClicked) && this.f221513b == ((PeriodClicked) obj).f221513b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f221513b);
        }

        @k
        public final String toString() {
            return r.t(new StringBuilder("PeriodClicked(position="), this.f221513b, ')');
        }
    }

    /* compiled from: PositionInSearchInternalAction.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/position_in_search/stats/screen/position_in_search/mvi/entity/PositionInSearchInternalAction$PeriodInfo;", "Lcom/avito/android/position_in_search/stats/screen/position_in_search/mvi/entity/PositionInSearchInternalAction;", "Content", "Error", "Loading", "Lcom/avito/android/position_in_search/stats/screen/position_in_search/mvi/entity/PositionInSearchInternalAction$PeriodInfo$Content;", "Lcom/avito/android/position_in_search/stats/screen/position_in_search/mvi/entity/PositionInSearchInternalAction$PeriodInfo$Error;", "Lcom/avito/android/position_in_search/stats/screen/position_in_search/mvi/entity/PositionInSearchInternalAction$PeriodInfo$Loading;", "_avito_position-in-search_stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface PeriodInfo extends PositionInSearchInternalAction {

        /* compiled from: PositionInSearchInternalAction.kt */
        @P
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/position_in_search/stats/screen/position_in_search/mvi/entity/PositionInSearchInternalAction$PeriodInfo$Content;", "Lcom/avito/android/position_in_search/stats/screen/position_in_search/mvi/entity/PositionInSearchInternalAction$PeriodInfo;", "Lcom/avito/android/analytics/screens/mvi/TrackableContent;", "_avito_position-in-search_stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class Content implements PeriodInfo, TrackableContent {

            /* renamed from: b, reason: collision with root package name */
            @k
            public final d.a f221514b;

            /* renamed from: c, reason: collision with root package name */
            @k
            public final String f221515c;

            public Content(@k d.a aVar) {
                this.f221514b = aVar;
                PositionInSearchPerfScreen.f221325d.getClass();
                this.f221515c = PositionInSearchPerfScreen.f221327f;
            }

            @Override // com.avito.android.analytics.screens.mvi.s
            @k
            /* renamed from: d, reason: from getter */
            public final String getF174588d() {
                return this.f221515c;
            }

            @Override // com.avito.android.analytics.screens.mvi.t
            @l
            /* renamed from: e */
            public final String getF303160d() {
                return this.f221515c;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Content) && L.f(this.f221514b, ((Content) obj).f221514b);
            }

            public final int hashCode() {
                return this.f221514b.hashCode();
            }

            @k
            public final String toString() {
                return "Content(response=" + this.f221514b + ')';
            }
        }

        /* compiled from: PositionInSearchInternalAction.kt */
        @P
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/position_in_search/stats/screen/position_in_search/mvi/entity/PositionInSearchInternalAction$PeriodInfo$Error;", "Lcom/avito/android/position_in_search/stats/screen/position_in_search/mvi/entity/PositionInSearchInternalAction$PeriodInfo;", "Lcom/avito/android/analytics/screens/mvi/TrackableError;", "_avito_position-in-search_stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class Error implements PeriodInfo, TrackableError {

            /* renamed from: b, reason: collision with root package name */
            @k
            public final ApiException f221516b;

            /* renamed from: c, reason: collision with root package name */
            @k
            public final String f221517c;

            /* renamed from: d, reason: collision with root package name */
            @k
            public final J.a f221518d;

            public Error(@k ApiException apiException) {
                this.f221516b = apiException;
                PositionInSearchPerfScreen.f221325d.getClass();
                this.f221517c = PositionInSearchPerfScreen.f221327f;
                this.f221518d = new J.a(apiException);
            }

            @Override // com.avito.android.analytics.screens.mvi.s
            @k
            /* renamed from: d, reason: from getter */
            public final String getF174588d() {
                return this.f221517c;
            }

            @Override // com.avito.android.analytics.screens.mvi.t
            @l
            /* renamed from: e */
            public final String getF303160d() {
                return this.f221517c;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Error) && this.f221516b.equals(((Error) obj).f221516b);
            }

            @Override // com.avito.android.analytics.screens.mvi.TrackableError
            @k
            /* renamed from: g, reason: from getter */
            public final J.a getF174580c() {
                return this.f221518d;
            }

            public final int hashCode() {
                return this.f221516b.hashCode();
            }

            @k
            public final String toString() {
                return AK.c.q(new StringBuilder("Error(error="), this.f221516b, ')');
            }
        }

        /* compiled from: PositionInSearchInternalAction.kt */
        @P
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/position_in_search/stats/screen/position_in_search/mvi/entity/PositionInSearchInternalAction$PeriodInfo$Loading;", "Lcom/avito/android/position_in_search/stats/screen/position_in_search/mvi/entity/PositionInSearchInternalAction$PeriodInfo;", "Lcom/avito/android/analytics/screens/mvi/TrackableLoadingStarted;", "<init>", "()V", "_avito_position-in-search_stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class Loading extends TrackableLoadingStarted implements PeriodInfo {

            /* renamed from: d, reason: collision with root package name */
            @k
            public final String f221519d;

            public Loading() {
                PositionInSearchPerfScreen.f221325d.getClass();
                this.f221519d = PositionInSearchPerfScreen.f221327f;
            }

            @Override // com.avito.android.analytics.screens.mvi.TrackableLoadingStarted, com.avito.android.analytics.screens.mvi.s
            @k
            /* renamed from: d, reason: from getter */
            public final String getF174588d() {
                return this.f221519d;
            }
        }
    }

    /* compiled from: PositionInSearchInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/position_in_search/stats/screen/position_in_search/mvi/entity/PositionInSearchInternalAction$ShowMessage;", "Lcom/avito/android/position_in_search/stats/screen/position_in_search/mvi/entity/PositionInSearchInternalAction;", "_avito_position-in-search_stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ShowMessage implements PositionInSearchInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f221520b;

        public ShowMessage(@k String str) {
            this.f221520b = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ShowMessage) && L.f(this.f221520b, ((ShowMessage) obj).f221520b);
        }

        public final int hashCode() {
            return this.f221520b.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("ShowMessage(message="), this.f221520b, ')');
        }
    }
}
