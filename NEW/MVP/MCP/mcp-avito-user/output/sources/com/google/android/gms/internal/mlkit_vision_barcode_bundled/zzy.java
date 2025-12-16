package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

/* compiled from: com.google.mlkit:barcode-scanning@@17.0.2 */
/* loaded from: classes6.dex */
public final class zzy extends zzec implements zzfm {
    private static final zzy zza;
    private int zze;
    private zzab zzf;

    static {
        zzy zzyVar = new zzy();
        zza = zzyVar;
        zzec.k(zzy.class, zzyVar);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzec
    public final Object m(int i12, zzec zzecVar) {
        int i13 = i12 - 1;
        if (i13 == 0) {
            return (byte) 1;
        }
        if (i13 == 2) {
            return new zzfw(zza, "\u0001\u0001\u0000\u0001\u000f\u000f\u0001\u0000\u0000\u0000\u000fဉ\u0000", new Object[]{"zze", "zzf"});
        }
        if (i13 == 3) {
            return new zzy();
        }
        zzw zzwVar = null;
        if (i13 == 4) {
            return new zzx(zzwVar);
        }
        if (i13 != 5) {
            return null;
        }
        return zza;
    }
}
