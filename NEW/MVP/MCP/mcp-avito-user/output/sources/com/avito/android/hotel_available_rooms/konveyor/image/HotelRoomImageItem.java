package com.avito.android.hotel_available_rooms.konveyor.image;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import com.avito.android.remote.model.Image;
import com.avito.conveyor_item.ParcelableItem;
import com.avito.conveyor_item.a;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: HotelRoomImageItem.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/hotel_available_rooms/konveyor/image/HotelRoomImageItem;", "Lcom/avito/conveyor_item/ParcelableItem;", "_avito_hotel-available-rooms_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class HotelRoomImageItem implements ParcelableItem {

    @Y61.k
    public static final Parcelable.Creator<HotelRoomImageItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f162964b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final String f162965c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final Image f162966d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final ImageSize f162967e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final ImageCorners f162968f;

    /* renamed from: g, reason: collision with root package name */
    public final int f162969g;

    /* compiled from: HotelRoomImageItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<HotelRoomImageItem> {
        @Override // android.os.Parcelable.Creator
        public final HotelRoomImageItem createFromParcel(Parcel parcel) {
            return new HotelRoomImageItem(parcel.readString(), parcel.readString(), (Image) parcel.readParcelable(HotelRoomImageItem.class.getClassLoader()), ImageSize.valueOf(parcel.readString()), ImageCorners.CREATOR.createFromParcel(parcel), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final HotelRoomImageItem[] newArray(int i12) {
            return new HotelRoomImageItem[i12];
        }
    }

    public HotelRoomImageItem(@Y61.k String str, @Y61.k String str2, @Y61.k Image image, @Y61.k ImageSize imageSize, @Y61.k ImageCorners imageCorners, int i12) {
        this.f162964b = str;
        this.f162965c = str2;
        this.f162966d = image;
        this.f162967e = imageSize;
        this.f162968f = imageCorners;
        this.f162969g = i12;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HotelRoomImageItem)) {
            return false;
        }
        HotelRoomImageItem hotelRoomImageItem = (HotelRoomImageItem) obj;
        return L.f(this.f162964b, hotelRoomImageItem.f162964b) && L.f(this.f162965c, hotelRoomImageItem.f162965c) && L.f(this.f162966d, hotelRoomImageItem.f162966d) && this.f162967e == hotelRoomImageItem.f162967e && L.f(this.f162968f, hotelRoomImageItem.f162968f) && this.f162969g == hotelRoomImageItem.f162969g;
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF85003b() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.conveyor_item.a
    @Y61.k
    /* renamed from: getStringId, reason: from getter */
    public final String getF154833b() {
        return this.f162964b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f162969g) + ((this.f162968f.hashCode() + ((this.f162967e.hashCode() + com.avito.android.actions_sheet.a.g(this.f162966d, H.d(this.f162964b.hashCode() * 31, 31, this.f162965c), 31)) * 31)) * 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("HotelRoomImageItem(stringId=");
        sb2.append(this.f162964b);
        sb2.append(", roomId=");
        sb2.append(this.f162965c);
        sb2.append(", image=");
        sb2.append(this.f162966d);
        sb2.append(", size=");
        sb2.append(this.f162967e);
        sb2.append(", corners=");
        sb2.append(this.f162968f);
        sb2.append(", placeholderRes=");
        return r.t(sb2, this.f162969g, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeString(this.f162964b);
        parcel.writeString(this.f162965c);
        parcel.writeParcelable(this.f162966d, i12);
        parcel.writeString(this.f162967e.name());
        this.f162968f.writeToParcel(parcel, i12);
        parcel.writeInt(this.f162969g);
    }
}
