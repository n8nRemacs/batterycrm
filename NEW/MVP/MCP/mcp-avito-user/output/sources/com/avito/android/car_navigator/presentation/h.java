package com.avito.android.car_navigator.presentation;

import Am.InterfaceC13051a;
import android.webkit.CookieManager;
import com.avito.android.car_navigator.link.CarNavigatorSettings;
import dagger.internal.l;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: CarNavigatorWebViewControllerImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class h implements dagger.internal.h<g> {

    /* renamed from: a, reason: collision with root package name */
    public final l f115256a;

    /* renamed from: b, reason: collision with root package name */
    public final l f115257b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<com.avito.android.deep_linking.x> f115258c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<InterfaceC13051a> f115259d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<CookieManager> f115260e;

    /* renamed from: f, reason: collision with root package name */
    public final u f115261f;

    public h(l lVar, l lVar2, u uVar, Provider provider, Provider provider2, Provider provider3) {
        this.f115256a = lVar;
        this.f115257b = lVar2;
        this.f115258c = provider;
        this.f115259d = provider2;
        this.f115260e = provider3;
        this.f115261f = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new g((CarNavigatorSettings) this.f115256a.f393949a, (Y41.l) this.f115257b.f393949a, this.f115258c.get(), this.f115259d.get(), this.f115260e.get(), (com.avito.android.cookie_provider.e) this.f115261f.get());
    }
}
