package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes2.dex */
public final class a68 implements w68 {
    public static final a68 a = new a68();
    public static final Parcelable.Creator<a68> CREATOR = new f18(3);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof a68);
    }

    public final int hashCode() {
        return -1344246616;
    }

    public final String toString() {
        return "ContentLevelError";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
