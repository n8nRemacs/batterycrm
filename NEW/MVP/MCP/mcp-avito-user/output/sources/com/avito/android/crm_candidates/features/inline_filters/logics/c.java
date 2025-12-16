package com.avito.android.crm_candidates.features.inline_filters.logics;

import Ss.InterfaceC15218a;
import com.avito.android.account.E;
import com.avito.android.analytics.InterfaceC28373a;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: JobCrmInlineFiltersActor_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class c implements dagger.internal.h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC15218a> f129640a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC28373a> f129641b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<E> f129642c;

    public c(Provider<InterfaceC15218a> provider, Provider<InterfaceC28373a> provider2, Provider<E> provider3) {
        this.f129640a = provider;
        this.f129641b = provider2;
        this.f129642c = provider3;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new b(this.f129640a.get(), this.f129641b.get(), this.f129642c.get());
    }
}
