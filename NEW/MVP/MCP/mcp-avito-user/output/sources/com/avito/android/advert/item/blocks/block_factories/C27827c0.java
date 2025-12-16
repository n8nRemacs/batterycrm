package com.avito.android.advert.item.blocks.block_factories;

import com.avito.android.advert.item.blocks.items_factories.InterfaceC28057u0;
import javax.inject.Provider;

/* compiled from: AdvertDetailsConsultationQuizBlockFactoryImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.advert.item.blocks.block_factories.c0, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C27827c0 implements dagger.internal.h<C27823b0> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC28057u0> f73532a;

    public C27827c0(Provider<InterfaceC28057u0> provider) {
        this.f73532a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C27823b0(this.f73532a.get());
    }
}
