package com.avito.android.hotel_available_rooms.konveyor.more;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import com.avito.conveyor_item.ParcelableItem;
import com.avito.conveyor_item.a;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: HotelRoomMoreItem.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/hotel_available_rooms/konveyor/more/HotelRoomMoreItem;", "Lcom/avito/conveyor_item/ParcelableItem;", "_avito_hotel-available-rooms_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class HotelRoomMoreItem implements ParcelableItem {

    @k
    public static final Parcelable.Creator<HotelRoomMoreItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f163033b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f163034c;

    /* compiled from: HotelRoomMoreItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<HotelRoomMoreItem> {
        @Override // android.os.Parcelable.Creator
        public final HotelRoomMoreItem createFromParcel(Parcel parcel) {
            return new HotelRoomMoreItem(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final HotelRoomMoreItem[] newArray(int i12) {
            return new HotelRoomMoreItem[i12];
        }
    }

    public HotelRoomMoreItem(@k String str, @k String str2) {
        this.f163033b = str;
        this.f163034c = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HotelRoomMoreItem)) {
            return false;
        }
        HotelRoomMoreItem hotelRoomMoreItem = (HotelRoomMoreItem) obj;
        return L.f(this.f163033b, hotelRoomMoreItem.f163033b) && L.f(this.f163034c, hotelRoomMoreItem.f163034c);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF269899b() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF163033b() {
        return this.f163033b;
    }

    public final int hashCode() {
        return this.f163034c.hashCode() + (this.f163033b.hashCode() * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("HotelRoomMoreItem(stringId=");
        sb2.append(this.f163033b);
        sb2.append(", roomId=");
        return C22026a.c(sb2, this.f163034c, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f163033b);
        parcel.writeString(this.f163034c);
    }
}
