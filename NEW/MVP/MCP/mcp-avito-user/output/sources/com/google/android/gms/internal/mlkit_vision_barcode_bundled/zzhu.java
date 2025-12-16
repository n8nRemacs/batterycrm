package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

/* compiled from: com.google.mlkit:barcode-scanning@@17.0.2 */
/* loaded from: classes6.dex */
public final class zzhu extends zzec implements zzfm {
    private static final zzhu zza;
    private int zze;
    private int zzf;
    private int zzg;
    private zzek zzh = zzfv.zze();
    private int zzi;

    static {
        zzhu zzhuVar = new zzhu();
        zza = zzhuVar;
        zzec.k(zzhu.class, zzhuVar);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzec
    public final Object m(int i12, zzec zzecVar) {
        int i13 = i12 - 1;
        if (i13 == 0) {
            return (byte) 1;
        }
        if (i13 == 2) {
            return new zzfw(zza, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001ဌ\u0000\u0002င\u0001\u0003\u001a\u0004င\u0002", new Object[]{"zze", "zzf", zzht.f352558a, "zzg", "zzh", "zzi"});
        }
        if (i13 == 3) {
            return new zzhu();
        }
        zzhh zzhhVar = null;
        if (i13 == 4) {
            return new zzhs(zzhhVar);
        }
        if (i13 != 5) {
            return null;
        }
        return zza;
    }
}
