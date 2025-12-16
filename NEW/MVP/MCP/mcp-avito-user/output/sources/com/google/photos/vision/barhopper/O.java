package com.google.photos.vision.barhopper;

import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzec;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzfm;

/* compiled from: com.google.mlkit:barcode-scanning@@17.0.2 */
/* loaded from: classes14.dex */
public final class O extends zzec implements zzfm {
    private static final O zza;
    private int zze;
    private int zzf;
    private String zzg = "";
    private String zzh = "";
    private String zzi = "";

    static {
        O o12 = new O();
        zza = o12;
        zzec.k(O.class, o12);
    }

    public static O o() {
        return zza;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzec
    public final Object m(int i12, zzec zzecVar) {
        int i13 = i12 - 1;
        if (i13 == 0) {
            return (byte) 1;
        }
        if (i13 == 2) {
            return zzec.j(zza, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003", new Object[]{"zze", "zzf", M.f362584a, "zzg", "zzh", "zzi"});
        }
        if (i13 == 3) {
            return new O();
        }
        C37648b c37648b = null;
        if (i13 == 4) {
            return new K(c37648b);
        }
        if (i13 != 5) {
            return null;
        }
        return zza;
    }

    public final int p() {
        int i12;
        int i13 = this.zzf;
        int i14 = N.f362585a;
        if (i13 != 0) {
            i12 = 2;
            if (i13 != 1) {
                i12 = i13 != 2 ? 0 : 3;
            }
        } else {
            i12 = 1;
        }
        if (i12 == 0) {
            return 1;
        }
        return i12;
    }

    public final String zzc() {
        return this.zzg;
    }

    public final String zzd() {
        return this.zzi;
    }

    public final String zze() {
        return this.zzh;
    }
}
