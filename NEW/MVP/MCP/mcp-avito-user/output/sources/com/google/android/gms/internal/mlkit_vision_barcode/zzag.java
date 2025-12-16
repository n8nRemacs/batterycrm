package com.google.android.gms.internal.mlkit_vision_barcode;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.dynamic.d;

/* compiled from: com.google.android.gms:play-services-mlkit-barcode-scanning@@18.0.0 */
/* loaded from: classes6.dex */
public final class zzag extends zza implements zzai {
    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzai
    public final zzaf zzd(d dVar, zzad zzadVar) {
        zzaf zzafVar;
        Parcel parcelE4 = e4();
        zzc.zzb(parcelE4, dVar);
        zzc.zza(parcelE4, zzadVar);
        Parcel parcelF4 = f4(parcelE4, 1);
        IBinder strongBinder = parcelF4.readStrongBinder();
        if (strongBinder == null) {
            zzafVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.vision.barcode.internal.client.INativeBarcodeDetector");
            zzafVar = iInterfaceQueryLocalInterface instanceof zzaf ? (zzaf) iInterfaceQueryLocalInterface : new zzaf(strongBinder, "com.google.android.gms.vision.barcode.internal.client.INativeBarcodeDetector");
        }
        parcelF4.recycle();
        return zzafVar;
    }
}
