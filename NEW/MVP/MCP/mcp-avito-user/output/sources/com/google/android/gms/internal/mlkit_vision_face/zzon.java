package com.google.android.gms.internal.mlkit_vision_face;

import j.P;

/* compiled from: com.google.android.gms:play-services-mlkit-face-detection@@17.1.0 */
/* loaded from: classes6.dex */
public final class zzon {

    /* renamed from: a, reason: collision with root package name */
    @P
    public static zzom f353449a;

    public static synchronized zzoc zza(zznt zzntVar) {
        try {
            if (f353449a == null) {
                f353449a = new zzom(null);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return (zzoc) f353449a.get(zzntVar);
    }

    public static synchronized zzoc zzb(String str) {
        return zza(zznt.zzd(str).zzd());
    }
}
