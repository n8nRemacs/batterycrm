package com.avito.android.advert.item.realty_quiz_banner;

import com.avito.android.account.E;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: RealtyQuizBannerStorageImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes10.dex */
public final class m implements dagger.internal.h<l> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<AK0.l> f78377a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<E> f78378b;

    public m(Provider<AK0.l> provider, Provider<E> provider2) {
        this.f78377a = provider;
        this.f78378b = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new l(this.f78377a.get(), this.f78378b.get());
    }
}
