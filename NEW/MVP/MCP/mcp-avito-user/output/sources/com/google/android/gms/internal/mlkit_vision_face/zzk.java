package com.google.android.gms.internal.mlkit_vision_face;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.dynamic.d;

/* compiled from: com.google.android.gms:play-services-mlkit-face-detection@@17.1.0 */
/* loaded from: classes6.dex */
public final class zzk extends zza implements zzm {
    @Override // com.google.android.gms.internal.mlkit_vision_face.zzm
    public final zzj zzd(d dVar, zzh zzhVar) {
        zzj zzjVar;
        Parcel parcelE4 = e4();
        zzc.zzb(parcelE4, dVar);
        zzc.zza(parcelE4, zzhVar);
        Parcel parcelF4 = f4(parcelE4, 1);
        IBinder strongBinder = parcelF4.readStrongBinder();
        if (strongBinder == null) {
            zzjVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.vision.face.internal.client.INativeFaceDetector");
            zzjVar = iInterfaceQueryLocalInterface instanceof zzj ? (zzj) iInterfaceQueryLocalInterface : new zzj(strongBinder, "com.google.android.gms.vision.face.internal.client.INativeFaceDetector");
        }
        parcelF4.recycle();
        return zzjVar;
    }
}
