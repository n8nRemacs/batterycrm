package com.avito.android.serp.adapter.advert_xl;

import android.content.res.Resources;
import javax.inject.Provider;

/* compiled from: AdvertXlWithNormalizedPriceItemBlueprint_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes3.dex */
public final class B implements dagger.internal.h<A> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.u f268818a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.video_snippets.g> f268819b;

    /* renamed from: c, reason: collision with root package name */
    public final dagger.internal.l f268820c;

    public B(dagger.internal.l lVar, dagger.internal.u uVar, Provider provider) {
        this.f268818a = uVar;
        this.f268819b = provider;
        this.f268820c = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new A((h) this.f268818a.get(), this.f268819b.get(), (Resources) this.f268820c.f393949a);
    }
}
