package com.avito.android.comfortable_deal.deal.player;

import aq.InterfaceC23651a;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: AudioPlayerInteractorImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class p implements dagger.internal.h<m> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC23651a> f121801a;

    /* renamed from: b, reason: collision with root package name */
    public final u f121802b;

    public p(u uVar, Provider provider) {
        this.f121801a = provider;
        this.f121802b = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new m(this.f121801a.get(), (a) this.f121802b.get());
    }
}
