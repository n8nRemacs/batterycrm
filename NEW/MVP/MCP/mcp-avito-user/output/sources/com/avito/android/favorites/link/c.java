package com.avito.android.favorites.link;

import com.avito.android.deeplink_handler.view.a;
import com.avito.android.util.InterfaceC35741a1;
import com.avito.android.util.R0;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: GetSimilarPushLinkHandler_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class c implements dagger.internal.h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final u f157402a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.f f157403b;

    /* renamed from: c, reason: collision with root package name */
    public final dv.b f157404c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<InterfaceC35741a1> f157405d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<R0> f157406e;

    public c(u uVar, dagger.internal.f fVar, dv.b bVar, Provider provider, Provider provider2) {
        this.f157402a = uVar;
        this.f157403b = fVar;
        this.f157404c = bVar;
        this.f157405d = provider;
        this.f157406e = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new b((f) this.f157402a.get(), (com.avito.android.deeplink_handler.handler.composite.a) this.f157403b.get(), (a.i) this.f157404c.get(), this.f157405d.get(), this.f157406e.get());
    }
}
