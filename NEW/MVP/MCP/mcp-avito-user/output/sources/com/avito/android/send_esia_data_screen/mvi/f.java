package com.avito.android.send_esia_data_screen.mvi;

import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: SendEsiaDataActor_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class f implements dagger.internal.h<e> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.deeplink_handler.handler.composite.a> f268275a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.deep_linking.x> f268276b;

    /* renamed from: c, reason: collision with root package name */
    public final com.avito.android.send_esia_data_screen.domain.b f268277c;

    public f(Provider provider, Provider provider2, com.avito.android.send_esia_data_screen.domain.b bVar) {
        this.f268275a = provider;
        this.f268276b = provider2;
        this.f268277c = bVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new e(this.f268275a.get(), this.f268276b.get(), (com.avito.android.send_esia_data_screen.domain.a) this.f268277c.get());
    }
}
