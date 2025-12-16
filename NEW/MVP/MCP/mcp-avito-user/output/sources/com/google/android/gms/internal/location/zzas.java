package com.google.android.gms.internal.location;

import com.google.android.gms.common.api.internal.C36658n;
import j.B;

/* compiled from: com.google.android.gms:play-services-location@@21.0.1 */
/* loaded from: classes6.dex */
final class zzas implements zzcs {

    /* renamed from: a, reason: collision with root package name */
    @B
    public C36658n f350453a;

    public zzas(C36658n c36658n) {
        this.f350453a = c36658n;
    }

    @Override // com.google.android.gms.internal.location.zzcs
    public final synchronized C36658n zza() {
        return this.f350453a;
    }

    @Override // com.google.android.gms.internal.location.zzcs
    public final synchronized void zzc(C36658n c36658n) {
        C36658n c36658n2 = this.f350453a;
        if (c36658n2 != c36658n) {
            c36658n2.a();
            this.f350453a = c36658n;
        }
    }

    @Override // com.google.android.gms.internal.location.zzcs
    public final void zzb() {
    }
}
