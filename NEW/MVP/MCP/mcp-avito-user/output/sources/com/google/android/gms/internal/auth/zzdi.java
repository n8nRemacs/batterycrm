package com.google.android.gms.internal.auth;

import AK.c;
import I41.a;

/* compiled from: com.google.android.gms:play-services-auth-base@@18.0.10 */
/* loaded from: classes6.dex */
final class zzdi extends zzdh {

    /* renamed from: b, reason: collision with root package name */
    public final Object f350071b;

    public zzdi(Object obj) {
        this.f350071b = obj;
    }

    public final boolean equals(@a Object obj) {
        if (obj instanceof zzdi) {
            return this.f350071b.equals(((zzdi) obj).f350071b);
        }
        return false;
    }

    public final int hashCode() {
        return this.f350071b.hashCode() + 1502476572;
    }

    public final String toString() {
        return c.k("Optional.of(", this.f350071b.toString(), ")");
    }

    @Override // com.google.android.gms.internal.auth.zzdh
    public final Object zza() {
        return this.f350071b;
    }

    @Override // com.google.android.gms.internal.auth.zzdh
    public final boolean zzb() {
        return true;
    }
}
