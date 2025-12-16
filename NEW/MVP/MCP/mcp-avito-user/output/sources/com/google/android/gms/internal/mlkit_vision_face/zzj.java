package com.google.android.gms.internal.mlkit_vision_face;

import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.dynamic.d;

/* compiled from: com.google.android.gms:play-services-mlkit-face-detection@@17.1.0 */
/* loaded from: classes6.dex */
public final class zzj extends zza implements IInterface {
    public final void zzd() {
        g4(e4(), 3);
    }

    public final zzf[] zze(d dVar, zzp zzpVar) {
        Parcel parcelE4 = e4();
        zzc.zzb(parcelE4, dVar);
        zzc.zza(parcelE4, zzpVar);
        Parcel parcelF4 = f4(parcelE4, 1);
        zzf[] zzfVarArr = (zzf[]) parcelF4.createTypedArray(zzf.CREATOR);
        parcelF4.recycle();
        return zzfVarArr;
    }

    public final zzf[] zzf(d dVar, d dVar2, d dVar3, int i12, int i13, int i14, int i15, int i16, int i17, zzp zzpVar) {
        Parcel parcelE4 = e4();
        zzc.zzb(parcelE4, dVar);
        zzc.zzb(parcelE4, dVar2);
        zzc.zzb(parcelE4, dVar3);
        parcelE4.writeInt(i12);
        parcelE4.writeInt(i13);
        parcelE4.writeInt(i14);
        parcelE4.writeInt(i15);
        parcelE4.writeInt(i16);
        parcelE4.writeInt(i17);
        zzc.zza(parcelE4, zzpVar);
        Parcel parcelF4 = f4(parcelE4, 4);
        zzf[] zzfVarArr = (zzf[]) parcelF4.createTypedArray(zzf.CREATOR);
        parcelF4.recycle();
        return zzfVarArr;
    }
}
