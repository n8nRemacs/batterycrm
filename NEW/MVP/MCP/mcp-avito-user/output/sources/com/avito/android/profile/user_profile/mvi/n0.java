package com.avito.android.profile.user_profile.mvi;

import android.content.Context;
import com.avito.android.analytics.InterfaceC28373a;
import javax.inject.Provider;

/* compiled from: UserProfileReducer_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes16.dex */
public final class n0 implements dagger.internal.h<l0> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.profile.user_profile.u> f226516a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.profile.user_profile.q> f226517b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<com.avito.android.profile.user_profile.cards.active_orders.k> f226518c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<com.avito.android.profile.user_profile.cards.wallet.a> f226519d;

    /* renamed from: e, reason: collision with root package name */
    public final dagger.internal.u f226520e;

    /* renamed from: f, reason: collision with root package name */
    public final Provider<InterfaceC28373a> f226521f;

    /* renamed from: g, reason: collision with root package name */
    public final Provider<N90.p> f226522g;

    /* renamed from: h, reason: collision with root package name */
    public final N90.d f226523h;

    /* renamed from: i, reason: collision with root package name */
    public final Provider<Context> f226524i;

    /* renamed from: j, reason: collision with root package name */
    public final Provider<gD.f> f226525j;

    public n0(Provider provider, Provider provider2, Provider provider3, Provider provider4, dagger.internal.u uVar, Provider provider5, Provider provider6, N90.d dVar, Provider provider7, Provider provider8) {
        this.f226516a = provider;
        this.f226517b = provider2;
        this.f226518c = provider3;
        this.f226519d = provider4;
        this.f226520e = uVar;
        this.f226521f = provider5;
        this.f226522g = provider6;
        this.f226523h = dVar;
        this.f226524i = provider7;
        this.f226525j = provider8;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new l0(this.f226516a.get(), this.f226517b.get(), this.f226518c.get(), this.f226519d.get(), (com.avito.android.lib.util.groupable_item.f) this.f226520e.get(), this.f226521f.get(), this.f226522g.get(), (N90.b) this.f226523h.get(), this.f226524i.get(), this.f226525j.get());
    }
}
