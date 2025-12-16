package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class ycj extends l4 {
    public static final Parcelable.Creator<ycj> CREATOR = new k3j(22);
    public final String a;
    public final String b;
    public final int c;

    public ycj(String str, String str2, int i) {
        this.a = str;
        this.b = str2;
        this.c = i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iK = a9j.k(parcel, 20293);
        a9j.g(parcel, 1, this.a);
        a9j.g(parcel, 2, this.b);
        a9j.m(parcel, 3, 4);
        parcel.writeInt(this.c);
        a9j.l(parcel, iK);
    }
}
