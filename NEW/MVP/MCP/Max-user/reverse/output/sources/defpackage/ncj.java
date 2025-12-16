package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class ncj extends l4 {
    public static final Parcelable.Creator<ncj> CREATOR = new k3j(12);
    public final int X;
    public final boolean Y;
    public final String Z;
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final int o;

    public ncj(int i, int i2, int i3, int i4, int i5, int i6, boolean z, String str) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.o = i5;
        this.X = i6;
        this.Y = z;
        this.Z = str;
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
        a9j.m(parcel, 4, 4);
        parcel.writeInt(this.d);
        a9j.m(parcel, 5, 4);
        parcel.writeInt(this.o);
        a9j.m(parcel, 6, 4);
        parcel.writeInt(this.X);
        a9j.m(parcel, 7, 4);
        parcel.writeInt(this.Y ? 1 : 0);
        a9j.g(parcel, 8, this.Z);
        a9j.l(parcel, iK);
    }
}
