package com.google.android.gms.internal.measurement;

import androidx.media3.exoplayer.analytics.m;
import java.util.Iterator;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-measurement@@21.5.1 */
/* loaded from: classes6.dex */
public final class zzag implements zzaq {

    /* renamed from: b, reason: collision with root package name */
    public final boolean f350554b;

    public zzag(Boolean bool) {
        if (bool == null) {
            this.f350554b = false;
        } else {
            this.f350554b = bool.booleanValue();
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zzag) && this.f350554b == ((zzag) obj).f350554b;
    }

    public final int hashCode() {
        return Boolean.valueOf(this.f350554b).hashCode();
    }

    public final String toString() {
        return String.valueOf(this.f350554b);
    }

    @Override // com.google.android.gms.internal.measurement.zzaq
    public final zzaq zza(String str, zzh zzhVar, List<zzaq> list) {
        boolean zEquals = "toString".equals(str);
        boolean z12 = this.f350554b;
        if (zEquals) {
            return new zzas(Boolean.toString(z12));
        }
        throw new IllegalArgumentException(m.l(Boolean.toString(z12), ".", str, " is not a function."));
    }

    @Override // com.google.android.gms.internal.measurement.zzaq
    public final zzaq zzc() {
        return new zzag(Boolean.valueOf(this.f350554b));
    }

    @Override // com.google.android.gms.internal.measurement.zzaq
    public final Boolean zzd() {
        return Boolean.valueOf(this.f350554b);
    }

    @Override // com.google.android.gms.internal.measurement.zzaq
    public final Double zze() {
        return Double.valueOf(this.f350554b ? 1.0d : 0.0d);
    }

    @Override // com.google.android.gms.internal.measurement.zzaq
    public final String zzf() {
        return Boolean.toString(this.f350554b);
    }

    @Override // com.google.android.gms.internal.measurement.zzaq
    public final Iterator<zzaq> zzh() {
        return null;
    }
}
