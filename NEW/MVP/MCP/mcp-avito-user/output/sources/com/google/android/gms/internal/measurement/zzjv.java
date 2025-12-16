package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-base@@21.5.1 */
/* loaded from: classes6.dex */
public class zzjv {

    /* renamed from: a, reason: collision with root package name */
    public volatile zzkr f350904a;

    /* renamed from: b, reason: collision with root package name */
    public volatile zzhu f350905b;

    static {
        zzis zzisVar = zzis.f350871b;
    }

    public final zzkr a(zzkr zzkrVar) {
        if (this.f350904a == null) {
            synchronized (this) {
                if (this.f350904a == null) {
                    try {
                        this.f350904a = zzkrVar;
                        this.f350905b = zzhu.zza;
                    } catch (zzjq unused) {
                        this.f350904a = zzkrVar;
                        this.f350905b = zzhu.zza;
                    }
                }
            }
        }
        return this.f350904a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzjv)) {
            return false;
        }
        zzjv zzjvVar = (zzjv) obj;
        zzkr zzkrVar = this.f350904a;
        zzkr zzkrVar2 = zzjvVar.f350904a;
        return (zzkrVar == null && zzkrVar2 == null) ? zzc().equals(zzjvVar.zzc()) : (zzkrVar == null || zzkrVar2 == null) ? zzkrVar != null ? zzkrVar.equals(zzjvVar.a(zzkrVar.zzcf())) : a(zzkrVar2.zzcf()).equals(zzkrVar2) : zzkrVar.equals(zzkrVar2);
    }

    public int hashCode() {
        return 1;
    }

    public final zzkr zza(zzkr zzkrVar) {
        zzkr zzkrVar2 = this.f350904a;
        this.f350905b = null;
        this.f350904a = zzkrVar;
        return zzkrVar2;
    }

    public final int zzb() {
        if (this.f350905b != null) {
            return this.f350905b.zzb();
        }
        if (this.f350904a != null) {
            return this.f350904a.zzbw();
        }
        return 0;
    }

    public final zzhu zzc() {
        if (this.f350905b != null) {
            return this.f350905b;
        }
        synchronized (this) {
            try {
                if (this.f350905b != null) {
                    return this.f350905b;
                }
                if (this.f350904a == null) {
                    this.f350905b = zzhu.zza;
                } else {
                    this.f350905b = this.f350904a.zzbu();
                }
                return this.f350905b;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
