package com.google.photos.vision.barhopper;

import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzec;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzfm;

/* compiled from: com.google.mlkit:barcode-scanning@@17.0.2 */
/* renamed from: com.google.photos.vision.barhopper.l, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C37658l extends zzec implements zzfm {
    private static final C37658l zza;
    private int zze;
    private byte zzh = 2;
    private String zzf = "";
    private String zzg = "";

    static {
        C37658l c37658l = new C37658l();
        zza = c37658l;
        zzec.k(C37658l.class, c37658l);
    }

    public static C37658l o() {
        return zza;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzec
    public final Object m(int i12, zzec zzecVar) {
        int i13 = i12 - 1;
        if (i13 == 0) {
            return Byte.valueOf(this.zzh);
        }
        if (i13 == 2) {
            return zzec.j(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001ဈ\u0000\u0002ᔈ\u0001", new Object[]{"zze", "zzf", "zzg"});
        }
        if (i13 == 3) {
            return new C37658l();
        }
        C37648b c37648b = null;
        if (i13 == 4) {
            return new C37657k(c37648b);
        }
        if (i13 == 5) {
            return zza;
        }
        this.zzh = zzecVar == null ? (byte) 0 : (byte) 1;
        return null;
    }

    public final String zzc() {
        return this.zzf;
    }

    public final String zzd() {
        return this.zzg;
    }
}
