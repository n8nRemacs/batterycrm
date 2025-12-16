package com.avito.android.hotel_booking;

import Ju.InterfaceC14249c;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.InterfaceC29686l;
import java.util.ArrayList;
import kotlin.Metadata;
import q50.InterfaceC47204b;

/* compiled from: HotelBookingEnterDataDeeplink.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/hotel_booking/HotelBookingEnterDataDeeplink;", "Lcom/avito/android/deep_linking/links/DeepLink;", "b", "_avito_hotel-booking_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
@K51.d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes13.dex */
public final class HotelBookingEnterDataDeeplink extends DeepLink {

    @k
    public static final Parcelable.Creator<HotelBookingEnterDataDeeplink> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final EnterData f163247b;

    /* compiled from: HotelBookingEnterDataDeeplink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<HotelBookingEnterDataDeeplink> {
        @Override // android.os.Parcelable.Creator
        public final HotelBookingEnterDataDeeplink createFromParcel(Parcel parcel) {
            return new HotelBookingEnterDataDeeplink(EnterData.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final HotelBookingEnterDataDeeplink[] newArray(int i12) {
            return new HotelBookingEnterDataDeeplink[i12];
        }
    }

    /* compiled from: HotelBookingEnterDataDeeplink.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/hotel_booking/HotelBookingEnterDataDeeplink$b;", "LJu/c$b;", "a", "b", "Lcom/avito/android/hotel_booking/HotelBookingEnterDataDeeplink$b$a;", "Lcom/avito/android/hotel_booking/HotelBookingEnterDataDeeplink$b$b;", "_avito_hotel-booking_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface b extends InterfaceC14249c.b {

        /* compiled from: HotelBookingEnterDataDeeplink.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/hotel_booking/HotelBookingEnterDataDeeplink$b$a;", "Lcom/avito/android/hotel_booking/HotelBookingEnterDataDeeplink$b;", "_avito_hotel-booking_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class a implements b {

            /* renamed from: b, reason: collision with root package name */
            @k
            public final ArrayList f163248b;

            public a(@k ArrayList arrayList) {
                this.f163248b = arrayList;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof a) && this.f163248b.equals(((a) obj).f163248b);
            }

            public final int hashCode() {
                return this.f163248b.hashCode();
            }

            @k
            public final String toString() {
                return androidx.compose.ui.graphics.colorspace.e.p(new StringBuilder("SuccessWithData(groups="), this.f163248b, ')');
            }
        }

        /* compiled from: HotelBookingEnterDataDeeplink.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/hotel_booking/HotelBookingEnterDataDeeplink$b$b;", "Lcom/avito/android/hotel_booking/HotelBookingEnterDataDeeplink$b;", "<init>", "()V", "_avito_hotel-booking_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.hotel_booking.HotelBookingEnterDataDeeplink$b$b, reason: collision with other inner class name */
        public static final /* data */ class C4774b implements b {

            /* renamed from: b, reason: collision with root package name */
            @k
            public static final C4774b f163249b = new C4774b();

            public final boolean equals(@l Object obj) {
                return this == obj || (obj instanceof C4774b);
            }

            public final int hashCode() {
                return 1881906474;
            }

            @k
            public final String toString() {
                return "SuccessWithoutData";
            }
        }
    }

    public HotelBookingEnterDataDeeplink(@k EnterData enterData) {
        this.f163247b = enterData;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        this.f163247b.writeToParcel(parcel, i12);
    }
}
