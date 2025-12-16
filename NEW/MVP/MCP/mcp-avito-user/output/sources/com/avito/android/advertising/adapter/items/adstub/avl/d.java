package com.avito.android.advertising.adapter.items.adstub.avl;

import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: CommercialLoadingAVLPresenter_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes11.dex */
public final class d implements dagger.internal.h<c> {

    /* renamed from: a, reason: collision with root package name */
    public final l f86919a;

    public d(l lVar) {
        this.f86919a = lVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new c(dagger.internal.g.b(this.f86919a));
    }
}
