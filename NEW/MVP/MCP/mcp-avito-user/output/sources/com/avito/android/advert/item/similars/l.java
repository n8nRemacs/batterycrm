package com.avito.android.advert.item.similars;

import android.content.res.Resources;
import com.avito.android.ab_tests.configs.GridLayoutWithTwoColumnsAbTestGroup;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: AdvertSimilarPresenterResourceProviderImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes10.dex */
public final class l implements dagger.internal.h<k> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f80292a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<u3.l<GridLayoutWithTwoColumnsAbTestGroup>> f80293b;

    public l(dagger.internal.l lVar, Provider provider) {
        this.f80292a = lVar;
        this.f80293b = provider;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new k((Resources) this.f80292a.f393949a, this.f80293b.get());
    }
}
