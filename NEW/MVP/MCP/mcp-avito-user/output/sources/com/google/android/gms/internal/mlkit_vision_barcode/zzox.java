package com.google.android.gms.internal.mlkit_vision_barcode;

import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.dynamic.d;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-mlkit-barcode-scanning@@18.0.0 */
/* loaded from: classes6.dex */
public final class zzox extends zza implements IInterface {
    public final List zzd(d dVar, zzpg zzpgVar) {
        Parcel parcelE4 = e4();
        zzc.zzb(parcelE4, dVar);
        zzc.zza(parcelE4, zzpgVar);
        Parcel parcelF4 = f4(parcelE4, 3);
        ArrayList arrayListCreateTypedArrayList = parcelF4.createTypedArrayList(zzon.CREATOR);
        parcelF4.recycle();
        return arrayListCreateTypedArrayList;
    }

    public final void zze() {
        g4(e4(), 1);
    }

    public final void zzf() {
        g4(e4(), 2);
    }
}
