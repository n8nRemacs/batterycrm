package com.avito.android.user_adverts_filters.main.domain;

import com.avito.android.util.R0;
import dagger.internal.e;
import dagger.internal.g;
import dagger.internal.h;
import dagger.internal.w;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;
import sI0.InterfaceC48055a;

/* compiled from: UserAdvertsFiltersInteractorImpl_Factory.java */
@e
@y
@x
/* loaded from: classes5.dex */
public final class c implements h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC48055a> f316052a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<R0> f316053b;

    public c(Provider<InterfaceC48055a> provider, Provider<R0> provider2) {
        this.f316052a = provider;
        this.f316053b = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new b(this.f316053b.get(), g.a(w.a(this.f316052a)));
    }
}
