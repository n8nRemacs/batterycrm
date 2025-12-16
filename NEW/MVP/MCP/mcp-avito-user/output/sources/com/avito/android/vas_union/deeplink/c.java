package com.avito.android.vas_union.deeplink;

import com.avito.android.deeplink_handler.view.a;
import com.avito.android.util.R0;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;
import sM0.InterfaceC48073a;

/* compiled from: VasUnionContextDeeplinkHandler_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes5.dex */
public final class c implements h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC48073a> f323139a;

    /* renamed from: b, reason: collision with root package name */
    public final dv.b f323140b;

    /* renamed from: c, reason: collision with root package name */
    public final dv.b f323141c;

    /* renamed from: d, reason: collision with root package name */
    public final dagger.internal.f f323142d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<R0> f323143e;

    public c(dagger.internal.f fVar, dv.b bVar, dv.b bVar2, Provider provider, Provider provider2) {
        this.f323139a = provider;
        this.f323140b = bVar;
        this.f323141c = bVar2;
        this.f323142d = fVar;
        this.f323143e = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new b(this.f323139a.get(), (a.g) this.f323140b.get(), (a.i) this.f323141c.get(), (com.avito.android.deeplink_handler.handler.composite.a) this.f323142d.get(), this.f323143e.get());
    }
}
