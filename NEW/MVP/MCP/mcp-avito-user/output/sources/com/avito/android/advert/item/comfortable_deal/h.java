package com.avito.android.advert.item.comfortable_deal;

import com.avito.android.analytics.InterfaceC28373a;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: ExpertBlockItemPresenterImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes10.dex */
public final class h implements dagger.internal.h<g> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.f f74304a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC28373a> f74305b;

    /* renamed from: c, reason: collision with root package name */
    public final dagger.internal.l f74306c;

    public h(dagger.internal.f fVar, dagger.internal.l lVar, Provider provider) {
        this.f74304a = fVar;
        this.f74305b = provider;
        this.f74306c = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new g((l) this.f74304a.get(), this.f74305b.get(), (String) this.f74306c.f393949a);
    }
}
