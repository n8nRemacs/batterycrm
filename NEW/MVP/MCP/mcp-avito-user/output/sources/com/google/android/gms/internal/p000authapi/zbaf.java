package com.google.android.gms.internal.p000authapi;

import com.google.android.gms.auth.api.identity.SavePasswordResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.B;
import com.google.android.gms.tasks.C37028k;

/* compiled from: com.google.android.gms:play-services-auth@@21.1.1 */
/* loaded from: classes6.dex */
final class zbaf extends zbu {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C37028k f349976a;

    public zbaf(C37028k c37028k) {
        this.f349976a = c37028k;
    }

    @Override // com.google.android.gms.internal.p000authapi.zbv
    public final void zbb(Status status, SavePasswordResult savePasswordResult) {
        B.a(status, savePasswordResult, this.f349976a);
    }
}
