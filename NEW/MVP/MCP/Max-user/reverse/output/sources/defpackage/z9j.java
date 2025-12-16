package defpackage;

import android.graphics.Point;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class z9j extends l4 {
    public static final Parcelable.Creator<z9j> CREATOR = new k3j(4);
    public double A0;
    public e2j X;
    public o5j Y;
    public o6j Z;
    public int a;
    public String b;
    public String c;
    public int d;
    public Point[] o;
    public w8j s0;
    public q7j t0;
    public i3j u0;
    public ewi v0;
    public iyi w0;
    public l0j x0;
    public byte[] y0;
    public boolean z0;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iK = a9j.k(parcel, 20293);
        int i2 = this.a;
        a9j.m(parcel, 2, 4);
        parcel.writeInt(i2);
        a9j.g(parcel, 3, this.b);
        a9j.g(parcel, 4, this.c);
        int i3 = this.d;
        a9j.m(parcel, 5, 4);
        parcel.writeInt(i3);
        a9j.i(parcel, 6, this.o, i);
        a9j.f(parcel, 7, this.X, i);
        a9j.f(parcel, 8, this.Y, i);
        a9j.f(parcel, 9, this.Z, i);
        a9j.f(parcel, 10, this.s0, i);
        a9j.f(parcel, 11, this.t0, i);
        a9j.f(parcel, 12, this.u0, i);
        a9j.f(parcel, 13, this.v0, i);
        a9j.f(parcel, 14, this.w0, i);
        a9j.f(parcel, 15, this.x0, i);
        a9j.c(parcel, 16, this.y0);
        boolean z = this.z0;
        a9j.m(parcel, 17, 4);
        parcel.writeInt(z ? 1 : 0);
        double d = this.A0;
        a9j.m(parcel, 18, 8);
        parcel.writeDouble(d);
        a9j.l(parcel, iK);
    }
}
