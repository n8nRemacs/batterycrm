package com.avito.android.advert.item.beduin.v2.di;

import com.avito.android.lib.beduin_v2.component.exception.callback.c;
import com.avito.android.util.C;
import com.avito.beduin.v2.render.android_view.n;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: AdvertDetailsBeduinLocalComponentsModule_ProvideUnregisteredComponentFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes10.dex */
public final class f implements dagger.internal.h<n<?>> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<C> f73299a;

    /* renamed from: b, reason: collision with root package name */
    public final l f73300b;

    public f(l lVar, Provider provider) {
        this.f73299a = provider;
        this.f73300b = lVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        C c12 = this.f73299a.get();
        Y41.a aVar = (Y41.a) this.f73300b.f393949a;
        c.f73295a.getClass();
        c12.getF125491k().getClass();
        return new c.a(new b(0, aVar));
    }
}
