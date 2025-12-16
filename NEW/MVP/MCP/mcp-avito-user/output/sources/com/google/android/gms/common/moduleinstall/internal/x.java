package com.google.android.gms.common.moduleinstall.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.InterfaceC36652k;
import com.google.android.gms.tasks.C37028k;

/* compiled from: com.google.android.gms:play-services-base@@18.3.0 */
/* loaded from: classes6.dex */
final class x extends InterfaceC36652k.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C37028k f349538a;

    public x(C37028k c37028k) {
        this.f349538a = c37028k;
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC36652k
    public final void onResult(Status status) {
        com.google.android.gms.common.api.internal.B.b(status, Boolean.TRUE, this.f349538a);
    }
}
