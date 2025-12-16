package com.google.android.gms.internal.mlkit_vision_face_bundled;

/* compiled from: com.google.mlkit:face-detection@@16.1.6 */
/* loaded from: classes6.dex */
public final class zzt extends zzvn implements zzwt {
    private static final zzt zzb;
    private int zzd;
    private zzar zze;
    private zzar zzf;

    static {
        zzt zztVar = new zzt();
        zzb = zztVar;
        zzvn.d(zzt.class, zztVar);
    }

    public static /* synthetic */ void l(zzt zztVar, zzar zzarVar) {
        zzarVar.getClass();
        zztVar.zze = zzarVar;
        zztVar.zzd |= 1;
    }

    public static /* synthetic */ void m(zzt zztVar, zzar zzarVar) {
        zzarVar.getClass();
        zztVar.zzf = zzarVar;
        zztVar.zzd |= 2;
    }

    public static zzs zza() {
        return (zzs) zzb.i();
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.zzvn
    public final Object h(int i12, zzvn zzvnVar) {
        int i13 = i12 - 1;
        if (i13 == 0) {
            return (byte) 1;
        }
        if (i13 == 2) {
            return new zzxd(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i13 == 3) {
            return new zzt();
        }
        zzr zzrVar = null;
        if (i13 == 4) {
            return new zzs(zzrVar);
        }
        if (i13 != 5) {
            return null;
        }
        return zzb;
    }
}
