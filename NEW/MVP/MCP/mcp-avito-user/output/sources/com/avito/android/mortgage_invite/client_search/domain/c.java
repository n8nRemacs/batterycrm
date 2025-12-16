package com.avito.android.mortgage_invite.client_search.domain;

import com.avito.android.util.R0;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import e20.InterfaceC39928a;
import javax.inject.Provider;

/* compiled from: ClientSearchLoadPageUseCase_Factory.java */
@e
@y
@x
/* loaded from: classes15.dex */
public final class c implements h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC39928a> f205381a;

    /* renamed from: b, reason: collision with root package name */
    public final V10.c f205382b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<R0> f205383c;

    public c(Provider provider, V10.c cVar, Provider provider2) {
        this.f205381a = provider;
        this.f205382b = cVar;
        this.f205383c = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new b(this.f205381a.get(), (V10.a) this.f205382b.get(), this.f205383c.get());
    }
}
