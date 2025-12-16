package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class tcj extends l4 {
    public static final Parcelable.Creator<tcj> CREATOR = new k3j(18);
    public final String X;
    public final String Y;
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String o;

    public tcj(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.o = str5;
        this.X = str6;
        this.Y = str7;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iK = a9j.k(parcel, 20293);
        a9j.g(parcel, 1, this.a);
        a9j.g(parcel, 2, this.b);
        a9j.g(parcel, 3, this.c);
        a9j.g(parcel, 4, this.d);
        a9j.g(parcel, 5, this.o);
        a9j.g(parcel, 6, this.X);
        a9j.g(parcel, 7, this.Y);
        a9j.l(parcel, iK);
    }
}
