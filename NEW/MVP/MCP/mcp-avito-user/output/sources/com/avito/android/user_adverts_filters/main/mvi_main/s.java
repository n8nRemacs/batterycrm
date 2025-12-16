package com.avito.android.user_adverts_filters.main.mvi_main;

import gj.InterfaceC40691b;
import javax.inject.Provider;

/* compiled from: MainFiltersActor_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes5.dex */
public final class s implements dagger.internal.h<r> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.user_adverts_filters.main.domain.c f316311a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.user_adverts_filters.main.action.c> f316312b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<com.avito.android.user_adverts_filters.main.action.a> f316313c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<InterfaceC40691b> f316314d;

    public s(com.avito.android.user_adverts_filters.main.domain.c cVar, Provider provider, Provider provider2, Provider provider3) {
        this.f316311a = cVar;
        this.f316312b = provider;
        this.f316313c = provider2;
        this.f316314d = provider3;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new r((com.avito.android.user_adverts_filters.main.domain.a) this.f316311a.get(), this.f316312b.get(), this.f316313c.get(), this.f316314d.get());
    }
}
