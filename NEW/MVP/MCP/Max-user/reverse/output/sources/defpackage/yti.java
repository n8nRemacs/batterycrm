package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class yti extends l4 {
    public static final Parcelable.Creator<yti> CREATOR = new k3j(5);
    public int X;
    public boolean Y;
    public String Z;
    public int a;
    public int b;
    public int c;
    public int d;
    public int o;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iK = a9j.k(parcel, 20293);
        int i2 = this.a;
        a9j.m(parcel, 2, 4);
        parcel.writeInt(i2);
        int i3 = this.b;
        a9j.m(parcel, 3, 4);
        parcel.writeInt(i3);
        int i4 = this.c;
        a9j.m(parcel, 4, 4);
        parcel.writeInt(i4);
        int i5 = this.d;
        a9j.m(parcel, 5, 4);
        parcel.writeInt(i5);
        int i6 = this.o;
        a9j.m(parcel, 6, 4);
        parcel.writeInt(i6);
        int i7 = this.X;
        a9j.m(parcel, 7, 4);
        parcel.writeInt(i7);
        boolean z = this.Y;
        a9j.m(parcel, 8, 4);
        parcel.writeInt(z ? 1 : 0);
        a9j.g(parcel, 9, this.Z);
        a9j.l(parcel, iK);
    }
}
