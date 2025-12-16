package com.avito.android.recall_me.domain;

import com.avito.android.account.E;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;
import wi0.InterfaceC49632c;

/* compiled from: RecallMeV2InteractorImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class r implements dagger.internal.h<q> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC49632c> f251868a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<E> f251869b;

    public r(Provider<InterfaceC49632c> provider, Provider<E> provider2) {
        this.f251868a = provider;
        this.f251869b = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new q(this.f251868a.get(), this.f251869b.get());
    }
}
