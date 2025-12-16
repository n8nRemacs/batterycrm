package com.avito.android.user_adverts.root_screen.adverts_host.shortcuts.domain;

import Wl0.InterfaceC15774a;
import com.avito.android.util.R0;
import dagger.internal.e;
import dagger.internal.g;
import dagger.internal.h;
import dagger.internal.w;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: UserAdvertsInteractorImpl_Factory.java */
@e
@y
@x
/* loaded from: classes5.dex */
public final class d implements h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC15774a> f313863a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<R0> f313864b;

    public d(Provider<InterfaceC15774a> provider, Provider<R0> provider2) {
        this.f313863a = provider;
        this.f313864b = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new b(this.f313864b.get(), g.a(w.a(this.f313863a)));
    }
}
