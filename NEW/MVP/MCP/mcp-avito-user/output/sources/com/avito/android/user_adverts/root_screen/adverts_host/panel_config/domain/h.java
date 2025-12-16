package com.avito.android.user_adverts.root_screen.adverts_host.panel_config.domain;

import com.avito.android.util.R0;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;
import nE.C44240b;
import sI0.InterfaceC48055a;

/* compiled from: ItemsConfigRemoteInteractor_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes5.dex */
public final class h implements dagger.internal.h<g> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC48055a> f313280a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<R0> f313281b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<com.avito.android.service_booking_persistence.f> f313282c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<C44240b> f313283d;

    public h(Provider<InterfaceC48055a> provider, Provider<R0> provider2, Provider<com.avito.android.service_booking_persistence.f> provider3, Provider<C44240b> provider4) {
        this.f313280a = provider;
        this.f313281b = provider2;
        this.f313282c = provider3;
        this.f313283d = provider4;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new g(dagger.internal.g.b(this.f313280a), this.f313281b.get(), this.f313282c.get(), this.f313283d.get());
    }
}
