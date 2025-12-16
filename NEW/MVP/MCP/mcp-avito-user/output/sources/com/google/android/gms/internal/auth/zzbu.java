package com.google.android.gms.internal.auth;

import PX0.b;
import com.google.android.gms.auth.api.proxy.ProxyResponse;
import com.google.android.gms.common.api.Status;

/* compiled from: com.google.android.gms:play-services-auth-base@@18.0.10 */
/* loaded from: classes6.dex */
final class zzbu implements b.a {

    /* renamed from: b, reason: collision with root package name */
    public final Status f350019b;

    /* renamed from: c, reason: collision with root package name */
    public final ProxyResponse f350020c;

    public zzbu(Status status) {
        this.f350019b = status;
    }

    public final ProxyResponse getResponse() {
        return this.f350020c;
    }

    @Override // com.google.android.gms.common.api.r
    public final Status getStatus() {
        return this.f350019b;
    }

    public zzbu(ProxyResponse proxyResponse) {
        this.f350020c = proxyResponse;
        this.f350019b = Status.f348900f;
    }
}
