package com.avito.android.verification.links.remove;

import com.avito.android.deeplink_handler.view.a;
import com.avito.android.util.InterfaceC35745a5;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: VerificationRemoveLinkAsyncHandler_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes5.dex */
public final class f implements dagger.internal.h<e> {

    /* renamed from: a, reason: collision with root package name */
    public final h f324377a;

    /* renamed from: b, reason: collision with root package name */
    public final dv.b f324378b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f324379c;

    /* renamed from: d, reason: collision with root package name */
    public final dv.b f324380d;

    /* renamed from: e, reason: collision with root package name */
    public final dagger.internal.f f324381e;

    public f(h hVar, dv.b bVar, Provider provider, dv.b bVar2, dagger.internal.f fVar) {
        this.f324377a = hVar;
        this.f324378b = bVar;
        this.f324379c = provider;
        this.f324380d = bVar2;
        this.f324381e = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new e((g) this.f324377a.get(), (a.g) this.f324378b.get(), this.f324379c.get(), (a.i) this.f324380d.get(), (com.avito.android.deeplink_handler.handler.composite.a) this.f324381e.get());
    }
}
