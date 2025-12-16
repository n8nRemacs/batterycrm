package com.avito.android.advertising.adapter.items.yandex.avl;

import Db.InterfaceC13381a;
import com.avito.android.C30828i;
import dagger.internal.h;
import dagger.internal.l;
import dagger.internal.w;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: CommercialYandexAvlPresenterImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes11.dex */
public final class d implements h<c> {

    /* renamed from: a, reason: collision with root package name */
    public final l f87716a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<C30828i> f87717b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<InterfaceC13381a> f87718c;

    public d(l lVar, Provider provider, Provider provider2) {
        this.f87716a = lVar;
        this.f87717b = provider;
        this.f87718c = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new c(dagger.internal.g.a(w.a(this.f87716a)), this.f87717b.get(), this.f87718c.get());
    }
}
