package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

/* compiled from: com.google.mlkit:barcode-scanning@@17.0.2 */
/* loaded from: classes6.dex */
public final class zzv extends zzec implements zzfm {
    public static final zzea zza;
    private static final zzv zze;
    private int zzf;
    private long zzg;
    private long zzh;
    private zzjh zzi;
    private byte zzj = 2;

    static {
        zzv zzvVar = new zzv();
        zze = zzvVar;
        zzec.k(zzv.class, zzvVar);
        zza = zzec.zzH(zzjh.zzf(), zzvVar, zzvVar, null, 13258261, zzhf.zzk, zzv.class);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzec
    public final Object m(int i12, zzec zzecVar) {
        int i13 = i12 - 1;
        if (i13 == 0) {
            return Byte.valueOf(this.zzj);
        }
        if (i13 == 2) {
            return new zzfw(zze, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0003\u0001ᔅ\u0000\u0002ᔅ\u0001\u0003ᐉ\u0002", new Object[]{"zzf", "zzg", "zzh", "zzi"});
        }
        if (i13 == 3) {
            return new zzv();
        }
        zzt zztVar = null;
        if (i13 == 4) {
            return new zzu(zztVar);
        }
        if (i13 == 5) {
            return zze;
        }
        this.zzj = zzecVar == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
