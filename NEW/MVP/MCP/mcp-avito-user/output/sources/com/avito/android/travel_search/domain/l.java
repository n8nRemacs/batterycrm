package com.avito.android.travel_search.domain;

import com.avito.android.remote.model.SearchParamsConverter;
import com.avito.android.util.R0;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;
import sF0.InterfaceC48043a;

/* compiled from: TravelSearchInteractorImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class l implements dagger.internal.h<i> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC48043a> f303112a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<R0> f303113b;

    /* renamed from: c, reason: collision with root package name */
    public final u f303114c;

    public l(u uVar, Provider provider, Provider provider2) {
        this.f303112a = provider;
        this.f303113b = provider2;
        this.f303114c = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new i(this.f303112a.get(), this.f303113b.get(), (SearchParamsConverter) this.f303114c.get());
    }
}
