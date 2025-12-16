package com.avito.android.user_adverts.tab_screens.converters;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: UserItemConverterImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes5.dex */
public final class l implements dagger.internal.h<k> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<d> f315807a;

    /* renamed from: b, reason: collision with root package name */
    public final u f315808b;

    public l(u uVar, Provider provider) {
        this.f315807a = provider;
        this.f315808b = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new k(this.f315807a.get(), (a) this.f315808b.get());
    }
}
