package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import java.util.Arrays;

/* loaded from: classes.dex */
public class x42 extends l4 {
    public static final Parcelable.Creator<x42> CREATOR = new wci(14);
    public final int a;
    public final xo0 b;
    public final Float c;

    public x42(int i, xo0 xo0Var, Float f) {
        boolean z = f != null && f.floatValue() > 0.0f;
        if (i == 3) {
            z = xo0Var != null && z;
            i = 3;
        }
        s5j.a("Invalid Cap: type=" + i + " bitmapDescriptor=" + xo0Var + " bitmapRefWidth=" + f, z);
        this.a = i;
        this.b = xo0Var;
        this.c = f;
    }

    public final x42 b() {
        int i = this.a;
        if (i == 0) {
            return new uw0();
        }
        if (i == 1) {
            return new uw0(1, null, null, 2);
        }
        if (i == 2) {
            return new uw0(2, null, null, 1);
        }
        if (i != 3) {
            Log.w("x42", "Unknown Cap type: " + i);
            return this;
        }
        xo0 xo0Var = this.b;
        s5j.i("bitmapDescriptor must not be null", xo0Var != null);
        Float f = this.c;
        s5j.i("bitmapRefWidth must not be null", f != null);
        return new sb4(xo0Var, f.floatValue());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x42)) {
            return false;
        }
        x42 x42Var = (x42) obj;
        return this.a == x42Var.a && syi.c(this.b, x42Var.b) && syi.c(this.c, x42Var.c);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), this.b, this.c});
    }

    public String toString() {
        return ho7.j(new StringBuilder("[Cap: type="), this.a, "]");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iK = a9j.k(parcel, 20293);
        a9j.m(parcel, 2, 4);
        parcel.writeInt(this.a);
        xo0 xo0Var = this.b;
        a9j.e(parcel, 3, xo0Var == null ? null : xo0Var.a.asBinder());
        a9j.d(parcel, 4, this.c);
        a9j.l(parcel, iK);
    }
}
