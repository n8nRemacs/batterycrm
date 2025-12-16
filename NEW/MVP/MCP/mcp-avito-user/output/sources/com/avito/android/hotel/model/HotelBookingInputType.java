package com.avito.android.hotel.model;

import K51.d;
import Y61.k;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.c;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: HotelBookingInputItem.kt */
@d
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/hotel/model/HotelBookingInputType;", "", "Landroid/os/Parcelable;", "<init>", "(Ljava/lang/String;I)V", "TEXT", "PHONE", "EMAIL", "_avito_hotel_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class HotelBookingInputType implements Parcelable {

    @k
    public static final Parcelable.Creator<HotelBookingInputType> CREATOR;

    @c("email")
    public static final HotelBookingInputType EMAIL;

    @c("phone")
    public static final HotelBookingInputType PHONE;

    @c("text")
    public static final HotelBookingInputType TEXT;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ HotelBookingInputType[] f162623b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f162624c;

    static {
        HotelBookingInputType hotelBookingInputType = new HotelBookingInputType("TEXT", 0);
        TEXT = hotelBookingInputType;
        HotelBookingInputType hotelBookingInputType2 = new HotelBookingInputType("PHONE", 1);
        PHONE = hotelBookingInputType2;
        HotelBookingInputType hotelBookingInputType3 = new HotelBookingInputType("EMAIL", 2);
        EMAIL = hotelBookingInputType3;
        HotelBookingInputType[] hotelBookingInputTypeArr = {hotelBookingInputType, hotelBookingInputType2, hotelBookingInputType3};
        f162623b = hotelBookingInputTypeArr;
        f162624c = kotlin.enums.c.a(hotelBookingInputTypeArr);
        CREATOR = new Parcelable.Creator<HotelBookingInputType>() { // from class: com.avito.android.hotel.model.HotelBookingInputType.a
            @Override // android.os.Parcelable.Creator
            public final HotelBookingInputType createFromParcel(Parcel parcel) {
                return HotelBookingInputType.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final HotelBookingInputType[] newArray(int i12) {
                return new HotelBookingInputType[i12];
            }
        };
    }

    private HotelBookingInputType(String str, int i12) {
    }

    public static HotelBookingInputType valueOf(String str) {
        return (HotelBookingInputType) Enum.valueOf(HotelBookingInputType.class, str);
    }

    public static HotelBookingInputType[] values() {
        return (HotelBookingInputType[]) f162623b.clone();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(name());
    }
}
