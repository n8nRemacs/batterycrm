package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes2.dex */
public final class y9 implements Parcelable {
    public static final Parcelable.Creator<y9> CREATOR = new e8(1);
    public final int a;
    public final int b;
    public final String c;

    public y9(int i, int i2, String str) {
        this.a = i;
        this.b = i2;
        this.c = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y9)) {
            return false;
        }
        y9 y9Var = (y9) obj;
        return this.a == y9Var.a && this.b == y9Var.b && fni.a(this.c, y9Var.c);
    }

    public final int hashCode() {
        int iK = xrf.k(this.b, Integer.hashCode(this.a) * 31, 31);
        String str = this.c;
        return iK + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return ho7.l(wy1.k("AddLinkState(start=", this.a, ", end=", this.b, ", link="), this.c, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a);
        parcel.writeInt(this.b);
        parcel.writeString(this.c);
    }
}
