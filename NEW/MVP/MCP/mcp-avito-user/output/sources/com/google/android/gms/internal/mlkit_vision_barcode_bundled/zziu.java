package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

/* compiled from: com.google.mlkit:barcode-scanning@@17.0.2 */
/* loaded from: classes6.dex */
public final class zziu extends zzec implements zzfm {
    private static final zziu zza;
    private int zze;
    private String zzf = "";
    private long zzg;
    private long zzh;
    private long zzi;

    static {
        zziu zziuVar = new zziu();
        zza = zziuVar;
        zzec.k(zziu.class, zziuVar);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzec
    public final Object m(int i12, zzec zzecVar) {
        int i13 = i12 - 1;
        if (i13 == 0) {
            return (byte) 1;
        }
        if (i13 == 2) {
            return new zzfw(zza, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဂ\u0001\u0003ဂ\u0002\u0004ဂ\u0003", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi"});
        }
        if (i13 == 3) {
            return new zziu();
        }
        zzhh zzhhVar = null;
        if (i13 == 4) {
            return new zzit(zzhhVar);
        }
        if (i13 != 5) {
            return null;
        }
        return zza;
    }
}
