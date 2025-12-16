package com.avito.android.developments_agency_search.screen.deal_cabinet.di;

import com.avito.android.developments_agency_search.screen.deal_cabinet.di.a;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;
import kotlin.reflect.n;

/* compiled from: DealCabinetModule_ProvideIsAddingClientsImplementedFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class g implements dagger.internal.h<Boolean> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.developments_agency_search.features.a> f136980a;

    public g(Provider<com.avito.android.developments_agency_search.features.a> provider) {
        this.f136980a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.developments_agency_search.features.a aVarH3 = ((a.b.f) this.f136980a).f136968a.h3();
        d.f136975a.getClass();
        n<Object> nVar = com.avito.android.developments_agency_search.features.a.f136535e[0];
        Boolean bool = (Boolean) aVarH3.f136536b.a().invoke();
        bool.getClass();
        return bool;
    }
}
