package com.google.android.gms.internal.mlkit_common;

import j.P;

/* compiled from: com.google.mlkit:common@@18.10.0 */
/* loaded from: classes6.dex */
public final class zztd {

    /* renamed from: a, reason: collision with root package name */
    @P
    public static zztc f351741a;

    public static synchronized zzss zza(zzsm zzsmVar) {
        try {
            if (f351741a == null) {
                f351741a = new zztc(null);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return (zzss) f351741a.get(zzsmVar);
    }

    public static synchronized zzss zzb(String str) {
        return zza(zzsm.zzd("common").zzd());
    }
}
