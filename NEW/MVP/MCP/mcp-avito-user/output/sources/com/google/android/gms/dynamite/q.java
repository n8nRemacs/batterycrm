package com.google.android.gms.dynamite;

import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.internal.P0;
import com.google.android.gms.internal.common.zza;
import com.google.android.gms.internal.common.zzc;

/* compiled from: com.google.android.gms:play-services-basement@@18.3.0 */
/* loaded from: classes6.dex */
public final class q extends zza implements IInterface {
    public final com.google.android.gms.dynamic.d g4(com.google.android.gms.dynamic.f fVar, String str, int i12) {
        Parcel parcelF4 = f4();
        zzc.zze(parcelF4, fVar);
        parcelF4.writeString(str);
        parcelF4.writeInt(i12);
        return P0.f(e4(parcelF4, 2));
    }

    public final com.google.android.gms.dynamic.d h4(com.google.android.gms.dynamic.f fVar, String str, int i12, com.google.android.gms.dynamic.f fVar2) {
        Parcel parcelF4 = f4();
        zzc.zze(parcelF4, fVar);
        parcelF4.writeString(str);
        parcelF4.writeInt(i12);
        zzc.zze(parcelF4, fVar2);
        return P0.f(e4(parcelF4, 8));
    }

    public final com.google.android.gms.dynamic.d i4(com.google.android.gms.dynamic.f fVar, String str, int i12) {
        Parcel parcelF4 = f4();
        zzc.zze(parcelF4, fVar);
        parcelF4.writeString(str);
        parcelF4.writeInt(i12);
        return P0.f(e4(parcelF4, 4));
    }
}
