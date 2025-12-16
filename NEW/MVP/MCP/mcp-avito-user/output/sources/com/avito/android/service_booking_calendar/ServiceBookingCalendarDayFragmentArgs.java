package com.avito.android.service_booking_calendar;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ServiceBookingCalendarDayFragmentArgs.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/service_booking_calendar/ServiceBookingCalendarDayFragmentArgs;", "Landroid/os/Parcelable;", "_avito_service-booking-calendar_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class ServiceBookingCalendarDayFragmentArgs implements Parcelable {

    @Y61.k
    public static final Parcelable.Creator<ServiceBookingCalendarDayFragmentArgs> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public final String f275242b;

    /* compiled from: ServiceBookingCalendarDayFragmentArgs.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<ServiceBookingCalendarDayFragmentArgs> {
        @Override // android.os.Parcelable.Creator
        public final ServiceBookingCalendarDayFragmentArgs createFromParcel(Parcel parcel) {
            return new ServiceBookingCalendarDayFragmentArgs(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final ServiceBookingCalendarDayFragmentArgs[] newArray(int i12) {
            return new ServiceBookingCalendarDayFragmentArgs[i12];
        }
    }

    public ServiceBookingCalendarDayFragmentArgs(@Y61.l String str) {
        this.f275242b = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ServiceBookingCalendarDayFragmentArgs) && L.f(this.f275242b, ((ServiceBookingCalendarDayFragmentArgs) obj).f275242b);
    }

    public final int hashCode() {
        String str = this.f275242b;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    @Y61.k
    public final String toString() {
        return C22026a.c(new StringBuilder("ServiceBookingCalendarDayFragmentArgs(dateId="), this.f275242b, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeString(this.f275242b);
    }
}
