package com.avito.android.str_calendar.seller.calendar.mvi.entity;

import AK.c;
import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.screens.J;
import com.avito.android.analytics.screens.mvi.TrackableContent;
import com.avito.android.analytics.screens.mvi.TrackableError;
import com.avito.android.analytics.screens.mvi.TrackableLoadingStarted;
import com.avito.android.analytics.screens.mvi.n;
import com.avito.android.remote.error.ApiError;
import com.avito.android.str_calendar.common.models.DateRange;
import java.util.Date;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: StrSellerCalendarInternalAction.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\t\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u0082\u0001\t\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013¨\u0006\u0014"}, d2 = {"Lcom/avito/android/str_calendar/seller/calendar/mvi/entity/StrSellerCalendarInternalAction;", "Lcom/avito/android/analytics/screens/mvi/n;", "ClearSelectedDates", "ClickDay", "CloseScreen", "ContentError", "ContentLoaded", "ContentLoading", "Init", "ScrollToPosition", "ShowCalendarParameters", "Lcom/avito/android/str_calendar/seller/calendar/mvi/entity/StrSellerCalendarInternalAction$ClearSelectedDates;", "Lcom/avito/android/str_calendar/seller/calendar/mvi/entity/StrSellerCalendarInternalAction$ClickDay;", "Lcom/avito/android/str_calendar/seller/calendar/mvi/entity/StrSellerCalendarInternalAction$CloseScreen;", "Lcom/avito/android/str_calendar/seller/calendar/mvi/entity/StrSellerCalendarInternalAction$ContentError;", "Lcom/avito/android/str_calendar/seller/calendar/mvi/entity/StrSellerCalendarInternalAction$ContentLoaded;", "Lcom/avito/android/str_calendar/seller/calendar/mvi/entity/StrSellerCalendarInternalAction$ContentLoading;", "Lcom/avito/android/str_calendar/seller/calendar/mvi/entity/StrSellerCalendarInternalAction$Init;", "Lcom/avito/android/str_calendar/seller/calendar/mvi/entity/StrSellerCalendarInternalAction$ScrollToPosition;", "Lcom/avito/android/str_calendar/seller/calendar/mvi/entity/StrSellerCalendarInternalAction$ShowCalendarParameters;", "_avito_str-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface StrSellerCalendarInternalAction extends n {

    /* compiled from: StrSellerCalendarInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/str_calendar/seller/calendar/mvi/entity/StrSellerCalendarInternalAction$ClearSelectedDates;", "Lcom/avito/android/str_calendar/seller/calendar/mvi/entity/StrSellerCalendarInternalAction;", "<init>", "()V", "_avito_str-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ClearSelectedDates implements StrSellerCalendarInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final ClearSelectedDates f287697b = new ClearSelectedDates();

        private ClearSelectedDates() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof ClearSelectedDates);
        }

        public final int hashCode() {
            return -2068921585;
        }

        @k
        public final String toString() {
            return "ClearSelectedDates";
        }
    }

    /* compiled from: StrSellerCalendarInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/str_calendar/seller/calendar/mvi/entity/StrSellerCalendarInternalAction$ClickDay;", "Lcom/avito/android/str_calendar/seller/calendar/mvi/entity/StrSellerCalendarInternalAction;", "_avito_str-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ClickDay implements StrSellerCalendarInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @l
        public final Date f287698b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final DateRange f287699c;

        public ClickDay(@l DateRange dateRange, @l Date date) {
            this.f287698b = date;
            this.f287699c = dateRange;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ClickDay)) {
                return false;
            }
            ClickDay clickDay = (ClickDay) obj;
            return L.f(this.f287698b, clickDay.f287698b) && L.f(this.f287699c, clickDay.f287699c);
        }

        public final int hashCode() {
            Date date = this.f287698b;
            int iHashCode = (date == null ? 0 : date.hashCode()) * 31;
            DateRange dateRange = this.f287699c;
            return iHashCode + (dateRange != null ? dateRange.hashCode() : 0);
        }

        @k
        public final String toString() {
            return "ClickDay(selectedDate=" + this.f287698b + ", selectedRange=" + this.f287699c + ')';
        }
    }

    /* compiled from: StrSellerCalendarInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/str_calendar/seller/calendar/mvi/entity/StrSellerCalendarInternalAction$CloseScreen;", "Lcom/avito/android/str_calendar/seller/calendar/mvi/entity/StrSellerCalendarInternalAction;", "<init>", "()V", "_avito_str-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class CloseScreen implements StrSellerCalendarInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final CloseScreen f287700b = new CloseScreen();

        private CloseScreen() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof CloseScreen);
        }

        public final int hashCode() {
            return 795229458;
        }

        @k
        public final String toString() {
            return "CloseScreen";
        }
    }

    /* compiled from: StrSellerCalendarInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/str_calendar/seller/calendar/mvi/entity/StrSellerCalendarInternalAction$ContentError;", "Lcom/avito/android/str_calendar/seller/calendar/mvi/entity/StrSellerCalendarInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableError;", "_avito_str-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ContentError implements StrSellerCalendarInternalAction, TrackableError {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final ApiError f287701b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final J.a f287702c;

        public ContentError(@k ApiError apiError) {
            this.f287701b = apiError;
            this.f287702c = new J.a(apiError);
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @l
        /* renamed from: d */
        public final String getF212874d() {
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
            return (obj instanceof ContentError) && L.f(this.f287701b, ((ContentError) obj).f287701b);
        }

        @Override // com.avito.android.analytics.screens.mvi.TrackableError
        @k
        /* renamed from: g, reason: from getter */
        public final J.a getF158021c() {
            return this.f287702c;
        }

        public final int hashCode() {
            return this.f287701b.hashCode();
        }

        @k
        public final String toString() {
            return c.n(new StringBuilder("ContentError(apiError="), this.f287701b, ')');
        }
    }

    /* compiled from: StrSellerCalendarInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/str_calendar/seller/calendar/mvi/entity/StrSellerCalendarInternalAction$ContentLoaded;", "Lcom/avito/android/str_calendar/seller/calendar/mvi/entity/StrSellerCalendarInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableContent;", "_avito_str-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ContentLoaded implements StrSellerCalendarInternalAction, TrackableContent {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final Iy0.c f287703b;

        public ContentLoaded(@k Iy0.c cVar) {
            this.f287703b = cVar;
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @l
        /* renamed from: d */
        public final String getF212874d() {
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
            return (obj instanceof ContentLoaded) && L.f(this.f287703b, ((ContentLoaded) obj).f287703b);
        }

        public final int hashCode() {
            return this.f287703b.hashCode();
        }

        @k
        public final String toString() {
            return "ContentLoaded(data=" + this.f287703b + ')';
        }
    }

    /* compiled from: StrSellerCalendarInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/str_calendar/seller/calendar/mvi/entity/StrSellerCalendarInternalAction$ContentLoading;", "Lcom/avito/android/str_calendar/seller/calendar/mvi/entity/StrSellerCalendarInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableLoadingStarted;", "()V", "_avito_str-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class ContentLoading extends TrackableLoadingStarted implements StrSellerCalendarInternalAction {
    }

    /* compiled from: StrSellerCalendarInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/str_calendar/seller/calendar/mvi/entity/StrSellerCalendarInternalAction$Init;", "Lcom/avito/android/str_calendar/seller/calendar/mvi/entity/StrSellerCalendarInternalAction;", "_avito_str-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Init implements StrSellerCalendarInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f287704b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final String f287705c;

        /* renamed from: d, reason: collision with root package name */
        @l
        public final String f287706d;

        /* renamed from: e, reason: collision with root package name */
        public final boolean f287707e;

        public Init(@k String str, @l String str2, @l String str3, boolean z12) {
            this.f287704b = str;
            this.f287705c = str2;
            this.f287706d = str3;
            this.f287707e = z12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Init)) {
                return false;
            }
            Init init = (Init) obj;
            return L.f(this.f287704b, init.f287704b) && L.f(this.f287705c, init.f287705c) && L.f(this.f287706d, init.f287706d) && this.f287707e == init.f287707e;
        }

        public final int hashCode() {
            int iHashCode = this.f287704b.hashCode() * 31;
            String str = this.f287705c;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f287706d;
            return Boolean.hashCode(this.f287707e) + ((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Init(advertId=");
            sb2.append(this.f287704b);
            sb2.append(", firstSelectedDate=");
            sb2.append(this.f287705c);
            sb2.append(", lastSelectedDate=");
            sb2.append(this.f287706d);
            sb2.append(", shouldCloseFlowAfterApply=");
            return r.x(sb2, this.f287707e, ')');
        }
    }

    /* compiled from: StrSellerCalendarInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/str_calendar/seller/calendar/mvi/entity/StrSellerCalendarInternalAction$ScrollToPosition;", "Lcom/avito/android/str_calendar/seller/calendar/mvi/entity/StrSellerCalendarInternalAction;", "_avito_str-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ScrollToPosition implements StrSellerCalendarInternalAction {

        /* renamed from: b, reason: collision with root package name */
        public final int f287708b;

        public ScrollToPosition(int i12) {
            this.f287708b = i12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ScrollToPosition) && this.f287708b == ((ScrollToPosition) obj).f287708b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f287708b);
        }

        @k
        public final String toString() {
            return r.t(new StringBuilder("ScrollToPosition(position="), this.f287708b, ')');
        }
    }

    /* compiled from: StrSellerCalendarInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/str_calendar/seller/calendar/mvi/entity/StrSellerCalendarInternalAction$ShowCalendarParameters;", "Lcom/avito/android/str_calendar/seller/calendar/mvi/entity/StrSellerCalendarInternalAction;", "_avito_str-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ShowCalendarParameters implements StrSellerCalendarInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f287709b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final Date f287710c;

        /* renamed from: d, reason: collision with root package name */
        @l
        public final Date f287711d;

        /* renamed from: e, reason: collision with root package name */
        public final boolean f287712e;

        public ShowCalendarParameters(@k String str, @l Date date, @l Date date2, boolean z12) {
            this.f287709b = str;
            this.f287710c = date;
            this.f287711d = date2;
            this.f287712e = z12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ShowCalendarParameters)) {
                return false;
            }
            ShowCalendarParameters showCalendarParameters = (ShowCalendarParameters) obj;
            return L.f(this.f287709b, showCalendarParameters.f287709b) && L.f(this.f287710c, showCalendarParameters.f287710c) && L.f(this.f287711d, showCalendarParameters.f287711d) && this.f287712e == showCalendarParameters.f287712e;
        }

        public final int hashCode() {
            int iHashCode = this.f287709b.hashCode() * 31;
            Date date = this.f287710c;
            int iHashCode2 = (iHashCode + (date == null ? 0 : date.hashCode())) * 31;
            Date date2 = this.f287711d;
            return Boolean.hashCode(this.f287712e) + ((iHashCode2 + (date2 != null ? date2.hashCode() : 0)) * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ShowCalendarParameters(advertId=");
            sb2.append(this.f287709b);
            sb2.append(", startDate=");
            sb2.append(this.f287710c);
            sb2.append(", endDate=");
            sb2.append(this.f287711d);
            sb2.append(", shouldCloseFlowAfterApply=");
            return r.x(sb2, this.f287712e, ')');
        }
    }
}
