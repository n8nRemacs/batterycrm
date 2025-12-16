package com.avito.android.map.view.adverts_in_pin;

import android.content.res.Resources;
import androidx.recyclerview.widget.GridLayoutManager;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import fY.InterfaceC40372a;
import javax.inject.Provider;

/* compiled from: AdvertsInPinViewImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes14.dex */
public final class o implements dagger.internal.h<f> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.konveyor.adapter.j> f185450a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<b> f185451b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<com.avito.android.serp.adapter.retry.a> f185452c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<InterfaceC40372a> f185453d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<GridLayoutManager.c> f185454e;

    /* renamed from: f, reason: collision with root package name */
    public final Provider<com.avito.android.floating_views.f> f185455f;

    /* renamed from: g, reason: collision with root package name */
    public final u f185456g;

    /* renamed from: h, reason: collision with root package name */
    public final Provider<com.avito.android.pinch_to_zoom.b> f185457h;

    /* renamed from: i, reason: collision with root package name */
    public final dagger.internal.l f185458i;

    public o(dagger.internal.l lVar, u uVar, Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6, Provider provider7) {
        this.f185450a = provider;
        this.f185451b = provider2;
        this.f185452c = provider3;
        this.f185453d = provider4;
        this.f185454e = provider5;
        this.f185455f = provider6;
        this.f185456g = uVar;
        this.f185457h = provider7;
        this.f185458i = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new f(this.f185450a.get(), this.f185451b.get(), this.f185452c.get(), this.f185453d.get(), this.f185454e.get(), this.f185455f.get(), (com.avito.android.map_core.utils.a) this.f185456g.get(), this.f185457h.get(), (Resources) this.f185458i.f393949a);
    }
}
