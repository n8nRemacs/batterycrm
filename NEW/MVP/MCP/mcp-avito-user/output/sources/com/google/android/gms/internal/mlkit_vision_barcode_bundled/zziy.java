package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

/* compiled from: com.google.mlkit:barcode-scanning@@17.0.2 */
/* loaded from: classes6.dex */
public final class zziy extends zzec implements zzfm {
    private static final zziy zza;
    private int zze;
    private String zzf = "";
    private String zzg = "";
    private String zzh = "";
    private int zzi;
    private int zzj;
    private zzie zzk;
    private boolean zzl;
    private int zzm;
    private boolean zzn;
    private boolean zzo;
    private boolean zzp;
    private long zzq;

    static {
        zziy zziyVar = new zziy();
        zza = zziyVar;
        zzec.k(zziy.class, zziyVar);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzec
    public final Object m(int i12, zzec zzecVar) {
        int i13 = i12 - 1;
        if (i13 == 0) {
            return (byte) 1;
        }
        if (i13 == 2) {
            return new zzfw(zza, "\u0001\f\u0000\u0001\u0001\f\f\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဌ\u0003\u0005င\u0004\u0006ဉ\u0005\u0007ဇ\u0006\bဌ\u0007\tဇ\b\nဇ\t\u000bဇ\n\fဂ\u000b", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", zziz.f352568a, "zzj", "zzk", "zzl", "zzm", zzja.f352569a, "zzn", "zzo", "zzp", "zzq"});
        }
        if (i13 == 3) {
            return new zziy();
        }
        zzhh zzhhVar = null;
        if (i13 == 4) {
            return new zzix(zzhhVar);
        }
        if (i13 != 5) {
            return null;
        }
        return zza;
    }
}
