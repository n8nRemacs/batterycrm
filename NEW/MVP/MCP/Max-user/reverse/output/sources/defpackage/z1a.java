package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class z1a extends l4 {
    public static final Parcelable.Creator<z1a> CREATOR = new obh(6);
    public final boolean a;
    public final int b;

    public z1a(boolean z, int i) {
        this.a = z;
        this.b = i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iK = a9j.k(parcel, 20293);
        a9j.m(parcel, 1, 4);
        parcel.writeInt(this.a ? 1 : 0);
        a9j.m(parcel, 2, 4);
        parcel.writeInt(this.b);
        a9j.l(parcel, iK);
    }
}
