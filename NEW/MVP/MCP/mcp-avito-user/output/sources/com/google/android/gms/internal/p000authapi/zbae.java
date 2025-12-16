package com.google.android.gms.internal.p000authapi;

import com.google.android.gms.auth.api.identity.SaveAccountLinkingTokenResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.C36695c;
import com.google.android.gms.tasks.C37028k;

/* compiled from: com.google.android.gms:play-services-auth@@21.1.1 */
/* loaded from: classes6.dex */
final class zbae extends zbs {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C37028k f349975a;

    public zbae(C37028k c37028k) {
        this.f349975a = c37028k;
    }

    @Override // com.google.android.gms.internal.p000authapi.zbt
    public final void zbb(Status status, SaveAccountLinkingTokenResult saveAccountLinkingTokenResult) {
        boolean zH2 = status.h();
        C37028k c37028k = this.f349975a;
        if (zH2) {
            c37028k.b(saveAccountLinkingTokenResult);
        } else {
            c37028k.a(C36695c.a(status));
        }
    }
}
