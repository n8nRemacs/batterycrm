package com.google.android.gms.internal.fido;

import AK.c;

/* compiled from: com.google.android.gms:play-services-fido@@21.0.0 */
/* loaded from: classes6.dex */
final class zzbr implements zzbp {

    /* renamed from: c, reason: collision with root package name */
    public static final zzbq f350271c = zzbq.zza;

    /* renamed from: b, reason: collision with root package name */
    public volatile zzbp f350272b;

    public final String toString() {
        Object obj = this.f350272b;
        if (obj == f350271c) {
            obj = "<supplier that returned null>";
        }
        return c.k("Suppliers.memoize(", String.valueOf(obj), ")");
    }

    @Override // com.google.android.gms.internal.fido.zzbp
    public final Object zza() {
        throw null;
    }
}
