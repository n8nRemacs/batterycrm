package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

/* compiled from: com.google.mlkit:barcode-scanning@@17.0.2 */
/* loaded from: classes6.dex */
final class zzgx extends zzgy {
    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzgy
    public final double zza(Object obj, long j12) {
        return Double.longBitsToDouble(zzk(obj, j12));
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzgy
    public final float zzb(Object obj, long j12) {
        return Float.intBitsToFloat(zzj(obj, j12));
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzgy
    public final void zzc(Object obj, long j12, boolean z12) {
        if (zzgz.f352549g) {
            zzgz.b(obj, j12, z12 ? (byte) 1 : (byte) 0);
        } else {
            zzgz.c(obj, j12, z12 ? (byte) 1 : (byte) 0);
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzgy
    public final void zzd(Object obj, long j12, byte b12) {
        if (zzgz.f352549g) {
            zzgz.b(obj, j12, b12);
        } else {
            zzgz.c(obj, j12, b12);
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzgy
    public final void zze(Object obj, long j12, double d12) {
        zzo(obj, j12, Double.doubleToLongBits(d12));
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzgy
    public final void zzf(Object obj, long j12, float f12) {
        zzn(obj, j12, Float.floatToIntBits(f12));
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzgy
    public final boolean zzg(Object obj, long j12) {
        return zzgz.f352549g ? zzgz.p(j12, obj) : zzgz.q(j12, obj);
    }
}
