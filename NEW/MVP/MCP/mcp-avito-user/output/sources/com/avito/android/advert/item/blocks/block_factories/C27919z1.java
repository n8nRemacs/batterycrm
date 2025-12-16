package com.avito.android.advert.item.blocks.block_factories;

import com.avito.android.advert.item.blocks.items_factories.InterfaceC28009m3;
import javax.inject.Provider;

/* compiled from: AdvertDetailsPpRecallBlockFactoryImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.advert.item.blocks.block_factories.z1, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C27919z1 implements dagger.internal.h<C27915y1> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC28009m3> f73689a;

    public C27919z1(Provider<InterfaceC28009m3> provider) {
        this.f73689a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C27915y1(this.f73689a.get());
    }
}
