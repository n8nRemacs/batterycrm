package com.avito.android.virtual_deal_room_invite.invite.mvi;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;
import lO0.InterfaceC43664a;

/* compiled from: InviteActor_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes5.dex */
public final class d implements dagger.internal.h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final u f327051a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC43664a> f327052b;

    public d(u uVar, Provider provider) {
        this.f327051a = uVar;
        this.f327052b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new b((com.avito.android.virtual_deal_room_invite.invite.interactor.a) this.f327051a.get(), this.f327052b.get());
    }
}
