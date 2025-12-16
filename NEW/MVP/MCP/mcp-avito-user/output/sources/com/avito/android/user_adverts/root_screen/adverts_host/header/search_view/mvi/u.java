package com.avito.android.user_adverts.root_screen.adverts_host.header.search_view.mvi;

import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.util.R0;
import javax.inject.Provider;
import sI0.InterfaceC48055a;

/* compiled from: SearchActor_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes5.dex */
public final class u implements dagger.internal.h<C35571a> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC48055a> f312941a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<R0> f312942b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<CI0.a> f312943c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<InterfaceC28373a> f312944d;

    public u(Provider<InterfaceC48055a> provider, Provider<R0> provider2, Provider<CI0.a> provider3, Provider<InterfaceC28373a> provider4) {
        this.f312941a = provider;
        this.f312942b = provider2;
        this.f312943c = provider3;
        this.f312944d = provider4;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C35571a(this.f312941a.get(), this.f312942b.get(), this.f312943c.get(), this.f312944d.get());
    }
}
