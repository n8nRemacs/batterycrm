package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes2.dex */
public final class xf4 implements Parcelable {
    public static final Parcelable.Creator<xf4> CREATOR = new wf4(0);
    public final long a;
    public final int b;
    public final int c;
    public final int d;
    public final String o;

    public xf4(int i, int i2, int i3, long j, String str) {
        this.a = j;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.o = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xf4)) {
            return false;
        }
        xf4 xf4Var = (xf4) obj;
        return this.a == xf4Var.a && this.b == xf4Var.b && this.c == xf4Var.c && this.d == xf4Var.d && fni.a(this.o, xf4Var.o);
    }

    public final int hashCode() {
        return this.o.hashCode() + xrf.k(this.d, xrf.k(this.c, xrf.k(this.b, Long.hashCode(this.a) * 31, 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Day(id=");
        sb.append(this.a);
        sb.append(", day=");
        sb.append(this.b);
        sb.append(", month=");
        sb.append(this.c);
        sb.append(", year=");
        sb.append(this.d);
        return ctd.j(sb, ", string=", this.o, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.a);
        parcel.writeInt(this.b);
        parcel.writeInt(this.c);
        parcel.writeInt(this.d);
        parcel.writeString(this.o);
    }
}
