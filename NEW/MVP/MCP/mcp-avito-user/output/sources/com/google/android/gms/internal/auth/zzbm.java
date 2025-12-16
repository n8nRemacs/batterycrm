package com.google.android.gms.internal.auth;

import com.google.android.gms.auth.api.proxy.ProxyResponse;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.B;
import com.google.android.gms.tasks.C37028k;

/* compiled from: com.google.android.gms:play-services-auth-base@@18.0.10 */
/* loaded from: classes6.dex */
final class zzbm extends zzbd {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C37028k f350014a;

    public zzbm(C37028k c37028k) {
        this.f350014a = c37028k;
    }

    @Override // com.google.android.gms.internal.auth.zzbd, com.google.android.gms.internal.auth.zzbg
    public final void zzb(ProxyResponse proxyResponse) {
        B.a(new Status(proxyResponse.f348714b, null, null, null), proxyResponse, this.f350014a);
    }
}
