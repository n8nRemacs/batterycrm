package com.avito.android.virtual_deal_room_invite.invite.mvi;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: InviteBootstrap_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes5.dex */
public final class f implements dagger.internal.h<e> {

    /* renamed from: a, reason: collision with root package name */
    public final u f327083a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.virtual_deal_room_invite.invite.interactor.e> f327084b;

    public f(u uVar, Provider provider) {
        this.f327083a = uVar;
        this.f327084b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new e((com.avito.android.virtual_deal_room_invite.invite.interactor.a) this.f327083a.get(), this.f327084b.get());
    }
}
