package com.google.android.gms.internal.mlkit_vision_face_bundled;

/* compiled from: com.google.mlkit:face-detection@@16.1.6 */
/* loaded from: classes6.dex */
public final class zzaj extends zzvn implements zzwt {
    private static final zzaj zzb;
    private int zzd;
    private zzar zze;
    private zzar zzf;
    private zzar zzg;
    private zzar zzh;

    static {
        zzaj zzajVar = new zzaj();
        zzb = zzajVar;
        zzvn.d(zzaj.class, zzajVar);
    }

    public static /* synthetic */ void l(zzaj zzajVar, zzar zzarVar) {
        zzarVar.getClass();
        zzajVar.zze = zzarVar;
        zzajVar.zzd |= 1;
    }

    public static /* synthetic */ void m(zzaj zzajVar, zzar zzarVar) {
        zzarVar.getClass();
        zzajVar.zzf = zzarVar;
        zzajVar.zzd |= 2;
    }

    public static /* synthetic */ void n(zzaj zzajVar, zzar zzarVar) {
        zzarVar.getClass();
        zzajVar.zzg = zzarVar;
        zzajVar.zzd |= 4;
    }

    public static /* synthetic */ void o(zzaj zzajVar, zzar zzarVar) {
        zzarVar.getClass();
        zzajVar.zzh = zzarVar;
        zzajVar.zzd |= 8;
    }

    public static zzai zza() {
        return (zzai) zzb.i();
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.zzvn
    public final Object h(int i12, zzvn zzvnVar) {
        int i13 = i12 - 1;
        if (i13 == 0) {
            return (byte) 1;
        }
        if (i13 == 2) {
            return new zzxd(zzb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh"});
        }
        if (i13 == 3) {
            return new zzaj();
        }
        zzr zzrVar = null;
        if (i13 == 4) {
            return new zzai(zzrVar);
        }
        if (i13 != 5) {
            return null;
        }
        return zzb;
    }
}
