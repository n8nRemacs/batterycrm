package com.avito.android.bbl.screens.contact_history.mvi;

import dagger.internal.x;
import dagger.internal.y;

/* compiled from: BblContactHistoryBootstrap_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes11.dex */
public final class d implements dagger.internal.h<c> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.bbl.screens.contact_history.domain.b f99670a;

    public d(com.avito.android.bbl.screens.contact_history.domain.b bVar) {
        this.f99670a = bVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new c((com.avito.android.bbl.screens.contact_history.domain.a) this.f99670a.get());
    }
}
