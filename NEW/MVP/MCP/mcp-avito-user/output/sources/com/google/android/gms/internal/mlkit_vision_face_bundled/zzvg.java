package com.google.android.gms.internal.mlkit_vision_face_bundled;

/* compiled from: com.google.mlkit:face-detection@@16.1.6 */
/* loaded from: classes6.dex */
final class zzvg implements zzwq {

    /* renamed from: a, reason: collision with root package name */
    public static final zzvg f354057a = new zzvg();

    public static zzvg zza() {
        return f354057a;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.zzwq
    public final zzwp zzb(Class cls) {
        if (!zzvn.class.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Unsupported message type: ".concat(cls.getName()));
        }
        try {
            return (zzwp) zzvn.j(cls.asSubclass(zzvn.class)).h(3, null);
        } catch (Exception e12) {
            throw new RuntimeException("Unable to get message info for ".concat(cls.getName()), e12);
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.zzwq
    public final boolean zzc(Class cls) {
        return zzvn.class.isAssignableFrom(cls);
    }
}
