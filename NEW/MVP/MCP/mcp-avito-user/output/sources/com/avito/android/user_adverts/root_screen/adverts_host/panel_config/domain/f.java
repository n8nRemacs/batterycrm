package com.avito.android.user_adverts.root_screen.adverts_host.panel_config.domain;

import com.avito.android.util.R0;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: ItemsConfigNpsStorageImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes5.dex */
public final class f implements dagger.internal.h<e> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<R0> f313264a;

    /* renamed from: b, reason: collision with root package name */
    public final com.avito.android.user_adverts.root_screen.adverts_host.ux_feedback.i f313265b;

    public f(Provider provider, com.avito.android.user_adverts.root_screen.adverts_host.ux_feedback.i iVar) {
        this.f313264a = provider;
        this.f313265b = iVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new e(this.f313264a.get(), (com.avito.android.user_adverts.root_screen.adverts_host.ux_feedback.g) this.f313265b.get());
    }
}
