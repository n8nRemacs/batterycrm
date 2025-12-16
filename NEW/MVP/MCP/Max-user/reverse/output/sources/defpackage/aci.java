package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class aci extends l4 {
    public static final Parcelable.Creator<aci> CREATOR = new obh(16);
    public final int a;
    public final es3 b;
    public final gci c;

    public aci(int i, es3 es3Var, gci gciVar) {
        this.a = i;
        this.b = es3Var;
        this.c = gciVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iK = a9j.k(parcel, 20293);
        a9j.m(parcel, 1, 4);
        parcel.writeInt(this.a);
        a9j.f(parcel, 2, this.b, i);
        a9j.f(parcel, 3, this.c, i);
        a9j.l(parcel, iK);
    }
}
