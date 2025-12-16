package com.avito.android.search.filter.adapter.category_group;

import com.avito.android.search.filter.InterfaceC34581l;
import javax.inject.Provider;

/* compiled from: CategoryGroupItemPresenterImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes3.dex */
public final class q implements dagger.internal.h<p> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC34581l> f262086a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.u f262087b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<com.avito.android.search.filter.di.w> f262088c;

    public q(dagger.internal.u uVar, Provider provider, Provider provider2) {
        this.f262086a = provider;
        this.f262087b = uVar;
        this.f262088c = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new p(this.f262086a.get(), (y) this.f262087b.get(), this.f262088c.get());
    }
}
