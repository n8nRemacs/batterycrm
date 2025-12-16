package defpackage;

import android.os.Parcel;

/* loaded from: classes2.dex */
public final class n5g extends s5g {
    public static final m5g CREATOR = new m5g();
    public final int c;

    public n5g(int i) {
        this.c = i;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof n5g) && this.c == ((n5g) obj).c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c);
    }

    public final String toString() {
        return wy1.e(this.c, "Resource(resId=", ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.c);
    }
}
