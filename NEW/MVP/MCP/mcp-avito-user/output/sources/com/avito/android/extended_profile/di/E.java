package com.avito.android.extended_profile.di;

import com.avito.android.remote.model.SearchParams;
import com.avito.android.remote.model.SearchParamsSegmentParser;
import javax.inject.Provider;

/* compiled from: ExtendedProfileModule_ProvideFromSpaceFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes13.dex */
public final class E implements dagger.internal.h<String> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<SearchParams> f149522a;

    public E(Provider<SearchParams> provider) {
        this.f149522a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        SearchParams searchParams = this.f149522a.get();
        r.f149945a.getClass();
        return SearchParamsSegmentParser.INSTANCE.fromParam(searchParams).getFromSpace();
    }
}
