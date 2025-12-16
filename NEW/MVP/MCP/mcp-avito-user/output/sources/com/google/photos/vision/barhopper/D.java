package com.google.photos.vision.barhopper;

import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzec;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzfm;

/* compiled from: com.google.mlkit:barcode-scanning@@17.0.2 */
/* loaded from: classes14.dex */
public final class D extends zzec implements zzfm {
    private static final D zza;
    private int zze;
    private int zzf;
    private int zzg;
    private int zzh;
    private int zzi;
    private int zzj;
    private int zzk;
    private boolean zzl;

    static {
        D d12 = new D();
        zza = d12;
        zzec.k(D.class, d12);
    }

    public static D s() {
        return zza;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzec
    public final Object m(int i12, zzec zzecVar) {
        int i13 = i12 - 1;
        if (i13 == 0) {
            return (byte) 1;
        }
        if (i13 == 2) {
            return zzec.j(zza, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003င\u0002\u0004င\u0003\u0005င\u0004\u0006င\u0005\u0007ဇ\u0006", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl"});
        }
        if (i13 == 3) {
            return new D();
        }
        C37648b c37648b = null;
        if (i13 == 4) {
            return new C(c37648b);
        }
        if (i13 != 5) {
            return null;
        }
        return zza;
    }

    public final int n() {
        return this.zzh;
    }

    public final int o() {
        return this.zzi;
    }

    public final int p() {
        return this.zzk;
    }

    public final int q() {
        return this.zzf;
    }

    public final boolean t() {
        return this.zzl;
    }

    public final int zzc() {
        return this.zzj;
    }

    public final int zzd() {
        return this.zzg;
    }
}
