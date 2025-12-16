package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes2.dex */
public final class c68 implements w68 {
    public static final c68 a = new c68();
    public static final Parcelable.Creator<c68> CREATOR = new f18(5);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof c68);
    }

    public final int hashCode() {
        return 796463810;
    }

    public final String toString() {
        return "ErrorBrokenLink";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
