package com.avito.android.photo_picker.converter;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import kotlin.Metadata;

/* compiled from: ImageConvertOptions.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/photo_picker/converter/ImageConvertOptions;", "Landroid/os/Parcelable;", "_avito_photo-conversion_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class ImageConvertOptions implements Parcelable {

    @k
    public static final Parcelable.Creator<ImageConvertOptions> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final int f219310b;

    /* renamed from: c, reason: collision with root package name */
    public final int f219311c;

    /* renamed from: d, reason: collision with root package name */
    public final int f219312d;

    /* renamed from: e, reason: collision with root package name */
    public final int f219313e;

    /* compiled from: ImageConvertOptions.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<ImageConvertOptions> {
        @Override // android.os.Parcelable.Creator
        public final ImageConvertOptions createFromParcel(Parcel parcel) {
            return new ImageConvertOptions(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final ImageConvertOptions[] newArray(int i12) {
            return new ImageConvertOptions[i12];
        }
    }

    public ImageConvertOptions(int i12, int i13, int i14, int i15) {
        this.f219310b = i12;
        this.f219311c = i13;
        this.f219312d = i14;
        this.f219313e = i15;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ImageConvertOptions)) {
            return false;
        }
        ImageConvertOptions imageConvertOptions = (ImageConvertOptions) obj;
        return this.f219310b == imageConvertOptions.f219310b && this.f219311c == imageConvertOptions.f219311c && this.f219312d == imageConvertOptions.f219312d && this.f219313e == imageConvertOptions.f219313e;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f219313e) + r.e(this.f219312d, r.e(this.f219311c, Integer.hashCode(this.f219310b) * 31, 31), 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ImageConvertOptions(maxHeight=");
        sb2.append(this.f219310b);
        sb2.append(", maxWidth=");
        sb2.append(this.f219311c);
        sb2.append(", jpegQuality=");
        sb2.append(this.f219312d);
        sb2.append(", maxFileSizeBytes=");
        return r.t(sb2, this.f219313e, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeInt(this.f219310b);
        parcel.writeInt(this.f219311c);
        parcel.writeInt(this.f219312d);
        parcel.writeInt(this.f219313e);
    }
}
