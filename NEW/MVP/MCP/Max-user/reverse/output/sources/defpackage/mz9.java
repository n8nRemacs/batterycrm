package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class mz9 extends l4 {
    public static final Parcelable.Creator<mz9> CREATOR = new obh(17);
    public final String X;
    public final String Y;
    public final int Z;
    public final int a;
    public final int b;
    public final int c;
    public final long d;
    public final long o;
    public final int s0;

    public mz9(int i, int i2, int i3, long j, long j2, String str, String str2, int i4, int i5) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = j;
        this.o = j2;
        this.X = str;
        this.Y = str2;
        this.Z = i4;
        this.s0 = i5;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iK = a9j.k(parcel, 20293);
        a9j.m(parcel, 1, 4);
        parcel.writeInt(this.a);
        a9j.m(parcel, 2, 4);
        parcel.writeInt(this.b);
        a9j.m(parcel, 3, 4);
        parcel.writeInt(this.c);
        a9j.m(parcel, 4, 8);
        parcel.writeLong(this.d);
        a9j.m(parcel, 5, 8);
        parcel.writeLong(this.o);
        a9j.g(parcel, 6, this.X);
        a9j.g(parcel, 7, this.Y);
        a9j.m(parcel, 8, 4);
        parcel.writeInt(this.Z);
        a9j.m(parcel, 9, 4);
        parcel.writeInt(this.s0);
        a9j.l(parcel, iK);
    }
}
