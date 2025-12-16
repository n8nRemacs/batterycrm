package com.avito.android.job.interview.mvi.logics;

import dagger.internal.x;
import dagger.internal.y;

/* compiled from: JobInterviewInvitationActor_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes14.dex */
public final class c implements dagger.internal.h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.job.interview.domain.h f174602a;

    public c(com.avito.android.job.interview.domain.h hVar) {
        this.f174602a = hVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a((com.avito.android.job.interview.domain.e) this.f174602a.get());
    }
}
