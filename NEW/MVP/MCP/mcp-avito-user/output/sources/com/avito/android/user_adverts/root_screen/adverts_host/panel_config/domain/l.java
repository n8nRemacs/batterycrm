package com.avito.android.user_adverts.root_screen.adverts_host.panel_config.domain;

import com.avito.android.util.R0;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: ItemsConfigStorageImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes5.dex */
public final class l implements dagger.internal.h<j> {

    /* renamed from: a, reason: collision with root package name */
    public final u f313289a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<R0> f313290b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<com.avito.android.server_time.f> f313291c;

    public l(u uVar, Provider provider, Provider provider2) {
        this.f313289a = uVar;
        this.f313290b = provider;
        this.f313291c = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new j((cK0.b) this.f313289a.get(), this.f313290b.get(), this.f313291c.get());
    }
}
