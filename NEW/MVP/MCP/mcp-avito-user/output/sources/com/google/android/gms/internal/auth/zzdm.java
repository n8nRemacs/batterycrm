package com.google.android.gms.internal.auth;

import AK.c;
import I41.a;

/* compiled from: com.google.android.gms:play-services-auth-base@@18.0.10 */
/* loaded from: classes6.dex */
final class zzdm implements zzdj {

    /* renamed from: d, reason: collision with root package name */
    public static final zzdl f350075d = zzdl.zza;

    /* renamed from: b, reason: collision with root package name */
    public volatile zzdj f350076b;

    /* renamed from: c, reason: collision with root package name */
    @a
    public Object f350077c;

    public final String toString() {
        Object objK = this.f350076b;
        if (objK == f350075d) {
            objK = c.k("<supplier that returned ", String.valueOf(this.f350077c), ">");
        }
        return c.k("Suppliers.memoize(", String.valueOf(objK), ")");
    }

    @Override // com.google.android.gms.internal.auth.zzdj
    public final Object zza() {
        zzdj zzdjVar = this.f350076b;
        zzdl zzdlVar = f350075d;
        if (zzdjVar != zzdlVar) {
            synchronized (this) {
                try {
                    if (this.f350076b != zzdlVar) {
                        Object objZza = this.f350076b.zza();
                        this.f350077c = objZza;
                        this.f350076b = zzdlVar;
                        return objZza;
                    }
                } finally {
                }
            }
        }
        return this.f350077c;
    }
}
