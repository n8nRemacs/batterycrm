package com.avito.android.user_adverts.root_screen.adverts_host.ux_feedback;

import AK0.l;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: ServicesSxNpsStorage_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes5.dex */
public final class i implements dagger.internal.h<g> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<l> f314158a;

    public i(Provider<l> provider) {
        this.f314158a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new g(this.f314158a.get());
    }
}
