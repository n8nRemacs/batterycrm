package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class nw6 extends l4 {
    public static final Parcelable.Creator<nw6> CREATOR = new obh(5);
    public final int a;
    public final int b;
    public final Bundle c;

    public nw6(int i, int i2, Bundle bundle) {
        this.a = i;
        this.b = i2;
        this.c = bundle;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iK = a9j.k(parcel, 20293);
        a9j.m(parcel, 1, 4);
        parcel.writeInt(this.a);
        a9j.m(parcel, 2, 4);
        parcel.writeInt(this.b);
        a9j.b(parcel, 3, this.c);
        a9j.l(parcel, iK);
    }
}
