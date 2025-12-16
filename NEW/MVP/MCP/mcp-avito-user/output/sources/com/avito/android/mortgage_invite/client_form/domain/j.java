package com.avito.android.mortgage_invite.client_form.domain;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import e20.InterfaceC39928a;
import javax.inject.Provider;

/* compiled from: CreateParticipantUseCase_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class j implements dagger.internal.h<i> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC39928a> f205172a;

    /* renamed from: b, reason: collision with root package name */
    public final u f205173b;

    public j(u uVar, Provider provider) {
        this.f205172a = provider;
        this.f205173b = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new i(this.f205172a.get(), (com.avito.android.mortgage_invite.client_form.domain.mapper.a) this.f205173b.get());
    }
}
