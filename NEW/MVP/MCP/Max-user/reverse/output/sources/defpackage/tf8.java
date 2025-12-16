package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class tf8 extends l4 {
    public static final Parcelable.Creator<tf8> CREATOR = new wci(9);
    public final boolean X;
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean o;

    public tf8(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
        this.o = z5;
        this.X = z6;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iK = a9j.k(parcel, 20293);
        a9j.m(parcel, 1, 4);
        parcel.writeInt(this.a ? 1 : 0);
        a9j.m(parcel, 2, 4);
        parcel.writeInt(this.b ? 1 : 0);
        a9j.m(parcel, 3, 4);
        parcel.writeInt(this.c ? 1 : 0);
        a9j.m(parcel, 4, 4);
        parcel.writeInt(this.d ? 1 : 0);
        a9j.m(parcel, 5, 4);
        parcel.writeInt(this.o ? 1 : 0);
        a9j.m(parcel, 6, 4);
        parcel.writeInt(this.X ? 1 : 0);
        a9j.l(parcel, iK);
    }
}
