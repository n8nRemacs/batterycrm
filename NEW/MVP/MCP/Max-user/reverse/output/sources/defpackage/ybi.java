package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class ybi extends l4 {
    public static final Parcelable.Creator<ybi> CREATOR = new obh(15);
    public final int a;
    public final fci b;

    public ybi(int i, fci fciVar) {
        this.a = i;
        this.b = fciVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iK = a9j.k(parcel, 20293);
        a9j.m(parcel, 1, 4);
        parcel.writeInt(this.a);
        a9j.f(parcel, 2, this.b, i);
        a9j.l(parcel, iK);
    }
}
