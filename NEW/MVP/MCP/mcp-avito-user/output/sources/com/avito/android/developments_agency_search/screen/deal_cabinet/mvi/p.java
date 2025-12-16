package com.avito.android.developments_agency_search.screen.deal_cabinet.mvi;

import d20.C39487a;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: DealCabinetOneTimeEventProducer_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class p implements dagger.internal.h<o> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<C39487a> f137153a;

    public p(Provider<C39487a> provider) {
        this.f137153a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new o(this.f137153a.get());
    }
}
