package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes2.dex */
public final class n68 implements w68 {
    public static final n68 a = new n68();
    public static final Parcelable.Creator<n68> CREATOR = new f18(16);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof n68);
    }

    public final int hashCode() {
        return 1079494498;
    }

    public final String toString() {
        return "Progress";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
