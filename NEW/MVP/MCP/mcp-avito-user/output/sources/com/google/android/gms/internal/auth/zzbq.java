package com.google.android.gms.internal.auth;

import com.google.android.gms.auth.api.proxy.ProxyRequest;
import com.google.android.gms.common.api.i;

/* compiled from: com.google.android.gms:play-services-auth-base@@18.0.10 */
/* loaded from: classes6.dex */
final class zzbq extends zzbi {

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ ProxyRequest f350017r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzbq(i iVar, ProxyRequest proxyRequest) {
        super(iVar);
        this.f350017r = proxyRequest;
    }

    @Override // com.google.android.gms.internal.auth.zzbi
    public final void d(zzbh zzbhVar) {
        zzbhVar.zze(new zzbp(this), this.f350017r);
    }
}
