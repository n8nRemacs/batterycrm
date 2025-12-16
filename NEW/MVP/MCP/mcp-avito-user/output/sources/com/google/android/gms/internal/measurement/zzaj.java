package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-measurement@@21.5.1 */
/* loaded from: classes6.dex */
public final class zzaj implements zzaq {

    /* renamed from: b, reason: collision with root package name */
    public final zzaq f350558b;

    /* renamed from: c, reason: collision with root package name */
    public final String f350559c;

    public zzaj() {
        this.f350558b = zzaq.zzc;
        this.f350559c = "return";
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzaj)) {
            return false;
        }
        zzaj zzajVar = (zzaj) obj;
        return this.f350559c.equals(zzajVar.f350559c) && this.f350558b.equals(zzajVar.f350558b);
    }

    public final int hashCode() {
        return this.f350558b.hashCode() + (this.f350559c.hashCode() * 31);
    }

    @Override // com.google.android.gms.internal.measurement.zzaq
    public final zzaq zza(String str, zzh zzhVar, List<zzaq> list) {
        throw new IllegalStateException("Control does not have functions");
    }

    public final String zzb() {
        return this.f350559c;
    }

    @Override // com.google.android.gms.internal.measurement.zzaq
    public final zzaq zzc() {
        return new zzaj(this.f350559c, this.f350558b.zzc());
    }

    @Override // com.google.android.gms.internal.measurement.zzaq
    public final Boolean zzd() {
        throw new IllegalStateException("Control is not a boolean");
    }

    @Override // com.google.android.gms.internal.measurement.zzaq
    public final Double zze() {
        throw new IllegalStateException("Control is not a double");
    }

    @Override // com.google.android.gms.internal.measurement.zzaq
    public final String zzf() {
        throw new IllegalStateException("Control is not a String");
    }

    @Override // com.google.android.gms.internal.measurement.zzaq
    public final Iterator<zzaq> zzh() {
        return null;
    }

    public final zzaq zza() {
        return this.f350558b;
    }

    public zzaj(String str) {
        this.f350558b = zzaq.zzc;
        this.f350559c = str;
    }

    public zzaj(String str, zzaq zzaqVar) {
        this.f350558b = zzaqVar;
        this.f350559c = str;
    }
}
