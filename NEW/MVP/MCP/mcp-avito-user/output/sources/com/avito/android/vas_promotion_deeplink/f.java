package com.avito.android.vas_promotion_deeplink;

import com.avito.android.deeplink_handler.view.a;
import com.avito.android.util.R0;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;
import nM0.InterfaceC44292a;

/* compiled from: VasPromotionDeepLinkHandler_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes5.dex */
public final class f implements dagger.internal.h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final dv.b f323078a;

    /* renamed from: b, reason: collision with root package name */
    public final dv.b f323079b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<R0> f323080c;

    /* renamed from: d, reason: collision with root package name */
    public final dagger.internal.f f323081d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<InterfaceC44292a> f323082e;

    public f(dagger.internal.f fVar, dv.b bVar, dv.b bVar2, Provider provider, Provider provider2) {
        this.f323078a = bVar;
        this.f323079b = bVar2;
        this.f323080c = provider;
        this.f323081d = fVar;
        this.f323082e = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new b((a.i) this.f323078a.get(), (a.g) this.f323079b.get(), this.f323080c.get(), (com.avito.android.deeplink_handler.handler.composite.a) this.f323081d.get(), this.f323082e.get());
    }
}
