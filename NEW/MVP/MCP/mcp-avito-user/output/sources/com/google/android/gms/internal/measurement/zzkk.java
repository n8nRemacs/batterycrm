package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-base@@21.5.1 */
/* loaded from: classes6.dex */
final class zzkk implements zzks {

    /* renamed from: a, reason: collision with root package name */
    public zzks[] f350918a;

    @Override // com.google.android.gms.internal.measurement.zzks
    public final zzkp zza(Class<?> cls) {
        for (zzks zzksVar : this.f350918a) {
            if (zzksVar.zzb(cls)) {
                return zzksVar.zza(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
    }

    @Override // com.google.android.gms.internal.measurement.zzks
    public final boolean zzb(Class<?> cls) {
        for (zzks zzksVar : this.f350918a) {
            if (zzksVar.zzb(cls)) {
                return true;
            }
        }
        return false;
    }
}
