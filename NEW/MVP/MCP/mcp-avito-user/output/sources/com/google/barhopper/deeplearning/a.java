package com.google.barhopper.deeplearning;

import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzec;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzfm;
import j.N;

/* compiled from: com.google.mlkit:barcode-scanning@@17.0.2 */
/* loaded from: classes6.dex */
public final class a extends zzec<a, l> implements zzfm {
    private static final a zza;
    private int zze;
    private j zzf;
    private o zzg;

    static {
        a aVar = new a();
        zza = aVar;
        zzec.k(a.class, aVar);
    }

    public static l n() {
        return (l) zza.c();
    }

    public static /* synthetic */ void p(a aVar, j jVar) {
        jVar.getClass();
        aVar.zzf = jVar;
        aVar.zze |= 1;
    }

    public static /* synthetic */ void q(a aVar, o oVar) {
        oVar.getClass();
        aVar.zzg = oVar;
        aVar.zze |= 2;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzec
    @N
    public final Object m(int i12, @N zzec zzecVar) {
        int i13 = i12 - 1;
        if (i13 == 0) {
            return (byte) 1;
        }
        if (i13 == 2) {
            return zzec.j(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"zze", "zzf", "zzg"});
        }
        if (i13 == 3) {
            return new a();
        }
        k kVar = null;
        if (i13 == 4) {
            return new l(kVar);
        }
        if (i13 != 5) {
            return null;
        }
        return zza;
    }
}
