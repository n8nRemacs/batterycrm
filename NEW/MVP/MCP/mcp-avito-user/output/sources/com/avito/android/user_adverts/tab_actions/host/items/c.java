package com.avito.android.user_adverts.tab_actions.host.items;

import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: UserAdvertActionItemBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes5.dex */
public final class c implements dagger.internal.h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<e> f314326a;

    public c(Provider<e> provider) {
        this.f314326a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new b(this.f314326a.get());
    }
}
