package com.google.barhopper.deeplearning;

import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzec;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzek;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzfm;

/* compiled from: com.google.mlkit:barcode-scanning@@17.0.2 */
/* loaded from: classes6.dex */
public final class g extends zzec implements zzfm {
    private static final g zza;
    private zzek zze = zzec.h();

    static {
        g gVar = new g();
        zza = gVar;
        zzec.k(g.class, gVar);
    }

    public static f n() {
        return (f) zza.c();
    }

    public static void p(g gVar, d dVar) {
        dVar.getClass();
        zzek zzekVar = gVar.zze;
        if (!zzekVar.zzc()) {
            int size = zzekVar.size();
            gVar.zze = zzekVar.zzd(size == 0 ? 10 : size + size);
        }
        gVar.zze.add(dVar);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzec
    public final Object m(int i12, zzec zzecVar) {
        int i13 = i12 - 1;
        if (i13 == 0) {
            return (byte) 1;
        }
        if (i13 == 2) {
            return zzec.j(zza, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zze", d.class});
        }
        if (i13 == 3) {
            return new g();
        }
        e eVar = null;
        if (i13 == 4) {
            return new f(eVar);
        }
        if (i13 != 5) {
            return null;
        }
        return zza;
    }
}
