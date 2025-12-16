package com.google.android.gms.internal.mlkit_vision_face_bundled;

import sun.misc.Unsafe;

/* compiled from: com.google.mlkit:face-detection@@16.1.6 */
/* loaded from: classes6.dex */
final class zzyd extends zzyf {
    public zzyd(Unsafe unsafe) {
        super(unsafe);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.zzyf
    public final double zza(Object obj, long j12) {
        return Double.longBitsToDouble(this.f354146a.getLong(obj, j12));
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.zzyf
    public final float zzb(Object obj, long j12) {
        return Float.intBitsToFloat(this.f354146a.getInt(obj, j12));
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.zzyf
    public final void zzc(Object obj, long j12, boolean z12) {
        if (zzyg.f354153g) {
            zzyg.b(obj, j12, z12 ? (byte) 1 : (byte) 0);
        } else {
            zzyg.c(obj, j12, z12 ? (byte) 1 : (byte) 0);
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.zzyf
    public final void zzd(Object obj, long j12, byte b12) {
        if (zzyg.f354153g) {
            zzyg.b(obj, j12, b12);
        } else {
            zzyg.c(obj, j12, b12);
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.zzyf
    public final void zze(Object obj, long j12, double d12) {
        this.f354146a.putLong(obj, j12, Double.doubleToLongBits(d12));
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.zzyf
    public final void zzf(Object obj, long j12, float f12) {
        this.f354146a.putInt(obj, j12, Float.floatToIntBits(f12));
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.zzyf
    public final boolean zzg(Object obj, long j12) {
        return zzyg.f354153g ? zzyg.q(j12, obj) : zzyg.r(j12, obj);
    }
}
