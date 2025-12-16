package com.google.android.gms.common.moduleinstall.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.C36660o;
import com.google.android.gms.common.moduleinstall.ModuleInstallResponse;
import com.google.android.gms.tasks.C37028k;
import j.P;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-base@@18.3.0 */
/* loaded from: classes6.dex */
final class w extends BinderC36738a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AtomicReference f349534a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C37028k f349535b;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ VX0.a f349536p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ A f349537q;

    public w(A a12, AtomicReference atomicReference, C37028k c37028k, VX0.a aVar) {
        this.f349537q = a12;
        this.f349534a = atomicReference;
        this.f349535b = c37028k;
        this.f349536p = aVar;
    }

    @Override // com.google.android.gms.common.moduleinstall.internal.BinderC36738a, com.google.android.gms.common.moduleinstall.internal.g
    public final void y0(Status status, @P ModuleInstallResponse moduleInstallResponse) {
        if (moduleInstallResponse != null) {
            this.f349534a.set(moduleInstallResponse);
        }
        com.google.android.gms.common.api.internal.B.b(status, null, this.f349535b);
        if (!status.h() || (moduleInstallResponse != null && moduleInstallResponse.f349505c)) {
            this.f349537q.doUnregisterEventListener(C36660o.c(this.f349536p, VX0.a.class.getSimpleName()), 27306);
        }
    }
}
