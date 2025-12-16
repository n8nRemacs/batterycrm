package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes2.dex */
public final class zme implements Parcelable {
    public static final Parcelable.Creator<zme> CREATOR = new z6e(2);
    public final int a;
    public final s5g b;
    public final int c;

    public zme(int i, int i2, s5g s5gVar) {
        this.a = i;
        this.b = s5gVar;
        this.c = i2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zme)) {
            return false;
        }
        zme zmeVar = (zme) obj;
        return this.a == zmeVar.a && fni.a(this.b, zmeVar.b) && this.c == zmeVar.c;
    }

    public final int hashCode() {
        return az1.v(this.c) + xc0.d(Integer.hashCode(this.a) * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Button(id=");
        sb.append(this.a);
        sb.append(", caption=");
        sb.append(this.b);
        sb.append(", type=");
        int i = this.c;
        sb.append(i != 1 ? i != 2 ? "null" : "NEUTRAL" : "LINK");
        sb.append(")");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str;
        parcel.writeInt(this.a);
        parcel.writeParcelable(this.b, i);
        int i2 = this.c;
        if (i2 == 1) {
            str = "LINK";
        } else {
            if (i2 != 2) {
                throw null;
            }
            str = "NEUTRAL";
        }
        parcel.writeString(str);
    }
}
