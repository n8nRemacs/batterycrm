package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class m4j extends l4 {
    public static final Parcelable.Creator<m4j> CREATOR = new obh(26);
    public String X;
    public String Y;
    public String a;
    public String b;
    public String c;
    public String d;
    public String o;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iK = a9j.k(parcel, 20293);
        a9j.g(parcel, 2, this.a);
        a9j.g(parcel, 3, this.b);
        a9j.g(parcel, 4, this.c);
        a9j.g(parcel, 5, this.d);
        a9j.g(parcel, 6, this.o);
        a9j.g(parcel, 7, this.X);
        a9j.g(parcel, 8, this.Y);
        a9j.l(parcel, iK);
    }
}
