package com.avito.android.service_booking_calendar;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ServiceBookingCalendarActivityArg.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/service_booking_calendar/ServiceBookingCalendarActivityArg;", "Landroid/os/Parcelable;", "_avito_service-booking-calendar_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class ServiceBookingCalendarActivityArg implements Parcelable {

    @Y61.k
    public static final Parcelable.Creator<ServiceBookingCalendarActivityArg> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public final String f275241b;

    /* compiled from: ServiceBookingCalendarActivityArg.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<ServiceBookingCalendarActivityArg> {
        @Override // android.os.Parcelable.Creator
        public final ServiceBookingCalendarActivityArg createFromParcel(Parcel parcel) {
            return new ServiceBookingCalendarActivityArg(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final ServiceBookingCalendarActivityArg[] newArray(int i12) {
            return new ServiceBookingCalendarActivityArg[i12];
        }
    }

    public ServiceBookingCalendarActivityArg(@Y61.l String str) {
        this.f275241b = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ServiceBookingCalendarActivityArg) && L.f(this.f275241b, ((ServiceBookingCalendarActivityArg) obj).f275241b);
    }

    public final int hashCode() {
        String str = this.f275241b;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    @Y61.k
    public final String toString() {
        return C22026a.c(new StringBuilder("ServiceBookingCalendarActivityArg(dayFocus="), this.f275241b, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeString(this.f275241b);
    }
}
