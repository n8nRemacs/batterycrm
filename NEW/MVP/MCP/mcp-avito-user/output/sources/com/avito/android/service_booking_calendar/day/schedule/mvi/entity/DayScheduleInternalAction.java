package com.avito.android.service_booking_calendar.day.schedule.mvi.entity;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import com.avito.android.analytics.screens.J;
import com.avito.android.analytics.screens.mvi.TrackableContent;
import com.avito.android.analytics.screens.mvi.TrackableError;
import com.avito.android.analytics.screens.mvi.TrackableLoadingStarted;
import com.avito.android.analytics.screens.mvi.n;
import com.avito.android.service_booking_calendar.domain.TimeSlotItem;
import com.avito.android.service_booking_calendar.domain.b;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import org.threeten.bp.g;

/* compiled from: DayScheduleInternalAction.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0005\u0007\b\t\n\u000b¨\u0006\f"}, d2 = {"Lcom/avito/android/service_booking_calendar/day/schedule/mvi/entity/DayScheduleInternalAction;", "Lcom/avito/android/analytics/screens/mvi/n;", "ScheduleLoaded", "ScheduleLoading", "ScheduleLoadingError", "ScrollByOffset", "ScrollToTime", "Lcom/avito/android/service_booking_calendar/day/schedule/mvi/entity/DayScheduleInternalAction$ScheduleLoaded;", "Lcom/avito/android/service_booking_calendar/day/schedule/mvi/entity/DayScheduleInternalAction$ScheduleLoading;", "Lcom/avito/android/service_booking_calendar/day/schedule/mvi/entity/DayScheduleInternalAction$ScheduleLoadingError;", "Lcom/avito/android/service_booking_calendar/day/schedule/mvi/entity/DayScheduleInternalAction$ScrollByOffset;", "Lcom/avito/android/service_booking_calendar/day/schedule/mvi/entity/DayScheduleInternalAction$ScrollToTime;", "_avito_service-booking-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface DayScheduleInternalAction extends n {

    /* compiled from: DayScheduleInternalAction.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/service_booking_calendar/day/schedule/mvi/entity/DayScheduleInternalAction$ScheduleLoading;", "Lcom/avito/android/analytics/screens/mvi/TrackableLoadingStarted;", "Lcom/avito/android/service_booking_calendar/day/schedule/mvi/entity/DayScheduleInternalAction;", "()V", "_avito_service-booking-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class ScheduleLoading extends TrackableLoadingStarted implements DayScheduleInternalAction {
    }

    /* compiled from: DayScheduleInternalAction.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/service_booking_calendar/day/schedule/mvi/entity/DayScheduleInternalAction$ScheduleLoadingError;", "Lcom/avito/android/service_booking_calendar/day/schedule/mvi/entity/DayScheduleInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableError;", "_avito_service-booking-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ScheduleLoadingError implements DayScheduleInternalAction, TrackableError {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final Throwable f275395b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final J.a f275396c;

        public ScheduleLoadingError(@k Throwable th2) {
            this.f275395b = th2;
            this.f275396c = new J.a(th2);
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @l
        /* renamed from: d */
        public final String getF261005e() {
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
            return (obj instanceof ScheduleLoadingError) && L.f(this.f275395b, ((ScheduleLoadingError) obj).f275395b);
        }

        @Override // com.avito.android.analytics.screens.mvi.TrackableError
        @k
        /* renamed from: g, reason: from getter */
        public final J.a getF116421c() {
            return this.f275396c;
        }

        public final int hashCode() {
            return this.f275395b.hashCode();
        }

        @k
        public final String toString() {
            return com.avito.android.advert.item.delivery_suggests.l.t(new StringBuilder("ScheduleLoadingError(throwable="), this.f275395b, ')');
        }
    }

    /* compiled from: DayScheduleInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/service_booking_calendar/day/schedule/mvi/entity/DayScheduleInternalAction$ScrollByOffset;", "Lcom/avito/android/service_booking_calendar/day/schedule/mvi/entity/DayScheduleInternalAction;", "_avito_service-booking-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ScrollByOffset implements DayScheduleInternalAction {

        /* renamed from: b, reason: collision with root package name */
        public final int f275397b;

        public ScrollByOffset(int i12) {
            this.f275397b = i12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ScrollByOffset) && this.f275397b == ((ScrollByOffset) obj).f275397b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f275397b);
        }

        @k
        public final String toString() {
            return r.t(new StringBuilder("ScrollByOffset(offset="), this.f275397b, ')');
        }
    }

    /* compiled from: DayScheduleInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/service_booking_calendar/day/schedule/mvi/entity/DayScheduleInternalAction$ScrollToTime;", "Lcom/avito/android/service_booking_calendar/day/schedule/mvi/entity/DayScheduleInternalAction;", "_avito_service-booking-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ScrollToTime implements DayScheduleInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final g f275398b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f275399c;

        public ScrollToTime(@k g gVar, boolean z12) {
            this.f275398b = gVar;
            this.f275399c = z12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ScrollToTime)) {
                return false;
            }
            ScrollToTime scrollToTime = (ScrollToTime) obj;
            return L.f(this.f275398b, scrollToTime.f275398b) && this.f275399c == scrollToTime.f275399c;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f275399c) + (this.f275398b.hashCode() * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ScrollToTime(time=");
            sb2.append(this.f275398b);
            sb2.append(", centerAtQuarter=");
            return r.x(sb2, this.f275399c, ')');
        }

        public /* synthetic */ ScrollToTime(g gVar, boolean z12, int i12, C42822w c42822w) {
            this(gVar, (i12 & 2) != 0 ? false : z12);
        }
    }

    /* compiled from: DayScheduleInternalAction.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/service_booking_calendar/day/schedule/mvi/entity/DayScheduleInternalAction$ScheduleLoaded;", "Lcom/avito/android/service_booking_calendar/day/schedule/mvi/entity/DayScheduleInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableContent;", "_avito_service-booking-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ScheduleLoaded implements DayScheduleInternalAction, TrackableContent {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final List<TimeSlotItem> f275393b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final b f275394c;

        /* JADX WARN: Multi-variable type inference failed */
        public ScheduleLoaded(@k List<? extends TimeSlotItem> list, @l b bVar) {
            this.f275393b = list;
            this.f275394c = bVar;
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @l
        /* renamed from: d */
        public final String getF261005e() {
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
            if (!(obj instanceof ScheduleLoaded)) {
                return false;
            }
            ScheduleLoaded scheduleLoaded = (ScheduleLoaded) obj;
            return L.f(this.f275393b, scheduleLoaded.f275393b) && L.f(this.f275394c, scheduleLoaded.f275394c);
        }

        public final int hashCode() {
            int iHashCode = this.f275393b.hashCode() * 31;
            b bVar = this.f275394c;
            return iHashCode + (bVar == null ? 0 : bVar.hashCode());
        }

        @k
        public final String toString() {
            return "ScheduleLoaded(timeSlots=" + this.f275393b + ", scheduleInfo=" + this.f275394c + ')';
        }

        public /* synthetic */ ScheduleLoaded(List list, b bVar, int i12, C42822w c42822w) {
            this(list, (i12 & 2) != 0 ? null : bVar);
        }
    }
}
