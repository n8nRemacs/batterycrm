package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class mcj extends l4 {
    public static final Parcelable.Creator<mcj> CREATOR = new k3j(9);
    public final int a;
    public final String[] b;

    public mcj(int i, String[] strArr) {
        this.a = i;
        this.b = strArr;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iK = a9j.k(parcel, 20293);
        a9j.m(parcel, 1, 4);
        parcel.writeInt(this.a);
        a9j.h(parcel, 2, this.b);
        a9j.l(parcel, iK);
    }
}
