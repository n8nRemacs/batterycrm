package com.avito.android.crm_candidates.features.applications_list.logics;

import Os.InterfaceC14731a;
import com.avito.android.account.E;
import com.avito.android.analytics.InterfaceC28373a;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: JobCrmApplicationsListActor_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class c implements dagger.internal.h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final u f129517a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.deeplink_handler.handler.composite.a> f129518b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<InterfaceC28373a> f129519c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<E> f129520d;

    public c(u uVar, Provider provider, Provider provider2, Provider provider3) {
        this.f129517a = uVar;
        this.f129518b = provider;
        this.f129519c = provider2;
        this.f129520d = provider3;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a((InterfaceC14731a) this.f129517a.get(), this.f129518b.get(), this.f129519c.get(), this.f129520d.get());
    }
}
