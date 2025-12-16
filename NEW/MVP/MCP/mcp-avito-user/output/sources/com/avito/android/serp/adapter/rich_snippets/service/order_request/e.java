package com.avito.android.serp.adapter.rich_snippets.service.order_request;

import com.avito.android.util.R0;
import dagger.internal.x;
import dagger.internal.y;
import gj.InterfaceC40691b;
import javax.inject.Provider;

/* compiled from: BxServiceItemOrderRequestInteractorImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class e implements dagger.internal.h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final j f271356a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC40691b> f271357b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<R0> f271358c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<com.avito.android.deep_linking.x> f271359d;

    public e(j jVar, Provider provider, Provider provider2, Provider provider3) {
        this.f271356a = jVar;
        this.f271357b = provider;
        this.f271358c = provider2;
        this.f271359d = provider3;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        this.f271356a.getClass();
        return new b(new i(), this.f271357b.get(), this.f271358c.get(), this.f271359d.get());
    }
}
