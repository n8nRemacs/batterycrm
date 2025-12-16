package com.avito.android.authorization.auth.auth_socials;

import com.avito.android.analytics.InterfaceC28373a;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: AuthSocialsActor_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes11.dex */
public final class b implements dagger.internal.h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC28373a> f92884a;

    public b(Provider<InterfaceC28373a> provider) {
        this.f92884a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a(this.f92884a.get());
    }
}
