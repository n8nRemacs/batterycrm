package com.avito.android.user_adverts.tab_actions.host.items;

import com.avito.android.user_adverts.tab_actions.host.items.n;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: UserAdvertSingleActionItemPresenterImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes5.dex */
public final class q implements dagger.internal.h<p> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<n.a> f314347a;

    public q(Provider<n.a> provider) {
        this.f314347a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new p(this.f314347a.get());
    }
}
