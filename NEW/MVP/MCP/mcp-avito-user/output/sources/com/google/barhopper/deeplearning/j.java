package com.google.barhopper.deeplearning;

import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdb;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzec;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzeh;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzfm;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzhj;

/* compiled from: com.google.mlkit:barcode-scanning@@17.0.2 */
/* loaded from: classes6.dex */
public final class j extends zzec implements zzfm {
    private static final j zza;
    private int zze;
    private g zzk;
    private zzhj zzn;
    private String zzf = "";
    private zzdb zzg = zzdb.zzb;
    private int zzh = 10;
    private float zzi = 0.5f;
    private float zzj = 0.05f;
    private zzeh zzl = zzec.f();
    private int zzm = 1;
    private int zzo = 320;
    private int zzp = 4;
    private int zzq = 2;

    static {
        j jVar = new j();
        zza = jVar;
        zzec.k(j.class, jVar);
    }

    public static i n() {
        return (i) zza.c();
    }

    public static /* synthetic */ void p(j jVar, g gVar) {
        gVar.getClass();
        jVar.zzk = gVar;
        jVar.zze |= 32;
    }

    public static /* synthetic */ void q(j jVar, zzdb zzdbVar) {
        zzdbVar.getClass();
        jVar.zze |= 2;
        jVar.zzg = zzdbVar;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzec
    public final Object m(int i12, zzec zzecVar) {
        int i13 = i12 - 1;
        if (i13 == 0) {
            return (byte) 1;
        }
        if (i13 == 2) {
            return zzec.j(zza, "\u0001\f\u0000\u0001\u0001\f\f\u0000\u0001\u0000\u0001ဈ\u0000\u0002ည\u0001\u0003ဋ\u0002\u0004ခ\u0003\u0005ခ\u0004\u0006ဉ\u0005\u0007\u0013\bင\u0006\tဉ\u0007\nင\b\u000bင\t\fင\n", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm", "zzn", "zzo", "zzp", "zzq"});
        }
        if (i13 == 3) {
            return new j();
        }
        h hVar = null;
        if (i13 == 4) {
            return new i(hVar);
        }
        if (i13 != 5) {
            return null;
        }
        return zza;
    }
}
