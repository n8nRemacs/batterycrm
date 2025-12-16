package com.google.android.gms.internal.mlkit_vision_face_bundled;

/* compiled from: com.google.mlkit:face-detection@@16.1.6 */
/* loaded from: classes6.dex */
public class zzvy {

    /* renamed from: a, reason: collision with root package name */
    public volatile zzws f354073a;

    /* renamed from: b, reason: collision with root package name */
    public volatile zzul f354074b;

    static {
        zzuy zzuyVar = zzuy.f354044b;
    }

    public final void a(zzws zzwsVar) {
        if (this.f354073a != null) {
            return;
        }
        synchronized (this) {
            if (this.f354073a != null) {
                return;
            }
            try {
                this.f354073a = zzwsVar;
                this.f354074b = zzul.zzb;
            } catch (zzvv unused) {
                this.f354073a = zzwsVar;
                this.f354074b = zzul.zzb;
            }
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzvy)) {
            return false;
        }
        zzvy zzvyVar = (zzvy) obj;
        zzws zzwsVar = this.f354073a;
        zzws zzwsVar2 = zzvyVar.f354073a;
        if (zzwsVar == null && zzwsVar2 == null) {
            return zzb().equals(zzvyVar.zzb());
        }
        if (zzwsVar != null && zzwsVar2 != null) {
            return zzwsVar.equals(zzwsVar2);
        }
        if (zzwsVar != null) {
            zzvyVar.a(zzwsVar.zzq());
            return zzwsVar.equals(zzvyVar.f354073a);
        }
        a(zzwsVar2.zzq());
        return this.f354073a.equals(zzwsVar2);
    }

    public int hashCode() {
        return 1;
    }

    public final int zza() {
        if (this.f354074b != null) {
            return ((zzui) this.f354074b).f354028c.length;
        }
        if (this.f354073a != null) {
            return this.f354073a.zzu();
        }
        return 0;
    }

    public final zzul zzb() {
        if (this.f354074b != null) {
            return this.f354074b;
        }
        synchronized (this) {
            try {
                if (this.f354074b != null) {
                    return this.f354074b;
                }
                if (this.f354073a == null) {
                    this.f354074b = zzul.zzb;
                } else {
                    this.f354074b = this.f354073a.zzM();
                }
                return this.f354074b;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
