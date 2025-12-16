package com.avito.android.user_address.suggest.domain;

import dagger.internal.g;
import dagger.internal.h;
import dagger.internal.w;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: UserAddressSuggestInteractorImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class e implements h<d> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<TG0.a> f308059a;

    public e(Provider<TG0.a> provider) {
        this.f308059a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new d(g.a(w.a(this.f308059a)));
    }
}
