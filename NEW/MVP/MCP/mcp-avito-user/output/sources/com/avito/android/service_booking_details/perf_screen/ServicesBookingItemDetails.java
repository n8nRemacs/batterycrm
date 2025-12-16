package com.avito.android.service_booking_details.perf_screen;

import I60.b;
import K51.d;
import Y61.k;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.analytics.screens.Screen;
import kotlin.Metadata;

/* compiled from: ServicesBookingItemDetails.kt */
@d
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/service_booking_details/perf_screen/ServicesBookingItemDetails;", "Lcom/avito/android/analytics/screens/Screen;", "<init>", "()V", "_avito_service-booking-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@b
/* loaded from: classes3.dex */
public final class ServicesBookingItemDetails extends Screen {

    /* renamed from: d, reason: collision with root package name */
    @k
    public static final ServicesBookingItemDetails f277479d = new ServicesBookingItemDetails();

    @k
    public static final Parcelable.Creator<ServicesBookingItemDetails> CREATOR = new a();

    /* compiled from: ServicesBookingItemDetails.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<ServicesBookingItemDetails> {
        @Override // android.os.Parcelable.Creator
        public final ServicesBookingItemDetails createFromParcel(Parcel parcel) {
            parcel.readInt();
            return ServicesBookingItemDetails.f277479d;
        }

        @Override // android.os.Parcelable.Creator
        public final ServicesBookingItemDetails[] newArray(int i12) {
            return new ServicesBookingItemDetails[i12];
        }
    }

    public ServicesBookingItemDetails() {
        super("ServiceBookingItemDetails", false, 2, null);
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
