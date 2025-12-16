package com.avito.android.realty_agency.inline_filters.location_suggest.mvi;

import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;
import ni0.InterfaceC44430a;

/* compiled from: LocationSuggestInteractor_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class m implements dagger.internal.h<l> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC44430a> f251722a;

    public m(Provider<InterfaceC44430a> provider) {
        this.f251722a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new l(this.f251722a.get());
    }
}
