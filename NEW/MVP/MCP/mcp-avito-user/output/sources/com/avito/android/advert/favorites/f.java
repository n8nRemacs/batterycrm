package com.avito.android.advert.favorites;

import com.avito.android.advert.item.AdvertDetailsFastOpenParams;
import com.avito.android.advert_multi_items.AdvertDetailsMultiItemState;
import com.avito.android.favorite.m;
import com.avito.android.favorites.V;
import com.avito.android.util.InterfaceC35745a5;
import dagger.internal.h;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: AdvertDetailsFavoriteInteractorImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes10.dex */
public final class f implements h<e> {

    /* renamed from: a, reason: collision with root package name */
    public final m f71173a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<V> f71174b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f71175c;

    /* renamed from: d, reason: collision with root package name */
    public final l f71176d;

    /* renamed from: e, reason: collision with root package name */
    public final l f71177e;

    public f(m mVar, Provider provider, Provider provider2, l lVar, l lVar2) {
        this.f71173a = mVar;
        this.f71174b = provider;
        this.f71175c = provider2;
        this.f71176d = lVar;
        this.f71177e = lVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new e((com.avito.android.favorite.h) this.f71173a.get(), this.f71174b.get(), this.f71175c.get(), (AdvertDetailsMultiItemState) this.f71176d.f393949a, (AdvertDetailsFastOpenParams) this.f71177e.f393949a);
    }
}
