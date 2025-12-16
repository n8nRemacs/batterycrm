package com.avito.android.extended_profile_adverts.di;

import com.avito.android.remote.model.SearchParams;
import com.avito.android.remote.model.SearchParamsSegmentParser;

/* compiled from: ProfileAdvertsModule_ProvideFromSpaceFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes13.dex */
public final class u implements dagger.internal.h<String> {

    /* renamed from: a, reason: collision with root package name */
    public final n f150831a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.l f150832b;

    public u(n nVar, dagger.internal.l lVar) {
        this.f150831a = nVar;
        this.f150832b = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        SearchParams searchParams = (SearchParams) this.f150832b.f393949a;
        this.f150831a.getClass();
        if (searchParams != null) {
            return SearchParamsSegmentParser.INSTANCE.fromParam(searchParams).getFromSpace();
        }
        return null;
    }
}
