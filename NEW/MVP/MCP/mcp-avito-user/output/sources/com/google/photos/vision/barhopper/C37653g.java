package com.google.photos.vision.barhopper;

import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzec;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzfm;

/* compiled from: com.google.mlkit:barcode-scanning@@17.0.2 */
/* renamed from: com.google.photos.vision.barhopper.g, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C37653g extends zzec implements zzfm {
    private static final C37653g zza;
    private int zze;
    private int zzf;
    private int zzg;
    private byte zzh = 2;

    static {
        C37653g c37653g = new C37653g();
        zza = c37653g;
        zzec.k(C37653g.class, c37653g);
    }

    public static C37652f p() {
        return (C37652f) zza.c();
    }

    public static /* synthetic */ void r(C37653g c37653g, int i12) {
        c37653g.zze |= 1;
        c37653g.zzf = i12;
    }

    public static /* synthetic */ void s(C37653g c37653g, int i12) {
        c37653g.zze |= 2;
        c37653g.zzg = i12;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzec
    public final Object m(int i12, zzec zzecVar) {
        int i13 = i12 - 1;
        if (i13 == 0) {
            return Byte.valueOf(this.zzh);
        }
        if (i13 == 2) {
            return zzec.j(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0002\u0001ᔄ\u0000\u0002ᔄ\u0001", new Object[]{"zze", "zzf", "zzg"});
        }
        if (i13 == 3) {
            return new C37653g();
        }
        C37648b c37648b = null;
        if (i13 == 4) {
            return new C37652f(c37648b);
        }
        if (i13 == 5) {
            return zza;
        }
        this.zzh = zzecVar == null ? (byte) 0 : (byte) 1;
        return null;
    }

    public final int n() {
        return this.zzf;
    }

    public final int o() {
        return this.zzg;
    }
}
