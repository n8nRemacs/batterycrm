package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes2.dex */
public final class e68 implements w68 {
    public static final e68 a = new e68();
    public static final Parcelable.Creator<e68> CREATOR = new f18(7);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof e68);
    }

    public final int hashCode() {
        return 1304939987;
    }

    public final String toString() {
        return "ErrorPrivateChannel";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
