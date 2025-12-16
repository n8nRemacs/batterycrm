package com.avito.android.advert.item.beduin.v2.di;

import com.avito.android.lib.beduin_v2.component.exception.callback.b;
import com.avito.android.util.C;
import com.avito.beduin.v2.render.android_view.n;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: AdvertDetailsBeduinLocalComponentsModule_ProvideExceptionComponentFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes10.dex */
public final class e implements dagger.internal.h<n<?>> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<C> f73297a;

    /* renamed from: b, reason: collision with root package name */
    public final l f73298b;

    public e(l lVar, Provider provider) {
        this.f73297a = provider;
        this.f73298b = lVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        C c12 = this.f73297a.get();
        Y41.a aVar = (Y41.a) this.f73298b.f393949a;
        c.f73295a.getClass();
        c12.getF125491k().getClass();
        return new b.a(new b(1, aVar));
    }
}
