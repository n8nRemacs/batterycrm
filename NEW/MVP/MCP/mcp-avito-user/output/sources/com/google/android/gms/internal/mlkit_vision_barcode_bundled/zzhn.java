package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

/* compiled from: com.google.mlkit:barcode-scanning@@17.0.2 */
/* loaded from: classes6.dex */
public final class zzhn extends zzec implements zzfm {
    private static final zzhn zza;
    private int zze;
    private int zzf = -1;

    static {
        zzhn zzhnVar = new zzhn();
        zza = zzhnVar;
        zzec.k(zzhn.class, zzhnVar);
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
            return new zzhn();
        }
        zzhh zzhhVar = null;
        if (i13 == 4) {
            return new zzhm(zzhhVar);
        }
        if (i13 != 5) {
            return null;
        }
        return zza;
    }
}
