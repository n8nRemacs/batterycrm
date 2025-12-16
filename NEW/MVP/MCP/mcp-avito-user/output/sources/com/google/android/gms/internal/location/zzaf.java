package com.google.android.gms.internal.location;

import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.B;
import com.google.android.gms.common.api.internal.C36634e;
import com.google.android.gms.common.internal.C36729v;
import com.google.android.gms.tasks.C37028k;
import j.P;

/* compiled from: com.google.android.gms:play-services-location@@21.0.1 */
/* loaded from: classes6.dex */
final class zzaf implements C36634e.b {

    /* renamed from: a, reason: collision with root package name */
    public final C37028k f350441a;

    public zzaf(C37028k c37028k) {
        C36729v.j(c37028k);
        this.f350441a = c37028k;
    }

    @Override // com.google.android.gms.common.api.internal.C36634e.b
    public final void setFailedResult(@P Status status) {
        if (status == null) {
            return;
        }
        this.f350441a.a(new ApiException(status));
    }

    @Override // com.google.android.gms.common.api.internal.C36634e.b
    public final /* synthetic */ void setResult(Object obj) {
        B.a((Status) obj, null, this.f350441a);
    }
}
