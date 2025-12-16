package com.google.android.gms.internal.mlkit_vision_face_bundled;

/* compiled from: com.google.mlkit:face-detection@@16.1.6 */
/* loaded from: classes6.dex */
public final class zzah extends zzvn implements zzwt {
    private static final zzah zzb;
    private int zzd;
    private boolean zzi;
    private boolean zzj;
    private boolean zzm;
    private zzaj zzn;
    private zzt zzo;
    private zzao zzp;
    private float zze = 0.1f;
    private int zzf = 1;
    private int zzg = 1;
    private int zzh = 1;
    private float zzk = 45.0f;
    private float zzl = 0.5f;

    static {
        zzah zzahVar = new zzah();
        zzb = zzahVar;
        zzvn.d(zzah.class, zzahVar);
    }

    public static /* synthetic */ void l(zzah zzahVar, float f12) {
        zzahVar.zzd |= 1;
        zzahVar.zze = f12;
    }

    public static /* synthetic */ void m(zzah zzahVar, boolean z12) {
        zzahVar.zzd |= 32;
        zzahVar.zzj = z12;
    }

    public static /* synthetic */ void n(zzah zzahVar) {
        zzahVar.zzd |= 256;
        zzahVar.zzm = true;
    }

    public static /* synthetic */ void o(zzah zzahVar, zzaj zzajVar) {
        zzajVar.getClass();
        zzahVar.zzn = zzajVar;
        zzahVar.zzd |= 512;
    }

    public static /* synthetic */ void p(zzah zzahVar, zzt zztVar) {
        zztVar.getClass();
        zzahVar.zzo = zztVar;
        zzahVar.zzd |= 1024;
    }

    public static /* synthetic */ void q(zzah zzahVar, zzao zzaoVar) {
        zzaoVar.getClass();
        zzahVar.zzp = zzaoVar;
        zzahVar.zzd |= 2048;
    }

    public static /* synthetic */ void r(zzah zzahVar, boolean z12) {
        zzahVar.zzd |= 16;
        zzahVar.zzi = z12;
    }

    public static /* synthetic */ void s(zzah zzahVar, int i12) {
        zzahVar.zzf = i12 - 1;
        zzahVar.zzd |= 2;
    }

    public static /* synthetic */ void t(zzah zzahVar, int i12) {
        zzahVar.zzg = i12 - 1;
        zzahVar.zzd |= 4;
    }

    public static /* synthetic */ void u(zzah zzahVar, int i12) {
        zzahVar.zzh = i12 - 1;
        zzahVar.zzd |= 8;
    }

    public static zzag zza() {
        return (zzag) zzb.i();
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.zzvn
    public final Object h(int i12, zzvn zzvnVar) {
        int i13 = i12 - 1;
        if (i13 == 0) {
            return (byte) 1;
        }
        if (i13 == 2) {
            return new zzxd(zzb, "\u0001\f\u0000\u0001\u0001\f\f\u0000\u0000\u0000\u0001ခ\u0000\u0002᠌\u0001\u0003᠌\u0002\u0004᠌\u0003\u0005ဇ\u0004\u0006ဇ\u0005\u0007ခ\u0006\bခ\u0007\tဇ\b\nဉ\t\u000bဉ\n\fဉ\u000b", new Object[]{"zzd", "zze", "zzf", zzal.f353485a, "zzg", zzv.f354046a, "zzh", zzap.f353486a, "zzi", "zzj", "zzk", "zzl", "zzm", "zzn", "zzo", "zzp"});
        }
        if (i13 == 3) {
            return new zzah();
        }
        zzr zzrVar = null;
        if (i13 == 4) {
            return new zzag(zzrVar);
        }
        if (i13 != 5) {
            return null;
        }
        return zzb;
    }

    public final int zzk() {
        int iZza = zzw.zza(this.zzg);
        if (iZza == 0) {
            return 2;
        }
        return iZza;
    }

    public final int zzl() {
        int iZza = zzam.zza(this.zzf);
        if (iZza == 0) {
            return 2;
        }
        return iZza;
    }
}
