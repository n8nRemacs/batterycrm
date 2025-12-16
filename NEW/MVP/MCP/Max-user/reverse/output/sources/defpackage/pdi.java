package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: classes.dex */
public final class pdi extends oai implements tdi {
    public final ndi W(tqa tqaVar, edi ediVar) {
        ndi ndiVar;
        Parcel parcelT = T();
        int i = ngi.a;
        parcelT.writeStrongBinder(tqaVar);
        parcelT.writeInt(1);
        ediVar.writeToParcel(parcelT, 0);
        Parcel parcelU = U(parcelT, 1);
        IBinder strongBinder = parcelU.readStrongBinder();
        if (strongBinder == null) {
            ndiVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.vision.barcode.internal.client.INativeBarcodeDetector");
            ndiVar = iInterfaceQueryLocalInterface instanceof ndi ? (ndi) iInterfaceQueryLocalInterface : new ndi(strongBinder, "com.google.android.gms.vision.barcode.internal.client.INativeBarcodeDetector", 1);
        }
        parcelU.recycle();
        return ndiVar;
    }
}
