package com.avito.android.service_orders.mvi.domain;

import Ju0.InterfaceC14251a;
import Su0.C15227c;
import com.avito.android.B2;
import com.avito.android.preloading.coroutines.AbstractC33302a;
import com.avito.android.remote.model.TypedResult;
import com.avito.android.service_orders.ServiceOrdersArguments;
import com.avito.android.util.R0;
import dagger.internal.l;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: ServiceOrdersListInteractorImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class h implements dagger.internal.h<g> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<AbstractC33302a<String, TypedResult<C15227c>>> f279513a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.service_orders.list.d> f279514b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<R0> f279515c;

    /* renamed from: d, reason: collision with root package name */
    public final l f279516d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<B2> f279517e;

    /* renamed from: f, reason: collision with root package name */
    public final u f279518f;

    public h(l lVar, u uVar, Provider provider, Provider provider2, Provider provider3, Provider provider4) {
        this.f279513a = provider;
        this.f279514b = provider2;
        this.f279515c = provider3;
        this.f279516d = lVar;
        this.f279517e = provider4;
        this.f279518f = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new g(this.f279513a.get(), this.f279514b.get(), this.f279515c.get(), (ServiceOrdersArguments) this.f279516d.f393949a, this.f279517e.get(), (InterfaceC14251a) this.f279518f.get());
    }
}
