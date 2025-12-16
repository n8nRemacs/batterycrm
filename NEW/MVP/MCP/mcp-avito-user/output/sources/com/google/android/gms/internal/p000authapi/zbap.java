package com.google.android.gms.internal.p000authapi;

import android.app.PendingIntent;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.B;
import com.google.android.gms.tasks.C37028k;

/* compiled from: com.google.android.gms:play-services-auth@@21.1.1 */
/* loaded from: classes6.dex */
final class zbap extends zbo {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C37028k f349982a;

    public zbap(C37028k c37028k) {
        this.f349982a = c37028k;
    }

    @Override // com.google.android.gms.internal.p000authapi.zbp
    public final void zbb(Status status, PendingIntent pendingIntent) {
        B.a(status, pendingIntent, this.f349982a);
    }
}
