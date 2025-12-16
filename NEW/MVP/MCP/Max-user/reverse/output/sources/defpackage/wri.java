package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class wri extends l4 {
    public static final Parcelable.Creator<wri> CREATOR = new wci(23);
    public int a;
    public String[] b;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iK = a9j.k(parcel, 20293);
        int i2 = this.a;
        a9j.m(parcel, 2, 4);
        parcel.writeInt(i2);
        a9j.h(parcel, 3, this.b);
        a9j.l(parcel, iK);
    }
}
