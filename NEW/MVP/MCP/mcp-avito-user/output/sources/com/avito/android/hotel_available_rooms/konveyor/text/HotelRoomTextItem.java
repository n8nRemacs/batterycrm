package com.avito.android.hotel_available_rooms.konveyor.text;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.conveyor_item.ParcelableItem;
import com.avito.conveyor_item.a;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: HotelRoomTextItem.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/hotel_available_rooms/konveyor/text/HotelRoomTextItem;", "Lcom/avito/conveyor_item/ParcelableItem;", "_avito_hotel-available-rooms_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class HotelRoomTextItem implements ParcelableItem {

    @k
    public static final Parcelable.Creator<HotelRoomTextItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f163067b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final TextData f163068c;

    /* compiled from: HotelRoomTextItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<HotelRoomTextItem> {
        @Override // android.os.Parcelable.Creator
        public final HotelRoomTextItem createFromParcel(Parcel parcel) {
            return new HotelRoomTextItem(parcel.readString(), (TextData) parcel.readParcelable(HotelRoomTextItem.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final HotelRoomTextItem[] newArray(int i12) {
            return new HotelRoomTextItem[i12];
        }
    }

    public HotelRoomTextItem(@k String str, @k TextData textData) {
        this.f163067b = str;
        this.f163068c = textData;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HotelRoomTextItem)) {
            return false;
        }
        HotelRoomTextItem hotelRoomTextItem = (HotelRoomTextItem) obj;
        return L.f(this.f163067b, hotelRoomTextItem.f163067b) && L.f(this.f163068c, hotelRoomTextItem.f163068c);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF162211b() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF161029b() {
        return this.f163067b;
    }

    public final int hashCode() {
        return this.f163068c.hashCode() + (this.f163067b.hashCode() * 31);
    }

    @k
    public final String toString() {
        return "HotelRoomTextItem(stringId=" + this.f163067b + ", data=" + this.f163068c + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f163067b);
        parcel.writeParcelable(this.f163068c, i12);
    }
}
