package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class w8j extends l4 {
    public static final Parcelable.Creator<w8j> CREATOR = new wci(4);
    public String a;
    public String b;
    public int c;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iK = a9j.k(parcel, 20293);
        a9j.g(parcel, 2, this.a);
        a9j.g(parcel, 3, this.b);
        int i2 = this.c;
        a9j.m(parcel, 4, 4);
        parcel.writeInt(i2);
        a9j.l(parcel, iK);
    }
}
