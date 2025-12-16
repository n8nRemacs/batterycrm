package com.avito.android.user_adverts_filters.main.vm;

import com.avito.android.user_adverts_filters.main.mvi_delegate.B;
import com.avito.android.user_adverts_filters.main.vm.a;
import com.avito.android.util.R0;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: UserAdvertsFiltersDelegateMviViewModel_Factory_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes5.dex */
public final class d implements dagger.internal.h<a.C9825a> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<R0> f316385a;

    /* renamed from: b, reason: collision with root package name */
    public final B f316386b;

    public d(Provider provider, B b12) {
        this.f316385a = provider;
        this.f316386b = b12;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a.C9825a(this.f316385a.get(), this.f316386b);
    }
}
