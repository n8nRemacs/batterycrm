package com.avito.android.async_phone.impl_module.phone_request_link;

import ac.C19864a;
import com.avito.android.analytics.InterfaceC28373a;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: PhoneRequestDeepLinkAnalyticsInteractorImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes11.dex */
public final class c implements dagger.internal.h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.f f92151a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<C19864a> f92152b;

    public c(dagger.internal.f fVar, Provider provider) {
        this.f92151a = fVar;
        this.f92152b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new b((InterfaceC28373a) this.f92151a.get(), this.f92152b.get());
    }
}
