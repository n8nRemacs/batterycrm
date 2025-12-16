package com.avito.android.verification.links.restore;

import com.avito.android.deeplink_handler.view.a;
import com.avito.android.util.InterfaceC35745a5;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: VerificationRestoreLinkAsyncHandler_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes5.dex */
public final class f implements dagger.internal.h<e> {

    /* renamed from: a, reason: collision with root package name */
    public final h f324396a;

    /* renamed from: b, reason: collision with root package name */
    public final dv.b f324397b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f324398c;

    /* renamed from: d, reason: collision with root package name */
    public final dv.b f324399d;

    /* renamed from: e, reason: collision with root package name */
    public final dagger.internal.f f324400e;

    public f(h hVar, dv.b bVar, Provider provider, dv.b bVar2, dagger.internal.f fVar) {
        this.f324396a = hVar;
        this.f324397b = bVar;
        this.f324398c = provider;
        this.f324399d = bVar2;
        this.f324400e = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new e((g) this.f324396a.get(), (a.g) this.f324397b.get(), this.f324398c.get(), (a.i) this.f324399d.get(), (com.avito.android.deeplink_handler.handler.composite.a) this.f324400e.get());
    }
}
