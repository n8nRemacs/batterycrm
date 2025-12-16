package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes2.dex */
public final class g68 implements w68 {
    public static final g68 a = new g68();
    public static final Parcelable.Creator<g68> CREATOR = new f18(9);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof g68);
    }

    public final int hashCode() {
        return 1103229132;
    }

    public final String toString() {
        return "ItsYou";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
