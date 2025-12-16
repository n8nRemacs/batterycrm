package com.avito.android.autoteka.presentation.payment.mvi.entity;

import AK.c;
import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.runtime.C22026a;
import com.avito.android.actions_sheet.a;
import com.avito.android.analytics.screens.J;
import com.avito.android.analytics.screens.mvi.TrackableContent;
import com.avito.android.analytics.screens.mvi.TrackableError;
import com.avito.android.analytics.screens.mvi.TrackableLoadingStarted;
import com.avito.android.analytics.screens.mvi.n;
import com.avito.android.autoteka.items.payment.PaymentItem;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.error.ApiError;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: AutotekaPaymentInternalAction.kt */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0010\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0082\u0001\u0010\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !¨\u0006\""}, d2 = {"Lcom/avito/android/autoteka/presentation/payment/mvi/entity/AutotekaPaymentInternalAction;", "Lcom/avito/android/analytics/screens/mvi/n;", "CloseScreenSuccessfully", "Error", "Loading", "LoadingPayment", "LoadingPromoCode", "OpenAuthScreen", "OpenConfirmEmail", "OpenLicenseAgreement", "OpenPayment", "OpenPreviewSearch", "OrderItemError", "PromoCodeChange", "ShowDiscountTooltip", "ShowPaymentFailedToast", "Success", "ToastError", "Lcom/avito/android/autoteka/presentation/payment/mvi/entity/AutotekaPaymentInternalAction$CloseScreenSuccessfully;", "Lcom/avito/android/autoteka/presentation/payment/mvi/entity/AutotekaPaymentInternalAction$Error;", "Lcom/avito/android/autoteka/presentation/payment/mvi/entity/AutotekaPaymentInternalAction$Loading;", "Lcom/avito/android/autoteka/presentation/payment/mvi/entity/AutotekaPaymentInternalAction$LoadingPayment;", "Lcom/avito/android/autoteka/presentation/payment/mvi/entity/AutotekaPaymentInternalAction$LoadingPromoCode;", "Lcom/avito/android/autoteka/presentation/payment/mvi/entity/AutotekaPaymentInternalAction$OpenAuthScreen;", "Lcom/avito/android/autoteka/presentation/payment/mvi/entity/AutotekaPaymentInternalAction$OpenConfirmEmail;", "Lcom/avito/android/autoteka/presentation/payment/mvi/entity/AutotekaPaymentInternalAction$OpenLicenseAgreement;", "Lcom/avito/android/autoteka/presentation/payment/mvi/entity/AutotekaPaymentInternalAction$OpenPayment;", "Lcom/avito/android/autoteka/presentation/payment/mvi/entity/AutotekaPaymentInternalAction$OpenPreviewSearch;", "Lcom/avito/android/autoteka/presentation/payment/mvi/entity/AutotekaPaymentInternalAction$OrderItemError;", "Lcom/avito/android/autoteka/presentation/payment/mvi/entity/AutotekaPaymentInternalAction$PromoCodeChange;", "Lcom/avito/android/autoteka/presentation/payment/mvi/entity/AutotekaPaymentInternalAction$ShowDiscountTooltip;", "Lcom/avito/android/autoteka/presentation/payment/mvi/entity/AutotekaPaymentInternalAction$ShowPaymentFailedToast;", "Lcom/avito/android/autoteka/presentation/payment/mvi/entity/AutotekaPaymentInternalAction$Success;", "Lcom/avito/android/autoteka/presentation/payment/mvi/entity/AutotekaPaymentInternalAction$ToastError;", "_avito_autoteka_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public interface AutotekaPaymentInternalAction extends n {

    /* compiled from: AutotekaPaymentInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/autoteka/presentation/payment/mvi/entity/AutotekaPaymentInternalAction$CloseScreenSuccessfully;", "Lcom/avito/android/autoteka/presentation/payment/mvi/entity/AutotekaPaymentInternalAction;", "<init>", "()V", "_avito_autoteka_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class CloseScreenSuccessfully implements AutotekaPaymentInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final CloseScreenSuccessfully f97438b = new CloseScreenSuccessfully();

        private CloseScreenSuccessfully() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof CloseScreenSuccessfully);
        }

        public final int hashCode() {
            return -1344234574;
        }

        @k
        public final String toString() {
            return "CloseScreenSuccessfully";
        }
    }

    /* compiled from: AutotekaPaymentInternalAction.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/autoteka/presentation/payment/mvi/entity/AutotekaPaymentInternalAction$Error;", "Lcom/avito/android/autoteka/presentation/payment/mvi/entity/AutotekaPaymentInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableError;", "_avito_autoteka_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Error implements AutotekaPaymentInternalAction, TrackableError {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final ApiError f97439b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final J.a f97440c;

        public Error(@k ApiError apiError) {
            this.f97439b = apiError;
            this.f97440c = new J.a(apiError);
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @l
        /* renamed from: d */
        public final String getF131216d() {
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
            return (obj instanceof Error) && L.f(this.f97439b, ((Error) obj).f97439b);
        }

        @Override // com.avito.android.analytics.screens.mvi.TrackableError
        @k
        /* renamed from: g, reason: from getter */
        public final J.a getF325284c() {
            return this.f97440c;
        }

        public final int hashCode() {
            return this.f97439b.hashCode();
        }

        @k
        public final String toString() {
            return c.n(new StringBuilder("Error(apiError="), this.f97439b, ')');
        }
    }

    /* compiled from: AutotekaPaymentInternalAction.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/autoteka/presentation/payment/mvi/entity/AutotekaPaymentInternalAction$Loading;", "Lcom/avito/android/analytics/screens/mvi/TrackableLoadingStarted;", "Lcom/avito/android/autoteka/presentation/payment/mvi/entity/AutotekaPaymentInternalAction;", "_avito_autoteka_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Loading extends TrackableLoadingStarted implements AutotekaPaymentInternalAction {

        /* renamed from: d, reason: collision with root package name */
        @k
        public final G0 f97441d;

        public Loading() {
            this(null, 1, null);
        }

        @Override // com.avito.android.analytics.screens.mvi.TrackableLoadingStarted
        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Loading) && L.f(this.f97441d, ((Loading) obj).f97441d);
        }

        @Override // com.avito.android.analytics.screens.mvi.TrackableLoadingStarted
        public final int hashCode() {
            return this.f97441d.hashCode();
        }

        @k
        public final String toString() {
            return c.v(new StringBuilder("Loading(stub="), this.f97441d, ')');
        }

        public Loading(G0 g02, int i12, C42822w c42822w) {
            this.f97441d = (i12 & 1) != 0 ? G0.f406611a : g02;
        }
    }

    /* compiled from: AutotekaPaymentInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/autoteka/presentation/payment/mvi/entity/AutotekaPaymentInternalAction$LoadingPayment;", "Lcom/avito/android/autoteka/presentation/payment/mvi/entity/AutotekaPaymentInternalAction;", "<init>", "()V", "_avito_autoteka_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class LoadingPayment implements AutotekaPaymentInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final LoadingPayment f97442b = new LoadingPayment();

        private LoadingPayment() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof LoadingPayment);
        }

        public final int hashCode() {
            return 119622115;
        }

        @k
        public final String toString() {
            return "LoadingPayment";
        }
    }

    /* compiled from: AutotekaPaymentInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/autoteka/presentation/payment/mvi/entity/AutotekaPaymentInternalAction$LoadingPromoCode;", "Lcom/avito/android/autoteka/presentation/payment/mvi/entity/AutotekaPaymentInternalAction;", "<init>", "()V", "_avito_autoteka_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class LoadingPromoCode implements AutotekaPaymentInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final LoadingPromoCode f97443b = new LoadingPromoCode();

        private LoadingPromoCode() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof LoadingPromoCode);
        }

        public final int hashCode() {
            return -1721409479;
        }

        @k
        public final String toString() {
            return "LoadingPromoCode";
        }
    }

    /* compiled from: AutotekaPaymentInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/autoteka/presentation/payment/mvi/entity/AutotekaPaymentInternalAction$OpenAuthScreen;", "Lcom/avito/android/autoteka/presentation/payment/mvi/entity/AutotekaPaymentInternalAction;", "<init>", "()V", "_avito_autoteka_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class OpenAuthScreen implements AutotekaPaymentInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final OpenAuthScreen f97444b = new OpenAuthScreen();

        private OpenAuthScreen() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof OpenAuthScreen);
        }

        public final int hashCode() {
            return -1874471209;
        }

        @k
        public final String toString() {
            return "OpenAuthScreen";
        }
    }

    /* compiled from: AutotekaPaymentInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/autoteka/presentation/payment/mvi/entity/AutotekaPaymentInternalAction$OpenConfirmEmail;", "Lcom/avito/android/autoteka/presentation/payment/mvi/entity/AutotekaPaymentInternalAction;", "_avito_autoteka_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class OpenConfirmEmail implements AutotekaPaymentInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @l
        public final String f97445b;

        public OpenConfirmEmail(@l String str) {
            this.f97445b = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OpenConfirmEmail) && L.f(this.f97445b, ((OpenConfirmEmail) obj).f97445b);
        }

        public final int hashCode() {
            String str = this.f97445b;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("OpenConfirmEmail(alreadyRegisteredMessage="), this.f97445b, ')');
        }
    }

    /* compiled from: AutotekaPaymentInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/autoteka/presentation/payment/mvi/entity/AutotekaPaymentInternalAction$OpenLicenseAgreement;", "Lcom/avito/android/autoteka/presentation/payment/mvi/entity/AutotekaPaymentInternalAction;", "_avito_autoteka_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class OpenLicenseAgreement implements AutotekaPaymentInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final DeepLink f97446b;

        public OpenLicenseAgreement(@k DeepLink deepLink) {
            this.f97446b = deepLink;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OpenLicenseAgreement) && L.f(this.f97446b, ((OpenLicenseAgreement) obj).f97446b);
        }

        public final int hashCode() {
            return this.f97446b.hashCode();
        }

        @k
        public final String toString() {
            return a.v(new StringBuilder("OpenLicenseAgreement(deepLink="), this.f97446b, ')');
        }
    }

    /* compiled from: AutotekaPaymentInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/autoteka/presentation/payment/mvi/entity/AutotekaPaymentInternalAction$OpenPayment;", "Lcom/avito/android/autoteka/presentation/payment/mvi/entity/AutotekaPaymentInternalAction;", "_avito_autoteka_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class OpenPayment implements AutotekaPaymentInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f97447b;

        public OpenPayment(@k String str) {
            this.f97447b = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OpenPayment) && L.f(this.f97447b, ((OpenPayment) obj).f97447b);
        }

        public final int hashCode() {
            return this.f97447b.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("OpenPayment(redirectUrl="), this.f97447b, ')');
        }
    }

    /* compiled from: AutotekaPaymentInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/autoteka/presentation/payment/mvi/entity/AutotekaPaymentInternalAction$OpenPreviewSearch;", "Lcom/avito/android/autoteka/presentation/payment/mvi/entity/AutotekaPaymentInternalAction;", "<init>", "()V", "_avito_autoteka_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class OpenPreviewSearch implements AutotekaPaymentInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final OpenPreviewSearch f97448b = new OpenPreviewSearch();

        private OpenPreviewSearch() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof OpenPreviewSearch);
        }

        public final int hashCode() {
            return 736226829;
        }

        @k
        public final String toString() {
            return "OpenPreviewSearch";
        }
    }

    /* compiled from: AutotekaPaymentInternalAction.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/autoteka/presentation/payment/mvi/entity/AutotekaPaymentInternalAction$OrderItemError;", "Lcom/avito/android/autoteka/presentation/payment/mvi/entity/AutotekaPaymentInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableError;", "_avito_autoteka_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class OrderItemError implements AutotekaPaymentInternalAction, TrackableError {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final ApiError f97449b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final J.a f97450c;

        public OrderItemError(@k ApiError apiError) {
            this.f97449b = apiError;
            this.f97450c = new J.a(apiError);
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @l
        /* renamed from: d */
        public final String getF131216d() {
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
            return (obj instanceof OrderItemError) && L.f(this.f97449b, ((OrderItemError) obj).f97449b);
        }

        @Override // com.avito.android.analytics.screens.mvi.TrackableError
        @k
        /* renamed from: g, reason: from getter */
        public final J.a getF325284c() {
            return this.f97450c;
        }

        public final int hashCode() {
            return this.f97449b.hashCode();
        }

        @k
        public final String toString() {
            return c.n(new StringBuilder("OrderItemError(apiError="), this.f97449b, ')');
        }
    }

    /* compiled from: AutotekaPaymentInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/autoteka/presentation/payment/mvi/entity/AutotekaPaymentInternalAction$PromoCodeChange;", "Lcom/avito/android/autoteka/presentation/payment/mvi/entity/AutotekaPaymentInternalAction;", "_avito_autoteka_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class PromoCodeChange implements AutotekaPaymentInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f97451b;

        public PromoCodeChange(@k String str) {
            this.f97451b = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof PromoCodeChange) && L.f(this.f97451b, ((PromoCodeChange) obj).f97451b);
        }

        public final int hashCode() {
            return this.f97451b.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("PromoCodeChange(promoCode="), this.f97451b, ')');
        }
    }

    /* compiled from: AutotekaPaymentInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/autoteka/presentation/payment/mvi/entity/AutotekaPaymentInternalAction$ShowDiscountTooltip;", "Lcom/avito/android/autoteka/presentation/payment/mvi/entity/AutotekaPaymentInternalAction;", "_avito_autoteka_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ShowDiscountTooltip implements AutotekaPaymentInternalAction {

        /* renamed from: b, reason: collision with root package name */
        public final boolean f97452b;

        public ShowDiscountTooltip(boolean z12) {
            this.f97452b = z12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ShowDiscountTooltip) && this.f97452b == ((ShowDiscountTooltip) obj).f97452b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f97452b);
        }

        @k
        public final String toString() {
            return r.x(new StringBuilder("ShowDiscountTooltip(isPromoCodeLessProfitable="), this.f97452b, ')');
        }
    }

    /* compiled from: AutotekaPaymentInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/autoteka/presentation/payment/mvi/entity/AutotekaPaymentInternalAction$ShowPaymentFailedToast;", "Lcom/avito/android/autoteka/presentation/payment/mvi/entity/AutotekaPaymentInternalAction;", "<init>", "()V", "_avito_autoteka_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ShowPaymentFailedToast implements AutotekaPaymentInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final ShowPaymentFailedToast f97453b = new ShowPaymentFailedToast();

        private ShowPaymentFailedToast() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof ShowPaymentFailedToast);
        }

        public final int hashCode() {
            return 1716333466;
        }

        @k
        public final String toString() {
            return "ShowPaymentFailedToast";
        }
    }

    /* compiled from: AutotekaPaymentInternalAction.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/autoteka/presentation/payment/mvi/entity/AutotekaPaymentInternalAction$Success;", "Lcom/avito/android/autoteka/presentation/payment/mvi/entity/AutotekaPaymentInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableContent;", "_avito_autoteka_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Success implements AutotekaPaymentInternalAction, TrackableContent {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final PaymentItem f97454b;

        public Success(@k PaymentItem paymentItem) {
            this.f97454b = paymentItem;
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @l
        /* renamed from: d */
        public final String getF131216d() {
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
            return (obj instanceof Success) && L.f(this.f97454b, ((Success) obj).f97454b);
        }

        public final int hashCode() {
            return this.f97454b.hashCode();
        }

        @k
        public final String toString() {
            return "Success(paymentItem=" + this.f97454b + ')';
        }
    }

    /* compiled from: AutotekaPaymentInternalAction.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/autoteka/presentation/payment/mvi/entity/AutotekaPaymentInternalAction$ToastError;", "Lcom/avito/android/autoteka/presentation/payment/mvi/entity/AutotekaPaymentInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableError;", "_avito_autoteka_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ToastError implements AutotekaPaymentInternalAction, TrackableError {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final ApiError f97455b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final J.a f97456c;

        public ToastError(@k ApiError apiError) {
            this.f97455b = apiError;
            this.f97456c = new J.a(apiError);
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @l
        /* renamed from: d */
        public final String getF131216d() {
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
            return (obj instanceof ToastError) && L.f(this.f97455b, ((ToastError) obj).f97455b);
        }

        @Override // com.avito.android.analytics.screens.mvi.TrackableError
        @k
        /* renamed from: g, reason: from getter */
        public final J.a getF325284c() {
            return this.f97456c;
        }

        public final int hashCode() {
            return this.f97455b.hashCode();
        }

        @k
        public final String toString() {
            return c.n(new StringBuilder("ToastError(apiError="), this.f97455b, ')');
        }
    }
}
