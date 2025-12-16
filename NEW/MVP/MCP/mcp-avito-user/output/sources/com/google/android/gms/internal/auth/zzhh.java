package com.google.android.gms.internal.auth;

import sun.misc.Unsafe;

/* compiled from: com.google.android.gms:play-services-auth-base@@18.0.10 */
/* loaded from: classes6.dex */
final class zzhh extends zzhi {
    public zzhh(Unsafe unsafe) {
        super(unsafe);
    }

    @Override // com.google.android.gms.internal.auth.zzhi
    public final double zza(Object obj, long j12) {
        return Double.longBitsToDouble(this.f350174a.getLong(obj, j12));
    }

    @Override // com.google.android.gms.internal.auth.zzhi
    public final float zzb(Object obj, long j12) {
        return Float.intBitsToFloat(this.f350174a.getInt(obj, j12));
    }

    @Override // com.google.android.gms.internal.auth.zzhi
    public final void zzc(Object obj, long j12, boolean z12) {
        if (zzhj.f350180f) {
            zzhj.f(obj, j12, z12);
        } else {
            zzhj.g(obj, j12, z12);
        }
    }

    @Override // com.google.android.gms.internal.auth.zzhi
    public final void zzd(Object obj, long j12, double d12) {
        this.f350174a.putLong(obj, j12, Double.doubleToLongBits(d12));
    }

    @Override // com.google.android.gms.internal.auth.zzhi
    public final void zze(Object obj, long j12, float f12) {
        this.f350174a.putInt(obj, j12, Float.floatToIntBits(f12));
    }

    @Override // com.google.android.gms.internal.auth.zzhi
    public final boolean zzf(Object obj, long j12) {
        return zzhj.f350180f ? zzhj.n(j12, obj) : zzhj.o(j12, obj);
    }
}
