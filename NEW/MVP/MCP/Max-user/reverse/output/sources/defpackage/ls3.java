package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class ls3 extends l4 {
    public static final Parcelable.Creator<ls3> CREATOR = new wci(26);
    public final int[] X;
    public final vsd a;
    public final boolean b;
    public final boolean c;
    public final int[] d;
    public final int o;

    public ls3(vsd vsdVar, boolean z, boolean z2, int[] iArr, int i, int[] iArr2) {
        this.a = vsdVar;
        this.b = z;
        this.c = z2;
        this.d = iArr;
        this.o = i;
        this.X = iArr2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iK = a9j.k(parcel, 20293);
        a9j.f(parcel, 1, this.a, i);
        a9j.m(parcel, 2, 4);
        parcel.writeInt(this.b ? 1 : 0);
        a9j.m(parcel, 3, 4);
        parcel.writeInt(this.c ? 1 : 0);
        int[] iArr = this.d;
        if (iArr != null) {
            int iK2 = a9j.k(parcel, 4);
            parcel.writeIntArray(iArr);
            a9j.l(parcel, iK2);
        }
        a9j.m(parcel, 5, 4);
        parcel.writeInt(this.o);
        int[] iArr2 = this.X;
        if (iArr2 != null) {
            int iK3 = a9j.k(parcel, 6);
            parcel.writeIntArray(iArr2);
            a9j.l(parcel, iK3);
        }
        a9j.l(parcel, iK);
    }
}
