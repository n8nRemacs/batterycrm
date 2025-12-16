package dY0;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.maps.zzb;

/* renamed from: dY0.D, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractBinderC39644D extends zzb implements InterfaceC39643C {
    public AbstractBinderC39644D() {
        super("com.google.android.gms.maps.internal.IOnMapReadyCallback");
    }

    @Override // com.google.android.gms.internal.maps.zzb
    public final boolean e4(int i12, Parcel parcel, Parcel parcel2) {
        InterfaceC39647b t0Var;
        if (i12 != 1) {
            return false;
        }
        IBinder strongBinder = parcel.readStrongBinder();
        if (strongBinder == null) {
            t0Var = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            t0Var = iInterfaceQueryLocalInterface instanceof InterfaceC39647b ? (InterfaceC39647b) iInterfaceQueryLocalInterface : new t0(strongBinder, "com.google.android.gms.maps.internal.IGoogleMapDelegate");
        }
        E(t0Var);
        parcel2.writeNoException();
        return true;
    }
}
