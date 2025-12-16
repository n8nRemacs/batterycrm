package com.google.android.gms.internal.mlkit_vision_face_bundled;

import java.util.List;

/* compiled from: com.google.mlkit:face-detection@@16.1.6 */
/* loaded from: classes6.dex */
public final class zzze extends zzvj implements zzwt {
    private static final zzze zzd;
    private int zze;
    private zzyu zzf;
    private float zzh;
    private float zzi;
    private float zzj;
    private float zzk;
    private float zzl;
    private long zzo;
    private long zzp;
    private long zzq;
    private float zzr;
    private byte zzs = 2;
    private zzvs zzg = zzxc.zze();
    private zzvs zzm = zzxc.zze();
    private zzvs zzn = zzxc.zze();

    static {
        zzze zzzeVar = new zzze();
        zzd = zzzeVar;
        zzvn.d(zzze.class, zzzeVar);
    }

    public static zzze zzm() {
        return zzd;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.zzvn
    public final Object h(int i12, zzvn zzvnVar) {
        int i13 = i12 - 1;
        if (i13 == 0) {
            return Byte.valueOf(this.zzs);
        }
        if (i13 == 2) {
            return new zzxd(zzd, "\u0001\r\u0000\u0001\u0001\r\r\u0000\u0003\u0000\u0001ဉ\u0000\u0002\u001b\u0003ခ\u0001\u0004ခ\u0002\u0005ခ\u0003\u0006ခ\u0004\u0007\u001b\b\u001b\tဃ\u0007\nခ\t\u000bဃ\b\fဃ\u0006\rခ\u0005", new Object[]{"zze", "zzf", "zzg", zzzd.class, "zzh", "zzi", "zzj", "zzk", "zzm", zzyx.class, "zzn", zzys.class, "zzp", "zzr", "zzq", "zzo", "zzl"});
        }
        if (i13 == 3) {
            return new zzze();
        }
        if (i13 == 4) {
            return new zzyv(null);
        }
        if (i13 == 5) {
            return zzd;
        }
        this.zzs = zzvnVar == null ? (byte) 0 : (byte) 1;
        return null;
    }

    public final boolean zzJ() {
        return (this.zze & 2) != 0;
    }

    public final float zze() {
        return this.zzh;
    }

    public final float zzg() {
        return this.zzj;
    }

    public final float zzh() {
        return this.zzi;
    }

    public final float zzi() {
        return this.zzk;
    }

    public final long zzj() {
        return this.zzp;
    }

    public final zzyu zzk() {
        zzyu zzyuVar = this.zzf;
        return zzyuVar == null ? zzyu.zzi() : zzyuVar;
    }

    public final List zzn() {
        return this.zzn;
    }

    public final List zzo() {
        return this.zzg;
    }
}
