package com.avito.android.hotel_available_rooms.konveyor.gap;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import com.avito.conveyor_item.ParcelableItem;
import com.avito.conveyor_item.a;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: HotelRoomGapItem.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/hotel_available_rooms/konveyor/gap/HotelRoomGapItem;", "Lcom/avito/conveyor_item/ParcelableItem;", "_avito_hotel-available-rooms_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class HotelRoomGapItem implements ParcelableItem {

    @k
    public static final Parcelable.Creator<HotelRoomGapItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f162956b;

    /* renamed from: c, reason: collision with root package name */
    public final int f162957c;

    /* compiled from: HotelRoomGapItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<HotelRoomGapItem> {
        @Override // android.os.Parcelable.Creator
        public final HotelRoomGapItem createFromParcel(Parcel parcel) {
            return new HotelRoomGapItem(parcel.readString(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final HotelRoomGapItem[] newArray(int i12) {
            return new HotelRoomGapItem[i12];
        }
    }

    public HotelRoomGapItem(@k String str, int i12) {
        this.f162956b = str;
        this.f162957c = i12;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HotelRoomGapItem)) {
            return false;
        }
        HotelRoomGapItem hotelRoomGapItem = (HotelRoomGapItem) obj;
        return L.f(this.f162956b, hotelRoomGapItem.f162956b) && this.f162957c == hotelRoomGapItem.f162957c;
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
        return this.f162956b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f162957c) + (this.f162956b.hashCode() * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("HotelRoomGapItem(stringId=");
        sb2.append(this.f162956b);
        sb2.append(", height=");
        return r.t(sb2, this.f162957c, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f162956b);
        parcel.writeInt(this.f162957c);
    }
}
