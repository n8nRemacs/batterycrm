package com.avito.android.str_calendar.booking_calendar.mvi.entity;

import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.akita.compose.component.accordion.s;
import com.avito.android.analytics.screens.J;
import com.avito.android.analytics.screens.mvi.TrackableContent;
import com.avito.android.analytics.screens.mvi.TrackableError;
import com.avito.android.analytics.screens.mvi.TrackableLoadingStarted;
import com.avito.android.analytics.screens.mvi.n;
import com.avito.android.bxcontent.mvi.entity.f;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.str_calendar.booking_calendar.model.StrBookingCalendarInitParameters;
import com.avito.android.str_calendar.common.models.DateRange;
import com.avito.android.str_calendar.common.models.SelectedDateRange;
import java.util.Date;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import oy0.C44956a;
import vy0.C49398a;

/* compiled from: StrBookingCalendarInternalAction.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u000b\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\u0082\u0001\u000b\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017¨\u0006\u0018"}, d2 = {"Lcom/avito/android/str_calendar/booking_calendar/mvi/entity/StrBookingCalendarInternalAction;", "Lcom/avito/android/analytics/screens/mvi/n;", "ClearSelection", "CloseScreen", "DayClick", "HideRestrictionToast", "Init", "PassSelectedDateRange", "ShowCalendarContent", "ShowError", "ShowLoading", "ShowRestrictionToast", "ShowValidationDialog", "Lcom/avito/android/str_calendar/booking_calendar/mvi/entity/StrBookingCalendarInternalAction$ClearSelection;", "Lcom/avito/android/str_calendar/booking_calendar/mvi/entity/StrBookingCalendarInternalAction$CloseScreen;", "Lcom/avito/android/str_calendar/booking_calendar/mvi/entity/StrBookingCalendarInternalAction$DayClick;", "Lcom/avito/android/str_calendar/booking_calendar/mvi/entity/StrBookingCalendarInternalAction$HideRestrictionToast;", "Lcom/avito/android/str_calendar/booking_calendar/mvi/entity/StrBookingCalendarInternalAction$Init;", "Lcom/avito/android/str_calendar/booking_calendar/mvi/entity/StrBookingCalendarInternalAction$PassSelectedDateRange;", "Lcom/avito/android/str_calendar/booking_calendar/mvi/entity/StrBookingCalendarInternalAction$ShowCalendarContent;", "Lcom/avito/android/str_calendar/booking_calendar/mvi/entity/StrBookingCalendarInternalAction$ShowError;", "Lcom/avito/android/str_calendar/booking_calendar/mvi/entity/StrBookingCalendarInternalAction$ShowLoading;", "Lcom/avito/android/str_calendar/booking_calendar/mvi/entity/StrBookingCalendarInternalAction$ShowRestrictionToast;", "Lcom/avito/android/str_calendar/booking_calendar/mvi/entity/StrBookingCalendarInternalAction$ShowValidationDialog;", "_avito_str-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface StrBookingCalendarInternalAction extends n {

    /* compiled from: StrBookingCalendarInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/str_calendar/booking_calendar/mvi/entity/StrBookingCalendarInternalAction$ClearSelection;", "Lcom/avito/android/str_calendar/booking_calendar/mvi/entity/StrBookingCalendarInternalAction;", "<init>", "()V", "_avito_str-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ClearSelection implements StrBookingCalendarInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final ClearSelection f286406b = new ClearSelection();

        private ClearSelection() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof ClearSelection);
        }

        public final int hashCode() {
            return 654751914;
        }

        @k
        public final String toString() {
            return "ClearSelection";
        }
    }

    /* compiled from: StrBookingCalendarInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/str_calendar/booking_calendar/mvi/entity/StrBookingCalendarInternalAction$CloseScreen;", "Lcom/avito/android/str_calendar/booking_calendar/mvi/entity/StrBookingCalendarInternalAction;", "<init>", "()V", "_avito_str-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class CloseScreen implements StrBookingCalendarInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final CloseScreen f286407b = new CloseScreen();

        private CloseScreen() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof CloseScreen);
        }

        public final int hashCode() {
            return 1437366649;
        }

        @k
        public final String toString() {
            return "CloseScreen";
        }
    }

    /* compiled from: StrBookingCalendarInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/str_calendar/booking_calendar/mvi/entity/StrBookingCalendarInternalAction$DayClick;", "Lcom/avito/android/str_calendar/booking_calendar/mvi/entity/StrBookingCalendarInternalAction;", "_avito_str-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class DayClick implements StrBookingCalendarInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final Date f286408b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final SelectedDateRange f286409c;

        public DayClick(@k Date date, @k SelectedDateRange selectedDateRange) {
            this.f286408b = date;
            this.f286409c = selectedDateRange;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof DayClick)) {
                return false;
            }
            DayClick dayClick = (DayClick) obj;
            return L.f(this.f286408b, dayClick.f286408b) && L.f(this.f286409c, dayClick.f286409c);
        }

        public final int hashCode() {
            return this.f286409c.hashCode() + (this.f286408b.hashCode() * 31);
        }

        @k
        public final String toString() {
            return "DayClick(date=" + this.f286408b + ", selectedDateRange=" + this.f286409c + ')';
        }
    }

    /* compiled from: StrBookingCalendarInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/str_calendar/booking_calendar/mvi/entity/StrBookingCalendarInternalAction$HideRestrictionToast;", "Lcom/avito/android/str_calendar/booking_calendar/mvi/entity/StrBookingCalendarInternalAction;", "<init>", "()V", "_avito_str-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class HideRestrictionToast implements StrBookingCalendarInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final HideRestrictionToast f286410b = new HideRestrictionToast();

        private HideRestrictionToast() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof HideRestrictionToast);
        }

        public final int hashCode() {
            return -62625336;
        }

        @k
        public final String toString() {
            return "HideRestrictionToast";
        }
    }

    /* compiled from: StrBookingCalendarInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/str_calendar/booking_calendar/mvi/entity/StrBookingCalendarInternalAction$Init;", "Lcom/avito/android/str_calendar/booking_calendar/mvi/entity/StrBookingCalendarInternalAction;", "_avito_str-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Init implements StrBookingCalendarInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final StrBookingCalendarInitParameters f286411b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final Date f286412c;

        public Init(@k StrBookingCalendarInitParameters strBookingCalendarInitParameters, @k Date date) {
            this.f286411b = strBookingCalendarInitParameters;
            this.f286412c = date;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Init)) {
                return false;
            }
            Init init = (Init) obj;
            return L.f(this.f286411b, init.f286411b) && L.f(this.f286412c, init.f286412c);
        }

        public final int hashCode() {
            return this.f286412c.hashCode() + (this.f286411b.hashCode() * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Init(initParameters=");
            sb2.append(this.f286411b);
            sb2.append(", todayDate=");
            return f.n(sb2, this.f286412c, ')');
        }
    }

    /* compiled from: StrBookingCalendarInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/str_calendar/booking_calendar/mvi/entity/StrBookingCalendarInternalAction$PassSelectedDateRange;", "Lcom/avito/android/str_calendar/booking_calendar/mvi/entity/StrBookingCalendarInternalAction;", "_avito_str-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class PassSelectedDateRange implements StrBookingCalendarInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final DateRange f286413b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final String f286414c;

        public PassSelectedDateRange(@k DateRange dateRange, @l String str) {
            this.f286413b = dateRange;
            this.f286414c = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PassSelectedDateRange)) {
                return false;
            }
            PassSelectedDateRange passSelectedDateRange = (PassSelectedDateRange) obj;
            return L.f(this.f286413b, passSelectedDateRange.f286413b) && L.f(this.f286414c, passSelectedDateRange.f286414c);
        }

        public final int hashCode() {
            int iHashCode = this.f286413b.hashCode() * 31;
            String str = this.f286414c;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("PassSelectedDateRange(selectedDateRange=");
            sb2.append(this.f286413b);
            sb2.append(", requestId=");
            return C22026a.c(sb2, this.f286414c, ')');
        }
    }

    /* compiled from: StrBookingCalendarInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/str_calendar/booking_calendar/mvi/entity/StrBookingCalendarInternalAction$ShowCalendarContent;", "Lcom/avito/android/str_calendar/booking_calendar/mvi/entity/StrBookingCalendarInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableContent;", "_avito_str-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ShowCalendarContent implements StrBookingCalendarInternalAction, TrackableContent {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final C44956a f286415b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final List<C49398a> f286416c;

        /* renamed from: d, reason: collision with root package name */
        @l
        public final Integer f286417d;

        public ShowCalendarContent(@k C44956a c44956a, @k List<C49398a> list, @l Integer num) {
            this.f286415b = c44956a;
            this.f286416c = list;
            this.f286417d = num;
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @l
        /* renamed from: d */
        public final String getF203255e() {
            return null;
        }

        @Override // com.avito.android.analytics.screens.mvi.t
        @l
        /* renamed from: e */
        public final String getF314460f() {
            return null;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ShowCalendarContent)) {
                return false;
            }
            ShowCalendarContent showCalendarContent = (ShowCalendarContent) obj;
            return L.f(this.f286415b, showCalendarContent.f286415b) && L.f(this.f286416c, showCalendarContent.f286416c) && L.f(this.f286417d, showCalendarContent.f286417d);
        }

        public final int hashCode() {
            int iE2 = H.e(this.f286415b.f422375a.hashCode() * 31, 31, this.f286416c);
            Integer num = this.f286417d;
            return iE2 + (num == null ? 0 : num.hashCode());
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ShowCalendarContent(strBookingCalendarData=");
            sb2.append(this.f286415b);
            sb2.append(", bookingCalendarItems=");
            sb2.append(this.f286416c);
            sb2.append(", scrollToPosition=");
            return s.j(sb2, this.f286417d, ')');
        }
    }

    /* compiled from: StrBookingCalendarInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/str_calendar/booking_calendar/mvi/entity/StrBookingCalendarInternalAction$ShowError;", "Lcom/avito/android/str_calendar/booking_calendar/mvi/entity/StrBookingCalendarInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableError;", "_avito_str-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ShowError implements StrBookingCalendarInternalAction, TrackableError {

        /* renamed from: b, reason: collision with root package name */
        @l
        public final PrintableText f286418b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final J.a f286419c;

        public ShowError(@k J.a aVar, @l PrintableText printableText) {
            this.f286418b = printableText;
            this.f286419c = aVar;
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @l
        /* renamed from: d */
        public final String getF203255e() {
            return null;
        }

        @Override // com.avito.android.analytics.screens.mvi.t
        @l
        /* renamed from: e */
        public final String getF314460f() {
            return null;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ShowError)) {
                return false;
            }
            ShowError showError = (ShowError) obj;
            return L.f(this.f286418b, showError.f286418b) && L.f(this.f286419c, showError.f286419c);
        }

        @Override // com.avito.android.analytics.screens.mvi.TrackableError
        @k
        /* renamed from: g, reason: from getter */
        public final J.a getF257334c() {
            return this.f286419c;
        }

        public final int hashCode() {
            PrintableText printableText = this.f286418b;
            return this.f286419c.f90384a.hashCode() + ((printableText == null ? 0 : printableText.hashCode()) * 31);
        }

        @k
        public final String toString() {
            return "ShowError(errorMessage=" + this.f286418b + ", failure=" + this.f286419c + ')';
        }
    }

    /* compiled from: StrBookingCalendarInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/str_calendar/booking_calendar/mvi/entity/StrBookingCalendarInternalAction$ShowLoading;", "Lcom/avito/android/str_calendar/booking_calendar/mvi/entity/StrBookingCalendarInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableLoadingStarted;", "()V", "_avito_str-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class ShowLoading extends TrackableLoadingStarted implements StrBookingCalendarInternalAction {
    }

    /* compiled from: StrBookingCalendarInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/str_calendar/booking_calendar/mvi/entity/StrBookingCalendarInternalAction$ShowRestrictionToast;", "Lcom/avito/android/str_calendar/booking_calendar/mvi/entity/StrBookingCalendarInternalAction;", "_avito_str-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ShowRestrictionToast implements StrBookingCalendarInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f286420b;

        public ShowRestrictionToast(@k String str) {
            this.f286420b = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ShowRestrictionToast) && L.f(this.f286420b, ((ShowRestrictionToast) obj).f286420b);
        }

        public final int hashCode() {
            return this.f286420b.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("ShowRestrictionToast(message="), this.f286420b, ')');
        }
    }

    /* compiled from: StrBookingCalendarInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/str_calendar/booking_calendar/mvi/entity/StrBookingCalendarInternalAction$ShowValidationDialog;", "Lcom/avito/android/str_calendar/booking_calendar/mvi/entity/StrBookingCalendarInternalAction;", "_avito_str-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ShowValidationDialog implements StrBookingCalendarInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f286421b;

        public ShowValidationDialog(@k String str) {
            this.f286421b = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ShowValidationDialog) && L.f(this.f286421b, ((ShowValidationDialog) obj).f286421b);
        }

        public final int hashCode() {
            return this.f286421b.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("ShowValidationDialog(validationErrorText="), this.f286421b, ')');
        }
    }
}
