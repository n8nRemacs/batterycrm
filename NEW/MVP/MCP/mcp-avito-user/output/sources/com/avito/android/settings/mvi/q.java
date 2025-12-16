package com.avito.android.settings.mvi;

import com.avito.android.account.E;
import com.avito.android.util.C;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: SettingsOneTimeEventProducer_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class q implements dagger.internal.h<p> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.settings.m f280956a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<C> f280957b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<E> f280958c;

    public q(com.avito.android.settings.m mVar, Provider provider, Provider provider2) {
        this.f280956a = mVar;
        this.f280957b = provider;
        this.f280958c = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new p((com.avito.android.settings.k) this.f280956a.get(), this.f280957b.get(), this.f280958c.get());
    }
}
