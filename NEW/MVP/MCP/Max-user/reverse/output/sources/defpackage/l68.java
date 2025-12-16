package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes2.dex */
public final class l68 implements w68 {
    public static final l68 a = new l68();
    public static final Parcelable.Creator<l68> CREATOR = new f18(14);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof l68);
    }

    public final int hashCode() {
        return -1797309930;
    }

    public final String toString() {
        return "OpenExternalSharingToInvite";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
