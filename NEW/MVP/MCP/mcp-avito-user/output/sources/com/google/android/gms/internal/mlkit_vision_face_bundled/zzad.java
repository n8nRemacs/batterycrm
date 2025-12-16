package com.google.android.gms.internal.mlkit_vision_face_bundled;

import java.util.List;

/* compiled from: com.google.mlkit:face-detection@@16.1.6 */
/* loaded from: classes6.dex */
public final class zzad extends zzvn implements zzwt {
    private static final zzad zzb;
    private int zzd;
    private int zze;
    private zzvs zzf = zzxc.zze();

    static {
        zzad zzadVar = new zzad();
        zzb = zzadVar;
        zzvn.d(zzad.class, zzadVar);
    }

    public static zzad zzb() {
        return zzb;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.zzvn
    public final Object h(int i12, zzvn zzvnVar) {
        int i13 = i12 - 1;
        if (i13 == 0) {
            return (byte) 1;
        }
        if (i13 == 2) {
            return new zzxd(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001᠌\u0000\u0002\u001b", new Object[]{"zzd", "zze", zzab.f353484a, "zzf", zzz.class});
        }
        if (i13 == 3) {
            return new zzad();
        }
        zzr zzrVar = null;
        if (i13 == 4) {
            return new zzx(zzrVar);
        }
        if (i13 != 5) {
            return null;
        }
        return zzb;
    }

    public final List zzc() {
        return this.zzf;
    }

    public final int zzd() {
        int iZza = zzac.zza(this.zze);
        if (iZza == 0) {
            return 1;
        }
        return iZza;
    }
}
