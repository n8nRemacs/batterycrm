package com.avito.android.travel_payment_selector.mvi.entity;

import AK.c;
import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.runtime.C22026a;
import com.avito.android.analytics.screens.mvi.n;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.error.ApiError;
import com.avito.android.travel_payment_selector.mvi.model.a;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: PaymentSelectorInternalAction.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0007\u0002\u0003\u0004\u0005\u0006\u0007\b\u0082\u0001\u0007\t\n\u000b\f\r\u000e\u000f¨\u0006\u0010"}, d2 = {"Lcom/avito/android/travel_payment_selector/mvi/entity/PaymentSelectorInternalAction;", "Lcom/avito/android/analytics/screens/mvi/n;", "ChangePaymentPlan", "ChangePaymentType", "Error", "Loaded", "OpenPaymentDeeplink", "ShowLoading", "ToggleDescription", "Lcom/avito/android/travel_payment_selector/mvi/entity/PaymentSelectorInternalAction$ChangePaymentPlan;", "Lcom/avito/android/travel_payment_selector/mvi/entity/PaymentSelectorInternalAction$ChangePaymentType;", "Lcom/avito/android/travel_payment_selector/mvi/entity/PaymentSelectorInternalAction$Error;", "Lcom/avito/android/travel_payment_selector/mvi/entity/PaymentSelectorInternalAction$Loaded;", "Lcom/avito/android/travel_payment_selector/mvi/entity/PaymentSelectorInternalAction$OpenPaymentDeeplink;", "Lcom/avito/android/travel_payment_selector/mvi/entity/PaymentSelectorInternalAction$ShowLoading;", "Lcom/avito/android/travel_payment_selector/mvi/entity/PaymentSelectorInternalAction$ToggleDescription;", "_avito_travel-payment-selector_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface PaymentSelectorInternalAction extends n {

    /* compiled from: PaymentSelectorInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/travel_payment_selector/mvi/entity/PaymentSelectorInternalAction$ChangePaymentPlan;", "Lcom/avito/android/travel_payment_selector/mvi/entity/PaymentSelectorInternalAction;", "_avito_travel-payment-selector_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ChangePaymentPlan implements PaymentSelectorInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f302657b;

        public ChangePaymentPlan(@k String str) {
            this.f302657b = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ChangePaymentPlan) && L.f(this.f302657b, ((ChangePaymentPlan) obj).f302657b);
        }

        public final int hashCode() {
            return this.f302657b.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("ChangePaymentPlan(paymentPlan="), this.f302657b, ')');
        }
    }

    /* compiled from: PaymentSelectorInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/travel_payment_selector/mvi/entity/PaymentSelectorInternalAction$ChangePaymentType;", "Lcom/avito/android/travel_payment_selector/mvi/entity/PaymentSelectorInternalAction;", "_avito_travel-payment-selector_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ChangePaymentType implements PaymentSelectorInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f302658b;

        public ChangePaymentType(@k String str) {
            this.f302658b = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ChangePaymentType) && L.f(this.f302658b, ((ChangePaymentType) obj).f302658b);
        }

        public final int hashCode() {
            return this.f302658b.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("ChangePaymentType(paymentType="), this.f302658b, ')');
        }
    }

    /* compiled from: PaymentSelectorInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/travel_payment_selector/mvi/entity/PaymentSelectorInternalAction$Error;", "Lcom/avito/android/travel_payment_selector/mvi/entity/PaymentSelectorInternalAction;", "_avito_travel-payment-selector_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Error implements PaymentSelectorInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @l
        public final Throwable f302659b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final ApiError f302660c;

        public Error(@k ApiError apiError, @l Throwable th2) {
            this.f302659b = th2;
            this.f302660c = apiError;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Error)) {
                return false;
            }
            Error error = (Error) obj;
            return L.f(this.f302659b, error.f302659b) && L.f(this.f302660c, error.f302660c);
        }

        public final int hashCode() {
            Throwable th2 = this.f302659b;
            return this.f302660c.hashCode() + ((th2 == null ? 0 : th2.hashCode()) * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Error(cause=");
            sb2.append(this.f302659b);
            sb2.append(", apiError=");
            return c.n(sb2, this.f302660c, ')');
        }
    }

    /* compiled from: PaymentSelectorInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/travel_payment_selector/mvi/entity/PaymentSelectorInternalAction$Loaded;", "Lcom/avito/android/travel_payment_selector/mvi/entity/PaymentSelectorInternalAction;", "_avito_travel-payment-selector_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Loaded implements PaymentSelectorInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final a f302661b;

        public Loaded(@k a aVar) {
            this.f302661b = aVar;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Loaded) && L.f(this.f302661b, ((Loaded) obj).f302661b);
        }

        public final int hashCode() {
            return this.f302661b.hashCode();
        }

        @k
        public final String toString() {
            return "Loaded(data=" + this.f302661b + ')';
        }
    }

    /* compiled from: PaymentSelectorInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/travel_payment_selector/mvi/entity/PaymentSelectorInternalAction$OpenPaymentDeeplink;", "Lcom/avito/android/travel_payment_selector/mvi/entity/PaymentSelectorInternalAction;", "_avito_travel-payment-selector_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class OpenPaymentDeeplink implements PaymentSelectorInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @l
        public final DeepLink f302662b;

        public OpenPaymentDeeplink(@l DeepLink deepLink) {
            this.f302662b = deepLink;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OpenPaymentDeeplink) && L.f(this.f302662b, ((OpenPaymentDeeplink) obj).f302662b);
        }

        public final int hashCode() {
            DeepLink deepLink = this.f302662b;
            if (deepLink == null) {
                return 0;
            }
            return deepLink.hashCode();
        }

        @k
        public final String toString() {
            return com.avito.android.actions_sheet.a.v(new StringBuilder("OpenPaymentDeeplink(deeplink="), this.f302662b, ')');
        }
    }

    /* compiled from: PaymentSelectorInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/travel_payment_selector/mvi/entity/PaymentSelectorInternalAction$ShowLoading;", "Lcom/avito/android/travel_payment_selector/mvi/entity/PaymentSelectorInternalAction;", "<init>", "()V", "_avito_travel-payment-selector_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ShowLoading implements PaymentSelectorInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final ShowLoading f302663b = new ShowLoading();

        private ShowLoading() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof ShowLoading);
        }

        public final int hashCode() {
            return -2009821240;
        }

        @k
        public final String toString() {
            return "ShowLoading";
        }
    }

    /* compiled from: PaymentSelectorInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/travel_payment_selector/mvi/entity/PaymentSelectorInternalAction$ToggleDescription;", "Lcom/avito/android/travel_payment_selector/mvi/entity/PaymentSelectorInternalAction;", "_avito_travel-payment-selector_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ToggleDescription implements PaymentSelectorInternalAction {

        /* renamed from: b, reason: collision with root package name */
        public final long f302664b;

        public ToggleDescription(long j12) {
            this.f302664b = j12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ToggleDescription) && this.f302664b == ((ToggleDescription) obj).f302664b;
        }

        public final int hashCode() {
            return Long.hashCode(this.f302664b);
        }

        @k
        public final String toString() {
            return r.u(new StringBuilder("ToggleDescription(itemId="), this.f302664b, ')');
        }
    }
}
