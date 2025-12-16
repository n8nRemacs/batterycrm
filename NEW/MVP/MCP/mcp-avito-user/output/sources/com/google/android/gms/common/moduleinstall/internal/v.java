package com.google.android.gms.common.moduleinstall.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.moduleinstall.ModuleInstallResponse;
import com.google.android.gms.tasks.C37028k;
import j.P;

/* compiled from: com.google.android.gms:play-services-base@@18.3.0 */
/* loaded from: classes6.dex */
final class v extends BinderC36738a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C37028k f349533a;

    public v(C37028k c37028k) {
        this.f349533a = c37028k;
    }

    @Override // com.google.android.gms.common.moduleinstall.internal.BinderC36738a, com.google.android.gms.common.moduleinstall.internal.g
    public final void y0(Status status, @P ModuleInstallResponse moduleInstallResponse) {
        com.google.android.gms.common.api.internal.B.b(status, moduleInstallResponse, this.f349533a);
    }
}
