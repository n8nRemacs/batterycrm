package com.google.android.gms.internal.auth;

import java.nio.charset.Charset;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: com.google.android.gms:play-services-auth-base@@18.0.10 */
/* loaded from: classes6.dex */
final class zzgf {

    /* renamed from: c, reason: collision with root package name */
    public static final zzgf f350137c = new zzgf();

    /* renamed from: b, reason: collision with root package name */
    public final ConcurrentHashMap f350139b = new ConcurrentHashMap();

    /* renamed from: a, reason: collision with root package name */
    public final zzfp f350138a = new zzfp();

    public static zzgf zza() {
        return f350137c;
    }

    public final zzgi zzb(Class cls) {
        Charset charset = zzfa.f350106a;
        if (cls == null) {
            throw new NullPointerException("messageType");
        }
        ConcurrentHashMap concurrentHashMap = this.f350139b;
        zzgi zzgiVarZza = (zzgi) concurrentHashMap.get(cls);
        if (zzgiVarZza == null) {
            zzgiVarZza = this.f350138a.zza(cls);
            zzgi zzgiVar = (zzgi) concurrentHashMap.putIfAbsent(cls, zzgiVarZza);
            if (zzgiVar != null) {
                return zzgiVar;
            }
        }
        return zzgiVarZza;
    }
}
