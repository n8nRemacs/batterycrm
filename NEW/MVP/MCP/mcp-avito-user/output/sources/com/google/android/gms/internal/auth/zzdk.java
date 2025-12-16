package com.google.android.gms.internal.auth;

import AK.c;
import I41.a;
import java.io.Serializable;

/* compiled from: com.google.android.gms:play-services-auth-base@@18.0.10 */
/* loaded from: classes6.dex */
final class zzdk implements Serializable, zzdj {

    /* renamed from: b, reason: collision with root package name */
    public final zzdj f350072b;

    /* renamed from: c, reason: collision with root package name */
    public volatile transient boolean f350073c;

    /* renamed from: d, reason: collision with root package name */
    @a
    public transient Object f350074d;

    public zzdk(zzdj zzdjVar) {
        this.f350072b = zzdjVar;
    }

    public final String toString() {
        return c.k("Suppliers.memoize(", (this.f350073c ? c.k("<supplier that returned ", String.valueOf(this.f350074d), ">") : this.f350072b).toString(), ")");
    }

    @Override // com.google.android.gms.internal.auth.zzdj
    public final Object zza() {
        if (!this.f350073c) {
            synchronized (this) {
                try {
                    if (!this.f350073c) {
                        Object objZza = this.f350072b.zza();
                        this.f350074d = objZza;
                        this.f350073c = true;
                        return objZza;
                    }
                } finally {
                }
            }
        }
        return this.f350074d;
    }
}
