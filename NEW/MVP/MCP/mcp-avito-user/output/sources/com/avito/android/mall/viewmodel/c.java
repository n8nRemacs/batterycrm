package com.avito.android.mall.viewmodel;

import com.avito.android.util.InterfaceC35745a5;
import com.google.gson.Gson;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import io.reactivex.rxjava3.core.z;
import javax.inject.Provider;

/* compiled from: MallViewModelFactory_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes14.dex */
public final class c implements dagger.internal.h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<MX.a> f184364a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f184365b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<com.avito.android.search.h> f184366c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<KX.b> f184367d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<z<LX.b>> f184368e;

    /* renamed from: f, reason: collision with root package name */
    public final Provider<com.avito.android.deep_linking.x> f184369f;

    /* renamed from: g, reason: collision with root package name */
    public final Provider<KX.b> f184370g;

    /* renamed from: h, reason: collision with root package name */
    public final Provider<Gson> f184371h;

    /* renamed from: i, reason: collision with root package name */
    public final u f184372i;

    public c(u uVar, Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6, Provider provider7, Provider provider8) {
        this.f184364a = provider;
        this.f184365b = provider2;
        this.f184366c = provider3;
        this.f184367d = provider4;
        this.f184368e = provider5;
        this.f184369f = provider6;
        this.f184370g = provider7;
        this.f184371h = provider8;
        this.f184372i = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new b(this.f184364a.get(), this.f184365b.get(), this.f184366c.get(), this.f184367d.get(), this.f184368e.get(), this.f184369f.get(), this.f184370g.get(), this.f184371h.get(), (com.avito.android.mall.webview.b) this.f184372i.get());
    }
}
