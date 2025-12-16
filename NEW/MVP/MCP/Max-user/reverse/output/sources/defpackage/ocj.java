package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class ocj extends l4 {
    public static final Parcelable.Creator<ocj> CREATOR = new k3j(13);
    public final ncj X;
    public final ncj Y;
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String o;

    public ocj(String str, String str2, String str3, String str4, String str5, ncj ncjVar, ncj ncjVar2) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.o = str5;
        this.X = ncjVar;
        this.Y = ncjVar2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iK = a9j.k(parcel, 20293);
        a9j.g(parcel, 1, this.a);
        a9j.g(parcel, 2, this.b);
        a9j.g(parcel, 3, this.c);
        a9j.g(parcel, 4, this.d);
        a9j.g(parcel, 5, this.o);
        a9j.f(parcel, 6, this.X, i);
        a9j.f(parcel, 7, this.Y, i);
        a9j.l(parcel, iK);
    }
}
