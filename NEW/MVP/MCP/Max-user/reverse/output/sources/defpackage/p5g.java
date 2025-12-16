package defpackage;

import android.os.Parcel;
import java.util.List;

/* loaded from: classes2.dex */
public final class p5g extends s5g {
    public static final o5g CREATOR = new o5g();
    public final int c;
    public final List d;

    public p5g(int i, List list) {
        this.c = i;
        this.d = list;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p5g)) {
            return false;
        }
        p5g p5gVar = (p5g) obj;
        return this.c == p5gVar.c && fni.a(this.d, p5gVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + (Integer.hashCode(this.c) * 31);
    }

    public final String toString() {
        return "ResourceParams(resId=" + this.c + ", args=" + this.d + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.c);
        parcel.writeList(this.d);
    }
}
