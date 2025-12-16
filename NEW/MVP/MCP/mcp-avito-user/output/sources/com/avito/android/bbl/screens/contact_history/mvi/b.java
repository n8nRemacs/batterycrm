package com.avito.android.bbl.screens.contact_history.mvi;

import dagger.internal.x;
import dagger.internal.y;

/* compiled from: BblContactHistoryActor_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes11.dex */
public final class b implements dagger.internal.h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.bbl.screens.contact_history.domain.b f99668a;

    public b(com.avito.android.bbl.screens.contact_history.domain.b bVar) {
        this.f99668a = bVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a((com.avito.android.bbl.screens.contact_history.domain.a) this.f99668a.get());
    }
}
