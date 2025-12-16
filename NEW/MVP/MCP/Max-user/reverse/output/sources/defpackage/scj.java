package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class scj extends l4 {
    public static final Parcelable.Creator<scj> CREATOR = new k3j(17);
    public final double a;
    public final double b;

    public scj(double d, double d2) {
        this.a = d;
        this.b = d2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iK = a9j.k(parcel, 20293);
        a9j.m(parcel, 1, 8);
        parcel.writeDouble(this.a);
        a9j.m(parcel, 2, 8);
        parcel.writeDouble(this.b);
        a9j.l(parcel, iK);
    }
}
