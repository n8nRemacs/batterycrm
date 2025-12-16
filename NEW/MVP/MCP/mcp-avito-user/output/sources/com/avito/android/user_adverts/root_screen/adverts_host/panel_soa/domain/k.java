package com.avito.android.user_adverts.root_screen.adverts_host.panel_soa.domain;

import com.avito.android.util.R0;
import dagger.internal.w;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;
import sI0.InterfaceC48055a;

/* compiled from: SoaStatsRemoteInfoInteractor_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes5.dex */
public final class k implements dagger.internal.h<j> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC48055a> f313484a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<R0> f313485b;

    public k(Provider<InterfaceC48055a> provider, Provider<R0> provider2) {
        this.f313484a = provider;
        this.f313485b = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new j(this.f313485b.get(), dagger.internal.g.a(w.a(this.f313484a)));
    }
}
