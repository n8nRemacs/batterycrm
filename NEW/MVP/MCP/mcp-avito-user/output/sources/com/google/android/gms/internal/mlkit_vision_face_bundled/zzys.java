package com.google.android.gms.internal.mlkit_vision_face_bundled;

/* compiled from: com.google.mlkit:face-detection@@16.1.6 */
/* loaded from: classes6.dex */
public final class zzys extends zzvn implements zzwt {
    private static final zzys zzb;
    private int zzd;
    private int zze;
    private String zzf = "";
    private float zzg;
    private float zzh;

    static {
        zzys zzysVar = new zzys();
        zzb = zzysVar;
        zzvn.d(zzys.class, zzysVar);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.zzvn
    public final Object h(int i12, zzvn zzvnVar) {
        int i13 = i12 - 1;
        if (i13 == 0) {
            return (byte) 1;
        }
        if (i13 == 2) {
            return new zzxd(zzb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001᠌\u0000\u0002ဈ\u0001\u0003ခ\u0002\u0004ခ\u0003", new Object[]{"zzd", "zze", zzyr.f354160a, "zzf", "zzg", "zzh"});
        }
        if (i13 == 3) {
            return new zzys();
        }
        zzyp zzypVar = null;
        if (i13 == 4) {
            return new zzyq(zzypVar);
        }
        if (i13 != 5) {
            return null;
        }
        return zzb;
    }

    public final float zzb() {
        return this.zzg;
    }

    public final String zze() {
        return this.zzf;
    }
}
