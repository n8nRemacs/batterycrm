package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

/* compiled from: com.google.mlkit:barcode-scanning@@17.0.2 */
/* loaded from: classes6.dex */
public final class zzie extends zzec implements zzfm {
    private static final zzie zza;
    private int zze;
    private boolean zzf;
    private boolean zzg;

    static {
        zzie zzieVar = new zzie();
        zza = zzieVar;
        zzec.k(zzie.class, zzieVar);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzec
    public final Object m(int i12, zzec zzecVar) {
        int i13 = i12 - 1;
        if (i13 == 0) {
            return (byte) 1;
        }
        if (i13 == 2) {
            return new zzfw(zza, "\u0001\u0002\u0000\u0001\u0005\u0006\u0002\u0000\u0000\u0000\u0005ဇ\u0000\u0006ဇ\u0001", new Object[]{"zze", "zzf", "zzg"});
        }
        if (i13 == 3) {
            return new zzie();
        }
        zzhh zzhhVar = null;
        if (i13 == 4) {
            return new zzid(zzhhVar);
        }
        if (i13 != 5) {
            return null;
        }
        return zza;
    }
}
