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

/* compiled from: HotelBookingSelectRadioDeeplink.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/hotel_booking/HotelBookingSelectRadioDeeplink;", "Lcom/avito/android/deep_linking/links/DeepLink;", "b", "_avito_hotel-booking_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
@K51.d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes13.dex */
public final class HotelBookingSelectRadioDeeplink extends DeepLink {

    @k
    public static final Parcelable.Creator<HotelBookingSelectRadioDeeplink> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final RadioGroup f163257b;

    /* compiled from: HotelBookingSelectRadioDeeplink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<HotelBookingSelectRadioDeeplink> {
        @Override // android.os.Parcelable.Creator
        public final HotelBookingSelectRadioDeeplink createFromParcel(Parcel parcel) {
            return new HotelBookingSelectRadioDeeplink(RadioGroup.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final HotelBookingSelectRadioDeeplink[] newArray(int i12) {
            return new HotelBookingSelectRadioDeeplink[i12];
        }
    }

    /* compiled from: HotelBookingSelectRadioDeeplink.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/hotel_booking/HotelBookingSelectRadioDeeplink$b;", "LJu/c$b;", "a", "b", "Lcom/avito/android/hotel_booking/HotelBookingSelectRadioDeeplink$b$a;", "Lcom/avito/android/hotel_booking/HotelBookingSelectRadioDeeplink$b$b;", "_avito_hotel-booking_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface b extends InterfaceC14249c.b {

        /* compiled from: HotelBookingSelectRadioDeeplink.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/hotel_booking/HotelBookingSelectRadioDeeplink$b$a;", "Lcom/avito/android/hotel_booking/HotelBookingSelectRadioDeeplink$b;", "_avito_hotel-booking_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class a implements b {

            /* renamed from: b, reason: collision with root package name */
            @k
            public final RadioItem f163258b;

            public a(@k RadioItem radioItem) {
                this.f163258b = radioItem;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof a) && L.f(this.f163258b, ((a) obj).f163258b);
            }

            public final int hashCode() {
                return this.f163258b.hashCode();
            }

            @k
            public final String toString() {
                return "SuccessSelectRadio(selectedItem=" + this.f163258b + ')';
            }
        }

        /* compiled from: HotelBookingSelectRadioDeeplink.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/hotel_booking/HotelBookingSelectRadioDeeplink$b$b;", "Lcom/avito/android/hotel_booking/HotelBookingSelectRadioDeeplink$b;", "<init>", "()V", "_avito_hotel-booking_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.hotel_booking.HotelBookingSelectRadioDeeplink$b$b, reason: collision with other inner class name */
        public static final /* data */ class C4775b implements b {

            /* renamed from: b, reason: collision with root package name */
            @k
            public static final C4775b f163259b = new C4775b();

            public final boolean equals(@l Object obj) {
                return this == obj || (obj instanceof C4775b);
            }

            public final int hashCode() {
                return -89874521;
            }

            @k
            public final String toString() {
                return "SuccessWithoutData";
            }
        }
    }

    public HotelBookingSelectRadioDeeplink(@k RadioGroup radioGroup) {
        this.f163257b = radioGroup;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        this.f163257b.writeToParcel(parcel, i12);
    }
}
