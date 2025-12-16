package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class qcj extends l4 {
    public static final Parcelable.Creator<qcj> CREATOR = new k3j(15);
    public final String X;
    public final String Y;
    public final String Z;
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String o;
    public final String s0;
    public final String t0;
    public final String u0;
    public final String v0;
    public final String w0;
    public final String x0;

    public qcj(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.o = str5;
        this.X = str6;
        this.Y = str7;
        this.Z = str8;
        this.s0 = str9;
        this.t0 = str10;
        this.u0 = str11;
        this.v0 = str12;
        this.w0 = str13;
        this.x0 = str14;
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
        a9j.g(parcel, 8, this.Z);
        a9j.g(parcel, 9, this.s0);
        a9j.g(parcel, 10, this.t0);
        a9j.g(parcel, 11, this.u0);
        a9j.g(parcel, 12, this.v0);
        a9j.g(parcel, 13, this.w0);
        a9j.g(parcel, 14, this.x0);
        a9j.l(parcel, iK);
    }
}
