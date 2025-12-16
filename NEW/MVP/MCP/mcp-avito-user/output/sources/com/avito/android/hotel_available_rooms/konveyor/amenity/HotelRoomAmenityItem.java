package com.avito.android.hotel_available_rooms.konveyor.amenity;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.conveyor_item.ParcelableItem;
import com.avito.conveyor_item.a;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: HotelRoomAmenityItem.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/hotel_available_rooms/konveyor/amenity/HotelRoomAmenityItem;", "Lcom/avito/conveyor_item/ParcelableItem;", "_avito_hotel-available-rooms_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class HotelRoomAmenityItem implements ParcelableItem {

    @k
    public static final Parcelable.Creator<HotelRoomAmenityItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f162835b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final String f162836c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final String f162837d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final DeepLink f162838e;

    /* compiled from: HotelRoomAmenityItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<HotelRoomAmenityItem> {
        @Override // android.os.Parcelable.Creator
        public final HotelRoomAmenityItem createFromParcel(Parcel parcel) {
            return new HotelRoomAmenityItem(parcel.readString(), parcel.readString(), parcel.readString(), (DeepLink) parcel.readParcelable(HotelRoomAmenityItem.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final HotelRoomAmenityItem[] newArray(int i12) {
            return new HotelRoomAmenityItem[i12];
        }
    }

    public HotelRoomAmenityItem(@k String str, @l String str2, @k String str3, @l DeepLink deepLink) {
        this.f162835b = str;
        this.f162836c = str2;
        this.f162837d = str3;
        this.f162838e = deepLink;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HotelRoomAmenityItem)) {
            return false;
        }
        HotelRoomAmenityItem hotelRoomAmenityItem = (HotelRoomAmenityItem) obj;
        return L.f(this.f162835b, hotelRoomAmenityItem.f162835b) && L.f(this.f162836c, hotelRoomAmenityItem.f162836c) && L.f(this.f162837d, hotelRoomAmenityItem.f162837d) && L.f(this.f162838e, hotelRoomAmenityItem.f162838e);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF80596b() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF152076b() {
        return this.f162835b;
    }

    public final int hashCode() {
        int iHashCode = this.f162835b.hashCode() * 31;
        String str = this.f162836c;
        int iD2 = H.d((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.f162837d);
        DeepLink deepLink = this.f162838e;
        return iD2 + (deepLink != null ? deepLink.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("HotelRoomAmenityItem(stringId=");
        sb2.append(this.f162835b);
        sb2.append(", iconName=");
        sb2.append(this.f162836c);
        sb2.append(", title=");
        sb2.append(this.f162837d);
        sb2.append(", deeplink=");
        return com.avito.android.actions_sheet.a.v(sb2, this.f162838e, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f162835b);
        parcel.writeString(this.f162836c);
        parcel.writeString(this.f162837d);
        parcel.writeParcelable(this.f162838e, i12);
    }
}
