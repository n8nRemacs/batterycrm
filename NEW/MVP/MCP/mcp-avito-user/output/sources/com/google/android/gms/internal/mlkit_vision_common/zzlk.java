package com.google.android.gms.internal.mlkit_vision_common;

import j.P;

/* compiled from: com.google.mlkit:vision-common@@17.2.0 */
/* loaded from: classes6.dex */
public final class zzlk {

    /* renamed from: a, reason: collision with root package name */
    @P
    public static zzlk f352912a;

    public static synchronized zzlk zza() {
        try {
            if (f352912a == null) {
                f352912a = new zzlk();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f352912a;
    }

    public static final boolean zzb() {
        int i12 = zzlj.f352911a;
        zza();
        return Boolean.parseBoolean("");
    }
}
