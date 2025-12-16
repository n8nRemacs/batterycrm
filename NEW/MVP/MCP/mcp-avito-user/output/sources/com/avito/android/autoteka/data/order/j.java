package com.avito.android.autoteka.data.order;

import dagger.internal.x;
import dagger.internal.y;

/* compiled from: AutotekaGetOrderItemInteractorImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes11.dex */
public final class j implements dagger.internal.h<i> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.autoteka.data.j f96170a;

    public j(com.avito.android.autoteka.data.j jVar) {
        this.f96170a = jVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new i((com.avito.android.autoteka.data.i) this.f96170a.get());
    }
}
