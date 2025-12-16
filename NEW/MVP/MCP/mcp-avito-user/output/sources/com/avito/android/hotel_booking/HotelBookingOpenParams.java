package com.avito.android.hotel_booking;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import com.avito.android.util.OpenParams;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: HotelBookingOpenParams.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/hotel_booking/HotelBookingOpenParams;", "Lcom/avito/android/util/OpenParams;", "_avito_hotel-booking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class HotelBookingOpenParams implements OpenParams {

    @k
    public static final Parcelable.Creator<HotelBookingOpenParams> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f163250b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final Integer f163251c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final ArrayList f163252d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final String f163253e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final String f163254f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public final String f163255g;

    /* renamed from: h, reason: collision with root package name */
    @l
    public final String f163256h;

    /* compiled from: HotelBookingOpenParams.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<HotelBookingOpenParams> {
        @Override // android.os.Parcelable.Creator
        public final HotelBookingOpenParams createFromParcel(Parcel parcel) {
            String string = parcel.readString();
            ArrayList arrayList = null;
            Integer numValueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            if (parcel.readInt() != 0) {
                int i12 = parcel.readInt();
                arrayList = new ArrayList(i12);
                int iD2 = 0;
                while (iD2 != i12) {
                    iD2 = com.avito.android.advert.item.delivery_suggests.l.d(parcel, arrayList, iD2, 1);
                }
            }
            return new HotelBookingOpenParams(string, numValueOf, arrayList, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final HotelBookingOpenParams[] newArray(int i12) {
            return new HotelBookingOpenParams[i12];
        }
    }

    public HotelBookingOpenParams(@k String str, @l Integer num, @l ArrayList arrayList, @l String str2, @l String str3, @l String str4, @l String str5) {
        this.f163250b = str;
        this.f163251c = num;
        this.f163252d = arrayList;
        this.f163253e = str2;
        this.f163254f = str3;
        this.f163255g = str4;
        this.f163256h = str5;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HotelBookingOpenParams)) {
            return false;
        }
        HotelBookingOpenParams hotelBookingOpenParams = (HotelBookingOpenParams) obj;
        return L.f(this.f163250b, hotelBookingOpenParams.f163250b) && L.f(this.f163251c, hotelBookingOpenParams.f163251c) && L.f(this.f163252d, hotelBookingOpenParams.f163252d) && L.f(this.f163253e, hotelBookingOpenParams.f163253e) && L.f(this.f163254f, hotelBookingOpenParams.f163254f) && L.f(this.f163255g, hotelBookingOpenParams.f163255g) && L.f(this.f163256h, hotelBookingOpenParams.f163256h);
    }

    public final int hashCode() {
        int iHashCode = this.f163250b.hashCode() * 31;
        Integer num = this.f163251c;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        ArrayList arrayList = this.f163252d;
        int iHashCode3 = (iHashCode2 + (arrayList == null ? 0 : arrayList.hashCode())) * 31;
        String str = this.f163253e;
        int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f163254f;
        int iHashCode5 = (iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f163255g;
        int iHashCode6 = (iHashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f163256h;
        return iHashCode6 + (str4 != null ? str4.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("HotelBookingOpenParams(offerCode=");
        sb2.append(this.f163250b);
        sb2.append(", adultGuests=");
        sb2.append(this.f163251c);
        sb2.append(", childAges=");
        sb2.append(this.f163252d);
        sb2.append(", itemId=");
        sb2.append(this.f163253e);
        sb2.append(", roomId=");
        sb2.append(this.f163254f);
        sb2.append(", checkIn=");
        sb2.append(this.f163255g);
        sb2.append(", checkOut=");
        return C22026a.c(sb2, this.f163256h, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f163250b);
        Integer num = this.f163251c;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            com.avito.android.actions_sheet.a.C(parcel, 1, num);
        }
        ArrayList arrayList = this.f163252d;
        if (arrayList == null) {
            parcel.writeInt(0);
        } else {
            Iterator itY = com.avito.android.actions_sheet.a.y(parcel, 1, arrayList);
            while (itY.hasNext()) {
                parcel.writeInt(((Number) itY.next()).intValue());
            }
        }
        parcel.writeString(this.f163253e);
        parcel.writeString(this.f163254f);
        parcel.writeString(this.f163255g);
        parcel.writeString(this.f163256h);
    }
}
