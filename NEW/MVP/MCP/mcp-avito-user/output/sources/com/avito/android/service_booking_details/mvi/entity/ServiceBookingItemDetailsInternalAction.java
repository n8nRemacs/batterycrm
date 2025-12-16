package com.avito.android.service_booking_details.mvi.entity;

import Bt0.c;
import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.runtime.C22026a;
import com.avito.android.analytics.screens.J;
import com.avito.android.analytics.screens.mvi.TrackableContent;
import com.avito.android.analytics.screens.mvi.TrackableError;
import com.avito.android.analytics.screens.mvi.TrackableLoadingStarted;
import com.avito.android.analytics.screens.mvi.n;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.remote.error.ApiError;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ServiceBookingItemDetailsInternalAction.kt */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u000e\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0082\u0001\u000e\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d¨\u0006\u001e"}, d2 = {"Lcom/avito/android/service_booking_details/mvi/entity/ServiceBookingItemDetailsInternalAction;", "Lcom/avito/android/analytics/screens/mvi/n;", "Close", "Content", "CopyPhoneToClipboard", "Error", "HandleDeeplink", "Loading", "OnFailureActionResult", "OnShowOnboarding", "OnShowPhone", "OnSuccessActionResult", "PhoneNumberErrorToast", "PhoneNumberSuccess", "SetActivityResult", "ShowUxFeedbackOrderCancellation", "Lcom/avito/android/service_booking_details/mvi/entity/ServiceBookingItemDetailsInternalAction$Close;", "Lcom/avito/android/service_booking_details/mvi/entity/ServiceBookingItemDetailsInternalAction$Content;", "Lcom/avito/android/service_booking_details/mvi/entity/ServiceBookingItemDetailsInternalAction$CopyPhoneToClipboard;", "Lcom/avito/android/service_booking_details/mvi/entity/ServiceBookingItemDetailsInternalAction$Error;", "Lcom/avito/android/service_booking_details/mvi/entity/ServiceBookingItemDetailsInternalAction$HandleDeeplink;", "Lcom/avito/android/service_booking_details/mvi/entity/ServiceBookingItemDetailsInternalAction$Loading;", "Lcom/avito/android/service_booking_details/mvi/entity/ServiceBookingItemDetailsInternalAction$OnFailureActionResult;", "Lcom/avito/android/service_booking_details/mvi/entity/ServiceBookingItemDetailsInternalAction$OnShowOnboarding;", "Lcom/avito/android/service_booking_details/mvi/entity/ServiceBookingItemDetailsInternalAction$OnShowPhone;", "Lcom/avito/android/service_booking_details/mvi/entity/ServiceBookingItemDetailsInternalAction$OnSuccessActionResult;", "Lcom/avito/android/service_booking_details/mvi/entity/ServiceBookingItemDetailsInternalAction$PhoneNumberErrorToast;", "Lcom/avito/android/service_booking_details/mvi/entity/ServiceBookingItemDetailsInternalAction$PhoneNumberSuccess;", "Lcom/avito/android/service_booking_details/mvi/entity/ServiceBookingItemDetailsInternalAction$SetActivityResult;", "Lcom/avito/android/service_booking_details/mvi/entity/ServiceBookingItemDetailsInternalAction$ShowUxFeedbackOrderCancellation;", "_avito_service-booking-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface ServiceBookingItemDetailsInternalAction extends n {

    /* compiled from: ServiceBookingItemDetailsInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/service_booking_details/mvi/entity/ServiceBookingItemDetailsInternalAction$Close;", "Lcom/avito/android/service_booking_details/mvi/entity/ServiceBookingItemDetailsInternalAction;", "_avito_service-booking-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Close implements ServiceBookingItemDetailsInternalAction {

        /* renamed from: b, reason: collision with root package name */
        public final int f277364b;

        public Close(int i12) {
            this.f277364b = i12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Close) && this.f277364b == ((Close) obj).f277364b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f277364b);
        }

        @k
        public final String toString() {
            return r.t(new StringBuilder("Close(activityResult="), this.f277364b, ')');
        }
    }

    /* compiled from: ServiceBookingItemDetailsInternalAction.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/service_booking_details/mvi/entity/ServiceBookingItemDetailsInternalAction$Content;", "Lcom/avito/android/service_booking_details/mvi/entity/ServiceBookingItemDetailsInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableContent;", "_avito_service-booking-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Content implements ServiceBookingItemDetailsInternalAction, TrackableContent {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final c f277365b;

        public Content(@k c cVar) {
            this.f277365b = cVar;
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @l
        /* renamed from: d */
        public final String getF211747d() {
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
            return (obj instanceof Content) && L.f(this.f277365b, ((Content) obj).f277365b);
        }

        public final int hashCode() {
            return this.f277365b.hashCode();
        }

        @k
        public final String toString() {
            return "Content(data=" + this.f277365b + ')';
        }
    }

    /* compiled from: ServiceBookingItemDetailsInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/service_booking_details/mvi/entity/ServiceBookingItemDetailsInternalAction$CopyPhoneToClipboard;", "Lcom/avito/android/service_booking_details/mvi/entity/ServiceBookingItemDetailsInternalAction;", "_avito_service-booking-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class CopyPhoneToClipboard implements ServiceBookingItemDetailsInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final com.avito.android.service_booking_common.blueprints.contact.c f277366b;

        public CopyPhoneToClipboard(@k com.avito.android.service_booking_common.blueprints.contact.c cVar) {
            this.f277366b = cVar;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof CopyPhoneToClipboard) && L.f(this.f277366b, ((CopyPhoneToClipboard) obj).f277366b);
        }

        public final int hashCode() {
            return this.f277366b.hashCode();
        }

        @k
        public final String toString() {
            return "CopyPhoneToClipboard(item=" + this.f277366b + ')';
        }
    }

    /* compiled from: ServiceBookingItemDetailsInternalAction.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/service_booking_details/mvi/entity/ServiceBookingItemDetailsInternalAction$Error;", "Lcom/avito/android/service_booking_details/mvi/entity/ServiceBookingItemDetailsInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableError;", "_avito_service-booking-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Error implements ServiceBookingItemDetailsInternalAction, TrackableError {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final ApiError f277367b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final J.a f277368c;

        public Error(@k ApiError apiError) {
            this.f277367b = apiError;
            this.f277368c = new J.a(apiError);
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @l
        /* renamed from: d */
        public final String getF211747d() {
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
            return (obj instanceof Error) && L.f(this.f277367b, ((Error) obj).f277367b);
        }

        @Override // com.avito.android.analytics.screens.mvi.TrackableError
        @k
        /* renamed from: g, reason: from getter */
        public final J.a getF211739c() {
            return this.f277368c;
        }

        public final int hashCode() {
            return this.f277367b.hashCode();
        }

        @k
        public final String toString() {
            return AK.c.n(new StringBuilder("Error(throwable="), this.f277367b, ')');
        }
    }

    /* compiled from: ServiceBookingItemDetailsInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/service_booking_details/mvi/entity/ServiceBookingItemDetailsInternalAction$HandleDeeplink;", "Lcom/avito/android/service_booking_details/mvi/entity/ServiceBookingItemDetailsInternalAction;", "_avito_service-booking-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class HandleDeeplink implements ServiceBookingItemDetailsInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final DeepLink f277369b;

        public HandleDeeplink(@k DeepLink deepLink) {
            this.f277369b = deepLink;
        }
    }

    /* compiled from: ServiceBookingItemDetailsInternalAction.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/service_booking_details/mvi/entity/ServiceBookingItemDetailsInternalAction$Loading;", "Lcom/avito/android/analytics/screens/mvi/TrackableLoadingStarted;", "Lcom/avito/android/service_booking_details/mvi/entity/ServiceBookingItemDetailsInternalAction;", "()V", "_avito_service-booking-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Loading extends TrackableLoadingStarted implements ServiceBookingItemDetailsInternalAction {
    }

    /* compiled from: ServiceBookingItemDetailsInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/service_booking_details/mvi/entity/ServiceBookingItemDetailsInternalAction$OnFailureActionResult;", "Lcom/avito/android/service_booking_details/mvi/entity/ServiceBookingItemDetailsInternalAction;", "_avito_service-booking-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class OnFailureActionResult implements ServiceBookingItemDetailsInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @l
        public final String f277370b;

        public OnFailureActionResult(@l String str) {
            this.f277370b = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OnFailureActionResult) && L.f(this.f277370b, ((OnFailureActionResult) obj).f277370b);
        }

        public final int hashCode() {
            String str = this.f277370b;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("OnFailureActionResult(text="), this.f277370b, ')');
        }
    }

    /* compiled from: ServiceBookingItemDetailsInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/service_booking_details/mvi/entity/ServiceBookingItemDetailsInternalAction$OnShowOnboarding;", "Lcom/avito/android/service_booking_details/mvi/entity/ServiceBookingItemDetailsInternalAction;", "_avito_service-booking-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class OnShowOnboarding implements ServiceBookingItemDetailsInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final DeepLink f277371b;

        public OnShowOnboarding(@k DeepLink deepLink) {
            this.f277371b = deepLink;
        }
    }

    /* compiled from: ServiceBookingItemDetailsInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/service_booking_details/mvi/entity/ServiceBookingItemDetailsInternalAction$OnShowPhone;", "Lcom/avito/android/service_booking_details/mvi/entity/ServiceBookingItemDetailsInternalAction;", "_avito_service-booking-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class OnShowPhone implements ServiceBookingItemDetailsInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f277372b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final String f277373c;

        public OnShowPhone(@k String str, @k String str2) {
            this.f277372b = str;
            this.f277373c = str2;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnShowPhone)) {
                return false;
            }
            OnShowPhone onShowPhone = (OnShowPhone) obj;
            return L.f(this.f277372b, onShowPhone.f277372b) && L.f(this.f277373c, onShowPhone.f277373c);
        }

        public final int hashCode() {
            return this.f277373c.hashCode() + (this.f277372b.hashCode() * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("OnShowPhone(orderId=");
            sb2.append(this.f277372b);
            sb2.append(", name=");
            return C22026a.c(sb2, this.f277373c, ')');
        }
    }

    /* compiled from: ServiceBookingItemDetailsInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/service_booking_details/mvi/entity/ServiceBookingItemDetailsInternalAction$OnSuccessActionResult;", "Lcom/avito/android/service_booking_details/mvi/entity/ServiceBookingItemDetailsInternalAction;", "_avito_service-booking-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class OnSuccessActionResult implements ServiceBookingItemDetailsInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @l
        public final String f277374b;

        public OnSuccessActionResult(@l String str) {
            this.f277374b = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OnSuccessActionResult) && L.f(this.f277374b, ((OnSuccessActionResult) obj).f277374b);
        }

        public final int hashCode() {
            String str = this.f277374b;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("OnSuccessActionResult(message="), this.f277374b, ')');
        }
    }

    /* compiled from: ServiceBookingItemDetailsInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/service_booking_details/mvi/entity/ServiceBookingItemDetailsInternalAction$PhoneNumberErrorToast;", "Lcom/avito/android/service_booking_details/mvi/entity/ServiceBookingItemDetailsInternalAction;", "_avito_service-booking-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class PhoneNumberErrorToast implements ServiceBookingItemDetailsInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final PrintableText f277375b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final Throwable f277376c;

        /* renamed from: d, reason: collision with root package name */
        @l
        public final String f277377d;

        /* renamed from: e, reason: collision with root package name */
        @l
        public final String f277378e;

        public PhoneNumberErrorToast(@k PrintableText printableText, @l Throwable th2, @l String str, @l String str2) {
            this.f277375b = printableText;
            this.f277376c = th2;
            this.f277377d = str;
            this.f277378e = str2;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PhoneNumberErrorToast)) {
                return false;
            }
            PhoneNumberErrorToast phoneNumberErrorToast = (PhoneNumberErrorToast) obj;
            return L.f(this.f277375b, phoneNumberErrorToast.f277375b) && L.f(this.f277376c, phoneNumberErrorToast.f277376c) && L.f(this.f277377d, phoneNumberErrorToast.f277377d) && L.f(this.f277378e, phoneNumberErrorToast.f277378e);
        }

        public final int hashCode() {
            int iHashCode = this.f277375b.hashCode() * 31;
            Throwable th2 = this.f277376c;
            int iHashCode2 = (iHashCode + (th2 == null ? 0 : th2.hashCode())) * 31;
            String str = this.f277377d;
            int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f277378e;
            return iHashCode3 + (str2 != null ? str2.hashCode() : 0);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("PhoneNumberErrorToast(message=");
            sb2.append(this.f277375b);
            sb2.append(", throwable=");
            sb2.append(this.f277376c);
            sb2.append(", name=");
            sb2.append(this.f277377d);
            sb2.append(", orderId=");
            return C22026a.c(sb2, this.f277378e, ')');
        }
    }

    /* compiled from: ServiceBookingItemDetailsInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/service_booking_details/mvi/entity/ServiceBookingItemDetailsInternalAction$PhoneNumberSuccess;", "Lcom/avito/android/service_booking_details/mvi/entity/ServiceBookingItemDetailsInternalAction;", "_avito_service-booking-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class PhoneNumberSuccess implements ServiceBookingItemDetailsInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @l
        public final String f277379b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final String f277380c;

        /* renamed from: d, reason: collision with root package name */
        @l
        public final String f277381d;

        public PhoneNumberSuccess(@l String str, @l String str2, @l String str3) {
            this.f277379b = str;
            this.f277380c = str2;
            this.f277381d = str3;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PhoneNumberSuccess)) {
                return false;
            }
            PhoneNumberSuccess phoneNumberSuccess = (PhoneNumberSuccess) obj;
            return L.f(this.f277379b, phoneNumberSuccess.f277379b) && L.f(this.f277380c, phoneNumberSuccess.f277380c) && L.f(this.f277381d, phoneNumberSuccess.f277381d);
        }

        public final int hashCode() {
            String str = this.f277379b;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.f277380c;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.f277381d;
            return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("PhoneNumberSuccess(phone=");
            sb2.append(this.f277379b);
            sb2.append(", name=");
            sb2.append(this.f277380c);
            sb2.append(", orderId=");
            return C22026a.c(sb2, this.f277381d, ')');
        }
    }

    /* compiled from: ServiceBookingItemDetailsInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/service_booking_details/mvi/entity/ServiceBookingItemDetailsInternalAction$SetActivityResult;", "Lcom/avito/android/service_booking_details/mvi/entity/ServiceBookingItemDetailsInternalAction;", "_avito_service-booking-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class SetActivityResult implements ServiceBookingItemDetailsInternalAction {
        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SetActivityResult)) {
                return false;
            }
            ((SetActivityResult) obj).getClass();
            return true;
        }

        public final int hashCode() {
            return Integer.hashCode(-1);
        }

        @k
        public final String toString() {
            return "SetActivityResult(result=-1)";
        }
    }

    /* compiled from: ServiceBookingItemDetailsInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/service_booking_details/mvi/entity/ServiceBookingItemDetailsInternalAction$ShowUxFeedbackOrderCancellation;", "Lcom/avito/android/service_booking_details/mvi/entity/ServiceBookingItemDetailsInternalAction;", "()V", "_avito_service-booking-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class ShowUxFeedbackOrderCancellation implements ServiceBookingItemDetailsInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final ShowUxFeedbackOrderCancellation f277382b = new ShowUxFeedbackOrderCancellation();

        private ShowUxFeedbackOrderCancellation() {
        }
    }
}
