package com.avito.android.service_booking_schedule_repetition_impl.perf_screen;

import I60.b;
import K51.d;
import Y61.k;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.analytics.screens.Screen;
import kotlin.Metadata;

/* compiled from: ServicesBookingScheduleRepetition.kt */
@d
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/service_booking_schedule_repetition_impl/perf_screen/ServicesBookingScheduleRepetition;", "Lcom/avito/android/analytics/screens/Screen;", "<init>", "()V", "_avito_service-booking-schedule-repetition_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@b
/* loaded from: classes3.dex */
public final class ServicesBookingScheduleRepetition extends Screen {

    /* renamed from: d, reason: collision with root package name */
    @k
    public static final ServicesBookingScheduleRepetition f277750d = new ServicesBookingScheduleRepetition();

    @k
    public static final Parcelable.Creator<ServicesBookingScheduleRepetition> CREATOR = new a();

    /* compiled from: ServicesBookingScheduleRepetition.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<ServicesBookingScheduleRepetition> {
        @Override // android.os.Parcelable.Creator
        public final ServicesBookingScheduleRepetition createFromParcel(Parcel parcel) {
            parcel.readInt();
            return ServicesBookingScheduleRepetition.f277750d;
        }

        @Override // android.os.Parcelable.Creator
        public final ServicesBookingScheduleRepetition[] newArray(int i12) {
            return new ServicesBookingScheduleRepetition[i12];
        }
    }

    public ServicesBookingScheduleRepetition() {
        super("ServiceBookingScheduleRepetition", false, 2, null);
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
