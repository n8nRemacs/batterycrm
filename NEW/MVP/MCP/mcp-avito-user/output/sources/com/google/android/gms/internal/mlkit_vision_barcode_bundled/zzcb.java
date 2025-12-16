package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import java.util.List;

/* compiled from: com.google.mlkit:barcode-scanning@@17.0.2 */
/* loaded from: classes6.dex */
public final class zzcb extends zzec implements zzfm {
    private static final zzcb zza;
    private int zze;
    private int zzf;
    private zzf zzh;
    private byte zzi = 2;
    private zzek zzg = zzfv.zze();

    static {
        zzcb zzcbVar = new zzcb();
        zza = zzcbVar;
        zzec.k(zzcb.class, zzcbVar);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzec
    public final Object m(int i12, zzec zzecVar) {
        int i13 = i12 - 1;
        if (i13 == 0) {
            return Byte.valueOf(this.zzi);
        }
        if (i13 == 2) {
            return new zzfw(zza, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0001\u0001ဌ\u0000\u0002\u001a\u0003ᐉ\u0001", new Object[]{"zze", "zzf", zzbz.f352392a, "zzg", "zzh"});
        }
        if (i13 == 3) {
            return new zzcb();
        }
        zzbw zzbwVar = null;
        if (i13 == 4) {
            return new zzbx(zzbwVar);
        }
        if (i13 == 5) {
            return zza;
        }
        this.zzi = zzecVar == null ? (byte) 0 : (byte) 1;
        return null;
    }

    public final List zzb() {
        return this.zzg;
    }

    public final int zzc() {
        int iZza = zzca.zza(this.zzf);
        if (iZza == 0) {
            return 1;
        }
        return iZza;
    }
}
