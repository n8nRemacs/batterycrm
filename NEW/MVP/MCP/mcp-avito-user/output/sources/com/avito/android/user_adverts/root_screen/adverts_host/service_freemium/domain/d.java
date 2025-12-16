package com.avito.android.user_adverts.root_screen.adverts_host.service_freemium.domain;

import bW.InterfaceC25571b;
import com.avito.android.user_adverts.root_screen.adverts_host.ux_feedback.service_freemium_nps.g;
import com.avito.android.user_adverts.root_screen.adverts_host.ux_feedback.service_freemium_nps.i;
import com.avito.android.util.R0;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: ServiceFreemiumNpsStorageImpl_Factory.java */
@e
@y
@x
/* loaded from: classes5.dex */
public final class d implements h<c> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<R0> f313845a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC25571b> f313846b;

    /* renamed from: c, reason: collision with root package name */
    public final i f313847c;

    public d(Provider provider, Provider provider2, i iVar) {
        this.f313845a = provider;
        this.f313846b = provider2;
        this.f313847c = iVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new c(this.f313845a.get(), this.f313846b.get(), (g) this.f313847c.get());
    }
}
