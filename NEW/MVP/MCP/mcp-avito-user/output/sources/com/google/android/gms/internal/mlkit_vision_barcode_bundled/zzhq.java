package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

/* compiled from: com.google.mlkit:barcode-scanning@@17.0.2 */
/* loaded from: classes6.dex */
public final class zzhq extends zzec implements zzfm {
    private static final zzhq zza;
    private int zze;
    private String zzf = "";
    private int zzg = 1;
    private boolean zzh;
    private int zzi;

    static {
        zzhq zzhqVar = new zzhq();
        zza = zzhqVar;
        zzec.k(zzhq.class, zzhqVar);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzec
    public final Object m(int i12, zzec zzecVar) {
        int i13 = i12 - 1;
        if (i13 == 0) {
            return (byte) 1;
        }
        if (i13 == 2) {
            return new zzfw(zza, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဌ\u0001\u0003ဇ\u0002\u0004င\u0003", new Object[]{"zze", "zzf", "zzg", zzhp.f352556a, "zzh", "zzi"});
        }
        if (i13 == 3) {
            return new zzhq();
        }
        zzhh zzhhVar = null;
        if (i13 == 4) {
            return new zzho(zzhhVar);
        }
        if (i13 != 5) {
            return null;
        }
        return zza;
    }
}
