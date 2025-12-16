package com.avito.android.auto_loans_cabinet.mvi;

import com.avito.android.analytics.InterfaceC28373a;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: AutoLoansCabinetActor_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes11.dex */
public final class f implements dagger.internal.h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC28373a> f95488a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.deep_linking.x> f95489b;

    /* renamed from: c, reason: collision with root package name */
    public final com.avito.android.auto_loans_cabinet.domain.c f95490c;

    public f(Provider provider, Provider provider2, com.avito.android.auto_loans_cabinet.domain.c cVar) {
        this.f95488a = provider;
        this.f95489b = provider2;
        this.f95490c = cVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a(this.f95488a.get(), this.f95489b.get(), (com.avito.android.auto_loans_cabinet.domain.a) this.f95490c.get());
    }
}
