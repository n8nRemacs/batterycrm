package com.avito.android.crm_paid_cvs.view.list_items.favorite_item;

import com.avito.android.account.E;
import com.avito.android.analytics.InterfaceC28373a;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: FavoriteItemPresenterImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class m implements dagger.internal.h<l> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f130907a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.l f130908b;

    /* renamed from: c, reason: collision with root package name */
    public final dagger.internal.l f130909c;

    /* renamed from: d, reason: collision with root package name */
    public final dagger.internal.l f130910d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<InterfaceC28373a> f130911e;

    /* renamed from: f, reason: collision with root package name */
    public final Provider<E> f130912f;

    public m(dagger.internal.l lVar, dagger.internal.l lVar2, dagger.internal.l lVar3, dagger.internal.l lVar4, Provider provider, Provider provider2) {
        this.f130907a = lVar;
        this.f130908b = lVar2;
        this.f130909c = lVar3;
        this.f130910d = lVar4;
        this.f130911e = provider;
        this.f130912f = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new l((Y41.l) this.f130907a.f393949a, (Y41.l) this.f130908b.f393949a, (Y41.l) this.f130909c.f393949a, (Y41.l) this.f130910d.f393949a, this.f130911e.get(), this.f130912f.get());
    }
}
