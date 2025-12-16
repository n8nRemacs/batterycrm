package com.avito.android.advert.item.select.benefits;

import com.avito.android.analytics.InterfaceC28373a;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: AdvertDetailsAutoSelectItemPresenterImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes10.dex */
public final class i implements dagger.internal.h<g> {

    /* renamed from: a, reason: collision with root package name */
    public final l f79357a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC28373a> f79358b;

    public i(l lVar, Provider provider) {
        this.f79357a = lVar;
        this.f79358b = provider;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new g(this.f79358b.get(), (String) this.f79357a.f393949a);
    }
}
