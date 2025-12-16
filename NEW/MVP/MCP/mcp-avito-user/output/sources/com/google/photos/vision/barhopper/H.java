package com.google.photos.vision.barhopper;

import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzcb;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzcd;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzci;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzec;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzek;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzfm;

/* compiled from: com.google.mlkit:barcode-scanning@@17.0.2 */
/* loaded from: classes14.dex */
public final class H extends zzec implements zzfm {
    private static final H zza;
    private int zze;
    private zzcd zzf;
    private byte zzn = 2;
    private String zzg = "";
    private String zzh = "";
    private zzek zzi = zzec.h();
    private zzek zzj = zzec.h();
    private zzek zzk = zzec.h();
    private zzek zzl = zzec.h();
    private String zzm = "";

    static {
        H h12 = new H();
        zza = h12;
        zzec.k(H.class, h12);
    }

    public static H p() {
        return zza;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzec
    public final Object m(int i12, zzec zzecVar) {
        int i13 = i12 - 1;
        if (i13 == 0) {
            return Byte.valueOf(this.zzn);
        }
        if (i13 == 2) {
            return zzec.j(zza, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0004\u0001\u0001ဉ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004\u001b\u0005\u001b\u0006\u001a\u0007Л\bဈ\u0003", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", zzci.class, "zzj", O.class, "zzk", "zzl", zzcb.class, "zzm"});
        }
        if (i13 == 3) {
            return new H();
        }
        C37648b c37648b = null;
        if (i13 == 4) {
            return new G(c37648b);
        }
        if (i13 == 5) {
            return zza;
        }
        this.zzn = zzecVar == null ? (byte) 0 : (byte) 1;
        return null;
    }

    public final zzcd n() {
        zzcd zzcdVar = this.zzf;
        return zzcdVar == null ? zzcd.zzb() : zzcdVar;
    }

    public final zzek q() {
        return this.zzl;
    }

    public final zzek r() {
        return this.zzj;
    }

    public final zzek s() {
        return this.zzi;
    }

    public final zzek t() {
        return this.zzk;
    }

    public final String zzd() {
        return this.zzg;
    }

    public final String zze() {
        return this.zzh;
    }
}
