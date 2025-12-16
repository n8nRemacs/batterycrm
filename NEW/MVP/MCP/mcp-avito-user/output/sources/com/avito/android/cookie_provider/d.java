package com.avito.android.cookie_provider;

import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: CookieExpiredTimeImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class d implements dagger.internal.h<c> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.server_time.f> f126172a;

    public d(Provider<com.avito.android.server_time.f> provider) {
        this.f126172a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new c(this.f126172a.get());
    }
}
