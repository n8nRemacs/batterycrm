package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

/* compiled from: com.google.mlkit:barcode-scanning@@17.0.2 */
/* loaded from: classes6.dex */
public final class zzhj extends zzec implements zzfm {
    private static final zzhj zza;
    private int zze;
    private int zzf;
    private zzjc zzg;
    private zziq zzh;
    private zzis zzi;

    static {
        zzhj zzhjVar = new zzhj();
        zza = zzhjVar;
        zzec.k(zzhj.class, zzhjVar);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzec
    public final Object m(int i12, zzec zzecVar) {
        int i13 = i12 - 1;
        if (i13 == 0) {
            return (byte) 1;
        }
        if (i13 == 2) {
            return new zzfw(zza, "\u0001\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0005ဉ\u0003", new Object[]{"zze", "zzf", zzic.f352563a, "zzg", "zzh", "zzi"});
        }
        if (i13 == 3) {
            return new zzhj();
        }
        zzhh zzhhVar = null;
        if (i13 == 4) {
            return new zzhi(zzhhVar);
        }
        if (i13 != 5) {
            return null;
        }
        return zza;
    }
}
