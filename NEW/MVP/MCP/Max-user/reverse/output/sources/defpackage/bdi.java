package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: classes.dex */
public final class bdi extends uai implements hei {
    public final /* synthetic */ int d;
    public final /* synthetic */ pva e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bdi(pva pvaVar, int i) {
        super("com.google.android.gms.maps.internal.IOnMapReadyCallback", 6);
        this.d = i;
        this.e = pvaVar;
    }

    @Override // defpackage.hei
    public final void N(pni pniVar) {
        switch (this.d) {
            case 0:
                this.e.R(new iw6(pniVar));
                break;
            default:
                this.e.R(new iw6(pniVar));
                break;
        }
    }

    @Override // defpackage.uai
    public final boolean T(int i, Parcel parcel, Parcel parcel2) {
        pni pniVar;
        if (i != 1) {
            return false;
        }
        IBinder strongBinder = parcel.readStrongBinder();
        if (strongBinder == null) {
            pniVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            pniVar = iInterfaceQueryLocalInterface instanceof pni ? (pni) iInterfaceQueryLocalInterface : new pni(strongBinder, "com.google.android.gms.maps.internal.IGoogleMapDelegate", 3);
        }
        mgi.b(parcel);
        N(pniVar);
        parcel2.writeNoException();
        return true;
    }
}
