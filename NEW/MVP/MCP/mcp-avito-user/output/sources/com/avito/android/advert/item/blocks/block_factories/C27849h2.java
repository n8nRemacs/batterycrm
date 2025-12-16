package com.avito.android.advert.item.blocks.block_factories;

import com.avito.android.advert.item.blocks.items_factories.InterfaceC28057u0;
import javax.inject.Provider;

/* compiled from: AdvertDetailsSecondaryConsultationBlockFactory_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.advert.item.blocks.block_factories.h2, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C27849h2 implements dagger.internal.h<C27845g2> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC28057u0> f73580a;

    public C27849h2(Provider<InterfaceC28057u0> provider) {
        this.f73580a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C27845g2(this.f73580a.get());
    }
}
