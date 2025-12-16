package com.avito.android.bxcontent;

import com.avito.android.remote.InterfaceC34323k;
import com.avito.android.remote.model.SearchParamsConverter;
import javax.inject.Provider;

/* compiled from: BxSingleItemLoaderImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes12.dex */
public final class H1 implements dagger.internal.h<G1> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC34323k> f109342a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.serp.i> f109343b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<SearchParamsConverter> f109344c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<com.avito.android.util.R0> f109345d;

    public H1(Provider<InterfaceC34323k> provider, Provider<com.avito.android.serp.i> provider2, Provider<SearchParamsConverter> provider3, Provider<com.avito.android.util.R0> provider4) {
        this.f109342a = provider;
        this.f109343b = provider2;
        this.f109344c = provider3;
        this.f109345d = provider4;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new G1(dagger.internal.g.b(this.f109342a), this.f109343b.get(), this.f109344c.get(), this.f109345d.get());
    }
}
