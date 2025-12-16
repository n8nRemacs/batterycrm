package dY0;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.maps.zzb;

/* renamed from: dY0.f0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractBinderC39656f0 extends zzb implements InterfaceC39654e0 {
    public AbstractBinderC39656f0() {
        super("com.google.android.gms.maps.internal.IOnStreetViewPanoramaReadyCallback");
    }

    @Override // com.google.android.gms.internal.maps.zzb
    public final boolean e4(int i12, Parcel parcel, Parcel parcel2) {
        InterfaceC39657g c39664j0;
        if (i12 != 1) {
            return false;
        }
        IBinder strongBinder = parcel.readStrongBinder();
        if (strongBinder == null) {
            c39664j0 = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate");
            c39664j0 = iInterfaceQueryLocalInterface instanceof InterfaceC39657g ? (InterfaceC39657g) iInterfaceQueryLocalInterface : new C39664j0(strongBinder, "com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate");
        }
        Y2(c39664j0);
        parcel2.writeNoException();
        return true;
    }
}
