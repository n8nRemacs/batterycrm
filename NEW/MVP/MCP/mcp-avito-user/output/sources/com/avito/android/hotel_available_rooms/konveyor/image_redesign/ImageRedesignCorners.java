package com.avito.android.hotel_available_rooms.konveyor.image_redesign;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import com.avito.android.util.y6;
import kotlin.Metadata;

/* compiled from: HotelRoomImageRedesignItem.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/hotel_available_rooms/konveyor/image_redesign/ImageRedesignCorners;", "Landroid/os/Parcelable;", "_avito_hotel-available-rooms_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class ImageRedesignCorners implements Parcelable {

    @k
    public static final Parcelable.Creator<ImageRedesignCorners> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final float f163007b;

    /* renamed from: c, reason: collision with root package name */
    public final float f163008c;

    /* renamed from: d, reason: collision with root package name */
    public final float f163009d;

    /* renamed from: e, reason: collision with root package name */
    public final float f163010e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final float[] f163011f;

    /* compiled from: HotelRoomImageRedesignItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<ImageRedesignCorners> {
        @Override // android.os.Parcelable.Creator
        public final ImageRedesignCorners createFromParcel(Parcel parcel) {
            return new ImageRedesignCorners(parcel.readFloat(), parcel.readFloat(), parcel.readFloat(), parcel.readFloat());
        }

        @Override // android.os.Parcelable.Creator
        public final ImageRedesignCorners[] newArray(int i12) {
            return new ImageRedesignCorners[i12];
        }
    }

    public ImageRedesignCorners(float f12, float f13, float f14, float f15) {
        this.f163007b = f12;
        this.f163008c = f13;
        this.f163009d = f14;
        this.f163010e = f15;
        this.f163011f = new float[]{y6.a(f12), y6.a(f12), y6.a(f13), y6.a(f13), y6.a(f15), y6.a(f15), y6.a(f14), y6.a(f14)};
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ImageRedesignCorners)) {
            return false;
        }
        ImageRedesignCorners imageRedesignCorners = (ImageRedesignCorners) obj;
        return Float.compare(this.f163007b, imageRedesignCorners.f163007b) == 0 && Float.compare(this.f163008c, imageRedesignCorners.f163008c) == 0 && Float.compare(this.f163009d, imageRedesignCorners.f163009d) == 0 && Float.compare(this.f163010e, imageRedesignCorners.f163010e) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f163010e) + r.d(this.f163009d, r.d(this.f163008c, Float.hashCode(this.f163007b) * 31, 31), 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ImageRedesignCorners(topLeft=");
        sb2.append(this.f163007b);
        sb2.append(", topRight=");
        sb2.append(this.f163008c);
        sb2.append(", bottomLeft=");
        sb2.append(this.f163009d);
        sb2.append(", bottomRight=");
        return r.k(')', this.f163010e, sb2);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeFloat(this.f163007b);
        parcel.writeFloat(this.f163008c);
        parcel.writeFloat(this.f163009d);
        parcel.writeFloat(this.f163010e);
    }
}
