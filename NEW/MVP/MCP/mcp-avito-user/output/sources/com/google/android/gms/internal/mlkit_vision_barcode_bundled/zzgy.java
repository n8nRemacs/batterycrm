package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import java.lang.reflect.Field;
import sun.misc.Unsafe;

/* compiled from: com.google.mlkit:barcode-scanning@@17.0.2 */
/* loaded from: classes6.dex */
abstract class zzgy {

    /* renamed from: a, reason: collision with root package name */
    public final Unsafe f352542a;

    public zzgy(Unsafe unsafe) {
        this.f352542a = unsafe;
    }

    public abstract double zza(Object obj, long j12);

    public abstract float zzb(Object obj, long j12);

    public abstract void zzc(Object obj, long j12, boolean z12);

    public abstract void zzd(Object obj, long j12, byte b12);

    public abstract void zze(Object obj, long j12, double d12);

    public abstract void zzf(Object obj, long j12, float f12);

    public abstract boolean zzg(Object obj, long j12);

    public final int zzh(Class cls) {
        return this.f352542a.arrayBaseOffset(cls);
    }

    public final int zzi(Class cls) {
        return this.f352542a.arrayIndexScale(cls);
    }

    public final int zzj(Object obj, long j12) {
        return this.f352542a.getInt(obj, j12);
    }

    public final long zzk(Object obj, long j12) {
        return this.f352542a.getLong(obj, j12);
    }

    public final long zzl(Field field) {
        return this.f352542a.objectFieldOffset(field);
    }

    public final Object zzm(Object obj, long j12) {
        return this.f352542a.getObject(obj, j12);
    }

    public final void zzn(Object obj, long j12, int i12) {
        this.f352542a.putInt(obj, j12, i12);
    }

    public final void zzo(Object obj, long j12, long j13) {
        this.f352542a.putLong(obj, j12, j13);
    }

    public final void zzp(Object obj, long j12, Object obj2) {
        this.f352542a.putObject(obj, j12, obj2);
    }
}
