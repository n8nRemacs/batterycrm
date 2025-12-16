package com.avito.android.extended_profile.search;

import com.avito.android.remote.N;
import com.avito.android.remote.model.SearchParams;
import com.avito.android.remote.model.SearchParamsConverter;
import com.avito.android.util.R0;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: ExtendedProfileClosedAdvertsInteractorImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class c implements dagger.internal.h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f150484a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<SearchParams> f150485b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<SearchParamsConverter> f150486c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<N> f150487d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<com.avito.android.extended_profile.converter.a> f150488e;

    /* renamed from: f, reason: collision with root package name */
    public final Provider<R0> f150489f;

    public c(dagger.internal.l lVar, Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5) {
        this.f150484a = lVar;
        this.f150485b = provider;
        this.f150486c = provider2;
        this.f150487d = provider3;
        this.f150488e = provider4;
        this.f150489f = provider5;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new b((String) this.f150484a.f393949a, this.f150485b.get(), this.f150486c.get(), dagger.internal.g.b(this.f150487d), this.f150488e.get(), this.f150489f.get());
    }
}
