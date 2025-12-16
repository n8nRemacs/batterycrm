package com.avito.android.safety.password_change.mvi;

import com.avito.android.account.E;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.safety.password_change.PasswordChangeParams;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: PasswordChangeBootstrap_Factory.java */
@dagger.internal.e
@y
@dagger.internal.x
/* loaded from: classes3.dex */
public final class l implements dagger.internal.h<k> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f257372a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC28373a> f257373b;

    /* renamed from: c, reason: collision with root package name */
    public final s f257374c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<E> f257375d;

    /* renamed from: e, reason: collision with root package name */
    public final dagger.internal.l f257376e;

    /* renamed from: f, reason: collision with root package name */
    public final Provider<com.avito.android.credman.f> f257377f;

    public l(dagger.internal.l lVar, Provider provider, s sVar, Provider provider2, dagger.internal.l lVar2, Provider provider3) {
        this.f257372a = lVar;
        this.f257373b = provider;
        this.f257374c = sVar;
        this.f257375d = provider2;
        this.f257376e = lVar2;
        this.f257377f = provider3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new k((PasswordChangeParams) this.f257372a.f393949a, this.f257373b.get(), (p) this.f257374c.get(), this.f257375d.get(), ((Boolean) this.f257376e.f393949a).booleanValue(), this.f257377f.get());
    }
}
