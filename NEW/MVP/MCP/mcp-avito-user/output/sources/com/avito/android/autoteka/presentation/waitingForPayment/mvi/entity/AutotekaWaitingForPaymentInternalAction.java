package com.avito.android.autoteka.presentation.waitingForPayment.mvi.entity;

import AK.c;
import Y61.k;
import Y61.l;
import com.avito.android.actions_sheet.a;
import com.avito.android.analytics.screens.J;
import com.avito.android.analytics.screens.mvi.TrackableContent;
import com.avito.android.analytics.screens.mvi.TrackableError;
import com.avito.android.analytics.screens.mvi.TrackableLoadingStarted;
import com.avito.android.analytics.screens.mvi.n;
import com.avito.android.autoteka.items.waitingForPaymentResponseItem.WaitingForPaymentResponseItem;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.error.ApiError;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: AutotekaWaitingForPaymentInternalAction.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0006\u0002\u0003\u0004\u0005\u0006\u0007\u0082\u0001\u0006\b\t\n\u000b\f\r¨\u0006\u000e"}, d2 = {"Lcom/avito/android/autoteka/presentation/waitingForPayment/mvi/entity/AutotekaWaitingForPaymentInternalAction;", "Lcom/avito/android/analytics/screens/mvi/n;", "CloseScreen", "Error", "Loading", "OpenAuthScreen", "OpenDeepLink", "Response", "Lcom/avito/android/autoteka/presentation/waitingForPayment/mvi/entity/AutotekaWaitingForPaymentInternalAction$CloseScreen;", "Lcom/avito/android/autoteka/presentation/waitingForPayment/mvi/entity/AutotekaWaitingForPaymentInternalAction$Error;", "Lcom/avito/android/autoteka/presentation/waitingForPayment/mvi/entity/AutotekaWaitingForPaymentInternalAction$Loading;", "Lcom/avito/android/autoteka/presentation/waitingForPayment/mvi/entity/AutotekaWaitingForPaymentInternalAction$OpenAuthScreen;", "Lcom/avito/android/autoteka/presentation/waitingForPayment/mvi/entity/AutotekaWaitingForPaymentInternalAction$OpenDeepLink;", "Lcom/avito/android/autoteka/presentation/waitingForPayment/mvi/entity/AutotekaWaitingForPaymentInternalAction$Response;", "_avito_autoteka_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public interface AutotekaWaitingForPaymentInternalAction extends n {

    /* compiled from: AutotekaWaitingForPaymentInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/autoteka/presentation/waitingForPayment/mvi/entity/AutotekaWaitingForPaymentInternalAction$CloseScreen;", "Lcom/avito/android/autoteka/presentation/waitingForPayment/mvi/entity/AutotekaWaitingForPaymentInternalAction;", "<init>", "()V", "_avito_autoteka_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class CloseScreen implements AutotekaWaitingForPaymentInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final CloseScreen f97884b = new CloseScreen();

        private CloseScreen() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof CloseScreen);
        }

        public final int hashCode() {
            return 197203243;
        }

        @k
        public final String toString() {
            return "CloseScreen";
        }
    }

    /* compiled from: AutotekaWaitingForPaymentInternalAction.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/autoteka/presentation/waitingForPayment/mvi/entity/AutotekaWaitingForPaymentInternalAction$Error;", "Lcom/avito/android/autoteka/presentation/waitingForPayment/mvi/entity/AutotekaWaitingForPaymentInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableError;", "_avito_autoteka_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Error implements AutotekaWaitingForPaymentInternalAction, TrackableError {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final ApiError f97885b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final J.a f97886c;

        public Error(@k ApiError apiError) {
            this.f97885b = apiError;
            this.f97886c = new J.a(apiError);
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @l
        /* renamed from: d */
        public final String getF307400d() {
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
            return (obj instanceof Error) && L.f(this.f97885b, ((Error) obj).f97885b);
        }

        @Override // com.avito.android.analytics.screens.mvi.TrackableError
        @k
        /* renamed from: g, reason: from getter */
        public final J.a getF327938c() {
            return this.f97886c;
        }

        public final int hashCode() {
            return this.f97885b.hashCode();
        }

        @k
        public final String toString() {
            return c.n(new StringBuilder("Error(apiError="), this.f97885b, ')');
        }
    }

    /* compiled from: AutotekaWaitingForPaymentInternalAction.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/autoteka/presentation/waitingForPayment/mvi/entity/AutotekaWaitingForPaymentInternalAction$Loading;", "Lcom/avito/android/autoteka/presentation/waitingForPayment/mvi/entity/AutotekaWaitingForPaymentInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableLoadingStarted;", "_avito_autoteka_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Loading extends TrackableLoadingStarted implements AutotekaWaitingForPaymentInternalAction {

        /* renamed from: d, reason: collision with root package name */
        @k
        public final G0 f97887d;

        public Loading() {
            this(null, 1, null);
        }

        @Override // com.avito.android.analytics.screens.mvi.TrackableLoadingStarted
        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Loading) && L.f(this.f97887d, ((Loading) obj).f97887d);
        }

        @Override // com.avito.android.analytics.screens.mvi.TrackableLoadingStarted
        public final int hashCode() {
            return this.f97887d.hashCode();
        }

        @k
        public final String toString() {
            return c.v(new StringBuilder("Loading(stub="), this.f97887d, ')');
        }

        public Loading(G0 g02, int i12, C42822w c42822w) {
            this.f97887d = (i12 & 1) != 0 ? G0.f406611a : g02;
        }
    }

    /* compiled from: AutotekaWaitingForPaymentInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/autoteka/presentation/waitingForPayment/mvi/entity/AutotekaWaitingForPaymentInternalAction$OpenAuthScreen;", "Lcom/avito/android/autoteka/presentation/waitingForPayment/mvi/entity/AutotekaWaitingForPaymentInternalAction;", "<init>", "()V", "_avito_autoteka_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class OpenAuthScreen implements AutotekaWaitingForPaymentInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final OpenAuthScreen f97888b = new OpenAuthScreen();

        private OpenAuthScreen() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof OpenAuthScreen);
        }

        public final int hashCode() {
            return 36724759;
        }

        @k
        public final String toString() {
            return "OpenAuthScreen";
        }
    }

    /* compiled from: AutotekaWaitingForPaymentInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/autoteka/presentation/waitingForPayment/mvi/entity/AutotekaWaitingForPaymentInternalAction$OpenDeepLink;", "Lcom/avito/android/autoteka/presentation/waitingForPayment/mvi/entity/AutotekaWaitingForPaymentInternalAction;", "_avito_autoteka_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class OpenDeepLink implements AutotekaWaitingForPaymentInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final DeepLink f97889b;

        public OpenDeepLink(@k DeepLink deepLink) {
            this.f97889b = deepLink;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OpenDeepLink) && L.f(this.f97889b, ((OpenDeepLink) obj).f97889b);
        }

        public final int hashCode() {
            return this.f97889b.hashCode();
        }

        @k
        public final String toString() {
            return a.v(new StringBuilder("OpenDeepLink(deepLink="), this.f97889b, ')');
        }
    }

    /* compiled from: AutotekaWaitingForPaymentInternalAction.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/autoteka/presentation/waitingForPayment/mvi/entity/AutotekaWaitingForPaymentInternalAction$Response;", "Lcom/avito/android/autoteka/presentation/waitingForPayment/mvi/entity/AutotekaWaitingForPaymentInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableContent;", "_avito_autoteka_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Response implements AutotekaWaitingForPaymentInternalAction, TrackableContent {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final WaitingForPaymentResponseItem f97890b;

        public Response(@k WaitingForPaymentResponseItem waitingForPaymentResponseItem) {
            this.f97890b = waitingForPaymentResponseItem;
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @l
        /* renamed from: d */
        public final String getF307400d() {
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
            return (obj instanceof Response) && L.f(this.f97890b, ((Response) obj).f97890b);
        }

        public final int hashCode() {
            return this.f97890b.hashCode();
        }

        @k
        public final String toString() {
            return "Response(waitingForPaymentResponseItem=" + this.f97890b + ')';
        }
    }
}
