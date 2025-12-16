package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

/* compiled from: com.google.mlkit:barcode-scanning@@17.0.2 */
/* loaded from: classes6.dex */
public final class zzim extends zzec implements zzfm {
    private static final zzim zza;
    private int zze;
    private int zzf;
    private int zzg = 100;
    private int zzh;

    static {
        zzim zzimVar = new zzim();
        zza = zzimVar;
        zzec.k(zzim.class, zzimVar);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzec
    public final Object m(int i12, zzec zzecVar) {
        int i13 = i12 - 1;
        if (i13 == 0) {
            return (byte) 1;
        }
        if (i13 == 2) {
            return new zzfw(zza, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002င\u0001\u0003င\u0002", new Object[]{"zze", "zzf", zzik.f352567a, "zzg", "zzh"});
        }
        if (i13 == 3) {
            return new zzim();
        }
        zzhh zzhhVar = null;
        if (i13 == 4) {
            return new zzil(zzhhVar);
        }
        if (i13 != 5) {
            return null;
        }
        return zza;
    }
}
