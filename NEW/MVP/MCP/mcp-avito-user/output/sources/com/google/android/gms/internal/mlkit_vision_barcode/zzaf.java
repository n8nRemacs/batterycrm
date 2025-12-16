package com.google.android.gms.internal.mlkit_vision_barcode;

import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.dynamic.d;

/* compiled from: com.google.android.gms:play-services-mlkit-barcode-scanning@@18.0.0 */
/* loaded from: classes6.dex */
public final class zzaf extends zza implements IInterface {
    public final void zzd() {
        g4(e4(), 3);
    }

    public final zzq[] zze(d dVar, zzaj zzajVar) {
        Parcel parcelE4 = e4();
        zzc.zzb(parcelE4, dVar);
        zzc.zza(parcelE4, zzajVar);
        Parcel parcelF4 = f4(parcelE4, 1);
        zzq[] zzqVarArr = (zzq[]) parcelF4.createTypedArray(zzq.CREATOR);
        parcelF4.recycle();
        return zzqVarArr;
    }

    public final zzq[] zzf(d dVar, zzaj zzajVar) {
        Parcel parcelE4 = e4();
        zzc.zzb(parcelE4, dVar);
        zzc.zza(parcelE4, zzajVar);
        Parcel parcelF4 = f4(parcelE4, 2);
        zzq[] zzqVarArr = (zzq[]) parcelF4.createTypedArray(zzq.CREATOR);
        parcelF4.recycle();
        return zzqVarArr;
    }
}
