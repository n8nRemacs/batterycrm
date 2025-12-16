package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes2.dex */
public final class r68 implements w68 {
    public static final r68 a = new r68();
    public static final Parcelable.Creator<r68> CREATOR = new f18(20);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof r68);
    }

    public final int hashCode() {
        return 1867749234;
    }

    public final String toString() {
        return "ShowContactRemoved";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
