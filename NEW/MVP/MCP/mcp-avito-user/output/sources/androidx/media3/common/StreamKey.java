package androidx.media3.common;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

@androidx.media3.common.util.J
/* loaded from: classes.dex */
public final class StreamKey implements Comparable<StreamKey>, Parcelable, InterfaceC23096j {
    public static final Parcelable.Creator<StreamKey> CREATOR = new a();

    /* renamed from: e, reason: collision with root package name */
    public static final String f47445e;

    /* renamed from: f, reason: collision with root package name */
    public static final String f47446f;

    /* renamed from: g, reason: collision with root package name */
    public static final String f47447g;

    /* renamed from: b, reason: collision with root package name */
    public final int f47448b;

    /* renamed from: c, reason: collision with root package name */
    public final int f47449c;

    /* renamed from: d, reason: collision with root package name */
    public final int f47450d;

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

    static {
        int i12 = androidx.media3.common.util.M.f47887a;
        f47445e = Integer.toString(0, 36);
        f47446f = Integer.toString(1, 36);
        f47447g = Integer.toString(2, 36);
    }

    public StreamKey(int i12, int i13, int i14) {
        this.f47448b = i12;
        this.f47449c = i13;
        this.f47450d = i14;
    }

    @Override // java.lang.Comparable
    public final int compareTo(StreamKey streamKey) {
        StreamKey streamKey2 = streamKey;
        int i12 = this.f47448b - streamKey2.f47448b;
        if (i12 != 0) {
            return i12;
        }
        int i13 = this.f47449c - streamKey2.f47449c;
        return i13 == 0 ? this.f47450d - streamKey2.f47450d : i13;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@j.P Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || StreamKey.class != obj.getClass()) {
            return false;
        }
        StreamKey streamKey = (StreamKey) obj;
        return this.f47448b == streamKey.f47448b && this.f47449c == streamKey.f47449c && this.f47450d == streamKey.f47450d;
    }

    public final int hashCode() {
        return (((this.f47448b * 31) + this.f47449c) * 31) + this.f47450d;
    }

    @Override // androidx.media3.common.InterfaceC23096j
    public final Bundle k() {
        Bundle bundle = new Bundle();
        int i12 = this.f47448b;
        if (i12 != 0) {
            bundle.putInt(f47445e, i12);
        }
        int i13 = this.f47449c;
        if (i13 != 0) {
            bundle.putInt(f47446f, i13);
        }
        int i14 = this.f47450d;
        if (i14 != 0) {
            bundle.putInt(f47447g, i14);
        }
        return bundle;
    }

    public final String toString() {
        return this.f47448b + "." + this.f47449c + "." + this.f47450d;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i12) {
        parcel.writeInt(this.f47448b);
        parcel.writeInt(this.f47449c);
        parcel.writeInt(this.f47450d);
    }

    public StreamKey(Parcel parcel) {
        this.f47448b = parcel.readInt();
        this.f47449c = parcel.readInt();
        this.f47450d = parcel.readInt();
    }
}
