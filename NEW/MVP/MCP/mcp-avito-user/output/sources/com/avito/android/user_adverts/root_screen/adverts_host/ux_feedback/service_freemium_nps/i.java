package com.avito.android.user_adverts.root_screen.adverts_host.ux_feedback.service_freemium_nps;

import AK0.l;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: ServicesFreemiumNpsStorage_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes5.dex */
public final class i implements dagger.internal.h<g> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<l> f314161a;

    public i(Provider<l> provider) {
        this.f314161a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new g(this.f314161a.get());
    }
}
