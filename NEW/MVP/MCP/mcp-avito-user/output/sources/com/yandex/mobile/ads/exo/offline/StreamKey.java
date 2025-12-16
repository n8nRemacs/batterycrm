package com.yandex.mobile.ads.exo.offline;

import android.os.Parcel;
import android.os.Parcelable;
import j.P;

/* loaded from: classes8.dex */
public final class StreamKey implements Comparable<StreamKey>, Parcelable {
    public static final Parcelable.Creator<StreamKey> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    public final int f383084a;

    /* renamed from: b, reason: collision with root package name */
    public final int f383085b;

    /* renamed from: c, reason: collision with root package name */
    public final int f383086c;

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

    public StreamKey(int i12, int i13, int i14) {
        this.f383084a = i12;
        this.f383085b = i13;
        this.f383086c = i14;
    }

    @Override // java.lang.Comparable
    public final int compareTo(StreamKey streamKey) {
        StreamKey streamKey2 = streamKey;
        int i12 = this.f383084a - streamKey2.f383084a;
        if (i12 != 0) {
            return i12;
        }
        int i13 = this.f383085b - streamKey2.f383085b;
        return i13 == 0 ? this.f383086c - streamKey2.f383086c : i13;
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
        return this.f383084a == streamKey.f383084a && this.f383085b == streamKey.f383085b && this.f383086c == streamKey.f383086c;
    }

    public final int hashCode() {
        return (((this.f383084a * 31) + this.f383085b) * 31) + this.f383086c;
    }

    public final String toString() {
        return this.f383084a + "." + this.f383085b + "." + this.f383086c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i12) {
        parcel.writeInt(this.f383084a);
        parcel.writeInt(this.f383085b);
        parcel.writeInt(this.f383086c);
    }

    public StreamKey(Parcel parcel) {
        this.f383084a = parcel.readInt();
        this.f383085b = parcel.readInt();
        this.f383086c = parcel.readInt();
    }
}
