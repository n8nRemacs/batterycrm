package com.avito.android.category;

import com.avito.android.remote.V0;
import com.avito.android.remote.model.SearchParamsConverter;
import com.avito.android.util.R0;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: CategoryFlowInteractorImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class h implements dagger.internal.h<g> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.location.r> f116639a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<V0> f116640b;

    /* renamed from: c, reason: collision with root package name */
    public final u f116641c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<R0> f116642d;

    public h(u uVar, Provider provider, Provider provider2, Provider provider3) {
        this.f116639a = provider;
        this.f116640b = provider2;
        this.f116641c = uVar;
        this.f116642d = provider3;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new g(this.f116639a.get(), dagger.internal.g.b(this.f116640b), (SearchParamsConverter) this.f116641c.get(), this.f116642d.get());
    }
}
