package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class cwi extends l4 {
    public static final Parcelable.Creator<cwi> CREATOR = new wci(25);
    public Bundle a;
    public qt5[] b;
    public int c;
    public ls3 d;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iK = a9j.k(parcel, 20293);
        a9j.b(parcel, 1, this.a);
        a9j.i(parcel, 2, this.b, i);
        int i2 = this.c;
        a9j.m(parcel, 3, 4);
        parcel.writeInt(i2);
        a9j.f(parcel, 4, this.d, i);
        a9j.l(parcel, iK);
    }
}
