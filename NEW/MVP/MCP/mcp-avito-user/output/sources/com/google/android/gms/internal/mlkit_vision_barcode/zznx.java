package com.google.android.gms.internal.mlkit_vision_barcode;

import j.P;

/* compiled from: com.google.android.gms:play-services-mlkit-barcode-scanning@@18.0.0 */
/* loaded from: classes6.dex */
public final class zznx {

    /* renamed from: a, reason: collision with root package name */
    @P
    public static zznw f352222a;

    public static synchronized zznm zza(zzne zzneVar) {
        try {
            if (f352222a == null) {
                f352222a = new zznw(null);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return (zznm) f352222a.get(zzneVar);
    }

    public static synchronized zznm zzb(String str) {
        return zza(zzne.zzd(str).zzd());
    }
}
