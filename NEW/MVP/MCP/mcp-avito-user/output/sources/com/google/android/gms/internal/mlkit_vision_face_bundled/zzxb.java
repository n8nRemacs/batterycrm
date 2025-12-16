package com.google.android.gms.internal.mlkit_vision_face_bundled;

import java.nio.charset.Charset;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: com.google.mlkit:face-detection@@16.1.6 */
/* loaded from: classes6.dex */
final class zzxb {

    /* renamed from: c, reason: collision with root package name */
    public static final zzxb f354107c = new zzxb();

    /* renamed from: b, reason: collision with root package name */
    public final ConcurrentHashMap f354109b = new ConcurrentHashMap();

    /* renamed from: a, reason: collision with root package name */
    public final zzwk f354108a = new zzwk();

    public static zzxb zza() {
        return f354107c;
    }

    public final zzxf zzb(Class cls) {
        Charset charset = zzvt.f354067a;
        if (cls == null) {
            throw new NullPointerException("messageType");
        }
        ConcurrentHashMap concurrentHashMap = this.f354109b;
        zzxf zzxfVarZza = (zzxf) concurrentHashMap.get(cls);
        if (zzxfVarZza == null) {
            zzxfVarZza = this.f354108a.zza(cls);
            zzxf zzxfVar = (zzxf) concurrentHashMap.putIfAbsent(cls, zzxfVarZza);
            if (zzxfVar != null) {
                return zzxfVar;
            }
        }
        return zzxfVarZza;
    }
}
