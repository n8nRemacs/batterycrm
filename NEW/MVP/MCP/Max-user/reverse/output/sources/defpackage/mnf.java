package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class mnf extends l4 {
    public static final Parcelable.Creator<mnf> CREATOR = new obh(29);
    public final float a;
    public final int b;
    public final int c;
    public final boolean d;
    public final v9f o;

    public mnf(float f, int i, int i2, boolean z, v9f v9fVar) {
        this.a = f;
        this.b = i;
        this.c = i2;
        this.d = z;
        this.o = v9fVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iK = a9j.k(parcel, 20293);
        a9j.m(parcel, 2, 4);
        parcel.writeFloat(this.a);
        a9j.m(parcel, 3, 4);
        parcel.writeInt(this.b);
        a9j.m(parcel, 4, 4);
        parcel.writeInt(this.c);
        a9j.m(parcel, 5, 4);
        parcel.writeInt(this.d ? 1 : 0);
        a9j.f(parcel, 6, this.o, i);
        a9j.l(parcel, iK);
    }
}
