package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class m8g extends l4 {
    public static final Parcelable.Creator<m8g> CREATOR = new wci(5);
    public final int a;
    public final int b;
    public final byte[] c;

    public m8g(int i, byte[] bArr, int i2) {
        this.a = i;
        this.b = i2;
        this.c = bArr;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iK = a9j.k(parcel, 20293);
        a9j.m(parcel, 2, 4);
        parcel.writeInt(this.a);
        a9j.m(parcel, 3, 4);
        parcel.writeInt(this.b);
        a9j.c(parcel, 4, this.c);
        a9j.l(parcel, iK);
    }
}
