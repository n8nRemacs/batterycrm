package com.google.photos.vision.barhopper;

import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzec;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzfm;

/* compiled from: com.google.mlkit:barcode-scanning@@17.0.2 */
/* loaded from: classes14.dex */
public final class J extends zzec implements zzfm {
    private static final J zza;
    private int zze;
    private String zzf = "";
    private String zzg = "";
    private String zzh = "";
    private String zzi = "";
    private String zzj = "";
    private String zzk = "";
    private String zzl = "";
    private String zzm = "";
    private String zzn = "";
    private String zzo = "";
    private String zzp = "";
    private String zzq = "";
    private String zzr = "";
    private String zzs = "";

    static {
        J j12 = new J();
        zza = j12;
        zzec.k(J.class, j12);
    }

    public static J o() {
        return zza;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzec
    public final Object m(int i12, zzec zzecVar) {
        int i13 = i12 - 1;
        if (i13 == 0) {
            return (byte) 1;
        }
        if (i13 == 2) {
            return zzec.j(zza, "\u0001\u000e\u0000\u0001\u0001\u000e\u000e\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဈ\u0005\u0007ဈ\u0006\bဈ\u0007\tဈ\b\nဈ\t\u000bဈ\n\fဈ\u000b\rဈ\f\u000eဈ\r", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm", "zzn", "zzo", "zzp", "zzq", "zzr", "zzs"});
        }
        if (i13 == 3) {
            return new J();
        }
        C37648b c37648b = null;
        if (i13 == 4) {
            return new I(c37648b);
        }
        if (i13 != 5) {
            return null;
        }
        return zza;
    }

    public final String p() {
        return this.zzg;
    }

    public final String q() {
        return this.zzj;
    }

    public final String r() {
        return this.zzp;
    }

    public final String s() {
        return this.zzs;
    }

    public final String t() {
        return this.zzi;
    }

    public final String u() {
        return this.zzo;
    }

    public final String v() {
        return this.zzh;
    }

    public final String zzc() {
        return this.zzl;
    }

    public final String zzd() {
        return this.zzm;
    }

    public final String zze() {
        return this.zzk;
    }

    public final String zzf() {
        return this.zzn;
    }

    public final String zzh() {
        return this.zzr;
    }

    public final String zzi() {
        return this.zzf;
    }

    public final String zzj() {
        return this.zzq;
    }
}
