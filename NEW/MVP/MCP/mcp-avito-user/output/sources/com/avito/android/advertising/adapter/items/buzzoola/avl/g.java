package com.avito.android.advertising.adapter.items.buzzoola.avl;

import Db.InterfaceC13381a;
import com.avito.android.advertising.ui.i;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: CommercialBuzzoolaAvlPresenterImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes11.dex */
public final class g implements dagger.internal.h<f> {

    /* renamed from: a, reason: collision with root package name */
    public final l f87284a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.advertising.loaders.event_service.c> f87285b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<i> f87286c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<com.avito.android.deeplink_handler.handler.composite.a> f87287d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<InterfaceC13381a> f87288e;

    public g(l lVar, Provider provider, Provider provider2, Provider provider3, Provider provider4) {
        this.f87284a = lVar;
        this.f87285b = provider;
        this.f87286c = provider2;
        this.f87287d = provider3;
        this.f87288e = provider4;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        h31.e eVarB = dagger.internal.g.b(this.f87284a);
        return new f(this.f87288e.get(), this.f87285b.get(), this.f87286c.get(), this.f87287d.get(), eVarB);
    }
}
