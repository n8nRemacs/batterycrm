package com.avito.android.short_term_rent.soft_booking.mvi.entity;

import AK.c;
import Y61.k;
import Y61.l;
import android.os.Bundle;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import com.avito.android.analytics.screens.mvi.n;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.guests_selector.io.GuestsSelectorInput;
import com.avito.android.remote.error.ApiError;
import com.avito.android.remote.model.LoaderInfoResponse;
import com.avito.android.short_term_rent.promo_codes.ui.StrSoftBookingPromoCodesDialogOpenParams;
import com.avito.android.short_term_rent.soft_booking.entity.StrSoftBookingContactFieldType;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import pw0.C47157a;
import pw0.C47159c;
import pw0.g;
import pw0.h;
import pw0.i;
import pw0.j;
import pw0.l;
import pw0.m;

/* compiled from: StrSoftBookingInternalAction.kt */
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0015\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0082\u0001\u0015\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#$%&'()*+¨\u0006,"}, d2 = {"Lcom/avito/android/short_term_rent/soft_booking/mvi/entity/StrSoftBookingInternalAction;", "Lcom/avito/android/analytics/screens/mvi/n;", "AnimationLoaderAvailable", "CalculateDetails", "ClearErrors", "CloseScreen", "ContactFieldChanged", "ContactsFieldError", "DateRangeFieldChanged", "Loading", "OpenDeeplink", "PaymentByUrl", "PaymentProcessError", "RequestError", "Scroll", "SetupXHash", "ShowGuestOptions", "ShowGuestsSelector", "ShowPromoCodeMessage", "ShowPromoCodesDialog", "UpdateSelectedPayment", "UpdateSelectedPaymentMethod", "UpdateSelectedPromoCode", "Lcom/avito/android/short_term_rent/soft_booking/mvi/entity/StrSoftBookingInternalAction$AnimationLoaderAvailable;", "Lcom/avito/android/short_term_rent/soft_booking/mvi/entity/StrSoftBookingInternalAction$CalculateDetails;", "Lcom/avito/android/short_term_rent/soft_booking/mvi/entity/StrSoftBookingInternalAction$ClearErrors;", "Lcom/avito/android/short_term_rent/soft_booking/mvi/entity/StrSoftBookingInternalAction$CloseScreen;", "Lcom/avito/android/short_term_rent/soft_booking/mvi/entity/StrSoftBookingInternalAction$ContactFieldChanged;", "Lcom/avito/android/short_term_rent/soft_booking/mvi/entity/StrSoftBookingInternalAction$ContactsFieldError;", "Lcom/avito/android/short_term_rent/soft_booking/mvi/entity/StrSoftBookingInternalAction$DateRangeFieldChanged;", "Lcom/avito/android/short_term_rent/soft_booking/mvi/entity/StrSoftBookingInternalAction$Loading;", "Lcom/avito/android/short_term_rent/soft_booking/mvi/entity/StrSoftBookingInternalAction$OpenDeeplink;", "Lcom/avito/android/short_term_rent/soft_booking/mvi/entity/StrSoftBookingInternalAction$PaymentByUrl;", "Lcom/avito/android/short_term_rent/soft_booking/mvi/entity/StrSoftBookingInternalAction$PaymentProcessError;", "Lcom/avito/android/short_term_rent/soft_booking/mvi/entity/StrSoftBookingInternalAction$RequestError;", "Lcom/avito/android/short_term_rent/soft_booking/mvi/entity/StrSoftBookingInternalAction$Scroll;", "Lcom/avito/android/short_term_rent/soft_booking/mvi/entity/StrSoftBookingInternalAction$SetupXHash;", "Lcom/avito/android/short_term_rent/soft_booking/mvi/entity/StrSoftBookingInternalAction$ShowGuestOptions;", "Lcom/avito/android/short_term_rent/soft_booking/mvi/entity/StrSoftBookingInternalAction$ShowGuestsSelector;", "Lcom/avito/android/short_term_rent/soft_booking/mvi/entity/StrSoftBookingInternalAction$ShowPromoCodeMessage;", "Lcom/avito/android/short_term_rent/soft_booking/mvi/entity/StrSoftBookingInternalAction$ShowPromoCodesDialog;", "Lcom/avito/android/short_term_rent/soft_booking/mvi/entity/StrSoftBookingInternalAction$UpdateSelectedPayment;", "Lcom/avito/android/short_term_rent/soft_booking/mvi/entity/StrSoftBookingInternalAction$UpdateSelectedPaymentMethod;", "Lcom/avito/android/short_term_rent/soft_booking/mvi/entity/StrSoftBookingInternalAction$UpdateSelectedPromoCode;", "_avito_short-term-rent_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface StrSoftBookingInternalAction extends n {

    /* compiled from: StrSoftBookingInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/short_term_rent/soft_booking/mvi/entity/StrSoftBookingInternalAction$AnimationLoaderAvailable;", "Lcom/avito/android/short_term_rent/soft_booking/mvi/entity/StrSoftBookingInternalAction;", "<init>", "()V", "_avito_short-term-rent_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class AnimationLoaderAvailable implements StrSoftBookingInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final AnimationLoaderAvailable f282707b = new AnimationLoaderAvailable();

        private AnimationLoaderAvailable() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof AnimationLoaderAvailable);
        }

        public final int hashCode() {
            return 506566828;
        }

        @k
        public final String toString() {
            return "AnimationLoaderAvailable";
        }
    }

    /* compiled from: StrSoftBookingInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/short_term_rent/soft_booking/mvi/entity/StrSoftBookingInternalAction$CalculateDetails;", "Lcom/avito/android/short_term_rent/soft_booking/mvi/entity/StrSoftBookingInternalAction;", "_avito_short-term-rent_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class CalculateDetails implements StrSoftBookingInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final l.a f282708b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final C47157a f282709c;

        /* renamed from: d, reason: collision with root package name */
        @k
        public final C47159c f282710d;

        /* renamed from: e, reason: collision with root package name */
        @k
        public final j f282711e;

        /* renamed from: f, reason: collision with root package name */
        @k
        public final g f282712f;

        /* renamed from: g, reason: collision with root package name */
        @k
        public final i f282713g;

        /* renamed from: h, reason: collision with root package name */
        @Y61.l
        public final String f282714h;

        /* renamed from: i, reason: collision with root package name */
        @Y61.l
        public final h f282715i;

        /* renamed from: j, reason: collision with root package name */
        @Y61.l
        public final pw0.k f282716j;

        /* renamed from: k, reason: collision with root package name */
        @Y61.l
        public final m f282717k;

        /* renamed from: l, reason: collision with root package name */
        @Y61.l
        public final Long f282718l;

        /* renamed from: m, reason: collision with root package name */
        @Y61.l
        public final LoaderInfoResponse f282719m;

        public CalculateDetails(@k l.a aVar, @k C47157a c47157a, @k C47159c c47159c, @k j jVar, @k g gVar, @k i iVar, @Y61.l String str, @Y61.l h hVar, @Y61.l pw0.k kVar, @Y61.l m mVar, @Y61.l Long l12, @Y61.l LoaderInfoResponse loaderInfoResponse) {
            this.f282708b = aVar;
            this.f282709c = c47157a;
            this.f282710d = c47159c;
            this.f282711e = jVar;
            this.f282712f = gVar;
            this.f282713g = iVar;
            this.f282714h = str;
            this.f282715i = hVar;
            this.f282716j = kVar;
            this.f282717k = mVar;
            this.f282718l = l12;
            this.f282719m = loaderInfoResponse;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof CalculateDetails)) {
                return false;
            }
            CalculateDetails calculateDetails = (CalculateDetails) obj;
            return this.f282708b.equals(calculateDetails.f282708b) && this.f282709c.equals(calculateDetails.f282709c) && this.f282710d.equals(calculateDetails.f282710d) && this.f282711e.equals(calculateDetails.f282711e) && L.f(this.f282712f, calculateDetails.f282712f) && this.f282713g.equals(calculateDetails.f282713g) && L.f(this.f282714h, calculateDetails.f282714h) && this.f282715i.equals(calculateDetails.f282715i) && L.f(this.f282716j, calculateDetails.f282716j) && L.f(this.f282717k, calculateDetails.f282717k) && L.f(this.f282718l, calculateDetails.f282718l) && L.f(this.f282719m, calculateDetails.f282719m);
        }

        public final int hashCode() {
            int iHashCode = (this.f282713g.hashCode() + ((this.f282712f.hashCode() + ((this.f282711e.hashCode() + ((this.f282710d.hashCode() + ((this.f282709c.hashCode() + (this.f282708b.f428893a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31;
            String str = this.f282714h;
            int iHashCode2 = (this.f282715i.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31;
            pw0.k kVar = this.f282716j;
            int iHashCode3 = (iHashCode2 + (kVar == null ? 0 : kVar.hashCode())) * 31;
            m mVar = this.f282717k;
            int iHashCode4 = (iHashCode3 + (mVar == null ? 0 : mVar.hashCode())) * 31;
            Long l12 = this.f282718l;
            int iHashCode5 = (iHashCode4 + (l12 == null ? 0 : l12.hashCode())) * 31;
            LoaderInfoResponse loaderInfoResponse = this.f282719m;
            return iHashCode5 + (loaderInfoResponse != null ? loaderInfoResponse.hashCode() : 0);
        }

        @k
        public final String toString() {
            return "CalculateDetails(response=" + this.f282708b + ", booking=" + this.f282709c + ", contacts=" + this.f282710d + ", promo=" + this.f282711e + ", payment=" + this.f282712f + ", promoCode=" + this.f282713g + ", idempotencyKey=" + this.f282714h + ", paymentMethodsData=" + this.f282715i + ", refundToggles=" + this.f282716j + ", trustItems=" + this.f282717k + ", mcid=" + this.f282718l + ", loaderInfo=" + this.f282719m + ')';
        }
    }

    /* compiled from: StrSoftBookingInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/short_term_rent/soft_booking/mvi/entity/StrSoftBookingInternalAction$ClearErrors;", "Lcom/avito/android/short_term_rent/soft_booking/mvi/entity/StrSoftBookingInternalAction;", "_avito_short-term-rent_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ClearErrors implements StrSoftBookingInternalAction {
        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ClearErrors)) {
                return false;
            }
            ((ClearErrors) obj).getClass();
            return L.f(null, null);
        }

        public final int hashCode() {
            throw null;
        }

        @k
        public final String toString() {
            return "ClearErrors(contacts=null)";
        }
    }

    /* compiled from: StrSoftBookingInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/short_term_rent/soft_booking/mvi/entity/StrSoftBookingInternalAction$CloseScreen;", "Lcom/avito/android/short_term_rent/soft_booking/mvi/entity/StrSoftBookingInternalAction;", "<init>", "()V", "_avito_short-term-rent_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class CloseScreen implements StrSoftBookingInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final CloseScreen f282720b = new CloseScreen();

        private CloseScreen() {
        }

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof CloseScreen);
        }

        public final int hashCode() {
            return 1134051690;
        }

        @k
        public final String toString() {
            return "CloseScreen";
        }
    }

    /* compiled from: StrSoftBookingInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/short_term_rent/soft_booking/mvi/entity/StrSoftBookingInternalAction$ContactFieldChanged;", "Lcom/avito/android/short_term_rent/soft_booking/mvi/entity/StrSoftBookingInternalAction;", "_avito_short-term-rent_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ContactFieldChanged implements StrSoftBookingInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final C47159c f282721b;

        public ContactFieldChanged(@k C47159c c47159c) {
            this.f282721b = c47159c;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ContactFieldChanged) && L.f(this.f282721b, ((ContactFieldChanged) obj).f282721b);
        }

        public final int hashCode() {
            return this.f282721b.hashCode();
        }

        @k
        public final String toString() {
            return "ContactFieldChanged(contacts=" + this.f282721b + ')';
        }
    }

    /* compiled from: StrSoftBookingInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/short_term_rent/soft_booking/mvi/entity/StrSoftBookingInternalAction$ContactsFieldError;", "Lcom/avito/android/short_term_rent/soft_booking/mvi/entity/StrSoftBookingInternalAction;", "_avito_short-term-rent_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ContactsFieldError implements StrSoftBookingInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final C47159c f282722b;

        public ContactsFieldError(@k C47159c c47159c) {
            this.f282722b = c47159c;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ContactsFieldError) && L.f(this.f282722b, ((ContactsFieldError) obj).f282722b);
        }

        public final int hashCode() {
            return this.f282722b.hashCode();
        }

        @k
        public final String toString() {
            return "ContactsFieldError(contacts=" + this.f282722b + ')';
        }
    }

    /* compiled from: StrSoftBookingInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/short_term_rent/soft_booking/mvi/entity/StrSoftBookingInternalAction$DateRangeFieldChanged;", "Lcom/avito/android/short_term_rent/soft_booking/mvi/entity/StrSoftBookingInternalAction;", "_avito_short-term-rent_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class DateRangeFieldChanged implements StrSoftBookingInternalAction {
        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof DateRangeFieldChanged)) {
                return false;
            }
            ((DateRangeFieldChanged) obj).getClass();
            return L.f(null, null);
        }

        public final int hashCode() {
            throw null;
        }

        @k
        public final String toString() {
            return "DateRangeFieldChanged(booking=null)";
        }
    }

    /* compiled from: StrSoftBookingInternalAction.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/short_term_rent/soft_booking/mvi/entity/StrSoftBookingInternalAction$Loading;", "Lcom/avito/android/short_term_rent/soft_booking/mvi/entity/StrSoftBookingInternalAction;", "Hide", "Show", "Lcom/avito/android/short_term_rent/soft_booking/mvi/entity/StrSoftBookingInternalAction$Loading$Hide;", "Lcom/avito/android/short_term_rent/soft_booking/mvi/entity/StrSoftBookingInternalAction$Loading$Show;", "_avito_short-term-rent_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface Loading extends StrSoftBookingInternalAction {

        /* compiled from: StrSoftBookingInternalAction.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/short_term_rent/soft_booking/mvi/entity/StrSoftBookingInternalAction$Loading$Hide;", "Lcom/avito/android/short_term_rent/soft_booking/mvi/entity/StrSoftBookingInternalAction$Loading;", "<init>", "()V", "_avito_short-term-rent_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class Hide implements Loading {

            /* renamed from: b, reason: collision with root package name */
            @k
            public static final Hide f282723b = new Hide();

            private Hide() {
            }

            public final boolean equals(@Y61.l Object obj) {
                return this == obj || (obj instanceof Hide);
            }

            public final int hashCode() {
                return 1579883182;
            }

            @k
            public final String toString() {
                return "Hide";
            }
        }

        /* compiled from: StrSoftBookingInternalAction.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/short_term_rent/soft_booking/mvi/entity/StrSoftBookingInternalAction$Loading$Show;", "Lcom/avito/android/short_term_rent/soft_booking/mvi/entity/StrSoftBookingInternalAction$Loading;", "_avito_short-term-rent_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class Show implements Loading {

            /* renamed from: b, reason: collision with root package name */
            public final boolean f282724b;

            public Show(boolean z12) {
                this.f282724b = z12;
            }

            public final boolean equals(@Y61.l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Show) && this.f282724b == ((Show) obj).f282724b;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.f282724b);
            }

            @k
            public final String toString() {
                return r.x(new StringBuilder("Show(isLoaderAnimated="), this.f282724b, ')');
            }
        }
    }

    /* compiled from: StrSoftBookingInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/short_term_rent/soft_booking/mvi/entity/StrSoftBookingInternalAction$PaymentByUrl;", "Lcom/avito/android/short_term_rent/soft_booking/mvi/entity/StrSoftBookingInternalAction;", "_avito_short-term-rent_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class PaymentByUrl implements StrSoftBookingInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @Y61.l
        public final String f282727b;

        public PaymentByUrl(@Y61.l String str) {
            this.f282727b = str;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof PaymentByUrl) && L.f(this.f282727b, ((PaymentByUrl) obj).f282727b);
        }

        public final int hashCode() {
            String str = this.f282727b;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("PaymentByUrl(paymentUrl="), this.f282727b, ')');
        }
    }

    /* compiled from: StrSoftBookingInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/short_term_rent/soft_booking/mvi/entity/StrSoftBookingInternalAction$PaymentProcessError;", "Lcom/avito/android/short_term_rent/soft_booking/mvi/entity/StrSoftBookingInternalAction;", "_avito_short-term-rent_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class PaymentProcessError implements StrSoftBookingInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final ApiError f282728b;

        public PaymentProcessError(@k ApiError apiError) {
            this.f282728b = apiError;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof PaymentProcessError) && L.f(this.f282728b, ((PaymentProcessError) obj).f282728b);
        }

        public final int hashCode() {
            return this.f282728b.hashCode();
        }

        @k
        public final String toString() {
            return c.n(new StringBuilder("PaymentProcessError(error="), this.f282728b, ')');
        }
    }

    /* compiled from: StrSoftBookingInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/short_term_rent/soft_booking/mvi/entity/StrSoftBookingInternalAction$RequestError;", "Lcom/avito/android/short_term_rent/soft_booking/mvi/entity/StrSoftBookingInternalAction;", "_avito_short-term-rent_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class RequestError implements StrSoftBookingInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final l.b f282729b;

        public RequestError(@k l.b bVar) {
            this.f282729b = bVar;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof RequestError) && this.f282729b.equals(((RequestError) obj).f282729b);
        }

        public final int hashCode() {
            return this.f282729b.f428894a.hashCode();
        }

        @k
        public final String toString() {
            return "RequestError(response=" + this.f282729b + ')';
        }
    }

    /* compiled from: StrSoftBookingInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/short_term_rent/soft_booking/mvi/entity/StrSoftBookingInternalAction$Scroll;", "Lcom/avito/android/short_term_rent/soft_booking/mvi/entity/StrSoftBookingInternalAction;", "_avito_short-term-rent_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Scroll implements StrSoftBookingInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final StrSoftBookingContactFieldType f282730b;

        public Scroll(@k StrSoftBookingContactFieldType strSoftBookingContactFieldType) {
            this.f282730b = strSoftBookingContactFieldType;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Scroll) && this.f282730b == ((Scroll) obj).f282730b;
        }

        public final int hashCode() {
            return this.f282730b.hashCode();
        }

        @k
        public final String toString() {
            return "Scroll(type=" + this.f282730b + ')';
        }
    }

    /* compiled from: StrSoftBookingInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/short_term_rent/soft_booking/mvi/entity/StrSoftBookingInternalAction$SetupXHash;", "Lcom/avito/android/short_term_rent/soft_booking/mvi/entity/StrSoftBookingInternalAction;", "_avito_short-term-rent_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class SetupXHash implements StrSoftBookingInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @Y61.l
        public final String f282731b;

        public SetupXHash(@Y61.l String str) {
            this.f282731b = str;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof SetupXHash) && L.f(this.f282731b, ((SetupXHash) obj).f282731b);
        }

        public final int hashCode() {
            String str = this.f282731b;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("SetupXHash(xHash="), this.f282731b, ')');
        }
    }

    /* compiled from: StrSoftBookingInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/short_term_rent/soft_booking/mvi/entity/StrSoftBookingInternalAction$ShowGuestOptions;", "Lcom/avito/android/short_term_rent/soft_booking/mvi/entity/StrSoftBookingInternalAction;", "_avito_short-term-rent_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ShowGuestOptions implements StrSoftBookingInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final C47157a f282732b;

        public ShowGuestOptions(@k C47157a c47157a) {
            this.f282732b = c47157a;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ShowGuestOptions) && L.f(this.f282732b, ((ShowGuestOptions) obj).f282732b);
        }

        public final int hashCode() {
            return this.f282732b.hashCode();
        }

        @k
        public final String toString() {
            return "ShowGuestOptions(booking=" + this.f282732b + ')';
        }
    }

    /* compiled from: StrSoftBookingInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/short_term_rent/soft_booking/mvi/entity/StrSoftBookingInternalAction$ShowGuestsSelector;", "Lcom/avito/android/short_term_rent/soft_booking/mvi/entity/StrSoftBookingInternalAction;", "_avito_short-term-rent_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ShowGuestsSelector implements StrSoftBookingInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final GuestsSelectorInput f282733b;

        public ShowGuestsSelector(@k GuestsSelectorInput guestsSelectorInput) {
            this.f282733b = guestsSelectorInput;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ShowGuestsSelector) && L.f(this.f282733b, ((ShowGuestsSelector) obj).f282733b);
        }

        public final int hashCode() {
            return this.f282733b.hashCode();
        }

        @k
        public final String toString() {
            return "ShowGuestsSelector(input=" + this.f282733b + ')';
        }
    }

    /* compiled from: StrSoftBookingInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/short_term_rent/soft_booking/mvi/entity/StrSoftBookingInternalAction$ShowPromoCodeMessage;", "Lcom/avito/android/short_term_rent/soft_booking/mvi/entity/StrSoftBookingInternalAction;", "_avito_short-term-rent_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ShowPromoCodeMessage implements StrSoftBookingInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f282734b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f282735c;

        public ShowPromoCodeMessage(@k String str, boolean z12) {
            this.f282734b = str;
            this.f282735c = z12;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ShowPromoCodeMessage)) {
                return false;
            }
            ShowPromoCodeMessage showPromoCodeMessage = (ShowPromoCodeMessage) obj;
            return L.f(this.f282734b, showPromoCodeMessage.f282734b) && this.f282735c == showPromoCodeMessage.f282735c;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f282735c) + (this.f282734b.hashCode() * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ShowPromoCodeMessage(message=");
            sb2.append(this.f282734b);
            sb2.append(", performHapticFeedback=");
            return r.x(sb2, this.f282735c, ')');
        }
    }

    /* compiled from: StrSoftBookingInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/short_term_rent/soft_booking/mvi/entity/StrSoftBookingInternalAction$ShowPromoCodesDialog;", "Lcom/avito/android/short_term_rent/soft_booking/mvi/entity/StrSoftBookingInternalAction;", "_avito_short-term-rent_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ShowPromoCodesDialog implements StrSoftBookingInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final StrSoftBookingPromoCodesDialogOpenParams f282736b;

        public ShowPromoCodesDialog(@k StrSoftBookingPromoCodesDialogOpenParams strSoftBookingPromoCodesDialogOpenParams) {
            this.f282736b = strSoftBookingPromoCodesDialogOpenParams;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ShowPromoCodesDialog) && L.f(this.f282736b, ((ShowPromoCodesDialog) obj).f282736b);
        }

        public final int hashCode() {
            return this.f282736b.hashCode();
        }

        @k
        public final String toString() {
            return "ShowPromoCodesDialog(openParams=" + this.f282736b + ')';
        }
    }

    /* compiled from: StrSoftBookingInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/short_term_rent/soft_booking/mvi/entity/StrSoftBookingInternalAction$UpdateSelectedPayment;", "Lcom/avito/android/short_term_rent/soft_booking/mvi/entity/StrSoftBookingInternalAction;", "_avito_short-term-rent_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class UpdateSelectedPayment implements StrSoftBookingInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final g f282737b;

        public UpdateSelectedPayment(@k g gVar) {
            this.f282737b = gVar;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof UpdateSelectedPayment) && L.f(this.f282737b, ((UpdateSelectedPayment) obj).f282737b);
        }

        public final int hashCode() {
            return this.f282737b.hashCode();
        }

        @k
        public final String toString() {
            return "UpdateSelectedPayment(updatedPayment=" + this.f282737b + ')';
        }
    }

    /* compiled from: StrSoftBookingInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/short_term_rent/soft_booking/mvi/entity/StrSoftBookingInternalAction$UpdateSelectedPaymentMethod;", "Lcom/avito/android/short_term_rent/soft_booking/mvi/entity/StrSoftBookingInternalAction;", "_avito_short-term-rent_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class UpdateSelectedPaymentMethod implements StrSoftBookingInternalAction {
        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof UpdateSelectedPaymentMethod)) {
                return false;
            }
            ((UpdateSelectedPaymentMethod) obj).getClass();
            return L.f(null, null);
        }

        public final int hashCode() {
            return 0;
        }

        @k
        public final String toString() {
            return "UpdateSelectedPaymentMethod(paymentMethodsData=null)";
        }
    }

    /* compiled from: StrSoftBookingInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/short_term_rent/soft_booking/mvi/entity/StrSoftBookingInternalAction$UpdateSelectedPromoCode;", "Lcom/avito/android/short_term_rent/soft_booking/mvi/entity/StrSoftBookingInternalAction;", "_avito_short-term-rent_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class UpdateSelectedPromoCode implements StrSoftBookingInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final i f282738b;

        public UpdateSelectedPromoCode(@k i iVar) {
            this.f282738b = iVar;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof UpdateSelectedPromoCode) && L.f(this.f282738b, ((UpdateSelectedPromoCode) obj).f282738b);
        }

        public final int hashCode() {
            return this.f282738b.hashCode();
        }

        @k
        public final String toString() {
            return "UpdateSelectedPromoCode(promoCode=" + this.f282738b + ')';
        }
    }

    /* compiled from: StrSoftBookingInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/short_term_rent/soft_booking/mvi/entity/StrSoftBookingInternalAction$OpenDeeplink;", "Lcom/avito/android/short_term_rent/soft_booking/mvi/entity/StrSoftBookingInternalAction;", "_avito_short-term-rent_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class OpenDeeplink implements StrSoftBookingInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @Y61.l
        public final DeepLink f282725b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.l
        public final Bundle f282726c;

        public OpenDeeplink(@Y61.l DeepLink deepLink, @Y61.l Bundle bundle) {
            this.f282725b = deepLink;
            this.f282726c = bundle;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OpenDeeplink)) {
                return false;
            }
            OpenDeeplink openDeeplink = (OpenDeeplink) obj;
            return L.f(this.f282725b, openDeeplink.f282725b) && L.f(this.f282726c, openDeeplink.f282726c);
        }

        public final int hashCode() {
            DeepLink deepLink = this.f282725b;
            int iHashCode = (deepLink == null ? 0 : deepLink.hashCode()) * 31;
            Bundle bundle = this.f282726c;
            return iHashCode + (bundle != null ? bundle.hashCode() : 0);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("OpenDeeplink(redirect=");
            sb2.append(this.f282725b);
            sb2.append(", args=");
            return H.m(sb2, this.f282726c, ')');
        }

        public /* synthetic */ OpenDeeplink(DeepLink deepLink, Bundle bundle, int i12, C42822w c42822w) {
            this(deepLink, (i12 & 2) != 0 ? null : bundle);
        }
    }
}
