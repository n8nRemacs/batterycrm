package com.avito.android.freemium.screens.contact_history.mvi;

import dagger.internal.x;
import dagger.internal.y;

/* compiled from: FreemiumContactHistoryActor_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class b implements dagger.internal.h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.freemium.screens.contact_history.domain.b f158985a;

    public b(com.avito.android.freemium.screens.contact_history.domain.b bVar) {
        this.f158985a = bVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a((com.avito.android.freemium.screens.contact_history.domain.a) this.f158985a.get());
    }
}
