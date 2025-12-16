package com.avito.android.mortgage_invite.client_form.domain.mapper;

import dagger.internal.h;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: CreateParticipantResponseMapperImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class c implements h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final u f205185a;

    public c(u uVar) {
        this.f205185a = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new b((com.avito.android.mortgage_invite.common.domain.a) this.f205185a.get());
    }
}
