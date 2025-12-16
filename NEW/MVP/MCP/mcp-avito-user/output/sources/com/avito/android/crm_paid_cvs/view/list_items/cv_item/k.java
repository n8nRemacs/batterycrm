package com.avito.android.crm_paid_cvs.view.list_items.cv_item;

import com.avito.android.account.E;
import com.avito.android.analytics.InterfaceC28373a;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: CvItemPresenterImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class k implements dagger.internal.h<j> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f130848a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.l f130849b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<InterfaceC28373a> f130850c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<E> f130851d;

    public k(dagger.internal.l lVar, dagger.internal.l lVar2, Provider provider, Provider provider2) {
        this.f130848a = lVar;
        this.f130849b = lVar2;
        this.f130850c = provider;
        this.f130851d = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new j((Y41.l) this.f130848a.f393949a, (Y41.l) this.f130849b.f393949a, this.f130850c.get(), this.f130851d.get());
    }
}
