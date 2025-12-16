package com.avito.android.passport.auth_suggest.mvi;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import java.util.Set;
import javax.inject.Provider;

/* compiled from: PassportAuthSuggestActor_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class c implements dagger.internal.h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<I50.a> f211026a;

    /* renamed from: b, reason: collision with root package name */
    public final u f211027b;

    public c(u uVar, Provider provider) {
        this.f211026a = provider;
        this.f211027b = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new b(this.f211026a.get(), (Set) this.f211027b.get());
    }
}
