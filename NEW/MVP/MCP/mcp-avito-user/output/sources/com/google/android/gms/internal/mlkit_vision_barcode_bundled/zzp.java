package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

/* compiled from: com.google.mlkit:barcode-scanning@@17.0.2 */
/* loaded from: classes6.dex */
public final class zzp extends zzec implements zzfm {
    private static final zzp zza;
    private int zze;
    private zzjh zzk;
    private byte zzl = 2;
    private zzei zzf = zzed.zzf();
    private zzeh zzg = zzdu.zze();
    private boolean zzh = true;
    private String zzi = "";
    private String zzj = "";

    static {
        zzp zzpVar = new zzp();
        zza = zzpVar;
        zzec.k(zzp.class, zzpVar);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzec
    public final Object m(int i12, zzec zzecVar) {
        int i13 = i12 - 1;
        if (i13 == 0) {
            return Byte.valueOf(this.zzl);
        }
        if (i13 == 2) {
            return new zzfw(zza, "\u0001\u0006\u0000\u0001\u0001\u000f\u0006\u0000\u0002\u0001\u0001\u0016\u0002\u0013\u0003ဇ\u0000\u0004ဈ\u0001\u0005ဈ\u0002\u000fᐉ\u0003", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk"});
        }
        if (i13 == 3) {
            return new zzp();
        }
        zzn zznVar = null;
        if (i13 == 4) {
            return new zzo(zznVar);
        }
        if (i13 == 5) {
            return zza;
        }
        this.zzl = zzecVar == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
