package com.google.android.gms.internal.appset;

import android.os.IInterface;
import android.os.Parcel;

/* compiled from: com.google.android.gms:play-services-appset@@16.0.0 */
/* loaded from: classes6.dex */
public final class zzg extends zza implements IInterface {
    public final void zzc(com.google.android.gms.appset.zza zzaVar, zzf zzfVar) {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken("com.google.android.gms.appset.internal.IAppSetService");
        zzc.zzb(parcelObtain, zzaVar);
        zzc.zzc(parcelObtain, zzfVar);
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            this.f349951a.transact(1, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
        } finally {
            parcelObtain.recycle();
            parcelObtain2.recycle();
        }
    }
}
