package com.google.android.gms.internal.auth;

import com.google.android.gms.auth.AccountChangeEventsResponse;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.C37028k;
import j.P;

/* compiled from: com.google.android.gms:play-services-auth-base@@18.0.10 */
/* loaded from: classes6.dex */
final class zzz extends zzl {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C37028k f350194a;

    public zzz(C37028k c37028k) {
        this.f350194a = c37028k;
    }

    @Override // com.google.android.gms.internal.auth.zzm
    public final void zzb(Status status, @P AccountChangeEventsResponse accountChangeEventsResponse) {
        zzab.d(status, accountChangeEventsResponse, this.f350194a);
    }
}
