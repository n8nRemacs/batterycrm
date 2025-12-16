package com.google.android.exoplayer2.metadata.mp4;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.common.primitives.n;
import j.P;

/* loaded from: classes6.dex */
public final class MotionPhotoMetadata implements Metadata.Entry {
    public static final Parcelable.Creator<MotionPhotoMetadata> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final long f345717b;

    /* renamed from: c, reason: collision with root package name */
    public final long f345718c;

    /* renamed from: d, reason: collision with root package name */
    public final long f345719d;

    /* renamed from: e, reason: collision with root package name */
    public final long f345720e;

    /* renamed from: f, reason: collision with root package name */
    public final long f345721f;

    public class a implements Parcelable.Creator<MotionPhotoMetadata> {
        @Override // android.os.Parcelable.Creator
        public final MotionPhotoMetadata createFromParcel(Parcel parcel) {
            return new MotionPhotoMetadata(parcel, null);
        }

        @Override // android.os.Parcelable.Creator
        public final MotionPhotoMetadata[] newArray(int i12) {
            return new MotionPhotoMetadata[i12];
        }
    }

    public MotionPhotoMetadata(long j12, long j13, long j14, long j15, long j16) {
        this.f345717b = j12;
        this.f345718c = j13;
        this.f345719d = j14;
        this.f345720e = j15;
        this.f345721f = j16;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@P Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || MotionPhotoMetadata.class != obj.getClass()) {
            return false;
        }
        MotionPhotoMetadata motionPhotoMetadata = (MotionPhotoMetadata) obj;
        return this.f345717b == motionPhotoMetadata.f345717b && this.f345718c == motionPhotoMetadata.f345718c && this.f345719d == motionPhotoMetadata.f345719d && this.f345720e == motionPhotoMetadata.f345720e && this.f345721f == motionPhotoMetadata.f345721f;
    }

    public final int hashCode() {
        return n.b(this.f345721f) + ((n.b(this.f345720e) + ((n.b(this.f345719d) + ((n.b(this.f345718c) + ((n.b(this.f345717b) + 527) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "Motion photo metadata: photoStartPosition=" + this.f345717b + ", photoSize=" + this.f345718c + ", photoPresentationTimestampUs=" + this.f345719d + ", videoStartPosition=" + this.f345720e + ", videoSize=" + this.f345721f;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i12) {
        parcel.writeLong(this.f345717b);
        parcel.writeLong(this.f345718c);
        parcel.writeLong(this.f345719d);
        parcel.writeLong(this.f345720e);
        parcel.writeLong(this.f345721f);
    }

    public MotionPhotoMetadata(Parcel parcel, a aVar) {
        this.f345717b = parcel.readLong();
        this.f345718c = parcel.readLong();
        this.f345719d = parcel.readLong();
        this.f345720e = parcel.readLong();
        this.f345721f = parcel.readLong();
    }
}
