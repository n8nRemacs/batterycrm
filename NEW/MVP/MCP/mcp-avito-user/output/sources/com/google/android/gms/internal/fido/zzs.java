package com.google.android.gms.internal.fido;

import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialCreationOptions;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialRequestOptions;

/* compiled from: com.google.android.gms:play-services-fido@@21.0.0 */
/* loaded from: classes6.dex */
public final class zzs extends zza implements IInterface {
    /* JADX WARN: Multi-variable type inference failed */
    public final void zzc(zzr zzrVar, PublicKeyCredentialCreationOptions publicKeyCredentialCreationOptions) {
        Parcel parcelE4 = e4();
        ClassLoader classLoader = zzc.f350279a;
        parcelE4.writeStrongBinder(zzrVar);
        zzc.zzd(parcelE4, publicKeyCredentialCreationOptions);
        f4(parcelE4, 1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void zzd(zzr zzrVar, PublicKeyCredentialRequestOptions publicKeyCredentialRequestOptions) {
        Parcel parcelE4 = e4();
        ClassLoader classLoader = zzc.f350279a;
        parcelE4.writeStrongBinder(zzrVar);
        zzc.zzd(parcelE4, publicKeyCredentialRequestOptions);
        f4(parcelE4, 2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void zze(zze zzeVar) {
        Parcel parcelE4 = e4();
        ClassLoader classLoader = zzc.f350279a;
        parcelE4.writeStrongBinder(zzeVar);
        f4(parcelE4, 3);
    }
}
