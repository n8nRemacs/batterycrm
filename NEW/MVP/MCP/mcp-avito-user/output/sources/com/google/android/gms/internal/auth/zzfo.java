package com.google.android.gms.internal.auth;

/* compiled from: com.google.android.gms:play-services-auth-base@@18.0.10 */
/* loaded from: classes6.dex */
final class zzfo implements zzfv {

    /* renamed from: a, reason: collision with root package name */
    public final zzfv[] f350114a;

    public zzfo(zzfv... zzfvVarArr) {
        this.f350114a = zzfvVarArr;
    }

    @Override // com.google.android.gms.internal.auth.zzfv
    public final zzfu zzb(Class cls) {
        for (int i12 = 0; i12 < 2; i12++) {
            zzfv zzfvVar = this.f350114a[i12];
            if (zzfvVar.zzc(cls)) {
                return zzfvVar.zzb(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
    }

    @Override // com.google.android.gms.internal.auth.zzfv
    public final boolean zzc(Class cls) {
        for (int i12 = 0; i12 < 2; i12++) {
            if (this.f350114a[i12].zzc(cls)) {
                return true;
            }
        }
        return false;
    }
}
