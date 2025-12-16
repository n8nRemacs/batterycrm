package com.google.android.gms.internal.mlkit_vision_face_bundled;

/* compiled from: com.google.mlkit:face-detection@@16.1.6 */
/* loaded from: classes6.dex */
public final class zzao extends zzvn implements zzwt {
    private static final zzao zzb;
    private int zzd;
    private zzar zze;
    private zzar zzf;
    private zzar zzg;
    private zzar zzh;

    static {
        zzao zzaoVar = new zzao();
        zzb = zzaoVar;
        zzvn.d(zzao.class, zzaoVar);
    }

    public static /* synthetic */ void l(zzao zzaoVar, zzar zzarVar) {
        zzarVar.getClass();
        zzaoVar.zze = zzarVar;
        zzaoVar.zzd |= 1;
    }

    public static /* synthetic */ void m(zzao zzaoVar, zzar zzarVar) {
        zzarVar.getClass();
        zzaoVar.zzf = zzarVar;
        zzaoVar.zzd |= 2;
    }

    public static /* synthetic */ void n(zzao zzaoVar, zzar zzarVar) {
        zzarVar.getClass();
        zzaoVar.zzg = zzarVar;
        zzaoVar.zzd |= 4;
    }

    public static /* synthetic */ void o(zzao zzaoVar, zzar zzarVar) {
        zzarVar.getClass();
        zzaoVar.zzh = zzarVar;
        zzaoVar.zzd |= 8;
    }

    public static zzan zza() {
        return (zzan) zzb.i();
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
            return new zzao();
        }
        zzr zzrVar = null;
        if (i13 == 4) {
            return new zzan(zzrVar);
        }
        if (i13 != 5) {
            return null;
        }
        return zzb;
    }
}
