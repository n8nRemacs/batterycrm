package com.google.photos.vision.barhopper;

import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzec;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzfm;

/* compiled from: com.google.mlkit:barcode-scanning@@17.0.2 */
/* loaded from: classes14.dex */
public final class q extends zzec implements zzfm {
    private static final q zza;
    private int zze;
    private int zzg;
    private boolean zzi;
    private byte zzj = 2;
    private String zzf = "";
    private String zzh = "";

    static {
        q qVar = new q();
        zza = qVar;
        zzec.k(q.class, qVar);
    }

    public static q o() {
        return zza;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzec
    public final Object m(int i12, zzec zzecVar) {
        int i13 = i12 - 1;
        if (i13 == 0) {
            return Byte.valueOf(this.zzj);
        }
        if (i13 == 2) {
            return zzec.j(zza, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0001\u0001ᔈ\u0000\u0002ဌ\u0001\u0003ဈ\u0002\u0004ဇ\u0003", new Object[]{"zze", "zzf", "zzg", C37661o.f362588a, "zzh", "zzi"});
        }
        if (i13 == 3) {
            return new q();
        }
        C37648b c37648b = null;
        if (i13 == 4) {
            return new C37659m(c37648b);
        }
        if (i13 == 5) {
            return zza;
        }
        this.zzj = zzecVar == null ? (byte) 0 : (byte) 1;
        return null;
    }

    public final int p() {
        int i12;
        int i13 = this.zzg;
        int i14 = C37662p.f362589a;
        if (i13 != 0) {
            i12 = 2;
            if (i13 != 1) {
                i12 = i13 != 2 ? i13 != 3 ? 0 : 4 : 3;
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
        return this.zzh;
    }

    public final String zzd() {
        return this.zzf;
    }
}
