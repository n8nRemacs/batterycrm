package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class iyi extends l4 {
    public static final Parcelable.Creator<iyi> CREATOR = new k3j(10);
    public String[] X;
    public wri[] Y;
    public m4j a;
    public String b;
    public String c;
    public o5j[] d;
    public e2j[] o;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iK = a9j.k(parcel, 20293);
        a9j.f(parcel, 2, this.a, i);
        a9j.g(parcel, 3, this.b);
        a9j.g(parcel, 4, this.c);
        a9j.i(parcel, 5, this.d, i);
        a9j.i(parcel, 6, this.o, i);
        a9j.h(parcel, 7, this.X);
        a9j.i(parcel, 8, this.Y, i);
        a9j.l(parcel, iK);
    }
}
