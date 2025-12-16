package com.avito.android.developments_agency_search.features;

import com.avito.android.C34161r;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: DevelopmentsAgencySearchFeaturesModule_ProvideDevelopmentsAgencySearchFeaturesFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class c implements h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<C34161r> f136540a;

    public c(Provider<C34161r> provider) {
        this.f136540a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        C34161r c34161r = this.f136540a.get();
        b.f136539a.getClass();
        return (a) c34161r.f246393a.b(a.class);
    }
}
