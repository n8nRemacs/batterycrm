package com.avito.android.service_booking_settings.perf_screen;

import I60.b;
import K51.d;
import Y61.k;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.analytics.screens.Screen;
import kotlin.Metadata;

/* compiled from: ServiceBookingWorkHoursScreen.kt */
@d
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/service_booking_settings/perf_screen/ServiceBookingWorkHoursScreen;", "Lcom/avito/android/analytics/screens/Screen;", "<init>", "()V", "_avito_service-booking-settings_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@b
/* loaded from: classes3.dex */
public final class ServiceBookingWorkHoursScreen extends Screen {

    /* renamed from: d, reason: collision with root package name */
    @k
    public static final ServiceBookingWorkHoursScreen f277893d = new ServiceBookingWorkHoursScreen();

    @k
    public static final Parcelable.Creator<ServiceBookingWorkHoursScreen> CREATOR = new a();

    /* compiled from: ServiceBookingWorkHoursScreen.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<ServiceBookingWorkHoursScreen> {
        @Override // android.os.Parcelable.Creator
        public final ServiceBookingWorkHoursScreen createFromParcel(Parcel parcel) {
            parcel.readInt();
            return ServiceBookingWorkHoursScreen.f277893d;
        }

        @Override // android.os.Parcelable.Creator
        public final ServiceBookingWorkHoursScreen[] newArray(int i12) {
            return new ServiceBookingWorkHoursScreen[i12];
        }
    }

    public ServiceBookingWorkHoursScreen() {
        super("ServiceBookingWorkHours", false, 2, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeInt(1);
    }
}
