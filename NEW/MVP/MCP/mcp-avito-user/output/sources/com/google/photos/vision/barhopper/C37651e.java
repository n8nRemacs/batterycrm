package com.google.photos.vision.barhopper;

import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzec;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzfm;

/* compiled from: com.google.mlkit:barcode-scanning@@17.0.2 */
/* renamed from: com.google.photos.vision.barhopper.e, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C37651e extends zzec implements zzfm {
    private static final C37651e zza;
    private int zze;
    private double zzf;
    private double zzg;
    private byte zzh = 2;

    static {
        C37651e c37651e = new C37651e();
        zza = c37651e;
        zzec.k(C37651e.class, c37651e);
    }

    public static C37651e q() {
        return zza;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzec
    public final Object m(int i12, zzec zzecVar) {
        int i13 = i12 - 1;
        if (i13 == 0) {
            return Byte.valueOf(this.zzh);
        }
        if (i13 == 2) {
            return zzec.j(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0002\u0001ᔀ\u0000\u0002ᔀ\u0001", new Object[]{"zze", "zzf", "zzg"});
        }
        if (i13 == 3) {
            return new C37651e();
        }
        C37648b c37648b = null;
        if (i13 == 4) {
            return new C37650d(c37648b);
        }
        if (i13 == 5) {
            return zza;
        }
        this.zzh = zzecVar == null ? (byte) 0 : (byte) 1;
        return null;
    }

    public final double n() {
        return this.zzf;
    }

    public final double o() {
        return this.zzg;
    }
}
