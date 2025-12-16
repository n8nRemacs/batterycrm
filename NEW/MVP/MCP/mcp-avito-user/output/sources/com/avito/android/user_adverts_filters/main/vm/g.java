package com.avito.android.user_adverts_filters.main.vm;

import com.avito.android.user_adverts_filters.main.vm.e;
import com.avito.android.util.R0;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: UserAdvertsFiltersMainDelegateMviViewModel_Factory_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes5.dex */
public final class g implements dagger.internal.h<e.a> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<R0> f316397a;

    /* renamed from: b, reason: collision with root package name */
    public final com.avito.android.user_adverts_filters.main.mvi_main.x f316398b;

    public g(Provider provider, com.avito.android.user_adverts_filters.main.mvi_main.x xVar) {
        this.f316397a = provider;
        this.f316398b = xVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new e.a(this.f316397a.get(), (com.avito.android.user_adverts_filters.main.mvi_main.w) this.f316398b.get());
    }
}
