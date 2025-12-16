package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class vsd extends l4 {
    public static final Parcelable.Creator<vsd> CREATOR = new wci(11);
    public final int a;
    public final boolean b;
    public final boolean c;
    public final int d;
    public final int o;

    public vsd(int i, int i2, int i3, boolean z, boolean z2) {
        this.a = i;
        this.b = z;
        this.c = z2;
        this.d = i2;
        this.o = i3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iK = a9j.k(parcel, 20293);
        a9j.m(parcel, 1, 4);
        parcel.writeInt(this.a);
        a9j.m(parcel, 2, 4);
        parcel.writeInt(this.b ? 1 : 0);
        a9j.m(parcel, 3, 4);
        parcel.writeInt(this.c ? 1 : 0);
        a9j.m(parcel, 4, 4);
        parcel.writeInt(this.d);
        a9j.m(parcel, 5, 4);
        parcel.writeInt(this.o);
        a9j.l(parcel, iK);
    }
}
