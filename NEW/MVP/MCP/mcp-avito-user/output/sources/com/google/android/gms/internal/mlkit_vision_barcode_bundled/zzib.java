package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

/* compiled from: com.google.mlkit:barcode-scanning@@17.0.2 */
/* loaded from: classes6.dex */
public final class zzib extends zzec implements zzfm {
    private static final zzib zza;
    private int zze;
    private int zzf;
    private zzhu zzi;
    private int zzk;
    private int zzl;
    private zzek zzg = zzfv.zze();
    private int zzh = -1;
    private String zzj = "";

    static {
        zzib zzibVar = new zzib();
        zza = zzibVar;
        zzec.k(zzib.class, zzibVar);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzec
    public final Object m(int i12, zzec zzecVar) {
        int i13 = i12 - 1;
        if (i13 == 0) {
            return (byte) 1;
        }
        if (i13 == 2) {
            return new zzfw(zza, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0001\u0000\u0001ဌ\u0000\u0002\u001b\u0003င\u0001\u0004ဉ\u0002\u0005ဈ\u0003\u0006ဌ\u0004\u0007ဌ\u0005", new Object[]{"zze", "zzf", zzhx.f352559a, "zzg", zzhw.class, "zzh", "zzi", "zzj", "zzk", zzhz.f352560a, "zzl", zzia.f352562a});
        }
        if (i13 == 3) {
            return new zzib();
        }
        zzhh zzhhVar = null;
        if (i13 == 4) {
            return new zzhy(zzhhVar);
        }
        if (i13 != 5) {
            return null;
        }
        return zza;
    }
}
