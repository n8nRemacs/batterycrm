package com.avito.android.phones_actualization.deep_linking;

import android.content.SharedPreferences;
import com.avito.android.account.E;
import com.google.gson.Gson;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: PrefActualizePhonesRefreshStorage_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class q implements dagger.internal.h<p> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<SharedPreferences> f216216a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<E> f216217b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<Gson> f216218c;

    public q(Provider<SharedPreferences> provider, Provider<E> provider2, Provider<Gson> provider3) {
        this.f216216a = provider;
        this.f216217b = provider2;
        this.f216218c = provider3;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new p(this.f216216a.get(), this.f216217b.get(), this.f216218c.get());
    }
}
