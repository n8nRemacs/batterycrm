package com.google.android.gms.internal.auth;

import PX0.b;
import com.google.android.gms.auth.api.proxy.ProxyRequest;
import com.google.android.gms.common.api.i;
import com.google.android.gms.common.api.m;
import com.google.android.gms.common.internal.C36729v;

/* compiled from: com.google.android.gms:play-services-auth-base@@18.0.10 */
/* loaded from: classes6.dex */
public final class zzbt implements b {
    public final m<b.InterfaceC0849b> getSpatulaHeader(i iVar) {
        C36729v.j(iVar);
        return iVar.g(new zzbs(iVar));
    }

    public final m<b.a> performProxyRequest(i iVar, ProxyRequest proxyRequest) {
        C36729v.j(iVar);
        C36729v.j(proxyRequest);
        return iVar.g(new zzbq(iVar, proxyRequest));
    }
}
