package com.avito.android.mortgage_invite.participant.mvi;

import dagger.internal.x;
import dagger.internal.y;

/* compiled from: ParticipantReducer_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class s implements dagger.internal.h<r> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.mortgage_invite.participant.mvi.builder.c f206245a;

    public s(com.avito.android.mortgage_invite.participant.mvi.builder.c cVar) {
        this.f206245a = cVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new r((com.avito.android.mortgage_invite.participant.mvi.builder.a) this.f206245a.get());
    }
}
