package com.google.android.gms.common.internal.service;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.C36634e;

/* compiled from: com.google.android.gms:play-services-base@@18.3.0 */
/* loaded from: classes6.dex */
final class e extends b {

    /* renamed from: a, reason: collision with root package name */
    public final C36634e.b f349459a;

    public e(C36634e.b bVar) {
        this.f349459a = bVar;
    }

    @Override // com.google.android.gms.common.internal.service.b, com.google.android.gms.common.internal.service.l
    public final void y2(int i12) {
        this.f349459a.setResult(new Status(i12, null, null, null));
    }
}
