package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

/* compiled from: com.google.mlkit:barcode-scanning@@17.0.2 */
/* loaded from: classes6.dex */
public final class zzje extends zzec implements zzfm {
    private static final zzje zza;
    private int zze;
    private int zzf;

    static {
        zzje zzjeVar = new zzje();
        zza = zzjeVar;
        zzec.k(zzje.class, zzjeVar);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzec
    public final Object m(int i12, zzec zzecVar) {
        int i13 = i12 - 1;
        if (i13 == 0) {
            return (byte) 1;
        }
        if (i13 == 2) {
            return new zzfw(zza, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001င\u0000", new Object[]{"zze", "zzf"});
        }
        if (i13 == 3) {
            return new zzje();
        }
        zzhh zzhhVar = null;
        if (i13 == 4) {
            return new zzjd(zzhhVar);
        }
        if (i13 != 5) {
            return null;
        }
        return zza;
    }
}
