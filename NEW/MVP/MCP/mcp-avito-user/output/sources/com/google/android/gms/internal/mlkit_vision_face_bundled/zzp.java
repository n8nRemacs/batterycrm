package com.google.android.gms.internal.mlkit_vision_face_bundled;

/* compiled from: com.google.mlkit:face-detection@@16.1.6 */
/* loaded from: classes6.dex */
public final class zzp extends zzvn implements zzwt {
    private static final zzp zzb;
    private int zzd;
    private int zze;
    private int zzf;
    private int zzg;
    private int zzh;
    private boolean zzi;
    private long zzj;
    private String zzk = "";

    static {
        zzp zzpVar = new zzp();
        zzb = zzpVar;
        zzvn.d(zzp.class, zzpVar);
    }

    public static /* synthetic */ void l(zzp zzpVar, int i12) {
        zzpVar.zzd |= 1;
        zzpVar.zze = i12;
    }

    public static /* synthetic */ void m(zzp zzpVar, long j12) {
        zzpVar.zzd |= 32;
        zzpVar.zzj = j12;
    }

    public static /* synthetic */ void n(zzp zzpVar, int i12) {
        zzpVar.zzd |= 2;
        zzpVar.zzf = i12;
    }

    public static /* synthetic */ void o(zzp zzpVar, int i12) {
        zzpVar.zzg = i12 - 1;
        zzpVar.zzd |= 4;
    }

    public static /* synthetic */ void p(zzp zzpVar, int i12) {
        zzpVar.zzh = i12 - 1;
        zzpVar.zzd |= 8;
    }

    public static zzo zza() {
        return (zzo) zzb.i();
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.zzvn
    public final Object h(int i12, zzvn zzvnVar) {
        int i13 = i12 - 1;
        if (i13 == 0) {
            return (byte) 1;
        }
        if (i13 == 2) {
            return new zzxd(zzb, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003᠌\u0002\u0004᠌\u0003\u0005ဇ\u0004\u0006ဂ\u0005\u0007ဈ\u0006", new Object[]{"zzd", "zze", "zzf", "zzg", zzm.f353903a, "zzh", zzq.f353943a, "zzi", "zzj", "zzk"});
        }
        if (i13 == 3) {
            return new zzp();
        }
        zzn zznVar = null;
        if (i13 == 4) {
            return new zzo(zznVar);
        }
        if (i13 != 5) {
            return null;
        }
        return zzb;
    }
}
