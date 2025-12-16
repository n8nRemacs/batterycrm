package com.avito.android.vas_performance.screens.stickers.edit.mvi.entity;

import GL0.c;
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
import com.avito.android.util.ApiException;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: StickersEditInternalAction.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\n\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\u0082\u0001\n\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015¨\u0006\u0016"}, d2 = {"Lcom/avito/android/vas_performance/screens/stickers/edit/mvi/entity/StickersEditInternalAction;", "Lcom/avito/android/analytics/screens/mvi/n;", "Back", "ChangeButtonLoadingState", "Content", "Error", "FinishFlow", "HandleDeeplink", "IncrementContinueClickCounter", "Loading", "ShowAlertMessage", "StickerSelected", "Lcom/avito/android/vas_performance/screens/stickers/edit/mvi/entity/StickersEditInternalAction$Back;", "Lcom/avito/android/vas_performance/screens/stickers/edit/mvi/entity/StickersEditInternalAction$ChangeButtonLoadingState;", "Lcom/avito/android/vas_performance/screens/stickers/edit/mvi/entity/StickersEditInternalAction$Content;", "Lcom/avito/android/vas_performance/screens/stickers/edit/mvi/entity/StickersEditInternalAction$Error;", "Lcom/avito/android/vas_performance/screens/stickers/edit/mvi/entity/StickersEditInternalAction$FinishFlow;", "Lcom/avito/android/vas_performance/screens/stickers/edit/mvi/entity/StickersEditInternalAction$HandleDeeplink;", "Lcom/avito/android/vas_performance/screens/stickers/edit/mvi/entity/StickersEditInternalAction$IncrementContinueClickCounter;", "Lcom/avito/android/vas_performance/screens/stickers/edit/mvi/entity/StickersEditInternalAction$Loading;", "Lcom/avito/android/vas_performance/screens/stickers/edit/mvi/entity/StickersEditInternalAction$ShowAlertMessage;", "Lcom/avito/android/vas_performance/screens/stickers/edit/mvi/entity/StickersEditInternalAction$StickerSelected;", "_avito_vas-performance_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public interface StickersEditInternalAction extends n {

    /* compiled from: StickersEditInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/vas_performance/screens/stickers/edit/mvi/entity/StickersEditInternalAction$Back;", "Lcom/avito/android/vas_performance/screens/stickers/edit/mvi/entity/StickersEditInternalAction;", "<init>", "()V", "_avito_vas-performance_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Back implements StickersEditInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final Back f320803b = new Back();

        private Back() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof Back);
        }

        public final int hashCode() {
            return 1233794104;
        }

        @k
        public final String toString() {
            return "Back";
        }
    }

    /* compiled from: StickersEditInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/vas_performance/screens/stickers/edit/mvi/entity/StickersEditInternalAction$ChangeButtonLoadingState;", "Lcom/avito/android/vas_performance/screens/stickers/edit/mvi/entity/StickersEditInternalAction;", "_avito_vas-performance_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ChangeButtonLoadingState implements StickersEditInternalAction {

        /* renamed from: b, reason: collision with root package name */
        public final boolean f320804b;

        public ChangeButtonLoadingState(boolean z12) {
            this.f320804b = z12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ChangeButtonLoadingState) && this.f320804b == ((ChangeButtonLoadingState) obj).f320804b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f320804b);
        }

        @k
        public final String toString() {
            return r.x(new StringBuilder("ChangeButtonLoadingState(isLoading="), this.f320804b, ')');
        }
    }

    /* compiled from: StickersEditInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/vas_performance/screens/stickers/edit/mvi/entity/StickersEditInternalAction$Content;", "Lcom/avito/android/vas_performance/screens/stickers/edit/mvi/entity/StickersEditInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableContent;", "_avito_vas-performance_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Content implements StickersEditInternalAction, TrackableContent {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final c f320805b;

        public Content(@k c cVar) {
            this.f320805b = cVar;
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @l
        /* renamed from: d */
        public final String getF294761d() {
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
            return (obj instanceof Content) && L.f(this.f320805b, ((Content) obj).f320805b);
        }

        public final int hashCode() {
            return this.f320805b.hashCode();
        }

        @k
        public final String toString() {
            return "Content(data=" + this.f320805b + ')';
        }
    }

    /* compiled from: StickersEditInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/vas_performance/screens/stickers/edit/mvi/entity/StickersEditInternalAction$Error;", "Lcom/avito/android/vas_performance/screens/stickers/edit/mvi/entity/StickersEditInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableError;", "_avito_vas-performance_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Error implements StickersEditInternalAction, TrackableError {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final ApiException f320806b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final J.a f320807c;

        public Error(@k ApiException apiException) {
            this.f320806b = apiException;
            this.f320807c = new J.a(apiException);
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @l
        /* renamed from: d */
        public final String getF294761d() {
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
            return (obj instanceof Error) && this.f320806b.equals(((Error) obj).f320806b);
        }

        @Override // com.avito.android.analytics.screens.mvi.TrackableError
        @k
        /* renamed from: g, reason: from getter */
        public final J.a getF297897c() {
            return this.f320807c;
        }

        public final int hashCode() {
            return this.f320806b.hashCode();
        }

        @k
        public final String toString() {
            return AK.c.q(new StringBuilder("Error(error="), this.f320806b, ')');
        }
    }

    /* compiled from: StickersEditInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/vas_performance/screens/stickers/edit/mvi/entity/StickersEditInternalAction$FinishFlow;", "Lcom/avito/android/vas_performance/screens/stickers/edit/mvi/entity/StickersEditInternalAction;", "<init>", "()V", "_avito_vas-performance_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class FinishFlow implements StickersEditInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final FinishFlow f320808b = new FinishFlow();

        private FinishFlow() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof FinishFlow);
        }

        public final int hashCode() {
            return 447885042;
        }

        @k
        public final String toString() {
            return "FinishFlow";
        }
    }

    /* compiled from: StickersEditInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/vas_performance/screens/stickers/edit/mvi/entity/StickersEditInternalAction$HandleDeeplink;", "Lcom/avito/android/vas_performance/screens/stickers/edit/mvi/entity/StickersEditInternalAction;", "_avito_vas-performance_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class HandleDeeplink implements StickersEditInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final DeepLink f320809b;

        public HandleDeeplink(@k DeepLink deepLink) {
            this.f320809b = deepLink;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof HandleDeeplink) && L.f(this.f320809b, ((HandleDeeplink) obj).f320809b);
        }

        public final int hashCode() {
            return this.f320809b.hashCode();
        }

        @k
        public final String toString() {
            return a.v(new StringBuilder("HandleDeeplink(deeplink="), this.f320809b, ')');
        }
    }

    /* compiled from: StickersEditInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/vas_performance/screens/stickers/edit/mvi/entity/StickersEditInternalAction$IncrementContinueClickCounter;", "Lcom/avito/android/vas_performance/screens/stickers/edit/mvi/entity/StickersEditInternalAction;", "<init>", "()V", "_avito_vas-performance_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class IncrementContinueClickCounter implements StickersEditInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final IncrementContinueClickCounter f320810b = new IncrementContinueClickCounter();

        private IncrementContinueClickCounter() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof IncrementContinueClickCounter);
        }

        public final int hashCode() {
            return 2147143033;
        }

        @k
        public final String toString() {
            return "IncrementContinueClickCounter";
        }
    }

    /* compiled from: StickersEditInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/vas_performance/screens/stickers/edit/mvi/entity/StickersEditInternalAction$Loading;", "Lcom/avito/android/vas_performance/screens/stickers/edit/mvi/entity/StickersEditInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableLoadingStarted;", "()V", "_avito_vas-performance_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Loading extends TrackableLoadingStarted implements StickersEditInternalAction {
    }

    /* compiled from: StickersEditInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/vas_performance/screens/stickers/edit/mvi/entity/StickersEditInternalAction$ShowAlertMessage;", "Lcom/avito/android/vas_performance/screens/stickers/edit/mvi/entity/StickersEditInternalAction;", "_avito_vas-performance_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ShowAlertMessage implements StickersEditInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f320811b;

        public ShowAlertMessage(@k String str) {
            this.f320811b = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ShowAlertMessage) && L.f(this.f320811b, ((ShowAlertMessage) obj).f320811b);
        }

        public final int hashCode() {
            return this.f320811b.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("ShowAlertMessage(message="), this.f320811b, ')');
        }
    }

    /* compiled from: StickersEditInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/vas_performance/screens/stickers/edit/mvi/entity/StickersEditInternalAction$StickerSelected;", "Lcom/avito/android/vas_performance/screens/stickers/edit/mvi/entity/StickersEditInternalAction;", "_avito_vas-performance_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class StickerSelected implements StickersEditInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f320812b;

        public StickerSelected(@k String str) {
            this.f320812b = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof StickerSelected) && L.f(this.f320812b, ((StickerSelected) obj).f320812b);
        }

        public final int hashCode() {
            return this.f320812b.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("StickerSelected(stickerId="), this.f320812b, ')');
        }
    }
}
