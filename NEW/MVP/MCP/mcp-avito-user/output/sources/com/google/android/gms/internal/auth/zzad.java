package com.google.android.gms.internal.auth;

import android.accounts.Account;
import com.google.android.gms.common.api.Status;
import j.P;

/* compiled from: com.google.android.gms:play-services-auth-base@@18.0.10 */
/* loaded from: classes6.dex */
final class zzad extends zzah {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ zzae f349997a;

    public zzad(zzae zzaeVar) {
        this.f349997a = zzaeVar;
    }

    @Override // com.google.android.gms.internal.auth.zzah, com.google.android.gms.auth.account.e
    public final void zzb(@P Account account) {
        this.f349997a.setResult((zzae) new zzai(account != null ? Status.f348900f : zzal.f350006a, account));
    }
}
