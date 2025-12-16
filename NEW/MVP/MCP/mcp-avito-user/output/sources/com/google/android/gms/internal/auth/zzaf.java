package com.google.android.gms.internal.auth;

import com.google.android.gms.common.api.Status;

/* compiled from: com.google.android.gms:play-services-auth-base@@18.0.10 */
/* loaded from: classes6.dex */
final class zzaf extends zzah {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ zzag f349999a;

    public zzaf(zzag zzagVar) {
        this.f349999a = zzagVar;
    }

    @Override // com.google.android.gms.internal.auth.zzah, com.google.android.gms.auth.account.e
    public final void zzc(boolean z12) {
        this.f349999a.setResult((zzag) new zzak(z12 ? Status.f348900f : zzal.f350006a));
    }
}
