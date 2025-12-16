package com.avito.android.advertising.adapter.items.adstub.avl;

import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: CommercialUnavailablePresenter_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes11.dex */
public final class j implements dagger.internal.h<i> {

    /* renamed from: a, reason: collision with root package name */
    public final l f86929a;

    public j(l lVar) {
        this.f86929a = lVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new i(dagger.internal.g.b(this.f86929a));
    }
}
