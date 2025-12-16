package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class pcj extends l4 {
    public static final Parcelable.Creator<pcj> CREATOR = new k3j(14);
    public final String[] X;
    public final mcj[] Y;
    public final tcj a;
    public final String b;
    public final String c;
    public final ucj[] d;
    public final rcj[] o;

    public pcj(tcj tcjVar, String str, String str2, ucj[] ucjVarArr, rcj[] rcjVarArr, String[] strArr, mcj[] mcjVarArr) {
        this.a = tcjVar;
        this.b = str;
        this.c = str2;
        this.d = ucjVarArr;
        this.o = rcjVarArr;
        this.X = strArr;
        this.Y = mcjVarArr;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iK = a9j.k(parcel, 20293);
        a9j.f(parcel, 1, this.a, i);
        a9j.g(parcel, 2, this.b);
        a9j.g(parcel, 3, this.c);
        a9j.i(parcel, 4, this.d, i);
        a9j.i(parcel, 5, this.o, i);
        a9j.h(parcel, 6, this.X);
        a9j.i(parcel, 7, this.Y, i);
        a9j.l(parcel, iK);
    }
}
