package com.avito.android.similar_adverts;

import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.rec.ScreenSource;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: SimilarAdvertsViewModel_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class q implements dagger.internal.h<p> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.favorite.n> f283991a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.advert_collection_toast.b> f283992b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<com.avito.android.deeplink_handler.handler.composite.a> f283993c;

    /* renamed from: d, reason: collision with root package name */
    public final dagger.internal.l f283994d;

    /* renamed from: e, reason: collision with root package name */
    public final dagger.internal.l f283995e;

    /* renamed from: f, reason: collision with root package name */
    public final Provider<InterfaceC28373a> f283996f;

    /* renamed from: g, reason: collision with root package name */
    public final com.avito.android.similar_adverts.mvi.k f283997g;

    public q(Provider provider, Provider provider2, Provider provider3, dagger.internal.l lVar, dagger.internal.l lVar2, Provider provider4, com.avito.android.similar_adverts.mvi.k kVar) {
        this.f283991a = provider;
        this.f283992b = provider2;
        this.f283993c = provider3;
        this.f283994d = lVar;
        this.f283995e = lVar2;
        this.f283996f = provider4;
        this.f283997g = kVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new p(this.f283991a.get(), this.f283992b.get(), this.f283993c.get(), (String) this.f283994d.f393949a, (ScreenSource) this.f283995e.f393949a, this.f283996f.get(), (com.avito.android.similar_adverts.mvi.j) this.f283997g.get());
    }
}
