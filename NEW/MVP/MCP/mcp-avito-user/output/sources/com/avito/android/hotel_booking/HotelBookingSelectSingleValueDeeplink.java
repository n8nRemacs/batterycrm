package com.avito.android.hotel_booking;

import Ju.InterfaceC14249c;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.InterfaceC29686l;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import q50.InterfaceC47204b;

/* compiled from: HotelBookingSelectSingleValueDeeplink.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/hotel_booking/HotelBookingSelectSingleValueDeeplink;", "Lcom/avito/android/deep_linking/links/DeepLink;", "b", "_avito_hotel-booking_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
@K51.d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes13.dex */
public final class HotelBookingSelectSingleValueDeeplink extends DeepLink {

    @k
    public static final Parcelable.Creator<HotelBookingSelectSingleValueDeeplink> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final SelectValueData f163260b;

    /* compiled from: HotelBookingSelectSingleValueDeeplink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<HotelBookingSelectSingleValueDeeplink> {
        @Override // android.os.Parcelable.Creator
        public final HotelBookingSelectSingleValueDeeplink createFromParcel(Parcel parcel) {
            return new HotelBookingSelectSingleValueDeeplink(SelectValueData.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final HotelBookingSelectSingleValueDeeplink[] newArray(int i12) {
            return new HotelBookingSelectSingleValueDeeplink[i12];
        }
    }

    /* compiled from: HotelBookingSelectSingleValueDeeplink.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/hotel_booking/HotelBookingSelectSingleValueDeeplink$b;", "LJu/c$b;", "a", "b", "Lcom/avito/android/hotel_booking/HotelBookingSelectSingleValueDeeplink$b$a;", "Lcom/avito/android/hotel_booking/HotelBookingSelectSingleValueDeeplink$b$b;", "_avito_hotel-booking_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface b extends InterfaceC14249c.b {

        /* compiled from: HotelBookingSelectSingleValueDeeplink.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/hotel_booking/HotelBookingSelectSingleValueDeeplink$b$a;", "Lcom/avito/android/hotel_booking/HotelBookingSelectSingleValueDeeplink$b;", "_avito_hotel-booking_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class a implements b {

            /* renamed from: b, reason: collision with root package name */
            @k
            public final Value f163261b;

            public a(@k Value value) {
                this.f163261b = value;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof a) && L.f(this.f163261b, ((a) obj).f163261b);
            }

            public final int hashCode() {
                return this.f163261b.hashCode();
            }

            @k
            public final String toString() {
                return "SuccessSelectValue(value=" + this.f163261b + ')';
            }
        }

        /* compiled from: HotelBookingSelectSingleValueDeeplink.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/hotel_booking/HotelBookingSelectSingleValueDeeplink$b$b;", "Lcom/avito/android/hotel_booking/HotelBookingSelectSingleValueDeeplink$b;", "<init>", "()V", "_avito_hotel-booking_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.hotel_booking.HotelBookingSelectSingleValueDeeplink$b$b, reason: collision with other inner class name */
        public static final /* data */ class C4776b implements b {

            /* renamed from: b, reason: collision with root package name */
            @k
            public static final C4776b f163262b = new C4776b();

            public final boolean equals(@l Object obj) {
                return this == obj || (obj instanceof C4776b);
            }

            public final int hashCode() {
                return -1940377786;
            }

            @k
            public final String toString() {
                return "SuccessWithoutValue";
            }
        }
    }

    public HotelBookingSelectSingleValueDeeplink(@k SelectValueData selectValueData) {
        this.f163260b = selectValueData;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        this.f163260b.writeToParcel(parcel, i12);
    }
}
