package com.google.android.gms.internal.fido;

import I41.a;

/* compiled from: com.google.android.gms:play-services-fido@@21.0.0 */
/* loaded from: classes6.dex */
final class zzaz extends zzbl {

    /* renamed from: b, reason: collision with root package name */
    public static final zzaz f350263b = new zzaz();

    public final boolean equals(@a Object obj) {
        return obj == this;
    }

    public final int hashCode() {
        return 2040732332;
    }

    public final String toString() {
        return "Optional.absent()";
    }

    @Override // com.google.android.gms.internal.fido.zzbl
    public final Object zza() {
        throw new IllegalStateException("Optional.get() cannot be called on an absent value");
    }

    @Override // com.google.android.gms.internal.fido.zzbl
    public final boolean zzb() {
        return false;
    }
}
