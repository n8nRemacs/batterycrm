package com.avito.android.hotel_available_rooms.konveyor.image;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import kotlin.Metadata;

/* compiled from: HotelRoomImageItem.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/hotel_available_rooms/konveyor/image/ImageCorners;", "Landroid/os/Parcelable;", "_avito_hotel-available-rooms_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class ImageCorners implements Parcelable {

    @Y61.k
    public static final Parcelable.Creator<ImageCorners> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final int f162970b;

    /* renamed from: c, reason: collision with root package name */
    public final int f162971c;

    /* renamed from: d, reason: collision with root package name */
    public final int f162972d;

    /* renamed from: e, reason: collision with root package name */
    public final int f162973e;

    /* compiled from: HotelRoomImageItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<ImageCorners> {
        @Override // android.os.Parcelable.Creator
        public final ImageCorners createFromParcel(Parcel parcel) {
            return new ImageCorners(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final ImageCorners[] newArray(int i12) {
            return new ImageCorners[i12];
        }
    }

    public ImageCorners(int i12, int i13, int i14, int i15) {
        this.f162970b = i12;
        this.f162971c = i13;
        this.f162972d = i14;
        this.f162973e = i15;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ImageCorners)) {
            return false;
        }
        ImageCorners imageCorners = (ImageCorners) obj;
        return this.f162970b == imageCorners.f162970b && this.f162971c == imageCorners.f162971c && this.f162972d == imageCorners.f162972d && this.f162973e == imageCorners.f162973e;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f162973e) + r.e(this.f162972d, r.e(this.f162971c, Integer.hashCode(this.f162970b) * 31, 31), 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ImageCorners(topLeft=");
        sb2.append(this.f162970b);
        sb2.append(", topRight=");
        sb2.append(this.f162971c);
        sb2.append(", bottomLeft=");
        sb2.append(this.f162972d);
        sb2.append(", bottomRight=");
        return r.t(sb2, this.f162973e, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeInt(this.f162970b);
        parcel.writeInt(this.f162971c);
        parcel.writeInt(this.f162972d);
        parcel.writeInt(this.f162973e);
    }
}
