package com.avito.android.mortgage_invite.client_form.domain;

import com.avito.android.util.R0;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import e20.InterfaceC39928a;
import javax.inject.Provider;

/* compiled from: LoadClientFormUseCaseImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class m implements dagger.internal.h<l> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC39928a> f205181a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<R0> f205182b;

    /* renamed from: c, reason: collision with root package name */
    public final u f205183c;

    public m(u uVar, Provider provider, Provider provider2) {
        this.f205181a = provider;
        this.f205182b = provider2;
        this.f205183c = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new l(this.f205181a.get(), this.f205182b.get(), (com.avito.android.mortgage_invite.client_form.domain.mapper.d) this.f205183c.get());
    }
}
