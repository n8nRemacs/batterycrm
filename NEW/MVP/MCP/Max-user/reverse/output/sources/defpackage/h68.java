package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes2.dex */
public final class h68 implements w68 {
    public static final h68 a = new h68();
    public static final Parcelable.Creator<h68> CREATOR = new f18(10);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof h68);
    }

    public final int hashCode() {
        return 743554978;
    }

    public final String toString() {
        return "OpenApp";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
