package com.google.android.gms.internal.mlkit_vision_face_bundled;

/* compiled from: com.google.mlkit:face-detection@@16.1.6 */
/* loaded from: classes6.dex */
public final class zzz extends zzvn implements zzwt {
    private static final zzz zzb;
    private int zzd;
    private float zze;
    private float zzf;
    private float zzg;

    static {
        zzz zzzVar = new zzz();
        zzb = zzzVar;
        zzvn.d(zzz.class, zzzVar);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.zzvn
    public final Object h(int i12, zzvn zzvnVar) {
        int i13 = i12 - 1;
        if (i13 == 0) {
            return (byte) 1;
        }
        if (i13 == 2) {
            return new zzxd(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ခ\u0000\u0002ခ\u0001\u0003ခ\u0002", new Object[]{"zzd", "zze", "zzf", "zzg"});
        }
        if (i13 == 3) {
            return new zzz();
        }
        zzr zzrVar = null;
        if (i13 == 4) {
            return new zzy(zzrVar);
        }
        if (i13 != 5) {
            return null;
        }
        return zzb;
    }

    public final float zza() {
        return this.zze;
    }

    public final float zzb() {
        return this.zzf;
    }
}
