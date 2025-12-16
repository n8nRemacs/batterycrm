package com.avito.android.hotel_booking;

import Ju.InterfaceC14249c;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.InterfaceC29686l;
import kotlin.Metadata;
import q50.InterfaceC47204b;

/* compiled from: HotelCreateMessengerDeeplink.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/hotel_booking/HotelCreateMessengerDeeplink;", "Lcom/avito/android/deep_linking/links/DeepLink;", "b", "_avito_hotel-booking_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
@K51.d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes13.dex */
public final class HotelCreateMessengerDeeplink extends DeepLink {

    @k
    public static final Parcelable.Creator<HotelCreateMessengerDeeplink> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final long f163263b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f163264c;

    /* compiled from: HotelCreateMessengerDeeplink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<HotelCreateMessengerDeeplink> {
        @Override // android.os.Parcelable.Creator
        public final HotelCreateMessengerDeeplink createFromParcel(Parcel parcel) {
            return new HotelCreateMessengerDeeplink(parcel.readLong(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final HotelCreateMessengerDeeplink[] newArray(int i12) {
            return new HotelCreateMessengerDeeplink[i12];
        }
    }

    /* compiled from: HotelCreateMessengerDeeplink.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/hotel_booking/HotelCreateMessengerDeeplink$b;", "", "a", "b", "Lcom/avito/android/hotel_booking/HotelCreateMessengerDeeplink$b$a;", "Lcom/avito/android/hotel_booking/HotelCreateMessengerDeeplink$b$b;", "_avito_hotel-booking_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface b {

        /* compiled from: HotelCreateMessengerDeeplink.kt */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/hotel_booking/HotelCreateMessengerDeeplink$b$a;", "Lcom/avito/android/hotel_booking/HotelCreateMessengerDeeplink$b;", "LJu/c$b;", "<init>", "()V", "_avito_hotel-booking_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class a implements b, InterfaceC14249c.b {

            /* renamed from: b, reason: collision with root package name */
            @k
            public static final a f163265b = new a();

            public final boolean equals(@l Object obj) {
                return this == obj || (obj instanceof a);
            }

            public final int hashCode() {
                return -1162394512;
            }

            @k
            public final String toString() {
                return "Canceled";
            }
        }

        /* compiled from: HotelCreateMessengerDeeplink.kt */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/hotel_booking/HotelCreateMessengerDeeplink$b$b;", "Lcom/avito/android/hotel_booking/HotelCreateMessengerDeeplink$b;", "LJu/c$a;", "<init>", "()V", "_avito_hotel-booking_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.hotel_booking.HotelCreateMessengerDeeplink$b$b, reason: collision with other inner class name */
        public static final /* data */ class C4777b implements b, InterfaceC14249c.a {

            /* renamed from: b, reason: collision with root package name */
            @k
            public static final C4777b f163266b = new C4777b();

            public final boolean equals(@l Object obj) {
                return this == obj || (obj instanceof C4777b);
            }

            public final int hashCode() {
                return 1339784808;
            }

            @k
            public final String toString() {
                return "Confirmed";
            }
        }
    }

    public HotelCreateMessengerDeeplink(long j12, @k String str) {
        this.f163263b = j12;
        this.f163264c = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeLong(this.f163263b);
        parcel.writeString(this.f163264c);
    }
}
