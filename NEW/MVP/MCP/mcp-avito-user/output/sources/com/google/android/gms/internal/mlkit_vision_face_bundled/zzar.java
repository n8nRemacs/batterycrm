package com.google.android.gms.internal.mlkit_vision_face_bundled;

/* compiled from: com.google.mlkit:face-detection@@16.1.6 */
/* loaded from: classes6.dex */
public final class zzar extends zzvn implements zzwt {
    private static final zzar zzb;
    private int zzd;
    private zzul zze = zzul.zzb;
    private String zzf = "";
    private String zzg = "";

    static {
        zzar zzarVar = new zzar();
        zzb = zzarVar;
        zzvn.d(zzar.class, zzarVar);
    }

    public static /* synthetic */ void l(zzar zzarVar, String str) {
        zzarVar.zzd |= 2;
        zzarVar.zzf = str;
    }

    public static /* synthetic */ void m(zzar zzarVar, String str) {
        zzarVar.zzd |= 4;
        zzarVar.zzg = str;
    }

    public static zzaq zza() {
        return (zzaq) zzb.i();
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.zzvn
    public final Object h(int i12, zzvn zzvnVar) {
        int i13 = i12 - 1;
        if (i13 == 0) {
            return (byte) 1;
        }
        if (i13 == 2) {
            return new zzxd(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ည\u0000\u0002ဈ\u0001\u0003ဈ\u0002", new Object[]{"zzd", "zze", "zzf", "zzg"});
        }
        if (i13 == 3) {
            return new zzar();
        }
        zzr zzrVar = null;
        if (i13 == 4) {
            return new zzaq(zzrVar);
        }
        if (i13 != 5) {
            return null;
        }
        return zzb;
    }
}
