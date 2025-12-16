package com.avito.android.crm_candidates.features.inline_filters.logics;

import Ss.InterfaceC15218a;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: JobCrmInlineFiltersBootstrap_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class e implements dagger.internal.h<d> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC15218a> f129647a;

    public e(Provider<InterfaceC15218a> provider) {
        this.f129647a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new d(this.f129647a.get());
    }
}
