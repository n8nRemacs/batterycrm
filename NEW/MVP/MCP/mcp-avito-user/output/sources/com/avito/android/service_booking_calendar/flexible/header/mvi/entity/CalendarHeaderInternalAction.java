package com.avito.android.service_booking_calendar.flexible.header.mvi.entity;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.ui.graphics.colorspace.e;
import com.avito.android.actions_sheet.a;
import com.avito.android.analytics.screens.J;
import com.avito.android.analytics.screens.mvi.TrackableContent;
import com.avito.android.analytics.screens.mvi.TrackableError;
import com.avito.android.analytics.screens.mvi.TrackableLoadingStarted;
import com.avito.android.analytics.screens.mvi.n;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.service_booking_calendar.day.schedule.domain.DayItem;
import com.avito.android.service_booking_calendar.day.schedule.domain.FlexibleCalendarDayItem;
import com.avito.android.service_booking_calendar.domain.b;
import com.avito.android.service_booking_calendar.flexible.data.domain.WeekItem;
import com.avito.android.service_booking_calendar.flexible.header.mvi.entity.CalendarHeaderState;
import it0.C42108c;
import it0.InterfaceC42106a;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: CalendarHeaderInternalAction.kt */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u000e\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0082\u0001\u000e\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d¨\u0006\u001e"}, d2 = {"Lcom/avito/android/service_booking_calendar/flexible/header/mvi/entity/CalendarHeaderInternalAction;", "Lcom/avito/android/analytics/screens/mvi/n;", "CloseTooltip", "Finish", "HideHeader", "InvalidateHeader", "LaunchDeepLink", "SelectDay", "SetMode", "ShowDefaultError", "ShowErrorWithMessage", "ShowHeader", "ShowLoading", "SwitchMode", "UpdateHeader", "UpdatedScheduleInfo", "Lcom/avito/android/service_booking_calendar/flexible/header/mvi/entity/CalendarHeaderInternalAction$CloseTooltip;", "Lcom/avito/android/service_booking_calendar/flexible/header/mvi/entity/CalendarHeaderInternalAction$Finish;", "Lcom/avito/android/service_booking_calendar/flexible/header/mvi/entity/CalendarHeaderInternalAction$HideHeader;", "Lcom/avito/android/service_booking_calendar/flexible/header/mvi/entity/CalendarHeaderInternalAction$InvalidateHeader;", "Lcom/avito/android/service_booking_calendar/flexible/header/mvi/entity/CalendarHeaderInternalAction$LaunchDeepLink;", "Lcom/avito/android/service_booking_calendar/flexible/header/mvi/entity/CalendarHeaderInternalAction$SelectDay;", "Lcom/avito/android/service_booking_calendar/flexible/header/mvi/entity/CalendarHeaderInternalAction$SetMode;", "Lcom/avito/android/service_booking_calendar/flexible/header/mvi/entity/CalendarHeaderInternalAction$ShowDefaultError;", "Lcom/avito/android/service_booking_calendar/flexible/header/mvi/entity/CalendarHeaderInternalAction$ShowErrorWithMessage;", "Lcom/avito/android/service_booking_calendar/flexible/header/mvi/entity/CalendarHeaderInternalAction$ShowHeader;", "Lcom/avito/android/service_booking_calendar/flexible/header/mvi/entity/CalendarHeaderInternalAction$ShowLoading;", "Lcom/avito/android/service_booking_calendar/flexible/header/mvi/entity/CalendarHeaderInternalAction$SwitchMode;", "Lcom/avito/android/service_booking_calendar/flexible/header/mvi/entity/CalendarHeaderInternalAction$UpdateHeader;", "Lcom/avito/android/service_booking_calendar/flexible/header/mvi/entity/CalendarHeaderInternalAction$UpdatedScheduleInfo;", "_avito_service-booking-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface CalendarHeaderInternalAction extends n {

    /* compiled from: CalendarHeaderInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/service_booking_calendar/flexible/header/mvi/entity/CalendarHeaderInternalAction$CloseTooltip;", "Lcom/avito/android/service_booking_calendar/flexible/header/mvi/entity/CalendarHeaderInternalAction;", "_avito_service-booking-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class CloseTooltip implements CalendarHeaderInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final InterfaceC42106a f275981b;

        public CloseTooltip(@k InterfaceC42106a interfaceC42106a) {
            this.f275981b = interfaceC42106a;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof CloseTooltip) && L.f(this.f275981b, ((CloseTooltip) obj).f275981b);
        }

        public final int hashCode() {
            return this.f275981b.hashCode();
        }

        @k
        public final String toString() {
            return "CloseTooltip(tooltip=" + this.f275981b + ')';
        }
    }

    /* compiled from: CalendarHeaderInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/service_booking_calendar/flexible/header/mvi/entity/CalendarHeaderInternalAction$Finish;", "Lcom/avito/android/service_booking_calendar/flexible/header/mvi/entity/CalendarHeaderInternalAction;", "()V", "_avito_service-booking-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Finish implements CalendarHeaderInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final Finish f275982b = new Finish();

        private Finish() {
        }
    }

    /* compiled from: CalendarHeaderInternalAction.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/service_booking_calendar/flexible/header/mvi/entity/CalendarHeaderInternalAction$HideHeader;", "Lcom/avito/android/service_booking_calendar/flexible/header/mvi/entity/CalendarHeaderInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableError;", "_avito_service-booking-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class HideHeader implements CalendarHeaderInternalAction, TrackableError {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final J.a f275983b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final J.a f275984c;

        public HideHeader(@k J.a aVar) {
            this.f275983b = aVar;
            this.f275984c = aVar;
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @l
        /* renamed from: d */
        public final String getF111994d() {
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
            return (obj instanceof HideHeader) && L.f(this.f275983b, ((HideHeader) obj).f275983b);
        }

        @Override // com.avito.android.analytics.screens.mvi.TrackableError
        @k
        /* renamed from: g, reason: from getter */
        public final J.a getF130481d() {
            return this.f275984c;
        }

        public final int hashCode() {
            return this.f275983b.f90384a.hashCode();
        }

        @k
        public final String toString() {
            return "HideHeader(reason=" + this.f275983b + ')';
        }
    }

    /* compiled from: CalendarHeaderInternalAction.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/service_booking_calendar/flexible/header/mvi/entity/CalendarHeaderInternalAction$InvalidateHeader;", "Lcom/avito/android/service_booking_calendar/flexible/header/mvi/entity/CalendarHeaderInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableLoadingStarted;", "()V", "_avito_service-booking-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class InvalidateHeader extends TrackableLoadingStarted implements CalendarHeaderInternalAction {
    }

    /* compiled from: CalendarHeaderInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/service_booking_calendar/flexible/header/mvi/entity/CalendarHeaderInternalAction$LaunchDeepLink;", "Lcom/avito/android/service_booking_calendar/flexible/header/mvi/entity/CalendarHeaderInternalAction;", "_avito_service-booking-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class LaunchDeepLink implements CalendarHeaderInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final DeepLink f275985b;

        public LaunchDeepLink(@k DeepLink deepLink) {
            this.f275985b = deepLink;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof LaunchDeepLink) && L.f(this.f275985b, ((LaunchDeepLink) obj).f275985b);
        }

        public final int hashCode() {
            return this.f275985b.hashCode();
        }

        @k
        public final String toString() {
            return a.v(new StringBuilder("LaunchDeepLink(deepLink="), this.f275985b, ')');
        }
    }

    /* compiled from: CalendarHeaderInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/service_booking_calendar/flexible/header/mvi/entity/CalendarHeaderInternalAction$SelectDay;", "Lcom/avito/android/service_booking_calendar/flexible/header/mvi/entity/CalendarHeaderInternalAction;", "_avito_service-booking-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class SelectDay implements CalendarHeaderInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final FlexibleCalendarDayItem f275986b;

        /* renamed from: c, reason: collision with root package name */
        public final int f275987c;

        /* renamed from: d, reason: collision with root package name */
        public final int f275988d;

        public SelectDay(@k FlexibleCalendarDayItem flexibleCalendarDayItem, int i12, int i13) {
            this.f275986b = flexibleCalendarDayItem;
            this.f275987c = i12;
            this.f275988d = i13;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SelectDay)) {
                return false;
            }
            SelectDay selectDay = (SelectDay) obj;
            return L.f(this.f275986b, selectDay.f275986b) && this.f275987c == selectDay.f275987c && this.f275988d == selectDay.f275988d;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f275988d) + r.e(this.f275987c, this.f275986b.hashCode() * 31, 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("SelectDay(selectedDay=");
            sb2.append(this.f275986b);
            sb2.append(", selectedWeekPosition=");
            sb2.append(this.f275987c);
            sb2.append(", weeksCountInMonth=");
            return r.t(sb2, this.f275988d, ')');
        }
    }

    /* compiled from: CalendarHeaderInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/service_booking_calendar/flexible/header/mvi/entity/CalendarHeaderInternalAction$SetMode;", "Lcom/avito/android/service_booking_calendar/flexible/header/mvi/entity/CalendarHeaderInternalAction;", "_avito_service-booking-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class SetMode implements CalendarHeaderInternalAction {
        public SetMode() {
            CalendarHeaderState.MODE mode = CalendarHeaderState.MODE.f276021b;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SetMode)) {
                return false;
            }
            CalendarHeaderState.MODE mode = CalendarHeaderState.MODE.f276021b;
            ((SetMode) obj).getClass();
            return true;
        }

        public final int hashCode() {
            return CalendarHeaderState.MODE.f276021b.hashCode();
        }

        @k
        public final String toString() {
            return "SetMode(mode=" + CalendarHeaderState.MODE.f276021b + ')';
        }
    }

    /* compiled from: CalendarHeaderInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/service_booking_calendar/flexible/header/mvi/entity/CalendarHeaderInternalAction$ShowDefaultError;", "Lcom/avito/android/service_booking_calendar/flexible/header/mvi/entity/CalendarHeaderInternalAction;", "()V", "_avito_service-booking-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class ShowDefaultError implements CalendarHeaderInternalAction {
        static {
            new ShowDefaultError();
        }

        private ShowDefaultError() {
        }
    }

    /* compiled from: CalendarHeaderInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/service_booking_calendar/flexible/header/mvi/entity/CalendarHeaderInternalAction$ShowErrorWithMessage;", "Lcom/avito/android/service_booking_calendar/flexible/header/mvi/entity/CalendarHeaderInternalAction;", "_avito_service-booking-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ShowErrorWithMessage implements CalendarHeaderInternalAction {
        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ShowErrorWithMessage)) {
                return false;
            }
            ((ShowErrorWithMessage) obj).getClass();
            return L.f(null, null);
        }

        public final int hashCode() {
            throw null;
        }

        @k
        public final String toString() {
            return "ShowErrorWithMessage(message=null)";
        }
    }

    /* compiled from: CalendarHeaderInternalAction.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/service_booking_calendar/flexible/header/mvi/entity/CalendarHeaderInternalAction$ShowHeader;", "Lcom/avito/android/service_booking_calendar/flexible/header/mvi/entity/CalendarHeaderInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableContent;", "_avito_service-booking-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ShowHeader implements CalendarHeaderInternalAction, TrackableContent {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final ArrayList f275989b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final List<WeekItem> f275990c;

        /* renamed from: d, reason: collision with root package name */
        public final int f275991d;

        /* renamed from: e, reason: collision with root package name */
        public final int f275992e;

        /* renamed from: f, reason: collision with root package name */
        public final int f275993f;

        /* renamed from: g, reason: collision with root package name */
        @l
        public final DayItem f275994g;

        /* renamed from: h, reason: collision with root package name */
        @l
        public final DayItem f275995h;

        /* renamed from: i, reason: collision with root package name */
        public final int f275996i;

        /* renamed from: j, reason: collision with root package name */
        @k
        public final List<C42108c> f275997j;

        public ShowHeader(@k ArrayList arrayList, @k List list, int i12, int i13, int i14, @l DayItem dayItem, @l DayItem dayItem2, int i15, @k List list2) {
            this.f275989b = arrayList;
            this.f275990c = list;
            this.f275991d = i12;
            this.f275992e = i13;
            this.f275993f = i14;
            this.f275994g = dayItem;
            this.f275995h = dayItem2;
            this.f275996i = i15;
            this.f275997j = list2;
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @l
        /* renamed from: d */
        public final String getF111994d() {
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
            if (!(obj instanceof ShowHeader)) {
                return false;
            }
            ShowHeader showHeader = (ShowHeader) obj;
            return this.f275989b.equals(showHeader.f275989b) && L.f(this.f275990c, showHeader.f275990c) && this.f275991d == showHeader.f275991d && this.f275992e == showHeader.f275992e && this.f275993f == showHeader.f275993f && L.f(this.f275994g, showHeader.f275994g) && L.f(this.f275995h, showHeader.f275995h) && this.f275996i == showHeader.f275996i && L.f(this.f275997j, showHeader.f275997j);
        }

        public final int hashCode() {
            int iE2 = r.e(this.f275993f, r.e(this.f275992e, r.e(this.f275991d, H.e(this.f275989b.hashCode() * 31, 31, this.f275990c), 31), 31), 31);
            DayItem dayItem = this.f275994g;
            int iHashCode = (iE2 + (dayItem == null ? 0 : dayItem.hashCode())) * 31;
            DayItem dayItem2 = this.f275995h;
            return this.f275997j.hashCode() + r.e(this.f275996i, (iHashCode + (dayItem2 != null ? dayItem2.hashCode() : 0)) * 31, 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ShowHeader(toolbarActions=");
            sb2.append(this.f275989b);
            sb2.append(", weeks=");
            sb2.append(this.f275990c);
            sb2.append(", scrollToWeekPosition=");
            sb2.append(this.f275991d);
            sb2.append(", scrollToMonthPosition=");
            sb2.append(this.f275992e);
            sb2.append(", weeksCountInMonth=");
            sb2.append(this.f275993f);
            sb2.append(", selectedDay=");
            sb2.append(this.f275994g);
            sb2.append(", todayDay=");
            sb2.append(this.f275995h);
            sb2.append(", todayDayIndex=");
            sb2.append(this.f275996i);
            sb2.append(", tooltips=");
            return H.p(sb2, this.f275997j, ')');
        }
    }

    /* compiled from: CalendarHeaderInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/service_booking_calendar/flexible/header/mvi/entity/CalendarHeaderInternalAction$ShowLoading;", "Lcom/avito/android/service_booking_calendar/flexible/header/mvi/entity/CalendarHeaderInternalAction;", "()V", "_avito_service-booking-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class ShowLoading implements CalendarHeaderInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final ShowLoading f275998b = new ShowLoading();

        private ShowLoading() {
        }
    }

    /* compiled from: CalendarHeaderInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/service_booking_calendar/flexible/header/mvi/entity/CalendarHeaderInternalAction$SwitchMode;", "Lcom/avito/android/service_booking_calendar/flexible/header/mvi/entity/CalendarHeaderInternalAction;", "()V", "_avito_service-booking-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class SwitchMode implements CalendarHeaderInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final SwitchMode f275999b = new SwitchMode();

        private SwitchMode() {
        }
    }

    /* compiled from: CalendarHeaderInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/service_booking_calendar/flexible/header/mvi/entity/CalendarHeaderInternalAction$UpdateHeader;", "Lcom/avito/android/service_booking_calendar/flexible/header/mvi/entity/CalendarHeaderInternalAction;", "_avito_service-booking-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class UpdateHeader implements CalendarHeaderInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final ArrayList f276000b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final ArrayList f276001c;

        public UpdateHeader(@k ArrayList arrayList, @k ArrayList arrayList2) {
            this.f276000b = arrayList;
            this.f276001c = arrayList2;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof UpdateHeader)) {
                return false;
            }
            UpdateHeader updateHeader = (UpdateHeader) obj;
            return this.f276000b.equals(updateHeader.f276000b) && this.f276001c.equals(updateHeader.f276001c);
        }

        public final int hashCode() {
            return this.f276001c.hashCode() + (this.f276000b.hashCode() * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("UpdateHeader(toolbarActions=");
            sb2.append(this.f276000b);
            sb2.append(", weeks=");
            return e.p(sb2, this.f276001c, ')');
        }
    }

    /* compiled from: CalendarHeaderInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/service_booking_calendar/flexible/header/mvi/entity/CalendarHeaderInternalAction$UpdatedScheduleInfo;", "Lcom/avito/android/service_booking_calendar/flexible/header/mvi/entity/CalendarHeaderInternalAction;", "_avito_service-booking-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class UpdatedScheduleInfo implements CalendarHeaderInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final b f276002b;

        public UpdatedScheduleInfo(@k b bVar) {
            this.f276002b = bVar;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof UpdatedScheduleInfo) && L.f(this.f276002b, ((UpdatedScheduleInfo) obj).f276002b);
        }

        public final int hashCode() {
            return this.f276002b.hashCode();
        }

        @k
        public final String toString() {
            return "UpdatedScheduleInfo(info=" + this.f276002b + ')';
        }
    }
}
