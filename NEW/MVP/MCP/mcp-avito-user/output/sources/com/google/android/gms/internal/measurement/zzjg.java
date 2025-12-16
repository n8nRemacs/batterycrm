package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzjf;

/* compiled from: com.google.android.gms:play-services-measurement-base@@21.5.1 */
/* loaded from: classes6.dex */
final class zzjg implements zzks {

    /* renamed from: a, reason: collision with root package name */
    public static final zzjg f350895a = new zzjg();

    public static zzjg zza() {
        return f350895a;
    }

    @Override // com.google.android.gms.internal.measurement.zzks
    public final boolean zzb(Class<?> cls) {
        return zzjf.class.isAssignableFrom(cls);
    }

    @Override // com.google.android.gms.internal.measurement.zzks
    public final zzkp zza(Class<?> cls) {
        if (!zzjf.class.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Unsupported message type: ".concat(cls.getName()));
        }
        try {
            return (zzkp) zzjf.e(cls.asSubclass(zzjf.class)).g(zzjf.zze.zzc);
        } catch (Exception e12) {
            throw new RuntimeException("Unable to get message info for ".concat(cls.getName()), e12);
        }
    }
}
