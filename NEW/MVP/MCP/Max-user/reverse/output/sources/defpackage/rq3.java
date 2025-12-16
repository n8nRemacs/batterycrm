package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes2.dex */
public final class rq3 implements Parcelable {
    public static final Parcelable.Creator<rq3> CREATOR = new e8(25);
    public final int a;
    public final int b;
    public final int c;

    public rq3(int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rq3)) {
            return false;
        }
        rq3 rq3Var = (rq3) obj;
        return this.a == rq3Var.a && this.b == rq3Var.b && this.c == rq3Var.c;
    }

    public final int hashCode() {
        return az1.v(this.c) + utb.k(this.b, Integer.hashCode(this.a) * 31, 31);
    }

    public final String toString() {
        StringBuilder sbM = ho7.m(this.a, "Icon(iconRes=", ", size=");
        int i = this.b;
        sbM.append(i != 1 ? i != 2 ? "null" : "LARGE" : "SMALL");
        sbM.append(", appearance=");
        int i2 = this.c;
        sbM.append(i2 != 1 ? i2 != 2 ? "null" : "SECONDARY" : "PRIMARY");
        sbM.append(")");
        return sbM.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str;
        String str2;
        parcel.writeInt(this.a);
        int i2 = this.b;
        if (i2 == 1) {
            str = "SMALL";
        } else {
            if (i2 != 2) {
                throw null;
            }
            str = "LARGE";
        }
        parcel.writeString(str);
        int i3 = this.c;
        if (i3 == 1) {
            str2 = "PRIMARY";
        } else {
            if (i3 != 2) {
                throw null;
            }
            str2 = "SECONDARY";
        }
        parcel.writeString(str2);
    }
}
