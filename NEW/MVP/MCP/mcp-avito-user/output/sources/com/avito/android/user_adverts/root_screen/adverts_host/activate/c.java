package com.avito.android.user_adverts.root_screen.adverts_host.activate;

import com.avito.android.util.R0;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: ProfileUserItemsActivateLinkHandler_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes5.dex */
public final class c implements h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.user_adverts.tab_actions.host.domain.d f312371a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<R0> f312372b;

    public c(com.avito.android.user_adverts.tab_actions.host.domain.d dVar, Provider provider) {
        this.f312371a = dVar;
        this.f312372b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new b((com.avito.android.user_adverts.tab_actions.host.domain.a) this.f312371a.get(), this.f312372b.get());
    }
}
