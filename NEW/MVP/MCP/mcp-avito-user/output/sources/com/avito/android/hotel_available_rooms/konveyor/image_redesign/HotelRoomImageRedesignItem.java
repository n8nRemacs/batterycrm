package com.avito.android.hotel_available_rooms.konveyor.image_redesign;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import com.avito.android.remote.model.Image;
import com.avito.conveyor_item.ParcelableItem;
import com.avito.conveyor_item.a;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: HotelRoomImageRedesignItem.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/hotel_available_rooms/konveyor/image_redesign/HotelRoomImageRedesignItem;", "Lcom/avito/conveyor_item/ParcelableItem;", "_avito_hotel-available-rooms_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class HotelRoomImageRedesignItem implements ParcelableItem {

    @k
    public static final Parcelable.Creator<HotelRoomImageRedesignItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f163001b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f163002c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final Image f163003d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final ImageRedesignSize f163004e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final ImageRedesignCorners f163005f;

    /* renamed from: g, reason: collision with root package name */
    public final int f163006g;

    /* compiled from: HotelRoomImageRedesignItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<HotelRoomImageRedesignItem> {
        @Override // android.os.Parcelable.Creator
        public final HotelRoomImageRedesignItem createFromParcel(Parcel parcel) {
            return new HotelRoomImageRedesignItem(parcel.readString(), parcel.readString(), (Image) parcel.readParcelable(HotelRoomImageRedesignItem.class.getClassLoader()), ImageRedesignSize.valueOf(parcel.readString()), ImageRedesignCorners.CREATOR.createFromParcel(parcel), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final HotelRoomImageRedesignItem[] newArray(int i12) {
            return new HotelRoomImageRedesignItem[i12];
        }
    }

    public HotelRoomImageRedesignItem(@k String str, @k String str2, @k Image image, @k ImageRedesignSize imageRedesignSize, @k ImageRedesignCorners imageRedesignCorners, int i12) {
        this.f163001b = str;
        this.f163002c = str2;
        this.f163003d = image;
        this.f163004e = imageRedesignSize;
        this.f163005f = imageRedesignCorners;
        this.f163006g = i12;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HotelRoomImageRedesignItem)) {
            return false;
        }
        HotelRoomImageRedesignItem hotelRoomImageRedesignItem = (HotelRoomImageRedesignItem) obj;
        return L.f(this.f163001b, hotelRoomImageRedesignItem.f163001b) && L.f(this.f163002c, hotelRoomImageRedesignItem.f163002c) && L.f(this.f163003d, hotelRoomImageRedesignItem.f163003d) && this.f163004e == hotelRoomImageRedesignItem.f163004e && L.f(this.f163005f, hotelRoomImageRedesignItem.f163005f) && this.f163006g == hotelRoomImageRedesignItem.f163006g;
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF85003b() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF236852b() {
        return this.f163001b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f163006g) + ((this.f163005f.hashCode() + ((this.f163004e.hashCode() + com.avito.android.actions_sheet.a.g(this.f163003d, H.d(this.f163001b.hashCode() * 31, 31, this.f163002c), 31)) * 31)) * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("HotelRoomImageRedesignItem(stringId=");
        sb2.append(this.f163001b);
        sb2.append(", roomId=");
        sb2.append(this.f163002c);
        sb2.append(", image=");
        sb2.append(this.f163003d);
        sb2.append(", size=");
        sb2.append(this.f163004e);
        sb2.append(", corners=");
        sb2.append(this.f163005f);
        sb2.append(", placeholderRes=");
        return r.t(sb2, this.f163006g, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f163001b);
        parcel.writeString(this.f163002c);
        parcel.writeParcelable(this.f163003d, i12);
        parcel.writeString(this.f163004e.name());
        this.f163005f.writeToParcel(parcel, i12);
        parcel.writeInt(this.f163006g);
    }
}
