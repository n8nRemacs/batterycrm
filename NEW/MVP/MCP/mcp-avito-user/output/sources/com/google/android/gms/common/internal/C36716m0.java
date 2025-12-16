package com.google.android.gms.common.internal;

import android.os.Parcel;
import com.google.android.gms.common.zzo;
import com.google.android.gms.common.zzq;
import com.google.android.gms.common.zzs;
import com.google.android.gms.internal.common.zza;
import com.google.android.gms.internal.common.zzc;

/* compiled from: com.google.android.gms:play-services-basement@@18.3.0 */
/* renamed from: com.google.android.gms.common.internal.m0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36716m0 extends zza implements InterfaceC36720o0 {
    @Override // com.google.android.gms.common.internal.InterfaceC36720o0
    public final boolean R(zzs zzsVar, com.google.android.gms.dynamic.f fVar) {
        Parcel parcelF4 = f4();
        zzc.zzc(parcelF4, zzsVar);
        zzc.zze(parcelF4, fVar);
        Parcel parcelE4 = e4(parcelF4, 5);
        boolean zZzf = zzc.zzf(parcelE4);
        parcelE4.recycle();
        return zZzf;
    }

    @Override // com.google.android.gms.common.internal.InterfaceC36720o0
    public final zzq v0(zzo zzoVar) {
        Parcel parcelF4 = f4();
        zzc.zzc(parcelF4, zzoVar);
        Parcel parcelE4 = e4(parcelF4, 6);
        zzq zzqVar = (zzq) zzc.zza(parcelE4, zzq.CREATOR);
        parcelE4.recycle();
        return zzqVar;
    }

    @Override // com.google.android.gms.common.internal.InterfaceC36720o0
    public final boolean zzi() {
        Parcel parcelE4 = e4(f4(), 7);
        boolean zZzf = zzc.zzf(parcelE4);
        parcelE4.recycle();
        return zZzf;
    }
}
