package com.avito.android.extended_profile_adverts;

import com.avito.android.remote.N;
import com.avito.android.remote.model.SearchParamsConverter;
import com.avito.android.util.R0;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;
import qA.InterfaceC47264a;

/* compiled from: ProfileAdvertsInteractorImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class i implements dagger.internal.h<f> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<N> f150871a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.serp.i> f150872b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<Integer> f150873c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<InterfaceC47264a> f150874d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<R0> f150875e;

    /* renamed from: f, reason: collision with root package name */
    public final Provider<SearchParamsConverter> f150876f;

    /* renamed from: g, reason: collision with root package name */
    public final Provider<n> f150877g;

    public i(Provider<N> provider, Provider<com.avito.android.serp.i> provider2, Provider<Integer> provider3, Provider<InterfaceC47264a> provider4, Provider<R0> provider5, Provider<SearchParamsConverter> provider6, Provider<n> provider7) {
        this.f150871a = provider;
        this.f150872b = provider2;
        this.f150873c = provider3;
        this.f150874d = provider4;
        this.f150875e = provider5;
        this.f150876f = provider6;
        this.f150877g = provider7;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new f(dagger.internal.g.b(this.f150871a), this.f150872b.get(), this.f150873c.get().intValue(), this.f150874d.get(), this.f150875e.get(), this.f150876f.get(), this.f150877g.get());
    }
}
