package com.avito.android.crm_candidates.domain;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: JobCrmCandidatesMapperImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class q implements dagger.internal.h<p> {

    /* renamed from: a, reason: collision with root package name */
    public final u f129419a;

    public q(u uVar) {
        this.f129419a = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new p((com.avito.android.date_time_formatter.b) this.f129419a.get());
    }
}
