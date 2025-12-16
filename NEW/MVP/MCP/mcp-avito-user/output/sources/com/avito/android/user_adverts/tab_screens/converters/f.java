package com.avito.android.user_adverts.tab_screens.converters;

import Zx.C19616a;
import dagger.internal.w;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;
import nE.C44240b;

/* compiled from: UserAdvertConverterImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes5.dex */
public final class f implements dagger.internal.h<e> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<C44240b> f315783a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.position_in_search.storage.g> f315784b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<C19616a> f315785c;

    public f(Provider<C44240b> provider, Provider<com.avito.android.position_in_search.storage.g> provider2, Provider<C19616a> provider3) {
        this.f315783a = provider;
        this.f315784b = provider2;
        this.f315785c = provider3;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new e(this.f315783a.get(), dagger.internal.g.a(w.a(this.f315784b)), this.f315785c.get());
    }
}
