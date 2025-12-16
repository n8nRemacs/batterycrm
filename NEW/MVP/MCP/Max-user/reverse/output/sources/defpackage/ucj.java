package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class ucj extends l4 {
    public static final Parcelable.Creator<ucj> CREATOR = new k3j(19);
    public final int a;
    public final String b;

    public ucj(int i, String str) {
        this.a = i;
        this.b = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iK = a9j.k(parcel, 20293);
        a9j.m(parcel, 1, 4);
        parcel.writeInt(this.a);
        a9j.g(parcel, 2, this.b);
        a9j.l(parcel, iK);
    }
}
