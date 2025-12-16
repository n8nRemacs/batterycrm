package com.avito.android.mall.di;

import com.avito.android.mall.di.a;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;
import ur.InterfaceC49101b;

/* compiled from: MallModule_ProvideMallWebViewInterceptorFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes14.dex */
public final class f implements h<com.avito.android.mall.webview.a> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<l41.g<LX.b>> f184327a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC49101b> f184328b;

    public f(Provider<l41.g<LX.b>> provider, Provider<InterfaceC49101b> provider2) {
        this.f184327a = provider;
        this.f184328b = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        l41.g<LX.b> gVar = this.f184327a.get();
        InterfaceC49101b interfaceC49101b = (InterfaceC49101b) ((a.c.C5406c) this.f184328b).get();
        d.f184325a.getClass();
        return new com.avito.android.mall.webview.a(gVar, interfaceC49101b);
    }
}
