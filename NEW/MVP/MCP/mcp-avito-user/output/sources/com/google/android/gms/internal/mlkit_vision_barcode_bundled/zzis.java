package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

/* compiled from: com.google.mlkit:barcode-scanning@@17.0.2 */
/* loaded from: classes6.dex */
public final class zzis extends zzec implements zzfm {
    private static final zzis zza;
    private int zze;
    private zzek zzf = zzfv.zze();
    private zziu zzg;
    private zzhl zzh;

    static {
        zzis zzisVar = new zzis();
        zza = zzisVar;
        zzec.k(zzis.class, zzisVar);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzec
    public final Object m(int i12, zzec zzecVar) {
        int i13 = i12 - 1;
        if (i13 == 0) {
            return (byte) 1;
        }
        if (i13 == 2) {
            return new zzfw(zza, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u001b\u0002ဉ\u0000\u0003ဉ\u0001", new Object[]{"zze", "zzf", zzjc.class, "zzg", "zzh"});
        }
        if (i13 == 3) {
            return new zzis();
        }
        zzhh zzhhVar = null;
        if (i13 == 4) {
            return new zzir(zzhhVar);
        }
        if (i13 != 5) {
            return null;
        }
        return zza;
    }
}
