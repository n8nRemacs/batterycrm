package com.avito.android.service_booking_settings.work_hours;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ServiceBookingWorkHoursArgument.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/service_booking_settings/work_hours/ServiceBookingWorkHoursArgument;", "Landroid/os/Parcelable;", "_avito_service-booking-settings_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class ServiceBookingWorkHoursArgument implements Parcelable {

    @Y61.k
    public static final Parcelable.Creator<ServiceBookingWorkHoursArgument> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final boolean f277894b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final String f277895c;

    /* compiled from: ServiceBookingWorkHoursArgument.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<ServiceBookingWorkHoursArgument> {
        @Override // android.os.Parcelable.Creator
        public final ServiceBookingWorkHoursArgument createFromParcel(Parcel parcel) {
            return new ServiceBookingWorkHoursArgument(parcel.readInt() != 0, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final ServiceBookingWorkHoursArgument[] newArray(int i12) {
            return new ServiceBookingWorkHoursArgument[i12];
        }
    }

    public ServiceBookingWorkHoursArgument(boolean z12, @Y61.l String str) {
        this.f277894b = z12;
        this.f277895c = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ServiceBookingWorkHoursArgument)) {
            return false;
        }
        ServiceBookingWorkHoursArgument serviceBookingWorkHoursArgument = (ServiceBookingWorkHoursArgument) obj;
        return this.f277894b == serviceBookingWorkHoursArgument.f277894b && L.f(this.f277895c, serviceBookingWorkHoursArgument.f277895c);
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.f277894b) * 31;
        String str = this.f277895c;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ServiceBookingWorkHoursArgument(isScheduleRequired=");
        sb2.append(this.f277894b);
        sb2.append(", flow=");
        return C22026a.c(sb2, this.f277895c, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeInt(this.f277894b ? 1 : 0);
        parcel.writeString(this.f277895c);
    }
}
