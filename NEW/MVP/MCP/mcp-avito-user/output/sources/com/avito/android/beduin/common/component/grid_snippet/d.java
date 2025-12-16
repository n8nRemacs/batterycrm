package com.avito.android.beduin.common.component.grid_snippet;

import Ui.InterfaceC15523b;
import com.avito.android.C36135w2;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.beduin.di.C28855q;
import com.avito.android.beduin.di.r;
import com.avito.android.util.Kundle;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: BeduinConstructorAdvertItemPresenter_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes11.dex */
public final class d implements dagger.internal.h<c> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.f f101383a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<C36135w2> f101384b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<InterfaceC28373a> f101385c;

    /* renamed from: d, reason: collision with root package name */
    public final C28855q f101386d;

    /* renamed from: e, reason: collision with root package name */
    public final r f101387e;

    /* renamed from: f, reason: collision with root package name */
    public final Provider<com.avito.android.player_holder.a> f101388f;

    public d(dagger.internal.f fVar, Provider provider, Provider provider2, C28855q c28855q, r rVar, Provider provider3) {
        this.f101383a = fVar;
        this.f101384b = provider;
        this.f101385c = provider2;
        this.f101386d = c28855q;
        this.f101387e = rVar;
        this.f101388f = provider3;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new c((InterfaceC15523b) this.f101383a.get(), this.f101384b.get(), this.f101385c.get(), (com.avito.android.constructor_advert.ui.serp.constructor.h) this.f101386d.get(), (Kundle) this.f101387e.get(), this.f101388f.get());
    }
}
