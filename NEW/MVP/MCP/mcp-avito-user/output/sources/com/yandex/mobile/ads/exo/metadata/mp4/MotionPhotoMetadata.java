package com.yandex.mobile.ads.exo.metadata.mp4;

import android.os.Parcel;
import android.os.Parcelable;
import com.yandex.mobile.ads.exo.metadata.Metadata;
import com.yandex.mobile.ads.impl.Cif;
import j.P;

/* loaded from: classes8.dex */
public final class MotionPhotoMetadata implements Metadata.Entry {
    public static final Parcelable.Creator<MotionPhotoMetadata> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    public final long f383021a;

    /* renamed from: b, reason: collision with root package name */
    public final long f383022b;

    /* renamed from: c, reason: collision with root package name */
    public final long f383023c;

    /* renamed from: d, reason: collision with root package name */
    public final long f383024d;

    /* renamed from: e, reason: collision with root package name */
    public final long f383025e;

    public class a implements Parcelable.Creator<MotionPhotoMetadata> {
        @Override // android.os.Parcelable.Creator
        public final MotionPhotoMetadata createFromParcel(Parcel parcel) {
            return new MotionPhotoMetadata(parcel, 0);
        }

        @Override // android.os.Parcelable.Creator
        public final MotionPhotoMetadata[] newArray(int i12) {
            return new MotionPhotoMetadata[i12];
        }
    }

    public /* synthetic */ MotionPhotoMetadata(Parcel parcel, int i12) {
        this(parcel);
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
        return this.f383021a == motionPhotoMetadata.f383021a && this.f383022b == motionPhotoMetadata.f383022b && this.f383023c == motionPhotoMetadata.f383023c && this.f383024d == motionPhotoMetadata.f383024d && this.f383025e == motionPhotoMetadata.f383025e;
    }

    public final int hashCode() {
        long j12 = this.f383021a;
        long j13 = this.f383022b;
        int i12 = (((int) (j13 ^ (j13 >>> 32))) + ((((int) (j12 ^ (j12 >>> 32))) + 527) * 31)) * 31;
        long j14 = this.f383023c;
        int i13 = (((int) (j14 ^ (j14 >>> 32))) + i12) * 31;
        long j15 = this.f383024d;
        int i14 = (((int) (j15 ^ (j15 >>> 32))) + i13) * 31;
        long j16 = this.f383025e;
        return ((int) (j16 ^ (j16 >>> 32))) + i14;
    }

    public final String toString() {
        StringBuilder sbA = Cif.a("Motion photo metadata: photoStartPosition=");
        sbA.append(this.f383021a);
        sbA.append(", photoSize=");
        sbA.append(this.f383022b);
        sbA.append(", photoPresentationTimestampUs=");
        sbA.append(this.f383023c);
        sbA.append(", videoStartPosition=");
        sbA.append(this.f383024d);
        sbA.append(", videoSize=");
        sbA.append(this.f383025e);
        return sbA.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i12) {
        parcel.writeLong(this.f383021a);
        parcel.writeLong(this.f383022b);
        parcel.writeLong(this.f383023c);
        parcel.writeLong(this.f383024d);
        parcel.writeLong(this.f383025e);
    }

    public MotionPhotoMetadata(long j12, long j13, long j14, long j15, long j16) {
        this.f383021a = j12;
        this.f383022b = j13;
        this.f383023c = j14;
        this.f383024d = j15;
        this.f383025e = j16;
    }

    private MotionPhotoMetadata(Parcel parcel) {
        this.f383021a = parcel.readLong();
        this.f383022b = parcel.readLong();
        this.f383023c = parcel.readLong();
        this.f383024d = parcel.readLong();
        this.f383025e = parcel.readLong();
    }
}
