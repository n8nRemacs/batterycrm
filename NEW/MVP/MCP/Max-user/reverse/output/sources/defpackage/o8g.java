package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class o8g extends l4 {
    public static final Parcelable.Creator<o8g> CREATOR = new wci(10);
    public vei a;
    public float c;
    public boolean b = true;
    public boolean d = true;
    public float o = 0.0f;

    public final void b(p8g p8gVar) {
        this.a = new jdi(p8gVar);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iK = a9j.k(parcel, 20293);
        vei veiVar = this.a;
        a9j.e(parcel, 2, veiVar == null ? null : veiVar.asBinder());
        boolean z = this.b;
        a9j.m(parcel, 3, 4);
        parcel.writeInt(z ? 1 : 0);
        float f = this.c;
        a9j.m(parcel, 4, 4);
        parcel.writeFloat(f);
        boolean z2 = this.d;
        a9j.m(parcel, 5, 4);
        parcel.writeInt(z2 ? 1 : 0);
        float f2 = this.o;
        a9j.m(parcel, 6, 4);
        parcel.writeFloat(f2);
        a9j.l(parcel, iK);
    }
}
