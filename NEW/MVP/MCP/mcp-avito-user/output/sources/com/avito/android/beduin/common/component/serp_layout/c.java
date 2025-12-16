package com.avito.android.beduin.common.component.serp_layout;

import Ui.InterfaceC15523b;
import com.avito.android.C36135w2;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.beduin.di.r;
import com.avito.android.util.Kundle;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: BeduinSerpLayoutConstructorAdvertItemPresenter_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes11.dex */
public final class c implements dagger.internal.h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<C36135w2> f102587a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC28373a> f102588b;

    /* renamed from: c, reason: collision with root package name */
    public final u f102589c;

    /* renamed from: d, reason: collision with root package name */
    public final r f102590d;

    /* renamed from: e, reason: collision with root package name */
    public final dagger.internal.f f102591e;

    /* renamed from: f, reason: collision with root package name */
    public final Provider<com.avito.android.advert.viewed.d> f102592f;

    /* renamed from: g, reason: collision with root package name */
    public final Provider<com.avito.android.player_holder.a> f102593g;

    public c(Provider provider, Provider provider2, u uVar, r rVar, dagger.internal.f fVar, Provider provider3, Provider provider4) {
        this.f102587a = provider;
        this.f102588b = provider2;
        this.f102589c = uVar;
        this.f102590d = rVar;
        this.f102591e = fVar;
        this.f102592f = provider3;
        this.f102593g = provider4;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new b(this.f102587a.get(), this.f102588b.get(), (com.avito.android.constructor_advert.ui.serp.constructor.h) this.f102589c.get(), (Kundle) this.f102590d.get(), (InterfaceC15523b) this.f102591e.get(), this.f102592f.get(), this.f102593g.get());
    }
}
