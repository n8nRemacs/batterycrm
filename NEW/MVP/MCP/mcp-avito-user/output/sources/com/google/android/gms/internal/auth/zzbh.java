package com.google.android.gms.internal.auth;

import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.auth.api.proxy.ProxyRequest;

/* compiled from: com.google.android.gms:play-services-auth-base@@18.0.10 */
/* loaded from: classes6.dex */
public final class zzbh extends zza implements IInterface {
    public final void zzd(zzbg zzbgVar) {
        Parcel parcelE4 = e4();
        zzc.zzd(parcelE4, zzbgVar);
        g4(parcelE4, 3);
    }

    public final void zze(zzbg zzbgVar, ProxyRequest proxyRequest) {
        Parcel parcelE4 = e4();
        zzc.zzd(parcelE4, zzbgVar);
        zzc.zzc(parcelE4, proxyRequest);
        g4(parcelE4, 1);
    }
}
