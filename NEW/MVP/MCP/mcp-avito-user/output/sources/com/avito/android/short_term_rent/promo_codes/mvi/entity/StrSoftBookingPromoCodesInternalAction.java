package com.avito.android.short_term_rent.promo_codes.mvi.entity;

import AK.c;
import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.runtime.C22026a;
import com.avito.android.analytics.screens.mvi.n;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.remote.error.ApiError;
import com.avito.android.short_term_rent.common.entity.PromoCode;
import com.avito.android.short_term_rent.promo_codes.ui.StrSoftBookingPromoCodesDialogOpenParams;
import com.avito.android.short_term_rent.promo_codes.ui.StrSoftBookingPromoCodesDialogResult;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: StrSoftBookingPromoCodesInternalAction.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u000b\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\u0082\u0001\u000b\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017¨\u0006\u0018"}, d2 = {"Lcom/avito/android/short_term_rent/promo_codes/mvi/entity/StrSoftBookingPromoCodesInternalAction;", "Lcom/avito/android/analytics/screens/mvi/n;", "ChangeInputPromoCodeValue", "ChangeSelectedPromoCode", "CloseScreen", "DisablePromoCode", "RequestFocus", "SetResult", "ShowApplyError", "ShowApplySuccess", "ShowApplyValidationError", "ShowInitialContent", "StartApplyLoading", "Lcom/avito/android/short_term_rent/promo_codes/mvi/entity/StrSoftBookingPromoCodesInternalAction$ChangeInputPromoCodeValue;", "Lcom/avito/android/short_term_rent/promo_codes/mvi/entity/StrSoftBookingPromoCodesInternalAction$ChangeSelectedPromoCode;", "Lcom/avito/android/short_term_rent/promo_codes/mvi/entity/StrSoftBookingPromoCodesInternalAction$CloseScreen;", "Lcom/avito/android/short_term_rent/promo_codes/mvi/entity/StrSoftBookingPromoCodesInternalAction$DisablePromoCode;", "Lcom/avito/android/short_term_rent/promo_codes/mvi/entity/StrSoftBookingPromoCodesInternalAction$RequestFocus;", "Lcom/avito/android/short_term_rent/promo_codes/mvi/entity/StrSoftBookingPromoCodesInternalAction$SetResult;", "Lcom/avito/android/short_term_rent/promo_codes/mvi/entity/StrSoftBookingPromoCodesInternalAction$ShowApplyError;", "Lcom/avito/android/short_term_rent/promo_codes/mvi/entity/StrSoftBookingPromoCodesInternalAction$ShowApplySuccess;", "Lcom/avito/android/short_term_rent/promo_codes/mvi/entity/StrSoftBookingPromoCodesInternalAction$ShowApplyValidationError;", "Lcom/avito/android/short_term_rent/promo_codes/mvi/entity/StrSoftBookingPromoCodesInternalAction$ShowInitialContent;", "Lcom/avito/android/short_term_rent/promo_codes/mvi/entity/StrSoftBookingPromoCodesInternalAction$StartApplyLoading;", "_avito_short-term-rent_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface StrSoftBookingPromoCodesInternalAction extends n {

    /* compiled from: StrSoftBookingPromoCodesInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/short_term_rent/promo_codes/mvi/entity/StrSoftBookingPromoCodesInternalAction$ChangeInputPromoCodeValue;", "Lcom/avito/android/short_term_rent/promo_codes/mvi/entity/StrSoftBookingPromoCodesInternalAction;", "_avito_short-term-rent_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ChangeInputPromoCodeValue implements StrSoftBookingPromoCodesInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f282461b;

        public ChangeInputPromoCodeValue(@k String str) {
            this.f282461b = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ChangeInputPromoCodeValue) && L.f(this.f282461b, ((ChangeInputPromoCodeValue) obj).f282461b);
        }

        public final int hashCode() {
            return this.f282461b.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("ChangeInputPromoCodeValue(newValue="), this.f282461b, ')');
        }
    }

    /* compiled from: StrSoftBookingPromoCodesInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/short_term_rent/promo_codes/mvi/entity/StrSoftBookingPromoCodesInternalAction$ChangeSelectedPromoCode;", "Lcom/avito/android/short_term_rent/promo_codes/mvi/entity/StrSoftBookingPromoCodesInternalAction;", "_avito_short-term-rent_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ChangeSelectedPromoCode implements StrSoftBookingPromoCodesInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final PromoCode f282462b;

        public ChangeSelectedPromoCode(@k PromoCode promoCode) {
            this.f282462b = promoCode;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ChangeSelectedPromoCode) && L.f(this.f282462b, ((ChangeSelectedPromoCode) obj).f282462b);
        }

        public final int hashCode() {
            return this.f282462b.hashCode();
        }

        @k
        public final String toString() {
            return "ChangeSelectedPromoCode(newPromoCode=" + this.f282462b + ')';
        }
    }

    /* compiled from: StrSoftBookingPromoCodesInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/short_term_rent/promo_codes/mvi/entity/StrSoftBookingPromoCodesInternalAction$CloseScreen;", "Lcom/avito/android/short_term_rent/promo_codes/mvi/entity/StrSoftBookingPromoCodesInternalAction;", "<init>", "()V", "_avito_short-term-rent_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class CloseScreen implements StrSoftBookingPromoCodesInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final CloseScreen f282463b = new CloseScreen();

        private CloseScreen() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof CloseScreen);
        }

        public final int hashCode() {
            return -835767565;
        }

        @k
        public final String toString() {
            return "CloseScreen";
        }
    }

    /* compiled from: StrSoftBookingPromoCodesInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/short_term_rent/promo_codes/mvi/entity/StrSoftBookingPromoCodesInternalAction$DisablePromoCode;", "Lcom/avito/android/short_term_rent/promo_codes/mvi/entity/StrSoftBookingPromoCodesInternalAction;", "_avito_short-term-rent_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class DisablePromoCode implements StrSoftBookingPromoCodesInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @l
        public final PrintableText f282464b;

        public DisablePromoCode(@l PrintableText printableText) {
            this.f282464b = printableText;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof DisablePromoCode) && L.f(this.f282464b, ((DisablePromoCode) obj).f282464b);
        }

        public final int hashCode() {
            PrintableText printableText = this.f282464b;
            if (printableText == null) {
                return 0;
            }
            return printableText.hashCode();
        }

        @k
        public final String toString() {
            return c.m(new StringBuilder("DisablePromoCode(message="), this.f282464b, ')');
        }
    }

    /* compiled from: StrSoftBookingPromoCodesInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/short_term_rent/promo_codes/mvi/entity/StrSoftBookingPromoCodesInternalAction$RequestFocus;", "Lcom/avito/android/short_term_rent/promo_codes/mvi/entity/StrSoftBookingPromoCodesInternalAction;", "_avito_short-term-rent_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class RequestFocus implements StrSoftBookingPromoCodesInternalAction {

        /* renamed from: b, reason: collision with root package name */
        public final boolean f282465b;

        public RequestFocus(boolean z12) {
            this.f282465b = z12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof RequestFocus) && this.f282465b == ((RequestFocus) obj).f282465b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f282465b);
        }

        @k
        public final String toString() {
            return r.x(new StringBuilder("RequestFocus(shouldRequest="), this.f282465b, ')');
        }
    }

    /* compiled from: StrSoftBookingPromoCodesInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/short_term_rent/promo_codes/mvi/entity/StrSoftBookingPromoCodesInternalAction$SetResult;", "Lcom/avito/android/short_term_rent/promo_codes/mvi/entity/StrSoftBookingPromoCodesInternalAction;", "_avito_short-term-rent_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class SetResult implements StrSoftBookingPromoCodesInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final StrSoftBookingPromoCodesDialogResult f282466b;

        public SetResult(@k StrSoftBookingPromoCodesDialogResult strSoftBookingPromoCodesDialogResult) {
            this.f282466b = strSoftBookingPromoCodesDialogResult;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof SetResult) && L.f(this.f282466b, ((SetResult) obj).f282466b);
        }

        public final int hashCode() {
            return this.f282466b.hashCode();
        }

        @k
        public final String toString() {
            return "SetResult(result=" + this.f282466b + ')';
        }
    }

    /* compiled from: StrSoftBookingPromoCodesInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/short_term_rent/promo_codes/mvi/entity/StrSoftBookingPromoCodesInternalAction$ShowApplyError;", "Lcom/avito/android/short_term_rent/promo_codes/mvi/entity/StrSoftBookingPromoCodesInternalAction;", "_avito_short-term-rent_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ShowApplyError implements StrSoftBookingPromoCodesInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final ApiError f282467b;

        public ShowApplyError(@k ApiError apiError) {
            this.f282467b = apiError;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ShowApplyError) && L.f(this.f282467b, ((ShowApplyError) obj).f282467b);
        }

        public final int hashCode() {
            return this.f282467b.hashCode();
        }

        @k
        public final String toString() {
            return c.n(new StringBuilder("ShowApplyError(error="), this.f282467b, ')');
        }
    }

    /* compiled from: StrSoftBookingPromoCodesInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/short_term_rent/promo_codes/mvi/entity/StrSoftBookingPromoCodesInternalAction$ShowApplySuccess;", "Lcom/avito/android/short_term_rent/promo_codes/mvi/entity/StrSoftBookingPromoCodesInternalAction;", "_avito_short-term-rent_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ShowApplySuccess implements StrSoftBookingPromoCodesInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @l
        public final String f282468b;

        public ShowApplySuccess(@l String str) {
            this.f282468b = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ShowApplySuccess) && L.f(this.f282468b, ((ShowApplySuccess) obj).f282468b);
        }

        public final int hashCode() {
            String str = this.f282468b;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("ShowApplySuccess(message="), this.f282468b, ')');
        }
    }

    /* compiled from: StrSoftBookingPromoCodesInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/short_term_rent/promo_codes/mvi/entity/StrSoftBookingPromoCodesInternalAction$ShowApplyValidationError;", "Lcom/avito/android/short_term_rent/promo_codes/mvi/entity/StrSoftBookingPromoCodesInternalAction;", "_avito_short-term-rent_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ShowApplyValidationError implements StrSoftBookingPromoCodesInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @l
        public final String f282469b;

        public ShowApplyValidationError(@l String str) {
            this.f282469b = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ShowApplyValidationError) && L.f(this.f282469b, ((ShowApplyValidationError) obj).f282469b);
        }

        public final int hashCode() {
            String str = this.f282469b;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("ShowApplyValidationError(message="), this.f282469b, ')');
        }
    }

    /* compiled from: StrSoftBookingPromoCodesInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/short_term_rent/promo_codes/mvi/entity/StrSoftBookingPromoCodesInternalAction$ShowInitialContent;", "Lcom/avito/android/short_term_rent/promo_codes/mvi/entity/StrSoftBookingPromoCodesInternalAction;", "_avito_short-term-rent_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ShowInitialContent implements StrSoftBookingPromoCodesInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final StrSoftBookingPromoCodesDialogOpenParams f282470b;

        public ShowInitialContent(@k StrSoftBookingPromoCodesDialogOpenParams strSoftBookingPromoCodesDialogOpenParams) {
            this.f282470b = strSoftBookingPromoCodesDialogOpenParams;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ShowInitialContent) && L.f(this.f282470b, ((ShowInitialContent) obj).f282470b);
        }

        public final int hashCode() {
            return this.f282470b.hashCode();
        }

        @k
        public final String toString() {
            return "ShowInitialContent(openParams=" + this.f282470b + ')';
        }
    }

    /* compiled from: StrSoftBookingPromoCodesInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/short_term_rent/promo_codes/mvi/entity/StrSoftBookingPromoCodesInternalAction$StartApplyLoading;", "Lcom/avito/android/short_term_rent/promo_codes/mvi/entity/StrSoftBookingPromoCodesInternalAction;", "<init>", "()V", "_avito_short-term-rent_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class StartApplyLoading implements StrSoftBookingPromoCodesInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final StartApplyLoading f282471b = new StartApplyLoading();

        private StartApplyLoading() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof StartApplyLoading);
        }

        public final int hashCode() {
            return -1503156577;
        }

        @k
        public final String toString() {
            return "StartApplyLoading";
        }
    }
}
