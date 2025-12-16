package com.google.android.gms.internal.mlkit_vision_face_bundled;

import java.util.List;

/* compiled from: com.google.mlkit:face-detection@@16.1.6 */
/* loaded from: classes6.dex */
public final class zzzh extends zzvn implements zzwt {
    private static final zzzh zzb;
    private byte zze = 2;
    private zzvs zzd = zzxc.zze();

    static {
        zzzh zzzhVar = new zzzh();
        zzb = zzzhVar;
        zzvn.d(zzzh.class, zzzhVar);
    }

    public static zzzh zzd() {
        return zzb;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.zzvn
    public final Object h(int i12, zzvn zzvnVar) {
        int i13 = i12 - 1;
        if (i13 == 0) {
            return Byte.valueOf(this.zze);
        }
        if (i13 == 2) {
            return new zzxd(zzb, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001Л", new Object[]{"zzd", zzze.class});
        }
        if (i13 == 3) {
            return new zzzh();
        }
        zzzf zzzfVar = null;
        if (i13 == 4) {
            return new zzzg(zzzfVar);
        }
        if (i13 == 5) {
            return zzb;
        }
        this.zze = zzvnVar == null ? (byte) 0 : (byte) 1;
        return null;
    }

    public final List zze() {
        return this.zzd;
    }
}
