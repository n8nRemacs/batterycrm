package com.avito.android.social.esia.mvi;

import dagger.internal.x;
import dagger.internal.y;
import hD.C40806a;
import javax.inject.Provider;

/* compiled from: EsiaEventProducer_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class h implements dagger.internal.h<g> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<C40806a> f284405a;

    /* renamed from: b, reason: collision with root package name */
    public final com.avito.android.social.esia.g f284406b;

    public h(Provider provider, com.avito.android.social.esia.g gVar) {
        this.f284405a = provider;
        this.f284406b = gVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new g(this.f284405a.get(), (com.avito.android.social.esia.f) this.f284406b.get());
    }
}
