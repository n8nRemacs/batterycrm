package com.google.android.gms.internal.measurement;

import java.nio.charset.Charset;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: com.google.android.gms:play-services-measurement-base@@21.5.1 */
/* loaded from: classes6.dex */
final class zzlf {

    /* renamed from: c, reason: collision with root package name */
    public static final zzlf f350949c = new zzlf();

    /* renamed from: b, reason: collision with root package name */
    public final ConcurrentHashMap f350951b = new ConcurrentHashMap();

    /* renamed from: a, reason: collision with root package name */
    public final zzkf f350950a = new zzkf();

    public static zzlf zza() {
        return f350949c;
    }

    public final <T> zzlj<T> zza(Class<T> cls) {
        Charset charset = zzjh.f350896a;
        if (cls == null) {
            throw new NullPointerException("messageType");
        }
        ConcurrentHashMap concurrentHashMap = this.f350951b;
        zzlj<T> zzljVar = (zzlj) concurrentHashMap.get(cls);
        if (zzljVar != null) {
            return zzljVar;
        }
        zzlj<T> zzljVarZza = this.f350950a.zza(cls);
        if (zzljVarZza == null) {
            throw new NullPointerException("schema");
        }
        zzlj<T> zzljVar2 = (zzlj) concurrentHashMap.putIfAbsent(cls, zzljVarZza);
        return zzljVar2 != null ? zzljVar2 : zzljVarZza;
    }

    public final <T> zzlj<T> zza(T t12) {
        return zza((Class) t12.getClass());
    }
}
