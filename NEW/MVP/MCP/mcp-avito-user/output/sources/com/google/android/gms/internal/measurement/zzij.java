package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-base@@21.5.1 */
/* loaded from: classes6.dex */
public abstract class zzij {

    /* renamed from: a, reason: collision with root package name */
    public int f350854a;

    /* renamed from: b, reason: collision with root package name */
    public final int f350855b;

    /* renamed from: c, reason: collision with root package name */
    public zzin f350856c;

    public static zzij a(int i12, byte[] bArr) {
        zzii zziiVar = new zzii(bArr, 0, i12, false, null);
        try {
            zziiVar.zza(i12);
            return zziiVar;
        } catch (zzjq e12) {
            throw new IllegalArgumentException(e12);
        }
    }

    public static long zza(long j12) {
        return (-(j12 & 1)) ^ (j12 >>> 1);
    }

    public static int zze(int i12) {
        return (-(i12 & 1)) ^ (i12 >>> 1);
    }

    public abstract double zza();

    public abstract int zza(int i12);

    public abstract float zzb();

    public abstract void zzb(int i12);

    public abstract int zzc();

    public abstract void zzc(int i12);

    public abstract int zzd();

    public abstract boolean zzd(int i12);

    public abstract int zze();

    public abstract int zzf();

    public abstract int zzg();

    public abstract int zzh();

    public abstract int zzi();

    public abstract int zzj();

    public abstract long zzk();

    public abstract long zzl();

    public abstract long zzn();

    public abstract long zzo();

    public abstract long zzp();

    public abstract zzhu zzq();

    public abstract String zzr();

    public abstract String zzs();

    public abstract boolean zzt();

    public abstract boolean zzu();

    public zzij() {
        this.f350855b = 100;
    }
}
