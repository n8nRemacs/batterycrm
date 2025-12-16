package com.avito.android.crm_candidates.features.inline_filters.logics;

import Ss.InterfaceC15218a;
import Us.InterfaceC15563a;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: JobCrmInlineFiltersOneTimeEventProducer_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class l implements dagger.internal.h<k> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC15218a> f129667a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC15563a> f129668b;

    public l(Provider<InterfaceC15218a> provider, Provider<InterfaceC15563a> provider2) {
        this.f129667a = provider;
        this.f129668b = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new k(this.f129667a.get(), this.f129668b.get());
    }
}
