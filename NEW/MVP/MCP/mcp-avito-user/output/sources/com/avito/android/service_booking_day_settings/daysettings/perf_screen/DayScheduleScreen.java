package com.avito.android.service_booking_day_settings.daysettings.perf_screen;

import I60.b;
import K51.d;
import Y61.k;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.analytics.screens.Screen;
import kotlin.Metadata;

/* compiled from: DayScheduleScreen.kt */
@d
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/service_booking_day_settings/daysettings/perf_screen/DayScheduleScreen;", "Lcom/avito/android/analytics/screens/Screen;", "<init>", "()V", "_avito_service-booking-day-settings_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@b
/* loaded from: classes3.dex */
public final class DayScheduleScreen extends Screen {

    /* renamed from: d, reason: collision with root package name */
    @k
    public static final DayScheduleScreen f277078d = new DayScheduleScreen();

    @k
    public static final Parcelable.Creator<DayScheduleScreen> CREATOR = new a();

    /* compiled from: DayScheduleScreen.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<DayScheduleScreen> {
        @Override // android.os.Parcelable.Creator
        public final DayScheduleScreen createFromParcel(Parcel parcel) {
            parcel.readInt();
            return DayScheduleScreen.f277078d;
        }

        @Override // android.os.Parcelable.Creator
        public final DayScheduleScreen[] newArray(int i12) {
            return new DayScheduleScreen[i12];
        }
    }

    public DayScheduleScreen() {
        super("DayScheduleScreen", false, 2, null);
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
