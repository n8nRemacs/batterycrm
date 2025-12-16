package com.avito.android.advert_collection_list.di;

import android.content.Context;
import android.content.res.Resources;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: AdvertCollectionListModule_ProvideResources$_avito_advert_collection_list_implFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes10.dex */
public final class k implements dagger.internal.h<Resources> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<Context> f82094a;

    public k(Provider<Context> provider) {
        this.f82094a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        Context context = this.f82094a.get();
        c.f82083a.getClass();
        return context.getResources();
    }
}
