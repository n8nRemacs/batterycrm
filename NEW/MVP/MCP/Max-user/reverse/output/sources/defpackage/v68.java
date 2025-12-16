package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes2.dex */
public final class v68 implements w68 {
    public static final v68 a = new v68();
    public static final Parcelable.Creator<v68> CREATOR = new f18(23);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof v68);
    }

    public final int hashCode() {
        return -939562363;
    }

    public final String toString() {
        return "UnknownFolderError";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
