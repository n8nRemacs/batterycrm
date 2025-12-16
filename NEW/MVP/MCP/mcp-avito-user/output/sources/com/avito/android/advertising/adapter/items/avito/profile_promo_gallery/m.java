package com.avito.android.advertising.adapter.items.avito.profile_promo_gallery;

import com.avito.android.util.Kundle;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: ProfilePromoGalleryPresenterImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes11.dex */
public final class m implements dagger.internal.h<l> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.advertising.kebab.f> f87255a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.l f87256b;

    public m(dagger.internal.l lVar, Provider provider) {
        this.f87255a = provider;
        this.f87256b = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new l(this.f87255a.get(), (Kundle) this.f87256b.f393949a);
    }
}
