package com.avito.android.similar_adverts.di;

import com.avito.android.advert_collection_toast.analytics.FromPageSource;
import dagger.internal.t;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: SimilarAdvertsModule_ProvideFromPageSource$_avito_similar_adverts_implFactory.java */
@dagger.internal.e
@x
@y
/* loaded from: classes3.dex */
public final class m implements dagger.internal.h<FromPageSource> {

    /* compiled from: SimilarAdvertsModule_ProvideFromPageSource$_avito_similar_adverts_implFactory.java */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final m f283922a = new m();
    }

    @Override // javax.inject.Provider
    public final Object get() {
        l.f283921a.getClass();
        FromPageSource.SimilarAdverts similarAdverts = FromPageSource.SimilarAdverts.f82337c;
        t.d(similarAdverts);
        return similarAdverts;
    }
}
