package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class gci extends l4 {
    public static final Parcelable.Creator<gci> CREATOR = new obh(19);
    public final int a;
    public final IBinder b;
    public final es3 c;
    public final boolean d;
    public final boolean o;

    public gci(int i, IBinder iBinder, es3 es3Var, boolean z, boolean z2) {
        this.a = i;
        this.b = iBinder;
        this.c = es3Var;
        this.d = z;
        this.o = z2;
    }

    public final boolean equals(Object obj) {
        Object ubjVar;
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gci)) {
            return false;
        }
        gci gciVar = (gci) obj;
        if (!this.c.equals(gciVar.c)) {
            return false;
        }
        Object ubjVar2 = null;
        IBinder iBinder = this.b;
        if (iBinder == null) {
            ubjVar = null;
        } else {
            int i = x5.d;
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
            ubjVar = iInterfaceQueryLocalInterface instanceof sa7 ? (sa7) iInterfaceQueryLocalInterface : new ubj(iBinder, "com.google.android.gms.common.internal.IAccountAccessor", 2);
        }
        IBinder iBinder2 = gciVar.b;
        if (iBinder2 != null) {
            int i2 = x5.d;
            IInterface iInterfaceQueryLocalInterface2 = iBinder2.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
            ubjVar2 = iInterfaceQueryLocalInterface2 instanceof sa7 ? (sa7) iInterfaceQueryLocalInterface2 : new ubj(iBinder2, "com.google.android.gms.common.internal.IAccountAccessor", 2);
        }
        return syi.c(ubjVar, ubjVar2);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iK = a9j.k(parcel, 20293);
        a9j.m(parcel, 1, 4);
        parcel.writeInt(this.a);
        a9j.e(parcel, 2, this.b);
        a9j.f(parcel, 3, this.c, i);
        a9j.m(parcel, 4, 4);
        parcel.writeInt(this.d ? 1 : 0);
        a9j.m(parcel, 5, 4);
        parcel.writeInt(this.o ? 1 : 0);
        a9j.l(parcel, iK);
    }
}
