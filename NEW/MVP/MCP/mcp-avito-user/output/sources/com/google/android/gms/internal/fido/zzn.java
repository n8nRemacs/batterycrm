package com.google.android.gms.internal.fido;

import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.fido.fido2.api.common.BrowserPublicKeyCredentialCreationOptions;
import com.google.android.gms.fido.fido2.api.common.BrowserPublicKeyCredentialRequestOptions;

/* compiled from: com.google.android.gms:play-services-fido@@21.0.0 */
/* loaded from: classes6.dex */
public final class zzn extends zza implements IInterface {
    /* JADX WARN: Multi-variable type inference failed */
    public final void zzc(zzg zzgVar, String str) {
        Parcel parcelE4 = e4();
        ClassLoader classLoader = zzc.f350279a;
        parcelE4.writeStrongBinder(zzgVar);
        parcelE4.writeString(str);
        f4(parcelE4, 4);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void zzd(zzm zzmVar, BrowserPublicKeyCredentialCreationOptions browserPublicKeyCredentialCreationOptions) {
        Parcel parcelE4 = e4();
        ClassLoader classLoader = zzc.f350279a;
        parcelE4.writeStrongBinder(zzmVar);
        zzc.zzd(parcelE4, browserPublicKeyCredentialCreationOptions);
        f4(parcelE4, 1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void zze(zzm zzmVar, BrowserPublicKeyCredentialRequestOptions browserPublicKeyCredentialRequestOptions) {
        Parcel parcelE4 = e4();
        ClassLoader classLoader = zzc.f350279a;
        parcelE4.writeStrongBinder(zzmVar);
        zzc.zzd(parcelE4, browserPublicKeyCredentialRequestOptions);
        f4(parcelE4, 2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void zzf(zze zzeVar) {
        Parcel parcelE4 = e4();
        ClassLoader classLoader = zzc.f350279a;
        parcelE4.writeStrongBinder(zzeVar);
        f4(parcelE4, 3);
    }
}
