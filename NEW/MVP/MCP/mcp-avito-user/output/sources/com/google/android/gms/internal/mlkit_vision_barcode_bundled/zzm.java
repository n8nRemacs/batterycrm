package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

/* compiled from: com.google.mlkit:barcode-scanning@@17.0.2 */
/* loaded from: classes6.dex */
public final class zzm extends zzec implements zzfm {
    private static final zzm zza;
    private int zze;
    private zzek zzf = zzfv.zze();
    private String zzg = "";

    static {
        zzm zzmVar = new zzm();
        zza = zzmVar;
        zzec.k(zzm.class, zzmVar);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzec
    public final Object m(int i12, zzec zzecVar) {
        int i13 = i12 - 1;
        if (i13 == 0) {
            return (byte) 1;
        }
        if (i13 == 2) {
            return new zzfw(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001a\u0002ဈ\u0000", new Object[]{"zze", "zzf", "zzg"});
        }
        if (i13 == 3) {
            return new zzm();
        }
        zzk zzkVar = null;
        if (i13 == 4) {
            return new zzl(zzkVar);
        }
        if (i13 != 5) {
            return null;
        }
        return zza;
    }
}
