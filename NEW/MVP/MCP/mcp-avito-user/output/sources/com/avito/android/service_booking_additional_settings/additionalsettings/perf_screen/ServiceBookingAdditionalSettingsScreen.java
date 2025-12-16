package com.avito.android.service_booking_additional_settings.additionalsettings.perf_screen;

import I60.b;
import K51.d;
import Y61.k;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.analytics.screens.Screen;
import kotlin.Metadata;

/* compiled from: ServiceBookingAdditionalSettingsScreen.kt */
@d
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/service_booking_additional_settings/additionalsettings/perf_screen/ServiceBookingAdditionalSettingsScreen;", "Lcom/avito/android/analytics/screens/Screen;", "<init>", "()V", "_avito_service-booking-additional-settings_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@b
/* loaded from: classes3.dex */
public final class ServiceBookingAdditionalSettingsScreen extends Screen {

    /* renamed from: d, reason: collision with root package name */
    @k
    public static final ServiceBookingAdditionalSettingsScreen f275029d = new ServiceBookingAdditionalSettingsScreen();

    @k
    public static final Parcelable.Creator<ServiceBookingAdditionalSettingsScreen> CREATOR = new a();

    /* compiled from: ServiceBookingAdditionalSettingsScreen.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<ServiceBookingAdditionalSettingsScreen> {
        @Override // android.os.Parcelable.Creator
        public final ServiceBookingAdditionalSettingsScreen createFromParcel(Parcel parcel) {
            parcel.readInt();
            return ServiceBookingAdditionalSettingsScreen.f275029d;
        }

        @Override // android.os.Parcelable.Creator
        public final ServiceBookingAdditionalSettingsScreen[] newArray(int i12) {
            return new ServiceBookingAdditionalSettingsScreen[i12];
        }
    }

    public ServiceBookingAdditionalSettingsScreen() {
        super("ServiceBookingAdditionalSettings", false, 2, null);
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
