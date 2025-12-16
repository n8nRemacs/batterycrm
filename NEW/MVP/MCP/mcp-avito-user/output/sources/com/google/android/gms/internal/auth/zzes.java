package com.google.android.gms.internal.auth;

/* compiled from: com.google.android.gms:play-services-auth-base@@18.0.10 */
/* loaded from: classes6.dex */
final class zzes implements zzfv {

    /* renamed from: a, reason: collision with root package name */
    public static final zzes f350101a = new zzes();

    public static zzes zza() {
        return f350101a;
    }

    @Override // com.google.android.gms.internal.auth.zzfv
    public final zzfu zzb(Class cls) {
        if (!zzev.class.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Unsupported message type: ".concat(cls.getName()));
        }
        try {
            return (zzfu) zzev.a(cls.asSubclass(zzev.class)).g(3);
        } catch (Exception e12) {
            throw new RuntimeException("Unable to get message info for ".concat(cls.getName()), e12);
        }
    }

    @Override // com.google.android.gms.internal.auth.zzfv
    public final boolean zzc(Class cls) {
        return zzev.class.isAssignableFrom(cls);
    }
}
