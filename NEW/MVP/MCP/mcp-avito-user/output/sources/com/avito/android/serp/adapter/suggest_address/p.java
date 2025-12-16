package com.avito.android.serp.adapter.suggest_address;

import com.avito.android.account.E;
import com.avito.android.analytics.InterfaceC28373a;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: AddAddressSuggestItemPresenterImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class p implements dagger.internal.h<i> {

    /* renamed from: a, reason: collision with root package name */
    public final u f272419a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<E> f272420b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<com.avito.android.deeplink_handler.handler.composite.a> f272421c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<AK0.l> f272422d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<InterfaceC28373a> f272423e;

    /* renamed from: f, reason: collision with root package name */
    public final Provider<com.avito.android.serp.analytics.widgets_tracker.g> f272424f;

    public p(u uVar, Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5) {
        this.f272419a = uVar;
        this.f272420b = provider;
        this.f272421c = provider2;
        this.f272422d = provider3;
        this.f272423e = provider4;
        this.f272424f = provider5;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new i((d) this.f272419a.get(), this.f272420b.get(), this.f272421c.get(), this.f272422d.get(), this.f272423e.get(), this.f272424f.get());
    }
}
