package com.avito.android.auto_select.deeplink;

import Hr.InterfaceC14024a;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.util.R0;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: AutoSelectContactMeLinkHandler_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes11.dex */
public final class p implements dagger.internal.h<n> {

    /* renamed from: a, reason: collision with root package name */
    public final dv.b f96066a;

    /* renamed from: b, reason: collision with root package name */
    public final dv.b f96067b;

    /* renamed from: c, reason: collision with root package name */
    public final dagger.internal.f f96068c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<InterfaceC14024a> f96069d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<R0> f96070e;

    public p(dagger.internal.f fVar, dv.b bVar, dv.b bVar2, Provider provider, Provider provider2) {
        this.f96066a = bVar;
        this.f96067b = bVar2;
        this.f96068c = fVar;
        this.f96069d = provider;
        this.f96070e = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new n((a.d) this.f96066a.get(), (a.f) this.f96067b.get(), (com.avito.android.deeplink_handler.handler.composite.a) this.f96068c.get(), this.f96069d.get(), this.f96070e.get());
    }
}
