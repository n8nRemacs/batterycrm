package com.avito.android.tariff_cpt.configure.creation.deeplink;

import com.avito.android.deeplink_handler.view.a;
import com.avito.android.util.InterfaceC35745a5;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: CptCreationDeeplinkHandler_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class f implements dagger.internal.h<e> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<JC0.a> f297578a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f297579b;

    /* renamed from: c, reason: collision with root package name */
    public final dagger.internal.f f297580c;

    /* renamed from: d, reason: collision with root package name */
    public final dv.b f297581d;

    /* renamed from: e, reason: collision with root package name */
    public final dv.b f297582e;

    /* renamed from: f, reason: collision with root package name */
    public final dv.b f297583f;

    public f(Provider provider, Provider provider2, dagger.internal.f fVar, dv.b bVar, dv.b bVar2, dv.b bVar3) {
        this.f297578a = provider;
        this.f297579b = provider2;
        this.f297580c = fVar;
        this.f297581d = bVar;
        this.f297582e = bVar2;
        this.f297583f = bVar3;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new e(this.f297578a.get(), this.f297579b.get(), (com.avito.android.deeplink_handler.handler.composite.a) this.f297580c.get(), (a.g) this.f297581d.get(), (a.i) this.f297582e.get(), (a.InterfaceC4053a) this.f297583f.get());
    }
}
