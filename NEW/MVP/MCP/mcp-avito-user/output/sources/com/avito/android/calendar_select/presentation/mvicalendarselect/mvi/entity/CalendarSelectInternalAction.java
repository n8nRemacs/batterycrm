package com.avito.android.calendar_select.presentation.mvicalendarselect.mvi.entity;

import AK.c;
import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import com.avito.android.analytics.screens.J;
import com.avito.android.analytics.screens.mvi.TrackableContent;
import com.avito.android.analytics.screens.mvi.TrackableError;
import com.avito.android.analytics.screens.mvi.TrackableLoadingStarted;
import com.avito.android.analytics.screens.mvi.n;
import com.avito.android.calendar_select.presentation.view.data.m;
import java.time.LocalDate;
import java.util.List;
import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.jvm.internal.L;

/* compiled from: CalendarSelectInternalAction.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\t\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u0082\u0001\b\u000b\f\r\u000e\u000f\u0010\u0011\u0012¨\u0006\u0013"}, d2 = {"Lcom/avito/android/calendar_select/presentation/mvicalendarselect/mvi/entity/CalendarSelectInternalAction;", "Lcom/avito/android/analytics/screens/mvi/n;", "CalendarLoadFailed", "CalendarLoadSuccess", "ClearSelectedDates", "CloseScreen", "DatePicked", "DatesSelectionConfirmed", "InitCalendar", "LoadingStarted", "LoadingType", "Lcom/avito/android/calendar_select/presentation/mvicalendarselect/mvi/entity/CalendarSelectInternalAction$CalendarLoadFailed;", "Lcom/avito/android/calendar_select/presentation/mvicalendarselect/mvi/entity/CalendarSelectInternalAction$CalendarLoadSuccess;", "Lcom/avito/android/calendar_select/presentation/mvicalendarselect/mvi/entity/CalendarSelectInternalAction$ClearSelectedDates;", "Lcom/avito/android/calendar_select/presentation/mvicalendarselect/mvi/entity/CalendarSelectInternalAction$CloseScreen;", "Lcom/avito/android/calendar_select/presentation/mvicalendarselect/mvi/entity/CalendarSelectInternalAction$DatePicked;", "Lcom/avito/android/calendar_select/presentation/mvicalendarselect/mvi/entity/CalendarSelectInternalAction$DatesSelectionConfirmed;", "Lcom/avito/android/calendar_select/presentation/mvicalendarselect/mvi/entity/CalendarSelectInternalAction$InitCalendar;", "Lcom/avito/android/calendar_select/presentation/mvicalendarselect/mvi/entity/CalendarSelectInternalAction$LoadingStarted;", "_avito_calendar-select_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public interface CalendarSelectInternalAction extends n {

    /* compiled from: CalendarSelectInternalAction.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/calendar_select/presentation/mvicalendarselect/mvi/entity/CalendarSelectInternalAction$CalendarLoadFailed;", "Lcom/avito/android/calendar_select/presentation/mvicalendarselect/mvi/entity/CalendarSelectInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableError;", "_avito_calendar-select_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class CalendarLoadFailed implements CalendarSelectInternalAction, TrackableError {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final Throwable f113418b;

        public CalendarLoadFailed(@k Throwable th2) {
            this.f113418b = th2;
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @l
        /* renamed from: d */
        public final String getF220626e() {
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
            return (obj instanceof CalendarLoadFailed) && L.f(this.f113418b, ((CalendarLoadFailed) obj).f113418b);
        }

        @Override // com.avito.android.analytics.screens.mvi.TrackableError
        @k
        /* renamed from: g */
        public final J.a getF220594e() {
            return new J.a(this.f113418b);
        }

        public final int hashCode() {
            return this.f113418b.hashCode();
        }

        @k
        public final String toString() {
            return com.avito.android.advert.item.delivery_suggests.l.t(new StringBuilder("CalendarLoadFailed(error="), this.f113418b, ')');
        }
    }

    /* compiled from: CalendarSelectInternalAction.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/calendar_select/presentation/mvicalendarselect/mvi/entity/CalendarSelectInternalAction$CalendarLoadSuccess;", "Lcom/avito/android/calendar_select/presentation/mvicalendarselect/mvi/entity/CalendarSelectInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableContent;", "_avito_calendar-select_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class CalendarLoadSuccess implements CalendarSelectInternalAction, TrackableContent {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final m f113419b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final String f113420c;

        /* renamed from: d, reason: collision with root package name */
        @l
        public final String f113421d;

        /* renamed from: e, reason: collision with root package name */
        @l
        public final LocalDate f113422e;

        public CalendarLoadSuccess(@k m mVar, @l String str, @l String str2, @l LocalDate localDate) {
            this.f113419b = mVar;
            this.f113420c = str;
            this.f113421d = str2;
            this.f113422e = localDate;
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @l
        /* renamed from: d */
        public final String getF220626e() {
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
            if (!(obj instanceof CalendarLoadSuccess)) {
                return false;
            }
            CalendarLoadSuccess calendarLoadSuccess = (CalendarLoadSuccess) obj;
            return L.f(this.f113419b, calendarLoadSuccess.f113419b) && L.f(this.f113420c, calendarLoadSuccess.f113420c) && L.f(this.f113421d, calendarLoadSuccess.f113421d) && L.f(this.f113422e, calendarLoadSuccess.f113422e);
        }

        public final int hashCode() {
            int iHashCode = this.f113419b.hashCode() * 31;
            String str = this.f113420c;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f113421d;
            int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            LocalDate localDate = this.f113422e;
            return iHashCode3 + (localDate != null ? localDate.hashCode() : 0);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("CalendarLoadSuccess(dataSource=");
            sb2.append(this.f113419b);
            sb2.append(", calendarTitle=");
            sb2.append(this.f113420c);
            sb2.append(", selectButtonText=");
            sb2.append(this.f113421d);
            sb2.append(", dateToScrollTo=");
            return c.t(sb2, this.f113422e, ')');
        }
    }

    /* compiled from: CalendarSelectInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/calendar_select/presentation/mvicalendarselect/mvi/entity/CalendarSelectInternalAction$ClearSelectedDates;", "Lcom/avito/android/calendar_select/presentation/mvicalendarselect/mvi/entity/CalendarSelectInternalAction;", "()V", "_avito_calendar-select_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class ClearSelectedDates implements CalendarSelectInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final ClearSelectedDates f113423b = new ClearSelectedDates();

        private ClearSelectedDates() {
        }
    }

    /* compiled from: CalendarSelectInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/calendar_select/presentation/mvicalendarselect/mvi/entity/CalendarSelectInternalAction$CloseScreen;", "Lcom/avito/android/calendar_select/presentation/mvicalendarselect/mvi/entity/CalendarSelectInternalAction;", "()V", "_avito_calendar-select_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class CloseScreen implements CalendarSelectInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final CloseScreen f113424b = new CloseScreen();

        private CloseScreen() {
        }
    }

    /* compiled from: CalendarSelectInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/calendar_select/presentation/mvicalendarselect/mvi/entity/CalendarSelectInternalAction$DatePicked;", "Lcom/avito/android/calendar_select/presentation/mvicalendarselect/mvi/entity/CalendarSelectInternalAction;", "_avito_calendar-select_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class DatePicked implements CalendarSelectInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final LocalDate f113425b;

        public DatePicked(@k LocalDate localDate) {
            this.f113425b = localDate;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof DatePicked) && L.f(this.f113425b, ((DatePicked) obj).f113425b);
        }

        public final int hashCode() {
            return this.f113425b.hashCode();
        }

        @k
        public final String toString() {
            return c.t(new StringBuilder("DatePicked(date="), this.f113425b, ')');
        }
    }

    /* compiled from: CalendarSelectInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/calendar_select/presentation/mvicalendarselect/mvi/entity/CalendarSelectInternalAction$DatesSelectionConfirmed;", "Lcom/avito/android/calendar_select/presentation/mvicalendarselect/mvi/entity/CalendarSelectInternalAction;", "_avito_calendar-select_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class DatesSelectionConfirmed implements CalendarSelectInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final List<LocalDate> f113426b;

        public DatesSelectionConfirmed(@k List<LocalDate> list) {
            this.f113426b = list;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof DatesSelectionConfirmed) && L.f(this.f113426b, ((DatesSelectionConfirmed) obj).f113426b);
        }

        public final int hashCode() {
            return this.f113426b.hashCode();
        }

        @k
        public final String toString() {
            return H.p(new StringBuilder("DatesSelectionConfirmed(selectedDates="), this.f113426b, ')');
        }
    }

    /* compiled from: CalendarSelectInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/calendar_select/presentation/mvicalendarselect/mvi/entity/CalendarSelectInternalAction$InitCalendar;", "Lcom/avito/android/calendar_select/presentation/mvicalendarselect/mvi/entity/CalendarSelectInternalAction;", "_avito_calendar-select_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class InitCalendar implements CalendarSelectInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final m f113427b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final String f113428c;

        /* renamed from: d, reason: collision with root package name */
        @l
        public final String f113429d;

        /* renamed from: e, reason: collision with root package name */
        @l
        public final LocalDate f113430e;

        public InitCalendar(@k m mVar, @l String str, @l String str2, @l LocalDate localDate) {
            this.f113427b = mVar;
            this.f113428c = str;
            this.f113429d = str2;
            this.f113430e = localDate;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof InitCalendar)) {
                return false;
            }
            InitCalendar initCalendar = (InitCalendar) obj;
            return L.f(this.f113427b, initCalendar.f113427b) && L.f(this.f113428c, initCalendar.f113428c) && L.f(this.f113429d, initCalendar.f113429d) && L.f(this.f113430e, initCalendar.f113430e);
        }

        public final int hashCode() {
            int iHashCode = this.f113427b.hashCode() * 31;
            String str = this.f113428c;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f113429d;
            int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            LocalDate localDate = this.f113430e;
            return iHashCode3 + (localDate != null ? localDate.hashCode() : 0);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("InitCalendar(dataSource=");
            sb2.append(this.f113427b);
            sb2.append(", calendarTitle=");
            sb2.append(this.f113428c);
            sb2.append(", selectButtonText=");
            sb2.append(this.f113429d);
            sb2.append(", dateToScrollTo=");
            return c.t(sb2, this.f113430e, ')');
        }
    }

    /* compiled from: CalendarSelectInternalAction.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/calendar_select/presentation/mvicalendarselect/mvi/entity/CalendarSelectInternalAction$LoadingStarted;", "Lcom/avito/android/calendar_select/presentation/mvicalendarselect/mvi/entity/CalendarSelectInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableLoadingStarted;", "_avito_calendar-select_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class LoadingStarted extends TrackableLoadingStarted implements CalendarSelectInternalAction {

        /* renamed from: d, reason: collision with root package name */
        @k
        public final LoadingType f113431d;

        public LoadingStarted(@k LoadingType loadingType) {
            this.f113431d = loadingType;
        }

        @Override // com.avito.android.analytics.screens.mvi.TrackableLoadingStarted, com.avito.android.analytics.screens.mvi.s
        @k
        /* renamed from: d */
        public final String getF220626e() {
            return this.f113431d.name();
        }

        @Override // com.avito.android.analytics.screens.mvi.TrackableLoadingStarted
        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof LoadingStarted) && this.f113431d == ((LoadingStarted) obj).f113431d;
        }

        @Override // com.avito.android.analytics.screens.mvi.TrackableLoadingStarted
        public final int hashCode() {
            return this.f113431d.hashCode();
        }

        @k
        public final String toString() {
            return "LoadingStarted(type=" + this.f113431d + ')';
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CalendarSelectInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/calendar_select/presentation/mvicalendarselect/mvi/entity/CalendarSelectInternalAction$LoadingType;", "", "_avito_calendar-select_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class LoadingType {

        /* renamed from: b, reason: collision with root package name */
        public static final LoadingType f113432b;

        /* renamed from: c, reason: collision with root package name */
        public static final LoadingType f113433c;

        /* renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ LoadingType[] f113434d;

        /* renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ a f113435e;

        static {
            LoadingType loadingType = new LoadingType("INITIAL_SETTINGS", 0);
            f113432b = loadingType;
            LoadingType loadingType2 = new LoadingType("RELOAD_AFTER_ERROR", 1);
            f113433c = loadingType2;
            LoadingType[] loadingTypeArr = {loadingType, loadingType2};
            f113434d = loadingTypeArr;
            f113435e = kotlin.enums.c.a(loadingTypeArr);
        }

        public LoadingType() {
            throw null;
        }

        public static LoadingType valueOf(String str) {
            return (LoadingType) Enum.valueOf(LoadingType.class, str);
        }

        public static LoadingType[] values() {
            return (LoadingType[]) f113434d.clone();
        }
    }
}
