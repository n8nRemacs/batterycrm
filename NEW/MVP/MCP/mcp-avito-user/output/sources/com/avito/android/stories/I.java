package com.avito.android.stories;

import android.webkit.CookieManager;
import javax.inject.Provider;

/* compiled from: WebViewParamsLoader_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes3.dex */
public final class I implements dagger.internal.h<G> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f284984a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<CookieManager> f284985b;

    /* renamed from: c, reason: collision with root package name */
    public final dagger.internal.u f284986c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<com.avito.android.remote.interceptor.I> f284987d;

    public I(dagger.internal.l lVar, dagger.internal.u uVar, Provider provider, Provider provider2) {
        this.f284984a = lVar;
        this.f284985b = provider;
        this.f284986c = uVar;
        this.f284987d = provider2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new G((StoriesArguments) this.f284984a.f393949a, this.f284985b.get(), (com.avito.android.cookie_provider.e) this.f284986c.get(), this.f284987d.get());
    }
}
