package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class vdi extends l4 {
    public static final Parcelable.Creator<vdi> CREATOR = new wci(13);
    public int a;
    public final int b;
    public final int c;
    public final long d;
    public final int o;

    public vdi(int i, int i2, int i3, long j, int i4) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = j;
        this.o = i4;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iK = a9j.k(parcel, 20293);
        int i2 = this.a;
        a9j.m(parcel, 2, 4);
        parcel.writeInt(i2);
        a9j.m(parcel, 3, 4);
        parcel.writeInt(this.b);
        a9j.m(parcel, 4, 4);
        parcel.writeInt(this.c);
        a9j.m(parcel, 5, 8);
        parcel.writeLong(this.d);
        a9j.m(parcel, 6, 4);
        parcel.writeInt(this.o);
        a9j.l(parcel, iK);
    }
}
