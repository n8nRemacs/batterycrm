package com.avito.android.job.interview.mvi.logics;

import dagger.internal.x;
import dagger.internal.y;

/* compiled from: JobInterviewInvitationBootstrap_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes14.dex */
public final class e implements dagger.internal.h<d> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.job.interview.domain.h f174607a;

    public e(com.avito.android.job.interview.domain.h hVar) {
        this.f174607a = hVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new d((com.avito.android.job.interview.domain.e) this.f174607a.get());
    }
}
