package com.google.photos.vision.barhopper;

import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzec;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzek;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzfm;

/* compiled from: com.google.mlkit:barcode-scanning@@17.0.2 */
/* loaded from: classes14.dex */
public final class B extends zzec implements zzfm {
    private static final B zza;
    private int zze;
    private String zzf = "";
    private zzek zzg = zzec.h();

    static {
        B b12 = new B();
        zza = b12;
        zzec.k(B.class, b12);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzec
    public final Object m(int i12, zzec zzecVar) {
        int i13 = i12 - 1;
        if (i13 == 0) {
            return (byte) 1;
        }
        if (i13 == 2) {
            return zzec.j(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b", new Object[]{"zze", "zzf", "zzg", C37649c.class});
        }
        if (i13 == 3) {
            return new B();
        }
        C37648b c37648b = null;
        if (i13 == 4) {
            return new A(c37648b);
        }
        if (i13 != 5) {
            return null;
        }
        return zza;
    }
}
