package com.google.android.gms.internal.mlkit_vision_face;

import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.dynamic.d;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-mlkit-face-detection@@17.1.0 */
/* loaded from: classes6.dex */
public final class zzoy extends zza implements IInterface {
    public final List zzd(d dVar, zzoq zzoqVar) {
        Parcel parcelE4 = e4();
        zzc.zzb(parcelE4, dVar);
        zzc.zza(parcelE4, zzoqVar);
        Parcel parcelF4 = f4(parcelE4, 3);
        ArrayList arrayListCreateTypedArrayList = parcelF4.createTypedArrayList(zzow.CREATOR);
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
