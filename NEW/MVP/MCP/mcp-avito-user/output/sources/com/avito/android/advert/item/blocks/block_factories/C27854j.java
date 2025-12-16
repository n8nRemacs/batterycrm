package com.avito.android.advert.item.blocks.block_factories;

import com.avito.android.advert.item.blocks.items_factories.InterfaceC27942d;
import javax.inject.Provider;

/* compiled from: AdvertDetailsAbuseBlockFactoryImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.advert.item.blocks.block_factories.j, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C27854j implements dagger.internal.h<C27850i> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC27942d> f73587a;

    public C27854j(Provider<InterfaceC27942d> provider) {
        this.f73587a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C27850i(this.f73587a.get());
    }
}
