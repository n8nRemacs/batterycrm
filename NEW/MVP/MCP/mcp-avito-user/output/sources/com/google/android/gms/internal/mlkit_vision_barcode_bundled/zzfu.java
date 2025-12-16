package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import java.nio.charset.Charset;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: com.google.mlkit:barcode-scanning@@17.0.2 */
/* loaded from: classes6.dex */
final class zzfu {

    /* renamed from: c, reason: collision with root package name */
    public static final zzfu f352490c = new zzfu();

    /* renamed from: b, reason: collision with root package name */
    public final ConcurrentHashMap f352492b = new ConcurrentHashMap();

    /* renamed from: a, reason: collision with root package name */
    public final zzfd f352491a = new zzfd();

    public static zzfu zza() {
        return f352490c;
    }

    public final zzgb zzb(Class cls) {
        Charset charset = zzel.f352447a;
        if (cls == null) {
            throw new NullPointerException("messageType");
        }
        ConcurrentHashMap concurrentHashMap = this.f352492b;
        zzgb zzgbVarZza = (zzgb) concurrentHashMap.get(cls);
        if (zzgbVarZza == null) {
            zzgbVarZza = this.f352491a.zza(cls);
            if (zzgbVarZza == null) {
                throw new NullPointerException("schema");
            }
            zzgb zzgbVar = (zzgb) concurrentHashMap.putIfAbsent(cls, zzgbVarZza);
            if (zzgbVar != null) {
                return zzgbVar;
            }
        }
        return zzgbVarZza;
    }
}
