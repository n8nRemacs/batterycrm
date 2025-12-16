package com.avito.android.service_booking_calendar.flexible.data.mvi.entity;

import Y61.k;
import Y61.l;
import com.avito.android.analytics.screens.mvi.TrackableLoadingStarted;
import com.avito.android.remote.error.ApiError;
import com.avito.android.service_booking_calendar.flexible.data.mvi.entity.a;
import com.avito.android.service_booking_utils.BookingSettingsStatus;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: CalendarDataInternalAction.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\b\u0002\u0003\u0004\u0005\u0006\u0007\b\t\u0082\u0001\b\n\u000b\f\r\u000e\u000f\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/avito/android/service_booking_calendar/flexible/data/mvi/entity/CalendarDataInternalAction;", "", "a", "b", "c", "Loading", "d", "e", "f", "g", "Lcom/avito/android/service_booking_calendar/flexible/data/mvi/entity/CalendarDataInternalAction$a;", "Lcom/avito/android/service_booking_calendar/flexible/data/mvi/entity/CalendarDataInternalAction$b;", "Lcom/avito/android/service_booking_calendar/flexible/data/mvi/entity/CalendarDataInternalAction$c;", "Lcom/avito/android/service_booking_calendar/flexible/data/mvi/entity/CalendarDataInternalAction$Loading;", "Lcom/avito/android/service_booking_calendar/flexible/data/mvi/entity/CalendarDataInternalAction$d;", "Lcom/avito/android/service_booking_calendar/flexible/data/mvi/entity/CalendarDataInternalAction$e;", "Lcom/avito/android/service_booking_calendar/flexible/data/mvi/entity/CalendarDataInternalAction$f;", "Lcom/avito/android/service_booking_calendar/flexible/data/mvi/entity/CalendarDataInternalAction$g;", "_avito_service-booking-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface CalendarDataInternalAction {

    /* compiled from: CalendarDataInternalAction.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/service_booking_calendar/flexible/data/mvi/entity/CalendarDataInternalAction$Loading;", "Lcom/avito/android/analytics/screens/mvi/TrackableLoadingStarted;", "Lcom/avito/android/service_booking_calendar/flexible/data/mvi/entity/CalendarDataInternalAction;", "()V", "_avito_service-booking-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Loading extends TrackableLoadingStarted implements CalendarDataInternalAction {
    }

    /* compiled from: CalendarDataInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/service_booking_calendar/flexible/data/mvi/entity/CalendarDataInternalAction$a;", "Lcom/avito/android/service_booking_calendar/flexible/data/mvi/entity/CalendarDataInternalAction;", "_avito_service-booking-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a implements CalendarDataInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final Throwable f275714b;

        public a(@k Throwable th2) {
            this.f275714b = th2;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && L.f(this.f275714b, ((a) obj).f275714b);
        }

        public final int hashCode() {
            return this.f275714b.hashCode();
        }

        @k
        public final String toString() {
            return com.avito.android.advert.item.delivery_suggests.l.t(new StringBuilder("DefaultError(throwable="), this.f275714b, ')');
        }
    }

    /* compiled from: CalendarDataInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/service_booking_calendar/flexible/data/mvi/entity/CalendarDataInternalAction$b;", "Lcom/avito/android/service_booking_calendar/flexible/data/mvi/entity/CalendarDataInternalAction;", "_avito_service-booking-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b implements CalendarDataInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final ApiError f275715b;

        public b(@k ApiError apiError) {
            this.f275715b = apiError;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && L.f(this.f275715b, ((b) obj).f275715b);
        }

        public final int hashCode() {
            return this.f275715b.hashCode();
        }

        @k
        public final String toString() {
            return AK.c.n(new StringBuilder("LoadError(apiError="), this.f275715b, ')');
        }
    }

    /* compiled from: CalendarDataInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/service_booking_calendar/flexible/data/mvi/entity/CalendarDataInternalAction$c;", "Lcom/avito/android/service_booking_calendar/flexible/data/mvi/entity/CalendarDataInternalAction;", "_avito_service-booking-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class c implements CalendarDataInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final a.C8178a f275716b;

        public c(@k a.C8178a c8178a) {
            this.f275716b = c8178a;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && L.f(this.f275716b, ((c) obj).f275716b);
        }

        public final int hashCode() {
            return this.f275716b.hashCode();
        }

        @k
        public final String toString() {
            return "Loaded(data=" + this.f275716b + ')';
        }
    }

    /* compiled from: CalendarDataInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/service_booking_calendar/flexible/data/mvi/entity/CalendarDataInternalAction$d;", "Lcom/avito/android/service_booking_calendar/flexible/data/mvi/entity/CalendarDataInternalAction;", "_avito_service-booking-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class d implements CalendarDataInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final BookingSettingsStatus f275717b;

        public d(@k BookingSettingsStatus bookingSettingsStatus) {
            this.f275717b = bookingSettingsStatus;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && this.f275717b == ((d) obj).f275717b;
        }

        public final int hashCode() {
            return this.f275717b.hashCode();
        }

        @k
        public final String toString() {
            return "OnFinish(settingsStatus=" + this.f275717b + ')';
        }
    }

    /* compiled from: CalendarDataInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/service_booking_calendar/flexible/data/mvi/entity/CalendarDataInternalAction$e;", "Lcom/avito/android/service_booking_calendar/flexible/data/mvi/entity/CalendarDataInternalAction;", "_avito_service-booking-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class e implements CalendarDataInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @l
        public final BookingSettingsStatus f275718b;

        public e(@l BookingSettingsStatus bookingSettingsStatus) {
            this.f275718b = bookingSettingsStatus;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && this.f275718b == ((e) obj).f275718b;
        }

        public final int hashCode() {
            BookingSettingsStatus bookingSettingsStatus = this.f275718b;
            if (bookingSettingsStatus == null) {
                return 0;
            }
            return bookingSettingsStatus.hashCode();
        }

        @k
        public final String toString() {
            return "OnSettingsCanceled(settingsStatus=" + this.f275718b + ')';
        }
    }

    /* compiled from: CalendarDataInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/service_booking_calendar/flexible/data/mvi/entity/CalendarDataInternalAction$f;", "Lcom/avito/android/service_booking_calendar/flexible/data/mvi/entity/CalendarDataInternalAction;", "<init>", "()V", "_avito_service-booking-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class f implements CalendarDataInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final f f275719b = new f();
    }

    /* compiled from: CalendarDataInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/service_booking_calendar/flexible/data/mvi/entity/CalendarDataInternalAction$g;", "Lcom/avito/android/service_booking_calendar/flexible/data/mvi/entity/CalendarDataInternalAction;", "<init>", "()V", "_avito_service-booking-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class g implements CalendarDataInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final g f275720b = new g();
    }
}
