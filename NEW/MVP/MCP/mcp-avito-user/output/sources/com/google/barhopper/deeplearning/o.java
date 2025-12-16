package com.google.barhopper.deeplearning;

import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdb;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzec;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzfm;

/* compiled from: com.google.mlkit:barcode-scanning@@17.0.2 */
/* loaded from: classes6.dex */
public final class o extends zzec implements zzfm {
    private static final o zza;
    private int zze;
    private String zzf = "";
    private zzdb zzg;
    private String zzh;
    private zzdb zzi;
    private float zzj;
    private float zzk;
    private float zzl;
    private float zzm;
    private int zzn;

    static {
        o oVar = new o();
        zza = oVar;
        zzec.k(o.class, oVar);
    }

    public o() {
        zzdb zzdbVar = zzdb.zzb;
        this.zzg = zzdbVar;
        this.zzh = "";
        this.zzi = zzdbVar;
        this.zzj = 0.25f;
        this.zzk = 0.25f;
        this.zzl = 0.5f;
        this.zzm = 0.85f;
        this.zzn = 1;
    }

    public static n n() {
        return (n) zza.c();
    }

    public static /* synthetic */ void p(o oVar, zzdb zzdbVar) {
        zzdbVar.getClass();
        oVar.zze |= 2;
        oVar.zzg = zzdbVar;
    }

    public static /* synthetic */ void q(o oVar, zzdb zzdbVar) {
        zzdbVar.getClass();
        oVar.zze |= 8;
        oVar.zzi = zzdbVar;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzec
    public final Object m(int i12, zzec zzecVar) {
        int i13 = i12 - 1;
        if (i13 == 0) {
            return (byte) 1;
        }
        if (i13 == 2) {
            return zzec.j(zza, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0000\u0000\u0001ဈ\u0000\u0002ည\u0001\u0003ဈ\u0002\u0004ည\u0003\u0005ခ\u0004\u0006ခ\u0005\u0007ခ\u0006\bခ\u0007\tင\b", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm", "zzn"});
        }
        if (i13 == 3) {
            return new o();
        }
        m mVar = null;
        if (i13 == 4) {
            return new n(mVar);
        }
        if (i13 != 5) {
            return null;
        }
        return zza;
    }
}
