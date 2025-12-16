package com.google.android.gms.internal.fido;

import AK.c;
import I41.a;
import java.io.Serializable;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-fido@@21.0.0 */
/* loaded from: classes6.dex */
final class zzbs implements Serializable, zzbp {

    /* renamed from: b, reason: collision with root package name */
    public final Object f350273b;

    public zzbs(Object obj) {
        this.f350273b = obj;
    }

    public final boolean equals(@a Object obj) {
        if (obj instanceof zzbs) {
            return zzbk.zza(this.f350273b, ((zzbs) obj).f350273b);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f350273b});
    }

    public final String toString() {
        return c.k("Suppliers.ofInstance(", this.f350273b.toString(), ")");
    }

    @Override // com.google.android.gms.internal.fido.zzbp
    public final Object zza() {
        return this.f350273b;
    }
}
