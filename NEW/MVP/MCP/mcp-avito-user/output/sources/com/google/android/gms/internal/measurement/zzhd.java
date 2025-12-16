package com.google.android.gms.internal.measurement;

import android.net.Uri;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.5.1 */
/* loaded from: classes6.dex */
public final class zzhd {

    /* renamed from: a, reason: collision with root package name */
    public final Uri f350824a;

    /* renamed from: b, reason: collision with root package name */
    public final String f350825b;

    /* renamed from: c, reason: collision with root package name */
    public final String f350826c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f350827d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f350828e;

    public zzhd(Uri uri) {
        this(uri, "", "", false, false);
    }

    public final zzhd zza() {
        return new zzhd(this.f350824a, this.f350825b, this.f350826c, this.f350827d, true);
    }

    public final zzhd zzb() {
        if (!this.f350825b.isEmpty()) {
            throw new IllegalStateException("Cannot set GServices prefix and skip GServices");
        }
        return new zzhd(this.f350824a, this.f350825b, this.f350826c, true, this.f350828e);
    }

    public zzhd(Uri uri, String str, String str2, boolean z12, boolean z13) {
        this.f350824a = uri;
        this.f350825b = str;
        this.f350826c = str2;
        this.f350827d = z12;
        this.f350828e = z13;
    }

    public final zzgv<Double> zza(String str, double d12) {
        Double dValueOf = Double.valueOf(-3.0d);
        Object obj = zzgv.f350809g;
        return new zzhb(this, str, dValueOf, true, null);
    }

    public final zzgv<Long> zza(String str, long j12) {
        Long lValueOf = Long.valueOf(j12);
        Object obj = zzgv.f350809g;
        return new zzgz(this, str, lValueOf, true, null);
    }

    public final zzgv<String> zza(String str, String str2) {
        Object obj = zzgv.f350809g;
        return new zzha(this, str, str2, true, null);
    }

    public final zzgv<Boolean> zza(String str, boolean z12) {
        Boolean boolValueOf = Boolean.valueOf(z12);
        Object obj = zzgv.f350809g;
        return new zzgy(this, str, boolValueOf, true, null);
    }
}
