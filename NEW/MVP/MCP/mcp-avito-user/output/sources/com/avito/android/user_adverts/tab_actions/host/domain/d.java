package com.avito.android.user_adverts.tab_actions.host.domain;

import bm0.InterfaceC25677b;
import com.avito.android.util.R0;
import dagger.internal.x;
import dagger.internal.y;
import dm0.InterfaceC39755a;
import javax.inject.Provider;

/* compiled from: UserAdvertsActionsInteractorImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes5.dex */
public final class d implements dagger.internal.h<c> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC25677b> f314250a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC39755a> f314251b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<R0> f314252c;

    public d(Provider<InterfaceC25677b> provider, Provider<InterfaceC39755a> provider2, Provider<R0> provider3) {
        this.f314250a = provider;
        this.f314251b = provider2;
        this.f314252c = provider3;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new c(this.f314252c.get(), dagger.internal.g.b(this.f314250a), dagger.internal.g.b(this.f314251b));
    }
}
