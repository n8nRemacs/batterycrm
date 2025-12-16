package com.avito.android.advert.item.blocks.items_factories;

import android.content.res.Resources;
import java.util.Locale;
import javax.inject.Provider;

/* compiled from: AdvertDetailsGigItemsFactoryImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes10.dex */
public final class Y1 implements dagger.internal.h<X1> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.advert.item.similars.j> f73892a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.B2> f73893b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<com.avito.android.deep_linking.x> f73894c;

    /* renamed from: d, reason: collision with root package name */
    public final dagger.internal.l f73895d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<Locale> f73896e;

    /* renamed from: f, reason: collision with root package name */
    public final Provider<com.avito.android.gig_snippet.a> f73897f;

    public Y1(dagger.internal.l lVar, Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5) {
        this.f73892a = provider;
        this.f73893b = provider2;
        this.f73894c = provider3;
        this.f73895d = lVar;
        this.f73896e = provider4;
        this.f73897f = provider5;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new X1(this.f73892a.get(), this.f73893b.get(), this.f73894c.get(), (Resources) this.f73895d.f393949a, this.f73896e.get(), this.f73897f.get());
    }
}
