package com.avito.android.home.bottom_navigation;

import com.avito.android.util.InterfaceC35745a5;
import hz.InterfaceC41196a;
import javax.inject.Provider;

/* compiled from: BottomNavigationViewModel_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes13.dex */
public final class G implements dagger.internal.h<F> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f162323a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.passport_lib.a> f162324b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<com.avito.android.home.B> f162325c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<s90.b> f162326d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<gD.f> f162327e;

    /* renamed from: f, reason: collision with root package name */
    public final Provider<InterfaceC41196a> f162328f;

    /* renamed from: g, reason: collision with root package name */
    public final Provider<com.avito.android.home.p> f162329g;

    public G(Provider<InterfaceC35745a5> provider, Provider<com.avito.android.passport_lib.a> provider2, Provider<com.avito.android.home.B> provider3, Provider<s90.b> provider4, Provider<gD.f> provider5, Provider<InterfaceC41196a> provider6, Provider<com.avito.android.home.p> provider7) {
        this.f162323a = provider;
        this.f162324b = provider2;
        this.f162325c = provider3;
        this.f162326d = provider4;
        this.f162327e = provider5;
        this.f162328f = provider6;
        this.f162329g = provider7;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new F(this.f162323a.get(), this.f162324b.get(), this.f162325c.get(), this.f162326d.get(), this.f162327e.get(), this.f162328f.get(), this.f162329g.get());
    }
}
