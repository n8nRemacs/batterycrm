package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class rcj extends l4 {
    public static final Parcelable.Creator<rcj> CREATOR = new k3j(16);
    public final int a;
    public final String b;
    public final String c;
    public final String d;

    public rcj(String str, int i, String str2, String str3) {
        this.a = i;
        this.b = str;
        this.c = str2;
        this.d = str3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iK = a9j.k(parcel, 20293);
        a9j.m(parcel, 1, 4);
        parcel.writeInt(this.a);
        a9j.g(parcel, 2, this.b);
        a9j.g(parcel, 3, this.c);
        a9j.g(parcel, 4, this.d);
        a9j.l(parcel, iK);
    }
}
