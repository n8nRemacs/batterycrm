package com.avito.android.service_booking_calendar.link;

import Ju.InterfaceC14249c;
import K51.d;
import Ku.AbstractC14350a;
import Y61.k;
import Y61.l;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.InterfaceC29686l;
import com.avito.android.deep_linking.x;
import com.avito.android.service_booking_utils.BookingSettingsStatus;
import com.google.gson.Gson;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import q50.InterfaceC47204b;

/* compiled from: ServiceBookingCalendarMonthLink.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001:\u0002\u000e\u000fB\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u0010"}, d2 = {"Lcom/avito/android/service_booking_calendar/link/ServiceBookingCalendarMonthLink;", "Lcom/avito/android/deep_linking/links/DeepLink;", "Lcom/avito/android/service_booking_calendar/link/CalendarMonthType;", "type", "", "dayFocus", "<init>", "(Lcom/avito/android/service_booking_calendar/link/CalendarMonthType;Ljava/lang/String;)V", "Lcom/avito/android/service_booking_calendar/link/CalendarMonthType;", "getType", "()Lcom/avito/android/service_booking_calendar/link/CalendarMonthType;", "Ljava/lang/String;", "f", "()Ljava/lang/String;", "b", "c", "_avito_service-booking-calendar_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
@d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes3.dex */
public final /* data */ class ServiceBookingCalendarMonthLink extends DeepLink {

    @k
    public static final Parcelable.Creator<ServiceBookingCalendarMonthLink> CREATOR = new a();

    @com.google.gson.annotations.c("dayFocus")
    @l
    private final String dayFocus;

    @com.google.gson.annotations.c("type")
    @l
    private final CalendarMonthType type;

    /* compiled from: ServiceBookingCalendarMonthLink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<ServiceBookingCalendarMonthLink> {
        @Override // android.os.Parcelable.Creator
        public final ServiceBookingCalendarMonthLink createFromParcel(Parcel parcel) {
            return new ServiceBookingCalendarMonthLink(parcel.readInt() == 0 ? null : CalendarMonthType.valueOf(parcel.readString()), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final ServiceBookingCalendarMonthLink[] newArray(int i12) {
            return new ServiceBookingCalendarMonthLink[i12];
        }
    }

    /* compiled from: ServiceBookingCalendarMonthLink.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/service_booking_calendar/link/ServiceBookingCalendarMonthLink$b;", "LKu/a;", "Lcom/avito/android/service_booking_calendar/link/ServiceBookingCalendarMonthLink;", "<init>", "()V", "_avito_service-booking-calendar_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b extends AbstractC14350a<ServiceBookingCalendarMonthLink> {
        @Override // Ku.AbstractC14350a
        public final DeepLink r(Uri uri, Gson gson, x xVar) {
            String queryParameter = uri.getQueryParameter("type");
            return new ServiceBookingCalendarMonthLink(queryParameter != null ? CalendarMonthType.valueOf(queryParameter.toUpperCase(Locale.ROOT)) : null, uri.getQueryParameter("dayFocus"));
        }
    }

    /* compiled from: ServiceBookingCalendarMonthLink.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/service_booking_calendar/link/ServiceBookingCalendarMonthLink$c;", "LJu/c$b;", "a", "b", "Lcom/avito/android/service_booking_calendar/link/ServiceBookingCalendarMonthLink$c$a;", "Lcom/avito/android/service_booking_calendar/link/ServiceBookingCalendarMonthLink$c$b;", "_avito_service-booking-calendar_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface c extends InterfaceC14249c.b {

        /* compiled from: ServiceBookingCalendarMonthLink.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/service_booking_calendar/link/ServiceBookingCalendarMonthLink$c$a;", "Lcom/avito/android/service_booking_calendar/link/ServiceBookingCalendarMonthLink$c;", "_avito_service-booking-calendar_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class a implements c {

            /* renamed from: b, reason: collision with root package name */
            @l
            public final BookingSettingsStatus f276125b;

            public a(@l BookingSettingsStatus bookingSettingsStatus) {
                this.f276125b = bookingSettingsStatus;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof a) && this.f276125b == ((a) obj).f276125b;
            }

            public final int hashCode() {
                BookingSettingsStatus bookingSettingsStatus = this.f276125b;
                if (bookingSettingsStatus == null) {
                    return 0;
                }
                return bookingSettingsStatus.hashCode();
            }

            @k
            public final String toString() {
                return "Cancelled(status=" + this.f276125b + ')';
            }
        }

        /* compiled from: ServiceBookingCalendarMonthLink.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/service_booking_calendar/link/ServiceBookingCalendarMonthLink$c$b;", "Lcom/avito/android/service_booking_calendar/link/ServiceBookingCalendarMonthLink$c;", "<init>", "()V", "_avito_service-booking-calendar_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class b implements c {

            /* renamed from: b, reason: collision with root package name */
            @k
            public static final b f276126b = new b();
        }
    }

    public ServiceBookingCalendarMonthLink(@l CalendarMonthType calendarMonthType, @l String str) {
        this.type = calendarMonthType;
        this.dayFocus = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ServiceBookingCalendarMonthLink)) {
            return false;
        }
        ServiceBookingCalendarMonthLink serviceBookingCalendarMonthLink = (ServiceBookingCalendarMonthLink) obj;
        return this.type == serviceBookingCalendarMonthLink.type && L.f(this.dayFocus, serviceBookingCalendarMonthLink.dayFocus);
    }

    @l
    /* renamed from: f, reason: from getter */
    public final String getDayFocus() {
        return this.dayFocus;
    }

    public final int hashCode() {
        CalendarMonthType calendarMonthType = this.type;
        int iHashCode = (calendarMonthType == null ? 0 : calendarMonthType.hashCode()) * 31;
        String str = this.dayFocus;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ServiceBookingCalendarMonthLink(type=");
        sb2.append(this.type);
        sb2.append(", dayFocus=");
        return C22026a.c(sb2, this.dayFocus, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        CalendarMonthType calendarMonthType = this.type;
        if (calendarMonthType == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(calendarMonthType.name());
        }
        parcel.writeString(this.dayFocus);
    }
}
