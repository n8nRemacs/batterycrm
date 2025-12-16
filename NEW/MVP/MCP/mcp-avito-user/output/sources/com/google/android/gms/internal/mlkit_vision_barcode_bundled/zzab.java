package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

/* compiled from: com.google.mlkit:barcode-scanning@@17.0.2 */
/* loaded from: classes6.dex */
public final class zzab extends zzec implements zzfm {
    private static final zzab zza;
    private int zze;
    private zzae zzf;
    private boolean zzg;

    static {
        zzab zzabVar = new zzab();
        zza = zzabVar;
        zzec.k(zzab.class, zzabVar);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzec
    public final Object m(int i12, zzec zzecVar) {
        int i13 = i12 - 1;
        if (i13 == 0) {
            return (byte) 1;
        }
        if (i13 == 2) {
            return new zzfw(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဇ\u0001", new Object[]{"zze", "zzf", "zzg"});
        }
        if (i13 == 3) {
            return new zzab();
        }
        zzz zzzVar = null;
        if (i13 == 4) {
            return new zzaa(zzzVar);
        }
        if (i13 != 5) {
            return null;
        }
        return zza;
    }
}
