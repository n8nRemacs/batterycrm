package defpackage;

import android.graphics.Point;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class zcj extends l4 {
    public static final Parcelable.Creator<zcj> CREATOR = new k3j(11);
    public final int X;
    public final rcj Y;
    public final ucj Z;
    public final int a;
    public final String b;
    public final String c;
    public final byte[] d;
    public final Point[] o;
    public final vcj s0;
    public final ycj t0;
    public final wcj u0;
    public final scj v0;
    public final ocj w0;
    public final pcj x0;
    public final qcj y0;

    public zcj(int i, String str, String str2, byte[] bArr, Point[] pointArr, int i2, rcj rcjVar, ucj ucjVar, vcj vcjVar, ycj ycjVar, wcj wcjVar, scj scjVar, ocj ocjVar, pcj pcjVar, qcj qcjVar) {
        this.a = i;
        this.b = str;
        this.c = str2;
        this.d = bArr;
        this.o = pointArr;
        this.X = i2;
        this.Y = rcjVar;
        this.Z = ucjVar;
        this.s0 = vcjVar;
        this.t0 = ycjVar;
        this.u0 = wcjVar;
        this.v0 = scjVar;
        this.w0 = ocjVar;
        this.x0 = pcjVar;
        this.y0 = qcjVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iK = a9j.k(parcel, 20293);
        a9j.m(parcel, 1, 4);
        parcel.writeInt(this.a);
        a9j.g(parcel, 2, this.b);
        a9j.g(parcel, 3, this.c);
        a9j.c(parcel, 4, this.d);
        a9j.i(parcel, 5, this.o, i);
        a9j.m(parcel, 6, 4);
        parcel.writeInt(this.X);
        a9j.f(parcel, 7, this.Y, i);
        a9j.f(parcel, 8, this.Z, i);
        a9j.f(parcel, 9, this.s0, i);
        a9j.f(parcel, 10, this.t0, i);
        a9j.f(parcel, 11, this.u0, i);
        a9j.f(parcel, 12, this.v0, i);
        a9j.f(parcel, 13, this.w0, i);
        a9j.f(parcel, 14, this.x0, i);
        a9j.f(parcel, 15, this.y0, i);
        a9j.l(parcel, iK);
    }
}
