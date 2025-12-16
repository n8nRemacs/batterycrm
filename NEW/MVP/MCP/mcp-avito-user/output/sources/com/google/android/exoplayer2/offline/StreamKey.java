package com.google.android.exoplayer2.offline;

import android.os.Parcel;
import android.os.Parcelable;
import j.P;

/* loaded from: classes6.dex */
public final class StreamKey implements Comparable<StreamKey>, Parcelable {
    public static final Parcelable.Creator<StreamKey> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final int f345800b;

    /* renamed from: c, reason: collision with root package name */
    public final int f345801c;

    /* renamed from: d, reason: collision with root package name */
    public final int f345802d;

    public class a implements Parcelable.Creator<StreamKey> {
        @Override // android.os.Parcelable.Creator
        public final StreamKey createFromParcel(Parcel parcel) {
            return new StreamKey(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final StreamKey[] newArray(int i12) {
            return new StreamKey[i12];
        }
    }

    public StreamKey(Parcel parcel) {
        this.f345800b = parcel.readInt();
        this.f345801c = parcel.readInt();
        this.f345802d = parcel.readInt();
    }

    @Override // java.lang.Comparable
    public final int compareTo(StreamKey streamKey) {
        StreamKey streamKey2 = streamKey;
        int i12 = this.f345800b - streamKey2.f345800b;
        if (i12 != 0) {
            return i12;
        }
        int i13 = this.f345801c - streamKey2.f345801c;
        return i13 == 0 ? this.f345802d - streamKey2.f345802d : i13;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@P Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || StreamKey.class != obj.getClass()) {
            return false;
        }
        StreamKey streamKey = (StreamKey) obj;
        return this.f345800b == streamKey.f345800b && this.f345801c == streamKey.f345801c && this.f345802d == streamKey.f345802d;
    }

    public final int hashCode() {
        return (((this.f345800b * 31) + this.f345801c) * 31) + this.f345802d;
    }

    public final String toString() {
        return this.f345800b + "." + this.f345801c + "." + this.f345802d;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i12) {
        parcel.writeInt(this.f345800b);
        parcel.writeInt(this.f345801c);
        parcel.writeInt(this.f345802d);
    }
}
