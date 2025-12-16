package com.google.android.gms.internal.mlkit_vision_common;

import j.P;

/* compiled from: com.google.mlkit:vision-common@@17.2.0 */
/* loaded from: classes6.dex */
public final class zzlg {

    /* renamed from: a, reason: collision with root package name */
    @P
    public static zzlf f352910a;

    public static synchronized zzkx zza(zzkr zzkrVar) {
        try {
            if (f352910a == null) {
                f352910a = new zzlf(null);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return (zzkx) f352910a.get(zzkrVar);
    }

    public static synchronized zzkx zzb(String str) {
        return zza(zzkr.zzd("vision-common").zzd());
    }
}
