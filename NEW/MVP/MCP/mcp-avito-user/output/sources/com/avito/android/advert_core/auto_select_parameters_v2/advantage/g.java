package com.avito.android.advert_core.auto_select_parameters_v2.advantage;

import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.util.Kundle;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: AutoSelectExpandableAdvantagePresenterImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes10.dex */
public final class g implements dagger.internal.h<d> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.deeplink_handler.handler.composite.a> f82969a;

    /* renamed from: b, reason: collision with root package name */
    public final l f82970b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<InterfaceC28373a> f82971c;

    /* renamed from: d, reason: collision with root package name */
    public final l f82972d;

    public g(l lVar, l lVar2, Provider provider, Provider provider2) {
        this.f82969a = provider;
        this.f82970b = lVar;
        this.f82971c = provider2;
        this.f82972d = lVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new d(this.f82969a.get(), (Kundle) this.f82970b.f393949a, this.f82971c.get(), (String) this.f82972d.f393949a);
    }
}
