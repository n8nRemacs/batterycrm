package com.avito.android.safety.sessions.social_logout;

import com.avito.android.account.G;
import com.avito.android.remote.InterfaceC34243a1;
import com.avito.android.util.InterfaceC35745a5;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: SessionsSocialLogoutInteractorImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class h implements dagger.internal.h<g> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC34243a1> f258029a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.remote.error.f> f258030b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f258031c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<G> f258032d;

    public h(Provider<InterfaceC34243a1> provider, Provider<com.avito.android.remote.error.f> provider2, Provider<InterfaceC35745a5> provider3, Provider<G> provider4) {
        this.f258029a = provider;
        this.f258030b = provider2;
        this.f258031c = provider3;
        this.f258032d = provider4;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new g(this.f258029a.get(), this.f258030b.get(), this.f258031c.get(), this.f258032d.get());
    }
}
