package com.avito.android.mortgage_invite.participant.interactor;

import com.avito.android.mortgage_invite.model.participant.ParticipantArguments;
import com.avito.android.util.R0;
import dagger.internal.h;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;
import e20.InterfaceC39928a;
import javax.inject.Provider;

/* compiled from: ParticipantsInteractorImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class g implements h<e> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.mortgage_invite.participant.domain.mapper.c f206160a;

    /* renamed from: b, reason: collision with root package name */
    public final l f206161b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<S10.c> f206162c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<InterfaceC39928a> f206163d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<R0> f206164e;

    public g(com.avito.android.mortgage_invite.participant.domain.mapper.c cVar, l lVar, Provider provider, Provider provider2, Provider provider3) {
        this.f206160a = cVar;
        this.f206161b = lVar;
        this.f206162c = provider;
        this.f206163d = provider2;
        this.f206164e = provider3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        this.f206160a.getClass();
        return new e(new com.avito.android.mortgage_invite.participant.domain.mapper.b(), (ParticipantArguments) this.f206161b.f393949a, this.f206162c.get(), this.f206163d.get(), this.f206164e.get());
    }
}
