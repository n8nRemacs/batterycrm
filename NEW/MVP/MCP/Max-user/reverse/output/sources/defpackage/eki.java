package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: classes.dex */
public final class eki extends oai {
    public final xei W() {
        xei xeiVar;
        Parcel parcelS = S(T(), 4);
        IBinder strongBinder = parcelS.readStrongBinder();
        if (strongBinder == null) {
            xeiVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
            xeiVar = iInterfaceQueryLocalInterface instanceof xei ? (xei) iInterfaceQueryLocalInterface : new xei(strongBinder, "com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate", 3);
        }
        parcelS.recycle();
        return xeiVar;
    }

    public final fwi X(tqa tqaVar) {
        fwi fwiVar;
        Parcel parcelT = T();
        mgi.d(parcelT, tqaVar);
        Parcel parcelS = S(parcelT, 2);
        IBinder strongBinder = parcelS.readStrongBinder();
        if (strongBinder == null) {
            fwiVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.maps.internal.IMapFragmentDelegate");
            fwiVar = iInterfaceQueryLocalInterface instanceof fwi ? (fwi) iInterfaceQueryLocalInterface : new fwi(strongBinder, "com.google.android.gms.maps.internal.IMapFragmentDelegate", 3);
        }
        parcelS.recycle();
        return fwiVar;
    }

    public final kyi Y(tqa tqaVar) {
        kyi kyiVar;
        Parcel parcelT = T();
        mgi.d(parcelT, tqaVar);
        parcelT.writeInt(0);
        Parcel parcelS = S(parcelT, 3);
        IBinder strongBinder = parcelS.readStrongBinder();
        if (strongBinder == null) {
            kyiVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.maps.internal.IMapViewDelegate");
            kyiVar = iInterfaceQueryLocalInterface instanceof kyi ? (kyi) iInterfaceQueryLocalInterface : new kyi(strongBinder, "com.google.android.gms.maps.internal.IMapViewDelegate", 3);
        }
        parcelS.recycle();
        return kyiVar;
    }

    public final dwi Z() {
        dwi vriVar;
        Parcel parcelS = S(T(), 5);
        IBinder strongBinder = parcelS.readStrongBinder();
        int i = xti.d;
        if (strongBinder == null) {
            vriVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.maps.model.internal.IBitmapDescriptorFactoryDelegate");
            vriVar = iInterfaceQueryLocalInterface instanceof dwi ? (dwi) iInterfaceQueryLocalInterface : new vri(strongBinder, "com.google.android.gms.maps.model.internal.IBitmapDescriptorFactoryDelegate", 3);
        }
        parcelS.recycle();
        return vriVar;
    }
}
