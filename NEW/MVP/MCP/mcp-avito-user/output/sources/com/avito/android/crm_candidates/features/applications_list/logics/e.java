package com.avito.android.crm_candidates.features.applications_list.logics;

import Os.InterfaceC14731a;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: JobCrmApplicationsListBootstrap_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class e implements dagger.internal.h<d> {

    /* renamed from: a, reason: collision with root package name */
    public final u f129525a;

    public e(u uVar) {
        this.f129525a = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new d((InterfaceC14731a) this.f129525a.get());
    }
}
