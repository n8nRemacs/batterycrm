package com.avito.android.advert_core.blocks;

import dagger.internal.p;
import dagger.internal.x;
import dagger.internal.y;
import java.util.Map;
import javax.inject.Provider;

/* compiled from: AdvertDetailsCompositeBlocksFactoryImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes10.dex */
public final class f implements dagger.internal.h<e> {

    /* renamed from: a, reason: collision with root package name */
    public final p f83022a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<h> f83023b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<g> f83024c;

    public f(p pVar, Provider provider, Provider provider2) {
        this.f83022a = pVar;
        this.f83023b = provider;
        this.f83024c = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new e((Map) this.f83022a.get(), this.f83023b.get(), this.f83024c.get());
    }
}
