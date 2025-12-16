package defpackage;

import android.os.Parcel;
import java.util.List;

/* loaded from: classes2.dex */
public final class l5g extends s5g {
    public static final k5g CREATOR = new k5g();
    public final int c;
    public final int d;
    public final List o;

    public l5g(List list, int i, int i2) {
        this.c = i;
        this.d = i2;
        this.o = list;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l5g)) {
            return false;
        }
        l5g l5gVar = (l5g) obj;
        return this.c == l5gVar.c && this.d == l5gVar.d && fni.a(this.o, l5gVar.o);
    }

    public final int hashCode() {
        return this.o.hashCode() + xrf.k(this.d, Integer.hashCode(this.c) * 31, 31);
    }

    public final String toString() {
        return az1.j(wy1.k("PluralsParams(resId=", this.c, ", quantity=", this.d, ", args="), this.o, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.c);
        parcel.writeInt(this.d);
        parcel.writeList(this.o);
    }
}
