package com.avito.android.campaigns_sale;

import com.avito.android.campaigns_sale.mvi.L;
import com.avito.android.campaigns_sale.mvi.M;
import gj.InterfaceC40691b;
import javax.inject.Provider;

/* compiled from: CampaignsSaleViewModel_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes12.dex */
public final class F implements dagger.internal.h<E> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.campaigns_sale.beduin.custom_actions.c> f113849a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.campaigns_sale.beduin.custom_actions.a> f113850b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<Wi.b> f113851c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<InterfaceC40691b> f113852d;

    /* renamed from: e, reason: collision with root package name */
    public final M f113853e;

    public F(Provider provider, Provider provider2, Provider provider3, Provider provider4, M m12) {
        this.f113849a = provider;
        this.f113850b = provider2;
        this.f113851c = provider3;
        this.f113852d = provider4;
        this.f113853e = m12;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new E(this.f113849a.get(), this.f113850b.get(), this.f113851c.get(), this.f113852d.get(), (L) this.f113853e.get());
    }
}
