package com.google.android.gms.internal.fido;

import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.fido.u2f.api.common.RegisterRequestParams;
import com.google.android.gms.fido.u2f.api.common.SignRequestParams;

/* compiled from: com.google.android.gms:play-services-fido@@21.0.0 */
/* loaded from: classes6.dex */
public final class zzw extends zza implements IInterface {
    /* JADX WARN: Multi-variable type inference failed */
    public final void zzc(zzv zzvVar, RegisterRequestParams registerRequestParams) {
        Parcel parcelE4 = e4();
        ClassLoader classLoader = zzc.f350279a;
        parcelE4.writeStrongBinder(zzvVar);
        zzc.zzd(parcelE4, registerRequestParams);
        f4(parcelE4, 1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void zzd(zzv zzvVar, SignRequestParams signRequestParams) {
        Parcel parcelE4 = e4();
        ClassLoader classLoader = zzc.f350279a;
        parcelE4.writeStrongBinder(zzvVar);
        zzc.zzd(parcelE4, signRequestParams);
        f4(parcelE4, 2);
    }
}
