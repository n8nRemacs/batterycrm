package com.avito.android.mortgage_invite.participant.mvi;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: ParticipantBootstrap_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class l implements dagger.internal.h<k> {

    /* renamed from: a, reason: collision with root package name */
    public final u f206232a;

    public l(u uVar) {
        this.f206232a = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new k((com.avito.android.mortgage_invite.participant.interactor.d) this.f206232a.get());
    }
}
