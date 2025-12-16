package com.avito.android.competitor_analytics.mvi.entity;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.screens.J;
import com.avito.android.analytics.screens.mvi.TrackableContent;
import com.avito.android.analytics.screens.mvi.TrackableError;
import com.avito.android.analytics.screens.mvi.TrackableLoadingStarted;
import com.avito.android.analytics.screens.mvi.n;
import com.avito.android.competitor_analytics.domain.model.StateType;
import com.avito.android.competitor_analytics.mvi.entity.b;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.util.ApiException;
import cr.C39401b;
import dr.C39787b;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: CompetitorAnalyticsInternalAction.kt */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0012\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0082\u0001\u0012\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#$%¨\u0006&"}, d2 = {"Lcom/avito/android/competitor_analytics/mvi/entity/CompetitorAnalyticsInternalAction;", "Lcom/avito/android/analytics/screens/mvi/n;", "Back", "ChartMetricClicked", "Close", "CloseBanner", "Content", "ContentV2", "Error", "HandleDeeplink", "Loading", "PeriodClicked", "ShowMessage", "SuggestsBlockClicked", "TrackChangePeriodEvent", "TrackClickInChartEvent", "TrackClickOnChartMetricEvent", "TrackClickSuggestsBlockEvent", "TrackShowChartEvent", "TrackShowCompetitorAnalyticsEvent", "Lcom/avito/android/competitor_analytics/mvi/entity/CompetitorAnalyticsInternalAction$Back;", "Lcom/avito/android/competitor_analytics/mvi/entity/CompetitorAnalyticsInternalAction$ChartMetricClicked;", "Lcom/avito/android/competitor_analytics/mvi/entity/CompetitorAnalyticsInternalAction$Close;", "Lcom/avito/android/competitor_analytics/mvi/entity/CompetitorAnalyticsInternalAction$CloseBanner;", "Lcom/avito/android/competitor_analytics/mvi/entity/CompetitorAnalyticsInternalAction$Content;", "Lcom/avito/android/competitor_analytics/mvi/entity/CompetitorAnalyticsInternalAction$ContentV2;", "Lcom/avito/android/competitor_analytics/mvi/entity/CompetitorAnalyticsInternalAction$Error;", "Lcom/avito/android/competitor_analytics/mvi/entity/CompetitorAnalyticsInternalAction$HandleDeeplink;", "Lcom/avito/android/competitor_analytics/mvi/entity/CompetitorAnalyticsInternalAction$Loading;", "Lcom/avito/android/competitor_analytics/mvi/entity/CompetitorAnalyticsInternalAction$PeriodClicked;", "Lcom/avito/android/competitor_analytics/mvi/entity/CompetitorAnalyticsInternalAction$ShowMessage;", "Lcom/avito/android/competitor_analytics/mvi/entity/CompetitorAnalyticsInternalAction$SuggestsBlockClicked;", "Lcom/avito/android/competitor_analytics/mvi/entity/CompetitorAnalyticsInternalAction$TrackChangePeriodEvent;", "Lcom/avito/android/competitor_analytics/mvi/entity/CompetitorAnalyticsInternalAction$TrackClickInChartEvent;", "Lcom/avito/android/competitor_analytics/mvi/entity/CompetitorAnalyticsInternalAction$TrackClickOnChartMetricEvent;", "Lcom/avito/android/competitor_analytics/mvi/entity/CompetitorAnalyticsInternalAction$TrackClickSuggestsBlockEvent;", "Lcom/avito/android/competitor_analytics/mvi/entity/CompetitorAnalyticsInternalAction$TrackShowChartEvent;", "Lcom/avito/android/competitor_analytics/mvi/entity/CompetitorAnalyticsInternalAction$TrackShowCompetitorAnalyticsEvent;", "_avito_competitor-analytics_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public interface CompetitorAnalyticsInternalAction extends n {

    /* compiled from: CompetitorAnalyticsInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/competitor_analytics/mvi/entity/CompetitorAnalyticsInternalAction$Back;", "Lcom/avito/android/competitor_analytics/mvi/entity/CompetitorAnalyticsInternalAction;", "<init>", "()V", "_avito_competitor-analytics_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Back implements CompetitorAnalyticsInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final Back f124433b = new Back();

        private Back() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof Back);
        }

        public final int hashCode() {
            return 463057173;
        }

        @k
        public final String toString() {
            return "Back";
        }
    }

    /* compiled from: CompetitorAnalyticsInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/competitor_analytics/mvi/entity/CompetitorAnalyticsInternalAction$ChartMetricClicked;", "Lcom/avito/android/competitor_analytics/mvi/entity/CompetitorAnalyticsInternalAction;", "_avito_competitor-analytics_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ChartMetricClicked implements CompetitorAnalyticsInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final b.g f124434b;

        public ChartMetricClicked(@k b.g gVar) {
            this.f124434b = gVar;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ChartMetricClicked) && L.f(this.f124434b, ((ChartMetricClicked) obj).f124434b);
        }

        public final int hashCode() {
            return this.f124434b.hashCode();
        }

        @k
        public final String toString() {
            return "ChartMetricClicked(metrics=" + this.f124434b + ')';
        }
    }

    /* compiled from: CompetitorAnalyticsInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/competitor_analytics/mvi/entity/CompetitorAnalyticsInternalAction$Close;", "Lcom/avito/android/competitor_analytics/mvi/entity/CompetitorAnalyticsInternalAction;", "<init>", "()V", "_avito_competitor-analytics_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Close implements CompetitorAnalyticsInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final Close f124435b = new Close();

        private Close() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof Close);
        }

        public final int hashCode() {
            return 1471133578;
        }

        @k
        public final String toString() {
            return "Close";
        }
    }

    /* compiled from: CompetitorAnalyticsInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/competitor_analytics/mvi/entity/CompetitorAnalyticsInternalAction$CloseBanner;", "Lcom/avito/android/competitor_analytics/mvi/entity/CompetitorAnalyticsInternalAction;", "<init>", "()V", "_avito_competitor-analytics_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class CloseBanner implements CompetitorAnalyticsInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final CloseBanner f124436b = new CloseBanner();

        private CloseBanner() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof CloseBanner);
        }

        public final int hashCode() {
            return 655414102;
        }

        @k
        public final String toString() {
            return "CloseBanner";
        }
    }

    /* compiled from: CompetitorAnalyticsInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/competitor_analytics/mvi/entity/CompetitorAnalyticsInternalAction$Content;", "Lcom/avito/android/competitor_analytics/mvi/entity/CompetitorAnalyticsInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableContent;", "_avito_competitor-analytics_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Content implements CompetitorAnalyticsInternalAction, TrackableContent {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final C39401b f124437b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final StateType f124438c;

        public Content(@k C39401b c39401b, @k StateType stateType) {
            this.f124437b = c39401b;
            this.f124438c = stateType;
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @l
        /* renamed from: d */
        public final String getF111994d() {
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
            if (!(obj instanceof Content)) {
                return false;
            }
            Content content = (Content) obj;
            return L.f(this.f124437b, content.f124437b) && this.f124438c == content.f124438c;
        }

        public final int hashCode() {
            return this.f124438c.hashCode() + (this.f124437b.hashCode() * 31);
        }

        @k
        public final String toString() {
            return "Content(response=" + this.f124437b + ", stateType=" + this.f124438c + ')';
        }
    }

    /* compiled from: CompetitorAnalyticsInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/competitor_analytics/mvi/entity/CompetitorAnalyticsInternalAction$ContentV2;", "Lcom/avito/android/competitor_analytics/mvi/entity/CompetitorAnalyticsInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableContent;", "_avito_competitor-analytics_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ContentV2 implements CompetitorAnalyticsInternalAction, TrackableContent {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final C39787b f124439b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final StateType f124440c;

        public ContentV2(@k C39787b c39787b, @k StateType stateType) {
            this.f124439b = c39787b;
            this.f124440c = stateType;
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @l
        /* renamed from: d */
        public final String getF111994d() {
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
            if (!(obj instanceof ContentV2)) {
                return false;
            }
            ContentV2 contentV2 = (ContentV2) obj;
            return L.f(this.f124439b, contentV2.f124439b) && this.f124440c == contentV2.f124440c;
        }

        public final int hashCode() {
            return this.f124440c.hashCode() + (this.f124439b.hashCode() * 31);
        }

        @k
        public final String toString() {
            return "ContentV2(response=" + this.f124439b + ", stateType=" + this.f124440c + ')';
        }
    }

    /* compiled from: CompetitorAnalyticsInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/competitor_analytics/mvi/entity/CompetitorAnalyticsInternalAction$Error;", "Lcom/avito/android/competitor_analytics/mvi/entity/CompetitorAnalyticsInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableError;", "_avito_competitor-analytics_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Error implements CompetitorAnalyticsInternalAction, TrackableError {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final ApiException f124441b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f124442c;

        /* renamed from: d, reason: collision with root package name */
        @k
        public final J.a f124443d;

        public Error(@k ApiException apiException, boolean z12) {
            this.f124441b = apiException;
            this.f124442c = z12;
            this.f124443d = new J.a(apiException);
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @l
        /* renamed from: d */
        public final String getF111994d() {
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
            if (!(obj instanceof Error)) {
                return false;
            }
            Error error = (Error) obj;
            return this.f124441b.equals(error.f124441b) && this.f124442c == error.f124442c;
        }

        @Override // com.avito.android.analytics.screens.mvi.TrackableError
        @k
        /* renamed from: g, reason: from getter */
        public final J.a getF275984c() {
            return this.f124443d;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f124442c) + (this.f124441b.hashCode() * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Error(error=");
            sb2.append(this.f124441b);
            sb2.append(", isMainError=");
            return r.x(sb2, this.f124442c, ')');
        }
    }

    /* compiled from: CompetitorAnalyticsInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/competitor_analytics/mvi/entity/CompetitorAnalyticsInternalAction$HandleDeeplink;", "Lcom/avito/android/competitor_analytics/mvi/entity/CompetitorAnalyticsInternalAction;", "_avito_competitor-analytics_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class HandleDeeplink implements CompetitorAnalyticsInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final DeepLink f124444b;

        public HandleDeeplink(@k DeepLink deepLink) {
            this.f124444b = deepLink;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof HandleDeeplink) && L.f(this.f124444b, ((HandleDeeplink) obj).f124444b);
        }

        public final int hashCode() {
            return this.f124444b.hashCode();
        }

        @k
        public final String toString() {
            return com.avito.android.actions_sheet.a.v(new StringBuilder("HandleDeeplink(deeplink="), this.f124444b, ')');
        }
    }

    /* compiled from: CompetitorAnalyticsInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/competitor_analytics/mvi/entity/CompetitorAnalyticsInternalAction$Loading;", "Lcom/avito/android/competitor_analytics/mvi/entity/CompetitorAnalyticsInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableLoadingStarted;", "_avito_competitor-analytics_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Loading extends TrackableLoadingStarted implements CompetitorAnalyticsInternalAction {

        /* renamed from: d, reason: collision with root package name */
        public final boolean f124445d;

        public Loading(boolean z12) {
            this.f124445d = z12;
        }

        @Override // com.avito.android.analytics.screens.mvi.TrackableLoadingStarted
        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Loading) && this.f124445d == ((Loading) obj).f124445d;
        }

        @Override // com.avito.android.analytics.screens.mvi.TrackableLoadingStarted
        public final int hashCode() {
            return Boolean.hashCode(this.f124445d);
        }

        @k
        public final String toString() {
            return r.x(new StringBuilder("Loading(isMainLoading="), this.f124445d, ')');
        }
    }

    /* compiled from: CompetitorAnalyticsInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/competitor_analytics/mvi/entity/CompetitorAnalyticsInternalAction$PeriodClicked;", "Lcom/avito/android/competitor_analytics/mvi/entity/CompetitorAnalyticsInternalAction;", "_avito_competitor-analytics_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class PeriodClicked implements CompetitorAnalyticsInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final b.h.a f124446b;

        /* renamed from: c, reason: collision with root package name */
        public final int f124447c;

        public PeriodClicked(@k b.h.a aVar, int i12) {
            this.f124446b = aVar;
            this.f124447c = i12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PeriodClicked)) {
                return false;
            }
            PeriodClicked periodClicked = (PeriodClicked) obj;
            return L.f(this.f124446b, periodClicked.f124446b) && this.f124447c == periodClicked.f124447c;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f124447c) + (this.f124446b.hashCode() * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("PeriodClicked(period=");
            sb2.append(this.f124446b);
            sb2.append(", position=");
            return r.t(sb2, this.f124447c, ')');
        }
    }

    /* compiled from: CompetitorAnalyticsInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/competitor_analytics/mvi/entity/CompetitorAnalyticsInternalAction$ShowMessage;", "Lcom/avito/android/competitor_analytics/mvi/entity/CompetitorAnalyticsInternalAction;", "_avito_competitor-analytics_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ShowMessage implements CompetitorAnalyticsInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f124448b;

        public ShowMessage(@k String str) {
            this.f124448b = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ShowMessage) && L.f(this.f124448b, ((ShowMessage) obj).f124448b);
        }

        public final int hashCode() {
            return this.f124448b.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("ShowMessage(message="), this.f124448b, ')');
        }
    }

    /* compiled from: CompetitorAnalyticsInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/competitor_analytics/mvi/entity/CompetitorAnalyticsInternalAction$SuggestsBlockClicked;", "Lcom/avito/android/competitor_analytics/mvi/entity/CompetitorAnalyticsInternalAction;", "_avito_competitor-analytics_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class SuggestsBlockClicked implements CompetitorAnalyticsInternalAction {

        /* renamed from: b, reason: collision with root package name */
        public final boolean f124449b;

        public SuggestsBlockClicked(boolean z12) {
            this.f124449b = z12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof SuggestsBlockClicked) && this.f124449b == ((SuggestsBlockClicked) obj).f124449b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f124449b);
        }

        @k
        public final String toString() {
            return r.x(new StringBuilder("SuggestsBlockClicked(isExpanded="), this.f124449b, ')');
        }
    }

    /* compiled from: CompetitorAnalyticsInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/competitor_analytics/mvi/entity/CompetitorAnalyticsInternalAction$TrackChangePeriodEvent;", "Lcom/avito/android/competitor_analytics/mvi/entity/CompetitorAnalyticsInternalAction;", "_avito_competitor-analytics_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class TrackChangePeriodEvent implements CompetitorAnalyticsInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f124450b;

        public TrackChangePeriodEvent(@k String str) {
            this.f124450b = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof TrackChangePeriodEvent) && L.f(this.f124450b, ((TrackChangePeriodEvent) obj).f124450b);
        }

        public final int hashCode() {
            return this.f124450b.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("TrackChangePeriodEvent(period="), this.f124450b, ')');
        }
    }

    /* compiled from: CompetitorAnalyticsInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/competitor_analytics/mvi/entity/CompetitorAnalyticsInternalAction$TrackClickInChartEvent;", "Lcom/avito/android/competitor_analytics/mvi/entity/CompetitorAnalyticsInternalAction;", "_avito_competitor-analytics_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class TrackClickInChartEvent implements CompetitorAnalyticsInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f124451b;

        public TrackClickInChartEvent(@k String str) {
            this.f124451b = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof TrackClickInChartEvent) && L.f(this.f124451b, ((TrackClickInChartEvent) obj).f124451b);
        }

        public final int hashCode() {
            return this.f124451b.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("TrackClickInChartEvent(slug="), this.f124451b, ')');
        }
    }

    /* compiled from: CompetitorAnalyticsInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/competitor_analytics/mvi/entity/CompetitorAnalyticsInternalAction$TrackClickOnChartMetricEvent;", "Lcom/avito/android/competitor_analytics/mvi/entity/CompetitorAnalyticsInternalAction;", "_avito_competitor-analytics_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class TrackClickOnChartMetricEvent implements CompetitorAnalyticsInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f124452b;

        public TrackClickOnChartMetricEvent(@k String str) {
            this.f124452b = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof TrackClickOnChartMetricEvent) && L.f(this.f124452b, ((TrackClickOnChartMetricEvent) obj).f124452b);
        }

        public final int hashCode() {
            return this.f124452b.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("TrackClickOnChartMetricEvent(slug="), this.f124452b, ')');
        }
    }

    /* compiled from: CompetitorAnalyticsInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/competitor_analytics/mvi/entity/CompetitorAnalyticsInternalAction$TrackClickSuggestsBlockEvent;", "Lcom/avito/android/competitor_analytics/mvi/entity/CompetitorAnalyticsInternalAction;", "_avito_competitor-analytics_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class TrackClickSuggestsBlockEvent implements CompetitorAnalyticsInternalAction {

        /* renamed from: b, reason: collision with root package name */
        public final boolean f124453b;

        public TrackClickSuggestsBlockEvent(boolean z12) {
            this.f124453b = z12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof TrackClickSuggestsBlockEvent) && this.f124453b == ((TrackClickSuggestsBlockEvent) obj).f124453b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f124453b);
        }

        @k
        public final String toString() {
            return r.x(new StringBuilder("TrackClickSuggestsBlockEvent(isExpanded="), this.f124453b, ')');
        }
    }

    /* compiled from: CompetitorAnalyticsInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/competitor_analytics/mvi/entity/CompetitorAnalyticsInternalAction$TrackShowChartEvent;", "Lcom/avito/android/competitor_analytics/mvi/entity/CompetitorAnalyticsInternalAction;", "_avito_competitor-analytics_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class TrackShowChartEvent implements CompetitorAnalyticsInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f124454b;

        public TrackShowChartEvent(@k String str) {
            this.f124454b = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof TrackShowChartEvent) && L.f(this.f124454b, ((TrackShowChartEvent) obj).f124454b);
        }

        public final int hashCode() {
            return this.f124454b.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("TrackShowChartEvent(slug="), this.f124454b, ')');
        }
    }

    /* compiled from: CompetitorAnalyticsInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/competitor_analytics/mvi/entity/CompetitorAnalyticsInternalAction$TrackShowCompetitorAnalyticsEvent;", "Lcom/avito/android/competitor_analytics/mvi/entity/CompetitorAnalyticsInternalAction;", "_avito_competitor-analytics_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class TrackShowCompetitorAnalyticsEvent implements CompetitorAnalyticsInternalAction {

        /* renamed from: b, reason: collision with root package name */
        public final int f124455b;

        public TrackShowCompetitorAnalyticsEvent(int i12) {
            this.f124455b = i12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof TrackShowCompetitorAnalyticsEvent) && this.f124455b == ((TrackShowCompetitorAnalyticsEvent) obj).f124455b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f124455b);
        }

        @k
        public final String toString() {
            return r.t(new StringBuilder("TrackShowCompetitorAnalyticsEvent(suggestsCount="), this.f124455b, ')');
        }
    }
}
