package com.avito.android.bxcontent.mvi.sources;

import com.avito.android.bxcontent.E1;
import dagger.internal.h;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: ServiceOrderRequestsDataSourceImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class f implements h<e> {

    /* renamed from: a, reason: collision with root package name */
    public final u f112562a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<Bu0.b> f112563b;

    /* renamed from: c, reason: collision with root package name */
    public final com.avito.android.serp.adapter.rich_snippets.service.order_request.e f112564c;

    public f(u uVar, Provider provider, com.avito.android.serp.adapter.rich_snippets.service.order_request.e eVar) {
        this.f112562a = uVar;
        this.f112563b = provider;
        this.f112564c = eVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new e((E1) this.f112562a.get(), this.f112563b.get(), (com.avito.android.serp.adapter.rich_snippets.service.order_request.a) this.f112564c.get());
    }
}
