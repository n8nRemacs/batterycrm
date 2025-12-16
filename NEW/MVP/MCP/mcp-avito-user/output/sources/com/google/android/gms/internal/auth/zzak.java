package com.google.android.gms.internal.auth;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.r;

/* compiled from: com.google.android.gms:play-services-auth-base@@18.0.10 */
/* loaded from: classes6.dex */
final class zzak implements r {

    /* renamed from: b, reason: collision with root package name */
    public final Status f350005b;

    public zzak(Status status) {
        this.f350005b = status;
    }

    @Override // com.google.android.gms.common.api.r
    public final Status getStatus() {
        return this.f350005b;
    }
}
