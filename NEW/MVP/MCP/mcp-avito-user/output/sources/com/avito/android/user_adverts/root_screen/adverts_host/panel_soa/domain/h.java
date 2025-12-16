package com.avito.android.user_adverts.root_screen.adverts_host.panel_soa.domain;

import dagger.internal.x;
import dagger.internal.y;
import java.util.Locale;
import javax.inject.Provider;

/* compiled from: SoaPriceFormatter_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes5.dex */
public final class h implements dagger.internal.h<g> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<Locale> f313473a;

    public h(Provider<Locale> provider) {
        this.f313473a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new g(this.f313473a.get());
    }
}
