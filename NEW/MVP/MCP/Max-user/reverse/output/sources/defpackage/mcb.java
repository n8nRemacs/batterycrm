package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes2.dex */
public final class mcb extends ocb {
    public static final mcb b = new mcb(3500);
    public static final Parcelable.Creator<mcb> CREATOR = new pq8(22);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof mcb);
    }

    public final int hashCode() {
        return -383399562;
    }

    public final String toString() {
        return "Standard";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
