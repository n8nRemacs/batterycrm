package com.avito.android.advert.item.blocks.block_factories;

import com.avito.android.advert.item.blocks.items_factories.InterfaceC27965g1;
import javax.inject.Provider;

/* compiled from: AdvertDetailsDomotekaReportTeaserBlockFactory_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.advert.item.blocks.block_factories.x0, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C27910x0 implements dagger.internal.h<C27906w0> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC27965g1> f73677a;

    public C27910x0(Provider<InterfaceC27965g1> provider) {
        this.f73677a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C27906w0(this.f73677a.get());
    }
}
