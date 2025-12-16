package com.google.android.gms.internal.fido;

import AK.c;
import I41.a;

/* compiled from: com.google.android.gms:play-services-fido@@21.0.0 */
/* loaded from: classes6.dex */
final class zzbn extends zzbl {

    /* renamed from: b, reason: collision with root package name */
    public final Object f350270b;

    public zzbn(Object obj) {
        this.f350270b = obj;
    }

    public final boolean equals(@a Object obj) {
        if (obj instanceof zzbn) {
            return this.f350270b.equals(((zzbn) obj).f350270b);
        }
        return false;
    }

    public final int hashCode() {
        return this.f350270b.hashCode() + 1502476572;
    }

    public final String toString() {
        return c.k("Optional.of(", this.f350270b.toString(), ")");
    }

    @Override // com.google.android.gms.internal.fido.zzbl
    public final Object zza() {
        return this.f350270b;
    }

    @Override // com.google.android.gms.internal.fido.zzbl
    public final boolean zzb() {
        return true;
    }
}
