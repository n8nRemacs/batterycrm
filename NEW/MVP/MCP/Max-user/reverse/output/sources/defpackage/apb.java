package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class apb extends l4 {
    public static final Parcelable.Creator<apb> CREATOR = new k3j(2);
    public final int a;
    public final Float b;

    public apb(int i, Float f) {
        boolean z = true;
        if (i != 1 && (f == null || f.floatValue() < 0.0f)) {
            z = false;
        }
        s5j.a("Invalid PatternItem: type=" + i + " length=" + f, z);
        this.a = i;
        this.b = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof apb)) {
            return false;
        }
        apb apbVar = (apb) obj;
        return this.a == apbVar.a && syi.c(this.b, apbVar.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), this.b});
    }

    public final String toString() {
        return "[PatternItem: type=" + this.a + " length=" + this.b + "]";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iK = a9j.k(parcel, 20293);
        a9j.m(parcel, 2, 4);
        parcel.writeInt(this.a);
        a9j.d(parcel, 3, this.b);
        a9j.l(parcel, iK);
    }
}
