package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

/* compiled from: com.google.mlkit:barcode-scanning@@17.0.2 */
/* loaded from: classes6.dex */
public class zzet {

    /* renamed from: a, reason: collision with root package name */
    public volatile zzfl f352455a;

    /* renamed from: b, reason: collision with root package name */
    public volatile zzdb f352456b;

    static {
        zzdn.zza();
    }

    public final void a(zzfl zzflVar) {
        if (this.f352455a != null) {
            return;
        }
        synchronized (this) {
            if (this.f352455a == null) {
                try {
                    this.f352455a = zzflVar;
                    this.f352456b = zzdb.zzb;
                } catch (zzen unused) {
                    this.f352455a = zzflVar;
                    this.f352456b = zzdb.zzb;
                }
            }
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzet)) {
            return false;
        }
        zzet zzetVar = (zzet) obj;
        zzfl zzflVar = this.f352455a;
        zzfl zzflVar2 = zzetVar.f352455a;
        if (zzflVar == null && zzflVar2 == null) {
            return zzb().equals(zzetVar.zzb());
        }
        if (zzflVar != null && zzflVar2 != null) {
            return zzflVar.equals(zzflVar2);
        }
        if (zzflVar != null) {
            zzetVar.a(zzflVar.zzX());
            return zzflVar.equals(zzetVar.f352455a);
        }
        a(zzflVar2.zzX());
        return this.f352455a.equals(zzflVar2);
    }

    public int hashCode() {
        return 1;
    }

    public final int zza() {
        if (this.f352456b != null) {
            return ((zzcz) this.f352456b).f352402c.length;
        }
        if (this.f352455a != null) {
            return this.f352455a.zzE();
        }
        return 0;
    }

    public final zzdb zzb() {
        if (this.f352456b != null) {
            return this.f352456b;
        }
        synchronized (this) {
            try {
                if (this.f352456b != null) {
                    return this.f352456b;
                }
                if (this.f352455a == null) {
                    this.f352456b = zzdb.zzb;
                } else {
                    this.f352456b = this.f352455a.zzC();
                }
                return this.f352456b;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final zzfl zzc(zzfl zzflVar) {
        zzfl zzflVar2 = this.f352455a;
        this.f352456b = null;
        this.f352455a = zzflVar;
        return zzflVar2;
    }
}
