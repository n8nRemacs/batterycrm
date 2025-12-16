package defpackage;

import android.os.Parcel;

/* loaded from: classes2.dex */
public final class j5g extends s5g {
    public static final i5g CREATOR = new i5g();
    public final int c;
    public final int d;

    public j5g(int i, int i2) {
        this.c = i;
        this.d = i2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j5g)) {
            return false;
        }
        j5g j5gVar = (j5g) obj;
        return this.c == j5gVar.c && this.d == j5gVar.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + (Integer.hashCode(this.c) * 31);
    }

    public final String toString() {
        return wy1.g("Plurals(resId=", this.c, ", quantity=", this.d, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.c);
        parcel.writeInt(this.d);
    }
}
