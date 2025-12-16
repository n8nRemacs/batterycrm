package com.avito.android.hotel_available_rooms;

import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: HotelAvailableRoomsOpenParams.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/hotel_available_rooms/HotelAvailableRoomsOpenParams;", "Landroid/os/Parcelable;", "_avito_hotel-available-rooms_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class HotelAvailableRoomsOpenParams implements Parcelable {

    @Y61.k
    public static final Parcelable.Creator<HotelAvailableRoomsOpenParams> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f162661b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final String f162662c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final String f162663d;

    /* renamed from: e, reason: collision with root package name */
    public final int f162664e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final String f162665f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public final List<Integer> f162666g;

    /* compiled from: HotelAvailableRoomsOpenParams.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<HotelAvailableRoomsOpenParams> {
        @Override // android.os.Parcelable.Creator
        public final HotelAvailableRoomsOpenParams createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            int i12 = parcel.readInt();
            String string4 = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i13 = parcel.readInt();
                arrayList = new ArrayList(i13);
                int iD2 = 0;
                while (iD2 != i13) {
                    iD2 = com.avito.android.advert.item.delivery_suggests.l.d(parcel, arrayList, iD2, 1);
                }
            }
            return new HotelAvailableRoomsOpenParams(string, string2, string3, i12, string4, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final HotelAvailableRoomsOpenParams[] newArray(int i12) {
            return new HotelAvailableRoomsOpenParams[i12];
        }
    }

    public HotelAvailableRoomsOpenParams(@Y61.k String str, @Y61.k String str2, @Y61.k String str3, int i12, @l String str4, @l List<Integer> list) {
        this.f162661b = str;
        this.f162662c = str2;
        this.f162663d = str3;
        this.f162664e = i12;
        this.f162665f = str4;
        this.f162666g = list;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HotelAvailableRoomsOpenParams)) {
            return false;
        }
        HotelAvailableRoomsOpenParams hotelAvailableRoomsOpenParams = (HotelAvailableRoomsOpenParams) obj;
        return L.f(this.f162661b, hotelAvailableRoomsOpenParams.f162661b) && L.f(this.f162662c, hotelAvailableRoomsOpenParams.f162662c) && L.f(this.f162663d, hotelAvailableRoomsOpenParams.f162663d) && this.f162664e == hotelAvailableRoomsOpenParams.f162664e && L.f(this.f162665f, hotelAvailableRoomsOpenParams.f162665f) && L.f(this.f162666g, hotelAvailableRoomsOpenParams.f162666g);
    }

    public final int hashCode() {
        int iE2 = r.e(this.f162664e, H.d(H.d(this.f162661b.hashCode() * 31, 31, this.f162662c), 31, this.f162663d), 31);
        String str = this.f162665f;
        int iHashCode = (iE2 + (str == null ? 0 : str.hashCode())) * 31;
        List<Integer> list = this.f162666g;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("HotelAvailableRoomsOpenParams(itemId=");
        sb2.append(this.f162661b);
        sb2.append(", checkIn=");
        sb2.append(this.f162662c);
        sb2.append(", checkOut=");
        sb2.append(this.f162663d);
        sb2.append(", adultsCount=");
        sb2.append(this.f162664e);
        sb2.append(", from=");
        sb2.append(this.f162665f);
        sb2.append(", childAges=");
        return H.p(sb2, this.f162666g, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeString(this.f162661b);
        parcel.writeString(this.f162662c);
        parcel.writeString(this.f162663d);
        parcel.writeInt(this.f162664e);
        parcel.writeString(this.f162665f);
        List<Integer> list = this.f162666g;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator itA = com.avito.android.actions_sheet.a.A(list, parcel, 1);
        while (itA.hasNext()) {
            parcel.writeInt(((Number) itA.next()).intValue());
        }
    }
}
