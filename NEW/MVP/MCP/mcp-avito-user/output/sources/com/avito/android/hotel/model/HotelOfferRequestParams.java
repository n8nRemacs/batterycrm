package com.avito.android.hotel.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: AdvertHotel.kt */
@d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/hotel/model/HotelOfferRequestParams;", "Landroid/os/Parcelable;", "_avito_hotel_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class HotelOfferRequestParams implements Parcelable {

    @k
    public static final Parcelable.Creator<HotelOfferRequestParams> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f162638b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final DateFilter f162639c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final GuestFilter f162640d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final String f162641e;

    /* compiled from: AdvertHotel.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<HotelOfferRequestParams> {
        @Override // android.os.Parcelable.Creator
        public final HotelOfferRequestParams createFromParcel(Parcel parcel) {
            return new HotelOfferRequestParams(parcel.readString(), DateFilter.CREATOR.createFromParcel(parcel), GuestFilter.CREATOR.createFromParcel(parcel), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final HotelOfferRequestParams[] newArray(int i12) {
            return new HotelOfferRequestParams[i12];
        }
    }

    public HotelOfferRequestParams(@k String str, @k DateFilter dateFilter, @k GuestFilter guestFilter, @l String str2) {
        this.f162638b = str;
        this.f162639c = dateFilter;
        this.f162640d = guestFilter;
        this.f162641e = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HotelOfferRequestParams)) {
            return false;
        }
        HotelOfferRequestParams hotelOfferRequestParams = (HotelOfferRequestParams) obj;
        return L.f(this.f162638b, hotelOfferRequestParams.f162638b) && L.f(this.f162639c, hotelOfferRequestParams.f162639c) && L.f(this.f162640d, hotelOfferRequestParams.f162640d) && L.f(this.f162641e, hotelOfferRequestParams.f162641e);
    }

    public final int hashCode() {
        int iHashCode = (this.f162640d.hashCode() + ((this.f162639c.hashCode() + (this.f162638b.hashCode() * 31)) * 31)) * 31;
        String str = this.f162641e;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("HotelOfferRequestParams(itemId=");
        sb2.append(this.f162638b);
        sb2.append(", dateFilter=");
        sb2.append(this.f162639c);
        sb2.append(", guestFilter=");
        sb2.append(this.f162640d);
        sb2.append(", context=");
        return C22026a.c(sb2, this.f162641e, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f162638b);
        this.f162639c.writeToParcel(parcel, i12);
        this.f162640d.writeToParcel(parcel, i12);
        parcel.writeString(this.f162641e);
    }
}
