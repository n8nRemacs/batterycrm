package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class b2a extends l4 {
    public static final Parcelable.Creator<b2a> CREATOR = new obh(12);
    public final int a;
    public final boolean b;

    public b2a(int i, boolean z) {
        this.a = i;
        this.b = z;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iK = a9j.k(parcel, 20293);
        a9j.m(parcel, 1, 4);
        parcel.writeInt(this.a);
        a9j.m(parcel, 2, 4);
        parcel.writeInt(this.b ? 1 : 0);
        a9j.l(parcel, iK);
    }
}
