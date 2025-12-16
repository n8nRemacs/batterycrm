package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes2.dex */
public final class pq3 implements Parcelable {
    public static final Parcelable.Creator<pq3> CREATOR = new e8(24);
    public final int X;
    public final int a;
    public final s5g b;
    public final int c;
    public final boolean d;
    public final int o;

    public /* synthetic */ pq3(int i, s5g s5gVar, int i2, int i3) {
        this(i, s5gVar, i2, (i3 & 8) == 0, (i3 & 16) != 0 ? 2 : 3, 0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pq3)) {
            return false;
        }
        pq3 pq3Var = (pq3) obj;
        return this.a == pq3Var.a && fni.a(this.b, pq3Var.b) && this.c == pq3Var.c && this.d == pq3Var.d && this.o == pq3Var.o && this.X == pq3Var.X;
    }

    public final int hashCode() {
        int iK = utb.k(this.o, a9h.b(utb.k(this.c, xc0.d(Integer.hashCode(this.a) * 31, 31, this.b), 31), 31, this.d), 31);
        int i = this.X;
        return iK + (i == 0 ? 0 : az1.v(i));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Button(id=");
        sb.append(this.a);
        sb.append(", caption=");
        sb.append(this.b);
        sb.append(", type=");
        int i = this.c;
        sb.append(i != 1 ? i != 2 ? i != 3 ? i != 4 ? "null" : "THEMED" : "PRIMARY" : "NEUTRAL" : "NEGATIVE");
        sb.append(", filledButton=");
        sb.append(this.d);
        sb.append(", size=");
        int i2 = this.o;
        sb.append(i2 != 1 ? i2 != 2 ? i2 != 3 ? "null" : "LARGE" : "MEDIUM" : "SMALL");
        sb.append(", appearance=");
        int i3 = this.X;
        sb.append(i3 != 1 ? i3 != 2 ? i3 != 3 ? "null" : "NEUTRAL_THEMED" : "NEUTRAL" : "NEGATIVE");
        sb.append(")");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str;
        String str2;
        String str3;
        parcel.writeInt(this.a);
        parcel.writeParcelable(this.b, i);
        int i2 = this.c;
        if (i2 == 1) {
            str = "NEGATIVE";
        } else if (i2 == 2) {
            str = "NEUTRAL";
        } else if (i2 == 3) {
            str = "PRIMARY";
        } else {
            if (i2 != 4) {
                throw null;
            }
            str = "THEMED";
        }
        parcel.writeString(str);
        parcel.writeInt(this.d ? 1 : 0);
        int i3 = this.o;
        if (i3 == 1) {
            str2 = "SMALL";
        } else if (i3 == 2) {
            str2 = "MEDIUM";
        } else {
            if (i3 != 3) {
                throw null;
            }
            str2 = "LARGE";
        }
        parcel.writeString(str2);
        int i4 = this.X;
        if (i4 == 0) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        if (i4 == 1) {
            str3 = "NEGATIVE";
        } else if (i4 == 2) {
            str3 = "NEUTRAL";
        } else {
            if (i4 != 3) {
                throw null;
            }
            str3 = "NEUTRAL_THEMED";
        }
        parcel.writeString(str3);
    }

    public pq3(int i, s5g s5gVar, int i2, boolean z, int i3, int i4) {
        this.a = i;
        this.b = s5gVar;
        this.c = i2;
        this.d = z;
        this.o = i3;
        this.X = i4;
    }
}
