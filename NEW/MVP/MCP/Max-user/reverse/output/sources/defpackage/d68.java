package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes2.dex */
public final class d68 implements w68 {
    public static final d68 a = new d68();
    public static final Parcelable.Creator<d68> CREATOR = new f18(6);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof d68);
    }

    public final int hashCode() {
        return 1619798497;
    }

    public final String toString() {
        return "ErrorPostNotFounded";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
