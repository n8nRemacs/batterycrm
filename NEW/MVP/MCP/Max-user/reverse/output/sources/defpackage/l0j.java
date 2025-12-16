package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class l0j extends l4 {
    public static final Parcelable.Creator<l0j> CREATOR = new k3j(23);
    public String X;
    public String Y;
    public String Z;
    public String a;
    public String b;
    public String c;
    public String d;
    public String o;
    public String s0;
    public String t0;
    public String u0;
    public String v0;
    public String w0;
    public String x0;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iK = a9j.k(parcel, 20293);
        a9j.g(parcel, 2, this.a);
        a9j.g(parcel, 3, this.b);
        a9j.g(parcel, 4, this.c);
        a9j.g(parcel, 5, this.d);
        a9j.g(parcel, 6, this.o);
        a9j.g(parcel, 7, this.X);
        a9j.g(parcel, 8, this.Y);
        a9j.g(parcel, 9, this.Z);
        a9j.g(parcel, 10, this.s0);
        a9j.g(parcel, 11, this.t0);
        a9j.g(parcel, 12, this.u0);
        a9j.g(parcel, 13, this.v0);
        a9j.g(parcel, 14, this.w0);
        a9j.g(parcel, 15, this.x0);
        a9j.l(parcel, iK);
    }
}
