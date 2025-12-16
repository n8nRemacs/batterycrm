package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class i3j extends l4 {
    public static final Parcelable.Creator<i3j> CREATOR = new obh(25);
    public double a;
    public double b;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iK = a9j.k(parcel, 20293);
        double d = this.a;
        a9j.m(parcel, 2, 8);
        parcel.writeDouble(d);
        double d2 = this.b;
        a9j.m(parcel, 3, 8);
        parcel.writeDouble(d2);
        a9j.l(parcel, iK);
    }
}
