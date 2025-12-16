package com.google.android.gms.internal.mlkit_vision_face;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.dynamic.d;

/* compiled from: com.google.android.gms:play-services-mlkit-face-detection@@17.1.0 */
/* loaded from: classes6.dex */
public final class zzoz extends zza implements zzpb {
    @Override // com.google.android.gms.internal.mlkit_vision_face.zzpb
    public final zzoy zzd(d dVar, zzou zzouVar) {
        zzoy zzoyVar;
        Parcel parcelE4 = e4();
        zzc.zzb(parcelE4, dVar);
        zzc.zza(parcelE4, zzouVar);
        Parcel parcelF4 = f4(parcelE4, 1);
        IBinder strongBinder = parcelF4.readStrongBinder();
        if (strongBinder == null) {
            zzoyVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.mlkit.vision.face.aidls.IFaceDetector");
            zzoyVar = iInterfaceQueryLocalInterface instanceof zzoy ? (zzoy) iInterfaceQueryLocalInterface : new zzoy(strongBinder, "com.google.mlkit.vision.face.aidls.IFaceDetector");
        }
        parcelF4.recycle();
        return zzoyVar;
    }
}
