package com.avito.android.str_calendar.seller.last_minute_offer.mvi.entity;

import AK.c;
import Ky0.d;
import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.screens.J;
import com.avito.android.analytics.screens.mvi.TrackableContent;
import com.avito.android.analytics.screens.mvi.TrackableError;
import com.avito.android.analytics.screens.mvi.TrackableLoadingStarted;
import com.avito.android.analytics.screens.mvi.n;
import com.avito.android.component.toast.f;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.remote.error.ApiError;
import com.avito.android.remote.model.StrSellerCalendarLastMinuteOfferResponse;
import com.avito.android.str_calendar.common.models.UpdatedParametersInfo;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: LastMinuteOfferInternalAction.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\n\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\u0082\u0001\n\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015¨\u0006\u0016"}, d2 = {"Lcom/avito/android/str_calendar/seller/last_minute_offer/mvi/entity/LastMinuteOfferInternalAction;", "Lcom/avito/android/analytics/screens/mvi/n;", "ChangeDiscountValue", "ChangeSelectedOption", "CheckSwitchToggle", "CloseScreen", "OpenKeyboard", "ShowContent", "ShowError", "ShowInputError", "ShowToast", "StartLoading", "Lcom/avito/android/str_calendar/seller/last_minute_offer/mvi/entity/LastMinuteOfferInternalAction$ChangeDiscountValue;", "Lcom/avito/android/str_calendar/seller/last_minute_offer/mvi/entity/LastMinuteOfferInternalAction$ChangeSelectedOption;", "Lcom/avito/android/str_calendar/seller/last_minute_offer/mvi/entity/LastMinuteOfferInternalAction$CheckSwitchToggle;", "Lcom/avito/android/str_calendar/seller/last_minute_offer/mvi/entity/LastMinuteOfferInternalAction$CloseScreen;", "Lcom/avito/android/str_calendar/seller/last_minute_offer/mvi/entity/LastMinuteOfferInternalAction$OpenKeyboard;", "Lcom/avito/android/str_calendar/seller/last_minute_offer/mvi/entity/LastMinuteOfferInternalAction$ShowContent;", "Lcom/avito/android/str_calendar/seller/last_minute_offer/mvi/entity/LastMinuteOfferInternalAction$ShowError;", "Lcom/avito/android/str_calendar/seller/last_minute_offer/mvi/entity/LastMinuteOfferInternalAction$ShowInputError;", "Lcom/avito/android/str_calendar/seller/last_minute_offer/mvi/entity/LastMinuteOfferInternalAction$ShowToast;", "Lcom/avito/android/str_calendar/seller/last_minute_offer/mvi/entity/LastMinuteOfferInternalAction$StartLoading;", "_avito_str-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface LastMinuteOfferInternalAction extends n {

    /* compiled from: LastMinuteOfferInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/str_calendar/seller/last_minute_offer/mvi/entity/LastMinuteOfferInternalAction$ChangeDiscountValue;", "Lcom/avito/android/str_calendar/seller/last_minute_offer/mvi/entity/LastMinuteOfferInternalAction;", "_avito_str-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ChangeDiscountValue implements LastMinuteOfferInternalAction {

        /* renamed from: b, reason: collision with root package name */
        public final int f287926b;

        public ChangeDiscountValue(int i12) {
            this.f287926b = i12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ChangeDiscountValue) && this.f287926b == ((ChangeDiscountValue) obj).f287926b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f287926b);
        }

        @k
        public final String toString() {
            return r.t(new StringBuilder("ChangeDiscountValue(value="), this.f287926b, ')');
        }
    }

    /* compiled from: LastMinuteOfferInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/str_calendar/seller/last_minute_offer/mvi/entity/LastMinuteOfferInternalAction$ChangeSelectedOption;", "Lcom/avito/android/str_calendar/seller/last_minute_offer/mvi/entity/LastMinuteOfferInternalAction;", "_avito_str-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ChangeSelectedOption implements LastMinuteOfferInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final d f287927b;

        public ChangeSelectedOption(@k d dVar) {
            this.f287927b = dVar;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ChangeSelectedOption) && L.f(this.f287927b, ((ChangeSelectedOption) obj).f287927b);
        }

        public final int hashCode() {
            return this.f287927b.hashCode();
        }

        @k
        public final String toString() {
            return "ChangeSelectedOption(option=" + this.f287927b + ')';
        }
    }

    /* compiled from: LastMinuteOfferInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/str_calendar/seller/last_minute_offer/mvi/entity/LastMinuteOfferInternalAction$CheckSwitchToggle;", "Lcom/avito/android/str_calendar/seller/last_minute_offer/mvi/entity/LastMinuteOfferInternalAction;", "_avito_str-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class CheckSwitchToggle implements LastMinuteOfferInternalAction {

        /* renamed from: b, reason: collision with root package name */
        public final boolean f287928b;

        public CheckSwitchToggle(boolean z12) {
            this.f287928b = z12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof CheckSwitchToggle) && this.f287928b == ((CheckSwitchToggle) obj).f287928b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f287928b);
        }

        @k
        public final String toString() {
            return r.x(new StringBuilder("CheckSwitchToggle(isChecked="), this.f287928b, ')');
        }
    }

    /* compiled from: LastMinuteOfferInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/str_calendar/seller/last_minute_offer/mvi/entity/LastMinuteOfferInternalAction$CloseScreen;", "Lcom/avito/android/str_calendar/seller/last_minute_offer/mvi/entity/LastMinuteOfferInternalAction;", "_avito_str-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class CloseScreen implements LastMinuteOfferInternalAction {

        /* renamed from: b, reason: collision with root package name */
        public final boolean f287929b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final UpdatedParametersInfo f287930c;

        public CloseScreen(boolean z12, @l UpdatedParametersInfo updatedParametersInfo) {
            this.f287929b = z12;
            this.f287930c = updatedParametersInfo;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof CloseScreen)) {
                return false;
            }
            CloseScreen closeScreen = (CloseScreen) obj;
            return this.f287929b == closeScreen.f287929b && L.f(this.f287930c, closeScreen.f287930c);
        }

        public final int hashCode() {
            int iHashCode = Boolean.hashCode(this.f287929b) * 31;
            UpdatedParametersInfo updatedParametersInfo = this.f287930c;
            return iHashCode + (updatedParametersInfo == null ? 0 : updatedParametersInfo.hashCode());
        }

        @k
        public final String toString() {
            return "CloseScreen(updateCalendar=" + this.f287929b + ", updatedParametersInfo=" + this.f287930c + ')';
        }
    }

    /* compiled from: LastMinuteOfferInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/str_calendar/seller/last_minute_offer/mvi/entity/LastMinuteOfferInternalAction$OpenKeyboard;", "Lcom/avito/android/str_calendar/seller/last_minute_offer/mvi/entity/LastMinuteOfferInternalAction;", "_avito_str-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class OpenKeyboard implements LastMinuteOfferInternalAction {

        /* renamed from: b, reason: collision with root package name */
        public final boolean f287931b;

        public OpenKeyboard(boolean z12) {
            this.f287931b = z12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OpenKeyboard) && this.f287931b == ((OpenKeyboard) obj).f287931b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f287931b);
        }

        @k
        public final String toString() {
            return r.x(new StringBuilder("OpenKeyboard(isKeyboardVisible="), this.f287931b, ')');
        }
    }

    /* compiled from: LastMinuteOfferInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/str_calendar/seller/last_minute_offer/mvi/entity/LastMinuteOfferInternalAction$ShowContent;", "Lcom/avito/android/str_calendar/seller/last_minute_offer/mvi/entity/LastMinuteOfferInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableContent;", "_avito_str-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ShowContent implements LastMinuteOfferInternalAction, TrackableContent {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final StrSellerCalendarLastMinuteOfferResponse f287932b;

        public ShowContent(@k StrSellerCalendarLastMinuteOfferResponse strSellerCalendarLastMinuteOfferResponse) {
            this.f287932b = strSellerCalendarLastMinuteOfferResponse;
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @l
        /* renamed from: d */
        public final String getF201644d() {
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
            return (obj instanceof ShowContent) && L.f(this.f287932b, ((ShowContent) obj).f287932b);
        }

        public final int hashCode() {
            return this.f287932b.hashCode();
        }

        @k
        public final String toString() {
            return "ShowContent(response=" + this.f287932b + ')';
        }
    }

    /* compiled from: LastMinuteOfferInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/str_calendar/seller/last_minute_offer/mvi/entity/LastMinuteOfferInternalAction$ShowError;", "Lcom/avito/android/str_calendar/seller/last_minute_offer/mvi/entity/LastMinuteOfferInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableError;", "_avito_str-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ShowError implements LastMinuteOfferInternalAction, TrackableError {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final ApiError f287933b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final J.a f287934c;

        public ShowError(@k ApiError apiError) {
            this.f287933b = apiError;
            this.f287934c = new J.a(apiError);
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @l
        /* renamed from: d */
        public final String getF201644d() {
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
            return (obj instanceof ShowError) && L.f(this.f287933b, ((ShowError) obj).f287933b);
        }

        @Override // com.avito.android.analytics.screens.mvi.TrackableError
        @k
        /* renamed from: g, reason: from getter */
        public final J.a getF248721e() {
            return this.f287934c;
        }

        public final int hashCode() {
            return this.f287933b.hashCode();
        }

        @k
        public final String toString() {
            return c.n(new StringBuilder("ShowError(error="), this.f287933b, ')');
        }
    }

    /* compiled from: LastMinuteOfferInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/str_calendar/seller/last_minute_offer/mvi/entity/LastMinuteOfferInternalAction$ShowInputError;", "Lcom/avito/android/str_calendar/seller/last_minute_offer/mvi/entity/LastMinuteOfferInternalAction;", "_avito_str-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ShowInputError implements LastMinuteOfferInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f287935b;

        public ShowInputError(@k String str) {
            this.f287935b = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof ShowInputError) {
                return L.f(this.f287935b, ((ShowInputError) obj).f287935b);
            }
            return false;
        }

        public final int hashCode() {
            return Boolean.hashCode(true) + (this.f287935b.hashCode() * 31);
        }

        @k
        public final String toString() {
            return c.s(new StringBuilder("ShowInputError(text="), this.f287935b, ", isErrorVisible=true)");
        }
    }

    /* compiled from: LastMinuteOfferInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/str_calendar/seller/last_minute_offer/mvi/entity/LastMinuteOfferInternalAction$ShowToast;", "Lcom/avito/android/str_calendar/seller/last_minute_offer/mvi/entity/LastMinuteOfferInternalAction;", "_avito_str-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ShowToast implements LastMinuteOfferInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final PrintableText f287936b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final f f287937c;

        public ShowToast(@k PrintableText printableText, @k f fVar) {
            this.f287936b = printableText;
            this.f287937c = fVar;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ShowToast)) {
                return false;
            }
            ShowToast showToast = (ShowToast) obj;
            return L.f(this.f287936b, showToast.f287936b) && L.f(this.f287937c, showToast.f287937c);
        }

        public final int hashCode() {
            return this.f287937c.hashCode() + (this.f287936b.hashCode() * 31);
        }

        @k
        public final String toString() {
            return "ShowToast(text=" + this.f287936b + ", type=" + this.f287937c + ')';
        }
    }

    /* compiled from: LastMinuteOfferInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/str_calendar/seller/last_minute_offer/mvi/entity/LastMinuteOfferInternalAction$StartLoading;", "Lcom/avito/android/str_calendar/seller/last_minute_offer/mvi/entity/LastMinuteOfferInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableLoadingStarted;", "()V", "_avito_str-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class StartLoading extends TrackableLoadingStarted implements LastMinuteOfferInternalAction {
    }
}
