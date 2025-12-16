package com.google.barhopper.deeplearning;

import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzec;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzeh;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzfm;

/* compiled from: com.google.mlkit:barcode-scanning@@17.0.2 */
/* loaded from: classes6.dex */
public final class d extends zzec implements zzfm {
    private static final d zza;
    private int zze;
    private zzeh zzf = zzec.f();
    private zzeh zzg = zzec.f();
    private int zzh;
    private int zzi;
    private int zzj;
    private int zzk;

    static {
        d dVar = new d();
        zza = dVar;
        zzec.k(d.class, dVar);
    }

    public static c n() {
        return (c) zza.c();
    }

    public static /* synthetic */ void p(d dVar, int i12) {
        dVar.zze |= 2;
        dVar.zzi = i12;
    }

    public static void q(d dVar, float f12) {
        zzeh zzehVar = dVar.zzf;
        if (!zzehVar.zzc()) {
            int size = zzehVar.size();
            dVar.zzf = zzehVar.zzd(size == 0 ? 10 : size + size);
        }
        dVar.zzf.zzg(f12);
    }

    public static void r(d dVar, float f12) {
        zzeh zzehVar = dVar.zzg;
        if (!zzehVar.zzc()) {
            int size = zzehVar.size();
            dVar.zzg = zzehVar.zzd(size == 0 ? 10 : size + size);
        }
        dVar.zzg.zzg(f12);
    }

    public static /* synthetic */ void s(d dVar, int i12) {
        dVar.zze |= 1;
        dVar.zzh = i12;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzec
    public final Object m(int i12, zzec zzecVar) {
        int i13 = i12 - 1;
        if (i13 == 0) {
            return (byte) 1;
        }
        if (i13 == 2) {
            return zzec.j(zza, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0002\u0000\u0001\u0013\u0002\u0013\u0003ဋ\u0000\u0004ဋ\u0001\u0005ဋ\u0002\u0006ဋ\u0003", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk"});
        }
        if (i13 == 3) {
            return new d();
        }
        b bVar = null;
        if (i13 == 4) {
            return new c(bVar);
        }
        if (i13 != 5) {
            return null;
        }
        return zza;
    }
}
