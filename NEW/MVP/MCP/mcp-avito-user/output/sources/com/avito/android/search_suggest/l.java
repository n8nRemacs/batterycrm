package com.avito.android.search_suggest;

import com.avito.android.remote.V0;
import com.avito.android.remote.model.SearchParamsConverter;
import com.avito.android.remote.model.SuggestParamsConverter;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: SearchSuggestInteractorImpl_Factory.java */
@dagger.internal.e
@y
@dagger.internal.x
/* loaded from: classes3.dex */
public final class l implements dagger.internal.h<k> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<V0> f264247a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.u f264248b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<SearchParamsConverter> f264249c;

    /* renamed from: d, reason: collision with root package name */
    public final dagger.internal.l f264250d;

    public l(dagger.internal.l lVar, dagger.internal.u uVar, Provider provider, Provider provider2) {
        this.f264247a = provider;
        this.f264248b = uVar;
        this.f264249c = provider2;
        this.f264250d = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new k(dagger.internal.g.b(this.f264247a), (SuggestParamsConverter) this.f264248b.get(), this.f264249c.get(), (SearchSuggestArguments) this.f264250d.f393949a);
    }
}
