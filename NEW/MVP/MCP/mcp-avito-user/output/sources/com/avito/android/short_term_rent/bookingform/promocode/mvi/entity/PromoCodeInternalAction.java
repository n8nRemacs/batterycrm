package com.avito.android.short_term_rent.bookingform.promocode.mvi.entity;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import com.avito.android.analytics.screens.mvi.n;
import com.avito.android.short_term_rent.bookingform.promocode.mvi.a;
import com.avito.android.short_term_rent.deeplink.PromoCode;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: PromoCodeInternalAction.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\t\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u0082\u0001\t\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013¨\u0006\u0014"}, d2 = {"Lcom/avito/android/short_term_rent/bookingform/promocode/mvi/entity/PromoCodeInternalAction;", "Lcom/avito/android/analytics/screens/mvi/n;", "CloseScreenWithResult", "Initial", "ResetPromoCodesSelection", "ResponseError", "ResponseValidationError", "ShowToast", "UpdatePromoCodeInput", "UpdatePromoCodesSelection", "ValidationLoading", "Lcom/avito/android/short_term_rent/bookingform/promocode/mvi/entity/PromoCodeInternalAction$CloseScreenWithResult;", "Lcom/avito/android/short_term_rent/bookingform/promocode/mvi/entity/PromoCodeInternalAction$Initial;", "Lcom/avito/android/short_term_rent/bookingform/promocode/mvi/entity/PromoCodeInternalAction$ResetPromoCodesSelection;", "Lcom/avito/android/short_term_rent/bookingform/promocode/mvi/entity/PromoCodeInternalAction$ResponseError;", "Lcom/avito/android/short_term_rent/bookingform/promocode/mvi/entity/PromoCodeInternalAction$ResponseValidationError;", "Lcom/avito/android/short_term_rent/bookingform/promocode/mvi/entity/PromoCodeInternalAction$ShowToast;", "Lcom/avito/android/short_term_rent/bookingform/promocode/mvi/entity/PromoCodeInternalAction$UpdatePromoCodeInput;", "Lcom/avito/android/short_term_rent/bookingform/promocode/mvi/entity/PromoCodeInternalAction$UpdatePromoCodesSelection;", "Lcom/avito/android/short_term_rent/bookingform/promocode/mvi/entity/PromoCodeInternalAction$ValidationLoading;", "_avito_short-term-rent_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface PromoCodeInternalAction extends n {

    /* compiled from: PromoCodeInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/short_term_rent/bookingform/promocode/mvi/entity/PromoCodeInternalAction$CloseScreenWithResult;", "Lcom/avito/android/short_term_rent/bookingform/promocode/mvi/entity/PromoCodeInternalAction;", "_avito_short-term-rent_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class CloseScreenWithResult implements PromoCodeInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @l
        public final String f282148b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final String f282149c;

        public CloseScreenWithResult(@l String str, @l String str2) {
            this.f282148b = str;
            this.f282149c = str2;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof CloseScreenWithResult)) {
                return false;
            }
            CloseScreenWithResult closeScreenWithResult = (CloseScreenWithResult) obj;
            return L.f(this.f282148b, closeScreenWithResult.f282148b) && L.f(this.f282149c, closeScreenWithResult.f282149c);
        }

        public final int hashCode() {
            String str = this.f282148b;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.f282149c;
            return iHashCode + (str2 != null ? str2.hashCode() : 0);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("CloseScreenWithResult(promoCode=");
            sb2.append(this.f282148b);
            sb2.append(", toastMessage=");
            return C22026a.c(sb2, this.f282149c, ')');
        }
    }

    /* compiled from: PromoCodeInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/short_term_rent/bookingform/promocode/mvi/entity/PromoCodeInternalAction$Initial;", "Lcom/avito/android/short_term_rent/bookingform/promocode/mvi/entity/PromoCodeInternalAction;", "_avito_short-term-rent_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Initial implements PromoCodeInternalAction {

        /* renamed from: b, reason: collision with root package name */
        public final long f282150b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final String f282151c;

        /* renamed from: d, reason: collision with root package name */
        @k
        public final String f282152d;

        /* renamed from: e, reason: collision with root package name */
        @l
        public final String f282153e;

        /* renamed from: f, reason: collision with root package name */
        @l
        public final String f282154f;

        /* renamed from: g, reason: collision with root package name */
        @l
        public final List<PromoCode> f282155g;

        public Initial(@l List list, long j12, @k String str, @k String str2, @l String str3, @l String str4) {
            this.f282150b = j12;
            this.f282151c = str;
            this.f282152d = str2;
            this.f282153e = str3;
            this.f282154f = str4;
            this.f282155g = list;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Initial)) {
                return false;
            }
            Initial initial = (Initial) obj;
            return this.f282150b == initial.f282150b && L.f(this.f282151c, initial.f282151c) && L.f(this.f282152d, initial.f282152d) && L.f(this.f282153e, initial.f282153e) && L.f(this.f282154f, initial.f282154f) && L.f(this.f282155g, initial.f282155g);
        }

        public final int hashCode() {
            int iD2 = H.d(H.d(Long.hashCode(this.f282150b) * 31, 31, this.f282151c), 31, this.f282152d);
            String str = this.f282153e;
            int iHashCode = (iD2 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f282154f;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            List<PromoCode> list = this.f282155g;
            return iHashCode2 + (list != null ? list.hashCode() : 0);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Initial(itemId=");
            sb2.append(this.f282150b);
            sb2.append(", title=");
            sb2.append(this.f282151c);
            sb2.append(", buttonTitle=");
            sb2.append(this.f282152d);
            sb2.append(", inputHint=");
            sb2.append(this.f282153e);
            sb2.append(", bookingContext=");
            sb2.append(this.f282154f);
            sb2.append(", promoCodes=");
            return H.p(sb2, this.f282155g, ')');
        }
    }

    /* compiled from: PromoCodeInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/short_term_rent/bookingform/promocode/mvi/entity/PromoCodeInternalAction$ResetPromoCodesSelection;", "Lcom/avito/android/short_term_rent/bookingform/promocode/mvi/entity/PromoCodeInternalAction;", "<init>", "()V", "_avito_short-term-rent_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ResetPromoCodesSelection implements PromoCodeInternalAction {
        static {
            new ResetPromoCodesSelection();
        }

        private ResetPromoCodesSelection() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof ResetPromoCodesSelection);
        }

        public final int hashCode() {
            return -2075825553;
        }

        @k
        public final String toString() {
            return "ResetPromoCodesSelection";
        }
    }

    /* compiled from: PromoCodeInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/short_term_rent/bookingform/promocode/mvi/entity/PromoCodeInternalAction$ResponseError;", "Lcom/avito/android/short_term_rent/bookingform/promocode/mvi/entity/PromoCodeInternalAction;", "<init>", "()V", "_avito_short-term-rent_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ResponseError implements PromoCodeInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final ResponseError f282156b = new ResponseError();

        private ResponseError() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof ResponseError);
        }

        public final int hashCode() {
            return 1632920734;
        }

        @k
        public final String toString() {
            return "ResponseError";
        }
    }

    /* compiled from: PromoCodeInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/short_term_rent/bookingform/promocode/mvi/entity/PromoCodeInternalAction$ResponseValidationError;", "Lcom/avito/android/short_term_rent/bookingform/promocode/mvi/entity/PromoCodeInternalAction;", "_avito_short-term-rent_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ResponseValidationError implements PromoCodeInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final a.InterfaceC8419a.d f282157b;

        public ResponseValidationError(@k a.InterfaceC8419a.d dVar) {
            this.f282157b = dVar;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ResponseValidationError) && L.f(this.f282157b, ((ResponseValidationError) obj).f282157b);
        }

        public final int hashCode() {
            return this.f282157b.f282133a.hashCode();
        }

        @k
        public final String toString() {
            return "ResponseValidationError(error=" + this.f282157b + ')';
        }
    }

    /* compiled from: PromoCodeInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/short_term_rent/bookingform/promocode/mvi/entity/PromoCodeInternalAction$ShowToast;", "Lcom/avito/android/short_term_rent/bookingform/promocode/mvi/entity/PromoCodeInternalAction;", "_avito_short-term-rent_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ShowToast implements PromoCodeInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f282158b;

        public ShowToast(@k String str) {
            this.f282158b = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ShowToast) && L.f(this.f282158b, ((ShowToast) obj).f282158b);
        }

        public final int hashCode() {
            return this.f282158b.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("ShowToast(text="), this.f282158b, ')');
        }
    }

    /* compiled from: PromoCodeInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/short_term_rent/bookingform/promocode/mvi/entity/PromoCodeInternalAction$UpdatePromoCodeInput;", "Lcom/avito/android/short_term_rent/bookingform/promocode/mvi/entity/PromoCodeInternalAction;", "_avito_short-term-rent_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class UpdatePromoCodeInput implements PromoCodeInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f282159b;

        public UpdatePromoCodeInput(@k String str) {
            this.f282159b = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof UpdatePromoCodeInput) && L.f(this.f282159b, ((UpdatePromoCodeInput) obj).f282159b);
        }

        public final int hashCode() {
            return this.f282159b.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("UpdatePromoCodeInput(text="), this.f282159b, ')');
        }
    }

    /* compiled from: PromoCodeInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/short_term_rent/bookingform/promocode/mvi/entity/PromoCodeInternalAction$UpdatePromoCodesSelection;", "Lcom/avito/android/short_term_rent/bookingform/promocode/mvi/entity/PromoCodeInternalAction;", "_avito_short-term-rent_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class UpdatePromoCodesSelection implements PromoCodeInternalAction {

        /* renamed from: b, reason: collision with root package name */
        public final int f282160b;

        public UpdatePromoCodesSelection(int i12) {
            this.f282160b = i12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof UpdatePromoCodesSelection) && this.f282160b == ((UpdatePromoCodesSelection) obj).f282160b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f282160b);
        }

        @k
        public final String toString() {
            return r.t(new StringBuilder("UpdatePromoCodesSelection(index="), this.f282160b, ')');
        }
    }

    /* compiled from: PromoCodeInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/short_term_rent/bookingform/promocode/mvi/entity/PromoCodeInternalAction$ValidationLoading;", "Lcom/avito/android/short_term_rent/bookingform/promocode/mvi/entity/PromoCodeInternalAction;", "<init>", "()V", "_avito_short-term-rent_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ValidationLoading implements PromoCodeInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final ValidationLoading f282161b = new ValidationLoading();

        private ValidationLoading() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof ValidationLoading);
        }

        public final int hashCode() {
            return -693077670;
        }

        @k
        public final String toString() {
            return "ValidationLoading";
        }
    }
}
