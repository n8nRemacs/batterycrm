package com.avito.android.mortgage_invite.participant.mvi;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: ParticipantActor_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class j implements dagger.internal.h<i> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.mortgage_invite.participant.domain.validation.o f206224a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.mortgage_invite.participant.interactor.d> f206225b;

    /* renamed from: c, reason: collision with root package name */
    public final u f206226c;

    public j(com.avito.android.mortgage_invite.participant.domain.validation.o oVar, Provider provider, u uVar) {
        this.f206224a = oVar;
        this.f206225b = provider;
        this.f206226c = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new i((com.avito.android.mortgage_invite.participant.domain.validation.n) this.f206224a.get(), this.f206225b.get(), (com.avito.android.mortgage_invite.participant.interactor.a) this.f206226c.get());
    }
}
