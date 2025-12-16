package com.google.android.gms.internal.mlkit_vision_barcode;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.dynamic.d;

/* compiled from: com.google.android.gms:play-services-mlkit-barcode-scanning@@18.0.0 */
/* loaded from: classes6.dex */
public final class zzoy extends zza implements zzpa {
    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzpa
    public final zzox zzd(d dVar, zzop zzopVar) {
        zzox zzoxVar;
        Parcel parcelE4 = e4();
        zzc.zzb(parcelE4, dVar);
        zzc.zza(parcelE4, zzopVar);
        Parcel parcelF4 = f4(parcelE4, 1);
        IBinder strongBinder = parcelF4.readStrongBinder();
        if (strongBinder == null) {
            zzoxVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.mlkit.vision.barcode.aidls.IBarcodeScanner");
            zzoxVar = iInterfaceQueryLocalInterface instanceof zzox ? (zzox) iInterfaceQueryLocalInterface : new zzox(strongBinder, "com.google.mlkit.vision.barcode.aidls.IBarcodeScanner");
        }
        parcelF4.recycle();
        return zzoxVar;
    }
}
