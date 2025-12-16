package com.avito.android.vas_performance.screens.competitive.mvi.entity;

import CL0.c;
import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.runtime.internal.P;
import com.avito.android.actions_sheet.a;
import com.avito.android.analytics.screens.J;
import com.avito.android.analytics.screens.mvi.TrackableContent;
import com.avito.android.analytics.screens.mvi.TrackableError;
import com.avito.android.analytics.screens.mvi.TrackableLoadingStarted;
import com.avito.android.analytics.screens.mvi.n;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.util.ApiException;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: CompetitiveVasV2InternalAction.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\n\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\u0082\u0001\n\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015¨\u0006\u0016"}, d2 = {"Lcom/avito/android/vas_performance/screens/competitive/mvi/entity/CompetitiveVasV2InternalAction;", "Lcom/avito/android/analytics/screens/mvi/n;", "Back", "Content", "Error", "FinishFlow", "GoToNextCard", "GoToPreviousCard", "HandleDeeplink", "Loading", "SelectTab", "SendClickStreamEvent", "Lcom/avito/android/vas_performance/screens/competitive/mvi/entity/CompetitiveVasV2InternalAction$Back;", "Lcom/avito/android/vas_performance/screens/competitive/mvi/entity/CompetitiveVasV2InternalAction$Content;", "Lcom/avito/android/vas_performance/screens/competitive/mvi/entity/CompetitiveVasV2InternalAction$Error;", "Lcom/avito/android/vas_performance/screens/competitive/mvi/entity/CompetitiveVasV2InternalAction$FinishFlow;", "Lcom/avito/android/vas_performance/screens/competitive/mvi/entity/CompetitiveVasV2InternalAction$GoToNextCard;", "Lcom/avito/android/vas_performance/screens/competitive/mvi/entity/CompetitiveVasV2InternalAction$GoToPreviousCard;", "Lcom/avito/android/vas_performance/screens/competitive/mvi/entity/CompetitiveVasV2InternalAction$HandleDeeplink;", "Lcom/avito/android/vas_performance/screens/competitive/mvi/entity/CompetitiveVasV2InternalAction$Loading;", "Lcom/avito/android/vas_performance/screens/competitive/mvi/entity/CompetitiveVasV2InternalAction$SelectTab;", "Lcom/avito/android/vas_performance/screens/competitive/mvi/entity/CompetitiveVasV2InternalAction$SendClickStreamEvent;", "_avito_vas-performance_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public interface CompetitiveVasV2InternalAction extends n {

    /* compiled from: CompetitiveVasV2InternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/vas_performance/screens/competitive/mvi/entity/CompetitiveVasV2InternalAction$Back;", "Lcom/avito/android/vas_performance/screens/competitive/mvi/entity/CompetitiveVasV2InternalAction;", "<init>", "()V", "_avito_vas-performance_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Back implements CompetitiveVasV2InternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final Back f320443b = new Back();

        private Back() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof Back);
        }

        public final int hashCode() {
            return -1553463210;
        }

        @k
        public final String toString() {
            return "Back";
        }
    }

    /* compiled from: CompetitiveVasV2InternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/vas_performance/screens/competitive/mvi/entity/CompetitiveVasV2InternalAction$Content;", "Lcom/avito/android/vas_performance/screens/competitive/mvi/entity/CompetitiveVasV2InternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableContent;", "_avito_vas-performance_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Content implements CompetitiveVasV2InternalAction, TrackableContent {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final c f320444b;

        public Content(@k c cVar) {
            this.f320444b = cVar;
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @l
        /* renamed from: d */
        public final String getF288444d() {
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
            return (obj instanceof Content) && L.f(this.f320444b, ((Content) obj).f320444b);
        }

        public final int hashCode() {
            return this.f320444b.hashCode();
        }

        @k
        public final String toString() {
            return "Content(data=" + this.f320444b + ')';
        }
    }

    /* compiled from: CompetitiveVasV2InternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/vas_performance/screens/competitive/mvi/entity/CompetitiveVasV2InternalAction$Error;", "Lcom/avito/android/vas_performance/screens/competitive/mvi/entity/CompetitiveVasV2InternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableError;", "_avito_vas-performance_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Error implements CompetitiveVasV2InternalAction, TrackableError {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final ApiException f320445b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final J.a f320446c;

        public Error(@k ApiException apiException) {
            this.f320445b = apiException;
            this.f320446c = new J.a(apiException);
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @l
        /* renamed from: d */
        public final String getF288444d() {
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
            return (obj instanceof Error) && this.f320445b.equals(((Error) obj).f320445b);
        }

        @Override // com.avito.android.analytics.screens.mvi.TrackableError
        @k
        /* renamed from: g, reason: from getter */
        public final J.a getF296211c() {
            return this.f320446c;
        }

        public final int hashCode() {
            return this.f320445b.hashCode();
        }

        @k
        public final String toString() {
            return AK.c.q(new StringBuilder("Error(error="), this.f320445b, ')');
        }
    }

    /* compiled from: CompetitiveVasV2InternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/vas_performance/screens/competitive/mvi/entity/CompetitiveVasV2InternalAction$FinishFlow;", "Lcom/avito/android/vas_performance/screens/competitive/mvi/entity/CompetitiveVasV2InternalAction;", "<init>", "()V", "_avito_vas-performance_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class FinishFlow implements CompetitiveVasV2InternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final FinishFlow f320447b = new FinishFlow();

        private FinishFlow() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof FinishFlow);
        }

        public final int hashCode() {
            return -1227098992;
        }

        @k
        public final String toString() {
            return "FinishFlow";
        }
    }

    /* compiled from: CompetitiveVasV2InternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/vas_performance/screens/competitive/mvi/entity/CompetitiveVasV2InternalAction$GoToNextCard;", "Lcom/avito/android/vas_performance/screens/competitive/mvi/entity/CompetitiveVasV2InternalAction;", "<init>", "()V", "_avito_vas-performance_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class GoToNextCard implements CompetitiveVasV2InternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final GoToNextCard f320448b = new GoToNextCard();

        private GoToNextCard() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof GoToNextCard);
        }

        public final int hashCode() {
            return 1381276597;
        }

        @k
        public final String toString() {
            return "GoToNextCard";
        }
    }

    /* compiled from: CompetitiveVasV2InternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/vas_performance/screens/competitive/mvi/entity/CompetitiveVasV2InternalAction$GoToPreviousCard;", "Lcom/avito/android/vas_performance/screens/competitive/mvi/entity/CompetitiveVasV2InternalAction;", "<init>", "()V", "_avito_vas-performance_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class GoToPreviousCard implements CompetitiveVasV2InternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final GoToPreviousCard f320449b = new GoToPreviousCard();

        private GoToPreviousCard() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof GoToPreviousCard);
        }

        public final int hashCode() {
            return -1766764359;
        }

        @k
        public final String toString() {
            return "GoToPreviousCard";
        }
    }

    /* compiled from: CompetitiveVasV2InternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/vas_performance/screens/competitive/mvi/entity/CompetitiveVasV2InternalAction$HandleDeeplink;", "Lcom/avito/android/vas_performance/screens/competitive/mvi/entity/CompetitiveVasV2InternalAction;", "_avito_vas-performance_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class HandleDeeplink implements CompetitiveVasV2InternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final DeepLink f320450b;

        public HandleDeeplink(@k DeepLink deepLink) {
            this.f320450b = deepLink;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof HandleDeeplink) && L.f(this.f320450b, ((HandleDeeplink) obj).f320450b);
        }

        public final int hashCode() {
            return this.f320450b.hashCode();
        }

        @k
        public final String toString() {
            return a.v(new StringBuilder("HandleDeeplink(deeplink="), this.f320450b, ')');
        }
    }

    /* compiled from: CompetitiveVasV2InternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/vas_performance/screens/competitive/mvi/entity/CompetitiveVasV2InternalAction$Loading;", "Lcom/avito/android/analytics/screens/mvi/TrackableLoadingStarted;", "Lcom/avito/android/vas_performance/screens/competitive/mvi/entity/CompetitiveVasV2InternalAction;", "()V", "_avito_vas-performance_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Loading extends TrackableLoadingStarted implements CompetitiveVasV2InternalAction {
    }

    /* compiled from: CompetitiveVasV2InternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/vas_performance/screens/competitive/mvi/entity/CompetitiveVasV2InternalAction$SelectTab;", "Lcom/avito/android/vas_performance/screens/competitive/mvi/entity/CompetitiveVasV2InternalAction;", "_avito_vas-performance_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class SelectTab implements CompetitiveVasV2InternalAction {

        /* renamed from: b, reason: collision with root package name */
        public final int f320451b;

        public SelectTab(int i12) {
            this.f320451b = i12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof SelectTab) && this.f320451b == ((SelectTab) obj).f320451b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f320451b);
        }

        @k
        public final String toString() {
            return r.t(new StringBuilder("SelectTab(index="), this.f320451b, ')');
        }
    }

    /* compiled from: CompetitiveVasV2InternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/vas_performance/screens/competitive/mvi/entity/CompetitiveVasV2InternalAction$SendClickStreamEvent;", "Lcom/avito/android/vas_performance/screens/competitive/mvi/entity/CompetitiveVasV2InternalAction;", "<init>", "()V", "_avito_vas-performance_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class SendClickStreamEvent implements CompetitiveVasV2InternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final SendClickStreamEvent f320452b = new SendClickStreamEvent();

        private SendClickStreamEvent() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof SendClickStreamEvent);
        }

        public final int hashCode() {
            return -569390743;
        }

        @k
        public final String toString() {
            return "SendClickStreamEvent";
        }
    }
}
