package com.google.android.gms.internal.auth;

import android.net.Uri;

/* compiled from: com.google.android.gms:play-services-auth-base@@18.0.10 */
/* loaded from: classes6.dex */
public final class zzcz {

    /* renamed from: a, reason: collision with root package name */
    public final Uri f350056a;

    /* renamed from: b, reason: collision with root package name */
    public final String f350057b;

    /* renamed from: c, reason: collision with root package name */
    public final String f350058c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f350059d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f350060e;

    public zzcz(Uri uri, boolean z12, boolean z13) {
        this.f350056a = uri;
        this.f350057b = "";
        this.f350058c = "";
        this.f350059d = z12;
        this.f350060e = z13;
    }

    public final zzcz zza() {
        return new zzcz(this.f350056a, this.f350059d, true);
    }

    public final zzcz zzb() {
        if (!this.f350057b.isEmpty()) {
            throw new IllegalStateException("Cannot set GServices prefix and skip GServices");
        }
        return new zzcz(this.f350056a, true, this.f350060e);
    }

    public final zzdc zzc(String str, double d12) {
        return new zzcx(this, str, Double.valueOf(0.0d), true, null);
    }

    public final zzdc zzd(String str, long j12) {
        return new zzcv(this, str, Long.valueOf(j12), true, null);
    }

    public final zzdc zze(String str, boolean z12) {
        return new zzcw(this, str, Boolean.valueOf(z12), true, null);
    }

    public final zzdc zzf(String str, Object obj, zzhy zzhyVar) {
        return new zzcy(this, "getTokenRefactor__blocked_packages", obj, true, null);
    }

    public zzcz(Uri uri) {
        this(uri, false, false);
    }
}
