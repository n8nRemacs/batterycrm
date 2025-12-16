package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class pnf extends l4 {
    public static final Parcelable.Creator<pnf> CREATOR = new wci(1);
    public final mnf a;
    public final double b;

    public pnf(mnf mnfVar, double d) {
        if (d <= 0.0d) {
            throw new IllegalArgumentException("A style must be applied to some segments on a polyline.");
        }
        this.a = mnfVar;
        this.b = d;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iK = a9j.k(parcel, 20293);
        a9j.f(parcel, 2, this.a, i);
        a9j.m(parcel, 3, 8);
        parcel.writeDouble(this.b);
        a9j.l(parcel, iK);
    }
}
