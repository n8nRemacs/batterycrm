package com.avito.android.crm_paid_cvs.view.list_items.searches_item;

import com.avito.android.account.E;
import com.avito.android.analytics.InterfaceC28373a;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: SearchesItemPresenterImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class h implements dagger.internal.h<g> {

    /* renamed from: a, reason: collision with root package name */
    public final l f131000a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC28373a> f131001b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<E> f131002c;

    public h(l lVar, Provider provider, Provider provider2) {
        this.f131000a = lVar;
        this.f131001b = provider;
        this.f131002c = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new g((Y41.l) this.f131000a.f393949a, this.f131002c.get(), this.f131001b.get());
    }
}
