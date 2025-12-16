package com.google.android.gms.internal.auth;

import com.google.android.gms.auth.api.proxy.ProxyResponse;

/* compiled from: com.google.android.gms:play-services-auth-base@@18.0.10 */
/* loaded from: classes6.dex */
final class zzbp extends zzbd {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ zzbq f350016a;

    public zzbp(zzbq zzbqVar) {
        this.f350016a = zzbqVar;
    }

    @Override // com.google.android.gms.internal.auth.zzbd, com.google.android.gms.internal.auth.zzbg
    public final void zzb(ProxyResponse proxyResponse) {
        this.f350016a.setResult((zzbq) new zzbu(proxyResponse));
    }
}
