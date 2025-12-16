package com.google.android.gms.internal.auth;

import AK.c;
import I41.a;
import java.io.Serializable;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-auth-base@@18.0.10 */
/* loaded from: classes6.dex */
final class zzdn implements Serializable, zzdj {

    /* renamed from: b, reason: collision with root package name */
    public final Object f350078b;

    public zzdn(Object obj) {
        this.f350078b = obj;
    }

    public final boolean equals(@a Object obj) {
        if (!(obj instanceof zzdn)) {
            return false;
        }
        Object obj2 = ((zzdn) obj).f350078b;
        Object obj3 = this.f350078b;
        return obj3 == obj2 || obj3.equals(obj2);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f350078b});
    }

    public final String toString() {
        return c.k("Suppliers.ofInstance(", this.f350078b.toString(), ")");
    }

    @Override // com.google.android.gms.internal.auth.zzdj
    public final Object zza() {
        return this.f350078b;
    }
}
