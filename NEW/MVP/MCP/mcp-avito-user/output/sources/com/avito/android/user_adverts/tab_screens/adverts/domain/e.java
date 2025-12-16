package com.avito.android.user_adverts.tab_screens.adverts.domain;

import Wl0.InterfaceC15774a;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.util.R0;
import dagger.internal.g;
import dagger.internal.h;
import dagger.internal.w;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: UserAdvertsListInteractorImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes5.dex */
public final class e implements h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC15774a> f314978a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<R0> f314979b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<InterfaceC28373a> f314980c;

    public e(Provider<InterfaceC15774a> provider, Provider<R0> provider2, Provider<InterfaceC28373a> provider3) {
        this.f314978a = provider;
        this.f314979b = provider2;
        this.f314980c = provider3;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new b(g.a(w.a(this.f314978a)), this.f314979b.get(), this.f314980c.get());
    }
}
