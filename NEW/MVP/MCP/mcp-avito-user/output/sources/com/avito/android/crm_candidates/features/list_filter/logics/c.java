package com.avito.android.crm_candidates.features.list_filter.logics;

import Us.InterfaceC15563a;
import com.avito.android.account.E;
import com.avito.android.analytics.InterfaceC28373a;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: JobCrmListFilterActor_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class c implements dagger.internal.h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC15563a> f129690a;

    /* renamed from: b, reason: collision with root package name */
    public final u f129691b;

    /* renamed from: c, reason: collision with root package name */
    public final u f129692c;

    public c(u uVar, u uVar2, Provider provider) {
        this.f129690a = provider;
        this.f129691b = uVar;
        this.f129692c = uVar2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new b(this.f129690a.get(), (InterfaceC28373a) this.f129691b.get(), (E) this.f129692c.get());
    }
}
