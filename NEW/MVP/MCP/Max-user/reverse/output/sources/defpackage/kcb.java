package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes2.dex */
public final class kcb implements Parcelable {
    public static final Parcelable.Creator<kcb> CREATOR = new pq8(19);
    public final int a;
    public final int b;
    public final int c;

    public kcb(int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
    }

    public static kcb a(kcb kcbVar, int i, int i2, int i3, int i4) {
        if ((i4 & 1) != 0) {
            i = kcbVar.a;
        }
        if ((i4 & 2) != 0) {
            i2 = kcbVar.b;
        }
        if ((i4 & 4) != 0) {
            i3 = kcbVar.c;
        }
        kcbVar.getClass();
        return new kcb(i, i2, i3);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kcb)) {
            return false;
        }
        kcb kcbVar = (kcb) obj;
        return this.a == kcbVar.a && this.b == kcbVar.b && this.c == kcbVar.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + xrf.k(this.b, Integer.hashCode(this.a) * 31, 31);
    }

    public final String toString() {
        return ho7.j(utb.m(this.b, "ContainerParams(gravity=", wy1.e(this.a, "ContainerGravity(value=", ")"), ", topMargin=", ", bottomMargin="), this.c, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a);
        parcel.writeInt(this.b);
        parcel.writeInt(this.c);
    }

    public /* synthetic */ kcb(int i, int i2, int i3, int i4) {
        this((i4 & 1) != 0 ? 2 : i, (i4 & 2) != 0 ? 0 : i2, (i4 & 4) != 0 ? 0 : i3);
    }
}
